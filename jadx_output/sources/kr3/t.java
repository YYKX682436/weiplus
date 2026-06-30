package kr3;

/* loaded from: classes11.dex */
public abstract class t extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f311476d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.FlowLayout f311477e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f311478f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f311479g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f311480h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f311481i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f311482m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f311483n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f311484o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f311485p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f311486q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f311481i = jz5.h.b(new kr3.r(this));
        this.f311482m = jz5.h.b(new kr3.s(this));
        this.f311483n = jz5.h.b(new kr3.l(activity));
        this.f311484o = jz5.h.b(new kr3.k(this));
        this.f311485p = jz5.h.b(new kr3.q(this));
        this.f311486q = jz5.h.b(new kr3.m(this));
    }

    public void O6() {
    }

    public void P6(xg3.q0 op6, com.tencent.mm.modelbase.f cgiBack) {
        kotlin.jvm.internal.o.g(op6, "op");
        kotlin.jvm.internal.o.g(cgiBack, "cgiBack");
    }

    public final boolean Q6() {
        com.tencent.mm.contact.o U6 = U6();
        if (U6 == null) {
            return false;
        }
        return ((tc0.s) ((uc0.o) i95.n0.c(uc0.o.class))).Bi(((yq3.v) U6).k() ? 2 : 1);
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

    public final com.tencent.mm.contact.o U6() {
        return (com.tencent.mm.contact.o) ((jz5.n) this.f311483n).getValue();
    }

    public java.lang.String V6() {
        return "BaseRemarkUI";
    }

    public xg3.q0 W6() {
        return null;
    }

    public final boolean X6() {
        return ((java.lang.Boolean) ((jz5.n) this.f311482m).getValue()).booleanValue();
    }

    public lr3.a Y6() {
        return null;
    }

    public abstract boolean Z6();

    public boolean a7() {
        return true;
    }

    public abstract android.view.View b7(java.lang.String str, com.tencent.mm.contact.o oVar);

    public void c7() {
    }

    public void d7() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        kr3.q1 q1Var = (kr3.q1) pf5.z.f353948a.a(activity).a(kr3.q1.class);
        q1Var.getClass();
        ym5.a1.f(new kr3.h1(q1Var));
    }

    public void e7() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        boolean z17 = ((kr3.q1) pf5.z.f353948a.a(activity).a(kr3.q1.class)).f311456m;
        java.lang.Long g76 = g7();
        if (g76 != null) {
            long longValue = g76.longValue();
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

    public void f7(com.tencent.mm.autogen.mmdata.rpt.RemarkTagOperateLogStruct struct) {
        kotlin.jvm.internal.o.g(struct, "struct");
    }

    @Override // pf5.p
    public android.view.View findViewById(int i17) {
        android.view.View findViewById;
        android.view.View view = this.f311479g;
        return (view == null || (findViewById = view.findViewById(i17)) == null) ? getActivity().findViewById(i17) : findViewById;
    }

    public java.lang.Long g7() {
        return null;
    }

    public final java.lang.String getUsername() {
        return (java.lang.String) ((jz5.n) this.f311481i).getValue();
    }

    public boolean h7() {
        return true;
    }

    public int i7() {
        return -1;
    }

    public abstract int k7();

    @Override // com.tencent.mm.ui.component.UIComponent
    public boolean onClickDialogSpaceOnHalfScreenMode() {
        return Z6();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        d7();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        super.onCreateBefore(bundle);
        if (X6()) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
            if (mMActivity != null) {
                mMActivity.applyHalfScreenActionbarHeight();
                mMActivity.setMMTitle(k7());
            }
        }
    }
}
