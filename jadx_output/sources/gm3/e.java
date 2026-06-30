package gm3;

/* loaded from: classes4.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final gm3.e f273552d = new gm3.e();

    public e() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList it = (java.util.ArrayList) obj;
        kotlin.jvm.internal.o.g(it, "it");
        kz5.g0.s(it);
        if (it.size() == 1) {
            gm3.c cVar = (gm3.c) kz5.n0.Z(it);
            if (cVar != null) {
                cVar.f273550n = com.tencent.mm.R.drawable.ard;
            }
        } else if (it.size() > 1) {
            int i17 = 0;
            for (java.lang.Object obj2 : it) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                gm3.c cVar2 = (gm3.c) obj2;
                if (i17 == 0) {
                    cVar2.f273550n = com.tencent.mm.R.drawable.arb;
                } else if (i17 == it.size() - 1) {
                    cVar2.f273550n = com.tencent.mm.R.drawable.ara;
                } else {
                    cVar2.f273550n = com.tencent.mm.R.drawable.arc;
                }
                i17 = i18;
            }
        }
        return jz5.f0.f302826a;
    }
}
