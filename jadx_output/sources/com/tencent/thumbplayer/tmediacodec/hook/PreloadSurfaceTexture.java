package com.tencent.thumbplayer.tmediacodec.hook;

/* loaded from: classes14.dex */
public final class PreloadSurfaceTexture extends android.graphics.SurfaceTexture {
    private com.tencent.thumbplayer.tmediacodec.hook.PreloadSurfaceTexture.ActionCallback mActionCallback;

    /* loaded from: classes14.dex */
    public interface ActionCallback {
        void onReleased();
    }

    public PreloadSurfaceTexture(int i17) {
        super(i17);
    }

    @Override // android.graphics.SurfaceTexture
    public void release() {
        super.release();
        com.tencent.thumbplayer.tmediacodec.hook.PreloadSurfaceTexture.ActionCallback actionCallback = this.mActionCallback;
        if (actionCallback != null) {
            actionCallback.onReleased();
        }
    }

    public final void setActionCallback(com.tencent.thumbplayer.tmediacodec.hook.PreloadSurfaceTexture.ActionCallback actionCallback) {
        this.mActionCallback = actionCallback;
    }
}
