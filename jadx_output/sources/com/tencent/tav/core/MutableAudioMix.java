package com.tencent.tav.core;

/* loaded from: classes16.dex */
public class MutableAudioMix extends com.tencent.tav.core.AudioMix {
    public MutableAudioMix(java.util.List<? extends com.tencent.tav.core.AudioMixInputParameters> list) {
        super(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setInputParameters(java.util.List<com.tencent.tav.core.AudioMixInputParameters> list) {
        this.inputParameters = list;
    }
}
