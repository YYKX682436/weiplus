package com.tencent.tavkit.composition.model;

/* loaded from: classes16.dex */
public class TAVAudioConfiguration {
    private com.tencent.tavkit.composition.model.TAVAudioConfiguration.VolumeEdge endVolumeEdge;
    private final java.util.List<com.tencent.tavkit.composition.audio.TAVAudioProcessorNode> nodes;
    private com.tencent.tavkit.composition.model.TAVAudioConfiguration.VolumeEdge startVolumeEdge;
    private float volume;
    private java.util.List<com.tencent.tavkit.composition.model.TAVAudioConfiguration.VolumeEdge> volumeEdges;

    /* loaded from: classes16.dex */
    public static class VolumeEdge {
        private float endVolume;
        private float startVolume;
        private com.tencent.tav.coremedia.CMTimeRange timeRange;

        public VolumeEdge() {
        }

        public com.tencent.tav.coremedia.CMTime getDuration() {
            com.tencent.tav.coremedia.CMTimeRange cMTimeRange = this.timeRange;
            return cMTimeRange != null ? cMTimeRange.getDuration() : com.tencent.tav.coremedia.CMTime.CMTimeZero;
        }

        public float getEndVolume() {
            return this.endVolume;
        }

        public float getStartVolume() {
            return this.startVolume;
        }

        public com.tencent.tav.coremedia.CMTimeRange getTimeRange() {
            return this.timeRange;
        }

        public float getVolume(com.tencent.tav.coremedia.CMTime cMTime) {
            long timeUs = cMTime.getTimeUs();
            float f17 = this.startVolume;
            return f17 + ((this.endVolume - f17) * ((((float) timeUs) * 1.0f) / ((float) getDuration().getTimeUs())));
        }

        public void setDuration(com.tencent.tav.coremedia.CMTime cMTime) {
            this.timeRange = new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, cMTime);
        }

        public void setEndVolume(float f17) {
            this.endVolume = f17;
        }

        public void setStartVolume(float f17) {
            this.startVolume = f17;
        }

        public void setTimeRange(com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
            this.timeRange = cMTimeRange;
        }

        public VolumeEdge(com.tencent.tav.coremedia.CMTime cMTime, float f17, float f18) {
            this.timeRange = new com.tencent.tav.coremedia.CMTimeRange(com.tencent.tav.coremedia.CMTime.CMTimeZero, cMTime);
            this.startVolume = f17;
            this.endVolume = f18;
        }

        public VolumeEdge(com.tencent.tav.coremedia.CMTimeRange cMTimeRange, float f17, float f18) {
            this.timeRange = cMTimeRange;
            this.startVolume = f17;
            this.endVolume = f18;
        }
    }

    public TAVAudioConfiguration() {
        this(1.0f);
    }

    public void addAudioProcessorNode(com.tencent.tavkit.composition.audio.TAVAudioProcessorNode tAVAudioProcessorNode) {
        this.nodes.add(tAVAudioProcessorNode);
    }

    public void addVolumeEdge(com.tencent.tavkit.composition.model.TAVAudioConfiguration.VolumeEdge volumeEdge) {
        if (volumeEdge == null) {
            return;
        }
        if (this.volumeEdges == null) {
            this.volumeEdges = new java.util.ArrayList();
        }
        this.volumeEdges.add(0, volumeEdge);
    }

    public com.tencent.tavkit.composition.model.TAVAudioConfiguration.VolumeEdge getEndVolumeEdge() {
        return this.endVolumeEdge;
    }

    public java.util.List<com.tencent.tavkit.composition.audio.TAVAudioProcessorNode> getNodes() {
        return this.nodes;
    }

    public com.tencent.tavkit.composition.model.TAVAudioConfiguration.VolumeEdge getStartVolumeEdge() {
        return this.startVolumeEdge;
    }

    public float getVolume() {
        return this.volume;
    }

    public void setAudioProcessorNodes(java.util.List<com.tencent.tavkit.composition.audio.TAVAudioProcessorNode> list) {
        this.nodes.clear();
        if (list != null) {
            this.nodes.addAll(list);
        }
    }

    public void setEndVolumeEdge(com.tencent.tavkit.composition.model.TAVAudioConfiguration.VolumeEdge volumeEdge) {
        this.endVolumeEdge = volumeEdge;
    }

    public void setStartVolumeEdge(com.tencent.tavkit.composition.model.TAVAudioConfiguration.VolumeEdge volumeEdge) {
        this.startVolumeEdge = volumeEdge;
    }

    public void setVolume(float f17) {
        this.volume = f17;
    }

    public java.lang.String toString() {
        return "TAVAudioConfiguration{volume=" + this.volume + ", startVolumeEdge=" + this.startVolumeEdge + ", endVolumeEdge=" + this.endVolumeEdge + ", nodes=" + this.nodes + '}';
    }

    public TAVAudioConfiguration(float f17) {
        this(f17, null, null);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public com.tencent.tavkit.composition.model.TAVAudioConfiguration m421clone() {
        return new com.tencent.tavkit.composition.model.TAVAudioConfiguration(this.volume, this.nodes);
    }

    public float getVolume(com.tencent.tav.coremedia.CMTime cMTime) {
        com.tencent.tavkit.composition.model.TAVAudioConfiguration.VolumeEdge volumeEdge = this.startVolumeEdge;
        if (volumeEdge != null && volumeEdge.getTimeRange() != null && this.startVolumeEdge.getTimeRange().containsTime(cMTime)) {
            com.tencent.tavkit.composition.model.TAVAudioConfiguration.VolumeEdge volumeEdge2 = this.startVolumeEdge;
            return volumeEdge2.getVolume(cMTime.sub(volumeEdge2.getTimeRange().getStart()));
        }
        com.tencent.tavkit.composition.model.TAVAudioConfiguration.VolumeEdge volumeEdge3 = this.endVolumeEdge;
        if (volumeEdge3 != null && volumeEdge3.getTimeRange() != null && this.endVolumeEdge.getTimeRange().containsTime(cMTime)) {
            com.tencent.tavkit.composition.model.TAVAudioConfiguration.VolumeEdge volumeEdge4 = this.endVolumeEdge;
            return volumeEdge4.getVolume(cMTime.sub(volumeEdge4.getTimeRange().getStart()));
        }
        java.util.List<com.tencent.tavkit.composition.model.TAVAudioConfiguration.VolumeEdge> list = this.volumeEdges;
        if (list != null && !list.isEmpty()) {
            for (com.tencent.tavkit.composition.model.TAVAudioConfiguration.VolumeEdge volumeEdge5 : this.volumeEdges) {
                if (volumeEdge5 != null && volumeEdge5.getTimeRange() != null && volumeEdge5.getTimeRange().containsTime(cMTime)) {
                    return volumeEdge5.getVolume(cMTime.sub(volumeEdge5.getTimeRange().getStart()));
                }
            }
        }
        return this.volume;
    }

    public TAVAudioConfiguration(java.util.List<com.tencent.tavkit.composition.model.TAVAudioConfiguration.VolumeEdge> list) {
        this(1.0f, null, list);
    }

    public TAVAudioConfiguration(float f17, java.util.List<com.tencent.tavkit.composition.audio.TAVAudioProcessorNode> list) {
        this(f17, list, null);
    }

    public TAVAudioConfiguration(float f17, java.util.List<com.tencent.tavkit.composition.audio.TAVAudioProcessorNode> list, java.util.List<com.tencent.tavkit.composition.model.TAVAudioConfiguration.VolumeEdge> list2) {
        this.volume = f17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.nodes = arrayList;
        if (list != null) {
            arrayList.addAll(list);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.volumeEdges = arrayList2;
        if (list2 != null) {
            arrayList2.addAll(list2);
        }
    }
}
