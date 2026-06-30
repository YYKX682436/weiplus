package v22;

/* loaded from: classes10.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v22.z f432863d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v22.z zVar) {
        super(1);
        this.f432863d = zVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        v22.z zVar = this.f432863d;
        if (booleanValue) {
            v22.a0 a0Var = zVar.f432877h;
            if (a0Var == null) {
                kotlin.jvm.internal.o.o("videoDecoder");
                throw null;
            }
            a0Var.b(false);
        } else {
            d32.j jVar = zVar.f432878i;
            if (jVar == null) {
                kotlin.jvm.internal.o.o("mixPixelBuffer");
                throw null;
            }
            v22.s sVar = new v22.s(zVar);
            d32.k kVar = jVar.f226156i;
            if (kVar == null) {
                kotlin.jvm.internal.o.o("renderer");
                throw null;
            }
            byte[] bArr = new byte[kVar.f226164c * kVar.f226165d * 4];
            kVar.f226161J.position(0);
            kVar.f226161J.get(bArr);
            sVar.invoke(bArr);
        }
        return jz5.f0.f302826a;
    }
}
