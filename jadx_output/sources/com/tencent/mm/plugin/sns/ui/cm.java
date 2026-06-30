package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class cm implements db5.c6 {
    public cm(com.tencent.mm.plugin.sns.ui.bm bmVar) {
    }

    @Override // db5.c6
    public boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasMenuShowed", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$1");
        boolean z17 = ((java.util.HashSet) db5.c6.f228307a).size() > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasMenuShowed", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$1");
        return z17;
    }

    @Override // db5.c6
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("closeMenuWithoutAnim", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$1");
        java.util.Set set = db5.c6.f228307a;
        java.util.Iterator it = ((java.util.HashSet) set).iterator();
        while (it.hasNext()) {
            com.tencent.mm.ui.base.MMSlideDelView mMSlideDelView = (com.tencent.mm.ui.base.MMSlideDelView) it.next();
            if (mMSlideDelView != null) {
                mMSlideDelView.c();
            }
        }
        ((java.util.HashSet) set).clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closeMenuWithoutAnim", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$1");
    }

    @Override // db5.c6
    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("closeMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$1");
        java.util.Set set = db5.c6.f228307a;
        java.util.Iterator it = ((java.util.HashSet) set).iterator();
        while (it.hasNext()) {
            com.tencent.mm.ui.base.MMSlideDelView mMSlideDelView = (com.tencent.mm.ui.base.MMSlideDelView) it.next();
            if (mMSlideDelView != null) {
                mMSlideDelView.d();
            }
        }
        ((java.util.HashSet) set).clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("closeMenu", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$1");
    }

    @Override // db5.c6
    public void d(com.tencent.mm.ui.base.MMSlideDelView mMSlideDelView, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMenuShow", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$1");
        java.util.Set set = db5.c6.f228307a;
        if (z17) {
            ((java.util.HashSet) set).add(mMSlideDelView);
        } else {
            ((java.util.HashSet) set).remove(mMSlideDelView);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMenuShow", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$SnsMsgAdapter$1");
    }
}
