package com.tencent.tav.core.composition;

/* loaded from: classes16.dex */
public class MutableVideoCompositionLayerInstruction implements com.tencent.tav.core.composition.VideoCompositionLayerInstruction {
    private com.tencent.tav.asset.AssetTrack assetTrack;
    private java.util.List<com.tencent.tav.core.composition.VideoCompositionLayerInstruction.CropRectangleRamp> cropRectangleRampList;
    private com.tencent.tav.coremedia.CMTime duration;
    private boolean flipX;
    private boolean flipY;
    private java.util.List<com.tencent.tav.core.composition.VideoCompositionLayerInstruction.OpacityRamp> opacityRampList;
    private int trackID;
    private java.util.List<com.tencent.tav.core.composition.VideoCompositionLayerInstruction.TransformRamp> transformRampList;

    public MutableVideoCompositionLayerInstruction(com.tencent.tav.asset.AssetTrack assetTrack) {
        this.transformRampList = new java.util.ArrayList();
        this.opacityRampList = new java.util.ArrayList();
        this.cropRectangleRampList = new java.util.ArrayList();
        this.duration = new com.tencent.tav.coremedia.CMTime(2147483647L);
        this.flipX = false;
        this.flipY = false;
        this.trackID = assetTrack.getTrackID();
        this.assetTrack = assetTrack;
        this.duration = assetTrack.getDuration();
    }

    @Override // com.tencent.tav.core.composition.VideoCompositionLayerInstruction
    public com.tencent.tav.core.composition.VideoCompositionLayerInstruction.CropRectangleRamp getCropRectangleRampForTime(com.tencent.tav.coremedia.CMTime cMTime) {
        for (com.tencent.tav.core.composition.VideoCompositionLayerInstruction.CropRectangleRamp cropRectangleRamp : this.cropRectangleRampList) {
            if (cropRectangleRamp.timeRange.containsTime(cMTime)) {
                return cropRectangleRamp;
            }
        }
        return new com.tencent.tav.core.composition.VideoCompositionLayerInstruction.CropRectangleRamp(new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, this.duration));
    }

    @Override // com.tencent.tav.core.composition.VideoCompositionLayerInstruction
    public com.tencent.tav.core.composition.VideoCompositionLayerInstruction.OpacityRamp getOpacityRampForTime(com.tencent.tav.coremedia.CMTime cMTime) {
        for (com.tencent.tav.core.composition.VideoCompositionLayerInstruction.OpacityRamp opacityRamp : this.opacityRampList) {
            if (opacityRamp.timeRange.containsTime(cMTime)) {
                return opacityRamp;
            }
        }
        return new com.tencent.tav.core.composition.VideoCompositionLayerInstruction.OpacityRamp(new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, this.duration));
    }

    @Override // com.tencent.tav.core.composition.VideoCompositionLayerInstruction
    public int getTrackID() {
        return this.trackID;
    }

    @Override // com.tencent.tav.core.composition.VideoCompositionLayerInstruction
    public com.tencent.tav.core.composition.VideoCompositionLayerInstruction.TransformRamp getTransformRampForTime(com.tencent.tav.coremedia.CMTime cMTime) {
        for (com.tencent.tav.core.composition.VideoCompositionLayerInstruction.TransformRamp transformRamp : this.transformRampList) {
            if (transformRamp.timeRange.containsTime(cMTime)) {
                return transformRamp;
            }
        }
        return new com.tencent.tav.core.composition.VideoCompositionLayerInstruction.TransformRamp(new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, this.duration));
    }

    public void setCropRectangle(com.tencent.tav.coremedia.CGRect cGRect, com.tencent.tav.coremedia.CMTime cMTime) {
        com.tencent.tav.coremedia.CMTime cMTime2 = this.duration;
        java.util.Iterator<com.tencent.tav.core.composition.VideoCompositionLayerInstruction.CropRectangleRamp> it = this.cropRectangleRampList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.tav.core.composition.VideoCompositionLayerInstruction.CropRectangleRamp next = it.next();
            if (next.timeRange.containsTime(cMTime)) {
                cMTime2 = next.timeRange.getEnd();
                next.timeRange = new com.tencent.tav.coremedia.CMTimeRange(next.timeRange.getStart(), cMTime.sub(next.timeRange.getStart()));
                break;
            }
        }
        com.tencent.tav.core.composition.VideoCompositionLayerInstruction.CropRectangleRamp cropRectangleRamp = new com.tencent.tav.core.composition.VideoCompositionLayerInstruction.CropRectangleRamp(new com.tencent.tav.coremedia.CMTimeRange(cMTime, cMTime2.sub(cMTime)));
        cropRectangleRamp.startCropRectangle = cGRect;
        cropRectangleRamp.endCropRectangle = cGRect;
        this.cropRectangleRampList.add(cropRectangleRamp);
    }

    public void setCropRectangleRampFromStartCropRectangle(com.tencent.tav.coremedia.CGRect cGRect, com.tencent.tav.coremedia.CGRect cGRect2, com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        com.tencent.tav.core.composition.VideoCompositionLayerInstruction.CropRectangleRamp cropRectangleRamp = new com.tencent.tav.core.composition.VideoCompositionLayerInstruction.CropRectangleRamp(cMTimeRange);
        cropRectangleRamp.startCropRectangle = cGRect;
        cropRectangleRamp.endCropRectangle = cGRect2;
        java.util.Iterator<com.tencent.tav.core.composition.VideoCompositionLayerInstruction.CropRectangleRamp> it = this.cropRectangleRampList.iterator();
        if (it.hasNext()) {
            com.tencent.tav.core.composition.VideoCompositionLayerInstruction.CropRectangleRamp next = it.next();
            com.tencent.tav.coremedia.CMTime start = next.timeRange.getStart();
            com.tencent.tav.coremedia.CMTime end = next.timeRange.getEnd();
            if (cMTimeRange.containsTime(start) && cMTimeRange.containsTime(end)) {
                next.timeRange = com.tencent.tav.coremedia.CMTimeRange.CMTimeRangeInvalid;
            } else if (cMTimeRange.containsTime(start) && !cMTimeRange.containsTime(end)) {
                next.timeRange = new com.tencent.tav.coremedia.CMTimeRange(cMTimeRange.getEnd(), next.timeRange.getEnd().sub(cMTimeRange.getEnd()));
            } else if (cMTimeRange.containsTime(end) && !cMTimeRange.containsTime(start)) {
                next.timeRange = new com.tencent.tav.coremedia.CMTimeRange(next.timeRange.getStart(), cMTimeRange.getStart().sub(next.timeRange.getStart()));
            }
        }
        int i17 = 0;
        while (i17 < this.cropRectangleRampList.size()) {
            com.tencent.tav.core.composition.VideoCompositionLayerInstruction.CropRectangleRamp cropRectangleRamp2 = this.cropRectangleRampList.get(i17);
            if (cropRectangleRamp2.timeRange == com.tencent.tav.coremedia.CMTimeRange.CMTimeRangeInvalid) {
                this.cropRectangleRampList.remove(cropRectangleRamp2);
                i17--;
            }
            i17++;
        }
        this.cropRectangleRampList.add(cropRectangleRamp);
    }

    public void setFlipX(boolean z17) {
        this.flipX = z17;
    }

    public void setFlipY(boolean z17) {
        this.flipY = z17;
    }

    public void setOpacity(float f17, com.tencent.tav.coremedia.CMTime cMTime) {
        com.tencent.tav.coremedia.CMTime cMTime2 = this.duration;
        java.util.Iterator<com.tencent.tav.core.composition.VideoCompositionLayerInstruction.OpacityRamp> it = this.opacityRampList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.tav.core.composition.VideoCompositionLayerInstruction.OpacityRamp next = it.next();
            if (next.timeRange.containsTime(cMTime)) {
                cMTime2 = next.timeRange.getEnd();
                next.timeRange = new com.tencent.tav.coremedia.CMTimeRange(next.timeRange.getStart(), cMTime.sub(next.timeRange.getStart()));
                break;
            }
        }
        com.tencent.tav.core.composition.VideoCompositionLayerInstruction.OpacityRamp opacityRamp = new com.tencent.tav.core.composition.VideoCompositionLayerInstruction.OpacityRamp(new com.tencent.tav.coremedia.CMTimeRange(cMTime, cMTime2.sub(cMTime)));
        opacityRamp.startOpacity = f17;
        opacityRamp.endOpacity = f17;
        this.opacityRampList.add(opacityRamp);
    }

    public void setOpacityRampFromStartOpacity(float f17, float f18, com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        com.tencent.tav.core.composition.VideoCompositionLayerInstruction.OpacityRamp opacityRamp = new com.tencent.tav.core.composition.VideoCompositionLayerInstruction.OpacityRamp(cMTimeRange);
        opacityRamp.startOpacity = f17;
        opacityRamp.endOpacity = f18;
        java.util.Iterator<com.tencent.tav.core.composition.VideoCompositionLayerInstruction.OpacityRamp> it = this.opacityRampList.iterator();
        if (it.hasNext()) {
            com.tencent.tav.core.composition.VideoCompositionLayerInstruction.OpacityRamp next = it.next();
            com.tencent.tav.coremedia.CMTime start = next.timeRange.getStart();
            com.tencent.tav.coremedia.CMTime end = next.timeRange.getEnd();
            if (cMTimeRange.containsTime(start) && cMTimeRange.containsTime(end)) {
                next.timeRange = com.tencent.tav.coremedia.CMTimeRange.CMTimeRangeInvalid;
            } else if (cMTimeRange.containsTime(start) && !cMTimeRange.containsTime(end)) {
                next.timeRange = new com.tencent.tav.coremedia.CMTimeRange(cMTimeRange.getEnd(), next.timeRange.getEnd().sub(cMTimeRange.getEnd()));
            } else if (cMTimeRange.containsTime(end) && !cMTimeRange.containsTime(start)) {
                next.timeRange = new com.tencent.tav.coremedia.CMTimeRange(next.timeRange.getStart(), cMTimeRange.getStart().sub(next.timeRange.getStart()));
            }
        }
        int i17 = 0;
        while (i17 < this.opacityRampList.size()) {
            com.tencent.tav.core.composition.VideoCompositionLayerInstruction.OpacityRamp opacityRamp2 = this.opacityRampList.get(i17);
            if (opacityRamp2.timeRange == com.tencent.tav.coremedia.CMTimeRange.CMTimeRangeInvalid) {
                this.opacityRampList.remove(opacityRamp2);
                i17--;
            }
            i17++;
        }
        this.opacityRampList.add(opacityRamp);
    }

    public void setTrackID(int i17) {
        this.trackID = i17;
    }

    public void setTransform(com.tencent.tav.coremedia.Transform transform, com.tencent.tav.coremedia.CMTime cMTime) {
        com.tencent.tav.coremedia.CMTime cMTime2 = this.duration;
        java.util.Iterator<com.tencent.tav.core.composition.VideoCompositionLayerInstruction.TransformRamp> it = this.transformRampList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.tav.core.composition.VideoCompositionLayerInstruction.TransformRamp next = it.next();
            if (next.timeRange.containsTime(cMTime)) {
                cMTime2 = next.timeRange.getEnd();
                next.timeRange = new com.tencent.tav.coremedia.CMTimeRange(next.timeRange.getStart(), cMTime.sub(next.timeRange.getStart()));
                break;
            }
        }
        com.tencent.tav.core.composition.VideoCompositionLayerInstruction.TransformRamp transformRamp = new com.tencent.tav.core.composition.VideoCompositionLayerInstruction.TransformRamp(new com.tencent.tav.coremedia.CMTimeRange(cMTime, cMTime2.sub(cMTime)));
        transformRamp.startTransform = transform;
        transformRamp.endTransform = transform;
        this.transformRampList.add(transformRamp);
    }

    public void setTransformRampFromStartTransform(com.tencent.tav.coremedia.Transform transform, com.tencent.tav.coremedia.Transform transform2, com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        com.tencent.tav.core.composition.VideoCompositionLayerInstruction.TransformRamp transformRamp = new com.tencent.tav.core.composition.VideoCompositionLayerInstruction.TransformRamp(cMTimeRange);
        transformRamp.startTransform = transform;
        transformRamp.endTransform = transform2;
        java.util.Iterator<com.tencent.tav.core.composition.VideoCompositionLayerInstruction.TransformRamp> it = this.transformRampList.iterator();
        if (it.hasNext()) {
            com.tencent.tav.core.composition.VideoCompositionLayerInstruction.TransformRamp next = it.next();
            com.tencent.tav.coremedia.CMTime start = next.timeRange.getStart();
            com.tencent.tav.coremedia.CMTime end = next.timeRange.getEnd();
            if (cMTimeRange.containsTime(start) && cMTimeRange.containsTime(end)) {
                next.timeRange = com.tencent.tav.coremedia.CMTimeRange.CMTimeRangeInvalid;
            } else if (cMTimeRange.containsTime(start) && !cMTimeRange.containsTime(end)) {
                next.timeRange = new com.tencent.tav.coremedia.CMTimeRange(cMTimeRange.getEnd(), next.timeRange.getEnd().sub(cMTimeRange.getEnd()));
            } else if (cMTimeRange.containsTime(end) && !cMTimeRange.containsTime(start)) {
                next.timeRange = new com.tencent.tav.coremedia.CMTimeRange(next.timeRange.getStart(), cMTimeRange.getStart().sub(next.timeRange.getStart()));
            }
        }
        int i17 = 0;
        while (i17 < this.transformRampList.size()) {
            com.tencent.tav.core.composition.VideoCompositionLayerInstruction.TransformRamp transformRamp2 = this.transformRampList.get(i17);
            if (transformRamp2.timeRange == com.tencent.tav.coremedia.CMTimeRange.CMTimeRangeInvalid) {
                this.transformRampList.remove(transformRamp2);
                i17--;
            }
            i17++;
        }
        this.transformRampList.add(transformRamp);
    }

    public MutableVideoCompositionLayerInstruction(int i17) {
        this.transformRampList = new java.util.ArrayList();
        this.opacityRampList = new java.util.ArrayList();
        this.cropRectangleRampList = new java.util.ArrayList();
        this.duration = new com.tencent.tav.coremedia.CMTime(2147483647L);
        this.flipX = false;
        this.flipY = false;
        this.trackID = i17;
    }

    public MutableVideoCompositionLayerInstruction() {
        this.transformRampList = new java.util.ArrayList();
        this.opacityRampList = new java.util.ArrayList();
        this.cropRectangleRampList = new java.util.ArrayList();
        this.duration = new com.tencent.tav.coremedia.CMTime(2147483647L);
        this.flipX = false;
        this.flipY = false;
    }
}
