package com.tencent.mm.plugin.finder.live.widget.beauty;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R$\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R$\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R$\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007R0\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0007¨\u0006\""}, d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/beauty/FinderLiveBeautySlider;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "<set-?>", "z", "D", "getMinimum", "()D", "minimum", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getMaximum", "maximum", "B", "getDefault", "default", "Lkotlin/Function1;", "Ljz5/f0;", "C", "Lyz5/l;", "getValueChangedHandler", "()Lyz5/l;", "setValueChangedHandler", "(Lyz5/l;)V", "valueChangedHandler", "getValue", "value", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class FinderLiveBeautySlider extends androidx.constraintlayout.widget.ConstraintLayout {

    /* renamed from: A, reason: from kotlin metadata */
    public double maximum;

    /* renamed from: B, reason: from kotlin metadata */
    public double default;

    /* renamed from: C, reason: from kotlin metadata */
    public yz5.l valueChangedHandler;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar f117871v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.TextView f117872w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View f117873x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.Object f117874y;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public double minimum;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FinderLiveBeautySlider(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void A(double d17, double d18, double d19, double d27) {
        this.minimum = d17;
        this.maximum = d18;
        boolean z17 = d17 * d18 < 0.0d;
        com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar bothSidesSeekBar = this.f117871v;
        bothSidesSeekBar.setBothSidesMode(z17);
        double d28 = e06.p.d(d27, this.minimum, this.maximum);
        double d29 = this.minimum;
        double d37 = (d28 - d29) / (this.maximum - d29);
        bothSidesSeekBar.setProgress(a06.d.a(100 * d37));
        B(d28, d37);
        this.default = d19;
        double d38 = e06.p.d(d19, this.minimum, this.maximum);
        double d39 = this.minimum;
        double d47 = (d38 - d39) / (this.maximum - d39);
        android.view.View view = this.f117873x;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.f10915z = (float) d47;
        view.setLayoutParams(layoutParams2);
    }

    public final void B(double d17, double d18) {
        java.lang.String str;
        int a17 = a06.d.a(d17 * 100);
        if (a17 < 0) {
            str = java.lang.String.valueOf(a17);
        } else if (a17 > 0) {
            str = "+" + a17;
        } else {
            str = "0";
        }
        android.widget.TextView textView = this.f117872w;
        textView.setText(str);
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.f10915z = (float) d18;
        textView.setLayoutParams(layoutParams2);
    }

    public final double getDefault() {
        return this.default;
    }

    public final double getMaximum() {
        return this.maximum;
    }

    public final double getMinimum() {
        return this.minimum;
    }

    public final double getValue() {
        return this.minimum + ((this.f117871v.getProgress() / 100.0d) * (this.maximum - this.minimum));
    }

    public final yz5.l getValueChangedHandler() {
        return this.valueChangedHandler;
    }

    public final void setValueChangedHandler(yz5.l lVar) {
        this.valueChangedHandler = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveBeautySlider(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f117874y = context.getSystemService("vibrator");
        wm2.b bVar = new wm2.b(this);
        android.view.View.inflate(context, com.tencent.mm.R.layout.f488861e91, this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.vlg);
        com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar bothSidesSeekBar = (com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar) findViewById;
        bothSidesSeekBar.setMax(100);
        bothSidesSeekBar.setOnSeekBarChangeListener(bVar);
        kotlin.jvm.internal.o.f(findViewById, "apply(...)");
        this.f117871v = (com.tencent.mm.ui.widget.seekbar.BothSidesSeekBar) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.vlf);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f117872w = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.vld);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f117873x = findViewById3;
        this.maximum = 1.0d;
    }
}
