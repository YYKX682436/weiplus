package nu0;

/* loaded from: classes5.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f339941d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f339942e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(nu0.b4 b4Var, int i17) {
        super(0);
        this.f339941d = b4Var;
        this.f339942e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f339942e;
        nu0.b4 b4Var = this.f339941d;
        nu0.b4.d7(b4Var, i17);
        java.lang.Runnable task = b4Var.f339889x0;
        kotlin.jvm.internal.o.g(task, "task");
        com.tencent.mm.sdk.platformtools.u3.i(task, 3000L);
        return jz5.f0.f302826a;
    }
}
