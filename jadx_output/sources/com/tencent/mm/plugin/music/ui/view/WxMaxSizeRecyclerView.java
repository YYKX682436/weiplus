package com.tencent.mm.plugin.music.ui.view;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\nB\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B#\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/music/ui/view/WxMaxSizeRecyclerView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "", "maxHeight", "Ljz5/f0;", "setMaxHeight", "maxWidth", "setMaxWidth", "getMaxHeight", "getMaxWidth", "Lwl3/u;", "marginClickListener", "setMarginClickListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-music_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WxMaxSizeRecyclerView extends com.tencent.mm.view.recyclerview.WxRecyclerView {

    /* renamed from: l2, reason: collision with root package name */
    public static final /* synthetic */ int f150851l2 = 0;

    /* renamed from: j2, reason: collision with root package name */
    public int f150852j2;

    /* renamed from: k2, reason: collision with root package name */
    public int f150853k2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WxMaxSizeRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        setOnTouchListener(new wl3.t(new android.view.GestureDetector(getContext(), new wl3.v(this))));
    }

    /* renamed from: getMaxHeight, reason: from getter */
    public final int getF150852j2() {
        return this.f150852j2;
    }

    /* renamed from: getMaxWidth, reason: from getter */
    public final int getF150853k2() {
        return this.f150853k2;
    }

    @Override // com.tencent.mm.view.recyclerview.WxRecyclerView, androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19 = this.f150852j2;
        if (i19 > 0) {
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(i19, Integer.MIN_VALUE);
        }
        int i27 = this.f150853k2;
        if (i27 > 0) {
            i17 = android.view.View.MeasureSpec.makeMeasureSpec(i27, Integer.MIN_VALUE);
        }
        super.onMeasure(i17, i18);
    }

    public final void setMarginClickListener(wl3.u marginClickListener) {
        kotlin.jvm.internal.o.g(marginClickListener, "marginClickListener");
    }

    public final void setMaxHeight(int i17) {
        this.f150852j2 = i17;
        invalidate();
        requestLayout();
    }

    public final void setMaxWidth(int i17) {
        this.f150853k2 = i17;
        invalidate();
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WxMaxSizeRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        setOnTouchListener(new wl3.t(new android.view.GestureDetector(getContext(), new wl3.v(this))));
    }
}
