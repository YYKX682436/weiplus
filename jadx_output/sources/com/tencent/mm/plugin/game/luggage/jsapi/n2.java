package com.tencent.mm.plugin.game.luggage.jsapi;

@mk0.a
/* loaded from: classes8.dex */
public class n2 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, final com.tencent.mm.ipcinvoker.r rVar) {
        java.lang.String string = ((android.os.Bundle) obj).getString("url");
        ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Di(string, new m33.f1() { // from class: com.tencent.mm.plugin.game.luggage.jsapi.n2$$a
            @Override // m33.f1
            public final void a(m33.e1 e1Var) {
                com.tencent.mm.ipcinvoker.r rVar2 = com.tencent.mm.ipcinvoker.r.this;
                if (e1Var == null || com.tencent.mm.sdk.platformtools.t8.K0(e1Var.f323282a) || com.tencent.mm.sdk.platformtools.t8.K0(e1Var.f323283b) || (com.tencent.mm.plugin.game.commlib.i.l() != null && com.tencent.mm.plugin.game.commlib.i.l().f324125d.contains(e1Var.f323282a))) {
                    rVar2.a(null);
                    return;
                }
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("appId", e1Var.f323282a);
                bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, e1Var.f323283b);
                rVar2.a(bundle);
            }
        });
    }
}
