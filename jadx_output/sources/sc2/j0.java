package sc2;

/* loaded from: classes2.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f405977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f405978e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.t01 f405979f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(in5.s0 s0Var, sc2.h1 h1Var, r45.t01 t01Var) {
        super(0);
        this.f405977d = s0Var;
        this.f405978e = h1Var;
        this.f405979f = t01Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        in5.s0 s0Var = this.f405977d;
        android.view.View p17 = s0Var.p(com.tencent.mm.R.id.f484486ee3);
        if (p17 != null) {
            p17.post(new sc2.i0(this.f405978e, s0Var, this.f405979f));
        }
        return jz5.f0.f302826a;
    }
}
