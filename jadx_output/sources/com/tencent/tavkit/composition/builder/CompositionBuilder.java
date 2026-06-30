package com.tencent.tavkit.composition.builder;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class CompositionBuilder {
    private com.tencent.tavkit.composition.builder.BuilderModel builderModel;
    private com.tencent.tav.asset.MutableComposition composition = new com.tencent.tav.asset.MutableComposition();
    private boolean isAudioTracksMerge;
    private boolean isVideoTracksMerge;

    public CompositionBuilder(com.tencent.tavkit.composition.builder.BuilderModel builderModel, boolean z17, boolean z18) {
        this.builderModel = builderModel;
        this.isVideoTracksMerge = z17;
        this.isAudioTracksMerge = z18;
    }

    private com.tencent.tavkit.composition.builder.AudioTransitionInfo getAudioTransitionInfo(java.util.List<? extends com.tencent.tavkit.composition.model.TAVTransitionableAudio> list, com.tencent.tavkit.composition.audio.TAVAudioTransition tAVAudioTransition, com.tencent.tavkit.composition.model.TAVTransitionableAudio tAVTransitionableAudio, int i17) {
        return (i17 != 0 || list.size() <= 1) ? i17 == list.size() - 1 ? new com.tencent.tavkit.composition.builder.AudioTransitionInfo(tAVAudioTransition, null) : new com.tencent.tavkit.composition.builder.AudioTransitionInfo(tAVAudioTransition, tAVTransitionableAudio.getAudioTransition()) : new com.tencent.tavkit.composition.builder.AudioTransitionInfo(null, tAVTransitionableAudio.getAudioTransition());
    }

    private void initCompositionWithAudioChannels() {
        for (java.util.List<? extends com.tencent.tavkit.composition.model.TAVTransitionableAudio> list : this.builderModel.getAudioChannels()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.HashMap hashMap = new java.util.HashMap();
            com.tencent.tavkit.composition.audio.TAVAudioTransition tAVAudioTransition = null;
            for (int i17 = 0; i17 < list.size(); i17++) {
                com.tencent.tavkit.composition.model.TAVTransitionableAudio tAVTransitionableAudio = list.get(i17);
                for (int i18 = 0; i18 < tAVTransitionableAudio.numberOfAudioTracks(); i18++) {
                    com.tencent.tav.asset.CompositionTrack audioCompositionTrackForComposition = tAVTransitionableAudio.audioCompositionTrackForComposition(this.composition, i18, this.isAudioTracksMerge);
                    if (audioCompositionTrackForComposition != null) {
                        arrayList.add(new com.tencent.tavkit.composition.builder.AudioInfo(audioCompositionTrackForComposition, tAVTransitionableAudio));
                    }
                }
                hashMap.put(java.lang.String.valueOf(i17), getAudioTransitionInfo(list, tAVAudioTransition, tAVTransitionableAudio, i17));
                tAVAudioTransition = tAVTransitionableAudio.getAudioTransition();
            }
            this.builderModel.addMainAudioTrackInfo(new com.tencent.tavkit.composition.builder.AudioParamsInfo(arrayList, hashMap));
        }
    }

    private void initCompositionWithMixAudios(java.util.List<? extends com.tencent.tavkit.composition.model.TAVAudio> list) {
        if (list == null) {
            return;
        }
        for (com.tencent.tavkit.composition.model.TAVAudio tAVAudio : list) {
            for (int i17 = 0; i17 < tAVAudio.numberOfAudioTracks(); i17++) {
                com.tencent.tav.asset.CompositionTrack audioCompositionTrackForComposition = tAVAudio.audioCompositionTrackForComposition(this.composition, i17, this.isAudioTracksMerge);
                if (audioCompositionTrackForComposition != null) {
                    this.builderModel.addAudioTrackInfo(new com.tencent.tavkit.composition.builder.AudioMixInfo(audioCompositionTrackForComposition, tAVAudio));
                }
            }
        }
    }

    private void initCompositionWithOverlays(java.util.List<? extends com.tencent.tavkit.composition.model.TAVVideo> list) {
        if (list == null) {
            return;
        }
        for (com.tencent.tavkit.composition.model.TAVVideo tAVVideo : list) {
            for (int i17 = 0; i17 < tAVVideo.numberOfVideoTracks(); i17++) {
                com.tencent.tav.asset.CompositionTrack videoCompositionTrackForComposition = tAVVideo.videoCompositionTrackForComposition(this.composition, i17, this.isVideoTracksMerge);
                if (videoCompositionTrackForComposition != null) {
                    this.builderModel.addOverlayTrackInfo(new com.tencent.tavkit.composition.builder.VideoOverlayInfo(videoCompositionTrackForComposition, tAVVideo));
                }
            }
        }
    }

    private void initCompositionWithVideoChannels() {
        for (java.util.List<? extends com.tencent.tavkit.composition.model.TAVTransitionableVideo> list : this.builderModel.getVideoChannels()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (com.tencent.tavkit.composition.model.TAVTransitionableVideo tAVTransitionableVideo : list) {
                for (int i17 = 0; i17 < tAVTransitionableVideo.numberOfVideoTracks(); i17++) {
                    com.tencent.tav.asset.CompositionTrack videoCompositionTrackForComposition = tAVTransitionableVideo.videoCompositionTrackForComposition(this.composition, i17, this.isVideoTracksMerge);
                    if (videoCompositionTrackForComposition != null) {
                        arrayList.add(new com.tencent.tavkit.composition.builder.VideoInfo(videoCompositionTrackForComposition, tAVTransitionableVideo));
                    }
                }
            }
            this.builderModel.addMainVideoTrackInfo(arrayList);
        }
    }

    public com.tencent.tav.asset.MutableComposition build() {
        initCompositionWithVideoChannels();
        initCompositionWithAudioChannels();
        initCompositionWithOverlays(this.builderModel.getOverlays());
        initCompositionWithMixAudios(this.builderModel.getMixAudios());
        return this.composition;
    }
}
