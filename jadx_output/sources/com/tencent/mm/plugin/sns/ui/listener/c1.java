package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class c1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.i f169765d;

    public c1(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        this.f169765d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.listener.i iVar;
        int i17;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.storage.ADInfo s17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$6");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() == null || !(view.getTag() instanceof java.lang.Long)) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$6");
            return;
        }
        com.tencent.mm.plugin.sns.storage.AdSnsInfo y07 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(((java.lang.Long) view.getTag()).longValue());
        com.tencent.mm.plugin.sns.storage.SnsInfo convertToSnsInfo = y07.convertToSnsInfo();
        i64.o1 o1Var = i64.o1.Sight;
        i64.n1 n1Var = i64.n1.DetailTimeline;
        com.tencent.mm.plugin.sns.storage.SnsInfo convertToSnsInfo2 = y07.convertToSnsInfo();
        com.tencent.mm.plugin.sns.ui.listener.i iVar2 = this.f169765d;
        i64.s1.a(o1Var, n1Var, convertToSnsInfo2, com.tencent.mm.plugin.sns.ui.listener.i.n(iVar2));
        y07.getSource();
        java.lang.String adInfoLink = convertToSnsInfo.getAdInfoLink();
        if (com.tencent.mm.sdk.platformtools.t8.K0(adInfoLink)) {
            adInfoLink = convertToSnsInfo.getAdLink();
        }
        java.lang.String str3 = adInfoLink;
        if (convertToSnsInfo.isAd()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "ad ontag click");
            com.tencent.mm.plugin.sns.storage.ADInfo s18 = com.tencent.mm.plugin.sns.ui.listener.i.s(iVar2, convertToSnsInfo);
            if (com.tencent.mm.plugin.sns.ad.widget.living.v.a(convertToSnsInfo)) {
                com.tencent.mm.autogen.events.SnsAdLivingStreamJumpEvent snsAdLivingStreamJumpEvent = new com.tencent.mm.autogen.events.SnsAdLivingStreamJumpEvent();
                snsAdLivingStreamJumpEvent.f54794g.f6405a = ca4.z0.T(convertToSnsInfo);
                snsAdLivingStreamJumpEvent.e();
            }
            java.lang.Object tag = view.getTag(com.tencent.mm.R.id.n4g);
            if ((tag instanceof w64.k) && com.tencent.mm.plugin.sns.ui.listener.i.t(iVar2) != null) {
                com.tencent.mm.plugin.sns.ui.listener.i.t(iVar2).w((w64.k) tag);
            }
            w64.x i18 = w64.x.i(view);
            if (com.tencent.mm.plugin.sns.ui.listener.i.c(iVar2, convertToSnsInfo)) {
                com.tencent.mm.plugin.sns.ui.listener.i.d(iVar2, view, convertToSnsInfo, i18);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$6");
                return;
            }
            str = "MicroMsg.TimelineClickListener";
            if (ca4.m0.R(com.tencent.mm.plugin.sns.ui.listener.i.e(iVar2), convertToSnsInfo, s18, com.tencent.mm.plugin.sns.ui.listener.i.n(iVar2), iVar2.f169805h, 3, 0)) {
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$6");
                return;
            }
            if (s18 != null && s18.adActionType == 1) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_card_id", s18.adActionCardTpId);
                intent.putExtra("key_card_ext", s18.adActionCardExt);
                intent.putExtra("key_from_scene", 21);
                intent.putExtra("key_stastic_scene", 15);
                j45.l.j(com.tencent.mm.plugin.sns.ui.listener.i.e(iVar2), "card", ".ui.CardDetailUI", intent, null);
                com.tencent.mm.modelsns.SnsAdClick snsAdClick = new com.tencent.mm.modelsns.SnsAdClick(com.tencent.mm.plugin.sns.ui.listener.i.n(iVar2), com.tencent.mm.plugin.sns.ui.listener.i.n(iVar2) == 0 ? 1 : 2, convertToSnsInfo.field_snsId, 3, 11);
                ca4.m0.f(snsAdClick, iVar2.f169805h, convertToSnsInfo, 3);
                ca4.z0.x0(snsAdClick);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$6");
                return;
            }
            iVar = iVar2;
            i17 = 3;
            if (s18 == null || s18.adActionType != 3) {
                if (com.tencent.mm.plugin.sns.ui.listener.i.g(iVar, s18, convertToSnsInfo, false)) {
                    com.tencent.mm.modelsns.SnsAdClick snsAdClick2 = new com.tencent.mm.modelsns.SnsAdClick(com.tencent.mm.plugin.sns.ui.listener.i.n(iVar), com.tencent.mm.plugin.sns.ui.listener.i.n(iVar) == 0 ? 1 : 2, convertToSnsInfo.field_snsId, 3, 31);
                    ca4.m0.f(snsAdClick2, iVar.f169805h, convertToSnsInfo, 3);
                    ca4.z0.x0(snsAdClick2);
                    yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$6");
                    return;
                }
                if (l44.s4.b(com.tencent.mm.plugin.sns.ui.listener.i.e(iVar), convertToSnsInfo.getAdXml(), convertToSnsInfo.getAdInfo(), convertToSnsInfo.field_snsId, 2)) {
                    com.tencent.mm.modelsns.SnsAdClick snsAdClick3 = new com.tencent.mm.modelsns.SnsAdClick(com.tencent.mm.plugin.sns.ui.listener.i.n(iVar), com.tencent.mm.plugin.sns.ui.listener.i.n(iVar) == 0 ? 1 : 2, convertToSnsInfo.field_snsId, 3, 41);
                    ca4.m0.f(snsAdClick3, iVar.f169805h, convertToSnsInfo, 3);
                    ca4.z0.x0(snsAdClick3);
                    yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$6");
                    return;
                }
                if (com.tencent.mm.plugin.sns.ui.listener.i.c(iVar, convertToSnsInfo)) {
                    com.tencent.mm.plugin.sns.ui.listener.i.d(iVar, view, convertToSnsInfo, i18);
                    yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$6");
                    return;
                }
            } else if (convertToSnsInfo.getAdXml().isLandingPagesAd() && za4.z0.u(convertToSnsInfo.getAdSnsInfo().field_adxml)) {
                java.lang.String a17 = za4.z0.a(convertToSnsInfo);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                    y07.field_adxml = a17;
                }
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("sns_landing_pages_share_sns_id", convertToSnsInfo.getSnsId());
                intent2.putExtra("sns_landing_pages_rawSnsId", convertToSnsInfo.getTimeLine().Id);
                intent2.putExtra("sns_landing_pages_ux_info", convertToSnsInfo.getUxinfo());
                intent2.putExtra("sns_landing_pages_aid", convertToSnsInfo.getAid());
                intent2.putExtra("sns_landing_pages_traceid", convertToSnsInfo.getTraceid());
                com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = convertToSnsInfo.getTimeLine();
                if (timeLine != null) {
                    java.util.LinkedList linkedList = timeLine.ContentObj.f369840h;
                    if (linkedList.size() > 0) {
                        intent2.putExtra("sns_landing_pages_share_thumb_url", ((r45.jj4) linkedList.get(0)).f377860i);
                    }
                    if (timeLine.ContentObj.f369837e == 15) {
                        intent2.putExtra("sns_landing_is_native_sight_ad", true);
                    }
                }
                com.tencent.mm.plugin.sns.ui.listener.i.f(iVar, intent2, convertToSnsInfo);
                java.lang.String str4 = convertToSnsInfo.getAdSnsInfo().field_adxml;
                a54.g.b(com.tencent.mm.plugin.sns.ui.listener.i.e(iVar), intent2, str4);
                intent2.putExtra("sns_landig_pages_from_source", com.tencent.mm.plugin.sns.ui.listener.i.n(iVar) == 2 ? 16 : com.tencent.mm.plugin.sns.ui.listener.i.n(iVar) == 1 ? 10 : 9);
                intent2.putExtra("sns_landing_pages_xml", str4);
                intent2.putExtra("sns_landing_pages_rec_src", convertToSnsInfo.getAdRecSrc());
                intent2.putExtra("sns_landing_pages_xml_prefix", dm.n.COL_ADXML);
                intent2.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
                intent2.putExtra("sns_landing_page_start_time", java.lang.System.currentTimeMillis());
                w64.x.g(intent2, i18, convertToSnsInfo.getAdXml().forbiddenCustomAnimation);
                iVar.U(i18, convertToSnsInfo.getAdXml().forbiddenCustomAnimation);
                android.app.Activity e17 = com.tencent.mm.plugin.sns.ui.listener.i.e(iVar);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(e17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                e17.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(e17, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                if (!convertToSnsInfo.getAdXml().forbiddenCustomAnimation && i18 != null && i18.l() != 0 && w64.x.h(i18)) {
                    com.tencent.mm.plugin.sns.ui.listener.i.e(iVar).overridePendingTransition(0, 0);
                }
                com.tencent.mm.modelsns.SnsAdClick snsAdClick4 = new com.tencent.mm.modelsns.SnsAdClick(com.tencent.mm.plugin.sns.ui.listener.i.n(iVar), com.tencent.mm.plugin.sns.ui.listener.i.n(iVar) == 0 ? 1 : 2, convertToSnsInfo.field_snsId, 3, 21);
                ca4.m0.f(snsAdClick4, iVar.f169805h, convertToSnsInfo, 3);
                ca4.z0.x0(snsAdClick4);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$6");
                return;
            }
        } else {
            str = "MicroMsg.TimelineClickListener";
            iVar = iVar2;
            i17 = 3;
        }
        com.tencent.mm.modelsns.SnsAdClick snsAdClick5 = new com.tencent.mm.modelsns.SnsAdClick(com.tencent.mm.plugin.sns.ui.listener.i.n(iVar), com.tencent.mm.plugin.sns.ui.listener.i.n(iVar) == 0 ? 1 : 2, convertToSnsInfo.field_snsId, 3, 0);
        ca4.m0.f(snsAdClick5, iVar.f169805h, convertToSnsInfo, i17);
        ca4.z0.x0(snsAdClick5);
        com.tencent.mars.xlog.Log.i(str, "adTagClick, adlink url " + str3 + " " + convertToSnsInfo.getAdXml().webrightBar);
        android.content.Intent intent3 = new android.content.Intent();
        boolean z17 = convertToSnsInfo.getAdXml().webrightBar == 0;
        if (x51.o1.f452071x) {
            z17 = false;
        }
        if (!convertToSnsInfo.isAd() || (s17 = com.tencent.mm.plugin.sns.ui.listener.i.s(iVar, convertToSnsInfo)) == null) {
            str2 = str3;
        } else {
            intent3.putExtra("KsnsViewId", s17.viewId);
            str2 = f44.a.e((convertToSnsInfo.getAdXml().adActionLinkClickInfo == null || convertToSnsInfo.getAdXml().adActionLinkClickInfo.f162579f) ? str3 : ca4.z0.b(str3, s17.uxInfo));
            ca4.z0.c(intent3, s17.uxInfo);
        }
        intent3.putExtra("KRightBtn", z17);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("KSnsAdTag", snsAdClick5);
        bundle.putString("key_snsad_statextstr", y07.getTimeLine().statExtStr);
        intent3.putExtra("jsapiargs", bundle);
        intent3.putExtra("rawUrl", str2);
        intent3.putExtra("useJs", true);
        intent3.putExtra("srcUsername", convertToSnsInfo.field_userName);
        intent3.putExtra("sns_local_id", convertToSnsInfo.getLocalid());
        intent3.putExtra("stastic_scene", 15);
        intent3.putExtra("KPublisherId", "sns_" + ca4.z0.t0(convertToSnsInfo.field_snsId));
        intent3.putExtra("pre_username", convertToSnsInfo.field_userName);
        intent3.putExtra("prePublishId", "sns_" + ca4.z0.t0(convertToSnsInfo.field_snsId));
        intent3.putExtra("preUsername", convertToSnsInfo.field_userName);
        iVar.u(intent3);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.D(intent3, com.tencent.mm.plugin.sns.ui.listener.i.e(iVar));
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$6");
    }
}
