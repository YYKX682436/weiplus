package zd4;

/* loaded from: classes11.dex */
public class h implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI f471632d;

    public h(com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI baseSelectVisibleRangeUI) {
        this.f471632d = baseSelectVisibleRangeUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$5");
        com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI baseSelectVisibleRangeUI = this.f471632d;
        baseSelectVisibleRangeUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLabelFinish", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(baseSelectVisibleRangeUI.f170683q.f171543n, ",");
        java.lang.String c18 = com.tencent.mm.sdk.platformtools.t8.c1(baseSelectVisibleRangeUI.f170683q.f171545p, ",");
        java.lang.String c19 = com.tencent.mm.sdk.platformtools.t8.c1(baseSelectVisibleRangeUI.f170683q.f171547r, ",");
        java.lang.String c110 = com.tencent.mm.sdk.platformtools.t8.c1(baseSelectVisibleRangeUI.f170683q.f171544o, ",");
        java.lang.String c111 = com.tencent.mm.sdk.platformtools.t8.c1(baseSelectVisibleRangeUI.f170683q.f171546q, ",");
        java.lang.String c112 = com.tencent.mm.sdk.platformtools.t8.c1(baseSelectVisibleRangeUI.f170683q.f171548s, ",");
        java.lang.String string = baseSelectVisibleRangeUI.getString(baseSelectVisibleRangeUI.f170681o ? com.tencent.mm.R.string.ltn : com.tencent.mm.R.string.jbn);
        if (!baseSelectVisibleRangeUI.f170684r.o(baseSelectVisibleRangeUI.f170683q.f171540k, 2) || baseSelectVisibleRangeUI.f170683q.f171543n.size() != 0 || baseSelectVisibleRangeUI.f170683q.f171545p.size() != 0 || baseSelectVisibleRangeUI.f170683q.f171547r.size() != 0) {
            com.tencent.mm.plugin.sns.ui.xk xkVar = baseSelectVisibleRangeUI.f170683q;
            if (xkVar.f171534e || !baseSelectVisibleRangeUI.f170684r.o(xkVar.f171540k, 3) || baseSelectVisibleRangeUI.f170683q.f171544o.size() != 0 || baseSelectVisibleRangeUI.f170683q.f171546q.size() != 0 || baseSelectVisibleRangeUI.f170683q.f171548s.size() != 0) {
                if (!baseSelectVisibleRangeUI.f170684r.o(baseSelectVisibleRangeUI.f170683q.f171540k, 2) || !com.tencent.mm.sdk.platformtools.t8.K0(c17) || !com.tencent.mm.sdk.platformtools.t8.K0(c18) || !com.tencent.mm.sdk.platformtools.t8.K0(c19)) {
                    com.tencent.mm.plugin.sns.ui.xk xkVar2 = baseSelectVisibleRangeUI.f170683q;
                    if (xkVar2.f171534e || !baseSelectVisibleRangeUI.f170684r.o(xkVar2.f171540k, 3) || !com.tencent.mm.sdk.platformtools.t8.K0(c110) || !com.tencent.mm.sdk.platformtools.t8.K0(c111) || !com.tencent.mm.sdk.platformtools.t8.K0(c112)) {
                        baseSelectVisibleRangeUI.m7();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLabelFinish", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$5");
                        return true;
                    }
                }
                db5.e1.y(baseSelectVisibleRangeUI, string, "", baseSelectVisibleRangeUI.getString(com.tencent.mm.R.string.f493219jc4), null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLabelFinish", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$5");
                return true;
            }
        }
        db5.e1.y(baseSelectVisibleRangeUI, string, "", baseSelectVisibleRangeUI.getString(com.tencent.mm.R.string.f493219jc4), null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLabelFinish", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$5");
        return true;
    }
}
