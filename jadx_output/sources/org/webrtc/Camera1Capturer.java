package org.webrtc;

/* loaded from: classes16.dex */
public class Camera1Capturer extends org.webrtc.CameraCapturer {
    private final boolean captureToTexture;

    public Camera1Capturer(java.lang.String str, org.webrtc.CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, boolean z17) {
        super(str, cameraEventsHandler, new org.webrtc.Camera1Enumerator(z17));
        this.captureToTexture = z17;
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void changeCaptureFormat(int i17, int i18, int i19) {
        super.changeCaptureFormat(i17, i18, i19);
    }

    @Override // org.webrtc.CameraCapturer
    public void createCameraSession(org.webrtc.CameraSession.CreateSessionCallback createSessionCallback, org.webrtc.CameraSession.Events events, android.content.Context context, org.webrtc.SurfaceTextureHelper surfaceTextureHelper, java.lang.String str, int i17, int i18, int i19) {
        org.webrtc.Camera1Session.create(createSessionCallback, events, this.captureToTexture, context, surfaceTextureHelper, str, i17, i18, i19);
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void dispose() {
        super.dispose();
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void initialize(org.webrtc.SurfaceTextureHelper surfaceTextureHelper, android.content.Context context, org.webrtc.CapturerObserver capturerObserver) {
        super.initialize(surfaceTextureHelper, context, capturerObserver);
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ boolean isScreencast() {
        return super.isScreencast();
    }

    @Override // org.webrtc.CameraCapturer
    public /* bridge */ /* synthetic */ void printStackTrace() {
        super.printStackTrace();
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void startCapture(int i17, int i18, int i19) {
        super.startCapture(i17, i18, i19);
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void stopCapture() {
        super.stopCapture();
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.CameraVideoCapturer
    public /* bridge */ /* synthetic */ void switchCamera(org.webrtc.CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler) {
        super.switchCamera(cameraSwitchHandler);
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.CameraVideoCapturer
    public /* bridge */ /* synthetic */ void switchCamera(org.webrtc.CameraVideoCapturer.CameraSwitchHandler cameraSwitchHandler, java.lang.String str) {
        super.switchCamera(cameraSwitchHandler, str);
    }
}
