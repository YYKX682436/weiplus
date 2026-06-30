package sc2;

/* loaded from: classes2.dex */
public final class x3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.z3 f406358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f406359e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ad2.h f406360f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406361g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(sc2.z3 z3Var, long j17, ad2.h hVar, android.view.View view) {
        super(0);
        this.f406358d = z3Var;
        this.f406359e = j17;
        this.f406360f = hVar;
        this.f406361g = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.wf6 wf6Var;
        ad2.h hVar = this.f406360f;
        int integer = (hVar == null || (wf6Var = hVar.f3149m) == null) ? -1 : wf6Var.getInteger(2);
        java.util.HashMap hashMap = sc2.z3.f406412z;
        this.f406358d.G(this.f406359e, integer);
        this.f406360f.f(400L, this.f406361g, true, null);
        return jz5.f0.f302826a;
    }
}
