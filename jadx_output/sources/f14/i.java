package f14;

/* loaded from: classes4.dex */
public class i implements l75.z0 {
    public i(f14.j jVar) {
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.storage.z3 L;
        if (i17 != 2 || (L = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L((str = (java.lang.String) obj))) == null || L.r2()) {
            return;
        }
        if (!((2 & L.getType()) != 0) || L.q2()) {
            return;
        }
        gm0.j1.e().k(new f14.h(this, str), 5000L);
    }
}
