package com.tencent.mm.ui.widget.textview;

@java.lang.Deprecated
/* loaded from: classes5.dex */
public class MMAutoAdjustTextView extends android.widget.TextView {

    /* renamed from: d, reason: collision with root package name */
    public float f212528d;

    /* renamed from: e, reason: collision with root package name */
    public float f212529e;

    public MMAutoAdjustTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f463103j);
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
        this.f212528d = getTextSize();
        getContext();
        this.f212529e = com.tencent.mm.ui.zk.f212638b;
        new android.graphics.Paint().set(getPaint());
    }

    public final void a(java.lang.String str, int i17) {
        if (i17 <= 0) {
            return;
        }
        measure(0, android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        int measuredWidth = getMeasuredWidth();
        while (measuredWidth > i17) {
            float f17 = this.f212528d - com.tencent.mm.ui.zk.f(getContext());
            this.f212528d = f17;
            setTextSize(0, f17 * this.f212529e);
            measure(0, android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            measuredWidth = getMeasuredWidth();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        if (i17 != i19) {
            a(getText().toString(), i17);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        super.onTextChanged(charSequence, i17, i18, i19);
        a(charSequence.toString(), getWidth());
    }

    public MMAutoAdjustTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f463103j);
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
        this.f212528d = getTextSize();
        getContext();
        this.f212529e = com.tencent.mm.ui.zk.f212638b;
        new android.graphics.Paint().set(getPaint());
    }
}
