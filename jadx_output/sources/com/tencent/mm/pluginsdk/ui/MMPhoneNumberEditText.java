package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes8.dex */
public class MMPhoneNumberEditText extends com.tencent.mm.ui.widget.cedit.edit.EditTextCompatHeight {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f189776m = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.drawable.Drawable f189777d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.r1 f189778e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f189779f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f189780g;

    /* renamed from: h, reason: collision with root package name */
    public int f189781h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View.OnFocusChangeListener f189782i;

    public MMPhoneNumberEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f189780g = false;
        this.f189781h = 0;
        this.f189782i = null;
        a();
    }

    public final void a() {
        android.graphics.drawable.Drawable d17 = com.tencent.mm.ui.zk.d(getContext(), com.tencent.mm.R.attr.f_);
        this.f189777d = d17;
        d17.setBounds(0, 0, d17.getIntrinsicWidth(), this.f189777d.getIntrinsicHeight());
        this.f189777d.getIntrinsicWidth();
        this.f189777d.getIntrinsicHeight();
        b();
        setHeight(this.f189777d.getIntrinsicHeight() + (getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479898ib) * 5));
        clearFocus();
        setOnTouchListener(new com.tencent.mm.pluginsdk.ui.o1(this));
        addTextChangedListener(new com.tencent.mm.pluginsdk.ui.p1(this));
        super.setOnFocusChangeListener(new com.tencent.mm.pluginsdk.ui.q1(this));
    }

    public final void b() {
        if (getText().toString().equals("") || !(this.f189779f || hasFocus())) {
            setCompoundDrawablesWithIntrinsicBounds(getCompoundDrawables()[0], getCompoundDrawables()[1], (android.graphics.drawable.Drawable) null, getCompoundDrawables()[3]);
        } else {
            setCompoundDrawablesWithIntrinsicBounds(getCompoundDrawables()[0], getCompoundDrawables()[1], this.f189777d, getCompoundDrawables()[3]);
        }
    }

    public void c(java.lang.String str) {
        int selectionStart = getSelectionStart();
        com.tencent.mm.smiley.x1 Di = com.tencent.mm.smiley.x1.Di();
        getContext();
        setText(Di.Ri(str, true));
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
            this.f189781h = 0;
            java.lang.String obj = getText().toString();
            try {
                c(obj);
            } catch (java.lang.IndexOutOfBoundsException unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMClearEditText", "!!MMClearEditText Exception %d", java.lang.Integer.valueOf(this.f189781h));
                if (this.f189781h < 3) {
                    this.f189781h++;
                    c(" " + obj);
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MMClearEditText", "!!MMClearEditText, IndexOutOfBoundsException cannot fix");
                }
            }
        }
        return onTextContextMenuItem;
    }

    public void setCallback(com.tencent.mm.pluginsdk.ui.r1 r1Var) {
        this.f189778e = r1Var;
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.f189782i = onFocusChangeListener;
    }

    public MMPhoneNumberEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f189780g = false;
        this.f189781h = 0;
        this.f189782i = null;
        a();
    }
}
