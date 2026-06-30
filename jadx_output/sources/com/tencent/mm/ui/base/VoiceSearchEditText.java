package com.tencent.mm.ui.base;

/* loaded from: classes8.dex */
public class VoiceSearchEditText extends com.tencent.mm.ui.widget.cedit.edit.EditTextCompatHeight {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f197724d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f197725e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View.OnClickListener f197726f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f197727g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f197728h;

    /* renamed from: i, reason: collision with root package name */
    public android.content.Context f197729i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f197730m;

    public VoiceSearchEditText(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f197724d = getResources().getDrawable(com.tencent.mm.R.drawable.b9v);
        this.f197725e = getResources().getDrawable(com.tencent.mm.R.drawable.ayf);
        this.f197727g = true;
        this.f197728h = false;
        this.f197730m = false;
        c(context);
    }

    public static void a(com.tencent.mm.ui.base.VoiceSearchEditText voiceSearchEditText) {
        if (voiceSearchEditText.getText().toString().equals("") && voiceSearchEditText.f197728h) {
            voiceSearchEditText.f197727g = true;
            voiceSearchEditText.setCompoundDrawables(null, voiceSearchEditText.getCompoundDrawables()[1], voiceSearchEditText.f197724d, voiceSearchEditText.getCompoundDrawables()[3]);
            return;
        }
        if (voiceSearchEditText.getText().toString().length() <= 0) {
            voiceSearchEditText.f197727g = false;
            voiceSearchEditText.setCompoundDrawables(null, voiceSearchEditText.getCompoundDrawables()[1], null, voiceSearchEditText.getCompoundDrawables()[3]);
        } else {
            voiceSearchEditText.setCompoundDrawables(null, voiceSearchEditText.getCompoundDrawables()[1], voiceSearchEditText.f197725e, voiceSearchEditText.getCompoundDrawables()[3]);
        }
    }

    public final void b() {
        this.f197727g = true;
        if (this.f197728h) {
            setCompoundDrawables(null, getCompoundDrawables()[1], this.f197724d, getCompoundDrawables()[3]);
        } else {
            if (getText().toString().length() <= 0) {
                setCompoundDrawables(null, getCompoundDrawables()[1], null, getCompoundDrawables()[3]);
                return;
            }
            setCompoundDrawables(null, getCompoundDrawables()[1], this.f197725e, getCompoundDrawables()[3]);
        }
    }

    public final void c(android.content.Context context) {
        this.f197729i = context;
        this.f197728h = false;
        android.graphics.drawable.Drawable drawable = this.f197724d;
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        android.graphics.drawable.Drawable drawable2 = this.f197725e;
        drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight());
        b();
        setOnTouchListener(new db5.p9(this));
        addTextChangedListener(new db5.q9(this));
        setOnFocusChangeListener(new db5.r9(this));
        if (context instanceof android.app.Activity) {
            android.view.View currentFocus = ((android.app.Activity) context).getCurrentFocus();
            if (currentFocus == null || currentFocus != this) {
                this.f197730m = false;
            } else {
                this.f197730m = true;
            }
        }
        requestFocus();
    }

    public void setNeedIcon(boolean z17) {
    }

    public void setOnContentClearListener(db5.s9 s9Var) {
    }

    public void setOnSearchClickListener(android.view.View.OnClickListener onClickListener) {
        this.f197726f = onClickListener;
        this.f197728h = true;
        b();
    }

    public VoiceSearchEditText(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f197724d = getResources().getDrawable(com.tencent.mm.R.drawable.b9v);
        this.f197725e = getResources().getDrawable(com.tencent.mm.R.drawable.ayf);
        this.f197727g = true;
        this.f197728h = false;
        this.f197730m = false;
        c(context);
    }
}
