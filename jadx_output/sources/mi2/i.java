package mi2;

/* loaded from: classes10.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi2.l f326768d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(mi2.l lVar) {
        super(2);
        this.f326768d = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        mi2.l lVar = this.f326768d;
        lVar.f326773y = booleanValue;
        lVar.f326772x = intValue;
        lVar.G();
        return jz5.f0.f302826a;
    }
}
