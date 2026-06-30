package uy3;

/* loaded from: classes8.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uy3.j0 f431928d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(uy3.j0 j0Var) {
        super(3);
        this.f431928d = j0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((java.lang.Boolean) obj3).booleanValue();
        uy3.k0 k0Var = this.f431928d.f431955p;
        if (k0Var != null) {
            uy3.m0 m0Var = (uy3.m0) k0Var;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            uy3.l0 l0Var = m0Var.f431983f;
            if (l0Var != null) {
                l0Var.f431968a = booleanValue;
                l0Var.f431969b = booleanValue2;
                l0Var.f431970c = booleanValue3;
                l0Var.f431971d = currentTimeMillis - m0Var.f431981d;
            }
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = m0Var.f431978a;
            objArr[1] = java.lang.Boolean.valueOf(booleanValue);
            objArr[2] = java.lang.Boolean.valueOf(booleanValue3);
            uy3.l0 l0Var2 = m0Var.f431983f;
            objArr[3] = l0Var2 != null ? java.lang.Long.valueOf(l0Var2.f431971d) : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanBoxDialogViewListenerImpl", "onCreateBoxWebViewAfter session: %s, enablePreload: %b, useCache: %b, cost: %s", objArr);
            uy3.l0 l0Var3 = m0Var.f431983f;
            if (l0Var3 != null) {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.A(1259, l0Var3.f431968a ? 130 : 150);
                if (!l0Var3.f431968a) {
                    g0Var.C(1259L, 151L, l0Var3.f431971d);
                } else if (l0Var3.f431970c) {
                    g0Var.A(1259, 132);
                } else {
                    g0Var.A(1259, 131);
                    g0Var.C(1259L, 133L, l0Var3.f431971d);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
