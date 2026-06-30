package org.webrtc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public interface CameraSession {

    /* loaded from: classes14.dex */
    public interface CreateSessionCallback {
        void onDone(org.webrtc.CameraSession cameraSession);

        void onFailure(org.webrtc.CameraSession.FailureType failureType, java.lang.String str);
    }

    /* loaded from: classes14.dex */
    public interface Events {
        void onCameraClosed(org.webrtc.CameraSession cameraSession);

        void onCameraDisconnected(org.webrtc.CameraSession cameraSession);

        void onCameraError(org.webrtc.CameraSession cameraSession, java.lang.String str);

        void onCameraOpening();

        void onFrameCaptured(org.webrtc.CameraSession cameraSession, org.webrtc.VideoFrame videoFrame);
    }

    /* loaded from: classes6.dex */
    public enum FailureType {
        ERROR,
        DISCONNECTED
    }

    static org.webrtc.VideoFrame.TextureBuffer createTextureBufferWithModifiedTransformMatrix(org.webrtc.TextureBufferImpl textureBufferImpl, boolean z17, int i17) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        if (z17) {
            matrix.preScale(-1.0f, 1.0f);
        }
        matrix.preRotate(i17);
        matrix.preTranslate(-0.5f, -0.5f);
        return textureBufferImpl.applyTransformMatrix(matrix, textureBufferImpl.getWidth(), textureBufferImpl.getHeight());
    }

    static int getDeviceOrientation(android.content.Context context) {
        int rotation = ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    void stop();
}
