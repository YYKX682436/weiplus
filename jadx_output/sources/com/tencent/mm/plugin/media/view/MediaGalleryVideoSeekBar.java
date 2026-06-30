package com.tencent.mm.plugin.media.view;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0014¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/media/view/MediaGalleryVideoSeekBar;", "Lcom/tencent/mm/pluginsdk/ui/tools/RedesignVideoPlayerSeekBarWithSeekbarAnimation;", "", "getLayoutId", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class MediaGalleryVideoSeekBar extends com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithSeekbarAnimation {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaGalleryVideoSeekBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void E(boolean z17) {
        android.view.View view = this.f162472e;
        float f17 = z17 ? 0.35f : 1.0f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/media/view/MediaGalleryVideoSeekBar", "disableOperation", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/media/view/MediaGalleryVideoSeekBar", "disableOperation", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f162472e.setEnabled(!z17);
        this.f162472e.setClickable(!z17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithSeekbarAnimation, com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAlphaAnimation, com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBarWithAnimation, com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar, com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar, com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ejs;
    }
}
