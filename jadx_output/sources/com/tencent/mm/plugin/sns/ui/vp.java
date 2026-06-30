package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class vp implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI f170708d;

    public vp(com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI snsSightPlayerUI) {
        this.f170708d = snsSightPlayerUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI snsSightPlayerUI = this.f170708d;
        if (com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.a7(snsSightPlayerUI).isAd()) {
            i64.s1.a(i64.o1.Sight, i64.n1.EnterCompleteVideo, com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.a7(snsSightPlayerUI), com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.U6(snsSightPlayerUI));
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.b7(snsSightPlayerUI).f377855d);
        java.lang.String I = ca4.z0.I(com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.b7(snsSightPlayerUI));
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_landing_page_new_stream_video, 1) > 0) {
            intent.setClass(snsSightPlayerUI, com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI.class);
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsSightPlayerUI", "use new stream video play UI");
        } else {
            intent.setClass(snsSightPlayerUI, com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.class);
        }
        intent.putExtra("KFullVideoPath", d17 + I);
        intent.putExtra("KThumbPath", com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.c7(snsSightPlayerUI));
        intent.putExtra("KFromTimeLine", true);
        intent.putExtra("KStremVideoUrl", com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.b7(snsSightPlayerUI).f377875x);
        intent.putExtra("KThumUrl", com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.b7(snsSightPlayerUI).B) ? com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.b7(snsSightPlayerUI).f377860i : com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.b7(snsSightPlayerUI).B);
        intent.putExtra("KMediaId", com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.b7(snsSightPlayerUI).f377855d);
        intent.putExtra("KUrl", com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.b7(snsSightPlayerUI).f377858g);
        intent.putExtra("KViewId", com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.T6(snsSightPlayerUI).viewId);
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.a7(snsSightPlayerUI).getTimeLine();
        intent.putExtra("KSta_StremVideoAduxInfo", com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.T6(snsSightPlayerUI) == null ? "" : com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.T6(snsSightPlayerUI).uxInfo);
        intent.putExtra("KSta_StremVideoPublishId", timeLine.Id);
        intent.putExtra("KSta_SourceType", 1);
        intent.putExtra("KSta_Scene", i64.o1.Sight.f289269d);
        intent.putExtra("KSta_FromUserName", timeLine.UserName);
        intent.putExtra("KSta_SnSId", timeLine.Id);
        intent.putExtra("KSta_SnsStatExtStr", timeLine.statExtStr);
        intent.putExtra("KMediaVideoTime", com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.b7(snsSightPlayerUI).A);
        intent.putExtra("KMediaTitle", com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.b7(snsSightPlayerUI).C) ? timeLine.ContentDesc : com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.b7(snsSightPlayerUI).C);
        com.tencent.mm.plugin.sns.storage.ADXml adXml = com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.a7(snsSightPlayerUI).getAdXml();
        if (adXml != null && adXml.attachShareLinkIsHidden == 0) {
            intent.putExtra("StreamWording", adXml.attachShareLinkWording);
            intent.putExtra("StremWebUrl", adXml.attachShareLinkUrl);
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.d7(snsSightPlayerUI));
        if (com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.U6(snsSightPlayerUI) == 0) {
            m21.w.d(com.tencent.mm.plugin.appbrand.jsapi.j4.CTRL_INDEX);
        } else {
            m21.w.c(com.tencent.mm.plugin.appbrand.jsapi.j4.CTRL_INDEX);
        }
        ca4.z0.T(k17);
        int i17 = k17.field_type;
        k17.getUxinfo();
        int i18 = com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.b7(snsSightPlayerUI).A;
        m21.w d18 = com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.U6(snsSightPlayerUI) == 0 ? m21.w.d(com.tencent.mm.plugin.appbrand.ad.jsapi.u.CTRL_INDEX) : m21.w.c(com.tencent.mm.plugin.appbrand.ad.jsapi.u.CTRL_INDEX);
        ca4.z0.T(k17);
        k17.getUxinfo();
        int i19 = com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.b7(snsSightPlayerUI).A;
        d18.g(intent);
        com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI snsSightPlayerUI2 = this.f170708d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(snsSightPlayerUI2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        snsSightPlayerUI2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(snsSightPlayerUI2, "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ca4.z0.x0(new com.tencent.mm.modelsns.SnsAdClick(com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.U6(snsSightPlayerUI), 5, k17.field_snsId, 14, 0));
        if (com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.U6(snsSightPlayerUI) == 0) {
            com.tencent.mm.autogen.events.SnsAdLongVideoBrowseStatusChangedForDataReportEvent snsAdLongVideoBrowseStatusChangedForDataReportEvent = new com.tencent.mm.autogen.events.SnsAdLongVideoBrowseStatusChangedForDataReportEvent();
            snsAdLongVideoBrowseStatusChangedForDataReportEvent.f54795g.getClass();
            snsAdLongVideoBrowseStatusChangedForDataReportEvent.e();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsSightPlayerUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$3");
    }
}
