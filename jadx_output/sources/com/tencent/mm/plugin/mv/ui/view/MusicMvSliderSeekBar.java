package com.tencent.mm.plugin.mv.ui.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMvSliderSeekBar;", "Lcom/tencent/mm/plugin/mv/ui/view/SliderSeekBar;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class MusicMvSliderSeekBar extends com.tencent.mm.plugin.mv.ui.view.SliderSeekBar {
    public MusicMvSliderSeekBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.tencent.mm.plugin.mv.ui.view.SliderSeekBar
    public void c() {
        int b17 = i65.a.b(getContext(), 16);
        this.f151741m = new com.tencent.mm.plugin.mv.ui.view.j4(this, g(com.tencent.mm.R.raw.music_mv_left_bar, b17), g(com.tencent.mm.R.raw.music_mv_left_bar, b17));
        this.f151742n = new com.tencent.mm.plugin.mv.ui.view.j4(this, g(com.tencent.mm.R.raw.music_mv_right_bar, b17), g(com.tencent.mm.R.raw.music_mv_right_bar, b17));
        this.C = true;
        postInvalidate();
    }

    @Override // com.tencent.mm.plugin.mv.ui.view.SliderSeekBar
    public void d() {
        super.d();
        this.f151743o = i65.a.b(getContext(), 16);
        this.f151754z = i65.a.b(getContext(), 16);
        this.f151736e = true;
    }

    public final android.graphics.drawable.Drawable g(int i17, int i18) {
        android.graphics.drawable.Drawable e17 = m95.a.e(getContext().getResources(), i17, (i18 * 1.0f) / getContext().getResources().getDrawable(i17).getIntrinsicWidth());
        kotlin.jvm.internal.o.f(e17, "getSVGDrawable(...)");
        return e17;
    }

    public MusicMvSliderSeekBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
