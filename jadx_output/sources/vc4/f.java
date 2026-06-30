package vc4;

/* loaded from: classes4.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc4.p f435278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter f435279e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tk.p f435280f;

    public f(xc4.p pVar, com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter improveItemFooter, tk.p pVar2) {
        this.f435278d = pVar;
        this.f435279e = improveItemFooter;
        this.f435280f = pVar2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        r45.ed4 a17;
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadBizPostView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/item/header/ImproveItemFooter$loadBizPostView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wa4.l lVar = wa4.l.f444255a;
        android.content.Context context = this.f435279e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("postSnsPhotoToBiz", "com.tencent.mm.plugin.sns.snstimeline.SnsBizPostManager");
        xc4.p snsInfo = this.f435278d;
        kotlin.jvm.internal.o.g(snsInfo, "snsInfo");
        tk.p callback = this.f435280f;
        kotlin.jvm.internal.o.g(callback, "callback");
        wa4.f0 b17 = wa4.b0.f444203a.b(snsInfo.W0());
        if (b17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postSnsPhotoToBiz", "com.tencent.mm.plugin.sns.snstimeline.SnsBizPostManager");
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.List<wa4.c0> b18 = b17.b();
            if (b18 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postSnsPhotoToBiz", "com.tencent.mm.plugin.sns.snstimeline.SnsBizPostManager");
            } else {
                for (wa4.c0 c0Var : b18) {
                    c0Var.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPhotoPath", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPhotoPath", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
                    java.lang.String str = c0Var.f444207a;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLivePhoto", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLivePhoto", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
                    if (c0Var.f444209c) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoPath", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoPath", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
                        if (c0Var.f444208b != null) {
                            z17 = true;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoPath", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoPath", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
                            arrayList2.add(new com.tencent.pigeon.biz_base.PersonalCenterJumpPhotoInfo(str, null, null, null, null, java.lang.Boolean.valueOf(z17), c0Var.f444208b, null, null, null, null, null, null, null, null, null, 65438, null));
                        }
                    }
                    z17 = false;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getVideoPath", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getVideoPath", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Photo");
                    arrayList2.add(new com.tencent.pigeon.biz_base.PersonalCenterJumpPhotoInfo(str, null, null, null, null, java.lang.Boolean.valueOf(z17), c0Var.f444208b, null, null, null, null, null, null, null, null, null, 65438, null));
                }
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("mpPublishAction", 2);
                jSONObject.put("publishScene", "poi");
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "1385");
                org.json.JSONObject jSONObject3 = new org.json.JSONObject();
                jSONObject3.put("content", snsInfo.Y0());
                wa4.f0 b19 = wa4.b0.f444203a.b(snsInfo.W0());
                if (b19 != null && (a17 = b19.a()) != null) {
                    org.json.JSONObject jSONObject4 = new org.json.JSONObject();
                    jSONObject4.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, a17.f373314g);
                    jSONObject4.put("address", a17.f373315h);
                    jSONObject4.put("longitude", java.lang.Float.valueOf(a17.f373311d));
                    jSONObject4.put("latitude", java.lang.Float.valueOf(a17.f373312e));
                    jSONObject4.put("poiid", a17.f373316i);
                    jSONObject3.put("poiInfo", jSONObject4);
                }
                jSONObject2.put("nativeExtraData", jSONObject3);
                jSONObject.put("weAppParam", jSONObject2);
                ((ox.o) ((tk.q) i95.n0.c(tk.q.class))).Di(context, jSONObject, arrayList2, callback);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("postSnsPhotoToBiz", "com.tencent.mm.plugin.sns.snstimeline.SnsBizPostManager");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/item/header/ImproveItemFooter$loadBizPostView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemFooter$loadBizPostView$1");
    }
}
