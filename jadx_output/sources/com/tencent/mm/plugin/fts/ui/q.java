package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes12.dex */
public class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSAddFriendUI f138143d;

    public q(com.tencent.mm.plugin.fts.ui.FTSAddFriendUI fTSAddFriendUI) {
        this.f138143d = fTSAddFriendUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSAddFriendUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.fts.ui.FTSAddFriendUI.f137869p1;
        com.tencent.mm.plugin.fts.ui.FTSAddFriendUI fTSAddFriendUI = this.f138143d;
        java.lang.String str = fTSAddFriendUI.f137910n;
        if (str != null && !com.tencent.mm.sdk.platformtools.t8.K0(str.trim()) && java.lang.System.currentTimeMillis() - fTSAddFriendUI.f137871l1 > 1000) {
            fTSAddFriendUI.f137871l1 = java.lang.System.currentTimeMillis();
            if (com.tencent.mm.plugin.websearch.l2.h(0)) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(fTSAddFriendUI.f137910n)) {
                    fTSAddFriendUI.L = true;
                    su4.k3.c(fTSAddFriendUI.f137910n, 2, 2, 16);
                }
                java.lang.String f17 = su4.r2.f(16);
                ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Ri(fTSAddFriendUI.getContext(), 16, str, f17, true, null, false, Integer.MAX_VALUE, "", 0);
                jx3.f.INSTANCE.d(12041, 16, java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(0)));
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.FTS.FTSAddFriendUI", "fts h5 template not avail");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
