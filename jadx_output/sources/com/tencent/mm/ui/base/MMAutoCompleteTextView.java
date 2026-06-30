package com.tencent.mm.ui.base;

/* loaded from: classes9.dex */
public class MMAutoCompleteTextView extends android.widget.AutoCompleteTextView {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f197309e = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f197310d;

    public MMAutoCompleteTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.graphics.drawable.Drawable drawable = getResources().getDrawable(com.tencent.mm.R.drawable.f481913aj3);
        this.f197310d = drawable;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        a();
        if (android.os.Build.VERSION.SDK_INT >= 35 && com.tencent.mm.ui.b4.b(getContext())) {
            setLocalePreferredLineHeightForMinimumUsed(false);
        }
        setOnTouchListener(new db5.f1(this));
        addTextChangedListener(new db5.g1(this));
        setOnFocusChangeListener(new db5.h1(this));
    }

    public final void a() {
        if (getText().toString().equals("") || !isFocused()) {
            setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], null, getCompoundDrawables()[3]);
            return;
        }
        setCompoundDrawables(getCompoundDrawables()[0], getCompoundDrawables()[1], this.f197310d, getCompoundDrawables()[3]);
    }

    public void setSpilter(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        addTextChangedListener(new db5.i1(this, str));
    }
}
