package com.tencent.mm.plugin.profile.ui.tab.observer;

/* loaded from: classes9.dex */
public class BizProfileExtraOperateObserver extends com.tencent.mm.plugin.profile.ui.tab.observer.BaseBizProfileOperateObserver {
    @Override // com.tencent.mm.plugin.profile.ui.tab.observer.BaseBizProfileOperateObserver, zr3.a
    public boolean Q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17) {
        iz5.a.g(null, z3Var != null);
        java.lang.String d17 = z3Var.d1();
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (d17 == null) {
            d17 = "";
        }
        iz5.a.g(null, d17.length() > 0);
        iz5.a.g(null, rVar != null);
        return true;
    }
}
