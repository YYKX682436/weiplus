package com.tencent.mm.plugin.topstory.ui.video;

/* loaded from: classes15.dex */
public class TopStoryVideoPlayTextureView extends com.tencent.mm.pluginsdk.ui.tools.SynchronizedVideoPlayTextureView {
    public TopStoryVideoPlayTextureView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.SynchronizedVideoPlayTextureView, com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView, com.tencent.mm.pluginsdk.ui.tools.f4
    public void stop() {
        s75.d.b(new com.tencent.mm.pluginsdk.ui.tools.i7(this), "player-stop");
    }

    public TopStoryVideoPlayTextureView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
