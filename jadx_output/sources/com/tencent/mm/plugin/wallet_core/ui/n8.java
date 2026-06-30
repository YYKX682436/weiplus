package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class n8 extends com.tencent.mm.ui.widget.dialog.k2 implements com.tencent.mm.plugin.wallet_core.ui.i0 {

    /* renamed from: l1, reason: collision with root package name */
    public static final java.util.HashMap f180519l1 = new java.util.HashMap();
    public android.widget.TextView A;
    public android.view.View B;
    public android.widget.TextView C;
    public android.widget.Button D;
    public com.tencent.mm.plugin.wallet_core.ui.k8 E;
    public android.content.DialogInterface.OnCancelListener F;
    public com.tencent.mm.plugin.wallet_core.ui.g0 G;
    public com.tencent.mm.plugin.wallet_core.model.FavorPayInfo H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f180520J;
    public com.tencent.mm.plugin.wallet_core.model.Bankcard K;
    public final com.tencent.mm.plugin.wallet_core.utils.m L;
    public android.widget.TextView M;
    public android.view.View N;
    public android.widget.TextView P;
    public android.widget.ImageView Q;
    public int R;
    public int S;
    public boolean T;
    public int U;
    public int V;
    public android.view.animation.Animation W;
    public com.tencent.mm.pluginsdk.wallet.PayInfo X;
    public long Y;
    public android.content.Context Z;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f180521d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f180522e;

    /* renamed from: f, reason: collision with root package name */
    public com.tenpay.android.wechat.MyKeyboardWindow f180523f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f180524g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f180525h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f180526i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f180527m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f180528n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f180529o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout f180530p;

    /* renamed from: p0, reason: collision with root package name */
    public final byte[] f180531p0;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.applet.CdnImageView f180532q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f180533r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageView f180534s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView f180535t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.m8 f180536u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f180537v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f180538w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f180539x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f180540x0;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.ImageView f180541y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f180542y0;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f180543z;

    public n8(android.content.Context context, int i17) {
        super(context, com.tencent.mm.R.style.f494795wh);
        this.G = null;
        this.H = new com.tencent.mm.plugin.wallet_core.model.FavorPayInfo();
        this.I = false;
        this.f180520J = true;
        this.K = null;
        this.L = new com.tencent.mm.plugin.wallet_core.utils.m();
        this.R = 0;
        this.S = -1;
        this.T = false;
        this.U = 0;
        this.V = 0;
        this.W = null;
        this.Y = -1L;
        this.f180531p0 = new byte[0];
        this.f180540x0 = false;
        this.f180542y0 = false;
        this.Z = context;
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.d6q, null);
        this.f180521d = inflate;
        this.f180522e = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.pem);
        this.f180523f = (com.tenpay.android.wechat.MyKeyboardWindow) this.f180521d.findViewById(com.tencent.mm.R.id.tenpay_num_keyboard);
        this.f180524g = this.f180521d.findViewById(com.tencent.mm.R.id.o1v);
        this.f180525h = (android.widget.TextView) this.f180521d.findViewById(com.tencent.mm.R.id.cgi);
        this.f180526i = (android.widget.TextView) this.f180521d.findViewById(com.tencent.mm.R.id.pet);
        this.f180527m = (android.widget.TextView) this.f180521d.findViewById(com.tencent.mm.R.id.f484346dz0);
        android.widget.TextView textView = (android.widget.TextView) this.f180521d.findViewById(com.tencent.mm.R.id.klu);
        this.f180528n = textView;
        textView.getPaint().setFlags(16);
        this.f180529o = (android.widget.TextView) this.f180521d.findViewById(com.tencent.mm.R.id.aew);
        this.f180530p = (com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout) this.f180521d.findViewById(com.tencent.mm.R.id.f484339dy3);
        this.f180532q = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) this.f180521d.findViewById(com.tencent.mm.R.id.aek);
        this.f180537v = this.f180521d.findViewById(com.tencent.mm.R.id.dxq);
        this.f180533r = (android.widget.TextView) this.f180521d.findViewById(com.tencent.mm.R.id.f485976jr2);
        this.f180534s = (android.widget.ImageView) this.f180521d.findViewById(com.tencent.mm.R.id.bra);
        this.f180538w = this.f180521d.findViewById(com.tencent.mm.R.id.aei);
        this.f180539x = (android.widget.TextView) this.f180521d.findViewById(com.tencent.mm.R.id.mmy);
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.f180534s, com.tencent.mm.wallet_core.ui.r1.D(), null);
        this.f180535t = (com.tencent.mm.wallet_core.ui.formview.EditHintPasswdView) this.f180521d.findViewById(com.tencent.mm.R.id.hdh);
        this.f180541y = (android.widget.ImageView) this.f180521d.findViewById(com.tencent.mm.R.id.f485213gx4);
        this.M = (android.widget.TextView) this.f180521d.findViewById(com.tencent.mm.R.id.peh);
        this.N = this.f180521d.findViewById(com.tencent.mm.R.id.g5t);
        this.P = (android.widget.TextView) this.f180521d.findViewById(com.tencent.mm.R.id.g5w);
        this.Q = (android.widget.ImageView) this.f180521d.findViewById(com.tencent.mm.R.id.g5s);
        this.f180543z = (android.widget.TextView) this.f180521d.findViewById(com.tencent.mm.R.id.f483610bf1);
        this.A = (android.widget.TextView) this.f180521d.findViewById(com.tencent.mm.R.id.lhz);
        this.B = this.f180521d.findViewById(com.tencent.mm.R.id.dxc);
        this.C = (android.widget.TextView) this.f180521d.findViewById(com.tencent.mm.R.id.dxz);
        this.D = (android.widget.Button) this.f180521d.findViewById(com.tencent.mm.R.id.f484282do0);
        this.f180530p.setVisibility(8);
        com.tencent.mm.ui.bk.r0(this.f180526i.getPaint(), 0.8f);
        com.tencent.mm.ui.bk.r0(this.M.getPaint(), 0.8f);
        setCanceledOnTouchOutside(true);
        getWindow().setSoftInputMode(2);
        if (com.tencent.mm.wallet_core.ui.r1.P()) {
            getWindow().addFlags(8192);
        }
        qp5.p.b(this.f180535t);
        this.f180535t.setOnInputValidListener(new com.tencent.mm.plugin.wallet_core.ui.x7(this));
        this.f180535t.requestFocus();
        android.widget.TextView textView2 = (android.widget.TextView) this.f180521d.findViewById(com.tencent.mm.R.id.pet);
        if (textView2 != null) {
            textView2.setText(c01.z1.I() ? context.getString(com.tencent.mm.R.string.kww) : context.getString(com.tencent.mm.R.string.kwv));
        }
        android.widget.EditText editText = (android.widget.EditText) this.f180521d.findViewById(com.tencent.mm.R.id.pbn);
        com.tencent.mm.wallet_core.ui.r1.v0(editText);
        this.f180523f.setInputEditText(editText);
        com.tencent.mm.wallet_core.e eVar = new com.tencent.mm.wallet_core.e(true);
        this.f180523f.setSecureAccessibility(eVar);
        editText.setAccessibilityDelegate(eVar);
        com.tencent.mm.wallet_core.ui.r1.N(this.f180535t, this.f180523f);
        editText.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.y7(this));
        this.f180521d.findViewById(com.tencent.mm.R.id.tenpay_push_down).setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.z7(this));
        this.D.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.a8(this));
    }

    public static boolean f() {
        gm0.j1.i();
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINGER_PRINT_IS_FORCE_PWD_MODE_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
        if (m17 != null) {
            return ((java.lang.Boolean) m17).booleanValue();
        }
        return false;
    }

    public static void u(boolean z17) {
        gm0.j1.i();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINGER_PRINT_IS_FORCE_PWD_MODE_BOOLEAN_SYNC, java.lang.Boolean.valueOf(z17));
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x0c8d  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0ca1  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0450  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.mm.plugin.wallet_core.ui.n8 x(android.content.Context r32, boolean r33, com.tencent.mm.plugin.wallet_core.model.Orders r34, com.tencent.mm.plugin.wallet_core.model.FavorPayInfo r35, com.tencent.mm.plugin.wallet_core.model.Bankcard r36, com.tencent.mm.pluginsdk.wallet.PayInfo r37, java.lang.String r38, com.tencent.mm.plugin.wallet_core.ui.m8 r39, android.view.View.OnClickListener r40, android.content.DialogInterface.OnCancelListener r41) {
        /*
            Method dump skipped, instructions count: 3256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wallet_core.ui.n8.x(android.content.Context, boolean, com.tencent.mm.plugin.wallet_core.model.Orders, com.tencent.mm.plugin.wallet_core.model.FavorPayInfo, com.tencent.mm.plugin.wallet_core.model.Bankcard, com.tencent.mm.pluginsdk.wallet.PayInfo, java.lang.String, com.tencent.mm.plugin.wallet_core.ui.m8, android.view.View$OnClickListener, android.content.DialogInterface$OnCancelListener):com.tencent.mm.plugin.wallet_core.ui.n8");
    }

    public void A(boolean z17) {
        if (z17) {
            android.view.View view = this.f180538w;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "showBankcardDes", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "showBankcardDes", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f180538w;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "showBankcardDes", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "showBankcardDes", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.i0
    public void M0() {
        this.f180542y0 = false;
        c01.z1.I();
    }

    public final void c() {
        if (this.R == 1) {
            this.M.setText(com.tencent.mm.R.string.klv);
        } else {
            this.M.setText(com.tencent.mm.R.string.kln);
        }
        this.R = 0;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.Y = android.os.SystemClock.elapsedRealtime();
        android.view.View view = this.N;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "changeToPwd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "changeToPwd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.D.setVisibility(8);
        this.f180535t.setVisibility(0);
        if (!this.f180524g.isShown()) {
            android.view.View view2 = this.f180524g;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "changeToPwd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "changeToPwd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f180526i.setText(com.tencent.mm.R.string.kwv);
        u(true);
        this.X.f192125x = 0;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11977, 1, 0, 0, 0, 0, 1);
        com.tencent.mm.wallet_core.ui.r1.q0(29, 1);
        h();
    }

    @Override // com.tencent.mm.ui.widget.dialog.k2, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            super.dismiss();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletPwdDialog", "dismiss exception, e = " + e17.getMessage());
        }
        h();
        this.L.a();
        com.tencent.mm.wallet_core.ui.r1.p0(this.f180535t, this.f180523f);
    }

    public void e() {
        u(false);
        dismiss();
        com.tencent.mm.plugin.wallet_core.ui.m8 m8Var = this.f180536u;
        if (m8Var != null) {
            m8Var.a(this.f180535t.getText(), this.H, this.I);
        }
        if (this.Y < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletPwdDialog", "hy: not set update mode time yet. abandon");
            return;
        }
        int i17 = this.R;
        if (i17 == 0) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(686L, 0L, 1L, false);
            long j17 = this.Y;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            g0Var.idkeyStat(686L, 1L, android.os.SystemClock.elapsedRealtime() - j17, false);
            return;
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.idkeyStat(686L, 2L, 1L, false);
            long j18 = this.Y;
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            g0Var2.idkeyStat(686L, 3L, android.os.SystemClock.elapsedRealtime() - j18, false);
        }
    }

    public final void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletPwdDialog", "hy: send release FPManager");
        ((pz2.a) gm0.j1.s(pz2.a.class)).userCancel();
    }

    public final void i() {
        re4.n.b();
        com.tencent.mm.autogen.events.OpenFingerPrintAuthEvent openFingerPrintAuthEvent = new com.tencent.mm.autogen.events.OpenFingerPrintAuthEvent();
        java.lang.String str = this.X.f192114m;
        am.on onVar = openFingerPrintAuthEvent.f54595g;
        onVar.f7563a = str;
        onVar.f7564b = 1;
        onVar.f7565c = new com.tencent.mm.plugin.wallet_core.ui.g8(this, openFingerPrintAuthEvent);
        openFingerPrintAuthEvent.e();
    }

    public void k(boolean z17) {
        android.view.View findViewById = this.f180521d.findViewById(com.tencent.mm.R.id.ad7);
        if (findViewById != null) {
            if (z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "setBankCardRedDot", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "setBankCardRedDot", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f180540x0 = true;
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "setBankCardRedDot", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "setBankCardRedDot", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f180540x0 = false;
        }
    }

    public void o(com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        if (bankcard == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletPwdDialog", "setBankcardText bankcard == null");
            return;
        }
        if (bankcard.v0()) {
            this.f180532q.setImageResource(com.tencent.mm.R.drawable.ch9);
            return;
        }
        boolean D0 = bankcard.D0();
        com.tencent.mm.plugin.wallet_core.utils.m mVar = this.L;
        if (D0) {
            mVar.f(bankcard, this.f180532q);
            return;
        }
        if (!bankcard.A0()) {
            mVar.e(getContext(), bankcard, this.f180532q);
            return;
        }
        this.f180532q.setImageDrawable(m95.a.e(getContext().getResources(), com.tencent.mm.R.raw.honey_pay_bank_logo, 0.0f));
        if (com.tencent.mm.sdk.platformtools.t8.K0(bankcard.f179570i3)) {
            return;
        }
        this.f180532q.setUseSdcardCache(true);
        this.f180532q.setImgSavedPath(dt4.b.f243228a);
        this.f180532q.b(bankcard.f179570i3, 0, 0, com.tencent.mm.R.raw.honey_pay_bank_logo);
    }

    @Override // com.tencent.mm.plugin.wallet_core.ui.i0
    public void onActivityPause() {
        this.f180542y0 = true;
        if (!c01.z1.I() && this.R == 1) {
            c();
        }
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f180521d);
        ju5.n.c().b();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            android.content.DialogInterface.OnCancelListener onCancelListener = this.F;
            if (onCancelListener != null) {
                onCancelListener.onCancel(this);
            }
            com.tencent.mm.plugin.wallet_core.ui.k8 k8Var = this.E;
            if (k8Var != null) {
                ((com.tencent.mm.plugin.offline.ui.w0) k8Var).a();
            }
        }
        return super.onKeyUp(i17, keyEvent);
    }

    public void p(java.lang.CharSequence charSequence, android.view.View.OnClickListener onClickListener, boolean z17) {
        if (android.text.TextUtils.isEmpty(charSequence)) {
            android.view.View view = this.f180538w;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "setBankcardText", "(Ljava/lang/CharSequence;Landroid/view/View$OnClickListener;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "setBankcardText", "(Ljava/lang/CharSequence;Landroid/view/View$OnClickListener;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f180539x.setVisibility(8);
            return;
        }
        this.f180538w.setOnClickListener(onClickListener);
        this.f180529o.setText(charSequence);
        z(this.f180520J);
        if (z17) {
            android.view.View view2 = this.f180537v;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "setBankcardText", "(Ljava/lang/CharSequence;Landroid/view/View$OnClickListener;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "setBankcardText", "(Ljava/lang/CharSequence;Landroid/view/View$OnClickListener;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view3 = this.f180537v;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "setBankcardText", "(Ljava/lang/CharSequence;Landroid/view/View$OnClickListener;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "setBankcardText", "(Ljava/lang/CharSequence;Landroid/view/View$OnClickListener;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void r(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletPwdDialog", "ChargeFee is null");
            this.f180543z.setVisibility(8);
        } else {
            this.f180543z.setVisibility(0);
            this.f180543z.setText(str);
        }
    }

    public void s(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str2)) {
            this.f180533r.setVisibility(8);
        } else {
            this.f180533r.setVisibility(0);
            this.f180533r.setText(str2);
        }
        if (android.text.TextUtils.isEmpty(str)) {
            this.C.setVisibility(8);
        } else {
            this.C.setText(str);
            this.C.setVisibility(0);
        }
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z17) {
        super.setCancelable(z17);
        setCanceledOnTouchOutside(z17);
    }

    public void t(java.lang.String str, double d17) {
        if (android.text.TextUtils.isEmpty(str)) {
            this.f180527m.setVisibility(8);
            this.f180520J = true;
            z(true);
            return;
        }
        this.f180527m.setVisibility(0);
        this.f180527m.setText(str);
        if (d17 != 0.0d) {
            z(this.f180520J);
        } else {
            this.f180520J = false;
            z(false);
        }
    }

    public void w(android.content.DialogInterface.OnCancelListener onCancelListener) {
        android.widget.ImageView imageView = this.f180522e;
        if (imageView == null) {
            return;
        }
        this.F = onCancelListener;
        imageView.setVisibility(0);
        this.f180522e.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.j8(this, onCancelListener));
    }

    public final void z(boolean z17) {
        if (z17) {
            android.view.View view = this.f180538w;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "showBankCard", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "showBankCard", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f180539x.setVisibility(0);
            return;
        }
        android.view.View view2 = this.f180538w;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "showBankCard", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/wallet_core/ui/WalletPwdDialog", "showBankCard", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f180539x.setVisibility(8);
    }
}
