package com.tencent.mm.wepicker;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001@B'\b\u0007\u0012\u0006\u0010:\u001a\u000209\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;\u0012\b\b\u0002\u0010=\u001a\u00020\n¢\u0006\u0004\b>\u0010?R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010!\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010R0\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020#\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u00102\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0011\u00104\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b3\u0010\u000eR\u0011\u00108\u001a\u0002058F¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006A"}, d2 = {"Lcom/tencent/mm/wepicker/WePicker;", "Lcom/tencent/mm/wepicker/view/PickerView;", "", "h2", "F", "getTextSize", "()F", "setTextSize", "(F)V", "textSize", "", "i2", "I", "getTextColor", "()I", "setTextColor", "(I)V", "textColor", "j2", "getTextSideColor", "setTextSideColor", "textSideColor", "", "k2", "Z", "getTextSelectMedium", "()Z", "setTextSelectMedium", "(Z)V", "textSelectMedium", "l2", "getShowSize", "setShowSize", "showSize", "Lkotlin/Function1;", "Ljz5/f0;", "m2", "Lyz5/l;", "getListener", "()Lyz5/l;", "setListener", "(Lyz5/l;)V", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lmq5/a;", "n2", "Lmq5/a;", "getDrawListener", "()Lmq5/a;", "setDrawListener", "(Lmq5/a;)V", "drawListener", "getCurrentIndex", "currentIndex", "", "getCurrentValue", "()Ljava/lang/String;", "currentValue", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "lq5/h", "weui-native-android-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class WePicker extends com.tencent.mm.wepicker.view.PickerView {

    /* renamed from: g2, reason: collision with root package name */
    public int f214329g2;

    /* renamed from: h2, reason: collision with root package name and from kotlin metadata */
    public float textSize;

    /* renamed from: i2, reason: collision with root package name and from kotlin metadata */
    public int textColor;

    /* renamed from: j2, reason: collision with root package name and from kotlin metadata */
    public int textSideColor;

    /* renamed from: k2, reason: collision with root package name and from kotlin metadata */
    public boolean textSelectMedium;

    /* renamed from: l2, reason: collision with root package name and from kotlin metadata */
    public int showSize;

    /* renamed from: m2, reason: collision with root package name and from kotlin metadata */
    public yz5.l listener;

    /* renamed from: n2, reason: collision with root package name and from kotlin metadata */
    public mq5.a drawListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WePicker(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void g1(java.util.List list, int i17) {
        kotlin.jvm.internal.o.g(list, "list");
        post(new lq5.k(this, list, i17));
    }

    public final int getCurrentIndex() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        return ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).t();
    }

    public final java.lang.String getCurrentValue() {
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int t17 = ((androidx.recyclerview.widget.LinearLayoutManager) layoutManager).t();
        if (t17 == -1) {
            return "";
        }
        androidx.recyclerview.widget.f2 adapter = getAdapter();
        kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.wepicker.WePicker.WePickerAdapter");
        return (java.lang.String) ((lq5.h) adapter).f320474d.get(t17);
    }

    public final mq5.a getDrawListener() {
        return this.drawListener;
    }

    public final yz5.l getListener() {
        return this.listener;
    }

    public final int getShowSize() {
        return this.showSize;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final boolean getTextSelectMedium() {
        return this.textSelectMedium;
    }

    public final int getTextSideColor() {
        return this.textSideColor;
    }

    public final float getTextSize() {
        return this.textSize;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        mq5.a aVar = this.drawListener;
        if (aVar != null) {
            int measuredWidth = getMeasuredWidth();
            getMeasuredHeight();
            int i17 = this.f214329g2;
            yw3.t5 t5Var = (yw3.t5) aVar;
            float f17 = i17;
            com.tencent.mm.wepicker.WePicker wePicker = t5Var.f466892a;
            canvas.drawLine(0.0f, (wePicker.getShowSize() / 2) * f17, measuredWidth, (wePicker.getShowSize() / 2) * f17, t5Var.f466893b);
            float f18 = i17;
            canvas.drawLine(0.0f, ((wePicker.getShowSize() / 2) + 1) * f18, measuredWidth, ((wePicker.getShowSize() / 2) + 1) * f18, t5Var.f466893b);
        }
        super.onDraw(canvas);
        if (this.drawListener != null) {
            getMeasuredWidth();
            getMeasuredHeight();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        this.f214329g2 = android.view.View.MeasureSpec.getSize(i18) / this.showSize;
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i17), this.f214329g2 * this.showSize);
        androidx.recyclerview.widget.f2 adapter = getAdapter();
        lq5.h hVar = adapter instanceof lq5.h ? (lq5.h) adapter : null;
        if (hVar != null) {
            hVar.f320480m = this.f214329g2;
        }
        measureChildren(i17, i18);
    }

    public final void setDrawListener(mq5.a aVar) {
        this.drawListener = aVar;
    }

    public final void setListener(yz5.l lVar) {
        this.listener = lVar;
    }

    public final void setShowSize(int i17) {
        this.showSize = i17;
    }

    public final void setTextColor(int i17) {
        this.textColor = i17;
    }

    public final void setTextSelectMedium(boolean z17) {
        this.textSelectMedium = z17;
    }

    public final void setTextSideColor(int i17) {
        this.textSideColor = i17;
    }

    public final void setTextSize(float f17) {
        this.textSize = f17;
    }

    public /* synthetic */ WePicker(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WePicker(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        setWillNotDraw(false);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f463117x);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int i18 = obtainStyledAttributes.getInt(2, 5);
        this.showSize = i18;
        if (i18 % 2 != 0 && i18 >= 3) {
            int color = obtainStyledAttributes.getColor(4, -16777216);
            this.textColor = color;
            this.textSideColor = obtainStyledAttributes.getColor(5, color);
            this.textSelectMedium = false;
            this.textSize = obtainStyledAttributes.getDimension(6, 18 * getResources().getDisplayMetrics().density);
            setOffset(obtainStyledAttributes.getDimension(3, 0.0f));
            setMinScaleRate(obtainStyledAttributes.getDimension(1, 0.7f));
            setMinAlpha(obtainStyledAttributes.getDimension(0, 0.3f));
            obtainStyledAttributes.recycle();
            i(new lq5.e(this));
            return;
        }
        throw new java.lang.Throwable("showSize must be  odd number and must be bigger than 2");
    }
}
