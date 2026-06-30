package com.tencent.mm.wallet_core.ui.formview;

/* loaded from: classes9.dex */
public final class EditHintPasswdView extends android.widget.RelativeLayout implements android.view.View.OnFocusChangeListener, com.tenpay.android.wechat.MyKeyboardWindow.IMyKeyboardWindowActionEvent {

    /* renamed from: d, reason: collision with root package name */
    public com.tenpay.android.wechat.TenpaySecureEditText f214143d;

    /* renamed from: e, reason: collision with root package name */
    public int f214144e;

    /* renamed from: f, reason: collision with root package name */
    public final int f214145f;

    /* renamed from: g, reason: collision with root package name */
    public int f214146g;

    /* renamed from: h, reason: collision with root package name */
    public int f214147h;

    /* renamed from: i, reason: collision with root package name */
    public int f214148i;

    /* renamed from: m, reason: collision with root package name */
    public qp5.t f214149m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View.OnFocusChangeListener f214150n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f214151o;

    /* renamed from: p, reason: collision with root package name */
    public long f214152p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f214153q;

    /* renamed from: r, reason: collision with root package name */
    public int f214154r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f214155s;

    public EditHintPasswdView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f214143d = null;
        this.f214144e = 6;
        this.f214145f = 1;
        this.f214146g = com.tencent.mm.R.drawable.f481376rn;
        this.f214147h = 1;
        this.f214149m = null;
        this.f214150n = null;
        this.f214151o = "";
        this.f214152p = 0L;
        this.f214153q = "";
        this.f214154r = 0;
        this.f214155s = false;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.tencent.mm.plugin.wxpay.j.f188583f, i17, 0);
        this.f214145f = obtainStyledAttributes.getInteger(3, 1);
        this.f214146g = obtainStyledAttributes.getResourceId(0, com.tencent.mm.R.drawable.f481376rn);
        this.f214147h = obtainStyledAttributes.getInteger(1, 1);
        this.f214148i = obtainStyledAttributes.getInteger(2, 1);
        obtainStyledAttributes.recycle();
        b(context);
        com.tenpay.android.wechat.TenpaySecureEditText.setSalt(com.tencent.mm.wallet_core.ui.r1.B());
    }

    private int getNumberSize() {
        int i17 = this.f214145f;
        if (i17 == 1) {
            return 6;
        }
        if (i17 == 8) {
            return 4;
        }
        if (i17 == 3) {
            return 3;
        }
        if (i17 == 4) {
            return 4;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EditHintPasswdView", "hy: error or not set format. use default");
        return 6;
    }

    public void a() {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214143d;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.ClearInput();
        }
    }

    public void b(android.content.Context context) {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = (com.tenpay.android.wechat.TenpaySecureEditText) com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.bjf, (android.view.ViewGroup) this, true).findViewById(com.tencent.mm.R.id.pbn);
        this.f214143d = tenpaySecureEditText;
        tenpaySecureEditText.set993EnvCallBackListener(new qp5.q(this));
        if (this.f214146g == com.tencent.mm.R.drawable.f481376rn && com.tencent.mm.ui.bk.C()) {
            this.f214146g = com.tencent.mm.R.drawable.f481377ro;
        }
        int i17 = this.f214148i;
        if (i17 == 1) {
            this.f214146g = com.tencent.mm.R.color.a9e;
        }
        qp5.y.a(this.f214143d, this.f214145f, i17 == 1);
        this.f214144e = getNumberSize();
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText2 = this.f214143d;
        if (tenpaySecureEditText2 != null) {
            tenpaySecureEditText2.setBackgroundResource(this.f214146g);
            this.f214143d.setImeOptions(6);
            this.f214143d.setInputType(128);
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_revert_password_edittext_event_v2, false)) {
                this.f214143d.setIgnoreTextChangeEvent(false);
                this.f214143d.addTextChangedListener(new qp5.s(this, context));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.EditHintPasswdView", "set secureEditText ignore textchange");
                this.f214143d.setPasswdInputChangeListener(new qp5.r(this, context));
                this.f214143d.setIgnoreTextChangeEvent(true);
            }
            this.f214143d.setOnFocusChangeListener(this);
            this.f214143d.setClickable(false);
            this.f214143d.setLongClickable(false);
            setEnabled(true);
            setClickable(true);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.EditHintPasswdView", "hy: no edit text view");
        }
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_password_view_accessibility_security_switch, false);
        this.f214155s = fj6;
        com.tencent.mars.xlog.Log.i("MicroMsg.EditHintPasswdView", "isAccessibilitySecuritySwitchSvrOpen: %s", java.lang.Boolean.valueOf(fj6));
        if (!this.f214155s) {
            setContentDescription(context.getString(com.tencent.mm.R.string.l3p, "0"));
        }
        this.f214143d.setImportantForAccessibility(2);
    }

    public final boolean c() {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214143d;
        return tenpaySecureEditText != null && tenpaySecureEditText.getInputLength() == this.f214144e;
    }

    public void d(int i17) {
        this.f214148i = i17;
        if (i17 == 1) {
            this.f214146g = com.tencent.mm.R.color.a9e;
        } else if (com.tencent.mm.ui.bk.C()) {
            this.f214146g = com.tencent.mm.R.drawable.f481377ro;
        } else {
            this.f214146g = com.tencent.mm.R.drawable.f481376rn;
        }
        this.f214143d.setBackgroundResource(this.f214146g);
        qp5.y.a(this.f214143d, this.f214145f, this.f214148i == 1);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (!this.f214155s) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EditHintPasswdView", "onInitializeAccessibilityEvent accessibilitySecuritySwitchSvrOpen");
        if (accessibilityEvent.getText() == null) {
            return true;
        }
        accessibilityEvent.getText().clear();
        return true;
    }

    public com.tenpay.android.wechat.TenpaySecureEditText getEditText() {
        return this.f214143d;
    }

    public int getEncrType() {
        return this.f214147h;
    }

    public int getFormat() {
        return this.f214145f;
    }

    public java.lang.String getMd5Value() {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214143d;
        if (tenpaySecureEditText != null) {
            return tenpaySecureEditText.getPasswordHash();
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.EditHintPasswdView", "hy: edit view is null");
        return "";
    }

    public qp5.t getOnEditInputValidListener() {
        return this.f214149m;
    }

    @Override // android.view.View
    public android.view.View.OnFocusChangeListener getOnFocusChangeListener() {
        return this.f214150n;
    }

    public int getPwdInputTextLength() {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214143d;
        if (tenpaySecureEditText != null) {
            return tenpaySecureEditText.getInputLength();
        }
        return 0;
    }

    public java.lang.String getPwdNonce() {
        return this.f214151o;
    }

    public long getPwdTimestamp() {
        return this.f214152p;
    }

    public java.lang.String getText() {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214143d;
        if (tenpaySecureEditText != null) {
            return qp5.z.a(this.f214147h, tenpaySecureEditText, this.f214152p, this.f214151o, this.f214153q);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.EditHintPasswdView", "hy: no edit view");
        return "";
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f214150n;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(this, z17);
        }
        if (this.f214149m != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EditHintPasswdView", "on Focus change");
            this.f214149m.onInputValidChange(c());
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (this.f214155s) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EditHintPasswdView", "onInitializeAccessibilityEvent accessibilitySecuritySwitchSvrOpen");
            if (accessibilityEvent.getText() != null) {
                accessibilityEvent.getText().clear();
            }
            if ((accessibilityEvent.getEventType() & 32768) == 32768) {
                com.tenpay.android.wechat.TenpayTTSUtil.init(getContext());
                com.tenpay.android.wechat.TenpayTTSUtil.speak(getContext().getString(com.tencent.mm.R.string.l3p, this.f214154r + ""));
            }
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.f214155s) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EditHintPasswdView", "onInitializeAccessibilityNodeInfo accessibilitySecuritySwitchSvrOpen");
            accessibilityNodeInfo.setText("");
            accessibilityNodeInfo.setContentDescription("");
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                accessibilityNodeInfo.setHintText("");
            }
            accessibilityNodeInfo.setFocusable(true);
        }
    }

    @Override // com.tenpay.android.wechat.MyKeyboardWindow.IMyKeyboardWindowActionEvent
    public int onKeyboardActionGetInputLength() {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214143d;
        if (tenpaySecureEditText != null) {
            return tenpaySecureEditText.getInputLength();
        }
        return -1;
    }

    @Override // com.tenpay.android.wechat.MyKeyboardWindow.IMyKeyboardWindowActionEvent
    public void onKeyboardActionWithCode(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EditHintPasswdView", "keyboard action");
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214143d;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.handlePwdKeyBoardEvent(i17);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int makeMeasureSpec;
        int i19;
        setMeasuredDimension(android.view.View.getDefaultSize(com.tencent.mm.sdk.platformtools.j.d(getContext(), 960.0f), i17), android.view.View.getDefaultSize(com.tencent.mm.sdk.platformtools.j.d(getContext(), 720.0f), i18));
        if (this.f214148i == 0) {
            int measuredWidth = getMeasuredWidth();
            int i27 = this.f214144e;
            int i28 = i27 == 0 ? measuredWidth / 6 : measuredWidth / i27;
            i19 = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i28, 1073741824);
            setMeasuredDimension(android.view.View.getDefaultSize(measuredWidth, i19), android.view.View.getDefaultSize(i28, makeMeasureSpec));
        } else {
            int measuredWidth2 = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int b17 = i65.a.b(getContext(), 8);
            int i29 = this.f214144e;
            int i37 = (measuredWidth2 - (b17 * (i29 - 1))) / i29;
            if (measuredHeight < i37) {
                measuredHeight = i37;
            }
            int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth2 + 1, 1073741824);
            makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            setMeasuredDimension(android.view.View.getDefaultSize(measuredWidth2, makeMeasureSpec2), android.view.View.getDefaultSize(i37, makeMeasureSpec));
            i19 = makeMeasureSpec2;
        }
        super.onMeasure(i19, makeMeasureSpec);
    }

    public void setEditTextMaxLength(int i17) {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214143d;
        if (tenpaySecureEditText != null) {
            android.text.InputFilter[] filters = tenpaySecureEditText.getFilters();
            int length = filters.length + 1;
            android.text.InputFilter[] inputFilterArr = new android.text.InputFilter[length];
            for (int i18 = 0; i18 < filters.length; i18++) {
                inputFilterArr[i18] = filters[i18];
            }
            inputFilterArr[length - 1] = new android.text.InputFilter.LengthFilter(i17);
            this.f214143d.setFilters(inputFilterArr);
        }
    }

    public void setEditTextSize(float f17) {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214143d;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setTextSize(f17);
        }
    }

    public void setEncrType(int i17) {
        this.f214147h = i17;
    }

    public void setEncryptSoftSalt(java.lang.String str) {
        this.f214153q = str;
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.f214150n = onFocusChangeListener;
    }

    public void setOnInputValidListener(qp5.t tVar) {
        this.f214149m = tVar;
    }

    public void setPwdNonce(java.lang.String str) {
        this.f214151o = str;
    }

    public void setPwdTimestamp(long j17) {
        this.f214152p = j17;
    }

    public EditHintPasswdView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public EditHintPasswdView(android.content.Context context) {
        super(context);
        this.f214143d = null;
        this.f214144e = 6;
        this.f214145f = 1;
        this.f214146g = com.tencent.mm.R.drawable.f481376rn;
        this.f214147h = 1;
        this.f214149m = null;
        this.f214150n = null;
        this.f214151o = "";
        this.f214152p = 0L;
        this.f214153q = "";
        this.f214154r = 0;
        this.f214155s = false;
        b(context);
    }
}
