package kz0;

/* loaded from: classes5.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f313804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f313805e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f313806f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(yz5.l lVar, n0.v2 v2Var, n0.v2 v2Var2) {
        super(1);
        this.f313804d = lVar;
        this.f313805e = v2Var;
        this.f313806f = v2Var2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String templateId = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(templateId, "templateId");
        kz0.a aVar = kz0.a.f313646n;
        int i17 = kz0.k1.f313767a;
        n0.v2 v2Var = this.f313805e;
        v2Var.setValue(aVar);
        this.f313806f.setValue(java.lang.Boolean.TRUE);
        this.f313804d.invoke((kz0.a) v2Var.getValue());
        return jz5.f0.f302826a;
    }
}
