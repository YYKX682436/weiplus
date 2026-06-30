package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.i f169862d;

    public x0(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        this.f169862d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.TagImageView tagImageView;
        com.tencent.mm.ui.MMImageView mMImageView;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        com.tencent.mm.plugin.sns.storage.ADInfo s17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$42");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$42", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag();
        if (tag instanceof com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) {
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) view.getTag();
            com.tencent.mm.plugin.sns.storage.SnsInfo a17 = com.tencent.mm.plugin.sns.storage.l1.a(baseViewHolder.f169264d);
            tagImageView = baseViewHolder.f169300v;
            snsInfo = a17;
            mMImageView = null;
        } else if (tag instanceof com.tencent.mm.plugin.sns.storage.SnsInfo) {
            snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) tag;
            mMImageView = (com.tencent.mm.ui.MMImageView) view.getTag(com.tencent.mm.R.id.i2r);
            tagImageView = null;
        } else {
            tagImageView = null;
            mMImageView = null;
            snsInfo = null;
        }
        if (snsInfo != null) {
            com.tencent.mm.plugin.sns.storage.AdSnsInfo adSnsInfo = snsInfo.getAdSnsInfo();
            boolean isAd = snsInfo.isAd();
            com.tencent.mm.plugin.sns.ui.listener.i iVar = this.f169862d;
            if (isAd) {
                com.tencent.mm.plugin.sns.storage.ADInfo s18 = com.tencent.mm.plugin.sns.ui.listener.i.s(iVar, snsInfo);
                if (snsInfo.getAdXml().isLandingPagesAd() && za4.z0.u(snsInfo.getAdSnsInfo().field_adxml)) {
                    java.lang.String a18 = za4.z0.a(snsInfo);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(a18)) {
                        adSnsInfo.field_adxml = a18;
                    }
                    int[] iArr = new int[2];
                    view.getLocationInWindow(iArr);
                    int width = view.getWidth();
                    int height = view.getHeight();
                    if (tagImageView != null) {
                        tagImageView.getLocationInWindow(iArr);
                        width = tagImageView.getWidth();
                        height = tagImageView.getHeight();
                    } else if (mMImageView != null) {
                        mMImageView.getLocationInWindow(iArr);
                        width = mMImageView.getWidth();
                        height = mMImageView.getHeight();
                    }
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("img_gallery_left", iArr[0]);
                    intent.putExtra("img_gallery_top", iArr[1]);
                    intent.putExtra("img_gallery_width", width);
                    intent.putExtra("img_gallery_height", height);
                    intent.putExtra("sns_landing_pages_share_sns_id", snsInfo.getSnsId());
                    intent.putExtra("sns_landing_pages_rawSnsId", snsInfo.getTimeLine().Id);
                    intent.putExtra("sns_landing_pages_ux_info", snsInfo.getUxinfo());
                    com.tencent.mm.protocal.protobuf.TimeLineObject timeLine = snsInfo.getTimeLine();
                    if (timeLine != null) {
                        java.util.LinkedList linkedList = timeLine.ContentObj.f369840h;
                        if (linkedList.size() > 0) {
                            intent.putExtra("sns_landing_pages_share_thumb_url", ((r45.jj4) linkedList.get(0)).f377860i);
                        }
                    }
                    java.lang.String str = snsInfo.getAdSnsInfo().field_adxml;
                    a54.g.b(com.tencent.mm.plugin.sns.ui.listener.i.e(iVar), intent, str);
                    intent.putExtra("sns_landig_pages_from_source", com.tencent.mm.plugin.sns.ui.listener.i.n(iVar) == 2 ? 16 : com.tencent.mm.plugin.sns.ui.listener.i.n(iVar) == 1 ? 10 : 9);
                    intent.putExtra("sns_landing_pages_xml", str);
                    intent.putExtra("sns_landing_pages_rec_src", snsInfo.getAdRecSrc());
                    intent.putExtra("sns_landing_pages_xml_prefix", dm.n.COL_ADXML);
                    intent.putExtra("sns_landing_pages_need_enter_and_exit_animation", true);
                    intent.putExtra("sns_landing_is_native_sight_ad", true);
                    intent.putExtra("sns_landing_page_start_time", java.lang.System.currentTimeMillis());
                    android.app.Activity e17 = com.tencent.mm.plugin.sns.ui.listener.i.e(iVar);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(e17, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$42", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    e17.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(e17, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$42", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    com.tencent.mm.plugin.sns.ui.listener.i.e(iVar).overridePendingTransition(0, 0);
                    ca4.z0.x0(new com.tencent.mm.modelsns.SnsAdClick(com.tencent.mm.plugin.sns.ui.listener.i.n(iVar), com.tencent.mm.plugin.sns.ui.listener.i.n(iVar) == 0 ? 1 : 2, snsInfo.field_snsId, 23, 21));
                    yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$42", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$42");
                    return;
                }
                if (s18 != null && s18.adActionType == 1) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("key_card_id", s18.adActionCardTpId);
                    intent2.putExtra("key_card_ext", s18.adActionCardExt);
                    intent2.putExtra("key_from_scene", 21);
                    intent2.putExtra("key_stastic_scene", 15);
                    j45.l.j(com.tencent.mm.plugin.sns.ui.listener.i.e(iVar), "card", ".ui.CardDetailUI", intent2, null);
                    ca4.z0.x0(new com.tencent.mm.modelsns.SnsAdClick(com.tencent.mm.plugin.sns.ui.listener.i.n(iVar), com.tencent.mm.plugin.sns.ui.listener.i.n(iVar) == 0 ? 1 : 2, snsInfo.field_snsId, 23, 11));
                    yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$42", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$42");
                    return;
                }
                if (com.tencent.mm.plugin.sns.ui.listener.i.g(iVar, s18, snsInfo, false)) {
                    ca4.z0.x0(new com.tencent.mm.modelsns.SnsAdClick(com.tencent.mm.plugin.sns.ui.listener.i.n(iVar), com.tencent.mm.plugin.sns.ui.listener.i.n(iVar) == 0 ? 1 : 2, snsInfo.field_snsId, 23, 31));
                    yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$42", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$42");
                    return;
                }
            }
            com.tencent.mm.modelsns.SnsAdClick snsAdClick = new com.tencent.mm.modelsns.SnsAdClick(com.tencent.mm.plugin.sns.ui.listener.i.n(iVar), com.tencent.mm.plugin.sns.ui.listener.i.n(iVar) == 0 ? 1 : 2, snsInfo.field_snsId, 23, 0);
            ca4.z0.x0(snsAdClick);
            java.lang.String adInfoLink = snsInfo.getAdInfoLink();
            if (com.tencent.mm.sdk.platformtools.t8.K0(adInfoLink)) {
                adInfoLink = snsInfo.getAdLink();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TimelineClickListener", "linkAdClick, adlink url " + adInfoLink + " " + snsInfo.getAdXml().webrightBar);
            android.content.Intent intent3 = new android.content.Intent();
            boolean z17 = x51.o1.f452071x ? false : snsInfo.getAdXml().webrightBar == 0;
            if (snsInfo.isAd() && (s17 = com.tencent.mm.plugin.sns.ui.listener.i.s(iVar, snsInfo)) != null) {
                intent3.putExtra("KsnsViewId", s17.viewId);
                adInfoLink = ca4.z0.b(adInfoLink, s17.uxInfo);
                ca4.z0.c(intent3, s17.uxInfo);
            }
            intent3.putExtra("KRightBtn", z17);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("KSnsAdTag", snsAdClick);
            bundle.putString("key_snsad_statextstr", adSnsInfo.getTimeLine().statExtStr);
            intent3.putExtra("jsapiargs", bundle);
            intent3.putExtra("rawUrl", adInfoLink);
            intent3.putExtra("useJs", true);
            intent3.putExtra("srcUsername", snsInfo.field_userName);
            intent3.putExtra("stastic_scene", 15);
            intent3.putExtra("KPublisherId", "sns_" + ca4.z0.t0(snsInfo.field_snsId));
            intent3.putExtra("pre_username", snsInfo.field_userName);
            intent3.putExtra("prePublishId", "sns_" + ca4.z0.t0(snsInfo.field_snsId));
            intent3.putExtra("preUsername", snsInfo.field_userName);
            iVar.u(intent3);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.D(intent3, com.tencent.mm.plugin.sns.ui.listener.i.e(iVar));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener$42", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$42");
    }
}
