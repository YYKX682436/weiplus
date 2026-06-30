package com.tencent.tavkit.composition.model;

/* loaded from: classes16.dex */
public class TAVTransition {
    private com.tencent.tavkit.composition.audio.TAVAudioTransition audioTransition;
    private com.tencent.tav.coremedia.CMTime duration;
    private com.tencent.tavkit.composition.video.TAVVideoTransition videoTransition;

    /* loaded from: classes16.dex */
    public static class EmptyAudioTransition implements com.tencent.tavkit.composition.audio.TAVAudioTransition {
        private com.tencent.tav.coremedia.CMTime duration;
        private java.lang.String identifier;

        public EmptyAudioTransition(com.tencent.tav.coremedia.CMTime cMTime) {
            this.duration = cMTime;
        }

        @Override // com.tencent.tavkit.composition.audio.TAVAudioTransition
        public void applyNextAudioMixInputParameters(com.tencent.tav.core.MutableAudioMixInputParameters mutableAudioMixInputParameters, com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        }

        @Override // com.tencent.tavkit.composition.audio.TAVAudioTransition
        public void applyPreviousAudioMixInputParameters(com.tencent.tav.core.MutableAudioMixInputParameters mutableAudioMixInputParameters, com.tencent.tav.coremedia.CMTimeRange cMTimeRange) {
        }

        @Override // com.tencent.tavkit.composition.audio.TAVAudioTransition
        public com.tencent.tav.coremedia.CMTime getDuration() {
            return this.duration;
        }

        @Override // com.tencent.tavkit.composition.audio.TAVAudioTransition
        public java.lang.String getIdentifier() {
            return this.identifier;
        }

        @Override // com.tencent.tavkit.composition.audio.TAVAudioTransition
        public void setIdentifier(java.lang.String str) {
            this.identifier = str;
        }
    }

    /* loaded from: classes16.dex */
    public static class EmptyVideoTransition implements com.tencent.tavkit.composition.video.TAVVideoTransition {
        private com.tencent.tav.coremedia.CMTime duration;

        public EmptyVideoTransition(com.tencent.tav.coremedia.CMTime cMTime) {
            this.duration = cMTime;
        }

        @Override // com.tencent.tavkit.composition.video.TAVVideoTransition
        public com.tencent.tavkit.composition.video.TAVVideoTransition.Filter createFilter() {
            return null;
        }

        @Override // com.tencent.tavkit.composition.video.TAVVideoTransition
        public java.lang.String effectId() {
            return toString();
        }

        @Override // com.tencent.tavkit.composition.video.TAVVideoTransition
        public com.tencent.tav.coremedia.CMTime getDuration() {
            return this.duration;
        }
    }

    public TAVTransition(com.tencent.tav.coremedia.CMTime cMTime) {
        this.duration = cMTime;
        this.audioTransition = new com.tencent.tavkit.composition.model.TAVTransition.EmptyAudioTransition(cMTime);
        this.videoTransition = new com.tencent.tavkit.composition.model.TAVTransition.EmptyVideoTransition(cMTime);
    }

    public com.tencent.tavkit.composition.audio.TAVAudioTransition getAudioTransition() {
        return this.audioTransition;
    }

    public com.tencent.tav.coremedia.CMTime getDuration() {
        return this.duration;
    }

    public com.tencent.tavkit.composition.video.TAVVideoTransition getVideoTransition() {
        return this.videoTransition;
    }

    public void setAudioTransition(com.tencent.tavkit.composition.audio.TAVAudioTransition tAVAudioTransition) {
        this.audioTransition = tAVAudioTransition;
    }

    public void setVideoTransition(com.tencent.tavkit.composition.video.TAVVideoTransition tAVVideoTransition) {
        this.videoTransition = tAVVideoTransition;
    }
}
