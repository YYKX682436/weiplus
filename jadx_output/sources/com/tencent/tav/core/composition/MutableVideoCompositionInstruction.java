package com.tencent.tav.core.composition;

/* loaded from: classes16.dex */
public class MutableVideoCompositionInstruction extends com.tencent.tav.core.composition.VideoCompositionInstruction {
    public void setBackgroundColor(int i17) {
        this.backgroundColor = i17;
    }

    public void setEnablePostProcessing(boolean z17) {
        this.enablePostProcessing = z17;
    }

    public void setLayerInstructions(java.util.List<com.tencent.tav.core.composition.VideoCompositionLayerInstruction> list) {
        this.layerInstructions.clear();
        this.layerInstructions.addAll(list);
        this.requiredSourceTrackIDs.clear();
        java.util.Iterator<com.tencent.tav.core.composition.VideoCompositionLayerInstruction> it = list.iterator();
        while (it.hasNext()) {
            this.requiredSourceTrackIDs.add(java.lang.Integer.valueOf(it.next().getTrackID()));
        }
    }

    public void setTimeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        this.timeRange = cMTimeRange;
    }
}
