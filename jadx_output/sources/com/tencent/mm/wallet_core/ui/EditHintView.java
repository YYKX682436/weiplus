package com.tencent.mm.wallet_core.ui;

@java.lang.Deprecated
/* loaded from: classes9.dex */
public class EditHintView extends android.widget.RelativeLayout implements android.view.View.OnFocusChangeListener {
    public android.app.DatePickerDialog A;
    public int B;
    public int C;
    public com.tencent.mm.ui.widget.dialog.j0 D;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View.OnFocusChangeListener f214070d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f214071e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f214072f;

    /* renamed from: g, reason: collision with root package name */
    public com.tenpay.android.wechat.TenpaySecureEditText f214073g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f214074h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f214075i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f214076m;

    /* renamed from: n, reason: collision with root package name */
    public int f214077n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f214078o;

    /* renamed from: p, reason: collision with root package name */
    public int f214079p;

    /* renamed from: q, reason: collision with root package name */
    public final int f214080q;

    /* renamed from: r, reason: collision with root package name */
    public int f214081r;

    /* renamed from: s, reason: collision with root package name */
    public final int f214082s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f214083t;

    /* renamed from: u, reason: collision with root package name */
    public int f214084u;

    /* renamed from: v, reason: collision with root package name */
    public final int f214085v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f214086w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f214087x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f214088y;

    /* renamed from: z, reason: collision with root package name */
    public int f214089z;

    public EditHintView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        boolean z17;
        this.f214075i = "";
        this.f214076m = "";
        this.f214077n = 1;
        this.f214078o = true;
        this.f214079p = -1;
        this.f214080q = 1;
        this.f214081r = -1;
        this.f214082s = -1;
        this.f214083t = false;
        this.f214084u = 1;
        this.f214085v = -1;
        this.f214086w = true;
        this.f214087x = true;
        this.f214088y = null;
        this.f214089z = 0;
        this.A = null;
        this.B = 0;
        this.C = 0;
        com.tencent.mm.wallet_core.ui.i iVar = new com.tencent.mm.wallet_core.ui.i(this);
        this.D = null;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.tencent.mm.plugin.wxpay.j.f188578a, i17, 0);
        int resourceId = obtainStyledAttributes.getResourceId(8, 0);
        if (resourceId != 0) {
            this.f214075i = context.getString(resourceId);
        }
        int resourceId2 = obtainStyledAttributes.getResourceId(13, 0);
        if (resourceId2 != 0) {
            this.f214076m = context.getString(resourceId2);
        }
        this.f214077n = obtainStyledAttributes.getInteger(4, 1);
        this.f214086w = obtainStyledAttributes.getBoolean(7, true);
        int i18 = obtainStyledAttributes.getInt(0, 19);
        this.f214078o = obtainStyledAttributes.getBoolean(2, true);
        this.f214079p = obtainStyledAttributes.getInteger(11, -1);
        int integer = obtainStyledAttributes.getInteger(6, 0);
        this.f214082s = integer;
        int integer2 = obtainStyledAttributes.getInteger(5, 5);
        int color = obtainStyledAttributes.getColor(10, com.tencent.mm.R.color.a0c);
        this.f214085v = color;
        int resourceId3 = obtainStyledAttributes.getResourceId(1, -1);
        int resourceId4 = obtainStyledAttributes.getResourceId(9, com.tencent.mm.R.drawable.f481402sd);
        this.f214080q = obtainStyledAttributes.getInteger(12, 1);
        boolean z18 = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f488720a53, (android.view.ViewGroup) this, true);
        this.f214073g = (com.tenpay.android.wechat.TenpaySecureEditText) inflate.findViewById(com.tencent.mm.R.id.h0c);
        this.f214071e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.o_q);
        this.f214072f = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f486387l26);
        this.f214074h = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.hco);
        this.f214073g.setImeOptions(integer2);
        switch (integer) {
            case 0:
            case 10:
                break;
            case 1:
                this.f214079p = 25;
                this.f214073g.setIsBankcardFormat(true);
                this.f214077n = 2;
                break;
            case 2:
            case 9:
                this.f214079p = 30;
                this.f214077n = 3;
                break;
            case 3:
                this.f214086w = false;
                this.f214073g.setIsValidThru(true);
                setOnClickListener(new com.tencent.mm.wallet_core.ui.h(this));
                break;
            case 4:
                this.f214079p = 4;
                this.f214077n = 2;
                break;
            case 5:
                this.f214079p = 18;
                this.f214077n = 4;
                break;
            case 6:
                this.f214079p = 6;
                this.f214071e.setVisibility(8);
                this.f214077n = 2;
                break;
            case 7:
            case 17:
                this.f214079p = 6;
                this.f214071e.setVisibility(8);
                this.f214073g.setIsPasswordFormat(true, true);
                this.f214073g.setImeOptions(6);
                this.f214077n = 128;
                break;
            case 8:
                this.f214077n = 32;
                break;
            case 11:
            default:
                this.f214077n = 1;
                break;
            case 12:
                this.f214079p = 12;
                this.f214073g.setIsMoneyAmountFormat(true);
                break;
            case 13:
            case 16:
                this.f214073g.setIsSecurityAnswerFormat(true);
                break;
            case 14:
                this.f214079p = 3;
                this.f214071e.setVisibility(8);
                this.f214073g.setIsCvvPaymentFormat(true);
                this.f214073g.setImeOptions(6);
                this.f214077n = 128;
                break;
            case 15:
                this.f214079p = 4;
                this.f214071e.setVisibility(8);
                this.f214073g.setIsCvv4PaymentFormat(true);
                this.f214073g.setImeOptions(6);
                this.f214077n = 128;
                break;
        }
        b();
        this.f214073g.setSingleLine(z18);
        if (!z18) {
            this.f214073g.setMaxLines(1073741823);
        }
        this.f214074h.setOnClickListener(iVar);
        this.f214073g.addTextChangedListener(new com.tencent.mm.wallet_core.ui.a(this));
        this.f214073g.setOnFocusChangeListener(this);
        java.lang.String str = this.f214075i;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f214073g.setHint(str);
        }
        java.lang.String str2 = this.f214076m;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            this.f214071e.setText(str2);
        }
        this.f214073g.setGravity(i18);
        int i19 = this.f214077n;
        if (i19 == 2) {
            this.f214073g.setKeyListener(new com.tencent.mm.wallet_core.ui.b(this));
        } else if (i19 == 4) {
            this.f214073g.setKeyListener(new com.tencent.mm.wallet_core.ui.c(this));
        } else if (i19 == 128) {
            this.f214073g.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
            this.f214073g.setKeyListener(new com.tencent.mm.wallet_core.ui.d(this));
            this.f214073g.setRawInputType(18);
        } else if (i19 == 3) {
            this.f214073g.setKeyListener(new com.tencent.mm.wallet_core.ui.e(this));
        } else {
            this.f214073g.setInputType(i19);
        }
        if (this.f214079p != -1) {
            z17 = false;
            this.f214073g.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(this.f214079p)});
        } else {
            z17 = false;
        }
        super.setEnabled(true);
        super.setClickable(true);
        if (!this.f214078o) {
            this.f214073g.setEnabled(z17);
            this.f214073g.setTextColor(getResources().getColor(color));
            this.f214073g.setFocusable(z17);
            this.f214073g.setClickable(z17);
            this.f214073g.setBackgroundResource(com.tencent.mm.R.drawable.f482190b84);
            setBackgroundResource(com.tencent.mm.R.drawable.bfj);
        }
        if (!this.f214086w) {
            this.f214083t = true;
            this.f214073g.setEnabled(z17);
            this.f214073g.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479310vq));
            this.f214073g.setFocusable(z17);
            this.f214073g.setClickable(z17);
            this.f214073g.setBackgroundResource(com.tencent.mm.R.drawable.f482190b84);
            setBackgroundResource(com.tencent.mm.R.drawable.f481306q2);
        } else {
            this.f214083t = z17;
            this.f214073g.setBackgroundResource(resourceId4);
            setBackgroundResource(com.tencent.mm.R.drawable.f482190b84);
        }
        if (resourceId3 > 0) {
            setBackgroundResource(resourceId3);
        }
        android.widget.TextView textView = this.f214071e;
        if (textView != null && this.f214081r != -1) {
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = this.f214081r;
            this.f214071e.setLayoutParams(layoutParams);
        }
        if (c01.z1.I()) {
            this.f214073g.setSecureEncrypt(new kp5.a(getEncryptType()));
        }
    }

    private int getEncryptType() {
        int i17 = this.f214082s;
        if (i17 == 1) {
            return 50;
        }
        if (i17 == 4) {
            return 30;
        }
        if (i17 == 6) {
            return 60;
        }
        if (i17 == 7) {
            return 20;
        }
        switch (i17) {
            case 13:
                return 40;
            case 14:
            case 15:
                return 30;
            case 16:
                return -20;
            case 17:
                return -10;
            default:
                return 0;
        }
    }

    private android.graphics.Rect getValidRectOfInfoIv() {
        android.graphics.Rect rect = new android.graphics.Rect();
        this.f214074h.getHitRect(rect);
        rect.left -= 50;
        rect.right += 50;
        rect.top -= 25;
        rect.bottom += 25;
        return rect;
    }

    private void setValStrForce(java.lang.String str) {
        android.text.method.KeyListener keyListener = this.f214073g.getKeyListener();
        this.f214073g.setKeyListener(null);
        setEnabled(false);
        setClickable(false);
        setValStr(str);
        this.f214073g.setKeyListener(keyListener);
    }

    public boolean a() {
        if (!this.f214086w && !this.f214078o) {
            return true;
        }
        int i17 = this.f214082s;
        if (i17 == 1) {
            return this.f214073g.isBankcardNum();
        }
        if (i17 == 12) {
            return this.f214073g.isMoneyAmount();
        }
        if (i17 != 17) {
            if (i17 == 4) {
                return this.f214073g.getInputLength() >= 1;
            }
            if (i17 == 5) {
                return this.f214073g.isAreaIDCardNum(this.f214084u);
            }
            if (i17 != 7) {
                return i17 != 8 ? i17 != 9 ? i17 != 14 ? i17 != 15 ? this.f214073g.getInputLength() >= this.f214080q : this.f214073g.getInputLength() == 4 : this.f214073g.getInputLength() == 3 : this.f214073g.isPhoneNum() : com.tencent.mm.sdk.platformtools.t8.Y0(this.f214073g.getText().toString());
            }
        }
        return this.f214073g.getInputLength() == 6;
    }

    public final void b() {
        int i17 = this.f214082s;
        if (i17 == 7 || i17 == 14 || i17 == 15) {
            return;
        }
        if (this.f214086w && !com.tencent.mm.sdk.platformtools.t8.K0(getText())) {
            this.f214074h.setVisibility(0);
            this.f214074h.setImageResource(com.tencent.mm.R.drawable.f481913aj3);
            return;
        }
        if (i17 == 1) {
            if (!this.f214087x) {
                this.f214074h.setVisibility(8);
                return;
            } else {
                this.f214074h.setVisibility(0);
                this.f214074h.setImageResource(com.tencent.mm.R.raw.wallet_scan_camera);
                return;
            }
        }
        if (i17 != 3 && i17 != 4 && i17 != 9 && i17 != 10) {
            this.f214074h.setVisibility(8);
        } else {
            this.f214074h.setVisibility(0);
            this.f214074h.setImageResource(com.tencent.mm.R.drawable.f482023bl2);
        }
    }

    public java.lang.String get3DesEncrptData() {
        return this.f214073g.get3DesEncrptData();
    }

    public java.lang.String getMD5Value() {
        java.lang.String obj;
        if (this.f214082s == 3) {
            java.lang.String str = this.f214088y;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            obj = str.replace("/", "");
        } else {
            obj = this.f214073g.getText().toString();
        }
        return com.tencent.mm.sdk.platformtools.w2.a(obj);
    }

    public java.lang.String getText() {
        switch (this.f214082s) {
            case 0:
            case 8:
            case 10:
                java.lang.String obj = this.f214073g.getText().toString();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                return obj == null ? "" : obj;
            case 1:
            case 13:
            case 16:
                com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214073g;
                com.tencent.mm.wallet_core.b.a().g();
                return tenpaySecureEditText.getEncryptDataWithHash(false, true);
            case 2:
            case 9:
                java.lang.String obj2 = this.f214073g.getText().toString();
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                return obj2 == null ? "" : obj2;
            case 3:
                java.lang.String str = this.f214088y;
                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str == null) {
                    str = "";
                }
                return str.replace("/", "");
            case 4:
            case 14:
            case 15:
                return this.f214073g.get3DesEncrptData();
            case 5:
                return this.f214073g.get3DesEncrptData();
            case 6:
                return this.f214073g.get3DesVerifyCode();
            case 7:
                com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText2 = this.f214073g;
                com.tencent.mm.wallet_core.b.a().g();
                return tenpaySecureEditText2.getEncryptDataWithHash(true, true);
            case 11:
            case 12:
            default:
                java.lang.String obj3 = this.f214073g.getText().toString();
                boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                return obj3 == null ? "" : obj3;
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f214070d;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(this, z17);
        }
        if (this.f214083t) {
            this.f214071e.setEnabled(true);
        } else {
            this.f214071e.setEnabled(false);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.f214086w) {
            if (!((this.f214074h.getVisibility() == 0) && getValidRectOfInfoIv().contains((int) motionEvent.getX(), (int) motionEvent.getY()))) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19 = this.f214082s;
        if (i19 == 7 || i19 == 17 || i19 == 14 || i19 == 15) {
            setMeasuredDimension(android.view.View.getDefaultSize(com.tencent.mm.sdk.platformtools.j.d(getContext(), 960.0f), i17), android.view.View.getDefaultSize(com.tencent.mm.sdk.platformtools.j.d(getContext(), 720.0f), i18));
            int measuredWidth = getMeasuredWidth();
            int i27 = (i19 == 7 || i19 == 17) ? measuredWidth / 6 : i19 == 14 ? measuredWidth / 3 : measuredWidth / 4;
            int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int makeMeasureSpec2 = android.view.View.MeasureSpec.makeMeasureSpec(i27, 1073741824);
            setMeasuredDimension(android.view.View.getDefaultSize(measuredWidth, makeMeasureSpec), android.view.View.getDefaultSize(i27, makeMeasureSpec2));
            i18 = makeMeasureSpec2;
            i17 = makeMeasureSpec;
        }
        super.onMeasure(i17, i18);
    }

    public void set3DesValStr(java.lang.String str) {
        if (this.f214082s != 1) {
            this.f214073g.setText(str);
            com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214073g;
            tenpaySecureEditText.setSelection(tenpaySecureEditText.getText().length());
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(str) || str.length() > 5) {
            this.f214073g.set3DesEncrptData(str);
            com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText2 = this.f214073g;
            tenpaySecureEditText2.setSelection(tenpaySecureEditText2.getText().length());
        } else {
            this.f214073g.setSelection(0);
            this.f214073g.set3DesEncrptData(str);
            this.f214079p = 24 - str.length();
            this.f214073g.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(this.f214079p)});
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z17) {
        super.setClickable(z17);
        this.f214078o = z17;
        int i17 = this.f214085v;
        if (z17) {
            this.f214073g.setEnabled(true);
            if (this.f214086w) {
                this.f214073g.setTextColor(getResources().getColor(i17));
            } else {
                this.f214073g.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479310vq));
            }
            this.f214073g.setFocusable(true);
            this.f214073g.setClickable(true);
            return;
        }
        this.f214073g.setEnabled(false);
        if (this.f214086w) {
            this.f214073g.setTextColor(getResources().getColor(i17));
        } else {
            this.f214073g.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479306vm));
        }
        this.f214073g.setFocusable(false);
        this.f214073g.setClickable(false);
    }

    public void setEditBG(int i17) {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214073g;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setBackgroundResource(i17);
        }
    }

    public void setEllipsize(android.text.TextUtils.TruncateAt truncateAt) {
        this.f214073g.setEllipsize(truncateAt);
    }

    @Override // android.view.View
    public void setEnabled(boolean z17) {
        super.setEnabled(z17);
        this.f214086w = z17;
        this.f214074h.setEnabled(true);
    }

    public void setEncryptType(int i17) {
        if (c01.z1.I()) {
            this.f214073g.setSecureEncrypt(new kp5.a(i17));
        }
    }

    public void setHintStr(java.lang.String str) {
        this.f214073g.setHint(str);
    }

    public void setIdentifyCardType(int i17) {
        this.f214084u = i17;
        if (i17 == 1) {
            this.f214073g.setKeyListener(new com.tencent.mm.wallet_core.ui.f(this));
        } else {
            this.f214073g.setInputType(1);
        }
    }

    public void setImeOptions(int i17) {
        this.f214073g.setImeOptions(i17);
    }

    public void setInfoIvVisible(int i17) {
        this.f214074h.setVisibility(i17);
    }

    public void setMaxLen(int i17) {
        if (i17 != -1) {
            this.f214079p = i17;
            this.f214073g.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(i17)});
        }
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    public void setOnEditorActionListener(android.widget.TextView.OnEditorActionListener onEditorActionListener) {
        this.f214073g.setOnEditorActionListener(onEditorActionListener);
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        super.setOnFocusChangeListener(onFocusChangeListener);
        this.f214070d = onFocusChangeListener;
    }

    public void setOnInfoListener(com.tencent.mm.wallet_core.ui.k kVar) {
    }

    public void setOnInputValidChangeListener(com.tencent.mm.wallet_core.ui.l lVar) {
    }

    public void setPreFilledStr(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f214072f.setText("");
            this.f214072f.setVisibility(8);
        } else {
            this.f214072f.setText(str);
            this.f214072f.setVisibility(0);
        }
    }

    public void setPreText(java.lang.String str) {
        android.text.method.KeyListener keyListener = this.f214073g.getKeyListener();
        this.f214073g.setInputType(1);
        this.f214073g.setKeyListener(null);
        setValStr(str);
        this.f214073g.setKeyListener(keyListener);
        this.f214089z = 4;
    }

    public void setShowScanCamera(boolean z17) {
        this.f214087x = z17;
        b();
    }

    public void setTipStr(java.lang.String str) {
        this.f214071e.setText(str);
    }

    public void setTipTextColor(int i17) {
        android.widget.TextView textView = this.f214071e;
        if (textView != null) {
            textView.setTextColor(i17);
        }
    }

    public void setTipWidth(int i17) {
        this.f214081r = com.tencent.mm.sdk.platformtools.j.d(getContext(), i17 * 1.0f);
        android.widget.TextView textView = this.f214071e;
        if (textView != null) {
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = this.f214081r;
            this.f214071e.setLayoutParams(layoutParams);
        }
    }

    public void setValStr(java.lang.String str) {
        if (this.f214082s != 1) {
            this.f214073g.setText(str);
            com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214073g;
            tenpaySecureEditText.setSelection(tenpaySecureEditText.getText().length());
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(str) || str.length() > 5) {
            this.f214073g.setText(str);
            com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText2 = this.f214073g;
            tenpaySecureEditText2.setSelection(tenpaySecureEditText2.getText().length());
        } else {
            this.f214073g.setSelection(0);
            this.f214073g.setBankcardTailNum(str);
            this.f214079p = 24 - str.length();
            this.f214073g.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(this.f214079p)});
        }
    }

    public EditHintView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
