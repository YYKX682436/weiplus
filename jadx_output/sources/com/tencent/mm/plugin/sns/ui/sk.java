package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes15.dex */
public class sk implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsLabelUI f170475d;

    public sk(com.tencent.mm.plugin.sns.ui.SnsLabelUI snsLabelUI) {
        this.f170475d = snsLabelUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$5");
        com.tencent.mm.plugin.sns.ui.SnsLabelUI snsLabelUI = this.f170475d;
        snsLabelUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLabelFinish", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(snsLabelUI.f167225m.f4363k, ",");
        java.lang.String c18 = com.tencent.mm.sdk.platformtools.t8.c1(snsLabelUI.f167225m.f4365m, ",");
        java.lang.String c19 = com.tencent.mm.sdk.platformtools.t8.c1(snsLabelUI.f167225m.f4367o, ",");
        java.lang.String c110 = com.tencent.mm.sdk.platformtools.t8.c1(snsLabelUI.f167225m.f4364l, ",");
        java.lang.String c111 = com.tencent.mm.sdk.platformtools.t8.c1(snsLabelUI.f167225m.f4366n, ",");
        java.lang.String c112 = com.tencent.mm.sdk.platformtools.t8.c1(snsLabelUI.f167225m.f4368p, ",");
        ae4.a aVar = snsLabelUI.f167225m;
        if (aVar.f4360h != 2 || aVar.f4363k.size() != 0 || snsLabelUI.f167225m.f4365m.size() != 0 || snsLabelUI.f167225m.f4367o.size() != 0) {
            ae4.a aVar2 = snsLabelUI.f167225m;
            if (aVar2.f4360h != 3 || aVar2.f4364l.size() != 0 || snsLabelUI.f167225m.f4366n.size() != 0 || snsLabelUI.f167225m.f4368p.size() != 0) {
                if ((snsLabelUI.f167225m.f4360h == 2 && com.tencent.mm.sdk.platformtools.t8.K0(c17) && com.tencent.mm.sdk.platformtools.t8.K0(c18) && com.tencent.mm.sdk.platformtools.t8.K0(c19)) || (snsLabelUI.f167225m.f4360h == 3 && com.tencent.mm.sdk.platformtools.t8.K0(c110) && com.tencent.mm.sdk.platformtools.t8.K0(c111) && com.tencent.mm.sdk.platformtools.t8.K0(c112))) {
                    db5.e1.y(snsLabelUI, snsLabelUI.getString(com.tencent.mm.R.string.jbn), "", snsLabelUI.getString(com.tencent.mm.R.string.f493219jc4), null);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLabelFinish", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                } else {
                    snsLabelUI.h7();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLabelFinish", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$5");
                return true;
            }
        }
        db5.e1.y(snsLabelUI, snsLabelUI.getString(com.tencent.mm.R.string.jbn), "", snsLabelUI.getString(com.tencent.mm.R.string.f493219jc4), null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLabelFinish", "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsLabelUI$5");
        return true;
    }
}
