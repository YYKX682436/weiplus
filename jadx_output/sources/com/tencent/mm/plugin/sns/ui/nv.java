package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public abstract class nv extends sb4.v {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsUserUI f170058j;

    public nv(com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI) {
        this.f170058j = snsUserUI;
    }

    @Override // sb4.v
    public void a(int i17, java.lang.String str, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetailsMaskClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserUI", "click desc_count, localId = %d, position = %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI = this.f170058j;
        com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI).F(i17);
        if (com.tencent.mm.plugin.sns.ui.SnsUserUI.Y6(snsUserUI) && i18 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserUI", "click desc_count, position = -1");
        } else {
            android.content.Intent intent = new android.content.Intent(snsUserUI, (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.class);
            intent.putExtra("INTENT_TALKER", com.tencent.mm.plugin.sns.ui.SnsUserUI.U6(snsUserUI));
            intent.putExtra("INTENT_SNS_LOCAL_ID", com.tencent.mm.plugin.sns.storage.w2.i("sns_table_", i17));
            intent.putExtra("INTENT_FROMGALLERY", false);
            intent.putExtra("INTENT_NEED_RPT_FEED", true);
            intent.putExtra("INTENT_ALBUM_COMMENT_SESSION_ID", com.tencent.mm.plugin.sns.ui.SnsUserUI.Z6(snsUserUI));
            intent.putExtra("INTENT_ALBUM_SCENE", 2);
            com.tencent.mm.plugin.sns.ui.SnsUserUI.a7(snsUserUI, com.tencent.mm.plugin.sns.model.l4.Fj().i1(i17));
            snsUserUI.startActivityForResult(intent, 12);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetailsMaskClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
    }

    @Override // sb4.v
    public void b(int i17, java.lang.String str, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFailLongClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
        com.tencent.mm.plugin.sns.storage.SnsInfo i19 = com.tencent.mm.plugin.sns.model.l4.Fj().i1(i17);
        if (i19 != null && i19.isInValid() && i19.isDieItem()) {
            int i27 = com.tencent.mm.plugin.sns.ui.SnsUserUI.V;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI = this.f170058j;
            snsUserUI.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showDeleteDialog", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            db5.e1.j(snsUserUI, com.tencent.mm.R.string.f490369t2, com.tencent.mm.R.string.f490573yv, com.tencent.mm.R.string.f490507x1, com.tencent.mm.R.string.f490347sg, new com.tencent.mm.plugin.sns.ui.zu(snsUserUI, i17), new com.tencent.mm.plugin.sns.ui.av(snsUserUI));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showDeleteDialog", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFailLongClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
    }

    @Override // sb4.v
    public void c(int i17, java.lang.String str, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onHBClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
        com.tencent.mm.plugin.sns.storage.SnsInfo i19 = com.tencent.mm.plugin.sns.model.l4.Fj().i1(i17);
        if (i19 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onHBClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
            return;
        }
        com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI = this.f170058j;
        com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI).F(i17);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(snsUserUI, com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.class);
        intent.putExtra("INTENT_TALKER", i19.getUserName());
        intent.putExtra("INTENT_NEED_RPT_FEED", true);
        intent.putExtra("INTENT_SNS_LOCAL_ID", com.tencent.mm.plugin.sns.storage.w2.i("sns_table_", i17));
        intent.putExtra("INTENT_ALBUM_COMMENT_SESSION_ID", com.tencent.mm.plugin.sns.ui.SnsUserUI.Z6(snsUserUI));
        snsUserUI.startActivityForResult(intent, 12);
        com.tencent.mm.plugin.sns.ui.SnsUserUI.a7(snsUserUI, i19);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onHBClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
    }

    @Override // sb4.v
    public void e(int i17, java.lang.String str, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSignClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
        com.tencent.mm.plugin.sns.storage.SnsInfo i19 = com.tencent.mm.plugin.sns.model.l4.Fj().i1(i17);
        if (i19 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSignClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
            return;
        }
        com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI = this.f170058j;
        com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI).F(i17);
        if (i19.field_type == 15) {
            android.content.Intent intent = new android.content.Intent(snsUserUI, (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.SnsGalleryUI.class);
            intent.putExtra("sns_gallery_userName", com.tencent.mm.plugin.sns.ui.SnsUserUI.U6(snsUserUI));
            intent.putExtra("sns_gallery_is_self", com.tencent.mm.plugin.sns.ui.SnsUserUI.Y6(snsUserUI));
            intent.putExtra("sns_gallery_localId", i17);
            intent.putExtra("sns_source", com.tencent.mm.plugin.sns.ui.SnsUserUI.b7(snsUserUI));
            intent.putExtra("sns_gallery_st_time", com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI).w());
            intent.putExtra("sns_gallery_ed_time", com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI).s());
            intent.putExtra("sns_video_scene", 4);
            intent.putExtra("key_from_scene", 4);
            intent.putExtra("INTENT_ALBUM_COMMENT_SESSION_ID", com.tencent.mm.plugin.sns.ui.SnsUserUI.Z6(snsUserUI));
            intent.putExtra("INTENT_ALBUM_SCENE", 2);
            if (com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI) != null) {
                intent.putExtra("sns_gallery_limit_seq", com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI).L());
                com.tencent.mm.plugin.sns.ui.SnsUserUI.c7(snsUserUI).s(com.tencent.mm.plugin.sns.ui.SnsUserUI.U6(snsUserUI), com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI).N(i17, i18));
                com.tencent.mm.plugin.sns.ui.so T6 = com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI);
                T6.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFixPosition", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                int i27 = T6.M;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFixPosition", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                intent.putExtra("sns_gallery_position", i27);
            }
            snsUserUI.startActivityForResult(intent, 8);
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.setClass(snsUserUI, com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.class);
            intent2.putExtra("INTENT_TALKER", i19.getUserName());
            intent2.putExtra("INTENT_NEED_RPT_FEED", true);
            intent2.putExtra("INTENT_SNS_LOCAL_ID", com.tencent.mm.plugin.sns.storage.w2.i("sns_table_", i17));
            intent2.putExtra("INTENT_ALBUM_COMMENT_SESSION_ID", com.tencent.mm.plugin.sns.ui.SnsUserUI.Z6(snsUserUI));
            snsUserUI.startActivityForResult(intent2, 12);
        }
        com.tencent.mm.plugin.sns.ui.SnsUserUI.a7(snsUserUI, i19);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSignClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
    }
}
