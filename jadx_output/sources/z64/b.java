package z64;

/* loaded from: classes4.dex */
public class b implements y64.b {
    @Override // v64.c
    public boolean a(android.view.View view, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, v64.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
        if (view == null || snsInfo == null || snsInfo.getAdXml() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
            return false;
        }
        s34.m0 m0Var = snsInfo.getAdXml().adHeadFinderProfile;
        if (m0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
            return false;
        }
        try {
            android.content.Context context = view.getContext();
            if (context != null && snsInfo.getAdInfo(i17) != null) {
                com.tencent.mm.plugin.sns.storage.ADXml adXml = snsInfo.getAdXml();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAvatarToFinderProfile", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
                boolean z17 = (adXml == null || adXml.headClickType != 4 || adXml.adHeadFinderProfile == null) ? false : true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAvatarToFinderProfile", "com.tencent.mm.plugin.sns.ad.helper.FinderAdJumpHelper");
                if (z17) {
                    boolean h17 = l44.s4.h(context, m0Var.f402708a, snsInfo.getAdInfo(i17).uxInfo, ca4.z0.t0(snsInfo.field_snsId), 1);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
                    return h17;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
            return false;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.AdFinderProfileAvatarAction", "doAction exp=" + th6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
            return false;
        }
    }

    @Override // y64.b
    public void b(android.view.View view, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, v64.d dVar) {
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        s34.m0 m0Var;
        com.tencent.mm.modelsns.SnsAdClick snsAdClick;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportAd", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAd", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
        } else {
            try {
                adXml = snsInfo.getAdXml();
                m0Var = adXml.adHeadFinderProfile;
            } catch (java.lang.Exception e17) {
                java.lang.Object[] objArr = {e17.getMessage()};
                int i18 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.AdFinderProfileAvatarAction", e17, "reportAd crash: %s", objArr);
            }
            if (m0Var == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAd", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
            } else {
                java.lang.String str = m0Var.f402708a;
                java.lang.String t07 = ca4.z0.t0(snsInfo.field_snsId);
                if (adXml.adFinderInfo == null) {
                    java.lang.String str2 = adXml.adHeadFinderProfile.f402709b;
                }
                p52.h.f352016a.f(l44.s4.m(snsInfo.getUxinfo(), t07, 1), str);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportAd", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
            }
        }
        if (dVar != null && (snsAdClick = (com.tencent.mm.modelsns.SnsAdClick) dVar.a("ext_sns_ad_click", null)) != null) {
            a84.u0.a(snsAdClick, 41);
            ca4.z0.x0(snsAdClick);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderProfileAvatarAction");
    }
}
