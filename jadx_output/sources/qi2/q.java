package qi2;

/* loaded from: classes10.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qi2.v f363602d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(qi2.v vVar) {
        super(1);
        this.f363602d = vVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ce2.i iVar = (ce2.i) obj;
        qi2.v vVar = this.f363602d;
        vVar.I(vVar.f363639u, true);
        if (iVar != null) {
            vVar.H(iVar);
            vVar.C();
            vVar.E();
        }
        return jz5.f0.f302826a;
    }
}
