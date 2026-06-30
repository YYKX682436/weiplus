package sc2;

/* loaded from: classes2.dex */
public final class q5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406170d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f406171e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406172f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sc2.d6 f406173g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f406174h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(android.view.View view, r45.h32 h32Var, java.lang.String str, sc2.d6 d6Var, xc2.p0 p0Var) {
        super(0);
        this.f406170d = view;
        this.f406171e = h32Var;
        this.f406172f = str;
        this.f406173g = d6Var;
        this.f406174h = p0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.h32 h32Var = this.f406171e;
        java.lang.String str = this.f406172f;
        sc2.d6 d6Var = this.f406173g;
        xc2.p0 p0Var = this.f406174h;
        android.content.Context context = this.f406170d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        sc2.d6.T(h32Var, str, d6Var, p0Var, context, 2, this.f406170d);
        return jz5.f0.f302826a;
    }
}
