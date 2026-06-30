package st3;

/* loaded from: classes10.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st3.e f412524d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(st3.e eVar) {
        super(2);
        this.f412524d = eVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        mu3.a aVar = this.f412524d.f412532n;
        if (aVar != null) {
            aVar.v(intValue, intValue2);
        }
        return jz5.f0.f302826a;
    }
}
