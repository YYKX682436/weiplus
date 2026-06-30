package com.tencent.tavkit.composition.builder;

/* loaded from: classes16.dex */
class AudioParamsInfo {
    java.util.List<com.tencent.tavkit.composition.builder.AudioInfo> audioInfos;
    java.util.HashMap<java.lang.String, com.tencent.tavkit.composition.builder.AudioTransitionInfo> transitionMap;

    public AudioParamsInfo(java.util.List<com.tencent.tavkit.composition.builder.AudioInfo> list, java.util.HashMap<java.lang.String, com.tencent.tavkit.composition.builder.AudioTransitionInfo> hashMap) {
        this.audioInfos = list;
        this.transitionMap = hashMap;
    }
}
