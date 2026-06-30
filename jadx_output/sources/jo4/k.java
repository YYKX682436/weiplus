package jo4;

/* loaded from: classes10.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jo4.l f300919d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(jo4.l lVar) {
        super(1);
        this.f300919d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        d11.m mVar;
        float floatValue = ((java.lang.Number) obj).floatValue();
        d11.n nVar = this.f300919d.f300921b;
        if (nVar == null || (mVar = ((d11.d) nVar).f225659d) == null) {
            return null;
        }
        yz5.l lVar = ((zf0.w0) mVar).f472576a;
        if (lVar != null) {
            lVar.invoke(java.lang.Float.valueOf(floatValue));
        }
        return jz5.f0.f302826a;
    }
}
