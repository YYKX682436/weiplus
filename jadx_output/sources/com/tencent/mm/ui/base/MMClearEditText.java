package com.tencent.mm.ui.base;

/* loaded from: classes5.dex */
public class MMClearEditText extends android.widget.EditText {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f197324i = 0;

    /* renamed from: d, reason: collision with root package name */
    public db5.u1 f197325d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.drawable.Drawable f197326e;

    /* renamed from: f, reason: collision with root package name */
    public int f197327f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View.OnFocusChangeListener f197328g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View.OnTouchListener f197329h;

    public MMClearEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197326e = com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.drawable.c6x, getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5));
        this.f197327f = 0;
        this.f197328g = null;
        this.f197329h = new db5.t1(this);
        a(context);
    }

    public final void a(android.content.Context context) {
        if (this.f197326e == null) {
            this.f197326e = com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.drawable.c6x, getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5));
        }
        if (android.os.Build.VERSION.SDK_INT >= 35 && com.tencent.mm.ui.b4.b(getContext())) {
            setLocalePreferredLineHeightForMinimumUsed(false);
        }
        android.graphics.drawable.Drawable drawable = this.f197326e;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f197326e.getIntrinsicHeight());
        com.tencent.mm.ui.yk.a("MicroMsg.MMClearEditText", "imgX width %d height %d", java.lang.Integer.valueOf(this.f197326e.getIntrinsicWidth()), java.lang.Integer.valueOf(this.f197326e.getIntrinsicHeight()));
        b();
        setHeight(this.f197326e.getIntrinsicHeight() + (getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479898ib) * 5));
        setOnTouchListener(this.f197329h);
        addTextChangedListener(new db5.r1(this));
        super.setOnFocusChangeListener(new db5.s1(this));
    }

    public final void b() {
        if (getText().toString().equals("") || !isFocused()) {
            d();
            return;
        }
        db5.u1 u1Var = this.f197325d;
        if (u1Var != null) {
            ((db5.i2) u1Var).a(true);
        }
        setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.f197326e, getCompoundDrawables()[3]);
    }

    public void c(java.lang.String str) {
        int selectionStart = getSelectionStart();
        setText(pg5.d.a(getContext(), str));
        int length = getText().length() - str.length();
        if (length <= 0) {
            setSelection(selectionStart);
            return;
        }
        int i17 = selectionStart + length;
        if (i17 <= getText().length()) {
            setSelection(i17);
        }
    }

    public final void d() {
        db5.u1 u1Var = this.f197325d;
        if (u1Var != null) {
            ((db5.i2) u1Var).a(false);
        }
        setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], null, getCompoundDrawables()[3]);
    }

    public android.view.View.OnTouchListener getDefaultOnTouchListener() {
        return this.f197329h;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable instanceof android.widget.TextView.SavedState) {
            super.onRestoreInstanceState(android.view.View.BaseSavedState.EMPTY_STATE);
        } else {
            super.onRestoreInstanceState(parcelable);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i17) {
        boolean onTextContextMenuItem = super.onTextContextMenuItem(i17);
        if (i17 == 16908322) {
            this.f197327f = 0;
            java.lang.String obj = getText().toString();
            try {
                c(obj);
            } catch (java.lang.IndexOutOfBoundsException unused) {
                com.tencent.mm.ui.yk.b("MicroMsg.MMClearEditText", "!!MMClearEditText Exception %d", java.lang.Integer.valueOf(this.f197327f));
                if (this.f197327f < 3) {
                    this.f197327f++;
                    c(" " + obj);
                } else {
                    com.tencent.mm.ui.yk.b("MicroMsg.MMClearEditText", "!!MMClearEditText, IndexOutOfBoundsException cannot fix", new java.lang.Object[0]);
                }
            }
        }
        return onTextContextMenuItem;
    }

    public void setClearBtnCallBcakListener(db5.u1 u1Var) {
        this.f197325d = u1Var;
    }

    public void setClearBtnListener(db5.v1 v1Var) {
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.f197328g = onFocusChangeListener;
    }

    public MMClearEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f197326e = com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.drawable.c6x, getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5));
        this.f197327f = 0;
        this.f197328g = null;
        this.f197329h = new db5.t1(this);
        a(context);
    }
}
