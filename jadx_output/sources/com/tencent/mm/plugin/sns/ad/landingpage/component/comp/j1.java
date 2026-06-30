package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes4.dex */
public class j1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent f162859d;

    public j1(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent adLandingHBCardComponent) {
        this.f162859d = adLandingHBCardComponent;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$4");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent adLandingHBCardComponent = this.f162859d;
        android.content.Context context = adLandingHBCardComponent.f165049d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
        if (context instanceof com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) {
            f54.p R = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.R(adLandingHBCardComponent);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShageGiveCardXMLInfo", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
            java.lang.String str = "<giveHBCardInfo><twistCardId>" + R.A + "</twistCardId><giveCardId>" + R.F + "</giveCardId><senderUserName>" + com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getSelfUserName() + "</senderUserName><senderNickName>" + com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getSelfNickName() + "</senderNickName><subCardType>4</subCardType><shareTime>" + com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getSyncServerTimeSecond() + "</shareTime></giveHBCardInfo>";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShageGiveCardXMLInfo", "com.tencent.mm.plugin.sns.ad.helper.hbcovercard.ShareGiveHBCardInfo");
            java.lang.String str2 = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.R(adLandingHBCardComponent).L;
            java.lang.String selfNickName = com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getSelfNickName();
            if (android.text.TextUtils.isEmpty(str2)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                android.content.Context context2 = adLandingHBCardComponent.f165049d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
                str2 = context2.getString(com.tencent.mm.R.string.j7e);
            }
            if (!android.text.TextUtils.isEmpty(selfNickName)) {
                str2 = selfNickName + str2;
            }
            java.lang.String str3 = str2;
            com.tencent.mars.xlog.Log.i("AdLandingHBCardComponent", "onShareGiveCard, xml=" + str + ", shareTitle=" + str3 + ", compSubType=" + com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.R(adLandingHBCardComponent).f2826p);
            java.lang.String str4 = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.R(adLandingHBCardComponent).shareThumbUrl;
            if (android.text.TextUtils.isEmpty(str4)) {
                if (com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.R(adLandingHBCardComponent).f2826p == 0) {
                    str4 = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.R(adLandingHBCardComponent).hbImgUrl;
                    com.tencent.mars.xlog.Log.i("AdLandingHBCardComponent", "shareThumbUrl is empty, use hbImgUrl");
                } else if (com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.R(adLandingHBCardComponent).f2826p == 1 && com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.R(adLandingHBCardComponent).G != null && !android.text.TextUtils.isEmpty(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.R(adLandingHBCardComponent).G.thumbUrl)) {
                    str4 = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.R(adLandingHBCardComponent).G.thumbUrl;
                    com.tencent.mars.xlog.Log.i("AdLandingHBCardComponent", "shareThumbUrl is empty, use video.thumbUrl");
                }
            }
            java.lang.String str5 = str4;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            android.content.Context context3 = adLandingHBCardComponent.f165049d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent");
            com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI snsAdNativeLandingPagesUI = (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI) context3;
            java.lang.String str6 = com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.R(adLandingHBCardComponent).H;
            snsAdNativeLandingPagesUI.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shareGiveHbCard", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            if (com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI.Y7()) {
                snsAdNativeLandingPagesUI.o7(new com.tencent.mm.plugin.sns.ui.kc(snsAdNativeLandingPagesUI, str, str3, str6, str5));
            } else {
                snsAdNativeLandingPagesUI.n8(snsAdNativeLandingPagesUI.C, null, str, str3, str6, str5);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shareGiveHbCard", "com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesUI");
            if (com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.P(adLandingHBCardComponent) != 3) {
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.S(adLandingHBCardComponent).d(com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.P(adLandingHBCardComponent), false, 2);
            } else {
                com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent.S(adLandingHBCardComponent).d(2, true, 2);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/landingpage/component/comp/AdLandingHBCardComponent$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHBCardComponent$4");
    }
}
