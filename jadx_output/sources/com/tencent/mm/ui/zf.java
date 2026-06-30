package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class zf implements com.tencent.mm.ui.tools.od {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.ag f212620a;

    public zf(com.tencent.mm.ui.ag agVar) {
        this.f212620a = agVar;
    }

    @Override // com.tencent.mm.ui.tools.od
    public void a() {
        com.tencent.mm.ui.ag agVar = this.f212620a;
        boolean K0 = agVar.f197134a.f197027n.K0();
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "[onDrawed] isReadyToStartAnim:%s ", java.lang.Boolean.valueOf(K0));
        if (K0) {
            com.tencent.mm.ui.NewChattingTabUI newChattingTabUI = agVar.f197134a;
            com.tencent.mm.sdk.platformtools.u3.l(newChattingTabUI.f197026m);
            newChattingTabUI.f197027n.T0();
            com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = newChattingTabUI.f197027n;
            baseChattingUIFragment.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseChattingUIFragment", "onDrawReadyForAnimStart called");
            ((hd5.j) ((hd5.v) ((ke5.a) baseChattingUIFragment.B0()).f307040a).f280654e).a();
            com.tencent.mm.ui.n8 n8Var = newChattingTabUI.f197015b;
            if (n8Var != null) {
                com.tencent.mm.ui.HomeUI homeUI = (com.tencent.mm.ui.HomeUI) n8Var;
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_chatting_ui_anim_suspend_request_layout, 1) == 1) {
                    com.tencent.mm.ui.MMFragment h17 = homeUI.f196761t.h(0);
                    if (h17 instanceof com.tencent.mm.ui.conversation.MainUI) {
                        ((com.tencent.mm.ui.conversation.MainUI) h17).w0(0L);
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.HomeUI", "Suspend requestLayout() disabled.");
                }
                com.tencent.mm.ui.cf.f198092d.c();
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.LauncherUI.NewChattingTabUI", "Unexpecte situation, notifyChattingUIAnimationStart() failed.");
            }
            if (newChattingTabUI.f197027n.getSwipeBackLayout() != null) {
                newChattingTabUI.f197027n.getSwipeBackLayout().setNeedChangeWindowBackground(false);
                newChattingTabUI.f197027n.getSwipeBackLayout().startAnimation(newChattingTabUI.f197033t);
            } else {
                newChattingTabUI.f197027n.getView().startAnimation(newChattingTabUI.f197033t);
            }
            newChattingTabUI.f197016c.setOndispatchDraw(null);
        }
    }
}
