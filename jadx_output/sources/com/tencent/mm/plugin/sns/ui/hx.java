package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class hx implements android.view.View.OnClickListener {
    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        long j17 = com.tencent.mm.plugin.sns.ui.kw.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        if (currentTimeMillis - j17 < 500) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        com.tencent.mm.plugin.sns.ui.kw.C = currentTimeMillis;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$002", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
        android.content.Context context = view.getContext();
        if (view.getTag() instanceof com.tencent.mm.plugin.sns.ui.i2) {
            com.tencent.mm.plugin.sns.ui.i2 i2Var = (com.tencent.mm.plugin.sns.ui.i2) view.getTag();
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = i2Var.f168549a;
            int i17 = timeLineObject.ContentObj.f369837e;
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject2 = i2Var.f168549a;
            if (i17 == 18) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adUrlClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                com.tencent.mm.plugin.sns.ui.kw.O(i2Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("goVideoPlayerForAdurl", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(i2Var.f168550b);
                i64.o1 o1Var = i64.o1.AdUrl;
                i64.s1.a(o1Var, i64.n1.EnterCompleteVideo, k17, com.tencent.mm.plugin.sns.ui.kw.A);
                android.content.Intent intent = new android.content.Intent();
                r45.jj4 jj4Var = timeLineObject2.ContentObj.f369840h.size() > 0 ? (r45.jj4) timeLineObject2.ContentObj.f369840h.get(0) : null;
                intent.putExtra("KFromTimeLine", false);
                intent.putExtra("KStremVideoUrl", timeLineObject2.ContentObj.f369839g);
                intent.putExtra("KSta_SourceType", 2);
                intent.putExtra("KSta_Scene", o1Var.f289269d);
                intent.putExtra("KSta_FromUserName", timeLineObject2.UserName);
                intent.putExtra("KSta_SnSId", timeLineObject2.Id);
                if (jj4Var == null) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fakeid_");
                    sb6.append(jj4Var == null ? timeLineObject2.Id : jj4Var.f377855d);
                    intent.putExtra("KMediaId", sb6.toString());
                } else {
                    intent.putExtra("KMediaId", jj4Var.f377855d);
                }
                r45.tf6 tf6Var = timeLineObject2.streamvideo;
                if (tf6Var != null) {
                    intent.putExtra("KMediaVideoTime", tf6Var.f386380e);
                    intent.putExtra("StreamWording", tf6Var.f386381f);
                    intent.putExtra("StremWebUrl", tf6Var.f386382g);
                    intent.putExtra("KMediaTitle", tf6Var.f386383h);
                    intent.putExtra("KStremVideoUrl", tf6Var.f386379d);
                    intent.putExtra("KThumUrl", tf6Var.f386384i);
                    intent.putExtra("KSta_StremVideoAduxInfo", tf6Var.f386385m);
                    intent.putExtra("KSta_StremVideoPublishId", tf6Var.f386386n);
                }
                intent.putExtra("KSta_SnsStatExtStr", timeLineObject2.statExtStr);
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ad_landing_page_new_stream_video, 1) > 0) {
                    j45.l.j(context, "sns", ".ui.SnsAdStreamVideoPlayUI", intent, null);
                    com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineClickEvent", "use new stream video play UI");
                } else {
                    j45.l.j(context, "sns", ".ui.VideoAdPlayerUI", intent, null);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("goVideoPlayerForAdurl", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adUrlClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                return;
            }
            r45.y97 y97Var = timeLineObject.webSearchInfo;
            if (y97Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(y97Var.f390898d)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("webSearchClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                com.tencent.mm.plugin.sns.ui.kw.O(i2Var);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("goToWebSearchVideoListUI", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                r45.y97 y97Var2 = timeLineObject2.webSearchInfo;
                if (y97Var2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(y97Var2.f390898d)) {
                    mf0.z zVar = (mf0.z) i95.n0.c(mf0.z.class);
                    ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
                    java.lang.String optString = su4.o2.d("discoverRecommendEntry").optString("wording");
                    ((lf0.u) zVar).getClass();
                    r45.un6 q17 = pm4.w.q(y97Var2, 31, optString);
                    ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
                    su4.r2.r(context, q17);
                    ((lf0.u) ((mf0.d0) i95.n0.c(mf0.d0.class))).getClass();
                    java.lang.String str = timeLineObject2.UserName;
                    java.lang.String str2 = timeLineObject2.Id;
                    java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("isShareClick=1&relevant_vid=");
                    stringBuffer.append(y97Var2.f390898d);
                    stringBuffer.append("&relevant_pre_searchid=");
                    stringBuffer.append(y97Var2.f390900f);
                    stringBuffer.append("&relevant_shared_openid=");
                    stringBuffer.append(y97Var2.f390901g);
                    stringBuffer.append("&rec_category=");
                    long j18 = y97Var2.f390915x;
                    if (j18 > 0) {
                        stringBuffer.append(j18);
                    } else {
                        stringBuffer.append(y97Var2.f390902h);
                    }
                    stringBuffer.append("&source=");
                    stringBuffer.append(y97Var2.f390910s);
                    stringBuffer.append("&fromUser=");
                    stringBuffer.append(str);
                    stringBuffer.append("&fromScene=3&targetInfo=");
                    stringBuffer.append(str2);
                    stringBuffer.append("&expand=");
                    stringBuffer.append(y97Var2.f390899e);
                    com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryReportApiLogic", "reportTopStoryClickShareItem 15371 %s", stringBuffer.toString());
                    r45.lq5 lq5Var = new r45.lq5();
                    lq5Var.f379756t = stringBuffer.toString();
                    gm0.j1.d().g(new su4.a2(lq5Var));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("goToWebSearchVideoListUI", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("webSearchClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent");
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                return;
            }
            int i18 = timeLineObject.ContentObj.f369837e;
            if (i18 == 28 || i18 == 50 || i18 == 59) {
                com.tencent.mm.plugin.sns.ui.kw.u(context, i2Var);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                return;
            }
            if (i18 == 36) {
                com.tencent.mm.plugin.sns.ui.kw.t(context, i2Var);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                return;
            }
            if (i18 == 34 || i18 == 45 || i18 == 43) {
                com.tencent.mm.plugin.sns.ui.kw.r(context, i2Var, view);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                return;
            }
            if (i18 == 29) {
                com.tencent.mm.plugin.sns.ui.kw.v(context, i2Var);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                return;
            }
            if (i18 == 37) {
                com.tencent.mm.plugin.sns.ui.kw.q(context, i2Var);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                return;
            }
            if (i18 == 38) {
                com.tencent.mm.plugin.sns.ui.kw.p(context, i2Var);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                return;
            }
            if (i18 == 53) {
                com.tencent.mm.plugin.sns.ui.kw.s(context, i2Var);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                return;
            }
            if (i18 == 39) {
                com.tencent.mm.plugin.sns.ui.kw.o(context, i2Var);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                return;
            }
            if (i18 == 44) {
                com.tencent.mm.plugin.sns.ui.kw.G(context, i2Var);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                return;
            }
            if (i18 == 46 || i18 == 51) {
                com.tencent.mm.plugin.sns.ui.kw.D(context, i2Var);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                return;
            }
            if (i18 == 52) {
                com.tencent.mm.plugin.sns.ui.kw.M(context, i2Var);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                return;
            }
            if ((i18 == 47 || i18 == 48) && !je4.g.c(context, timeLineObject, true)) {
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                return;
            }
            int i19 = timeLineObject.ContentObj.f369837e;
            if (i19 == 55) {
                com.tencent.mm.plugin.sns.ui.kw.F(context, i2Var);
                yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                return;
            } else {
                if (i19 == 56) {
                    com.tencent.mm.plugin.sns.ui.kw.i(context, i2Var);
                    yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
                    return;
                }
                com.tencent.mm.plugin.sns.ui.kw.N(context, i2Var, view, com.tencent.mm.plugin.sns.ui.kw.B, com.tencent.mm.plugin.sns.ui.kw.a());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/TimeLineClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.TimeLineClickEvent$2");
    }
}
