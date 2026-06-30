package sc2;

/* loaded from: classes2.dex */
public final class v1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.f2 f406297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f406298e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f406299f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(sc2.f2 f2Var, android.view.ViewGroup viewGroup, android.view.ViewGroup viewGroup2) {
        super(0);
        this.f406297d = f2Var;
        this.f406298e = viewGroup;
        this.f406299f = viewGroup2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sc2.f2 f2Var = this.f406297d;
        android.view.ViewGroup viewGroup = this.f406298e;
        android.view.ViewGroup viewGroup2 = this.f406299f;
        ad2.h.F(f2Var, viewGroup, viewGroup2, 250L, null, new sc2.u1(f2Var, viewGroup, viewGroup2), 8, null);
        return jz5.f0.f302826a;
    }
}
