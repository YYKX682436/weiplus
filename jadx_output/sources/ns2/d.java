package ns2;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns2.b f339375d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.m70 f339376e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ns2.b bVar, r45.m70 m70Var) {
        super(0);
        this.f339375d = bVar;
        this.f339376e = m70Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        i95.m c17 = i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        s40.w0 w0Var = (s40.w0) c17;
        ns2.b bVar = this.f339375d;
        s40.w0.z5(w0Var, bVar.f339355a, this.f339376e, bVar.f339358d, bVar.f339356b, null, 16, null);
        return jz5.f0.f302826a;
    }
}
