package com.tencent.tavkit.component.effectchain;

/* loaded from: classes16.dex */
public class VideoEffectProxy implements com.tencent.tavkit.composition.video.TAVVideoEffect {
    private java.util.concurrent.CopyOnWriteArrayList<com.tencent.tavkit.composition.video.TAVVideoEffect> effects = new java.util.concurrent.CopyOnWriteArrayList<>();
    private final java.util.List<com.tencent.tavkit.component.effectchain.VideoEffectProxy.FilterProxy> filterProxies = new java.util.ArrayList();
    private boolean autoCheckEffectRemove = true;

    /* loaded from: classes16.dex */
    public static class FilterProxy implements com.tencent.tavkit.composition.video.TAVVideoEffect.Filter, com.tencent.tavkit.report.IReportable {
        private final java.util.HashMap<java.lang.String, com.tencent.tavkit.composition.video.TAVVideoEffect.Filter> filterMap;
        private boolean onEffectRemove;
        private final com.tencent.tavkit.report.FilterChainReportSession reportSession;

        private FilterProxy() {
            this.filterMap = new java.util.HashMap<>();
            this.reportSession = new com.tencent.tavkit.report.FilterChainReportSession();
        }

        private void checkRuntimeRelease(java.util.List<com.tencent.tavkit.composition.video.TAVVideoEffect> list) {
            this.onEffectRemove = false;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.tencent.tavkit.composition.video.TAVVideoEffect tAVVideoEffect : list) {
                if (!android.text.TextUtils.isEmpty(tAVVideoEffect.effectId())) {
                    arrayList.add(tAVVideoEffect.effectId());
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

        private com.tencent.tavkit.composition.video.TAVVideoEffect.Filter getCacheFilter(com.tencent.tavkit.composition.video.TAVVideoEffect tAVVideoEffect) {
            if (tAVVideoEffect == null || android.text.TextUtils.isEmpty(tAVVideoEffect.effectId())) {
                return null;
            }
            java.lang.String effectId = tAVVideoEffect.effectId();
            if (this.filterMap.containsKey(effectId)) {
                return this.filterMap.get(effectId);
            }
            com.tencent.tavkit.composition.video.TAVVideoEffect.Filter createFilter = tAVVideoEffect.createFilter();
            this.filterMap.put(effectId, createFilter);
            return createFilter;
        }

        @Override // com.tencent.tavkit.composition.video.TAVVideoEffect.Filter
        public com.tencent.tavkit.ciimage.CIImage apply(com.tencent.tavkit.composition.video.TAVVideoEffect tAVVideoEffect, com.tencent.tavkit.ciimage.CIImage cIImage, com.tencent.tavkit.composition.video.RenderInfo renderInfo) {
            if (!(tAVVideoEffect instanceof com.tencent.tavkit.component.effectchain.VideoEffectProxy)) {
                return cIImage;
            }
            com.tencent.tavkit.component.effectchain.VideoEffectProxy videoEffectProxy = (com.tencent.tavkit.component.effectchain.VideoEffectProxy) tAVVideoEffect;
            java.util.List<com.tencent.tavkit.composition.video.TAVVideoEffect> effects = videoEffectProxy.getEffects();
            if (videoEffectProxy.isAutoCheckEffectRemove() || this.onEffectRemove) {
                checkRuntimeRelease(effects);
            }
            for (com.tencent.tavkit.composition.video.TAVVideoEffect tAVVideoEffect2 : effects) {
                com.tencent.tavkit.composition.video.TAVVideoEffect.Filter cacheFilter = getCacheFilter(tAVVideoEffect2);
                if (cacheFilter != null) {
                    long nanoTime = java.lang.System.nanoTime();
                    java.lang.String reportKey = cacheFilter instanceof com.tencent.tavkit.report.IReportable ? ((com.tencent.tavkit.report.IReportable) cacheFilter).getReportKey() : null;
                    cIImage = cacheFilter.apply(tAVVideoEffect2, cIImage, renderInfo);
                    if (!android.text.TextUtils.isEmpty(reportKey)) {
                        this.reportSession.tick(reportKey, java.lang.System.nanoTime() - nanoTime);
                    }
                }
            }
            return cIImage;
        }

        @Override // com.tencent.tavkit.report.IReportable
        public java.lang.String getReportKey() {
            return com.tencent.tavkit.report.MemoryReportHelper.appendReportKey(this.filterMap.values());
        }

        public void notifyOnEffectRemove() {
            this.onEffectRemove = true;
        }

        @Override // com.tencent.tavkit.composition.video.TAVVideoEffect.Filter
        public synchronized void release() {
            java.util.Iterator<com.tencent.tavkit.composition.video.TAVVideoEffect.Filter> it = this.filterMap.values().iterator();
            while (it.hasNext()) {
                it.next().release();
            }
            this.filterMap.clear();
            this.reportSession.commit();
        }
    }

    @Override // com.tencent.tavkit.composition.video.TAVVideoEffect
    public com.tencent.tavkit.composition.video.TAVVideoEffect.Filter createFilter() {
        com.tencent.tavkit.component.effectchain.VideoEffectProxy.FilterProxy filterProxy = new com.tencent.tavkit.component.effectchain.VideoEffectProxy.FilterProxy();
        this.filterProxies.add(filterProxy);
        return filterProxy;
    }

    @Override // com.tencent.tavkit.composition.video.TAVVideoEffect
    public java.lang.String effectId() {
        return "VideoEffectProxy" + java.lang.Integer.toHexString(hashCode());
    }

    public synchronized java.util.List<com.tencent.tavkit.composition.video.TAVVideoEffect> getEffects() {
        return this.effects;
    }

    public boolean isAutoCheckEffectRemove() {
        return this.autoCheckEffectRemove;
    }

    public void notifyOnEffectRemove() {
        java.util.Iterator<com.tencent.tavkit.component.effectchain.VideoEffectProxy.FilterProxy> it = this.filterProxies.iterator();
        while (it.hasNext()) {
            it.next().notifyOnEffectRemove();
        }
    }

    public void setAutoCheckEffectRemove(boolean z17) {
        this.autoCheckEffectRemove = z17;
    }

    public synchronized void setEffects(java.util.concurrent.CopyOnWriteArrayList<com.tencent.tavkit.composition.video.TAVVideoEffect> copyOnWriteArrayList) {
        this.effects = copyOnWriteArrayList;
    }
}
