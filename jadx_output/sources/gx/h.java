package gx;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx.i f276175d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f276176e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(gx.i iVar, java.lang.String str) {
        super(2);
        this.f276175d = iVar;
        this.f276176e = str;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = (java.lang.String) obj2;
        gx.i iVar = this.f276175d;
        if (intValue == 0) {
            iVar.s().invoke(iVar.k());
        } else {
            iVar.s().invoke(iVar.j(lc3.x.f317936c, "flutter errCode:" + intValue + ", errMsg:" + str + ", frameSetName: " + this.f276176e));
        }
        return jz5.f0.f302826a;
    }
}
