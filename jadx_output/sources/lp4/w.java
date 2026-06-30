package lp4;

/* loaded from: classes10.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lp4.f0 f320436d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(lp4.f0 f0Var) {
        super(1);
        this.f320436d = f0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        bv3.d dVar;
        bv3.d dVar2;
        bv3.d dVar3;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        lp4.f0 f0Var = this.f320436d;
        if (booleanValue) {
            zu3.a aVar = f0Var.f320354t;
            if (aVar != null && (dVar = aVar.f475760c) != null) {
                dVar.d(0L, 2147483647L);
            }
        } else {
            zu3.a aVar2 = f0Var.f320354t;
            if (aVar2 != null) {
                aVar2.f475759b = null;
            }
            if (aVar2 != null && (dVar3 = aVar2.f475760c) != null) {
                dVar3.d(f0Var.f320352r, f0Var.f320353s);
            }
            zu3.a aVar3 = f0Var.f320354t;
            long c17 = (aVar3 == null || (dVar2 = aVar3.f475760c) == null) ? f0Var.f320350p : dVar2.c();
            f0Var.f320354t = null;
            ju3.c0 c0Var = ju3.c0.f301886l2;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("PARAM_1_LONG", c17);
            f0Var.f465332d.w(c0Var, bundle);
        }
        return jz5.f0.f302826a;
    }
}
