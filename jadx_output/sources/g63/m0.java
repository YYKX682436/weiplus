package g63;

/* loaded from: classes8.dex */
public final class m0 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI f269142a;

    public m0(com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI gameLifeConversationUI) {
        this.f269142a = gameLifeConversationUI;
    }

    @Override // ym5.q3
    public void b(int i17) {
        g63.f0 f0Var = this.f269142a.f141990f;
        z53.o.f470261a.c(f0Var.f269107b.x(), 10, new g63.e0(f0Var));
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        int i17 = com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI.f141988o;
        com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI gameLifeConversationUI = this.f269142a;
        gameLifeConversationUI.T6().f1753e.setEnableLoadMore(gameLifeConversationUI.f141992h);
    }
}
