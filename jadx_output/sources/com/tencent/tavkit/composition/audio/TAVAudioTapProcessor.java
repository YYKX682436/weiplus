package com.tencent.tavkit.composition.audio;

/* loaded from: classes16.dex */
public class TAVAudioTapProcessor implements com.tencent.tav.core.AudioTapProcessor {
    private java.util.List<com.tencent.tavkit.composition.audio.TAVAudioConfigurationSegment> audioConfigurationSegmentList;
    private java.util.HashMap<java.lang.String, com.tencent.tav.core.AudioTapProcessor> audioTapProcessorHashMap = new java.util.HashMap<>();
    private com.tencent.tav.decoder.AudioInfo destAudioInfo;

    public TAVAudioTapProcessor(java.util.List<com.tencent.tavkit.composition.audio.TAVAudioConfigurationSegment> list) {
        this.audioConfigurationSegmentList = list;
    }

    @Override // com.tencent.tav.core.AudioTapProcessor
    public com.tencent.tav.decoder.AudioInfo getDestAudioInfo() {
        return this.destAudioInfo;
    }

    @Override // com.tencent.tav.core.AudioTapProcessor
    public java.nio.ByteBuffer processAudioPCM(com.tencent.tav.coremedia.CMTime cMTime, java.nio.ByteBuffer byteBuffer, com.tencent.tav.decoder.AudioInfo audioInfo) {
        this.destAudioInfo = audioInfo;
        for (com.tencent.tavkit.composition.audio.TAVAudioConfigurationSegment tAVAudioConfigurationSegment : this.audioConfigurationSegmentList) {
            if (tAVAudioConfigurationSegment != null && tAVAudioConfigurationSegment.compositionTimeRange.containsTime(cMTime)) {
                com.tencent.tavkit.composition.model.TAVAudioConfiguration tAVAudioConfiguration = tAVAudioConfigurationSegment.audioConfiguration;
                if (tAVAudioConfiguration.getNodes() != null) {
                    for (com.tencent.tavkit.composition.audio.TAVAudioProcessorNode tAVAudioProcessorNode : tAVAudioConfiguration.getNodes()) {
                        java.lang.String identifier = tAVAudioProcessorNode.getIdentifier();
                        com.tencent.tav.core.AudioTapProcessor audioTapProcessor = this.audioTapProcessorHashMap.get(identifier);
                        if (audioTapProcessor == null) {
                            audioTapProcessor = tAVAudioProcessorNode.createAudioProcessor();
                            this.audioTapProcessorHashMap.put(identifier, audioTapProcessor);
                        }
                        if (audioTapProcessor != null) {
                            byteBuffer = audioTapProcessor.processAudioPCM(cMTime, byteBuffer, audioInfo);
                            this.destAudioInfo = audioTapProcessor.getDestAudioInfo();
                        }
                    }
                }
            }
        }
        return byteBuffer;
    }

    @Override // com.tencent.tav.core.AudioTapProcessor
    public void release() {
        java.util.Iterator<com.tencent.tav.core.AudioTapProcessor> it = this.audioTapProcessorHashMap.values().iterator();
        while (it.hasNext()) {
            it.next().release();
        }
    }

    public java.lang.String toString() {
        return "TAVAudioTapProcessor{audioConfigurationSegmentList=" + this.audioConfigurationSegmentList + ", audioTapProcessorHashMap=" + this.audioTapProcessorHashMap + '}';
    }
}
