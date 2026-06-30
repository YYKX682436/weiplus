package com.tencent.mm.plugin.finder.video;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/video/FinderVideoSeekTimeView;", "Landroid/widget/LinearLayout;", "", "color", "Ljz5/f0;", "setTextColor", "setHintTextColor", "sec", "setSumTime", "setCurrentTime", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderVideoSeekTimeView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public int f130727d;

    /* renamed from: e, reason: collision with root package name */
    public int f130728e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f130729f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f130730g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderVideoSeekTimeView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f130727d = Integer.MIN_VALUE;
        this.f130728e = Integer.MIN_VALUE;
        android.widget.TextView textView = new android.widget.TextView(getContext());
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        this.f130729f = textView;
        android.widget.TextView textView2 = new android.widget.TextView(getContext());
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        this.f130730g = textView2;
        setOrientation(0);
        setGravity(17);
        addView(textView);
        addView(textView2);
        textView.setShadowLayer(6.0f, 0.0f, 0.0f, getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
        textView2.setShadowLayer(6.0f, 0.0f, 0.0f, getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
        b(attrs, 0);
    }

    public final java.lang.String a(int i17) {
        long j17 = i17;
        java.lang.String format = java.lang.String.format("%02d:%02d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(j17 / 60), java.lang.Long.valueOf(j17 % 60)}, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }

    public final void b(android.util.AttributeSet attributeSet, int i17) {
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, b92.w2.f18553j, i17, 0);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f130727d = obtainStyledAttributes.getColor(1, Integer.MIN_VALUE);
        this.f130728e = obtainStyledAttributes.getColor(0, Integer.MIN_VALUE);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            float f17 = dimensionPixelSize;
            this.f130729f.setTextSize(0, f17);
            this.f130730g.setTextSize(0, f17);
        }
        int i18 = this.f130727d;
        if (i18 != Integer.MIN_VALUE) {
            setTextColor(i18);
        }
        int i19 = this.f130728e;
        if (i19 != Integer.MIN_VALUE) {
            setHintTextColor(i19);
        }
        obtainStyledAttributes.recycle();
    }

    public final void setCurrentTime(int i17) {
        this.f130729f.setText(a(i17));
    }

    public final void setHintTextColor(int i17) {
        this.f130730g.setTextColor(i17);
    }

    public final void setSumTime(int i17) {
        this.f130730g.setText(" / ".concat(a(i17)));
    }

    public final void setTextColor(int i17) {
        this.f130729f.setTextColor(i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderVideoSeekTimeView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f130727d = Integer.MIN_VALUE;
        this.f130728e = Integer.MIN_VALUE;
        android.widget.TextView textView = new android.widget.TextView(getContext());
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        this.f130729f = textView;
        android.widget.TextView textView2 = new android.widget.TextView(getContext());
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        this.f130730g = textView2;
        setOrientation(0);
        setGravity(17);
        addView(textView);
        addView(textView2);
        textView.setShadowLayer(6.0f, 0.0f, 0.0f, getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
        textView2.setShadowLayer(6.0f, 0.0f, 0.0f, getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_3));
        b(attrs, i17);
    }
}
