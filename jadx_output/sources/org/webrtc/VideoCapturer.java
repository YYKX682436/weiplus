package org.webrtc;

/* loaded from: classes15.dex */
public interface VideoCapturer {
    void changeCaptureFormat(int i17, int i18, int i19);

    void dispose();

    void initialize(org.webrtc.SurfaceTextureHelper surfaceTextureHelper, android.content.Context context, org.webrtc.CapturerObserver capturerObserver);

    boolean isScreencast();

    void startCapture(int i17, int i18, int i19);

    void stopCapture();
}
