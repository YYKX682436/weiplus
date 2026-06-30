package com.tencent.tavkit.component;

/* loaded from: classes16.dex */
public class TAVTimeEffectBuilder {
    private com.tencent.tavkit.composition.TAVClip clip;
    private com.tencent.tavkit.component.TAVTimeEffect[] timeEffects;

    /* loaded from: classes16.dex */
    public static class TAVClipSegment {
        private com.tencent.tavkit.component.TAVTimeEffect timeEffect;
        private com.tencent.tav.coremedia.CMTimeRange timeRange;

        private TAVClipSegment() {
        }
    }

    public TAVTimeEffectBuilder() {
    }

    private void addSegmentToChannel(com.tencent.tavkit.composition.TAVClip tAVClip, com.tencent.tavkit.component.TAVTimeEffectBuilder.TAVClipSegment tAVClipSegment, java.util.List<com.tencent.tavkit.composition.TAVClip> list) {
        com.tencent.tavkit.composition.TAVClip m420clone = tAVClip.m420clone();
        m420clone.getResource().setSourceTimeRange(tAVClipSegment.timeRange);
        m420clone.getResource().setScaledDuration(tAVClipSegment.timeRange.getDuration());
        list.add(m420clone);
    }

    private void addSegmentToChannelWithTimeEffect(com.tencent.tavkit.composition.TAVClip tAVClip, com.tencent.tavkit.component.TAVTimeEffectBuilder.TAVClipSegment tAVClipSegment, java.util.List<com.tencent.tavkit.composition.TAVClip> list) {
        com.tencent.tavkit.composition.resource.TAVResource mo423clone;
        for (int i17 = 0; i17 < tAVClipSegment.timeEffect.getLoopCount(); i17++) {
            if (tAVClip.getResource() instanceof com.tencent.tavkit.composition.resource.TAVAssetTrackResource) {
                com.tencent.tav.asset.Asset asset = ((com.tencent.tavkit.composition.resource.TAVAssetTrackResource) tAVClip.getResource()).getAsset();
                if (tAVClipSegment.timeEffect.isFreeze()) {
                    mo423clone = new com.tencent.tavkit.composition.resource.TAVAssetTrackResource(asset);
                    com.tencent.tav.coremedia.CMTime cMTime = new com.tencent.tav.coremedia.CMTime(1L, 30);
                    if (tAVClipSegment.timeEffect.isReverse()) {
                        mo423clone.setSourceTimeRange(new com.tencent.tav.coremedia.CMTimeRange(tAVClipSegment.timeRange.getEnd().sub(cMTime), cMTime));
                    } else {
                        mo423clone.setSourceTimeRange(new com.tencent.tav.coremedia.CMTimeRange(tAVClipSegment.timeRange.getStart(), cMTime));
                    }
                } else {
                    mo423clone = tAVClipSegment.timeEffect.isReverse() ? new com.tencent.tavkit.composition.resource.TAVAssetTrackResource(asset) : new com.tencent.tavkit.composition.resource.TAVAssetTrackResource(asset);
                    mo423clone.setSourceTimeRange(new com.tencent.tav.coremedia.CMTimeRange(tAVClipSegment.timeRange.getStart(), tAVClipSegment.timeEffect.getTimeRange().getDuration().divide(tAVClipSegment.timeEffect.getLoopCount())));
                }
            } else {
                mo423clone = tAVClip.getResource().mo423clone();
            }
            if (tAVClipSegment.timeEffect.getLoopCount() == 0) {
                mo423clone.setScaledDuration(tAVClipSegment.timeRange.getDuration());
            } else {
                mo423clone.setScaledDuration(tAVClipSegment.timeRange.getDuration().divide(tAVClipSegment.timeEffect.getLoopCount()));
            }
            if (tAVClipSegment.timeEffect.getScaledDuration().value > 0) {
                if (tAVClipSegment.timeEffect.getLoopCount() == 0) {
                    mo423clone.setScaledDuration(tAVClipSegment.timeEffect.getScaledDuration());
                } else {
                    mo423clone.setScaledDuration(tAVClipSegment.timeEffect.getScaledDuration().divide(tAVClipSegment.timeEffect.getLoopCount()));
                }
            }
            com.tencent.tavkit.composition.TAVClip m420clone = tAVClip.m420clone();
            m420clone.setResource(mo423clone);
            list.add(m420clone);
        }
    }

    private java.util.List<com.tencent.tavkit.component.TAVTimeEffect> availableTimeEffectsFromClip(com.tencent.tavkit.composition.TAVClip tAVClip) {
        boolean z17;
        if (this.timeEffects == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.tavkit.composition.resource.TAVResource resource = tAVClip.getResource();
        for (com.tencent.tavkit.component.TAVTimeEffect tAVTimeEffect : this.timeEffects) {
            com.tencent.tav.coremedia.CMTimeRange intersection = com.tencent.tavkit.utils.TAVTimeUtil.getIntersection(resource.getSourceTimeRange(), tAVTimeEffect.getTimeRange());
            if (intersection != null && intersection.getDuration().value > 0) {
                java.util.Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z17 = false;
                        break;
                    }
                    com.tencent.tav.coremedia.CMTimeRange intersection2 = com.tencent.tavkit.utils.TAVTimeUtil.getIntersection(((com.tencent.tavkit.component.TAVTimeEffect) it.next()).getTimeRange(), intersection);
                    if (intersection2 != null && intersection2.getDuration().value > 0) {
                        z17 = true;
                        break;
                    }
                }
                if (!z17) {
                    arrayList.add(tAVTimeEffect);
                }
            }
        }
        java.util.Collections.sort(arrayList, new java.util.Comparator<com.tencent.tavkit.component.TAVTimeEffect>() { // from class: com.tencent.tavkit.component.TAVTimeEffectBuilder.1
            @Override // java.util.Comparator
            public int compare(com.tencent.tavkit.component.TAVTimeEffect tAVTimeEffect2, com.tencent.tavkit.component.TAVTimeEffect tAVTimeEffect3) {
                com.tencent.tav.coremedia.CMTime start = tAVTimeEffect2.getTimeRange().getStart();
                com.tencent.tav.coremedia.CMTime start2 = tAVTimeEffect3.getTimeRange().getStart();
                if (start.equalsTo(start2)) {
                    return 0;
                }
                return start.bigThan(start2) ? 1 : -1;
            }
        });
        return arrayList;
    }

    private void initChannelWithClip(com.tencent.tavkit.composition.TAVClip tAVClip, java.util.List<com.tencent.tavkit.composition.TAVClip> list) {
        for (com.tencent.tavkit.component.TAVTimeEffectBuilder.TAVClipSegment tAVClipSegment : segmentsWithClip(tAVClip)) {
            if (tAVClipSegment.timeEffect == null) {
                addSegmentToChannel(tAVClip, tAVClipSegment, list);
            } else {
                addSegmentToChannelWithTimeEffect(tAVClip, tAVClipSegment, list);
            }
        }
    }

    private java.util.List<com.tencent.tavkit.component.TAVTimeEffectBuilder.TAVClipSegment> segmentsWithClip(com.tencent.tavkit.composition.TAVClip tAVClip) {
        com.tencent.tavkit.composition.resource.TAVResource resource = tAVClip.getResource();
        com.tencent.tav.coremedia.CMTime start = resource.getSourceTimeRange().getStart();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.tav.coremedia.CMTime traverseTimeEffect = traverseTimeEffect(tAVClip, resource, arrayList, start);
        com.tencent.tav.coremedia.CMTime sub = resource.getSourceTimeRange().getEnd().sub(traverseTimeEffect);
        if (sub.value > 0) {
            com.tencent.tavkit.component.TAVTimeEffectBuilder.TAVClipSegment tAVClipSegment = new com.tencent.tavkit.component.TAVTimeEffectBuilder.TAVClipSegment();
            tAVClipSegment.timeRange = new com.tencent.tav.coremedia.CMTimeRange(traverseTimeEffect, sub);
            arrayList.add(tAVClipSegment);
        }
        return arrayList;
    }

    private com.tencent.tav.coremedia.CMTime traverseTimeEffect(com.tencent.tavkit.composition.TAVClip tAVClip, com.tencent.tavkit.composition.resource.TAVResource tAVResource, java.util.List<com.tencent.tavkit.component.TAVTimeEffectBuilder.TAVClipSegment> list, com.tencent.tav.coremedia.CMTime cMTime) {
        java.util.List<com.tencent.tavkit.component.TAVTimeEffect> availableTimeEffectsFromClip = availableTimeEffectsFromClip(tAVClip);
        if (availableTimeEffectsFromClip == null) {
            return cMTime;
        }
        for (com.tencent.tavkit.component.TAVTimeEffect tAVTimeEffect : availableTimeEffectsFromClip) {
            com.tencent.tav.coremedia.CMTime sub = tAVTimeEffect.getTimeRange().getStart().sub(cMTime);
            if (sub.value > 0) {
                com.tencent.tavkit.component.TAVTimeEffectBuilder.TAVClipSegment tAVClipSegment = new com.tencent.tavkit.component.TAVTimeEffectBuilder.TAVClipSegment();
                tAVClipSegment.timeRange = new com.tencent.tav.coremedia.CMTimeRange(cMTime, sub);
                list.add(tAVClipSegment);
            }
            com.tencent.tavkit.component.TAVTimeEffectBuilder.TAVClipSegment tAVClipSegment2 = new com.tencent.tavkit.component.TAVTimeEffectBuilder.TAVClipSegment();
            tAVClipSegment2.timeRange = new com.tencent.tav.coremedia.CMTimeRange(tAVTimeEffect.getTimeRange().getStart().add(tAVResource.getSourceTimeRange().getStart()), tAVTimeEffect.getTimeRange().getDuration());
            tAVClipSegment2.timeEffect = tAVTimeEffect;
            list.add(tAVClipSegment2);
            cMTime = tAVClipSegment2.timeRange.getEnd();
        }
        return cMTime;
    }

    public java.util.List<com.tencent.tavkit.composition.TAVClip> build() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.tav.coremedia.CMTimeRange sourceTimeRange = this.clip.getResource().getSourceTimeRange();
        if (sourceTimeRange == null || sourceTimeRange.getDuration().value == 0) {
            return null;
        }
        initChannelWithClip(this.clip, arrayList);
        return arrayList;
    }

    public void setClip(com.tencent.tavkit.composition.TAVClip tAVClip) {
        this.clip = tAVClip;
    }

    public void setTimeEffects(com.tencent.tavkit.component.TAVTimeEffect[] tAVTimeEffectArr) {
        this.timeEffects = tAVTimeEffectArr;
    }

    public TAVTimeEffectBuilder(com.tencent.tavkit.composition.TAVClip tAVClip, java.util.List<com.tencent.tavkit.component.TAVTimeEffect> list) {
        this.clip = tAVClip;
        this.timeEffects = (com.tencent.tavkit.component.TAVTimeEffect[]) list.toArray();
    }

    public TAVTimeEffectBuilder(com.tencent.tavkit.composition.TAVClip tAVClip, com.tencent.tavkit.component.TAVTimeEffect... tAVTimeEffectArr) {
        this.clip = tAVClip;
        this.timeEffects = tAVTimeEffectArr;
    }
}
