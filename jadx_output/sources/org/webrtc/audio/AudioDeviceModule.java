package org.webrtc.audio;

/* loaded from: classes15.dex */
public interface AudioDeviceModule {
    long getNativeAudioDeviceModulePointer();

    void release();

    void setMicrophoneMute(boolean z17);

    void setSpeakerMute(boolean z17);
}
