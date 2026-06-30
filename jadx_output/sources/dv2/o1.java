package dv2;

/* loaded from: classes8.dex */
public class o1 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public int f243917d;

    /* renamed from: e, reason: collision with root package name */
    public int f243918e;

    /* renamed from: f, reason: collision with root package name */
    public int f243919f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.assist.g9 f243920g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.assist.m8 f243921h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.assist.h9 f243922i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f243923m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f243924n;

    /* renamed from: o, reason: collision with root package name */
    public final qd2.j1 f243925o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f243925o = new qd2.j1();
    }

    public static final void O6(dv2.o1 o1Var, com.tencent.mm.plugin.finder.assist.m8 m8Var, com.tencent.mm.plugin.finder.assist.h9 h9Var) {
        o1Var.f243922i = h9Var;
        m8Var.c(h9Var);
    }

    public final void P6(com.tencent.mm.plugin.finder.assist.g9 preCheckInfo, com.tencent.mm.plugin.finder.assist.m8 preCheckCallback) {
        kotlin.jvm.internal.o.g(preCheckInfo, "preCheckInfo");
        kotlin.jvm.internal.o.g(preCheckCallback, "preCheckCallback");
        boolean Q6 = Q6();
        com.tencent.mars.xlog.Log.i("FinderSafePreCheckUIC", "[doPreCheck] enable:" + Q6);
        if (Q6) {
            boolean z17 = true;
            if (this.f243919f != 1 && (this.f243917d != 0 || this.f243918e != 0)) {
                z17 = false;
            }
            com.tencent.mars.xlog.Log.i("FinderSafePreCheckUIC", "[isNeedCheck] isNeed:" + z17 + " appearTimes:" + this.f243919f + " showTipsDialogCount:" + this.f243917d + " jumpH5Count:" + this.f243918e);
            if (z17) {
                this.f243920g = preCheckInfo;
                this.f243921h = preCheckCallback;
                T6(preCheckInfo, preCheckCallback);
                return;
            }
        }
        com.tencent.mm.plugin.finder.assist.h9 h9Var = new com.tencent.mm.plugin.finder.assist.h9(true, false, null, 4, null);
        this.f243922i = h9Var;
        preCheckCallback.c(h9Var);
    }

    public boolean Q6() {
        return false;
    }

    public int R6() {
        return 0;
    }

    public int S6() {
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void T6(com.tencent.mm.plugin.finder.assist.g9 preCheckInfo, com.tencent.mm.plugin.finder.assist.m8 preCheckCallback) {
        com.tencent.mm.protobuf.g a17;
        kotlin.jvm.internal.o.g(preCheckInfo, "preCheckInfo");
        kotlin.jvm.internal.o.g(preCheckCallback, "preCheckCallback");
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        androidx.appcompat.app.AppCompatActivity context = getActivity();
        int R6 = R6();
        com.tencent.mm.protobuf.g gVar = this.f243923m;
        int S6 = S6();
        dv2.n1 n1Var = new dv2.n1(this, c0Var, preCheckCallback);
        this.f243925o.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doPreCheck] utilsCmdId:");
        sb6.append(R6);
        sb6.append(" desc:");
        java.lang.String str = preCheckInfo.f102205a;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("FinderSafePreCheckHelper", sb6.toString());
        r45.hx0 hx0Var = new r45.hx0();
        hx0Var.set(0, java.lang.Integer.valueOf(R6));
        if (R6 == 1) {
            r45.db5 db5Var = new r45.db5();
            db5Var.set(0, str);
            byte[] bArr = preCheckInfo.f102206b;
            db5Var.set(1, bArr != null ? pm0.b0.h(bArr) : null);
            db5Var.set(2, preCheckInfo.f102207c);
            a17 = hc2.b.a(db5Var);
        } else if (R6 != 2) {
            a17 = null;
        } else {
            r45.a66 a66Var = new r45.a66();
            a66Var.set(0, str);
            a17 = hc2.b.a(a66Var);
        }
        hx0Var.set(1, a17);
        db2.c4 c4Var = new db2.c4(5, null, 0, hx0Var, xy2.c.d(context), null, gVar, true, 38, null);
        pq5.g l17 = c4Var.l();
        l17.f(context instanceof im5.b ? (im5.b) context : null);
        l17.K(new qd2.i1(n1Var, preCheckInfo, context, R6, S6));
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("FinderSafePrecheckMaxDuration", 2000);
        com.tencent.mars.xlog.Log.i("FinderConfig", "FINDER_SAFE_PRE_CHECK_MAX_DURATION maxDuration = " + b17);
        long j17 = (long) b17;
        com.tencent.mars.xlog.Log.i("FinderSafePreCheckUIC", "[preCheckInner] maxDuration:" + j17);
        if (j17 > 0) {
            pf5.e.launchUI$default(this, null, null, new dv2.m1(j17, c0Var, c4Var, this, preCheckCallback, null), 3, null);
        }
    }

    public final void U6() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f243924n;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(getActivity(), "", getString(com.tencent.mm.R.string.f490468vx), true, false, null);
        this.f243924n = Q;
        if (Q != null) {
            Q.show();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("FinderSafePreCheckUIC", "requestCode:" + i17 + " resultCode:" + i18 + " appearTimes:" + this.f243919f);
        if (i17 == S6()) {
            this.f243918e++;
            com.tencent.mm.plugin.finder.storage.ad0 ad0Var = com.tencent.mm.plugin.finder.storage.ad0.f126402a;
            if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.F).getValue()).r()).booleanValue()) {
                com.tencent.mars.xlog.Log.i("FinderSafePreCheckUIC", "[checkFinderUtils] start");
                U6();
                com.tencent.mm.plugin.finder.assist.g9 g9Var = this.f243920g;
                if (g9Var == null) {
                    g9Var = new com.tencent.mm.plugin.finder.assist.g9("", null, null, false, false, 30, null);
                }
                g9Var.f102208d = false;
                T6(g9Var, new dv2.k1(this));
                return;
            }
            if (this.f243919f == 1) {
                com.tencent.mars.xlog.Log.i("FinderSafePreCheckUIC", "[checkRealName] start");
                U6();
                pq5.g l17 = new db2.u2(3, "", xy2.c.e(getContext()), null, 8, null).l();
                android.content.ComponentCallbacks2 context = getContext();
                l17.f(context instanceof im5.b ? (im5.b) context : null);
                l17.K(new dv2.l1(this));
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f243924n;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f243924n = null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f243925o = new qd2.j1();
    }
}
