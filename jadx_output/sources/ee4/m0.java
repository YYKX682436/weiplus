package ee4;

/* loaded from: classes4.dex */
public final class m0 extends ee4.t {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(ce4.b pcContext) {
        super(pcContext);
        kotlin.jvm.internal.o.g(pcContext, "pcContext");
    }

    @Override // ce4.a
    public java.lang.String d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicGoAlbumPc");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicGoAlbumPc");
        return "SnsPublish.PicGoAlbumPc";
    }

    public final void p() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("goAlbumUI", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicGoAlbumPc");
        int f17 = 9 - m().v().f();
        if (f17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PicWidget", "has select the max image count");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("goAlbumUI", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicGoAlbumPc");
            return;
        }
        java.lang.String string = c().getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getString("gallery", "1");
        java.lang.String str = string != null ? string : "1";
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13822, 2, 2, ca4.z0.l(), java.lang.Long.valueOf(c01.id.c()));
        if (r26.i0.p(str, "0", true)) {
            com.tencent.mm.pluginsdk.ui.tools.l7.c(c(), 2, 1, 0, 1, false, null);
        } else if (f17 < 9) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_can_select_video_and_pic", true);
            intent.putExtra("Gallery_LivePhoto_Need_Query", pc4.e.f353426a.a());
            com.tencent.mm.pluginsdk.ui.tools.l7.c(c(), 9, f17, 4, 1, com.tencent.mm.plugin.sns.ui.ws.a(), intent);
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_edit_video_max_time_length", d11.s.fj().nj().f71195h);
            intent2.putExtra("key_can_select_video_and_pic", !(gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_TOP_STORY_VLOG_ENABLE_INT, 0) == 1 || ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_enable_vlog, false)));
            ((uy0.h) i95.n0.c(uy0.h.class)).getClass();
            if (ez0.o.f257835a.h()) {
                intent2.putExtra("key_sns_publish_template", true);
                f17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_publish_template_media_num, 20);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsTemplateExptConfig", "getPublishTemplateMediaNum: " + f17);
            }
            intent2.putExtra("key_can_select_video_and_pic", false);
            intent2.putExtra("Gallery_LivePhoto_Need_Query", pc4.e.f353426a.a());
            com.tencent.mm.pluginsdk.ui.tools.l7.c(c(), 9, f17, 4, 3, com.tencent.mm.plugin.sns.ui.ws.a(), intent2);
        }
        n().q(2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("goAlbumUI", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicGoAlbumPc");
    }
}
