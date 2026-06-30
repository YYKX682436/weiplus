package sc2;

/* loaded from: classes2.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f405847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f405848e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f405849f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f405850g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(sc2.h1 h1Var, in5.s0 s0Var, android.view.View view, xc2.p0 p0Var) {
        super(0);
        this.f405847d = h1Var;
        this.f405848e = s0Var;
        this.f405849f = view;
        this.f405850g = p0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f405849f;
        sc2.h1 h1Var = this.f405847d;
        java.lang.String str = h1Var.f405928w;
        com.tencent.mars.xlog.Log.i(str, "showToast");
        xc2.p0 p0Var = this.f405850g;
        r45.t01 N = h1Var.N(p0Var);
        if (N == null) {
            com.tencent.mars.xlog.Log.w(str, "showToast, getCardStyle is null");
        } else {
            sc2.q8 q8Var = p0Var.f453233J;
            if (q8Var != null) {
                q8Var.f406177a = true;
            }
            in5.s0 s0Var = this.f405848e;
            android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.tencent.mm.R.id.tcp);
            android.view.ViewGroup viewGroup = h1Var.H;
            if (viewGroup != null) {
                h1Var.K(viewGroup, 0);
            }
            textView.setText(N.getString(12));
            com.tencent.mars.xlog.Log.i(str, "startShowCardCountdown");
            kotlinx.coroutines.r2 r2Var = h1Var.B;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            h1Var.B = kotlinx.coroutines.l.d((kotlinx.coroutines.y0) ((jz5.n) h1Var.A).getValue(), null, null, new sc2.g1(h1Var, s0Var, view, p0Var, null), 3, null);
            sc2.f1 f1Var = new sc2.f1(h1Var);
            h1Var.f405927p1 = f1Var;
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            java.lang.Object a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            fc2.c n17 = zy2.ra.n1((zy2.ra) a17, 0, 1, null);
            if (n17 != null) {
                n17.a(f1Var);
            }
        }
        return jz5.f0.f302826a;
    }
}
