package iu1;

/* loaded from: classes9.dex */
public final class o1 implements l81.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardTicketListUI f294930a;

    public o1(com.tencent.mm.plugin.card.ui.v2.CardTicketListUI cardTicketListUI) {
        this.f294930a = cardTicketListUI;
    }

    @Override // l81.e1
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardTicketListUI", "onAppBrandProcessDied");
        int i17 = com.tencent.mm.plugin.card.ui.v2.CardTicketListUI.B;
        this.f294930a.Y6(true);
    }

    @Override // l81.e1
    public void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardTicketListUI", "onAppBrandPreconditionError");
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardTicketListUI", "onTriggerHalfScreenShare");
    }

    @Override // l81.e1
    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardTicketListUI", "onAppBrandUIEnter");
    }

    @Override // l81.e1
    public void f(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardTicketListUI", "onAppBrandUIExit(isFinish=" + z17 + ')');
        int i17 = com.tencent.mm.plugin.card.ui.v2.CardTicketListUI.B;
        this.f294930a.Y6(true);
    }
}
