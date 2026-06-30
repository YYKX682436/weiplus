package com.tencent.mm.ui.base;

/* loaded from: classes5.dex */
public class MMVisiblePasswordEditText extends com.tencent.mm.ui.widget.cedit.edit.EditTextCompatHeight {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f197636d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f197637e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f197638f;

    public MMVisiblePasswordEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197636d = getResources().getDrawable(com.tencent.mm.R.raw.login_showpassword_icon);
        this.f197637e = getResources().getDrawable(com.tencent.mm.R.raw.login_showpassword_icon_activa);
        this.f197638f = false;
        a(context);
    }

    public final void a(android.content.Context context) {
        android.graphics.drawable.Drawable drawable = this.f197636d;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        android.graphics.drawable.Drawable drawable2 = this.f197637e;
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        drawable.getIntrinsicWidth();
        drawable.getIntrinsicHeight();
        b();
        setHeight(drawable.getIntrinsicHeight() + (getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479898ib) * 5));
        setOnTouchListener(new db5.q8(this));
    }

    public final void b() {
        int selectionStart = getSelectionStart();
        int selectionEnd = getSelectionEnd();
        if (this.f197638f) {
            setInputType(1);
            setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.f197637e, getCompoundDrawables()[3]);
        } else {
            setInputType(129);
            setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.f197636d, getCompoundDrawables()[3]);
        }
        setSelection(selectionStart, selectionEnd);
    }

    public MMVisiblePasswordEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f197636d = getResources().getDrawable(com.tencent.mm.R.raw.login_showpassword_icon);
        this.f197637e = getResources().getDrawable(com.tencent.mm.R.raw.login_showpassword_icon_activa);
        this.f197638f = false;
        a(context);
    }
}
