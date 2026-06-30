package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class MMTabView extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f196913d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f196914e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f196915f;

    /* renamed from: g, reason: collision with root package name */
    public final int f196916g;

    /* renamed from: h, reason: collision with root package name */
    public int f196917h;

    public MMTabView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f196917h = 0;
        a();
    }

    public final void a() {
        this.f196917h = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.j_);
        java.lang.String d17 = com.tencent.mm.sdk.platformtools.m2.d();
        boolean j17 = com.tencent.mm.sdk.platformtools.m2.j();
        boolean equalsIgnoreCase = d17.equalsIgnoreCase("en");
        int q17 = j17 ? (int) (i65.a.q(getContext()) * i65.a.b(getContext(), 2)) : 0;
        android.widget.TextView textView = new android.widget.TextView(getContext());
        this.f196913d = textView;
        textView.setSingleLine();
        this.f196913d.setEllipsize(android.text.TextUtils.TruncateAt.END);
        this.f196913d.setTextColor(getResources().getColorStateList(com.tencent.mm.R.color.aaq));
        this.f196913d.setTextSize(0, i65.a.h(getContext(), com.tencent.mm.R.dimen.f479853h2));
        this.f196913d.setText("");
        if (j17) {
            android.widget.TextView textView2 = this.f196913d;
            textView2.setTextSize(0, textView2.getTextSize() + q17);
            this.f196913d.setTypeface(null, 0);
        } else if (equalsIgnoreCase) {
            this.f196913d.setTypeface(null, 1);
        }
        addView(this.f196913d);
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        this.f196914e = imageView;
        imageView.setBackgroundResource(com.tencent.mm.R.drawable.b8i);
        this.f196914e.setVisibility(4);
        addView(this.f196914e);
        android.widget.TextView textView3 = new android.widget.TextView(getContext());
        this.f196915f = textView3;
        textView3.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479549ab0));
        this.f196915f.setTextSize(1, 11.0f);
        this.f196915f.setBackgroundResource(com.tencent.mm.ui.tools.pd.a(getContext()));
        this.f196915f.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
        this.f196915f.setGravity(17);
        this.f196915f.setVisibility(4);
        addView(this.f196915f);
        setBackgroundResource(com.tencent.mm.R.drawable.bfk);
    }

    public java.lang.String getText() {
        return this.f196913d.getText().toString();
    }

    public java.lang.String getUnread() {
        return this.f196915f.getText().toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int i28 = i19 - i17;
        int i29 = i27 - i18;
        int measuredWidth = (i28 - this.f196913d.getMeasuredWidth()) / 2;
        int measuredWidth2 = this.f196913d.getMeasuredWidth() + measuredWidth;
        int measuredHeight = (i29 - this.f196913d.getMeasuredHeight()) / 2;
        this.f196913d.layout(measuredWidth, measuredHeight, measuredWidth2, this.f196913d.getMeasuredHeight() + measuredHeight);
        int i37 = this.f196917h + measuredWidth2;
        int measuredWidth3 = this.f196914e.getMeasuredWidth() + i37;
        int measuredHeight2 = (i29 - this.f196914e.getMeasuredHeight()) / 2;
        this.f196914e.layout(i37, measuredHeight2, measuredWidth3, this.f196914e.getMeasuredHeight() + measuredHeight2);
        if (measuredWidth - this.f196917h < this.f196915f.getMeasuredWidth()) {
            int measuredWidth4 = i28 - this.f196915f.getMeasuredWidth();
            int measuredWidth5 = this.f196915f.getMeasuredWidth() + measuredWidth4;
            int measuredHeight3 = (i29 - this.f196915f.getMeasuredHeight()) / 2;
            this.f196915f.layout(measuredWidth4, measuredHeight3, measuredWidth5, this.f196915f.getMeasuredHeight() + measuredHeight3);
            return;
        }
        int i38 = measuredWidth2 + this.f196917h;
        int measuredWidth6 = this.f196915f.getMeasuredWidth() + i38;
        int measuredHeight4 = (i29 - this.f196915f.getMeasuredHeight()) / 2;
        this.f196915f.layout(i38, measuredHeight4, measuredWidth6, this.f196915f.getMeasuredHeight() + measuredHeight4);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int size = (android.view.View.MeasureSpec.getSize(i17) - getPaddingLeft()) - getPaddingRight();
        int size2 = (android.view.View.MeasureSpec.getSize(i18) - getPaddingTop()) - getPaddingBottom();
        int makeMeasureSpec = android.view.View.MeasureSpec.getMode(i18) == Integer.MIN_VALUE ? android.view.View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE) : android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f196913d.measure(android.view.View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
        this.f196914e.measure(android.view.View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
        this.f196915f.measure(android.view.View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), makeMeasureSpec);
        setMeasuredDimension(size, size2);
    }

    public void setText(int i17) {
        this.f196913d.setText(i17);
    }

    public void setTextColor(int i17) {
        this.f196913d.setTextColor(i17);
    }

    public void setUnread(java.lang.String str) {
        int b17 = com.tencent.mm.ui.tools.pd.b(getContext(), java.lang.Integer.parseInt(str));
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f196915f.setVisibility(4);
        } else {
            this.f196915f.setVisibility(0);
            this.f196915f.post(new com.tencent.mm.ui.be(this, str, b17));
        }
    }

    public void setText(java.lang.String str) {
        this.f196913d.setText(str);
    }

    public MMTabView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f196917h = 0;
        a();
    }

    public MMTabView(android.content.Context context, int i17) {
        super(context);
        this.f196917h = 0;
        a();
        this.f196916g = i17;
        getUnread();
        la5.b.f317600a.d(this, getText(), getUnread(), i17);
    }
}
