package org.webrtc;

/* loaded from: classes7.dex */
public interface IRenderer {

    /* loaded from: classes7.dex */
    public interface OnCaptureListener {
        void onCapture(android.graphics.Bitmap bitmap);
    }

    org.webrtc.EglRenderer.OnFrameInGLEnv getFrameWithGLCallback();

    void init(org.webrtc.EglBase.Context context, org.webrtc.RendererCommon.RendererEvents rendererEvents);

    void init(org.webrtc.EglBase.Context context, org.webrtc.RendererCommon.RendererEvents rendererEvents, int[] iArr, org.webrtc.RendererCommon.GlDrawer glDrawer);

    void requestCaptureOnce(org.webrtc.IRenderer.OnCaptureListener onCaptureListener);

    void setFrameWithGLCallback(org.webrtc.EglRenderer.OnFrameInGLEnv onFrameInGLEnv);
}
