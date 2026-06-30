package com.tencent.mm.plugin.game.media.background;

/* loaded from: classes15.dex */
public class GameFakeVideoView extends com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView {
    public GameFakeVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView
    public void G(android.graphics.SurfaceTexture surfaceTexture) {
        super.G(surfaceTexture);
        com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = this.f191460w;
        if (a4Var != null) {
            a4Var.q(getCurrentPosition(), getDuration());
        }
    }

    @Override // android.view.View
    public void setKeepScreenOn(boolean z17) {
        super.setKeepScreenOn(z17);
    }

    public GameFakeVideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    public GameFakeVideoView(android.content.Context context) {
        super(context, null);
    }
}
