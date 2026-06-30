package fr5;

/* loaded from: classes15.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ er5.g f266032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fr5.f0 f266033e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(er5.g gVar, fr5.f0 f0Var) {
        super(2);
        this.f266032d = gVar;
        this.f266033e = f0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        er5.g gVar = this.f266032d;
        boolean z17 = true;
        boolean b17 = gVar.b(1);
        boolean a17 = gVar.a(booleanValue, intValue);
        boolean b18 = gVar.b(4);
        zq5.l lVar = this.f266033e.f265939d;
        if ((!b17 || !a17) && (!b18 || lVar == null)) {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
