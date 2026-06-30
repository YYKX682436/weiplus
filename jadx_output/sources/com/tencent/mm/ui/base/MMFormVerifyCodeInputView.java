package com.tencent.mm.ui.base;

/* loaded from: classes5.dex */
public class MMFormVerifyCodeInputView extends android.widget.LinearLayout implements xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f197372d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMClearEditText f197373e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f197374f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f197375g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f197376h;

    /* renamed from: i, reason: collision with root package name */
    public final int f197377i;

    /* renamed from: m, reason: collision with root package name */
    public final int f197378m;

    /* renamed from: n, reason: collision with root package name */
    public final int f197379n;

    /* renamed from: o, reason: collision with root package name */
    public final int f197380o;

    /* renamed from: p, reason: collision with root package name */
    public int f197381p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f197382q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View.OnFocusChangeListener f197383r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View.OnClickListener f197384s;

    public MMFormVerifyCodeInputView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f197377i = -1;
        this.f197378m = -1;
        this.f197379n = -1;
        this.f197380o = 60;
        this.f197381p = 60;
        this.f197383r = null;
        this.f197384s = null;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f463102i, i17, 0);
        this.f197378m = obtainStyledAttributes.getResourceId(1, -1);
        this.f197377i = obtainStyledAttributes.getResourceId(3, -1);
        this.f197379n = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId = obtainStyledAttributes.getResourceId(2, -1);
        obtainStyledAttributes.recycle();
        android.view.View.inflate(context, resourceId, this);
    }

    public void a() {
        this.f197375g.setVisibility(8);
        this.f197374f.setVisibility(0);
        this.f197374f.setText(getContext().getString(com.tencent.mm.R.string.gwu, java.lang.Integer.valueOf(this.f197380o)));
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f197382q;
        if (b4Var != null) {
            b4Var.d();
            this.f197382q.c(1000L, 1000L);
        } else if (getContext() != null) {
            com.tencent.mm.sdk.platformtools.b4 b4Var2 = new com.tencent.mm.sdk.platformtools.b4(getContext().getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new db5.k2(this), true);
            this.f197382q = b4Var2;
            b4Var2.c(1000L, 1000L);
        } else {
            com.tencent.mm.sdk.platformtools.b4 b4Var3 = this.f197382q;
            if (b4Var3 != null) {
                b4Var3.d();
            }
        }
    }

    public void b() {
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f197382q;
        if (b4Var != null) {
            b4Var.d();
        }
        this.f197373e.setText("");
        this.f197374f.setVisibility(8);
        this.f197381p = this.f197380o;
        this.f197375g.setVisibility(0);
    }

    public android.widget.EditText getContentEditText() {
        return this.f197373e;
    }

    public android.text.Editable getText() {
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText = this.f197373e;
        if (mMClearEditText != null) {
            return mMClearEditText.getText();
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
        return null;
    }

    public android.widget.TextView getTitleTextView() {
        return this.f197372d;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f197372d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.obc);
        this.f197373e = (com.tencent.mm.ui.base.MMClearEditText) findViewById(com.tencent.mm.R.id.d98);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.bxs);
        this.f197376h = findViewById;
        findViewById.setOnClickListener(new db5.g2(this));
        float f17 = j65.f.f297943g;
        if (i65.a.D(getContext()) || f17 > 1.1d) {
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.o8x);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/ui/base/MMFormVerifyCodeInputView", "prepareContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/ui/base/MMFormVerifyCodeInputView", "prepareContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.mm7);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById3, arrayList2.toArray(), "com/tencent/mm/ui/base/MMFormVerifyCodeInputView", "prepareContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/ui/base/MMFormVerifyCodeInputView", "prepareContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.hsz);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById4, arrayList3.toArray(), "com/tencent/mm/ui/base/MMFormVerifyCodeInputView", "prepareContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/ui/base/MMFormVerifyCodeInputView", "prepareContentView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f197374f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485474ht1);
            this.f197375g = (android.widget.Button) findViewById(com.tencent.mm.R.id.f485473ht0);
        } else {
            this.f197374f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o8x);
            this.f197375g = (android.widget.Button) findViewById(com.tencent.mm.R.id.mm7);
        }
        this.f197375g.setVisibility(0);
        android.widget.TextView textView = this.f197372d;
        if (textView == null || this.f197373e == null || this.f197374f == null || this.f197375g == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMFormVerifyCodeInputView", "titleTV : %s, contentET : %s, timerTv: %s, sendSmsBtn: %s", textView, this.f197373e, this.f197374f, this.f197375g);
        } else {
            int i17 = this.f197377i;
            if (i17 != -1) {
                textView.setText(i17);
            }
            int i18 = this.f197378m;
            if (i18 != -1) {
                this.f197373e.setHint(i18);
            }
            int i19 = this.f197379n;
            if (i19 != -1) {
                this.f197375g.setText(i19);
            }
        }
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText = this.f197373e;
        if (mMClearEditText != null) {
            mMClearEditText.setOnFocusChangeListener(new db5.h2(this));
            this.f197373e.setClearBtnCallBcakListener(new db5.i2(this));
        }
        android.widget.Button button = this.f197375g;
        if (button != null) {
            button.setOnClickListener(new db5.j2(this));
        }
    }

    public void setFocusListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.f197383r = onFocusChangeListener;
    }

    public void setHint(java.lang.String str) {
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText = this.f197373e;
        if (mMClearEditText != null) {
            mMClearEditText.setHint(str);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
        }
    }

    public void setImeOption(int i17) {
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText = this.f197373e;
        if (mMClearEditText != null) {
            mMClearEditText.setImeOptions(i17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
        }
    }

    public void setInputType(int i17) {
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText = this.f197373e;
        if (mMClearEditText != null) {
            mMClearEditText.setInputType(i17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
        }
    }

    public void setSendSmsBtnClickListener(android.view.View.OnClickListener onClickListener) {
        this.f197384s = onClickListener;
    }

    public void setSmsBtnText(int i17) {
        android.widget.Button button = this.f197375g;
        if (button != null) {
            button.setText(i17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMFormVerifyCodeInputView", "sendSmsBtn is null!");
        }
    }

    public void setText(java.lang.String str) {
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText = this.f197373e;
        if (mMClearEditText != null) {
            mMClearEditText.setText(str);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
        }
    }

    public void setTitle(java.lang.String str) {
        android.widget.TextView textView = this.f197372d;
        if (textView != null) {
            textView.setText(str);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMFormVerifyCodeInputView", "titleTV is null!");
        }
    }

    public void setHint(int i17) {
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText = this.f197373e;
        if (mMClearEditText != null) {
            mMClearEditText.setHint(i17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMFormVerifyCodeInputView", "contentET is null!");
        }
    }

    public void setSmsBtnText(java.lang.String str) {
        android.widget.Button button = this.f197375g;
        if (button != null) {
            button.setText(str);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMFormVerifyCodeInputView", "sendSmsBtn is null!");
        }
    }

    public void setTitle(int i17) {
        android.widget.TextView textView = this.f197372d;
        if (textView != null) {
            textView.setText(i17);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMFormVerifyCodeInputView", "titleTV is null!");
        }
    }

    public MMFormVerifyCodeInputView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
