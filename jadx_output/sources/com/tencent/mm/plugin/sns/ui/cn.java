package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class cn implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsNotInterestUI f168137d;

    public cn(com.tencent.mm.plugin.sns.ui.SnsNotInterestUI snsNotInterestUI) {
        this.f168137d = snsNotInterestUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI$3");
        java.lang.String[] strArr = com.tencent.mm.plugin.sns.ui.SnsNotInterestUI.f167289v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        com.tencent.mm.plugin.sns.ui.SnsNotInterestUI snsNotInterestUI = this.f168137d;
        snsNotInterestUI.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendNotInterest", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        snsNotInterestUI.f167301p = 0;
        java.util.HashMap hashMap = snsNotInterestUI.f167293e;
        java.util.Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Integer) it.next()).intValue();
            if (((java.lang.Boolean) hashMap.get(java.lang.Integer.valueOf(intValue))).booleanValue()) {
                int i17 = snsNotInterestUI.f167301p;
                if (i17 == 0) {
                    snsNotInterestUI.f167301p = intValue;
                } else {
                    snsNotInterestUI.f167301p = intValue | i17;
                }
            }
        }
        if (snsNotInterestUI.f167302q != 0 && snsNotInterestUI.f167300o != 0) {
            snsNotInterestUI.f167305t = db5.e1.Q(snsNotInterestUI.getContext(), snsNotInterestUI.getString(com.tencent.mm.R.string.f490573yv), snsNotInterestUI.getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.plugin.sns.ui.dn(snsNotInterestUI));
            snsNotInterestUI.f167306u = new com.tencent.mm.plugin.sns.model.q2(snsNotInterestUI.f167302q, snsNotInterestUI.f167300o, snsNotInterestUI.f167301p, snsNotInterestUI.f167304s ? snsNotInterestUI.f167296h.getText().toString() : null);
            gm0.j1.i();
            gm0.j1.n().f273288b.g(snsNotInterestUI.f167306u);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendNotInterest", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuItemClick", "com.tencent.mm.plugin.sns.ui.SnsNotInterestUI$3");
        return true;
    }
}
