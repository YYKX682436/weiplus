package sv;

/* loaded from: classes9.dex */
public class g implements vg3.p4 {
    @Override // vg3.p4
    public void C0(com.tencent.mm.storage.f9 f9Var, xg3.l0 l0Var, boolean[] zArr) {
        ((r01.s1) i95.n0.c(r01.s1.class)).Ai().getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x00c9, code lost:
    
        if (r2 != false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0097, code lost:
    
        if ((r11.d1() + r34.f454413d) >= 0) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x05ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04c5  */
    @Override // vg3.p4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void S0(com.tencent.mm.storage.f9 r31, com.tencent.mm.storage.l4 r32, boolean r33, xg3.l0 r34) {
        /*
            Method dump skipped, instructions count: 1579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sv.g.S0(com.tencent.mm.storage.f9, com.tencent.mm.storage.l4, boolean, xg3.l0):void");
    }

    @Override // vg3.p4
    public void W(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.l4 l4Var, boolean z17, xg3.l0 l0Var) {
        ((r01.s1) i95.n0.c(r01.s1.class)).Ai().getClass();
        if (l0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizConversationStorage", "compose notifyInfo is null");
            return;
        }
        java.lang.String username = l0Var.f454410a;
        if (z17) {
            if (f9Var != null && f9Var.A0() != 1 && (c01.ia.g(f9Var) & 1) != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizConversationStorage", "create a temp session conversation.");
                l4Var.c2(4194304);
            }
            if (f9Var != null && r01.z.g(username)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizConversationStorage", "create a bitChat conversation.");
                l4Var.c2(8388608);
            }
        } else {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true);
            if (n17 != null && n17.k2() && !n17.r2() && f9Var != null && f9Var.A0() != 1 && !l4Var.d2(4194304) && (l4Var.w0() < r01.q3.rj() || (c01.ia.g(f9Var) & 1) != 0)) {
                l4Var.c2(4194304);
                com.tencent.mars.xlog.Log.i("MicroMsg.BizConversationStorage", "onNotifyChange is old temp session, %s", username);
            }
            if (f9Var != null && r01.z.g(username)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizConversationStorage", "onNotifyChange a bitChat conversation, %s", username);
                l4Var.c2(8388608);
            }
        }
        java.util.ArrayList arrayList = l0Var.f454412c;
        if (arrayList.isEmpty() || arrayList.get(0) == null) {
            return;
        }
        l4Var.M1(((com.tencent.mm.storage.f9) arrayList.get(0)).A0());
        if (l0Var.f454411b.equals("insert")) {
            l4Var.f195084f2 = (com.tencent.mm.storage.f9) arrayList.get(arrayList.size() - 1);
            if (!r01.z.n(username) || arrayList.get(arrayList.size() - 1) == null) {
                return;
            }
            long msgId = ((com.tencent.mm.storage.f9) arrayList.get(arrayList.size() - 1)).getMsgId();
            eq1.e0 e0Var = eq1.e0.f255799a;
            kotlin.jvm.internal.o.g(username, "username");
            ((java.util.HashMap) eq1.e0.f255801c).put(username, java.lang.Long.valueOf(msgId));
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandServiceConversationReporter", username + " receive new message, msgId=" + msgId);
        }
    }
}
