package f0;

/* loaded from: classes14.dex */
public final class x1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f258269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f258270e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f0.y1 f258271f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(java.util.List list, int i17, f0.y1 y1Var) {
        super(2);
        this.f258269d = list;
        this.f258270e = i17;
        this.f258271f = y1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.util.List list = this.f258269d;
        int intValue3 = (((java.lang.Number) list.get((intValue + intValue2) - 1)).intValue() - (intValue == 0 ? 0 : ((java.lang.Number) list.get(intValue - 1)).intValue())) + (this.f258270e * (intValue2 - 1));
        boolean z17 = this.f258271f.f258274a;
        p2.b bVar = p2.c.f351373b;
        return new p2.c(z17 ? bVar.d(intValue3) : bVar.c(intValue3));
    }
}
