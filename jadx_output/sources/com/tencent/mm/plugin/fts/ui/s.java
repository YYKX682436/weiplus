package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSAddFriendUI f138173d;

    public s(com.tencent.mm.plugin.fts.ui.FTSAddFriendUI fTSAddFriendUI) {
        this.f138173d = fTSAddFriendUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSAddFriendUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.fts.ui.FTSAddFriendUI fTSAddFriendUI = this.f138173d;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(fTSAddFriendUI.f137910n)) {
            fTSAddFriendUI.L = true;
            su4.k3.c(fTSAddFriendUI.f137910n, fTSAddFriendUI.M, 1, 16);
        }
        int i17 = com.tencent.mm.plugin.fts.ui.FTSAddFriendUI.f137869p1;
        fTSAddFriendUI.j7();
        if ("yuanbao".equals(fTSAddFriendUI.Y)) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("yuanbao_real_account_profile", "view_clk", java.util.Collections.emptyMap(), 34004);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
