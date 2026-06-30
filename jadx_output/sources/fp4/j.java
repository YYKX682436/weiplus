package fp4;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp4.s f265364d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(fp4.s sVar) {
        super(1);
        this.f265364d = sVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bv3.d dVar;
        bv3.d dVar2;
        bv3.d dVar3;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        fp4.s sVar = this.f265364d;
        if (booleanValue) {
            zu3.a aVar = sVar.f265385t;
            if (aVar != null && (dVar = aVar.f475760c) != null) {
                dVar.d(0L, 2147483647L);
            }
        } else {
            zu3.a aVar2 = sVar.f265385t;
            if (aVar2 != null) {
                aVar2.f475759b = null;
            }
            if (aVar2 != null && (dVar3 = aVar2.f475760c) != null) {
                dVar3.d(sVar.f265383r, sVar.f265384s);
            }
            zu3.a aVar3 = sVar.f265385t;
            long c17 = (aVar3 == null || (dVar2 = aVar3.f475760c) == null) ? sVar.f265381p : dVar2.c();
            sVar.f265385t = null;
            ju3.c0 c0Var = ju3.c0.f301914x2;
            ju3.d0 d0Var = sVar.f465332d;
            ju3.d0.k(d0Var, c0Var, null, 2, null);
            ju3.c0 c0Var2 = ju3.c0.f301886l2;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("PARAM_1_LONG", c17);
            d0Var.w(c0Var2, bundle);
        }
        return jz5.f0.f302826a;
    }
}
