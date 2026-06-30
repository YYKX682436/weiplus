package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class t4 implements com.tencent.mm.plugin.game.model.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.y4 f141764a;

    public t4(com.tencent.mm.plugin.game.ui.y4 y4Var) {
        this.f141764a = y4Var;
    }

    @Override // com.tencent.mm.plugin.game.model.z
    public void a(int i17, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.game.ui.y4 y4Var;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        com.tencent.mm.plugin.game.ui.w4 w4Var;
        com.tencent.mm.plugin.game.model.b bVar;
        if (!z17 || (concurrentHashMap = (y4Var = this.f141764a).f141881q) == null || str == null) {
            return;
        }
        try {
            for (com.tencent.mm.plugin.game.model.c0 c0Var : concurrentHashMap.values()) {
                if (c0Var != null && (bVar = c0Var.f140241a) != null && (bVar.field_appId.equals(str) || bVar.field_packageName.equals(str))) {
                    c0Var.a(y4Var.f141878n);
                    c0Var.b();
                }
            }
            for (int i18 = 0; i18 < y4Var.f141353e.size(); i18++) {
                com.tencent.mm.plugin.game.model.b bVar2 = (com.tencent.mm.plugin.game.model.b) y4Var.f141353e.get(i18);
                if (bVar2.f140205h2 == 0 && ((bVar2.field_appId.equals(str) || bVar2.field_packageName.equals(str)) && (w4Var = y4Var.f141884t) != null)) {
                    w4Var.a(i18);
                    return;
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameListAdapter", e17.getMessage());
        }
    }
}
