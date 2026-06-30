package com.tencent.mm.plugin.recharge.ui.form;

/* loaded from: classes9.dex */
public final class MallFormView extends android.widget.LinearLayout implements android.view.View.OnFocusChangeListener, xn5.a0 {
    public int A;
    public java.lang.String B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f155161J;
    public int K;
    public boolean L;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f155162d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f155163e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.EditText f155164f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView f155165g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f155166h;

    /* renamed from: i, reason: collision with root package name */
    public ws3.q f155167i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View.OnFocusChangeListener f155168m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View.OnClickListener f155169n;

    /* renamed from: o, reason: collision with root package name */
    public ws3.b f155170o;

    /* renamed from: p, reason: collision with root package name */
    public int f155171p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f155172q;

    /* renamed from: r, reason: collision with root package name */
    public int f155173r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f155174s;

    /* renamed from: t, reason: collision with root package name */
    public int f155175t;

    /* renamed from: u, reason: collision with root package name */
    public int f155176u;

    /* renamed from: v, reason: collision with root package name */
    public int f155177v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f155178w;

    /* renamed from: x, reason: collision with root package name */
    public int f155179x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f155180y;

    /* renamed from: z, reason: collision with root package name */
    public int f155181z;

    public MallFormView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f155162d = null;
        this.f155163e = null;
        this.f155164f = null;
        this.f155165g = null;
        this.f155166h = null;
        this.f155167i = null;
        this.f155168m = null;
        this.f155169n = null;
        this.f155170o = null;
        this.f155171p = -1;
        this.f155172q = "";
        this.f155173r = 0;
        this.f155174s = "";
        this.f155175t = 8;
        this.f155176u = -1;
        this.f155177v = 4;
        this.f155178w = "";
        this.f155179x = 8;
        this.f155180y = "";
        this.f155181z = 19;
        this.A = com.tencent.mm.R.color.a0c;
        this.B = "";
        this.C = Integer.MAX_VALUE;
        this.D = 1;
        this.E = com.tencent.mm.R.drawable.f481981ap3;
        this.F = true;
        this.G = false;
        this.H = true;
        this.I = 1;
        this.f155161J = 5;
        this.K = com.tencent.mm.R.color.f479313vt;
        this.L = true;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.tencent.mm.plugin.wxpay.j.f188581d, i17, 0);
        this.f155171p = obtainStyledAttributes.getResourceId(17, this.f155171p);
        int resourceId = obtainStyledAttributes.getResourceId(23, 0);
        if (resourceId != 0) {
            this.f155172q = context.getString(resourceId);
        }
        this.f155176u = obtainStyledAttributes.getResourceId(14, this.f155176u);
        int resourceId2 = obtainStyledAttributes.getResourceId(21, 0);
        if (resourceId2 != 0) {
            this.f155178w = context.getString(resourceId2);
        }
        this.f155177v = obtainStyledAttributes.getInteger(15, this.f155177v);
        this.f155173r = obtainStyledAttributes.getInteger(25, this.f155173r);
        this.f155179x = obtainStyledAttributes.getInteger(22, this.f155179x);
        this.f155175t = obtainStyledAttributes.getInteger(20, this.f155175t);
        int resourceId3 = obtainStyledAttributes.getResourceId(18, 0);
        if (resourceId3 != 0) {
            this.f155174s = context.getString(resourceId3);
        }
        int resourceId4 = obtainStyledAttributes.getResourceId(8, 0);
        if (resourceId4 != 0) {
            this.f155180y = context.getString(resourceId4);
        }
        this.f155181z = obtainStyledAttributes.getInteger(7, this.f155181z);
        this.A = obtainStyledAttributes.getColor(13, this.A);
        int resourceId5 = obtainStyledAttributes.getResourceId(12, 0);
        if (resourceId5 != 0) {
            this.B = context.getString(resourceId5);
        }
        this.C = obtainStyledAttributes.getInteger(10, this.C);
        this.D = obtainStyledAttributes.getInteger(11, this.D);
        this.E = obtainStyledAttributes.getResourceId(2, this.E);
        this.F = obtainStyledAttributes.getBoolean(4, this.F);
        this.G = obtainStyledAttributes.getBoolean(3, this.G);
        this.H = obtainStyledAttributes.getBoolean(4, this.H);
        this.I = obtainStyledAttributes.getInteger(0, this.I);
        this.f155161J = obtainStyledAttributes.getInteger(1, this.f155161J);
        this.K = obtainStyledAttributes.getInteger(9, this.K);
        obtainStyledAttributes.recycle();
        iz5.a.g(null, this.f155171p > 0);
        setOrientation(1);
        android.view.View.inflate(context, this.f155171p, this);
        this.f155162d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485848jb1);
        this.f155163e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.j_h);
        this.f155164f = (android.widget.EditText) findViewById(com.tencent.mm.R.id.j9h);
        this.f155165g = (com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView) findViewById(com.tencent.mm.R.id.j9w);
        this.f155166h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485847jb0);
    }

    public final boolean a(android.view.View view, android.view.MotionEvent motionEvent) {
        if (view != null && view.getVisibility() == 0) {
            android.graphics.Rect rect = new android.graphics.Rect();
            view.getHitRect(rect);
            if (view == this.f155165g) {
                rect.left -= 50;
                rect.right += 50;
                rect.top -= 25;
                rect.bottom += 25;
            }
            if (rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return true;
            }
        }
        return false;
    }

    public boolean b() {
        android.widget.EditText editText = this.f155164f;
        if (editText == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletFormView", "hy: no content edit text. true as default");
            return true;
        }
        int length = editText.getText() == null ? 0 : this.f155164f.getText().length();
        if (length > this.C || length < this.D) {
            return false;
        }
        ws3.b bVar = this.f155170o;
        if (bVar == null) {
            return true;
        }
        ((ws3.c) bVar).getClass();
        return android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(vs3.b.a(getText().toString()));
    }

    public void c() {
        android.widget.EditText editText;
        if (this.f155165g != null && !com.tencent.mm.sdk.platformtools.t8.K0(getText()) && (editText = this.f155164f) != null && editText.isEnabled() && this.f155164f.isClickable() && this.f155164f.isFocusable() && this.f155164f.isFocused()) {
            this.f155165g.setToClearState(new ws3.l(this));
            return;
        }
        com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView walletIconImageView = this.f155165g;
        if (walletIconImageView != null) {
            walletIconImageView.t();
        }
    }

    public android.widget.EditText getContentEditText() {
        return this.f155164f;
    }

    public ws3.a getEventDelegate() {
        return null;
    }

    public com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView getInfoIv() {
        return this.f155165g;
    }

    public int getInputLength() {
        android.widget.EditText editText = this.f155164f;
        if (editText != null) {
            return editText.getText().length();
        }
        return 0;
    }

    public ws3.q getInputValidChangeListener() {
        return this.f155167i;
    }

    public android.text.method.KeyListener getKeyListener() {
        android.widget.EditText editText = this.f155164f;
        if (editText != null) {
            return editText.getKeyListener();
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.WalletFormView", "hy: no content et");
        return null;
    }

    public ws3.b getLogicDelegate() {
        return this.f155170o;
    }

    public int getMaxInputLength() {
        return this.C;
    }

    public int getMinInputLength() {
        return this.D;
    }

    public android.widget.TextView getPrefilledTv() {
        return this.f155163e;
    }

    public java.lang.String getText() {
        android.widget.EditText editText = this.f155164f;
        if (editText == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletFormView", "hy: no content et. return nil");
            return "";
        }
        java.lang.String obj = editText.getText().toString();
        ws3.b bVar = this.f155170o;
        if (bVar == null) {
            return obj;
        }
        bVar.getClass();
        ((ws3.c) this.f155170o).getClass();
        return obj == null ? "" : obj.replaceAll(" ", "");
    }

    public android.widget.TextView getTipsTv() {
        return this.f155166h;
    }

    public android.widget.TextView getTitleTv() {
        return this.f155162d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        if (getTitleTv() != null) {
            getTitleTv().setText(this.f155172q);
            getTitleTv().setVisibility(this.f155173r);
        }
        if (getPrefilledTv() != null) {
            getPrefilledTv().setText(this.f155174s);
            getPrefilledTv().setVisibility(this.f155175t);
        }
        if (getInfoIv() != null) {
            getInfoIv().setImageResource(this.f155176u);
            getInfoIv().setVisibility(this.f155177v);
        }
        if (getTipsTv() != null) {
            getTipsTv().setText(this.f155178w);
            getTipsTv().setVisibility(this.f155179x);
        }
        getContext();
        android.widget.EditText editText = this.f155164f;
        if (editText != null) {
            editText.setHint(this.f155180y);
            this.f155164f.setGravity(this.f155181z);
            this.f155164f.setTextColor(this.A);
            setText(this.B);
            this.f155164f.setBackgroundResource(this.E);
            this.f155164f.setEnabled(this.F);
            this.f155164f.setFocusable(this.H);
            this.f155164f.setClickable(this.G);
            this.f155164f.setHintTextColor(this.K);
            setImeOptions(this.f155161J);
            setInputType(this.I);
            this.f155164f.addTextChangedListener(new ws3.k(this));
            this.f155164f.setOnFocusChangeListener(this);
        }
        c();
        android.widget.EditText editText2 = this.f155164f;
        if (editText2 != null) {
            int i17 = this.I;
            if (i17 == 2) {
                editText2.setKeyListener(new ws3.m(this));
            } else if (i17 == 4) {
                editText2.setKeyListener(new ws3.n(this));
            } else if (i17 == 128) {
                editText2.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
                this.f155164f.setKeyListener(new ws3.o(this));
                this.f155164f.setRawInputType(18);
            } else if (i17 == 3) {
                editText2.setKeyListener(new ws3.p(this));
            } else {
                editText2.setInputType(i17);
            }
            if (this.C != -1) {
                this.f155164f.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(this.C)});
            }
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f155168m;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(this, z17);
        }
        if (b()) {
            android.widget.TextView textView = this.f155162d;
            if (textView != null) {
                textView.setEnabled(true);
            }
        } else {
            android.widget.TextView textView2 = this.f155162d;
            if (textView2 != null) {
                textView2.setEnabled(false);
            }
        }
        c();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        android.widget.EditText editText = this.f155164f;
        if (editText != null && a(editText, motionEvent) && !this.f155164f.isClickable()) {
            return true;
        }
        if (!a(this.f155165g, motionEvent) || motionEvent.getAction() != 1) {
            return false;
        }
        this.f155165g.performClick();
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    public void setEventDelegate(ws3.a aVar) {
    }

    public void setFilters(android.text.InputFilter[] inputFilterArr) {
        android.widget.EditText editText = this.f155164f;
        if (editText != null) {
            editText.setFilters(inputFilterArr);
        }
    }

    public void setHint(java.lang.String str) {
        android.widget.EditText editText = this.f155164f;
        if (editText != null) {
            editText.setHint(str);
        }
    }

    public void setImeOptions(int i17) {
        android.widget.EditText editText = this.f155164f;
        if (editText != null) {
            editText.setImeOptions(i17);
        }
    }

    public void setInputType(int i17) {
        android.widget.EditText editText = this.f155164f;
        if (editText != null) {
            editText.setInputType(i17);
        }
    }

    public void setKeyListener(android.text.method.KeyListener keyListener) {
        android.widget.EditText editText = this.f155164f;
        if (editText != null) {
            editText.setKeyListener(keyListener);
        }
    }

    public void setLogicDelegate(ws3.b bVar) {
        this.f155170o = bVar;
    }

    public void setMaxInputLength(int i17) {
        this.C = i17;
    }

    public void setMinInputLength(int i17) {
        this.D = i17;
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    public void setOnEditorActionListener(android.widget.TextView.OnEditorActionListener onEditorActionListener) {
        this.f155164f.setOnEditorActionListener(onEditorActionListener);
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.f155168m = onFocusChangeListener;
    }

    public void setOnInfoIvClickListener(android.view.View.OnClickListener onClickListener) {
        this.f155169n = onClickListener;
        if (getInfoIv() != null) {
            getInfoIv().setOnClickListener(this.f155169n);
        }
    }

    public void setOnInputValidChangeListener(ws3.q qVar) {
        this.f155167i = qVar;
    }

    public void setSelection(int i17) {
        android.widget.EditText editText = this.f155164f;
        if (editText != null) {
            editText.setSelection(i17);
        }
    }

    public void setText(java.lang.String str) {
        if (this.f155164f != null) {
            ws3.b bVar = this.f155170o;
            if (bVar != null) {
                bVar.getClass();
            }
            this.f155164f.setText(str);
            this.f155164f.setSelection(getInputLength());
        }
    }

    public MallFormView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
