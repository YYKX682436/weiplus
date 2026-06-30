package com.tencent.mm.plugin.story.ui.view.gallery;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoPlayTextureView;", "Lcom/tencent/mm/pluginsdk/ui/tools/VideoPlayerTextureView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class StoryVideoPlayTextureView extends com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView {
    public StoryVideoPlayTextureView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setScaleType(com.tencent.mm.pluginsdk.ui.e1.COVER);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView
    public void G(android.graphics.SurfaceTexture surfaceTexture) {
        super.G(surfaceTexture);
        this.f191460w.q(getCurrentPosition(), getDuration());
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView, com.tencent.mm.pluginsdk.ui.tools.f4
    public void b(double d17) {
        if (this.f191454q) {
            a(d17, true);
            return;
        }
        com.tencent.mm.sdk.platformtools.Log.c(this.f191448h, hashCode() + " error seekTo " + this.f191454q + ' ', new java.lang.Object[0]);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView, android.view.View
    public void onMeasure(int i17, int i18) {
        setScaleType(com.tencent.mm.pluginsdk.ui.e1.COVER);
        int i19 = this.f191453p;
        com.tencent.mm.pluginsdk.ui.e1 e1Var = com.tencent.mm.pluginsdk.ui.e1.DEFAULT;
        com.tencent.mm.pluginsdk.ui.tools.o8 o8Var = this.f191447J;
        if (i19 == 90 || i19 == 270) {
            if (this.f191451n > this.f191452o) {
                o8Var.d(e1Var);
            }
        } else if (this.f191452o > this.f191451n) {
            o8Var.d(e1Var);
        }
        super.onMeasure(i17, i18);
    }

    public StoryVideoPlayTextureView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        setScaleType(com.tencent.mm.pluginsdk.ui.e1.COVER);
    }

    public StoryVideoPlayTextureView(android.content.Context context) {
        super(context, null);
        setScaleType(com.tencent.mm.pluginsdk.ui.e1.COVER);
    }
}
