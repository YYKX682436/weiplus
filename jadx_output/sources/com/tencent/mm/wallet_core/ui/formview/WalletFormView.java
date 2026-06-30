package com.tencent.mm.wallet_core.ui.formview;

/* loaded from: classes9.dex */
public final class WalletFormView extends android.widget.LinearLayout implements android.view.View.OnFocusChangeListener, xn5.a0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public java.lang.String E;
    public int F;
    public int G;
    public java.lang.String H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f214156J;
    public int K;
    public java.lang.String L;
    public int M;
    public int N;
    public int P;
    public int Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;

    /* renamed from: d, reason: collision with root package name */
    public qp5.k0 f214157d;

    /* renamed from: e, reason: collision with root package name */
    public qp5.j0 f214158e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f214159f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f214160g;

    /* renamed from: h, reason: collision with root package name */
    public com.tenpay.android.wechat.TenpaySecureEditText f214161h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView f214162i;

    /* renamed from: l1, reason: collision with root package name */
    public int f214163l1;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f214164m;

    /* renamed from: n, reason: collision with root package name */
    public qp5.i0 f214165n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View.OnFocusChangeListener f214166o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View.OnClickListener f214167p;

    /* renamed from: p0, reason: collision with root package name */
    public int f214168p0;

    /* renamed from: p1, reason: collision with root package name */
    public int f214169p1;

    /* renamed from: q, reason: collision with root package name */
    public rp5.b f214170q;

    /* renamed from: r, reason: collision with root package name */
    public int f214171r;

    /* renamed from: s, reason: collision with root package name */
    public int f214172s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f214173t;

    /* renamed from: u, reason: collision with root package name */
    public int f214174u;

    /* renamed from: v, reason: collision with root package name */
    public int f214175v;

    /* renamed from: w, reason: collision with root package name */
    public int f214176w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f214177x;

    /* renamed from: x0, reason: collision with root package name */
    public int f214178x0;

    /* renamed from: y, reason: collision with root package name */
    public int f214179y;

    /* renamed from: y0, reason: collision with root package name */
    public int f214180y0;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f214181z;

    public WalletFormView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f214159f = null;
        this.f214160g = null;
        this.f214161h = null;
        this.f214162i = null;
        this.f214164m = null;
        this.f214165n = null;
        this.f214166o = null;
        this.f214167p = null;
        this.f214170q = null;
        this.f214171r = 0;
        this.f214172s = 0;
        this.f214173t = false;
        this.f214174u = -1;
        this.f214175v = -1;
        this.f214176w = 100;
        this.f214177x = "";
        this.f214179y = 0;
        this.f214181z = "";
        this.A = 8;
        this.B = -1;
        this.C = -1;
        this.D = 4;
        this.E = "";
        this.F = 8;
        this.H = "";
        this.I = -1;
        this.f214156J = 19;
        this.K = com.tencent.mm.R.color.a0c;
        this.L = "";
        this.M = 0;
        this.N = Integer.MAX_VALUE;
        this.P = 1;
        this.Q = com.tencent.mm.R.drawable.f481981ap3;
        this.R = true;
        this.S = false;
        this.T = true;
        this.U = false;
        this.V = 1;
        this.W = 5;
        this.f214168p0 = com.tencent.mm.R.color.f479313vt;
        this.f214178x0 = 0;
        this.f214180y0 = 0;
        this.f214163l1 = 0;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.tencent.mm.plugin.wxpay.j.f188584g, i17, 0);
        this.f214174u = obtainStyledAttributes.getResourceId(23, this.f214174u);
        int resourceId = obtainStyledAttributes.getResourceId(30, 0);
        if (resourceId != 0) {
            this.f214177x = context.getString(resourceId);
        }
        this.G = obtainStyledAttributes.getDimensionPixelSize(32, -1);
        this.B = obtainStyledAttributes.getResourceId(20, this.B);
        this.C = obtainStyledAttributes.getColor(19, this.C);
        int resourceId2 = obtainStyledAttributes.getResourceId(28, 0);
        if (resourceId2 != 0) {
            this.E = context.getString(resourceId2);
        }
        this.D = obtainStyledAttributes.getInteger(21, this.D);
        this.f214179y = obtainStyledAttributes.getInteger(31, this.f214179y);
        this.F = obtainStyledAttributes.getInteger(29, this.F);
        this.A = obtainStyledAttributes.getInteger(27, this.A);
        int resourceId3 = obtainStyledAttributes.getResourceId(25, 0);
        if (resourceId3 != 0) {
            this.f214181z = context.getString(resourceId3);
        }
        int resourceId4 = obtainStyledAttributes.getResourceId(11, 0);
        if (resourceId4 != 0) {
            this.H = context.getString(resourceId4);
        }
        this.I = obtainStyledAttributes.getDimensionPixelSize(12, -1);
        this.f214156J = obtainStyledAttributes.getInteger(10, this.f214156J);
        this.K = obtainStyledAttributes.getColor(17, this.K);
        int resourceId5 = obtainStyledAttributes.getResourceId(16, 0);
        if (resourceId5 != 0) {
            this.L = context.getString(resourceId5);
        }
        this.M = obtainStyledAttributes.getInt(9, this.M);
        this.N = obtainStyledAttributes.getInteger(14, this.N);
        this.P = obtainStyledAttributes.getInteger(15, this.P);
        this.Q = obtainStyledAttributes.getResourceId(5, this.Q);
        this.R = obtainStyledAttributes.getBoolean(7, this.R);
        this.S = obtainStyledAttributes.getBoolean(6, this.S);
        this.T = obtainStyledAttributes.getBoolean(7, this.T);
        this.V = obtainStyledAttributes.getInteger(0, this.V);
        this.W = obtainStyledAttributes.getInteger(1, this.W);
        this.f214176w = obtainStyledAttributes.getInteger(18, this.f214176w);
        this.f214168p0 = obtainStyledAttributes.getInteger(13, this.f214168p0);
        this.f214175v = obtainStyledAttributes.getResourceId(24, this.f214175v);
        this.f214178x0 = obtainStyledAttributes.getInteger(33, 0);
        int integer = obtainStyledAttributes.getInteger(34, -1);
        this.f214180y0 = integer;
        if (this.f214178x0 == 1 && integer == -1) {
            this.f214180y0 = 4;
        }
        this.f214163l1 = obtainStyledAttributes.getResourceId(2, 0);
        obtainStyledAttributes.recycle();
        iz5.a.g(null, this.f214174u > 0);
        setOrientation(1);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f214177x) && this.f214177x.length() > 6) {
            android.view.View.inflate(context, this.f214175v, this);
        } else {
            android.view.View.inflate(context, this.f214174u, this);
        }
        this.f214159f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487682pf5);
        this.f214160g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.pel);
        this.f214161h = (com.tenpay.android.wechat.TenpaySecureEditText) findViewById(com.tencent.mm.R.id.pbn);
        this.f214162i = (com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView) findViewById(com.tencent.mm.R.id.pcg);
        this.f214164m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487681pf4);
    }

    public static void a(com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView, android.text.Editable editable) {
        java.lang.String str;
        boolean z17;
        qp5.j0 j0Var;
        int i17;
        int i18;
        int indexOf;
        walletFormView.getClass();
        java.lang.String obj = editable.toString();
        int indexOf2 = obj.indexOf(".");
        int length = obj.length();
        if (indexOf2 >= 0 && (indexOf = obj.indexOf(".", indexOf2 + 1)) >= 0) {
            g(walletFormView.f214161h, obj, indexOf, length);
            return;
        }
        int i19 = walletFormView.f214172s;
        if (i19 < 0 || indexOf2 < 0 || length - indexOf2 <= i19) {
            str = obj;
            z17 = false;
        } else {
            str = j(obj, i19 + indexOf2 + 1, length);
            z17 = true;
        }
        if (walletFormView.f214171r >= 0) {
            int selectionStart = walletFormView.f214161h.getSelectionStart();
            int i27 = walletFormView.f214171r;
            if (indexOf2 > i27) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (!(selectionStart == -1) && (i18 = indexOf2 - i27) > 0 && selectionStart - i18 >= 0) {
                    str = j(str, selectionStart - (indexOf2 - 7), selectionStart);
                    z17 = true;
                }
            } else {
                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if ((indexOf2 == -1) && length > i27 && selectionStart >= 0 && (i17 = selectionStart - (length - i27)) >= 0) {
                    str = j(str, i17, selectionStart);
                    z17 = true;
                }
            }
        }
        if (z17) {
            h(walletFormView.f214161h, obj, str);
        }
        if ((z17 && !obj.equals(str)) || (j0Var = walletFormView.f214158e) == null) {
            return;
        }
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = ((mp5.l) j0Var).f330489a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayKeyBoard", "afterTextChanged code: %s text:%s", java.lang.Integer.valueOf(wcPayKeyboard.K), obj);
        mp5.u uVar = wcPayKeyboard.H;
        if (uVar != null) {
            int i28 = wcPayKeyboard.K;
            o05.j jVar = ((ps4.f) uVar).f358150a;
            if (jVar != null) {
                jVar.b(i28, obj);
            }
        }
        wcPayKeyboard.K = 0;
    }

    public static boolean f(java.lang.String str, android.widget.EditText editText) {
        if (str != null && editText != null) {
            int i17 = -1;
            for (int i18 = 0; i18 < str.length() && '0' == str.charAt(i18); i18++) {
                i17 = i18;
            }
            if (i17 == 0 && str.length() > 1) {
                int i19 = i17 + 1;
                if (str.charAt(i19) != '.') {
                    g(editText, str, 0, i19);
                    return true;
                }
            }
            if (i17 > 0) {
                int i27 = i17 + 1;
                if (str.length() == i27) {
                    g(editText, str, 0, i17);
                } else if (str.charAt(i27) == '.') {
                    g(editText, str, 0, i17);
                } else {
                    g(editText, str, 0, i27);
                }
                return true;
            }
        }
        return false;
    }

    public static void g(android.widget.EditText editText, java.lang.String str, int i17, int i18) {
        if (editText == null) {
            return;
        }
        h(editText, str, j(str, i17, i18));
    }

    public static void h(android.widget.EditText editText, java.lang.String str, java.lang.String str2) {
        if (editText == null || com.tencent.mm.sdk.platformtools.t8.D0(str, str2)) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            o(editText, str, str2);
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new qp5.d0(editText, str, str2));
        }
    }

    public static void i(android.widget.EditText editText, java.lang.String str, int i17, int i18) {
        if (editText == null) {
            return;
        }
        java.lang.String j17 = j(str, i17, i18);
        if (com.tencent.mm.sdk.platformtools.t8.D0(str, j17)) {
            return;
        }
        int selectionStart = editText.getSelectionStart();
        int selectionEnd = editText.getSelectionEnd();
        if (com.tencent.mm.sdk.platformtools.t8.K0(j17)) {
            editText.setText("");
            return;
        }
        editText.setText(j17);
        if (selectionStart > j17.length()) {
            selectionStart = j17.length();
        }
        if (selectionEnd > j17.length()) {
            selectionEnd = j17.length();
        }
        editText.setSelection(selectionStart, selectionEnd);
    }

    public static java.lang.String j(java.lang.String str, int i17, int i18) {
        if (str == null) {
            return "";
        }
        if (i17 >= str.length() || i17 < 0) {
            return str;
        }
        if (i18 >= str.length()) {
            return str.substring(0, i17);
        }
        java.lang.String substring = str.substring(0, i17);
        java.lang.String substring2 = str.substring(i18, str.length());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (substring == null) {
            substring = "";
        }
        return substring.concat(substring2 != null ? substring2 : "");
    }

    public static void o(android.widget.EditText editText, java.lang.String str, java.lang.String str2) {
        int selectionStart = editText.getSelectionStart();
        int selectionEnd = editText.getSelectionEnd();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            editText.setText("");
            return;
        }
        editText.setText(str2);
        if (selectionStart > str2.length()) {
            selectionStart = str2.length();
        }
        if (selectionEnd > str2.length()) {
            selectionEnd = str2.length();
        }
        editText.setSelection(selectionStart, selectionEnd);
    }

    public void b(android.text.TextWatcher textWatcher) {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214161h;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.addTextChangedListener(textWatcher);
        }
    }

    public boolean c(android.view.View view) {
        if (getVisibility() != 0) {
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/wallet_core/ui/formview/WalletFormView", "checkInputValid", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/wallet_core/ui/formview/WalletFormView", "checkInputValid", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            return true;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(getText())) {
            if (view != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/wallet_core/ui/formview/WalletFormView", "checkInputValid", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/wallet_core/ui/formview/WalletFormView", "checkInputValid", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView = this.f214159f;
            if (textView != null) {
                textView.setEnabled(true);
            }
            return false;
        }
        if (n()) {
            if (view != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(4);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/wallet_core/ui/formview/WalletFormView", "checkInputValid", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/wallet_core/ui/formview/WalletFormView", "checkInputValid", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView2 = this.f214159f;
            if (textView2 != null) {
                textView2.setEnabled(true);
            }
            return true;
        }
        if (view != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/wallet_core/ui/formview/WalletFormView", "checkInputValid", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/wallet_core/ui/formview/WalletFormView", "checkInputValid", "(Landroid/view/View;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView3 = this.f214159f;
        if (textView3 != null) {
            textView3.setEnabled(false);
        }
        return false;
    }

    public void d() {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214161h;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.ClearInput();
        }
    }

    public void e() {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214161h;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.clearFocus();
        }
    }

    public android.widget.EditText getContentEt() {
        return this.f214161h;
    }

    public int getEncrptType() {
        return this.f214176w;
    }

    public rp5.a getEventDelegate() {
        return null;
    }

    public java.lang.String getHint() {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214161h;
        return tenpaySecureEditText != null ? tenpaySecureEditText.getHint().toString() : "";
    }

    public com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView getInfoIv() {
        return this.f214162i;
    }

    public int getInputLength() {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214161h;
        if (tenpaySecureEditText != null) {
            return tenpaySecureEditText.getInputLength();
        }
        return 0;
    }

    public qp5.i0 getInputValidChangeListener() {
        return this.f214165n;
    }

    public android.text.method.KeyListener getKeyListener() {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214161h;
        if (tenpaySecureEditText != null) {
            return tenpaySecureEditText.getKeyListener();
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.WalletFormView", "hy: no content et");
        return null;
    }

    public rp5.b getLogicDelegate() {
        return this.f214170q;
    }

    public java.lang.String getMD5Value() {
        java.lang.String obj = this.f214161h.getText().toString();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (obj == null) {
            obj = "";
        }
        rp5.b bVar = this.f214170q;
        if (bVar != null && bVar.b()) {
            obj = this.f214170q.e(this, obj);
        }
        return com.tencent.mm.sdk.platformtools.w2.a(obj);
    }

    public int getMaxInputLength() {
        return this.N;
    }

    public int getMinInputLength() {
        return this.P;
    }

    public android.widget.TextView getPrefilledTv() {
        return this.f214160g;
    }

    public int getSelectionStart() {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214161h;
        if (tenpaySecureEditText != null) {
            return tenpaySecureEditText.getSelectionStart();
        }
        return -1;
    }

    public java.lang.String getText() {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214161h;
        if (tenpaySecureEditText == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletFormView", "hy: no content et. return nil");
            return "";
        }
        java.lang.String a17 = qp5.z.a(this.f214176w, tenpaySecureEditText, 0L, "", "");
        rp5.b bVar = this.f214170q;
        return (bVar == null || !bVar.b()) ? a17 : this.f214170q.e(this, a17);
    }

    public android.widget.TextView getTipsTv() {
        return this.f214164m;
    }

    public float getTitleMeasuredWidth() {
        return this.f214159f.getPaint().measureText(this.f214159f.getText(), 0, this.f214159f.getText().length());
    }

    public android.widget.TextView getTitleTv() {
        return this.f214159f;
    }

    public int k(java.lang.CharSequence charSequence, int i17, int i18) {
        if (this.f214169p1 == 0) {
            this.f214169p1 = (this.f214161h.getLeft() - this.f214159f.getLeft()) + this.f214161h.getPaddingLeft();
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(charSequence.toString(), "")) {
            return 0;
        }
        return (int) ((this.f214169p1 + ((i18 == 1 ? this.f214161h.getPaint().measureText("1") : this.f214161h.getPaint().measureText("2")) / 2.0f)) - (i17 / 2));
    }

    public final void l() {
        if (getTitleTv() != null) {
            getTitleTv().setText(this.f214177x);
            getTitleTv().setVisibility(this.f214179y);
            setTitleWidth(this.G);
        }
    }

    public boolean m(android.view.View view, android.view.MotionEvent motionEvent) {
        if (view != null && view.getVisibility() == 0) {
            android.graphics.Rect rect = new android.graphics.Rect();
            view.getHitRect(rect);
            if (view == this.f214162i) {
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

    public boolean n() {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214161h;
        if (tenpaySecureEditText == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletFormView", "hy: no content edit text. true as default");
            return true;
        }
        int inputLength = tenpaySecureEditText.getInputLength();
        if (inputLength > this.N || inputLength < this.P) {
            return false;
        }
        rp5.b bVar = this.f214170q;
        if (bVar != null) {
            return bVar.c(this);
        }
        return true;
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
        l();
        if (getPrefilledTv() != null) {
            getPrefilledTv().setText(this.f214181z);
            getPrefilledTv().setVisibility(this.A);
        }
        if (getInfoIv() != null) {
            getInfoIv().setImageResource(this.B);
            getInfoIv().setVisibility(this.D);
            if (this.C != -1) {
                getInfoIv().setmUserSetImageIconColor(this.C);
            }
        }
        if (getTipsTv() != null) {
            getTipsTv().setText(this.E);
            getTipsTv().setVisibility(this.F);
        }
        android.content.Context context = getContext();
        if (this.f214161h != null) {
            int i17 = this.f214180y0;
            if (i17 >= 0) {
                try {
                    this.f214161h.setTypeface(android.graphics.Typeface.createFromAsset(context.getAssets(), com.tencent.mm.wallet_core.ui.r1.E(i17)));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.WalletFormView", "setTypeface() Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
                }
            }
            if (this.I == -1) {
                this.f214161h.setHint(this.H);
            } else {
                android.text.SpannableString spannableString = new android.text.SpannableString(this.H + "  ");
                spannableString.setSpan(new r85.b(this.I), 0, spannableString.length() + (-2), 33);
                spannableString.setSpan(new android.text.style.AbsoluteSizeSpan((int) this.f214161h.getTextSize(), false), spannableString.length() + (-2), spannableString.length(), 33);
                this.f214161h.setHint(new android.text.SpannedString(spannableString));
            }
            this.f214161h.setGravity(this.f214156J);
            this.f214161h.setTextColor(this.K);
            setText(this.L);
            qp5.y.a(this.f214161h, this.M, true);
            this.f214161h.setBackgroundResource(this.Q);
            this.f214161h.setEnabled(this.R);
            this.f214161h.setFocusable(this.T);
            this.f214161h.setClickable(this.S);
            this.f214161h.setHintTextColor(this.f214168p0);
            setImeOptions(this.W);
            setInputType(this.V);
            this.f214161h.addTextChangedListener(new qp5.a0(this));
            this.f214161h.setOnFocusChangeListener(this);
            try {
                int i18 = this.f214163l1;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (!(i18 == 0)) {
                    this.f214161h.setCursorStyle(i18);
                }
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WalletFormView", "set textCursorDrawable fail!!");
            }
        }
        s();
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214161h;
        if (tenpaySecureEditText != null) {
            int i19 = this.V;
            if (i19 == 2) {
                tenpaySecureEditText.setKeyListener(new qp5.e0(this));
            } else if (i19 == 4) {
                tenpaySecureEditText.setKeyListener(new qp5.f0(this));
            } else if (i19 == 128) {
                tenpaySecureEditText.setTransformationMethod(android.text.method.PasswordTransformationMethod.getInstance());
                this.f214161h.setKeyListener(new qp5.g0(this));
                this.f214161h.setRawInputType(18);
            } else if (i19 == 3) {
                tenpaySecureEditText.setKeyListener(new qp5.h0(this));
            } else {
                tenpaySecureEditText.setInputType(i19);
            }
            if (this.N != -1) {
                this.f214161h.setFilters(new android.text.InputFilter[]{new android.text.InputFilter.LengthFilter(this.N)});
            }
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f214166o;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(this, z17);
        }
        qp5.i0 i0Var = this.f214165n;
        if (i0Var != null) {
            i0Var.onInputValidChange(n());
        }
        if (n()) {
            android.widget.TextView textView = this.f214159f;
            if (textView != null) {
                textView.setEnabled(true);
            }
        } else {
            android.widget.TextView textView2 = this.f214159f;
            if (textView2 != null) {
                textView2.setEnabled(false);
            }
        }
        s();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214161h;
        if (tenpaySecureEditText != null && m(tenpaySecureEditText, motionEvent) && !this.f214161h.isClickable()) {
            return true;
        }
        com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView walletIconImageView = this.f214162i;
        if (walletIconImageView == null || !walletIconImageView.isClickable() || !m(this.f214162i, motionEvent) || motionEvent.getAction() != 1) {
            return false;
        }
        s();
        this.f214162i.performClick();
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }

    public void p() {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214161h;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setFocusable(true);
            this.f214161h.requestFocus();
            ((android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this.f214161h, 0);
        }
    }

    public void q(com.tencent.mm.wallet_core.ui.WalletBaseUI walletBaseUI) {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214161h;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setFocusable(true);
            this.f214161h.requestFocus();
            walletBaseUI.showTenpayKB();
        }
    }

    public void r(int i17, int i18) {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214161h;
        if (tenpaySecureEditText != null) {
            if (i17 >= 0 || i18 >= 0) {
                this.f214171r = i17;
                this.f214172s = i18;
                tenpaySecureEditText.addTextChangedListener(new qp5.c0(this));
            }
        }
    }

    public final void s() {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText;
        if (this.f214162i != null && !com.tencent.mm.sdk.platformtools.t8.K0(getText()) && (tenpaySecureEditText = this.f214161h) != null && tenpaySecureEditText.isEnabled() && this.f214161h.isClickable() && this.f214161h.isFocusable() && this.f214161h.isFocused()) {
            this.f214162i.setToClearState(new qp5.b0(this));
            return;
        }
        com.tencent.mm.pluginsdk.ui.wallet.WalletIconImageView walletIconImageView = this.f214162i;
        if (walletIconImageView != null) {
            walletIconImageView.t();
        }
    }

    public void set3DesToView(java.lang.String str) {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214161h;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.set3DesEncrptData(str);
        }
    }

    public void set3DesValStr(java.lang.String str) {
        if (this.f214161h != null) {
            rp5.b bVar = this.f214170q;
            if (bVar == null || !bVar.a(this, str)) {
                this.f214161h.set3DesEncrptData(str);
                setSelection(getInputLength());
            }
        }
    }

    public void setBankcardTail(java.lang.String str) {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214161h;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setBankcardTailNum(str);
        }
    }

    public void setContentClickable(boolean z17) {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214161h;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setClickable(z17);
        }
    }

    public void setContentEnabled(boolean z17) {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214161h;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setEnabled(z17);
        }
    }

    public void setContentFocusable(boolean z17) {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214161h;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setFocusable(z17);
        }
    }

    public void setContentTextColor(int i17) {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214161h;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setTextColor(i17);
        }
    }

    public void setContentTextColorRes(int i17) {
        this.K = i17;
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214161h;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setTextColor(getResources().getColor(this.K));
        }
    }

    public void setEncryptType(int i17) {
        this.f214176w = i17;
    }

    public void setEventDelegate(rp5.a aVar) {
    }

    public void setFilterChar(char[] cArr) {
    }

    public void setFilters(android.text.InputFilter[] inputFilterArr) {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214161h;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setFilters(inputFilterArr);
        }
    }

    public void setHint(java.lang.CharSequence charSequence) {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214161h;
        if (tenpaySecureEditText != null) {
            if (this.I == -1) {
                tenpaySecureEditText.setHint(charSequence);
                return;
            }
            android.text.SpannableString spannableString = new android.text.SpannableString(charSequence);
            spannableString.setSpan(new android.text.style.AbsoluteSizeSpan(this.I, false), 0, spannableString.length(), 33);
            this.f214161h.setHint(new android.text.SpannedString(spannableString));
        }
    }

    public void setHintSize(int i17) {
        this.I = i17;
    }

    public void setImeOptions(int i17) {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214161h;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setImeOptions(i17);
        }
    }

    public void setInputEnable(boolean z17) {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214161h;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setEnabled(z17);
        }
    }

    public void setInputType(int i17) {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214161h;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setInputType(i17);
        }
    }

    public void setIsSecretAnswer(boolean z17) {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214161h;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setIsSecurityAnswerFormat(z17);
        }
    }

    public void setKeyListener(android.text.method.KeyListener keyListener) {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214161h;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setKeyListener(keyListener);
        }
    }

    public void setLogicDelegate(rp5.b bVar) {
        this.f214170q = bVar;
    }

    public void setMaxInputLength(int i17) {
        this.N = i17;
    }

    public void setMinInputLength(int i17) {
        this.P = i17;
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    public void setOnEditorActionListener(android.widget.TextView.OnEditorActionListener onEditorActionListener) {
        this.f214161h.setOnEditorActionListener(onEditorActionListener);
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        this.f214166o = onFocusChangeListener;
    }

    public void setOnInfoIvClickListener(android.view.View.OnClickListener onClickListener) {
        this.f214167p = onClickListener;
        if (getInfoIv() != null) {
            getInfoIv().setOnClickListener(this.f214167p);
        }
    }

    public void setOnInputValidChangeListener(qp5.i0 i0Var) {
        this.f214165n = i0Var;
    }

    public void setSelection(int i17) {
        com.tenpay.android.wechat.TenpaySecureEditText tenpaySecureEditText = this.f214161h;
        if (tenpaySecureEditText != null) {
            tenpaySecureEditText.setSelection(i17);
        }
    }

    public void setText(java.lang.String str) {
        if (this.f214161h != null) {
            rp5.b bVar = this.f214170q;
            if (bVar == null || !bVar.d(this, str)) {
                this.f214161h.setText(str);
                this.f214161h.setSelection(getInputLength());
            }
        }
    }

    public void setTitleText(java.lang.String str) {
        this.f214177x = str;
        l();
    }

    public void setTitleWidth(int i17) {
        android.view.ViewGroup.LayoutParams layoutParams;
        this.G = i17;
        if (i17 <= 0 || (layoutParams = this.f214159f.getLayoutParams()) == null) {
            return;
        }
        layoutParams.width = this.G;
        this.f214159f.setLayoutParams(layoutParams);
    }

    public void setWalletFormViewLimitListener(qp5.j0 j0Var) {
        this.f214158e = j0Var;
    }

    public void setmContentAbnormalMoneyCheck(boolean z17) {
        this.U = z17;
    }

    public void setmWalletFormViewListener(qp5.k0 k0Var) {
        this.f214157d = k0Var;
    }

    public WalletFormView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }
}
