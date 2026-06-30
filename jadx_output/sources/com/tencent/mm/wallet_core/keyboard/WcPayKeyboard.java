package com.tencent.mm.wallet_core.keyboard;

/* loaded from: classes9.dex */
public class WcPayKeyboard extends android.widget.RelativeLayout {
    public static final /* synthetic */ int S = 0;
    public mp5.w A;
    public mp5.v B;
    public boolean C;
    public final boolean D;
    public java.lang.Runnable E;
    public android.animation.ObjectAnimator F;
    public android.animation.ObjectAnimator G;
    public mp5.u H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.WalletFormView f213802J;
    public int K;
    public java.lang.String L;
    public wu5.c M;
    public android.view.inputmethod.InputConnection N;
    public final int P;
    public final int Q;
    public final int R;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f213803d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f213804e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f213805f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f213806g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f213807h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f213808i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f213809m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f213810n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f213811o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f213812p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f213813q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f213814r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f213815s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f213816t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.LinearLayout f213817u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.ViewGroup f213818v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.LinearLayout f213819w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.wallet_core.keyboard.WcPayKeyboardAnimationActionButton f213820x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.EditText f213821y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f213822z;

    public WcPayKeyboard(android.content.Context context) {
        super(context);
        this.A = mp5.w.INIT_STATE;
        this.C = false;
        this.D = true;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = false;
        this.f213802J = null;
        this.K = 0;
        this.L = "";
        this.M = null;
        this.N = null;
        this.P = 7;
        this.Q = 2;
        this.R = 7 + 2 + 2;
        k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (((r4 - r2) - 1) >= r5) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
    
        if (r13 == 7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x004e, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(com.tencent.mm.wallet_core.keyboard.WcPayKeyboard r12, int r13) {
        /*
            android.view.inputmethod.InputConnection r0 = r12.N
            if (r0 != 0) goto L6
            goto L9a
        L6:
            java.lang.String r0 = r12.getInputConnectionText()
            android.view.inputmethod.InputConnection r1 = r12.N
            int r2 = r12.R
            r3 = 0
            java.lang.CharSequence r1 = r1.getTextBeforeCursor(r2, r3)
            if (r1 != 0) goto L17
            r1 = r3
            goto L1b
        L17:
            int r1 = r1.length()
        L1b:
            java.lang.String r2 = "."
            int r2 = r0.indexOf(r2)
            int r4 = r0.length()
            int r5 = r12.Q
            r6 = 56
            r7 = 7
            r8 = 1
            r9 = 67
            if (r13 == r9) goto L68
            r10 = 66
            if (r13 == r10) goto L68
            if (r13 == r6) goto L68
            boolean r10 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r10 != 0) goto L68
            if (r2 < 0) goto L45
            if (r1 <= r2) goto L45
            int r10 = r4 - r2
            int r10 = r10 - r8
            if (r10 < r5) goto L50
            goto L4e
        L45:
            int r10 = r12.P
            if (r2 < 0) goto L4c
            if (r2 < r10) goto L50
            goto L4e
        L4c:
            if (r4 < r10) goto L50
        L4e:
            r10 = r3
            goto L51
        L50:
            r10 = r8
        L51:
            java.lang.String r11 = "0"
            boolean r11 = r0.startsWith(r11)
            if (r11 == 0) goto L69
            if (r1 != 0) goto L5e
            if (r13 != r7) goto L69
            goto L66
        L5e:
            if (r1 != r8) goto L69
            if (r13 != r7) goto L63
            goto L66
        L63:
            r12.m(r9, r13)
        L66:
            r10 = r3
            goto L69
        L68:
            r10 = r8
        L69:
            if (r13 != r6) goto L79
            if (r2 < 0) goto L6e
            goto L78
        L6e:
            int r6 = r4 - r1
            if (r6 <= r5) goto L73
            goto L78
        L73:
            if (r1 != 0) goto L79
            r12.m(r7, r13)
        L78:
            r10 = r3
        L79:
            if (r13 != r9) goto L94
            if (r2 < 0) goto L94
            if (r1 != r8) goto L83
            r12.m(r9, r7)
            r10 = r3
        L83:
            java.lang.String r2 = "0."
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L94
            r0 = 2
            if (r1 != r0) goto L94
            if (r4 <= r0) goto L94
            r12.m(r9, r9)
            goto L95
        L94:
            r3 = r10
        L95:
            if (r3 == 0) goto L9a
            r12.l(r13)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.wallet_core.keyboard.WcPayKeyboard.a(com.tencent.mm.wallet_core.keyboard.WcPayKeyboard, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public java.lang.String getInputConnectionText() {
        android.view.inputmethod.InputConnection inputConnection = this.N;
        if (inputConnection == null) {
            return "";
        }
        int i17 = this.R;
        java.lang.CharSequence textBeforeCursor = inputConnection.getTextBeforeCursor(i17, 0);
        java.lang.CharSequence selectedText = this.N.getSelectedText(0);
        java.lang.CharSequence textAfterCursor = this.N.getTextAfterCursor(i17, 0);
        return (textBeforeCursor == null ? "" : textBeforeCursor.toString()) + (selectedText == null ? "" : selectedText.toString()) + (textAfterCursor != null ? textAfterCursor.toString() : "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWindowViewBottomMargin(int i17) {
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f213822z.getLayoutParams();
        layoutParams.bottomMargin = i17;
        this.f213822z.setLayoutParams(layoutParams);
    }

    public void d(com.tencent.mm.ui.MMActivity mMActivity, int i17) {
        com.tencent.mm.ui.LayoutListenerView layoutListenerView = (com.tencent.mm.ui.LayoutListenerView) mMActivity.findViewById(com.tencent.mm.R.id.jlt);
        layoutListenerView.setBackgroundColor(i17);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        layoutListenerView.addView(this, layoutParams);
        setVisibility(8);
        this.f213822z = layoutListenerView.getChildAt(0);
        this.C = true;
    }

    public void e(boolean z17) {
        this.f213814r.setEnabled(z17);
        this.f213820x.setEnabled(z17);
        if (z17) {
            this.f213814r.setBackgroundResource(com.tencent.mm.R.drawable.baf);
            this.f213814r.setTextColor(getResources().getColor(com.tencent.mm.R.color.f479552ab3));
        } else if (com.tencent.mm.ui.bk.C()) {
            this.f213814r.setBackgroundResource(com.tencent.mm.R.drawable.bag);
            this.f213814r.setTextColor(android.graphics.Color.parseColor("#347051"));
        } else {
            this.f213814r.setBackgroundResource(com.tencent.mm.R.drawable.baf);
            this.f213814r.setTextColor(android.graphics.Color.parseColor("#CDF2DF"));
        }
    }

    public final void f(boolean z17, boolean z18) {
        if (z17) {
            this.f213820x.setVisibility(0);
            com.tencent.mm.wallet_core.keyboard.WcPayKeyboardAnimationActionButton wcPayKeyboardAnimationActionButton = this.f213820x;
            if (wcPayKeyboardAnimationActionButton.f213843z) {
                int[] iArr = new int[2];
                this.f213814r.getLocationOnScreen(iArr);
                this.f213818v.getLocationOnScreen(new int[2]);
                if (this.f213816t.isShown()) {
                    this.f213816t.getHeight();
                    i65.a.b(getContext(), 24);
                }
                this.f213815s.getHeight();
                i65.a.b(getContext(), 16);
                this.f213820x.b(this.f213814r.getWidth(), this.f213814r.getHeight(), i65.a.b(getContext(), 8), iArr[0]);
            } else {
                wcPayKeyboardAnimationActionButton.b(wcPayKeyboardAnimationActionButton.B, wcPayKeyboardAnimationActionButton.C, wcPayKeyboardAnimationActionButton.D, wcPayKeyboardAnimationActionButton.E);
            }
            this.f213820x.f213840w = ((java.lang.Object) this.f213814r.getText()) + "";
            this.f213814r.setVisibility(4);
            com.tencent.mm.sdk.platformtools.u3.h(new mp5.s(this));
            return;
        }
        if (!z18) {
            com.tencent.mm.wallet_core.keyboard.WcPayKeyboardAnimationActionButton wcPayKeyboardAnimationActionButton2 = this.f213820x;
            wcPayKeyboardAnimationActionButton2.f213832o = i65.a.b(wcPayKeyboardAnimationActionButton2.f213824d, 4);
            wcPayKeyboardAnimationActionButton2.f213836s = wcPayKeyboardAnimationActionButton2.f213831n;
            wcPayKeyboardAnimationActionButton2.f213837t = wcPayKeyboardAnimationActionButton2.f213830m;
            wcPayKeyboardAnimationActionButton2.setTranslationX(wcPayKeyboardAnimationActionButton2.getTranslationX() + wcPayKeyboardAnimationActionButton2.f213833p);
            wcPayKeyboardAnimationActionButton2.invalidate();
            this.f213820x.setVisibility(8);
            return;
        }
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboardAnimationActionButton wcPayKeyboardAnimationActionButton3 = this.f213820x;
        if (wcPayKeyboardAnimationActionButton3.N == null) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(wcPayKeyboardAnimationActionButton3, "translationX", wcPayKeyboardAnimationActionButton3.f213841x, wcPayKeyboardAnimationActionButton3.f213842y);
            wcPayKeyboardAnimationActionButton3.N = ofFloat;
            ofFloat.setDuration(wcPayKeyboardAnimationActionButton3.f213838u);
            wcPayKeyboardAnimationActionButton3.N.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        }
        int i17 = wcPayKeyboardAnimationActionButton3.f213834q;
        wcPayKeyboardAnimationActionButton3.f213836s = i17;
        if (wcPayKeyboardAnimationActionButton3.P == null) {
            android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(i17, wcPayKeyboardAnimationActionButton3.f213831n);
            wcPayKeyboardAnimationActionButton3.P = ofInt;
            ofInt.setDuration(wcPayKeyboardAnimationActionButton3.f213839v);
            wcPayKeyboardAnimationActionButton3.P.addUpdateListener(new mp5.a0(wcPayKeyboardAnimationActionButton3));
        }
        wcPayKeyboardAnimationActionButton3.A = false;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) wcPayKeyboardAnimationActionButton3.getLayoutParams();
        layoutParams.height = wcPayKeyboardAnimationActionButton3.f213831n;
        wcPayKeyboardAnimationActionButton3.setLayoutParams(layoutParams);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        wcPayKeyboardAnimationActionButton3.Q = animatorSet;
        animatorSet.play(wcPayKeyboardAnimationActionButton3.P).with(wcPayKeyboardAnimationActionButton3.N);
        com.tencent.mm.sdk.platformtools.u3.h(new mp5.t(this));
    }

    public void g(boolean z17) {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_pay_keyboard_num_enable_close, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayKeyBoard", "[isKeyboardNumberEnableClose] switch %s", java.lang.Boolean.valueOf(fj6));
        if (!fj6 || z17) {
            t(this.f213812p, z17);
            t(this.f213803d, z17);
            t(this.f213804e, z17);
            t(this.f213805f, z17);
            t(this.f213806g, z17);
            t(this.f213807h, z17);
            t(this.f213808i, z17);
            t(this.f213809m, z17);
            t(this.f213810n, z17);
            t(this.f213811o, z17);
            t(this.f213813q, z17);
            t(this.f213815s, z17);
        }
    }

    public java.lang.String getEnterPayAmount() {
        o05.j jVar;
        java.lang.String str = this.L;
        this.L = "";
        wu5.c cVar = this.M;
        if (cVar != null) {
            cVar.cancel(false);
            this.M = null;
        }
        mp5.u uVar = this.H;
        if (uVar != null && (jVar = ((ps4.f) uVar).f358150a) != null) {
            jVar.b(0, "#callpay");
        }
        return str;
    }

    public android.widget.EditText getInputEditText() {
        return this.f213821y;
    }

    public android.widget.TextView getTipsTv() {
        return this.f213816t;
    }

    public void h() {
        this.f213816t.setVisibility(8);
        s();
    }

    public void i() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(isShown());
        mp5.w wVar = this.A;
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(n());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayKeyBoard", "hideWcKb() %s %s %s [%s]", valueOf, wVar, valueOf2, new com.tencent.mm.sdk.platformtools.z3());
        g(false);
        if (n() || this.A == mp5.w.INIT_STATE || !isShown()) {
            return;
        }
        if (q()) {
            j(true);
        }
        if (r()) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477925fd);
            loadAnimation.setAnimationListener(new mp5.c(this, true));
            this.f213820x.startAnimation(loadAnimation);
        }
    }

    public final void j(boolean z17) {
        if (this.C) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477877e1);
            loadAnimation.setDuration(330L);
            loadAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
            loadAnimation.setAnimationListener(new mp5.h(this, z17));
            this.f213819w.startAnimation(loadAnimation);
            setWindowViewBottomMargin(0);
            return;
        }
        int height = this.f213819w.getHeight();
        if (this.G == null) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f213819w, "translationY", 0.0f, height);
            this.G = ofFloat;
            ofFloat.setDuration(300L);
            this.G.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        }
        this.G.removeAllListeners();
        this.G.addListener(new mp5.a(this, height, z17));
        this.G.removeAllUpdateListeners();
        this.G.addUpdateListener(new mp5.b(this, height));
        this.G.start();
    }

    public final void k() {
        if (this.D) {
            android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.d96, (android.view.ViewGroup) this, true);
        } else {
            android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.d98, (android.view.ViewGroup) this, true);
        }
        this.f213819w = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.keyboard_base);
        this.f213812p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.keyboard_0);
        this.f213803d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.keyboard_1);
        this.f213804e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.keyboard_2);
        this.f213805f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.keyboard_3);
        this.f213806g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.keyboard_4);
        this.f213807h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.keyboard_5);
        this.f213808i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.keyboard_6);
        this.f213809m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.keyboard_7);
        this.f213810n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.keyboard_8);
        this.f213811o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.keyboard_9);
        this.f213813q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.keyboard_dot);
        this.f213815s = findViewById(com.tencent.mm.R.id.keyboard_del);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.keyboard_action);
        this.f213814r = textView;
        if (textView == null) {
            this.f213814r = new android.widget.TextView(getContext());
        }
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboardAnimationActionButton wcPayKeyboardAnimationActionButton = (com.tencent.mm.wallet_core.keyboard.WcPayKeyboardAnimationActionButton) findViewById(com.tencent.mm.R.id.keyboard_animation_action);
        this.f213820x = wcPayKeyboardAnimationActionButton;
        if (wcPayKeyboardAnimationActionButton == null) {
            this.f213820x = new com.tencent.mm.wallet_core.keyboard.WcPayKeyboardAnimationActionButton(getContext());
        }
        this.f213816t = (android.widget.TextView) findViewById(com.tencent.mm.R.id.keyboard_tip_tv);
        this.f213817u = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.keyboard_toolBar);
        this.f213818v = (android.view.ViewGroup) findViewById(com.tencent.mm.R.id.keyboard_gl);
        this.f213814r.setTypeface(android.graphics.Typeface.defaultFromStyle(1));
        this.f213814r.setTextSize(1, i65.a.q(getContext()) * 17.0f);
        mp5.k kVar = new mp5.k(this);
        this.f213819w.setOnClickListener(kVar);
        this.f213812p.setOnClickListener(kVar);
        this.f213803d.setOnClickListener(kVar);
        this.f213804e.setOnClickListener(kVar);
        this.f213805f.setOnClickListener(kVar);
        this.f213806g.setOnClickListener(kVar);
        this.f213807h.setOnClickListener(kVar);
        this.f213808i.setOnClickListener(kVar);
        this.f213809m.setOnClickListener(kVar);
        this.f213810n.setOnClickListener(kVar);
        this.f213811o.setOnClickListener(kVar);
        this.f213815s.setOnClickListener(kVar);
        this.f213813q.setOnClickListener(kVar);
        this.f213814r.setOnClickListener(kVar);
        this.f213820x.setOnClickListener(kVar);
        com.tencent.mm.wallet_core.e eVar = new com.tencent.mm.wallet_core.e();
        eVar.setViewType(com.tencent.kinda.gen.TraitsType.BUTTON);
        this.f213814r.setAccessibilityDelegate(eVar);
        this.f213815s.setAccessibilityDelegate(eVar);
    }

    public final void l(int i17) {
        android.view.inputmethod.InputConnection inputConnection = this.N;
        if (inputConnection != null) {
            inputConnection.sendKeyEvent(new android.view.KeyEvent(0, i17));
            this.N.sendKeyEvent(new android.view.KeyEvent(1, i17));
        }
    }

    public final void m(int i17, int i18) {
        if (this.N != null) {
            l(i17);
            postDelayed(new mp5.o(this, i18), 10L);
        }
    }

    public boolean n() {
        android.animation.ObjectAnimator objectAnimator = this.G;
        boolean isRunning = objectAnimator == null ? false : objectAnimator.isRunning();
        android.animation.ObjectAnimator objectAnimator2 = this.F;
        if (!(isRunning || (objectAnimator2 == null ? false : objectAnimator2.isRunning()))) {
            com.tencent.mm.wallet_core.keyboard.WcPayKeyboardAnimationActionButton wcPayKeyboardAnimationActionButton = this.f213820x;
            android.animation.AnimatorSet animatorSet = wcPayKeyboardAnimationActionButton.M;
            if (!((animatorSet == null || wcPayKeyboardAnimationActionButton.L == null || wcPayKeyboardAnimationActionButton.K == null || wcPayKeyboardAnimationActionButton.f213823J == null) ? false : animatorSet.isRunning())) {
                return false;
            }
        }
        return true;
    }

    public boolean o() {
        return getVisibility() == 8 && !p();
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (!isShown() || !q()) {
            return false;
        }
        v();
        return true;
    }

    public boolean p() {
        return this.A == mp5.w.INIT_STATE;
    }

    public boolean q() {
        return this.A == mp5.w.NORMAL_STATE;
    }

    public boolean r() {
        return this.A == mp5.w.SINGLE_ACTION_STATE;
    }

    public final void s() {
        if (this.f213819w.isShown()) {
            post(new mp5.r(this));
        }
    }

    public void setActionBtnColor(int i17) {
        this.f213814r.setBackgroundResource(i17);
        this.f213820x.setBackgroundResource(i17);
    }

    public void setActionText(java.lang.String str) {
        this.f213814r.setText(str);
        this.f213820x.setContentDescription(str);
    }

    public void setHeightListener(mp5.v vVar) {
        this.B = vVar;
    }

    public void setInnerMode(boolean z17) {
        this.I = z17;
        if (z17 && this.f213802J == null) {
            com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView = (com.tencent.mm.wallet_core.ui.formview.WalletFormView) findViewById(com.tencent.mm.R.id.f485972jq4);
            this.f213802J = walletFormView;
            this.f213821y = walletFormView.getContentEt();
            com.tencent.mm.wallet_core.ui.formview.WalletFormView walletFormView2 = this.f213802J;
            if (walletFormView2.f214161h != null) {
                int i17 = this.P;
                int i18 = this.Q;
                if (i17 >= 0 || i18 >= 0) {
                    walletFormView2.f214171r = i17;
                    walletFormView2.f214172s = i18;
                    walletFormView2.f214173t = true;
                }
            }
            walletFormView2.setmContentAbnormalMoneyCheck(true);
            this.f213802J.setWalletFormViewLimitListener(new mp5.l(this));
            this.f213802J.setOnEditorActionListener(new mp5.n(this));
        }
    }

    public void setInputConnection(android.view.inputmethod.InputConnection inputConnection) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayKeyBoard", "setInputConnection");
        this.N = inputConnection;
    }

    public void setInputEditText(android.widget.EditText editText) {
        if (editText != null) {
            this.f213821y = editText;
            this.I = false;
            this.f213802J = null;
        }
    }

    public void setIsOnlySupportInteger(boolean z17) {
        if (z17) {
            this.f213813q.setVisibility(8);
            androidx.gridlayout.widget.GridLayout.LayoutParams layoutParams = (androidx.gridlayout.widget.GridLayout.LayoutParams) this.f213812p.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.f11552b = androidx.gridlayout.widget.GridLayout.l(0, 3, androidx.gridlayout.widget.GridLayout.f11538w, 1.0f);
                this.f213812p.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.f213813q.setVisibility(0);
        androidx.gridlayout.widget.GridLayout.LayoutParams layoutParams2 = (androidx.gridlayout.widget.GridLayout.LayoutParams) this.f213812p.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.f11552b = androidx.gridlayout.widget.GridLayout.l(0, 2, androidx.gridlayout.widget.GridLayout.f11538w, 1.0f);
            this.f213812p.setLayoutParams(layoutParams2);
        }
    }

    public void setTipText(java.lang.String str) {
        this.f213816t.setText(str);
        this.f213816t.setVisibility(0);
        s();
    }

    public void setToolBarContent(android.view.View view) {
        if (view == null) {
            return;
        }
        this.f213817u.setVisibility(0);
        this.f213817u.removeAllViews();
        this.f213816t.setVisibility(8);
        this.f213817u.addView(view, -1, -2);
        s();
    }

    public final void t(android.view.View view, boolean z17) {
        if (view != null) {
            view.setEnabled(z17);
        }
    }

    public void u() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(isShown());
        mp5.w wVar = this.A;
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(n());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayKeyBoard", " showNormalStWcKb() %s %s %s [%s]", valueOf, wVar, valueOf2, new com.tencent.mm.sdk.platformtools.z3());
        g(true);
        if (n()) {
            if (this.I) {
                this.E = new mp5.q(this);
                return;
            }
            return;
        }
        if (!isShown()) {
            if (r()) {
                f(false, false);
            }
            g(true);
            setVisibility(0);
            this.f213819w.setVisibility(4);
            this.f213819w.post(new mp5.g(this, true));
        } else if (r()) {
            f(false, true);
        }
        this.A = mp5.w.NORMAL_STATE;
    }

    public void v() {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(isShown());
        mp5.w wVar = this.A;
        java.lang.Boolean valueOf2 = java.lang.Boolean.valueOf(n());
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WcPayKeyBoard", "showSingleActionStWcKb() %s %s %s [%s]", valueOf, wVar, valueOf2, new com.tencent.mm.sdk.platformtools.z3());
        g(true);
        if (n()) {
            if (this.I) {
                this.E = new mp5.p(this);
                return;
            }
            return;
        }
        if (this.A == mp5.w.INIT_STATE) {
            return;
        }
        if (isShown() && q()) {
            f(true, false);
        } else if (!isShown()) {
            if (q()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WcPayKeyBoard", "showSingleActionStWcKb() why here??");
            } else if (r()) {
                setVisibility(0);
                this.f213820x.setVisibility(0);
                android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477924fc);
                loadAnimation.setAnimationListener(new mp5.d(this));
                this.f213820x.startAnimation(loadAnimation);
            }
        }
        this.A = mp5.w.SINGLE_ACTION_STATE;
    }

    public WcPayKeyboard(android.content.Context context, boolean z17) {
        super(context);
        this.A = mp5.w.INIT_STATE;
        this.C = false;
        this.D = true;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = false;
        this.f213802J = null;
        this.K = 0;
        this.L = "";
        this.M = null;
        this.N = null;
        this.P = 7;
        this.Q = 2;
        this.R = 7 + 2 + 2;
        this.D = z17;
        k();
    }

    public WcPayKeyboard(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A = mp5.w.INIT_STATE;
        this.C = false;
        this.D = true;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = false;
        this.f213802J = null;
        this.K = 0;
        this.L = "";
        this.M = null;
        this.N = null;
        this.P = 7;
        this.Q = 2;
        this.R = 7 + 2 + 2;
        k();
    }

    public WcPayKeyboard(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.A = mp5.w.INIT_STATE;
        this.C = false;
        this.D = true;
        this.E = null;
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = false;
        this.f213802J = null;
        this.K = 0;
        this.L = "";
        this.M = null;
        this.N = null;
        this.P = 7;
        this.Q = 2;
        this.R = 7 + 2 + 2;
        k();
    }
}
