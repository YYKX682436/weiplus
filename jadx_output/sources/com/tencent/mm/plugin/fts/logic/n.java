package com.tencent.mm.plugin.fts.logic;

/* loaded from: classes12.dex */
public class n implements l75.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.logic.l f137636d;

    public n(com.tencent.mm.plugin.fts.logic.l lVar) {
        this.f137636d = lVar;
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.tencent.mm.plugin.fts.logic.l lVar = this.f137636d;
        if (lVar.f342207d) {
            java.lang.String str = (java.lang.String) obj;
            if (!lVar.o(str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "onContactChangedListener filterByUsername %s", str);
                return;
            }
            com.tencent.mm.storage.z3 L = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(str);
            if (L != null && !lVar.q(L)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "onContactChangedListener hit cache and filter contact %s", str);
                return;
            }
            if (i17 == 2) {
                ((com.tencent.mm.plugin.fts.t) lVar.f137586e).b(65556, new com.tencent.mm.plugin.fts.logic.a0(lVar, str));
            } else if (i17 == 3 || i17 == 4) {
                if (!lVar.f137591m.containsKey(str)) {
                    ((com.tencent.mm.plugin.fts.t) lVar.f137586e).b(65556, new com.tencent.mm.plugin.fts.logic.e0(lVar, str));
                }
            } else if (i17 == 5) {
                ((com.tencent.mm.plugin.fts.t) lVar.f137586e).b(65556, new com.tencent.mm.plugin.fts.logic.y(lVar, str));
            }
            ((com.tencent.mm.plugin.fts.t) lVar.f137586e).b(65556, new com.tencent.mm.plugin.fts.logic.g0(lVar, str));
        }
    }
}
