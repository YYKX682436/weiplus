package kz0;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f313798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f313799e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f313800f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(yz5.l lVar, n0.v2 v2Var, n0.v2 v2Var2) {
        super(0);
        this.f313798d = lVar;
        this.f313799e = v2Var;
        this.f313800f = v2Var2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kz0.a aVar = kz0.a.f313644i;
        int i17 = kz0.k1.f313767a;
        n0.v2 v2Var = this.f313799e;
        v2Var.setValue(aVar);
        this.f313800f.setValue(java.lang.Boolean.TRUE);
        this.f313798d.invoke((kz0.a) v2Var.getValue());
        return jz5.f0.f302826a;
    }
}
