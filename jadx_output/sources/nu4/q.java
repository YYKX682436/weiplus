package nu4;

/* loaded from: classes7.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nu4.b0 f340273e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340274f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.lang.String str, nu4.b0 b0Var, java.lang.String str2) {
        super(1);
        this.f340272d = str;
        this.f340273e = b0Var;
        this.f340274f = str2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String prefetchId = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(prefetchId, "prefetchId");
        java.lang.String str2 = this.f340272d;
        if (str2 == null || r26.n0.N(str2)) {
            str = "";
        } else {
            str = "," + str2;
        }
        lu4.c.u(this.f340273e, this.f340274f, "{target:'" + prefetchId + '\'' + str + '}', null, 4, null);
        return jz5.f0.f302826a;
    }
}
