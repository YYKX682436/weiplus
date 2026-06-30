package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes15.dex */
public class i implements db5.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.AppPanel f190384a;

    public i(com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel) {
        this.f190384a = appPanel;
    }

    @Override // db5.z1
    public void a(int i17, int i18, boolean z17) {
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f190384a;
        appPanel.f189941s.setSelectedDot(i18);
        if (appPanel.getVisibility() != 0 || i17 == -1 || i17 == i18 || !z17) {
            return;
        }
        if (i18 >= 0 && i18 < ((java.util.ArrayList) appPanel.f189939q).size()) {
            ((com.tencent.mm.pluginsdk.ui.chat.AppGrid) ((java.util.ArrayList) appPanel.f189939q).get(i18)).c();
        }
        int size = appPanel.C.f190152j.f190766a ? appPanel.f189945w + appPanel.T.size() : appPanel.f189945w;
        com.tencent.mm.autogen.mmdata.rpt.PanelDynamicEnterActionStruct panelDynamicEnterActionStruct = new com.tencent.mm.autogen.mmdata.rpt.PanelDynamicEnterActionStruct();
        panelDynamicEnterActionStruct.f59832d = 1L;
        panelDynamicEnterActionStruct.f59833e = 0L;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i19 = 0; i19 < appPanel.getAppPanelUnCertainEnterArrayList().size(); i19++) {
            int i27 = appPanel.B + size + 1;
            int i28 = appPanel.f189948z;
            int i29 = i27 / i28;
            if (i27 % i28 <= 0) {
                i29--;
            }
            if (i29 < 0) {
                i29 = 0;
            }
            if (i17 == i29) {
                sb6.append(appPanel.getAppPanelUnCertainEnterArrayList().get(i19).f190713g2);
                sb6.append("|");
            }
        }
        panelDynamicEnterActionStruct.f59834f = panelDynamicEnterActionStruct.b("AppList", sb6.toString(), true);
        panelDynamicEnterActionStruct.k();
        int s17 = appPanel.s(14);
        if (s17 != -1 && s17 == appPanel.getCurScreen()) {
            com.tencent.mm.pluginsdk.ui.chat.y4 y4Var = appPanel.f189936o;
            java.lang.String c17 = y4Var == null ? "" : y4Var.c();
            com.tencent.mm.autogen.mmdata.rpt.PanelEnterActionStruct panelEnterActionStruct = new com.tencent.mm.autogen.mmdata.rpt.PanelEnterActionStruct();
            panelEnterActionStruct.f59835d = panelEnterActionStruct.b("RoomName", c17, true);
            panelEnterActionStruct.f59836e = 0L;
            panelEnterActionStruct.f59837f = panelEnterActionStruct.b("AppList", "19", true);
            panelEnterActionStruct.f59838g = s17 + 1;
            panelEnterActionStruct.k();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppPanel", "scroll to show page %s", java.lang.Integer.valueOf(i18));
        int s18 = appPanel.s(15);
        if (i18 == s18 && appPanel.C.A.f190766a) {
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).Di(s18 + 1);
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).Ui(1, appPanel.f189931g, appPanel.f189932h, null);
        }
        com.tencent.mm.ui.base.MMFlipper mMFlipper = appPanel.f189940r;
        if (mMFlipper != null) {
            mMFlipper.announceForAccessibility(appPanel.f189937p.getString(com.tencent.mm.R.string.bmd, java.lang.String.valueOf(i18 + 1)));
        }
    }
}
