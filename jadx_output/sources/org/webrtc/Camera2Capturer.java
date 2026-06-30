package org.webrtc;

/* loaded from: classes16.dex */
public class Camera2Capturer extends org.webrtc.CameraCapturer {
    private final android.hardware.camera2.CameraManager cameraManager;
    private final android.content.Context context;

    public Camera2Capturer(android.content.Context context, java.lang.String str, org.webrtc.CameraVideoCapturer.CameraEventsHandler cameraEventsHandler) {
        super(str, cameraEventsHandler, new org.webrtc.Camera2Enumerator(context));
        this.context = context;
        this.cameraManager = (android.hardware.camera2.CameraManager) context.getSystemService("camera");
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void changeCaptureFormat(int i17, int i18, int i19) {
        super.changeCaptureFormat(i17, i18, i19);
    }

    @Override // org.webrtc.CameraCapturer
    public void createCameraSession(org.webrtc.CameraSession.CreateSessionCallback createSessionCallback, org.webrtc.CameraSession.Events events, android.content.Context context, org.webrtc.SurfaceTextureHelper surfaceTextureHelper, java.lang.String str, int i17, int i18, int i19) {
        org.webrtc.Camera2Session.create(createSessionCallback, events, context, this.cameraManager, surfaceTextureHelper, str, i17, i18, i19);
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
