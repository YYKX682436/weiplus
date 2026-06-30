package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.statistics.h f164856a = new com.tencent.mm.plugin.sns.statistics.h();

    public final void a(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addShowThirdJump", "com.tencent.mm.plugin.sns.statistics.RecordConfigProviderHelper");
        if (!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).gl()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordConfigProviderHelper", "[addShowThirdJump] return 1");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addShowThirdJump", "com.tencent.mm.plugin.sns.statistics.RecordConfigProviderHelper");
            return;
        }
        w40.e eVar = (w40.e) i95.n0.c(w40.e.class);
        kotlin.jvm.internal.o.d(eVar);
        if (!w40.e.ef(eVar, false, 1, null)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordConfigProviderHelper", "[addShowThirdJump] return 2");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addShowThirdJump", "com.tencent.mm.plugin.sns.statistics.RecordConfigProviderHelper");
            return;
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.A8).getValue()).r()).intValue() == 1) {
            recordConfigProvider.M.putBoolean("KEY_SHOW_THIRD_JUMP", true);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addShowThirdJump", "com.tencent.mm.plugin.sns.statistics.RecordConfigProviderHelper");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordConfigProviderHelper", "[addShowThirdJump] return 3");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addShowThirdJump", "com.tencent.mm.plugin.sns.statistics.RecordConfigProviderHelper");
        }
    }

    public final com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider b(java.lang.String filePath, java.lang.String thumbPath, com.tencent.mm.modelcontrol.VideoTransPara videoParams, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsRecordVideoConfigProvider", "com.tencent.mm.plugin.sns.statistics.RecordConfigProviderHelper");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.jvm.internal.o.g(thumbPath, "thumbPath");
        kotlin.jvm.internal.o.g(videoParams, "videoParams");
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider g17 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.g(filePath, thumbPath, videoParams, i17, 2);
        videoParams.f71204t = 288;
        g17.F = 2;
        com.tencent.mm.plugin.sns.statistics.a aVar = com.tencent.mm.plugin.sns.statistics.a.f164826a;
        g17.f155683u = java.lang.Boolean.valueOf(!aVar.h());
        g17.M.putInt("KEY_TEC_REPORTRemuxHevcEncode_SCENE", i18);
        i95.m c17 = i95.n0.c(w40.e.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        if (w40.e.ef((w40.e) c17, false, 1, null)) {
            g17.M.putBoolean("key_save_composition_info", true);
        }
        g17.M.putBoolean("key_edit_enable_emoji_search", true);
        g17.M.putBoolean("key_use_music_panel_v2", aVar.b());
        a(g17);
        aVar.d(g17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsRecordVideoConfigProvider", "com.tencent.mm.plugin.sns.statistics.RecordConfigProviderHelper");
        return g17;
    }
}
