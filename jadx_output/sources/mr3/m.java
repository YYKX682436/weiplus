package mr3;

/* loaded from: classes10.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mr3.n f330882d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(mr3.n nVar) {
        super(1);
        this.f330882d = nVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        mr3.n nVar = this.f330882d;
        if (intValue < nVar.f330884e.size()) {
            return (mr3.l) nVar.f330884e.get(intValue);
        }
        mr3.l lVar = nVar.f330885f;
        return lVar == null ? new mr3.l(null, null, null, null, null, 1, 0, 95, null) : lVar;
    }
}
