package qe5;

/* loaded from: classes12.dex */
public final class n1 extends wm3.a implements bt3.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f362155d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f362156e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f362157f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f362158g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f362155d = jz5.h.b(new qe5.m1(this));
        jz5.l lVar = new jz5.l(2, com.tencent.mm.ui.report.m.f209693f);
        jz5.l lVar2 = new jz5.l(5, com.tencent.mm.ui.report.m.f209692e);
        com.tencent.mm.ui.report.m mVar = com.tencent.mm.ui.report.m.f209694g;
        this.f362158g = kz5.c1.k(lVar, lVar2, new jz5.l(0, mVar), new jz5.l(3, mVar), new jz5.l(4, mVar));
    }

    @Override // bt3.q0
    public void D6(bt3.l0 l0Var) {
    }

    public final kd5.e T6() {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            return (kd5.e) Q6.getState();
        }
        return null;
    }

    public final em.d0 U6() {
        return (em.d0) ((jz5.n) this.f362155d).getValue();
    }

    public final boolean V6() {
        sc5.g gVar = sc5.g.f406572a;
        kd5.e T6 = T6();
        java.lang.String str = T6 != null ? T6.f306893x : null;
        kd5.e T62 = T6();
        java.lang.String str2 = T62 != null ? T62.C : null;
        if (gVar.c(str)) {
            return true ^ (str2 == null || str2.length() == 0) ? sc5.g.f406574c : sc5.g.f406573b;
        }
        return false;
    }

    public final void W6(int i17) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((qe5.z) pf5.z.f353948a.a(activity).a(qe5.z.class)).getClass();
    }

    public final void X6(int i17) {
        if (((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Ai(3)) {
            j75.f Q6 = Q6();
            if (Q6 != null) {
                Q6.B3(new kd5.j(i17));
                return;
            }
            return;
        }
        kd5.e T6 = T6();
        boolean z17 = false;
        if (T6 != null && T6.f306884o) {
            z17 = true;
        }
        if (!z17) {
            j75.f Q62 = Q6();
            if (Q62 != null) {
                Q62.B3(new kd5.j(i17));
                return;
            }
            return;
        }
        android.widget.Button g17 = U6().g();
        kotlin.jvm.internal.o.f(g17, "getDownloadOpenBtn(...)");
        com.tencent.mm.ui.kk.d(g17, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479734dr));
        U6().g().setVisibility(i17);
        U6().m().setVisibility(i17);
    }

    public final void Y6(int i17, boolean z17) {
        int i18 = 8;
        if (i17 == 8 && U6().f().getVisibility() == 8) {
            W6(4);
        } else if (i17 == 0 && U6().f().getVisibility() == 4) {
            W6(8);
        }
        if (i17 != U6().v().getVisibility()) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.File.FilePageLogicUIC", "setRoundProgressBar %s %s", valueOf, new com.tencent.mm.sdk.platformtools.z3());
            U6().v().setVisibility(i17);
        }
        if (i17 == 0) {
            U6().v().setVisibility(0);
            U6().v().setProgressColor(getContext().getResources().getColor(z17 ? com.tencent.mm.R.color.f478714f5 : com.tencent.mm.R.color.aaq));
            kd5.e T6 = T6();
            U6().v().setProgress(T6 != null ? T6.f306888s : 0);
        }
        U6().v().setOnClickListener(new qe5.l1(this, z17));
        android.widget.TextView q17 = U6().q();
        if (z17 && i17 == 0 && V6()) {
            i18 = 0;
        }
        q17.setVisibility(i18);
        b7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v35, types: [j75.f] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v37 */
    public final void Z6(kd5.u action) {
        kotlin.jvm.internal.o.g(action, "action");
        qe5.z0 z0Var = new qe5.z0(this);
        em.d0 U6 = U6();
        qe5.x0 x0Var = z0Var.f362226a;
        x0Var.a(8);
        U6.b().setVisibility(8);
        U6.p().setVisibility(8);
        U6.t().setVisibility(8);
        U6.k().setVisibility(8);
        U6.u().setVisibility(8);
        U6.a().setVisibility(8);
        U6.h().setVisibility(8);
        U6.s().setVisibility(8);
        U6.r().setVisibility(8);
        U6.x().setVisibility(8);
        X6(8);
        Y6(8, true);
        int i17 = action.f306912b;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.File.FilePageLogicUIC", "handleState %s %s", valueOf, new com.tencent.mm.sdk.platformtools.z3());
        int i18 = com.tencent.mm.R.string.cfb;
        switch (i17) {
            case 0:
                z0Var.a();
                break;
            case 1:
                em.d0 U62 = U6();
                U62.t().setVisibility(0);
                android.widget.TextView t17 = U62.t();
                kd5.e T6 = T6();
                oi3.g gVar = T6 != null ? T6.f306881i : null;
                if ((gVar != null && gVar.getInteger(gVar.f345617d + 9) == 1) == false) {
                    i18 = com.tencent.mm.R.string.cfa;
                }
                t17.setText(i18);
                U62.u().setVisibility(0);
                break;
            case 2:
                em.d0 U63 = U6();
                U63.t().setVisibility(0);
                U63.t().setText(com.tencent.mm.R.string.nhj);
                Y6(0, true);
                break;
            case 3:
            case 4:
                if (action.f306913c != 105) {
                    if (V6()) {
                        U6().p().setVisibility(0);
                        U6().k().setText(getString(com.tencent.mm.R.string.nhp));
                    } else {
                        U6().k().setText(getString(com.tencent.mm.R.string.nho));
                    }
                    U6().k().setVisibility(0);
                    x0Var.a(0);
                    break;
                } else {
                    U6().x().setVisibility(0);
                    break;
                }
            case 5:
                kd5.e T62 = T6();
                x0Var.b(false, T62 != null ? T62.f306892w : null);
                break;
            case 6:
                kd5.e T63 = T6();
                java.lang.String str = T63 != null ? T63.f306893x : null;
                ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).getClass();
                java.lang.String e17 = com.tencent.mm.pluginsdk.ui.tools.f.e(str);
                kotlin.jvm.internal.o.f(e17, "getMimeTypeByExt(...)");
                if ((e17.length() > 0) != false) {
                    kd5.e T64 = T6();
                    java.lang.String str2 = T64 != null ? T64.f306892w : null;
                    if (!(str2 != null ? r26.n0.B(str2, ".apk", false) : false)) {
                        X6(0);
                        androidx.appcompat.app.AppCompatActivity activity = getActivity();
                        kotlin.jvm.internal.o.g(activity, "activity");
                        ((qe5.z) pf5.z.f353948a.a(activity).a(qe5.z.class)).U6();
                        j75.f Q6 = Q6();
                        if (Q6 != null) {
                            Q6.B3(new kd5.w());
                            break;
                        }
                    } else {
                        em.d0 U64 = U6();
                        U64.s().setVisibility(0);
                        U64.r().setVisibility(0);
                        break;
                    }
                }
                break;
            case 7:
                kd5.e T65 = T6();
                x0Var.b(true, T65 != null ? T65.f306892w : null);
                break;
            case 8:
                em.d0 U65 = U6();
                U65.t().setVisibility(0);
                android.widget.TextView t18 = U65.t();
                kd5.e T66 = T6();
                oi3.g gVar2 = T66 != null ? T66.f306881i : null;
                if ((gVar2 != null && gVar2.getInteger(gVar2.f345617d + 9) == 1) == false) {
                    i18 = com.tencent.mm.R.string.cfa;
                }
                t18.setText(i18);
                Y6(0, false);
                break;
            case 9:
                em.d0 U66 = U6();
                if (U66.x().getVisibility() != 0) {
                    U66.x().setVisibility(0);
                    android.widget.Button x17 = U66.x();
                    kotlin.jvm.internal.o.f(x17, "getUploadContinueBtn(...)");
                    com.tencent.mm.ui.kk.d(x17, com.tencent.mm.ui.zk.e(getContext(), com.tencent.mm.R.dimen.f479657bu));
                }
                U66.x().setOnClickListener(new qe5.y0(this));
                break;
            default:
                z0Var.a();
                break;
        }
        a7();
        if (this.f362157f) {
            return;
        }
        this.f362157f = true;
        com.tencent.mm.ui.report.m mVar = (com.tencent.mm.ui.report.m) this.f362158g.get(java.lang.Integer.valueOf(i17));
        if (mVar == null) {
            mVar = com.tencent.mm.ui.report.m.f209695h;
        }
        ?? Q62 = Q6();
        if (Q62 != null) {
            kd5.n nVar = new kd5.n(com.tencent.mm.ui.report.p.f209729q);
            nVar.f306908g = mVar;
            Q62.B3(nVar);
        }
    }

    public final void a7() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((qe5.z) pf5.z.f353948a.a(activity).a(qe5.z.class)).i7();
    }

    public final void b7() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((qe5.z) pf5.z.f353948a.a(activity).a(qe5.z.class)).m7();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e48;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        kd5.e T6 = T6();
        boolean z17 = T6 != null ? T6.f306876J : true;
        jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        ((ht.a) vVar).getClass();
        com.tencent.mm.pluginsdk.ui.tools.f.f(activity, i17, i18, intent, z17, com.tencent.mm.R.string.brq, com.tencent.mm.R.string.brr, 1);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new qe5.k1(this));
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null) {
            P6.setMMTitle("");
            P6.setActionbarColor(getActivity().getResources().getColor(com.tencent.mm.R.color.aaw));
            P6.hideActionbarLine();
            P6.setBackBtn(new qe5.a1(this));
            P6.setRequestedOrientation(1);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
    }
}
