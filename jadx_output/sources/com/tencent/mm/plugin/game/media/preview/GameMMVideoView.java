package com.tencent.mm.plugin.game.media.preview;

/* loaded from: classes4.dex */
public class GameMMVideoView extends com.tencent.mm.modelvideo.MMVideoView {
    public GameMMVideoView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public boolean P() {
        return false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public void T() {
        super.T();
    }

    public java.lang.String getFilePath() {
        return this.f71645l1;
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView
    public java.lang.String getMediaId() {
        return super.getMediaId();
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView, com.tencent.mm.pluginsdk.ui.AbstractVideoView, com.tencent.mm.pluginsdk.ui.tools.d4
    public void onSurfaceAvailable() {
    }

    @Override // com.tencent.mm.modelvideo.MMVideoView
    public void setFilepath(java.lang.String str) {
        super.setFilepath(str);
    }

    public GameMMVideoView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
