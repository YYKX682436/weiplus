package sc2;

/* loaded from: classes2.dex */
public final class d0 extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f405820g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f405821h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f405822i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f405823m;

    public d0(in5.s0 s0Var, sc2.h1 h1Var, android.view.View view, xc2.p0 p0Var) {
        this.f405820g = s0Var;
        this.f405821h = h1Var;
        this.f405822i = view;
        this.f405823m = p0Var;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        if ((ev6 instanceof ec2.f) && ((ec2.f) ev6).f250959d == 19) {
            in5.s0 s0Var = this.f405820g;
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
                n17.d(this);
            }
            this.f405821h.S(s0Var, this.f405822i, this.f405823m);
        }
    }
}
