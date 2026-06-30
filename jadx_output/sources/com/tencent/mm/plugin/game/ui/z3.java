package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class z3 implements com.tencent.mm.plugin.game.model.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameInstalledView f141895a;

    public z3(com.tencent.mm.plugin.game.ui.GameInstalledView gameInstalledView) {
        this.f141895a = gameInstalledView;
    }

    @Override // com.tencent.mm.plugin.game.model.z
    public void a(int i17, java.lang.String str, boolean z17) {
        if (i17 != 3) {
            return;
        }
        com.tencent.mm.plugin.game.model.a wi6 = ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).wi();
        com.tencent.mm.plugin.game.ui.GameInstalledView gameInstalledView = this.f141895a;
        wi6.a(gameInstalledView.f140884h);
        gameInstalledView.b(false);
    }
}
