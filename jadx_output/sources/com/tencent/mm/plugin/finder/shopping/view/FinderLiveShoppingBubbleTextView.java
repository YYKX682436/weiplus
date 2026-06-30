package com.tencent.mm.plugin.finder.shopping.view;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u001b\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011B#\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingBubbleTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "pad", "Ljz5/f0;", "setCompoundDrawablePadding", "Landroid/content/res/ColorStateList;", "tint", "setCompoundDrawableTintList", "Landroid/graphics/BlendMode;", "blendMode", "setCompoundDrawableTintBlendMode", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "xt2/v1", "xt2/w1", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveShoppingBubbleTextView extends androidx.appcompat.widget.AppCompatTextView {

    /* renamed from: g, reason: collision with root package name */
    public int f126310g;

    /* renamed from: h, reason: collision with root package name */
    public int f126311h;

    /* renamed from: i, reason: collision with root package name */
    public long f126312i;

    /* renamed from: m, reason: collision with root package name */
    public xt2.v1 f126313m;

    /* renamed from: n, reason: collision with root package name */
    public xt2.w1 f126314n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveShoppingBubbleTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f126310g = -1;
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("FinderLiveShoppingBubbleTextView", "clearCache: cache cleared");
        this.f126313m = null;
        this.f126314n = null;
        this.f126311h = 0;
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b();
        com.tencent.mars.xlog.Log.i("FinderLiveShoppingBubbleTextView", "onConfigurationChanged: cache cleared");
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19;
        int i27;
        java.lang.Object[] spans;
        if (this.f126310g == -1) {
            this.f126310g = ((java.lang.Number) ae2.in.f3712c3.r()).intValue();
        }
        if (!(this.f126310g == 1)) {
            super.onMeasure(i17, i18);
            return;
        }
        java.lang.CharSequence f131525i = getF131525i();
        if (f131525i == null) {
            f131525i = "";
        }
        float textSize = getTextSize();
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int size = android.view.View.MeasureSpec.getSize(i17);
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        int hashCode = f131525i.hashCode();
        int length = f131525i.length();
        android.text.Spanned spanned = f131525i instanceof android.text.Spanned ? (android.text.Spanned) f131525i : null;
        int length2 = (spanned == null || (spans = spanned.getSpans(0, f131525i.length(), java.lang.Object.class)) == null) ? 0 : spans.length;
        boolean C = com.tencent.mm.ui.bk.C();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f126312i >= 1000 || (i27 = this.f126311h) == 0) {
            android.graphics.drawable.Drawable[] compoundDrawables = getCompoundDrawables();
            kotlin.jvm.internal.o.f(compoundDrawables, "getCompoundDrawables(...)");
            int length3 = compoundDrawables.length;
            int i28 = 1;
            for (int i29 = 0; i29 < length3; i29++) {
                android.graphics.drawable.Drawable drawable = compoundDrawables[i29];
                i28 = (i28 * 31) + (drawable != null ? (((drawable.hashCode() * 31) + drawable.getIntrinsicWidth()) * 31) + drawable.getIntrinsicHeight() : 0);
            }
            int i37 = this.f126311h;
            if (i28 != i37 || i37 == 0) {
                this.f126311h = i28;
                this.f126312i = currentTimeMillis;
            }
            i19 = this.f126311h;
        } else {
            i19 = i27;
        }
        xt2.v1 v1Var = new xt2.v1(mode, size, mode2, size2, hashCode, length, length2, C, textSize, i19, getMaxLines(), getMinLines());
        if (!(kotlin.jvm.internal.o.b(this.f126313m, v1Var) && this.f126314n != null)) {
            super.onMeasure(i17, i18);
            this.f126313m = v1Var;
            this.f126314n = new xt2.w1(getMeasuredWidth(), getMeasuredHeight());
            getMeasuredWidth();
            getMeasuredHeight();
            return;
        }
        xt2.w1 w1Var = this.f126314n;
        kotlin.jvm.internal.o.d(w1Var);
        xt2.w1 w1Var2 = this.f126314n;
        kotlin.jvm.internal.o.d(w1Var2);
        setMeasuredDimension(w1Var.f457081a, w1Var2.f457082b);
        getMeasuredWidth();
        getMeasuredHeight();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablePadding(int i17) {
        super.setCompoundDrawablePadding(i17);
        b();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawableTintBlendMode(android.graphics.BlendMode blendMode) {
        super.setCompoundDrawableTintBlendMode(blendMode);
        b();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawableTintList(android.content.res.ColorStateList colorStateList) {
        super.setCompoundDrawableTintList(colorStateList);
        b();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        b();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2, android.graphics.drawable.Drawable drawable3, android.graphics.drawable.Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        b();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i17, int i18, int i19, int i27) {
        super.setCompoundDrawablesWithIntrinsicBounds(i17, i18, i19, i27);
        b();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveShoppingBubbleTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f126310g = -1;
    }
}
