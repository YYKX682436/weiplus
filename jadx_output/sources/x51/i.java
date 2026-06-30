package x51;

/* loaded from: classes12.dex */
public abstract class i {
    public static com.tencent.mm.modelsimple.u0 a(com.tencent.mm.modelsimple.v0 v0Var) {
        r45.w56 w56Var;
        java.util.LinkedList linkedList;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("kscene_type", 73);
        if (v0Var == null) {
            return null;
        }
        com.tencent.mm.network.v0 v0Var2 = v0Var.f71427e;
        o45.vg vgVar = ((c01.f9) v0Var2).f37184c;
        if (((o45.tg) vgVar).f343015a.f385952e == null || (w56Var = ((o45.tg) vgVar).f343015a.f385952e.f389934t) == null || (linkedList = w56Var.f388905e) == null || linkedList.size() <= 0) {
            return null;
        }
        com.tencent.mm.modelsimple.u0 u0Var = new com.tencent.mm.modelsimple.u0();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.gg6 gg6Var = (r45.gg6) it.next();
            int i17 = gg6Var.f375237d;
            if (i17 == 19) {
                u0Var.f71418b = gg6Var.f375238e;
            } else if (i17 == 20) {
                u0Var.f71419c = gg6Var.f375238e;
            } else if (i17 == 21) {
                u0Var.f71420d = gg6Var.f375238e;
            }
        }
        u0Var.f71422f = bundle;
        u0Var.f71417a = 0;
        if (com.tencent.mm.sdk.platformtools.t8.K0(u0Var.f71418b)) {
            return null;
        }
        u0Var.f71421e = ((o45.sg) v0Var2.getReqObj()).f343006b.f377838d.f378718f;
        return u0Var;
    }
}
