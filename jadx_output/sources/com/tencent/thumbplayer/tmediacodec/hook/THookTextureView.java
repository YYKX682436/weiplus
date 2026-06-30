package com.tencent.thumbplayer.tmediacodec.hook;

/* loaded from: classes14.dex */
public class THookTextureView extends android.view.TextureView {
    public static final java.lang.String TAG = "THookTextureView";
    private static com.tencent.thumbplayer.tmediacodec.hook.THookTextureView.SurfaceTextureHookCallback sHookCallback;
    private final android.view.TextureView.SurfaceTextureListener mInnerSetListener;
    private android.view.TextureView.SurfaceTextureListener mOutSetListener;

    /* loaded from: classes14.dex */
    public interface SurfaceTextureHookCallback {
        boolean onSurfaceTextureDestroyedCalled(android.graphics.SurfaceTexture surfaceTexture);
    }

    public THookTextureView(android.content.Context context) {
        this(context, null, 0);
    }

    public static void setHookCallback(com.tencent.thumbplayer.tmediacodec.hook.THookTextureView.SurfaceTextureHookCallback surfaceTextureHookCallback) {
        sHookCallback = surfaceTextureHookCallback;
    }

    @Override // android.view.TextureView
    public final void setSurfaceTextureListener(android.view.TextureView.SurfaceTextureListener surfaceTextureListener) {
        this.mOutSetListener = surfaceTextureListener;
        super.setSurfaceTextureListener(this.mInnerSetListener);
    }

    public THookTextureView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public THookTextureView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.mInnerSetListener = new android.view.TextureView.SurfaceTextureListener() { // from class: com.tencent.thumbplayer.tmediacodec.hook.THookTextureView.1
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i18, int i19) {
                if (com.tencent.thumbplayer.tmediacodec.hook.THookTextureView.this.mOutSetListener != null) {
                    com.tencent.thumbplayer.tmediacodec.hook.THookTextureView.this.mOutSetListener.onSurfaceTextureAvailable(surfaceTexture, i18, i19);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surfaceTexture) {
                boolean z17 = false;
                boolean z18 = com.tencent.thumbplayer.tmediacodec.hook.THookTextureView.this.mOutSetListener == null || com.tencent.thumbplayer.tmediacodec.hook.THookTextureView.this.mOutSetListener.onSurfaceTextureDestroyed(surfaceTexture);
                if (com.tencent.thumbplayer.tmediacodec.hook.THookTextureView.sHookCallback == null) {
                    com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(com.tencent.thumbplayer.tmediacodec.hook.THookTextureView.TAG, this + ", onSurfaceTextureDestroyed surfaceTexture:" + surfaceTexture + " result:" + z18);
                    return z18;
                }
                if (z18 && com.tencent.thumbplayer.tmediacodec.hook.THookTextureView.sHookCallback.onSurfaceTextureDestroyedCalled(surfaceTexture)) {
                    z17 = true;
                }
                com.tencent.thumbplayer.tmediacodec.util.LogUtils.d(com.tencent.thumbplayer.tmediacodec.hook.THookTextureView.TAG, this + "onSurfaceTextureDestroyed surfaceTexture:" + surfaceTexture + " hookResult:" + z17 + "result:" + z18);
                return z17;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i18, int i19) {
                if (com.tencent.thumbplayer.tmediacodec.hook.THookTextureView.this.mOutSetListener != null) {
                    com.tencent.thumbplayer.tmediacodec.hook.THookTextureView.this.mOutSetListener.onSurfaceTextureSizeChanged(surfaceTexture, i18, i19);
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surfaceTexture) {
                if (com.tencent.thumbplayer.tmediacodec.hook.THookTextureView.this.mOutSetListener != null) {
                    com.tencent.thumbplayer.tmediacodec.hook.THookTextureView.this.mOutSetListener.onSurfaceTextureUpdated(surfaceTexture);
                }
            }
        };
        setSurfaceTextureListener(null);
    }
}
