package dg3;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dg3.k f232321d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(dg3.k kVar) {
        super(1);
        this.f232321d = kVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String username = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(username, "username");
        dg3.o oVar = this.f232321d.f232334f;
        if (oVar != null) {
            oVar.b(dg3.q.f232341e, username);
        }
        return jz5.f0.f302826a;
    }
}
