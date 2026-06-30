package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class v7 extends com.tencent.mm.ui.widget.dialog.k2 implements com.tencent.mm.plugin.wallet_core.ui.i0 {
    public static final /* synthetic */ int P = 0;
    public android.widget.TextView A;
    public android.view.View B;
    public android.widget.TextView C;
    public android.widget.ImageView D;
    public int E;
    public boolean F;
    public int G;
    public int H;
    public android.view.animation.Animation I;

    /* renamed from: J, reason: collision with root package name */
    public long f180672J;
    public int K;
    public java.lang.String L;
    public int M;
    public boolean N;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f180673d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f180674e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f180675f;

    /* renamed from: g, reason: collision with root package name */
    public com.tenpay.android.wechat.MyKeyboardWindow f180676g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f180677h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f180678i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f180679m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f180680n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout f180681o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f180682p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView f180683q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.u7 f180684r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f180685s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f180686t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f180687u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f180688v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.t7 f180689w;

    /* renamed from: x, reason: collision with root package name */
    public android.content.DialogInterface.OnClickListener f180690x;

    /* renamed from: y, reason: collision with root package name */
    public android.content.DialogInterface.OnCancelListener f180691y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.wallet_core.utils.m f180692z;

    public v7(android.content.Context context, int i17) {
        super(context, com.tencent.mm.R.style.f494795wh);
        this.f180692z = new com.tencent.mm.plugin.wallet_core.utils.m();
        this.E = 0;
        this.F = false;
        this.G = 0;
        this.H = 0;
        this.I = null;
        this.f180672J = -1L;
        this.K = 0;
        this.L = "";
        this.M = 0;
        this.N = false;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.d6q, null);
        this.f180673d = inflate;
        this.f180674e = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.mm_alert_ok_btn);
        this.f180675f = (android.widget.ImageView) this.f180673d.findViewById(com.tencent.mm.R.id.pem);
        this.f180676g = (com.tenpay.android.wechat.MyKeyboardWindow) this.f180673d.findViewById(com.tencent.mm.R.id.tenpay_num_keyboard);
        this.f180677h = this.f180673d.findViewById(com.tencent.mm.R.id.o1v);
        this.f180678i = (android.widget.TextView) this.f180673d.findViewById(com.tencent.mm.R.id.cgi);
        this.f180679m = (android.widget.TextView) this.f180673d.findViewById(com.tencent.mm.R.id.pet);
        this.f180680n = (android.widget.TextView) this.f180673d.findViewById(com.tencent.mm.R.id.f484346dz0);
        ((android.widget.TextView) this.f180673d.findViewById(com.tencent.mm.R.id.klu)).getPaint().setFlags(16);
        this.f180681o = (com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout) this.f180673d.findViewById(com.tencent.mm.R.id.f484339dy3);
        this.f180685s = this.f180673d.findViewById(com.tencent.mm.R.id.dxq);
        this.f180682p = (android.widget.ImageView) this.f180673d.findViewById(com.tencent.mm.R.id.bra);
        this.f180686t = this.f180673d.findViewById(com.tencent.mm.R.id.aei);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f180682p, com.tencent.mm.wallet_core.ui.r1.D(), null);
        this.f180683q = (com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView) this.f180673d.findViewById(com.tencent.mm.R.id.hdh);
        this.A = (android.widget.TextView) this.f180673d.findViewById(com.tencent.mm.R.id.peh);
        this.B = this.f180673d.findViewById(com.tencent.mm.R.id.g5t);
        this.C = (android.widget.TextView) this.f180673d.findViewById(com.tencent.mm.R.id.g5w);
        this.D = (android.widget.ImageView) this.f180673d.findViewById(com.tencent.mm.R.id.g5s);
        this.f180687u = (android.widget.TextView) this.f180673d.findViewById(com.tencent.mm.R.id.f483610bf1);
        this.f180688v = this.f180673d.findViewById(com.tencent.mm.R.id.dxc);
        this.f180681o.setVisibility(8);
        setCanceledOnTouchOutside(true);
        getWindow().setSoftInputMode(2);
        if (com.tencent.mm.wallet_core.ui.r1.P()) {
            getWindow().addFlags(8192);
        }
        this.f180674e.setEnabled(false);
        this.f180674e.setTextColor(context.getResources().getColorStateList(com.tencent.mm.R.color.a_o));
        qp5.p.b(this.f180683q);
        this.f180683q.setOnInputValidListener(new com.tencent.mm.plugin.wallet_core.ui.j7(this));
        this.f180683q.requestFocus();
        android.widget.TextView textView = (android.widget.TextView) this.f180673d.findViewById(com.tencent.mm.R.id.pet);
        if (textView != null) {
            textView.setText(c01.z1.I() ? context.getString(com.tencent.mm.R.string.kww) : context.getString(com.tencent.mm.R.string.kwv));
        }
        android.widget.EditText editText = (android.widget.EditText) this.f180673d.findViewById(com.tencent.mm.R.id.pbn);
        com.tencent.mm.wallet_core.ui.r1.v0(editText);
        this.f180676g.setInputEditText(editText);
        com.tencent.mm.wallet_core.e eVar = new com.tencent.mm.wallet_core.e(true);
        this.f180676g.setSecureAccessibility(eVar);
        editText.setAccessibilityDelegate(eVar);
        com.tencent.mm.wallet_core.ui.r1.N(this.f180683q, this.f180676g);
        editText.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.k7(this));
        this.f180673d.findViewById(com.tencent.mm.R.id.tenpay_push_down).setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.l7(this));
        o();
    }

    public static boolean f() {
        gm0.j1.i();
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINGER_PRINT_IS_FORCE_PWD_MODE_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        if (m17 != null) {
            return ((java.lang.Boolean) m17).booleanValue();
        }
        return false;
    }

    public static void k(boolean z17) {
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINGER_PRINT_IS_FORCE_PWD_MODE_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z17));
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.i0
    public void M0() {
        this.N = false;
        c01.z1.I();
    }

    public final void c() {
        this.A.setText(getContext().getString(com.tencent.mm.R.string.klv));
        this.E = 0;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f180672J = android.os.SystemClock.elapsedRealtime();
        android.view.View view = this.B;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "changeToPwd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "changeToPwd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f180683q.setVisibility(0);
        if (!this.f180677h.isShown()) {
            android.view.View view2 = this.f180677h;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "changeToPwd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "changeToPwd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f180679m.setText(com.tencent.mm.R.string.kwv);
        k(true);
        this.K = 0;
        this.L = "";
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11977, 1, 0, 0, 0, 0, 1);
        com.tencent.mm.wallet_core.ui.r1.q0(29, 1);
        h();
    }

    @Override // com.tencent.mm.ui.widget.dialog.k2, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            super.dismiss();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletPwdCustomDialog", "dismiss exception, e = " + e17.getMessage());
        }
        h();
        this.f180692z.a();
        com.tencent.mm.wallet_core.ui.r1.p0(this.f180683q, this.f180676g);
    }

    public void e() {
        k(false);
        android.content.DialogInterface.OnClickListener onClickListener = this.f180690x;
        if (onClickListener != null) {
            onClickListener.onClick(this, 0);
        }
        dismiss();
        if (this.f180684r != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPwdCustomDialog", "doOk use_touch: %s soterAuthReq: %s ", java.lang.Integer.valueOf(this.K), this.L);
            com.tencent.mm.plugin.wallet_core.ui.u7 u7Var = this.f180684r;
            java.lang.String text = this.f180683q.getText();
            int i17 = this.K == 1 ? 1 : 0;
            java.lang.String str = this.L;
            com.tencent.mm.plugin.wallet.pay.ui.u uVar = (com.tencent.mm.plugin.wallet.pay.ui.u) u7Var;
            uVar.getClass();
            com.tencent.mm.plugin.wallet.pay.ui.WalletPayCustomUI walletPayCustomUI = uVar.f178810a;
            r45.an6 an6Var = walletPayCustomUI.f178690d;
            walletPayCustomUI.doSceneProgress(new ss4.c0(text, an6Var.f370159g, an6Var.f370156d, an6Var.f370157e, an6Var.f370158f, an6Var.f370160h, i17, str, ""), true);
        }
        if (this.f180672J < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletPwdCustomDialog", "hy: not set update mode time yet. abandon");
            return;
        }
        int i18 = this.E;
        if (i18 == 0) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(686L, 0L, 1L, false);
            long j17 = this.f180672J;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            g0Var.idkeyStat(686L, 1L, android.os.SystemClock.elapsedRealtime() - j17, false);
            return;
        }
        if (i18 == 1) {
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.idkeyStat(686L, 2L, 1L, false);
            long j18 = this.f180672J;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            g0Var2.idkeyStat(686L, 3L, android.os.SystemClock.elapsedRealtime() - j18, false);
        }
    }

    public final void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPwdCustomDialog", "hy: send release FPManager");
        new com.tencent.mm.autogen.events.ReleaseFingerPrintAuthEvent().e();
    }

    public final void i() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPwdCustomDialog", "reqFingerPrintAuth %s", com.tencent.mm.sdk.platformtools.z3.b(true));
        re4.n.b();
        com.tencent.mm.autogen.events.OpenFingerPrintAuthEvent openFingerPrintAuthEvent = new com.tencent.mm.autogen.events.OpenFingerPrintAuthEvent();
        am.on onVar = openFingerPrintAuthEvent.f54595g;
        onVar.f7563a = null;
        onVar.f7564b = 1;
        onVar.f7565c = new com.tencent.mm.plugin.wallet_core.ui.q7(this, openFingerPrintAuthEvent);
        openFingerPrintAuthEvent.b(android.os.Looper.getMainLooper());
    }

    public final void o() {
        boolean z17;
        boolean z18;
        this.G = 0;
        this.A.setVisibility(8);
        android.view.View view = this.B;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "updateFingerPrintMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "updateFingerPrintMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f180672J = android.os.SystemClock.elapsedRealtime();
        at4.x1 fj6 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj();
        pz2.a aVar = (pz2.a) gm0.j1.s(pz2.a.class);
        if (fj6 != null) {
            mz2.a aVar2 = (mz2.a) aVar;
            if (aVar2.a()) {
                z17 = aVar2.L2();
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPwdCustomDialog", "hy: soter key status: %b", java.lang.Boolean.valueOf(z17));
                this.K = 0;
                this.L = "";
                boolean z27 = aVar == null && aVar.Ic() && !aVar.H4();
                z18 = aVar == null && ((mz2.a) aVar).a();
                if (!z18 && z27 && this.F && !f()) {
                    this.A.setVisibility(0);
                    this.A.setText(getContext().getString(com.tencent.mm.R.string.kwy));
                    this.E = 1;
                    android.view.View view2 = this.B;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "updateFingerPrintMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "updateFingerPrintMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.D.setVisibility(0);
                    this.f180683q.setVisibility(8);
                    android.view.View view3 = this.f180677h;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "updateFingerPrintMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "updateFingerPrintMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f180679m.setText(com.tencent.mm.R.string.kwq);
                    this.K = 1;
                    i();
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11977, 1, 1, 0, 0, 0, 0);
                } else if (!z18 && z27 && this.F && f()) {
                    this.A.setText(getContext().getString(com.tencent.mm.R.string.klv));
                    this.A.setVisibility(0);
                    this.E = 0;
                    android.view.View view4 = this.B;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "updateFingerPrintMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "updateFingerPrintMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    this.f180683q.setVisibility(0);
                    if (!this.f180677h.isShown()) {
                        android.view.View view5 = this.f180677h;
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        arrayList5.add(0);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "updateFingerPrintMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                        yj0.a.f(view5, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdCustomDialog", "updateFingerPrintMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    this.f180679m.setText(com.tencent.mm.R.string.kwv);
                    this.K = 0;
                    this.L = "";
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11977, 1, 0, 0, 0, 0, 0);
                    com.tencent.mm.wallet_core.ui.r1.q0(8, 1);
                } else {
                    this.K = 0;
                    this.L = "";
                    this.A.setVisibility(8);
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11977, 0, 0, 0, 0, 0, 0);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletPwdCustomDialog", "isOpenTouch:" + z18 + ",  isDeviceSupport:" + z27 + ", use_pay_touch:" + this.F + ", isForcePwdMode:" + f());
                this.A.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.m7(this));
            }
        }
        z17 = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPwdCustomDialog", "hy: soter key status: %b", java.lang.Boolean.valueOf(z17));
        this.K = 0;
        this.L = "";
        if (aVar == null) {
        }
        if (aVar == null) {
        }
        if (!z18) {
        }
        if (!z18) {
        }
        this.K = 0;
        this.L = "";
        this.A.setVisibility(8);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11977, 0, 0, 0, 0, 0, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPwdCustomDialog", "isOpenTouch:" + z18 + ",  isDeviceSupport:" + z27 + ", use_pay_touch:" + this.F + ", isForcePwdMode:" + f());
        this.A.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.m7(this));
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.i0
    public void onActivityPause() {
        this.N = true;
        if (!c01.z1.I() && this.E == 1) {
            c();
        }
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f180673d);
        ju5.n.c().b();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            android.content.DialogInterface.OnCancelListener onCancelListener = this.f180691y;
            if (onCancelListener != null) {
                onCancelListener.onCancel(this);
            }
            com.tencent.mm.plugin.wallet_core.ui.t7 t7Var = this.f180689w;
            if (t7Var != null) {
                ((com.tencent.mm.plugin.wallet.pay.ui.w) t7Var).f178814a.finish();
            }
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z17) {
        super.setCancelable(z17);
        setCanceledOnTouchOutside(z17);
    }
}
