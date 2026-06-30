package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class ag implements db5.x8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.NewChattingTabUI f197134a;

    public ag(com.tencent.mm.ui.NewChattingTabUI newChattingTabUI) {
        this.f197134a = newChattingTabUI;
    }

    @Override // db5.x8
    public void a() {
        com.tencent.mm.ui.NewChattingTabUI newChattingTabUI = this.f197134a;
        if (newChattingTabUI.f197033t == null) {
            newChattingTabUI.f197033t = android.view.animation.AnimationUtils.loadAnimation(newChattingTabUI.f197014a, com.tencent.mm.ui.uc.f211078a);
            newChattingTabUI.f197033t.setAnimationListener(new com.tencent.mm.ui.yf(this));
        }
        if (newChattingTabUI.f197023j) {
            newChattingTabUI.f197016c.setOndispatchDraw(new com.tencent.mm.ui.zf(this));
            com.tencent.mm.sdk.platformtools.u3.l(newChattingTabUI.f197026m);
            com.tencent.mm.sdk.platformtools.u3.i(newChattingTabUI.f197026m, 1500L);
            newChattingTabUI.f197023j = false;
        } else {
            com.tencent.mm.ui.NewChattingTabUI.b(newChattingTabUI);
            com.tencent.mm.ui.NewChattingTabUI.c(newChattingTabUI);
        }
        com.tencent.mm.ui.base.OnLayoutChangedLinearLayout onLayoutChangedLinearLayout = newChattingTabUI.f197019f;
        if (onLayoutChangedLinearLayout != null) {
            onLayoutChangedLinearLayout.f197686d = null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.NewChattingTabUI", "klem CHATTING ONLAYOUT ");
    }
}
