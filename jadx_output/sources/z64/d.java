package z64;

/* loaded from: classes4.dex */
public class d implements y64.b {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f470454a;

    /* JADX WARN: Failed to find 'out' block for switch in B:24:0x0076. Please report as an issue. */
    @Override // v64.c
    public boolean a(android.view.View view, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, v64.d dVar) {
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo;
        int i18;
        boolean z17;
        x64.u uVar;
        com.tencent.mm.plugin.sns.ad.adxml.AdJumpKefuConfirmInfo adJumpKefuConfirmInfo;
        s34.p0 p0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
        if (view == null || snsInfo == null || snsInfo.getAdXml() == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdGeneralAvatarAction", "view or snsInfo or adXml is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo = snsInfo.getAdInfo(i17);
        if (adInfo == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdGeneralAvatarAction", "adInfo is null and source is " + i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = snsInfo.getAdXml();
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo2 = adXml.headAdClickActionInfo;
        this.f470454a = adClickActionInfo2;
        if (adClickActionInfo2 == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdGeneralAvatarAction", "mHeadAdClickActionInfo is null and source is " + i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
            return false;
        }
        com.tencent.mm.modelsns.SnsAdClick snsAdClick = dVar != null ? (com.tencent.mm.modelsns.SnsAdClick) dVar.a("ext_sns_ad_click", null) : null;
        android.content.Context context = view.getContext();
        try {
            adClickActionInfo = this.f470454a;
            i18 = adClickActionInfo.f162571b;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdGeneralAvatarAction", "doAction exp=" + android.util.Log.getStackTraceString(th6));
        }
        if (i18 != 22) {
            if (i18 != 27) {
                switch (i18) {
                    case 17:
                        boolean a17 = n74.u.a(adClickActionInfo, adInfo);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
                        return a17;
                    case 18:
                        z17 = context instanceof com.tencent.mm.ui.MMActivity;
                        uVar = x64.u.f452333a;
                        if (z17 || (adJumpKefuConfirmInfo = this.f470454a.A0) == null || !adJumpKefuConfirmInfo.d()) {
                            uVar.c(this.f470454a, snsInfo, context);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
                            return true;
                        }
                        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo3 = this.f470454a;
                        if (adClickActionInfo3.f162575d == 0) {
                            uVar.a(view, adClickActionInfo3, context, snsInfo, 0, i17, snsInfo.getAdXml().adExtInfo, 23);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
                            return true;
                        }
                        com.tencent.mars.xlog.Log.e("SnsAd.AdGeneralAvatarAction", "click avatar, kefu do not jump half screen");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
                        return false;
                    case 19:
                        if (context != null) {
                            a84.u0.a(snsAdClick, 39);
                            boolean a18 = n74.v.a(context, this.f470454a, i17, snsAdClick);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
                            return a18;
                        }
                        break;
                    default:
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
                        return false;
                }
            }
            if (context != null && (p0Var = adClickActionInfo.f162620z0) != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppId", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppId", "com.tencent.mm.plugin.sns.ad.adxml.AdLiteAppInfo");
                if (!p0Var.f402732a.isEmpty()) {
                    boolean a19 = n74.x.a(context, this.f470454a.f162620z0);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
                    return a19;
                }
            }
        }
        java.lang.String str = snsInfo.getAdInfo(i17).uxInfo;
        java.lang.String aid = snsInfo.getAid();
        java.lang.String t07 = ca4.z0.t0(snsInfo.field_snsId);
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo4 = this.f470454a;
        s34.p1 p1Var = adClickActionInfo4.f162612v0;
        if (p1Var == null || !(context instanceof com.tencent.mm.ui.MMActivity)) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdGeneralAvatarAction", "click avatar, qrClickActionInfo is null or context is not MMActivity");
        } else {
            if (adClickActionInfo4.f162575d == 0) {
                l44.p3.d(p1Var, (com.tencent.mm.ui.MMActivity) context, str, aid, t07, i17, adXml.adExtInfo);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
                return true;
            }
            com.tencent.mars.xlog.Log.e("SnsAd.AdGeneralAvatarAction", "click avatar, do not jump half screen");
        }
        z17 = context instanceof com.tencent.mm.ui.MMActivity;
        uVar = x64.u.f452333a;
        if (z17) {
        }
        uVar.c(this.f470454a, snsInfo, context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
        return true;
    }

    @Override // y64.b
    public void b(android.view.View view, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, v64.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
        if (view == null || snsInfo == null || snsInfo.getAdXml() == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdGeneralAvatarAction", "afterAction, view or snsInfo or adXml is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
            return;
        }
        if (snsInfo.getAdInfo(i17) == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdGeneralAvatarAction", "afterAction, adInfo is null and source is " + i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
            return;
        }
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = snsInfo.getAdXml().headAdClickActionInfo;
        this.f470454a = adClickActionInfo;
        if (adClickActionInfo == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdGeneralAvatarAction", "afterAction, mHeadAdClickActionInfo is null and source is " + i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
            return;
        }
        if (dVar != null) {
            try {
                com.tencent.mm.modelsns.SnsAdClick snsAdClick = (com.tencent.mm.modelsns.SnsAdClick) dVar.a("ext_sns_ad_click", null);
                if (snsAdClick != null) {
                    int i18 = this.f470454a.f162571b;
                    if (i18 == 22) {
                        a84.u0.a(snsAdClick, 54);
                        ca4.z0.x0(snsAdClick);
                    } else if (i18 != 27) {
                        switch (i18) {
                            case 17:
                                a84.u0.a(snsAdClick, 51);
                                ca4.z0.x0(snsAdClick);
                                break;
                            case 18:
                                a84.u0.a(snsAdClick, 64);
                                ca4.z0.x0(snsAdClick);
                                break;
                            case 19:
                                a84.u0.a(snsAdClick, 39);
                                ca4.z0.x0(snsAdClick);
                                break;
                        }
                    } else {
                        a84.u0.a(snsAdClick, 65);
                        ca4.z0.x0(snsAdClick);
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("SnsAd.AdGeneralAvatarAction", "afterAction exp=" + android.util.Log.getStackTraceString(th6));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdGeneralAvatarAction");
    }
}
