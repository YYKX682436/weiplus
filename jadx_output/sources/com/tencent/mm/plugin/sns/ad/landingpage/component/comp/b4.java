package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class b4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f54.g0 f162765d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.g4 f162766e;

    public b4(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.g4 g4Var, f54.g0 g0Var) {
        this.f162766e = g4Var;
        this.f162765d = g0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent$1");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.g4 g4Var = this.f162766e;
        java.util.ArrayList arrayList = this.f162765d.K;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        g4Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkFriends", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            java.lang.String isFriend = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().isFriend(str);
            com.tencent.mars.xlog.Log.i("AdLandingSocialCardComponent", "checkFriends, hashUserName=" + str + ", realUserName=" + isFriend);
            if (!android.text.TextUtils.isEmpty(isFriend)) {
                arrayList2.add(isFriend);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkFriends", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        if (arrayList2.isEmpty()) {
            com.tencent.mars.xlog.Log.w("AdLandingSocialCardComponent", "friends is empty");
        } else {
            this.f162766e.D = 0;
        }
        com.tencent.mars.xlog.Log.i("AdLandingSocialCardComponent", "uiType=" + this.f162766e.D);
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.sns.ad.landingpage.component.comp.a4(this, arrayList2));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent$1");
    }
}
