package s74;

/* loaded from: classes4.dex */
public final class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s74.o2 f404390d;

    public k2(s74.o2 o2Var) {
        this.f404390d = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo;
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$updateActionBtnText$1");
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        if (Bi != null) {
            s74.o2 o2Var = this.f404390d;
            com.tencent.mm.plugin.sns.storage.ADXml.AdCardActionBtnInfo U = o2Var.U();
            java.lang.String str = null;
            if (!com.tencent.mm.sdk.platformtools.t8.K0((U == null || (adClickActionInfo2 = U.clickActionInfo) == null) ? null : adClickActionInfo2.M)) {
                com.tencent.mm.plugin.sns.storage.ADXml.AdCardActionBtnInfo U2 = o2Var.U();
                if (U2 != null && (adClickActionInfo = U2.clickActionInfo) != null) {
                    str = adClickActionInfo.M;
                }
                if (str == null) {
                    str = "";
                }
                com.tencent.mm.sdk.platformtools.u3.h(new s74.j2(Bi.n(str, true), o2Var));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.item.dynamicview.DynamicComponent$updateActionBtnText$1");
    }
}
