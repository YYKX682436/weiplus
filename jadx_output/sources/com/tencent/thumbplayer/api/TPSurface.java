package com.tencent.thumbplayer.api;

/* loaded from: classes16.dex */
public final class TPSurface extends com.tencent.thumbplayer.core.player.TPNativePlayerSurface {
    private com.tencent.thumbplayer.core.player.ITPNativePlayerSurfaceCallback mITPSurfaceCallback;
    private com.tencent.thumbplayer.api.ITPSurfaceListener mPlayerSurfaceListener;

    public TPSurface(android.graphics.SurfaceTexture surfaceTexture) {
        super(surfaceTexture);
        this.mPlayerSurfaceListener = null;
        com.tencent.thumbplayer.core.player.ITPNativePlayerSurfaceCallback iTPNativePlayerSurfaceCallback = new com.tencent.thumbplayer.core.player.ITPNativePlayerSurfaceCallback() { // from class: com.tencent.thumbplayer.api.TPSurface.1
            @Override // com.tencent.thumbplayer.core.player.ITPNativePlayerSurfaceCallback
            public void onFlush() {
                com.tencent.thumbplayer.api.ITPSurfaceListener iTPSurfaceListener = com.tencent.thumbplayer.api.TPSurface.this.mPlayerSurfaceListener;
                if (iTPSurfaceListener != null) {
                    iTPSurfaceListener.onFlush();
                }
            }

            @Override // com.tencent.thumbplayer.core.player.ITPNativePlayerSurfaceCallback
            public void onRenderInfo(com.tencent.thumbplayer.core.player.TPNativePlayerSurfaceRenderInfo tPNativePlayerSurfaceRenderInfo) {
                com.tencent.thumbplayer.api.ITPSurfaceListener iTPSurfaceListener = com.tencent.thumbplayer.api.TPSurface.this.mPlayerSurfaceListener;
                if (iTPSurfaceListener != null) {
                    iTPSurfaceListener.onRenderInfo(com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.convert2TPPlayerSurfaceRenderInfo(tPNativePlayerSurfaceRenderInfo));
                }
            }

            @Override // com.tencent.thumbplayer.core.player.ITPNativePlayerSurfaceCallback
            public void onVideoPacket(com.tencent.thumbplayer.core.common.TPVideoPacket tPVideoPacket, long j17) {
                com.tencent.thumbplayer.api.ITPSurfaceListener iTPSurfaceListener = com.tencent.thumbplayer.api.TPSurface.this.mPlayerSurfaceListener;
                if (iTPSurfaceListener != null) {
                    iTPSurfaceListener.onVideoPacket(com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.convert2TPVideoPacketBuffer(tPVideoPacket), j17);
                }
            }
        };
        this.mITPSurfaceCallback = iTPNativePlayerSurfaceCallback;
        super.setTPSurfaceCallback(iTPNativePlayerSurfaceCallback);
    }

    @Override // android.view.Surface
    public void finalize() {
        release();
        super.finalize();
    }

    public void setSurfaceListener(com.tencent.thumbplayer.api.ITPSurfaceListener iTPSurfaceListener) {
        this.mPlayerSurfaceListener = iTPSurfaceListener;
    }
}
