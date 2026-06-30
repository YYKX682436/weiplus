package com.tencent.tav.core;

/* loaded from: classes16.dex */
public class AudioMix<InputParameters extends com.tencent.tav.core.AudioMixInputParameters> {
    protected java.util.List<InputParameters> inputParameters;

    public AudioMix(java.util.List<InputParameters> list) {
        this.inputParameters = list;
    }

    public java.util.List<InputParameters> getInputParameters() {
        return this.inputParameters;
    }

    public InputParameters getInputParametersWithTrackID(int i17) {
        for (InputParameters inputparameters : this.inputParameters) {
            if (inputparameters.getTrackID() == i17) {
                return inputparameters;
            }
        }
        return null;
    }

    public void release() {
        for (InputParameters inputparameters : this.inputParameters) {
            if (inputparameters != null && inputparameters.getAudioTapProcessor() != null) {
                inputparameters.getAudioTapProcessor().release();
            }
        }
    }

    public java.lang.String toString() {
        return "AudioMix{inputParameters=" + this.inputParameters + '}';
    }
}
