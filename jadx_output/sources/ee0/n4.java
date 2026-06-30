package ee0;

@j95.b
/* loaded from: classes4.dex */
public final class n4 extends i95.w implements fe0.k4 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f251496d = Zi();

    public void Ai(java.lang.String path, android.os.Bundle extraData, java.lang.String extraKey) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkEmotionSafeStrategyInfoList", "com.tencent.mm.feature.sns.SnsFeatureService");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(extraData, "extraData");
        kotlin.jvm.internal.o.g(extraKey, "extraKey");
        com.tencent.mm.plugin.sns.model.g6.f164210a.c(path, extraData, extraKey);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkEmotionSafeStrategyInfoList", "com.tencent.mm.feature.sns.SnsFeatureService");
    }

    public java.lang.String Bi() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSnsPostSessionId", "com.tencent.mm.feature.sns.SnsFeatureService");
        java.lang.String l17 = ca4.z0.l();
        kotlin.jvm.internal.o.f(l17, "checkSnsPostSessionId(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsPostSessionId", "com.tencent.mm.feature.sns.SnsFeatureService");
        return l17;
    }

    public boolean Di() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableCheckVideoThumbSize", "com.tencent.mm.feature.sns.SnsFeatureService");
        pc4.d dVar = pc4.d.f353410a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableVideoThumbSizeCheck", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_video_thumb_resize, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableVideoThumbSizeCheck", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableCheckVideoThumbSize", "com.tencent.mm.feature.sns.SnsFeatureService");
        return fj6;
    }

    public fe0.g4 Ni() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsCoverStg", "com.tencent.mm.feature.sns.SnsFeatureService");
        com.tencent.mm.plugin.sns.storage.a2 Bj = com.tencent.mm.plugin.sns.model.l4.Bj();
        kotlin.jvm.internal.o.f(Bj, "getSnsCoverStg(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsCoverStg", "com.tencent.mm.feature.sns.SnsFeatureService");
        return Bj;
    }

    public jz5.l Ri() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsMediaPath", "com.tencent.mm.feature.sns.SnsFeatureService");
        jz5.l b17 = je4.c.f299317a.b();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsMediaPath", "com.tencent.mm.feature.sns.SnsFeatureService");
        return b17;
    }

    public boolean Ui(android.content.Context context, android.content.Intent intent, int i17, fe0.j4 j4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpToSnsUI", "com.tencent.mm.feature.sns.SnsFeatureService");
        kotlin.jvm.internal.o.g(context, "context");
        if (!gm0.j1.b().m()) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsFeatureService", null, "account has not Initialized", new java.lang.Object[0]);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToSnsUI", "com.tencent.mm.feature.sns.SnsFeatureService");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("useFlutter", "com.tencent.mm.feature.sns.SnsFeatureService");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useFlutter", "com.tencent.mm.feature.sns.SnsFeatureService");
        android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
        intent2.putExtra("sns_enter_scene", i17);
        if (j4Var != null) {
            if (j4Var.f261404a) {
                intent2.addFlags(67108864);
            }
            intent2.putExtra("sns_timeline_NeedFirstLoadint", j4Var.f261405b);
            intent2.putExtra("enter_by_red", j4Var.f261406c);
            intent2.putExtra("sns_jump_timestamp", java.lang.System.currentTimeMillis());
            intent2.putExtra("is_sns_notify_open", j4Var.f261407d);
            intent2.putExtra("sns_unread_count", j4Var.f261408e);
            intent2.putExtra("is_need_resend_sns", j4Var.f261411h);
            if (!android.text.TextUtils.isEmpty(j4Var.f261409f)) {
                intent2.putExtra("new_feed_id", j4Var.f261409f);
            }
            intent2.putExtra("sns_resume_state", j4Var.f261410g);
            intent2.putExtra("sns_red_dot_info", j4Var.f261412i);
        }
        boolean Zi = Zi();
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.SnsFeatureService", "enterScene:" + i17 + " data:" + j4Var + " use improve ui:" + Zi, new java.lang.Object[0]);
        if (Zi != this.f251496d) {
            com.tencent.mm.plugin.sns.model.l4.qj().a();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("preHandle", "com.tencent.mm.feature.sns.SnsFeatureService");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("preHandle", "com.tencent.mm.feature.sns.SnsFeatureService");
        this.f251496d = Zi;
        pc4.d.f353410a.G();
        if (Zi) {
            if (!(context instanceof android.app.Activity)) {
                intent2.addFlags(268435456);
            }
            intent2.setClass(context, com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/sns/SnsFeatureService", "jumpToSnsUI", "(Landroid/content/Context;Landroid/content/Intent;ILcom/tencent/mm/feature/sns/api/ISnsFeatureService$SnsJumpData;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/feature/sns/SnsFeatureService", "jumpToSnsUI", "(Landroid/content/Context;Landroid/content/Intent;ILcom/tencent/mm/feature/sns/api/ISnsFeatureService$SnsJumpData;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            if (!(context instanceof android.app.Activity)) {
                intent2.addFlags(268435456);
            }
            intent2.setClass(context, com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/feature/sns/SnsFeatureService", "jumpToSnsUI", "(Landroid/content/Context;Landroid/content/Intent;ILcom/tencent/mm/feature/sns/api/ISnsFeatureService$SnsJumpData;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(context, "com/tencent/mm/feature/sns/SnsFeatureService", "jumpToSnsUI", "(Landroid/content/Context;Landroid/content/Intent;ILcom/tencent/mm/feature/sns/api/ISnsFeatureService$SnsJumpData;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToSnsUI", "com.tencent.mm.feature.sns.SnsFeatureService");
        return true;
    }

    public void Vi(android.content.Context context, android.content.Intent intent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpToSnsUITemp", "com.tencent.mm.feature.sns.SnsFeatureService");
        kotlin.jvm.internal.o.g(context, "context");
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_all_improve_ui_enable, true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFeatureService", "jumpToSnsUITemp new");
            Ui(context, intent, 0, null);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFeatureService", "jumpToSnsUITemp old");
            Ui(context, intent, 0, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToSnsUITemp", "com.tencent.mm.feature.sns.SnsFeatureService");
    }

    public boolean Zi() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("useImproveSnsUI", "com.tencent.mm.feature.sns.SnsFeatureService");
        boolean z17 = false;
        if (!gm0.j1.b().m()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useImproveSnsUI", "com.tencent.mm.feature.sns.SnsFeatureService");
            return false;
        }
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_USE_IMPROVEUI_INT_SYNC, 0);
        if (r17 != 1) {
            if (r17 != 2) {
                boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_improve_ui_enable, true);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useImproveSnsUI", "com.tencent.mm.feature.sns.SnsFeatureService");
                return fj6;
            }
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useImproveSnsUI", "com.tencent.mm.feature.sns.SnsFeatureService");
        return z17;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAccountInitialized", "com.tencent.mm.feature.sns.SnsFeatureService");
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("useFlutter", "com.tencent.mm.feature.sns.SnsFeatureService");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useFlutter", "com.tencent.mm.feature.sns.SnsFeatureService");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAccountInitialized", "com.tencent.mm.feature.sns.SnsFeatureService");
    }

    public boolean wi() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canSetFinderAsCover", "com.tencent.mm.feature.sns.SnsFeatureService");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canSetFinderAsCover", "com.tencent.mm.plugin.sns.util.SetSnsBgFromFinderUtils");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_cover_enable, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canSetFinderAsCover", "com.tencent.mm.plugin.sns.util.SetSnsBgFromFinderUtils");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canSetFinderAsCover", "com.tencent.mm.feature.sns.SnsFeatureService");
        return fj6;
    }
}
