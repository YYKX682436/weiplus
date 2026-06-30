package org.webrtc.audio;

@java.lang.Deprecated
/* loaded from: classes15.dex */
public class LegacyAudioDeviceModule implements org.webrtc.audio.AudioDeviceModule {
    @Override // org.webrtc.audio.AudioDeviceModule
    public long getNativeAudioDeviceModulePointer() {
        return 0L;
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void release() {
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void setMicrophoneMute(boolean z17) {
        org.webrtc.voiceengine.WebRtcAudioRecord.setMicrophoneMute(z17);
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void setSpeakerMute(boolean z17) {
        org.webrtc.voiceengine.WebRtcAudioTrack.setSpeakerMute(z17);
    }
}
