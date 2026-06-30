package z64;

/* loaded from: classes4.dex */
public class a implements y64.b {
    @Override // v64.c
    public boolean a(android.view.View view, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, v64.d dVar) {
        boolean z17;
        int i18;
        android.content.Intent intent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
        boolean z18 = false;
        if (view == null || snsInfo == null || snsInfo.getAdXml() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.ADXml adXml = snsInfo.getAdXml();
        java.lang.String str = adXml.xml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasAvatarCanvasNode", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
        try {
            z17 = za4.z0.v(str, "headCanvasInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasAvatarCanvasNode", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
        } catch (java.lang.Throwable unused) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasAvatarCanvasNode", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
            z17 = false;
        }
        if (!z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
            return false;
        }
        java.lang.String str2 = "";
        java.lang.String replaceAll = adXml.xml.replaceAll("(?s)<adCanvasInfo[^>]*>.*?</adCanvasInfo>", "").replaceAll("headCanvasInfo", "adCanvasInfo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFromScene", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
        if (i17 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFromScene", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
            i18 = 22;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFromScene", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
            i18 = 23;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toIntent", "com.tencent.mm.plugin.sns.ad.utils.AdLandPageIntentUtil");
        if (view.getContext() == null || android.text.TextUtils.isEmpty(replaceAll)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toIntent", "com.tencent.mm.plugin.sns.ad.utils.AdLandPageIntentUtil");
            intent = null;
        } else {
            intent = new android.content.Intent();
            intent.putExtra("sns_landing_pages_share_sns_id", snsInfo.getSnsId());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsRawId", "com.tencent.mm.plugin.sns.ad.utils.AdLandPageIntentUtil");
            if (snsInfo.getTimeLine() != null) {
                str2 = snsInfo.getTimeLine().Id;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsRawId", "com.tencent.mm.plugin.sns.ad.utils.AdLandPageIntentUtil");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsRawId", "com.tencent.mm.plugin.sns.ad.utils.AdLandPageIntentUtil");
            }
            intent.putExtra("sns_landing_pages_rawSnsId", str2);
            intent.putExtra("sns_landing_pages_ux_info", snsInfo.getUxinfo());
            intent.putExtra("sns_landing_pages_xml", replaceAll);
            a54.g.b(view.getContext(), intent, replaceAll);
            intent.putExtra("sns_landig_pages_from_source", i18);
            intent.putExtra("sns_landing_pages_xml_prefix", dm.n.COL_ADXML);
            intent.putExtra("sns_landing_is_native_sight_ad", true);
            intent.putExtra("sns_landing_page_start_time", java.lang.System.currentTimeMillis());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toIntent", "com.tencent.mm.plugin.sns.ad.utils.AdLandPageIntentUtil");
        }
        android.content.Context context = view.getContext();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startActivity", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
        if (intent == null || context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startActivity", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
        } else {
            try {
                if (context instanceof android.app.Activity) {
                    android.app.Activity activity = (android.app.Activity) context;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/clicker/avatar/impl/AdCanvasAvatarAction", "startActivity", "(Landroid/content/Context;Landroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activity.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(activity, "com/tencent/mm/plugin/sns/ad/timeline/clicker/avatar/impl/AdCanvasAvatarAction", "startActivity", "(Landroid/content/Context;Landroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    ((android.app.Activity) context).overridePendingTransition(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477728p);
                } else {
                    intent.addFlags(268435456);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/clicker/avatar/impl/AdCanvasAvatarAction", "startActivity", "(Landroid/content/Context;Landroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(context, "com/tencent/mm/plugin/sns/ad/timeline/clicker/avatar/impl/AdCanvasAvatarAction", "startActivity", "(Landroid/content/Context;Landroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startActivity", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
                z18 = true;
            } catch (java.lang.Throwable unused2) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startActivity", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
        return z18;
    }

    @Override // y64.b
    public void b(android.view.View view, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, v64.d dVar) {
        com.tencent.mm.modelsns.SnsAdClick snsAdClick;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
        if (dVar != null && (snsAdClick = (com.tencent.mm.modelsns.SnsAdClick) dVar.a("ext_sns_ad_click", null)) != null) {
            a84.u0.a(snsAdClick, 21);
            ca4.z0.x0(snsAdClick);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdCanvasAvatarAction");
    }
}
