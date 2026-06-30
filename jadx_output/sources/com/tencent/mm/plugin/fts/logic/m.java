package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class m implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137624d;

    public m(com.tencent.mm.plugin.fts.logic.l lVar) {
        this.f137624d = lVar;
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.tencent.mm.plugin.fts.logic.l lVar = this.f137624d;
        if (lVar.f342207d) {
            java.lang.String str = (java.lang.String) obj;
            if (!lVar.o(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "onConversationChangeListener filterByUsername %s", str);
                return;
            }
            com.tencent.mm.storage.z3 L = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(str);
            if (L != null && (!lVar.q(L) || L.k2())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "onContactChangedListener hit cache and filter contact %s", str);
                return;
            }
            if (i17 != 2) {
                if (i17 == 3) {
                    if (lVar.f137590i.contains(str) || lVar.f137591m.containsKey(str)) {
                        return;
                    }
                    ((com.tencent.mm.plugin.fts.t) lVar.f137586e).b(65556, new com.tencent.mm.plugin.fts.logic.f0(lVar, str));
                    return;
                }
                if (i17 != 5) {
                    return;
                }
            }
            if (lVar.f137591m.containsKey(str)) {
                return;
            }
            ((com.tencent.mm.plugin.fts.t) lVar.f137586e).b(65556, new com.tencent.mm.plugin.fts.logic.e0(lVar, str));
        }
    }
}
