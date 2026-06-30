package gx;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx.g f276173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f276174e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(gx.g gVar, java.lang.String str) {
        super(2);
        this.f276173d = gVar;
        this.f276174e = str;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = (java.lang.String) obj2;
        gx.g gVar = this.f276173d;
        if (intValue == 0) {
            gVar.s().invoke(gVar.k());
        } else {
            gVar.s().invoke(gVar.j(lc3.x.f317936c, "flutter errCode:" + intValue + ", errMsg:" + str + ", frameSetName: " + this.f276174e));
        }
        return jz5.f0.f302826a;
    }
}
