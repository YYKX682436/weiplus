package com.tencent.tavkit.component.effectchain;

/* loaded from: classes16.dex */
public class VideoMixEffectProxy implements com.tencent.tavkit.composition.video.TAVVideoMixEffect {
    private java.util.concurrent.CopyOnWriteArrayList<com.tencent.tavkit.composition.video.TAVVideoMixEffect> effects = new java.util.concurrent.CopyOnWriteArrayList<>();
    private final java.util.List<com.tencent.tavkit.component.effectchain.VideoMixEffectProxy.FilterProxy> filterProxies = new java.util.ArrayList();
    private boolean autoCheckEffectRemove = true;

    /* loaded from: classes16.dex */
    public static class FilterProxy implements com.tencent.tavkit.composition.video.TAVVideoMixEffect.Filter, com.tencent.tavkit.report.IReportable {
        private final java.util.HashMap<java.lang.String, com.tencent.tavkit.composition.video.TAVVideoMixEffect.Filter> filterMap;
        private boolean onEffectRemove;
        private final com.tencent.tavkit.report.FilterChainReportSession reportSession;

        private FilterProxy() {
            this.filterMap = new java.util.HashMap<>();
            this.reportSession = new com.tencent.tavkit.report.FilterChainReportSession();
        }

        private void checkRuntimeRelease(java.util.List<com.tencent.tavkit.composition.video.TAVVideoMixEffect> list) {
            if (this.onEffectRemove) {
                this.onEffectRemove = false;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (com.tencent.tavkit.composition.video.TAVVideoMixEffect tAVVideoMixEffect : list) {
                    if (!android.text.TextUtils.isEmpty(tAVVideoMixEffect.effectId())) {
                        arrayList.add(tAVVideoMixEffect.effectId());
                    }
                }
                java.util.Iterator it = new java.util.HashSet(this.filterMap.keySet()).iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    if (!arrayList.contains(str)) {
                        this.filterMap.get(str).release();
                        this.filterMap.remove(str);
                    }
                }
            }
        }

        private com.tencent.tavkit.composition.video.TAVVideoMixEffect.Filter getCacheFilter(com.tencent.tavkit.composition.video.TAVVideoMixEffect tAVVideoMixEffect) {
            if (tAVVideoMixEffect == null || android.text.TextUtils.isEmpty(tAVVideoMixEffect.effectId())) {
                return null;
            }
            java.lang.String effectId = tAVVideoMixEffect.effectId();
            if (this.filterMap.containsKey(effectId)) {
                return this.filterMap.get(effectId);
            }
            com.tencent.tavkit.composition.video.TAVVideoMixEffect.Filter createFilter = tAVVideoMixEffect.createFilter();
            this.filterMap.put(effectId, createFilter);
            return createFilter;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void notifyOnEffectRemove() {
            this.onEffectRemove = true;
        }

        @Override // com.tencent.tavkit.composition.video.TAVVideoMixEffect.Filter
        public com.tencent.tavkit.ciimage.CIImage apply(com.tencent.tavkit.composition.video.TAVVideoMixEffect tAVVideoMixEffect, com.tencent.tavkit.composition.video.ImageCollection imageCollection, com.tencent.tavkit.composition.video.RenderInfo renderInfo) {
            if (!(tAVVideoMixEffect instanceof com.tencent.tavkit.component.effectchain.VideoMixEffectProxy)) {
                return null;
            }
            com.tencent.tavkit.component.effectchain.VideoMixEffectProxy videoMixEffectProxy = (com.tencent.tavkit.component.effectchain.VideoMixEffectProxy) tAVVideoMixEffect;
            java.util.List<com.tencent.tavkit.composition.video.TAVVideoMixEffect> effects = videoMixEffectProxy.getEffects();
            if (videoMixEffectProxy.isAutoCheckEffectRemove() || this.onEffectRemove) {
                checkRuntimeRelease(effects);
            }
            com.tencent.tavkit.ciimage.CIImage cIImage = null;
            for (com.tencent.tavkit.composition.video.TAVVideoMixEffect tAVVideoMixEffect2 : effects) {
                com.tencent.tavkit.composition.video.TAVVideoMixEffect.Filter cacheFilter = getCacheFilter(tAVVideoMixEffect2);
                if (cacheFilter != null) {
                    long nanoTime = java.lang.System.nanoTime();
                    java.lang.String reportKey = cacheFilter instanceof com.tencent.tavkit.report.IReportable ? ((com.tencent.tavkit.report.IReportable) cacheFilter).getReportKey() : null;
                    com.tencent.tavkit.ciimage.CIImage apply = cacheFilter.apply(tAVVideoMixEffect2, imageCollection, renderInfo);
                    if (!android.text.TextUtils.isEmpty(reportKey)) {
                        this.reportSession.tick(reportKey, java.lang.System.nanoTime() - nanoTime);
                    }
                    cIImage = apply;
                }
            }
            return cIImage;
        }

        @Override // com.tencent.tavkit.report.IReportable
        public java.lang.String getReportKey() {
            return com.tencent.tavkit.report.MemoryReportHelper.appendReportKey(this.filterMap.values());
        }

        @Override // com.tencent.tavkit.composition.video.TAVVideoMixEffect.Filter
        public synchronized void release() {
            java.util.Iterator<com.tencent.tavkit.composition.video.TAVVideoMixEffect.Filter> it = this.filterMap.values().iterator();
            while (it.hasNext()) {
                it.next().release();
            }
            this.filterMap.clear();
            this.reportSession.commit();
        }
    }

    @Override // com.tencent.tavkit.composition.video.TAVVideoMixEffect
    public com.tencent.tavkit.composition.video.TAVVideoMixEffect.Filter createFilter() {
        com.tencent.tavkit.component.effectchain.VideoMixEffectProxy.FilterProxy filterProxy = new com.tencent.tavkit.component.effectchain.VideoMixEffectProxy.FilterProxy();
        this.filterProxies.add(filterProxy);
        return filterProxy;
    }

    @Override // com.tencent.tavkit.composition.video.TAVVideoMixEffect
    public java.lang.String effectId() {
        return "VideoMixEffectProxy" + java.lang.Integer.toHexString(hashCode());
    }

    public java.util.List<com.tencent.tavkit.composition.video.TAVVideoMixEffect> getEffects() {
        return this.effects;
    }

    public boolean isAutoCheckEffectRemove() {
        return this.autoCheckEffectRemove;
    }

    public void notifyOnEffectRemove() {
        java.util.Iterator<com.tencent.tavkit.component.effectchain.VideoMixEffectProxy.FilterProxy> it = this.filterProxies.iterator();
        while (it.hasNext()) {
            it.next().notifyOnEffectRemove();
        }
    }

    public void setAutoCheckEffectRemove(boolean z17) {
        this.autoCheckEffectRemove = z17;
    }

    public void setEffects(java.util.concurrent.CopyOnWriteArrayList<com.tencent.tavkit.composition.video.TAVVideoMixEffect> copyOnWriteArrayList) {
        this.effects = copyOnWriteArrayList;
    }
}
