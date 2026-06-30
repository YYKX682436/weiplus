package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ru extends com.tencent.mm.plugin.sns.ui.nv {
    @Override // sb4.v
    public void d(int i17, java.lang.String str, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPhotoClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$10");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPhotoClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        com.tencent.mm.plugin.sns.ui.SnsUserUI snsUserUI = this.f170058j;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsUserUI", "showImg snsinfo snslocalId:%d, pos:%d，mIsSelf:%b ", valueOf, valueOf2, java.lang.Boolean.valueOf(com.tencent.mm.plugin.sns.ui.SnsUserUI.Y6(snsUserUI)));
        dx1.g.f244489a.i("RecordMediaReporter", "moment_sessionid_", ca4.z0.l());
        com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI).F(i17);
        if (com.tencent.mm.plugin.sns.ui.SnsUserUI.Y6(snsUserUI) && i18 == -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("selectImageOrVideo", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            com.tencent.mm.plugin.sns.ui.ho hoVar = snsUserUI.L;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.SnsUserUI");
            hoVar.d();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectImageOrVideo", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
        } else {
            android.content.Intent intent = new android.content.Intent(snsUserUI, (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.SnsGalleryUI.class);
            intent.putExtra("sns_gallery_userName", com.tencent.mm.plugin.sns.ui.SnsUserUI.U6(snsUserUI));
            intent.putExtra("sns_gallery_is_self", com.tencent.mm.plugin.sns.ui.SnsUserUI.Y6(snsUserUI));
            intent.putExtra("sns_gallery_localId", i17);
            intent.putExtra("sns_source", com.tencent.mm.plugin.sns.ui.SnsUserUI.b7(snsUserUI));
            intent.putExtra("sns_gallery_st_time", com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI).w());
            intent.putExtra("sns_gallery_ed_time", com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI).s());
            intent.putExtra("key_from_scene", 4);
            intent.putExtra("INTENT_ALBUM_COMMENT_SESSION_ID", com.tencent.mm.plugin.sns.ui.SnsUserUI.Z6(snsUserUI));
            intent.putExtra("INTENT_ALBUM_SCENE", 2);
            if (com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI) != null) {
                intent.putExtra("sns_gallery_limit_seq", com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI).L());
                com.tencent.mm.plugin.sns.ui.SnsUserUI.c7(snsUserUI).s(com.tencent.mm.plugin.sns.ui.SnsUserUI.U6(snsUserUI), com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI).N(i17, i18));
                com.tencent.mm.plugin.sns.ui.so T6 = com.tencent.mm.plugin.sns.ui.SnsUserUI.T6(snsUserUI);
                T6.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFixPosition", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                int i19 = T6.M;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFixPosition", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
                intent.putExtra("sns_gallery_position", i19);
            }
            snsUserUI.startActivityForResult(intent, 8);
        }
        com.tencent.mm.plugin.sns.ui.SnsUserUI.a7(snsUserUI, com.tencent.mm.plugin.sns.model.l4.Fj().i1(i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPhotoClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$SnsEventListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPhotoClick", "com.tencent.mm.plugin.sns.ui.SnsUserUI$10");
    }
}
