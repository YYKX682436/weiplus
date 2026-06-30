package ol4;

/* loaded from: classes14.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ol4.q f346163d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ol4.q qVar) {
        super(1);
        this.f346163d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String errorMsg = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(errorMsg, "errorMsg");
        ol4.q qVar = this.f346163d;
        qVar.r(true);
        ll4.a aVar = qVar.f346182d;
        if (aVar != null) {
            ((kl4.n) aVar).b(12, errorMsg);
        }
        return jz5.f0.f302826a;
    }
}
