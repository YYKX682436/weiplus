package n34;

/* loaded from: classes4.dex */
public final class f4 extends sb4.v {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.SnsStarListUIC f334597j;

    public f4(com.tencent.mm.plugin.sns.SnsStarListUIC snsStarListUIC) {
        this.f334597j = snsStarListUIC;
    }

    @Override // sb4.v
    public void a(int i17, java.lang.String snsId, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetailsMaskClick", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$1");
        kotlin.jvm.internal.o.g(snsId, "snsId");
        pb4.e eVar = pb4.e.f353196a;
        com.tencent.mm.plugin.sns.storage.SnsInfo g17 = eVar.g(com.tencent.mm.plugin.sns.storage.w2.n(snsId));
        if (g17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetailsMaskClick", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$1");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarListUIC", "click desc_count, localId = %d, position = %d, snsId = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), snsId);
        com.tencent.mm.plugin.sns.SnsStarListUIC snsStarListUIC = this.f334597j;
        sb4.w Q6 = com.tencent.mm.plugin.sns.SnsStarListUIC.Q6(snsStarListUIC);
        if (Q6 != null) {
            Q6.F(i17);
        }
        android.content.Intent intent = new android.content.Intent(snsStarListUIC.getActivity(), (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.class);
        intent.putExtra("INTENT_TALKER", com.tencent.mm.plugin.sns.SnsStarListUIC.R6(snsStarListUIC));
        intent.putExtra("INTENT_SNS_LOCAL_ID", eVar.j(g17));
        intent.putExtra("INTENT_FROMGALLERY", false);
        intent.putExtra("INTENT_NEED_RPT_FEED", true);
        intent.putExtra("INTENT_STAR_LIST", true);
        intent.putExtra("INTENT_ALBUM_COMMENT_SESSION_ID", com.tencent.mm.plugin.sns.SnsStarListUIC.O6(snsStarListUIC));
        androidx.appcompat.app.AppCompatActivity activity = snsStarListUIC.getActivity();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/sns/SnsStarListUIC$initData$1", "onDetailsMaskClick", "(ILjava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/sns/SnsStarListUIC$initData$1", "onDetailsMaskClick", "(ILjava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.plugin.sns.SnsStarListUIC.S6(snsStarListUIC, g17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetailsMaskClick", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$1");
    }

    @Override // sb4.v
    public void b(int i17, java.lang.String snsId, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFailLongClick", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$1");
        kotlin.jvm.internal.o.g(snsId, "snsId");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFailLongClick", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$1");
    }

    @Override // sb4.v
    public void c(int i17, java.lang.String snsId, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onHBClick", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$1");
        kotlin.jvm.internal.o.g(snsId, "snsId");
        pb4.e eVar = pb4.e.f353196a;
        com.tencent.mm.plugin.sns.storage.SnsInfo g17 = eVar.g(com.tencent.mm.plugin.sns.storage.w2.n(snsId));
        if (g17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onHBClick", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$1");
            return;
        }
        com.tencent.mm.plugin.sns.SnsStarListUIC snsStarListUIC = this.f334597j;
        sb4.w Q6 = com.tencent.mm.plugin.sns.SnsStarListUIC.Q6(snsStarListUIC);
        if (Q6 != null) {
            Q6.F(i17);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(snsStarListUIC.getActivity(), com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.class);
        intent.putExtra("INTENT_TALKER", g17.getUserName());
        intent.putExtra("INTENT_NEED_RPT_FEED", true);
        intent.putExtra("INTENT_STAR_LIST", true);
        intent.putExtra("INTENT_SNS_LOCAL_ID", eVar.j(g17));
        intent.putExtra("INTENT_ALBUM_COMMENT_SESSION_ID", com.tencent.mm.plugin.sns.SnsStarListUIC.O6(snsStarListUIC));
        androidx.appcompat.app.AppCompatActivity activity = snsStarListUIC.getActivity();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/sns/SnsStarListUIC$initData$1", "onHBClick", "(ILjava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/sns/SnsStarListUIC$initData$1", "onHBClick", "(ILjava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.plugin.sns.SnsStarListUIC.S6(snsStarListUIC, g17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onHBClick", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$1");
    }

    @Override // sb4.v
    public void d(int i17, java.lang.String snsId, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPhotoClick", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$1");
        kotlin.jvm.internal.o.g(snsId, "snsId");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isSelf$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        com.tencent.mm.plugin.sns.SnsStarListUIC snsStarListUIC = this.f334597j;
        boolean z17 = snsStarListUIC.f162547m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isSelf$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarListUIC", "showImg snsinfo snslocalId:%d, pos:%d，mIsSelf:%b, ", valueOf, valueOf2, java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.sns.storage.SnsInfo g17 = pb4.e.f353196a.g(com.tencent.mm.plugin.sns.storage.w2.n(snsId));
        if (g17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPhotoClick", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$1");
            return;
        }
        sb4.w Q6 = com.tencent.mm.plugin.sns.SnsStarListUIC.Q6(snsStarListUIC);
        if (Q6 != null) {
            Q6.F(i17);
        }
        if (com.tencent.mm.plugin.sns.SnsStarListUIC.Q6(snsStarListUIC) != null) {
            android.content.Intent intent = new android.content.Intent(snsStarListUIC.getActivity(), (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.SnsGalleryUI.class);
            intent.putExtra("sns_gallery_userName", com.tencent.mm.plugin.sns.SnsStarListUIC.R6(snsStarListUIC));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isSelf$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
            boolean z18 = snsStarListUIC.f162547m;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isSelf$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
            intent.putExtra("sns_gallery_is_self", z18);
            intent.putExtra("sns_gallery_localId", snsId);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSnsSource$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
            int i19 = snsStarListUIC.f162548n;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSnsSource$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
            intent.putExtra("sns_source", i19);
            sb4.w Q62 = com.tencent.mm.plugin.sns.SnsStarListUIC.Q6(snsStarListUIC);
            kotlin.jvm.internal.o.d(Q62);
            intent.putExtra("sns_gallery_st_time", Q62.w());
            sb4.w Q63 = com.tencent.mm.plugin.sns.SnsStarListUIC.Q6(snsStarListUIC);
            kotlin.jvm.internal.o.d(Q63);
            intent.putExtra("sns_gallery_ed_time", Q63.s());
            intent.putExtra("key_from_scene", 4);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSnsServer$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
            com.tencent.mm.plugin.sns.model.d6 d6Var = snsStarListUIC.f162550p;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSnsServer$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
            if (d6Var != null) {
                java.lang.String R6 = com.tencent.mm.plugin.sns.SnsStarListUIC.R6(snsStarListUIC);
                sb4.w Q64 = com.tencent.mm.plugin.sns.SnsStarListUIC.Q6(snsStarListUIC);
                kotlin.jvm.internal.o.d(Q64);
                d6Var.s(R6, Q64.H(snsId, i18));
            }
            sb4.w Q65 = com.tencent.mm.plugin.sns.SnsStarListUIC.Q6(snsStarListUIC);
            kotlin.jvm.internal.o.d(Q65);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFixPosition", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
            int i27 = Q65.D;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFixPosition", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
            intent.putExtra("sns_gallery_position", i27);
            intent.putExtra("INTENT_ALBUM_COMMENT_SESSION_ID", com.tencent.mm.plugin.sns.SnsStarListUIC.O6(snsStarListUIC));
            intent.putExtra("INTENT_STAR_LIST", true);
            intent.putExtra("INTENT_ALBUM_SCENE", 9);
            snsStarListUIC.getActivity().startActivityForResult(intent, 1);
        }
        com.tencent.mm.plugin.sns.SnsStarListUIC.S6(snsStarListUIC, g17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPhotoClick", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$1");
    }

    @Override // sb4.v
    public void e(int i17, java.lang.String snsId, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSignClick", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$1");
        kotlin.jvm.internal.o.g(snsId, "snsId");
        pb4.e eVar = pb4.e.f353196a;
        com.tencent.mm.plugin.sns.storage.SnsInfo g17 = eVar.g(com.tencent.mm.plugin.sns.storage.w2.n(snsId));
        if (g17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSignClick", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$1");
            return;
        }
        com.tencent.mm.plugin.sns.SnsStarListUIC snsStarListUIC = this.f334597j;
        if (com.tencent.mm.plugin.sns.SnsStarListUIC.Q6(snsStarListUIC) != null) {
            sb4.w Q6 = com.tencent.mm.plugin.sns.SnsStarListUIC.Q6(snsStarListUIC);
            if (Q6 != null) {
                Q6.F(i17);
            }
            if (g17.field_type == 15) {
                android.content.Intent intent = new android.content.Intent(snsStarListUIC.getActivity(), (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.SnsGalleryUI.class);
                intent.putExtra("sns_gallery_userName", com.tencent.mm.plugin.sns.SnsStarListUIC.R6(snsStarListUIC));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$isSelf$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
                boolean z17 = snsStarListUIC.f162547m;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$isSelf$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
                intent.putExtra("sns_gallery_is_self", z17);
                intent.putExtra("sns_gallery_localId", snsId);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSnsSource$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
                int i19 = snsStarListUIC.f162548n;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSnsSource$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
                intent.putExtra("sns_source", i19);
                sb4.w Q62 = com.tencent.mm.plugin.sns.SnsStarListUIC.Q6(snsStarListUIC);
                intent.putExtra("sns_gallery_st_time", Q62 != null ? java.lang.Integer.valueOf(Q62.w()) : null);
                sb4.w Q63 = com.tencent.mm.plugin.sns.SnsStarListUIC.Q6(snsStarListUIC);
                intent.putExtra("sns_gallery_ed_time", Q63 != null ? java.lang.Integer.valueOf(Q63.s()) : null);
                intent.putExtra("sns_video_scene", 4);
                intent.putExtra("key_from_scene", 4);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSnsServer$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
                com.tencent.mm.plugin.sns.model.d6 d6Var = snsStarListUIC.f162550p;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSnsServer$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
                if (d6Var != null) {
                    java.lang.String R6 = com.tencent.mm.plugin.sns.SnsStarListUIC.R6(snsStarListUIC);
                    sb4.w Q64 = com.tencent.mm.plugin.sns.SnsStarListUIC.Q6(snsStarListUIC);
                    kotlin.jvm.internal.o.d(Q64);
                    d6Var.s(R6, Q64.H(snsId, i18));
                }
                sb4.w Q65 = com.tencent.mm.plugin.sns.SnsStarListUIC.Q6(snsStarListUIC);
                kotlin.jvm.internal.o.d(Q65);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFixPosition", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
                int i27 = Q65.D;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFixPosition", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarListAdapter");
                intent.putExtra("sns_gallery_position", i27);
                intent.putExtra("INTENT_ALBUM_COMMENT_SESSION_ID", com.tencent.mm.plugin.sns.SnsStarListUIC.O6(snsStarListUIC));
                intent.putExtra("INTENT_STAR_LIST", true);
                intent.putExtra("INTENT_ALBUM_SCENE", 9);
                snsStarListUIC.getActivity().startActivityForResult(intent, 1);
            } else {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.setClass(snsStarListUIC.getActivity(), com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.class);
                intent2.putExtra("INTENT_TALKER", g17.getUserName());
                intent2.putExtra("INTENT_NEED_RPT_FEED", true);
                intent2.putExtra("INTENT_SNS_LOCAL_ID", eVar.j(g17));
                intent2.putExtra("INTENT_ALBUM_COMMENT_SESSION_ID", com.tencent.mm.plugin.sns.SnsStarListUIC.O6(snsStarListUIC));
                intent2.putExtra("INTENT_STAR_LIST", true);
                intent2.putExtra("INTENT_ALBUM_SCENE", 9);
                androidx.appcompat.app.AppCompatActivity activity = snsStarListUIC.getActivity();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent2);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/sns/SnsStarListUIC$initData$1", "onSignClick", "(ILjava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(activity, "com/tencent/mm/plugin/sns/SnsStarListUIC$initData$1", "onSignClick", "(ILjava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        com.tencent.mm.plugin.sns.SnsStarListUIC.S6(snsStarListUIC, g17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSignClick", "com.tencent.mm.plugin.sns.SnsStarListUIC$initData$1");
    }
}
