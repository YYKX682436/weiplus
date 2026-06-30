package kr3;

/* loaded from: classes11.dex */
public abstract class j extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f311389d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.FlowLayout f311390e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f311391f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f311392g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f311393h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f311394i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f311395m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f311396n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f311397o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f311398p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f311399q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f311394i = jz5.h.b(new kr3.h(this));
        this.f311395m = jz5.h.b(new kr3.i(this));
        this.f311396n = jz5.h.b(new kr3.b(this));
        this.f311397o = jz5.h.b(new kr3.a(this));
        this.f311398p = jz5.h.b(new kr3.g(this));
        this.f311399q = jz5.h.b(new kr3.c(this));
    }

    public void O6() {
    }

    public void P6(xg3.q0 op6, com.tencent.mm.modelbase.f cgiBack) {
        kotlin.jvm.internal.o.g(op6, "op");
        kotlin.jvm.internal.o.g(cgiBack, "cgiBack");
    }

    public final boolean Q6() {
        com.tencent.mm.storage.z3 U6 = U6();
        if (U6 == null) {
            return false;
        }
        return ((tc0.s) ((uc0.o) i95.n0.c(uc0.o.class))).Bi(U6.r2() ? 2 : 1);
    }

    public java.lang.Object R6(kotlin.coroutines.Continuation continuation) {
        return java.lang.Boolean.TRUE;
    }

    public java.lang.Object S6(kotlin.coroutines.Continuation continuation) {
        return jz5.f0.f302826a;
    }

    public void T6(yz5.l onResult) {
        kotlin.jvm.internal.o.g(onResult, "onResult");
        onResult.invoke(0);
    }

    public final com.tencent.mm.storage.z3 U6() {
        return (com.tencent.mm.storage.z3) ((jz5.n) this.f311396n).getValue();
    }

    public java.lang.String V6() {
        return "BaseRemarkUI";
    }

    public final com.tencent.mm.storage.z3 W6() {
        java.lang.String d17;
        com.tencent.mm.storage.z3 U6 = U6();
        if (U6 != null && (d17 = U6.d1()) != null) {
            boolean z17 = true;
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(d17, true);
            if (n17 != null) {
                java.lang.String d18 = n17.d1();
                if (d18 != null && !r26.n0.N(d18)) {
                    z17 = false;
                }
                if (!z17) {
                    return n17;
                }
            }
        }
        return U6();
    }

    public xg3.q0 X6() {
        return null;
    }

    public final boolean Y6() {
        return ((java.lang.Boolean) ((jz5.n) this.f311395m).getValue()).booleanValue();
    }

    public lr3.a Z6() {
        return null;
    }

    public abstract boolean a7();

    public boolean b7() {
        return true;
    }

    public abstract android.view.View c7(java.lang.String str, com.tencent.mm.storage.z3 z3Var);

    public void d7() {
    }

    public void e7() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        kr3.q0 q0Var = (kr3.q0) pf5.z.f353948a.a(activity).a(kr3.q0.class);
        q0Var.getClass();
        ym5.a1.f(new kr3.h0(q0Var));
    }

    public void f7() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        boolean z17 = ((kr3.q0) pf5.z.f353948a.a(activity).a(kr3.q0.class)).f311436m;
        java.lang.Long h76 = h7();
        if (h76 != null) {
            long longValue = h76.longValue();
            if (longValue < 0) {
                return;
            }
            jz5.l[] lVarArr = new jz5.l[4];
            lVarArr[0] = new jz5.l("profile_half_screen_source", java.lang.Long.valueOf(longValue));
            lVarArr[1] = new jz5.l("half_screen_exit_type", java.lang.Integer.valueOf(z17 ? 1 : 2));
            lVarArr[2] = new jz5.l("chat_name", getUsername());
            lVarArr[3] = new jz5.l("finish_is_revise", z17 ? 1 : null);
            java.util.Map l17 = kz5.c1.l(lVarArr);
            com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.BaseRemarkUI", "username(" + getUsername() + "), reportMap: " + l17);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("page_unexp", l17, 34575);
        }
    }

    @Override // pf5.p
    public android.view.View findViewById(int i17) {
        android.view.View findViewById;
        android.view.View view = this.f311392g;
        return (view == null || (findViewById = view.findViewById(i17)) == null) ? getActivity().findViewById(i17) : findViewById;
    }

    public void g7(com.tencent.mm.autogen.mmdata.rpt.RemarkTagOperateLogStruct struct) {
        kotlin.jvm.internal.o.g(struct, "struct");
    }

    public final java.lang.String getUsername() {
        return (java.lang.String) ((jz5.n) this.f311394i).getValue();
    }

    public java.lang.Long h7() {
        return null;
    }

    public boolean i7() {
        return true;
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.layout.f487918bk).disable(com.tencent.mm.R.id.actionbar_up_indicator);
    }

    public int k7() {
        return -1;
    }

    public abstract int l7();

    @Override // com.tencent.mm.ui.component.UIComponent
    public boolean onClickDialogSpaceOnHalfScreenMode() {
        return a7();
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        e7();
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig, com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        super.onCreateBefore(bundle);
        if (Y6()) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
            if (mMActivity != null) {
                mMActivity.applyHalfScreenActionbarHeight();
                mMActivity.setMMTitle(l7());
            }
        }
    }
}
