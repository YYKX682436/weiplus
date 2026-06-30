package com.tencent.mm.view;

/* loaded from: classes3.dex */
public class ExpandTextView extends android.widget.FrameLayout implements android.view.View.OnClickListener, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f213302d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMNeat7extView f213303e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f213304f;

    public ExpandTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f213304f = false;
    }

    public android.widget.TextView getExpandTextView() {
        return this.f213302d;
    }

    public com.tencent.mm.ui.widget.MMNeat7extView getTextView() {
        return this.f213303e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/ExpandTextView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!this.f213304f) {
            this.f213304f = true;
            this.f213303e.setMaxLines(Integer.MAX_VALUE);
            this.f213302d.animate().alpha(0.0f).setDuration(300L).setListener(new ym5.g0(this)).start();
        }
        yj0.a.h(this, "com/tencent/mm/view/ExpandTextView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f213303e = new com.tencent.mm.ui.widget.MMNeat7extView(getContext());
        addView(this.f213303e, new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.f213302d = new android.widget.TextView(getContext());
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 85;
        addView(this.f213302d, layoutParams);
        this.f213302d.setOnClickListener(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (this.f213304f) {
            return;
        }
        ks5.a i19 = this.f213303e.i(getMeasuredWidth(), getMeasuredHeight());
        if (i19 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ExpandTextView", "layout is null!");
            this.f213302d.setVisibility(8);
        } else if (((com.tencent.neattextview.textview.layout.NeatLayout) i19).L > 0) {
            this.f213302d.setVisibility(0);
        } else {
            this.f213302d.setVisibility(8);
        }
    }

    public void setExpandIconText(java.lang.String str) {
    }

    public void setExpandTextColor(int i17) {
        this.f213302d.setTextColor(i17);
    }

    public void setExpandTextSize(float f17) {
        this.f213302d.setTextSize(0, f17);
    }

    public void setLineSpacingExtra(int i17) {
        this.f213303e.setSpacingAdd(i17);
    }

    public void setMaxLines(int i17) {
        this.f213303e.setMaxLines(i17);
    }

    public void setOnExpandListener(ym5.h0 h0Var) {
    }

    public void setTextColor(int i17) {
        this.f213303e.setTextColor(i17);
    }

    public void setTextSize(float f17) {
        this.f213303e.l(0, f17);
    }

    public ExpandTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f213304f = false;
    }
}
