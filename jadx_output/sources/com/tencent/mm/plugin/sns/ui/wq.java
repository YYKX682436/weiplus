package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class wq implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI f171335d;

    public wq(com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI snsStrangerCommentDetailUI) {
        this.f171335d = snsStrangerCommentDetailUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$3");
        int i17 = com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI.f167423y;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI snsStrangerCommentDetailUI = this.f171335d;
        snsStrangerCommentDetailUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showMenuDialog", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        java.lang.String[] strArr = new java.lang.String[1];
        com.tencent.mm.storage.z3 z3Var = snsStrangerCommentDetailUI.f167440w;
        if (z3Var == null) {
            snsStrangerCommentDetailUI.f167440w = new com.tencent.mm.storage.z3();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showMenuDialog", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        } else {
            if (!z3Var.r2()) {
                com.tencent.mm.storage.z3 z3Var2 = snsStrangerCommentDetailUI.f167440w;
                java.util.Set set = c01.e2.f37117a;
                iz5.a.g(null, z3Var2 != null);
                com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(z3Var2.d1(), true);
                if (n17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(n17.d1())) {
                    z3Var2 = n17;
                }
                z3Var2.setType(z3Var2.getType() | 2);
                c01.e2.g0(z3Var2, true);
            }
            if (snsStrangerCommentDetailUI.f167440w.o2()) {
                strArr[0] = snsStrangerCommentDetailUI.getString(com.tencent.mm.R.string.bfh);
            } else {
                strArr[0] = snsStrangerCommentDetailUI.getString(com.tencent.mm.R.string.bfc);
            }
            db5.e1.h(snsStrangerCommentDetailUI, "", strArr, "", false, new com.tencent.mm.plugin.sns.ui.xq(snsStrangerCommentDetailUI));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showMenuDialog", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$3");
        return true;
    }
}
