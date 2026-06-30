package org.webrtc;

/* loaded from: classes16.dex */
public interface CapturerObserver {
    void onCapturerStarted(boolean z17);

    void onCapturerStopped();

    void onFrameCaptured(org.webrtc.VideoFrame videoFrame);
}
