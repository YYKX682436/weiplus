package kt3;

/* loaded from: classes10.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kt3.l f311990d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kt3.l lVar) {
        super(1);
        this.f311990d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ct0.b it = (ct0.b) obj;
        kotlin.jvm.internal.o.g(it, "it");
        kt3.l lVar = this.f311990d;
        bi3.j jVar = lVar.f311999s;
        if (jVar != null) {
            jVar.a(false);
        }
        at0.n nVar = lVar.f311996p;
        if (nVar != null) {
            nVar.e();
        }
        return jz5.f0.f302826a;
    }
}
