package ee0;

@j95.b
/* loaded from: classes10.dex */
public final class b4 extends i95.w implements fe0.a4 {
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00a5, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsSingleVideoEditJumpMJ()) == 1) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider wi(java.lang.String r10, int r11, java.lang.String r12, java.lang.String r13, int r14, java.util.ArrayList r15) {
        /*
            r9 = this;
            java.lang.String r0 = "getSnsEditRecordConfigProvider"
            java.lang.String r1 = "com.tencent.mm.feature.sns.RecordConfigProviderService"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "inputPath"
            kotlin.jvm.internal.o.g(r10, r2)
            java.lang.String r2 = "outputVideo"
            kotlin.jvm.internal.o.g(r12, r2)
            java.lang.String r2 = "outputThumb"
            kotlin.jvm.internal.o.g(r13, r2)
            java.lang.String r2 = "allSelectedPaths"
            kotlin.jvm.internal.o.g(r15, r2)
            com.tencent.mm.plugin.sns.statistics.h r2 = com.tencent.mm.plugin.sns.statistics.h.f164856a
            java.lang.String r3 = "com.tencent.mm.plugin.sns.statistics.RecordConfigProviderHelper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r13 = com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider.c(r10, r12, r13)
            r13.f155685w = r11
            com.tencent.mm.plugin.sns.statistics.a r11 = com.tencent.mm.plugin.sns.statistics.a.f164826a
            boolean r4 = r11.g()
            r5 = 1
            r4 = r4 ^ r5
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r13.f155683u = r4
            r4 = 2
            r13.F = r4
            android.os.Bundle r6 = r13.M
            java.lang.String r7 = "KEY_TEC_REPORTRemuxHevcEncode_SCENE"
            r6.putInt(r7, r14)
            java.lang.Class<e42.e0> r14 = e42.e0.class
            i95.m r7 = i95.n0.c(r14)
            e42.e0 r7 = (e42.e0) r7
            e42.d0 r8 = e42.d0.clicfg_composition_fix_aspect_ratio_enable
            h62.d r7 = (h62.d) r7
            boolean r7 = r7.fj(r8, r5)
            java.lang.String r8 = "key_fix_aspect_ratio"
            r6.putBoolean(r8, r7)
            java.lang.Class<w40.e> r6 = w40.e.class
            i95.m r6 = i95.n0.c(r6)
            java.lang.String r7 = "getService(...)"
            kotlin.jvm.internal.o.f(r6, r7)
            w40.e r6 = (w40.e) r6
            r7 = 0
            r8 = 0
            boolean r6 = w40.e.ef(r6, r7, r5, r8)
            if (r6 == 0) goto L71
            android.os.Bundle r6 = r13.M
            java.lang.String r8 = "key_save_composition_info"
            r6.putBoolean(r8, r5)
        L71:
            android.os.Bundle r6 = r13.M
            java.lang.String r8 = "key_edit_enable_emoji_search"
            r6.putBoolean(r8, r5)
            r2.a(r13)
            android.os.Bundle r2 = r13.M
            java.lang.String r6 = "key_all_selected_paths"
            r2.putStringArrayList(r6, r15)
            android.os.Bundle r15 = r13.M
            bm5.o1 r2 = bm5.o1.f22719a
            com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsSingleVideoEditJumpMJ r6 = new com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsSingleVideoEditJumpMJ
            r6.<init>()
            int r2 = r2.h(r6)
            if (r2 == r4) goto La9
            r6 = 3
            if (r2 == r6) goto La8
            i95.m r14 = i95.n0.c(r14)
            e42.e0 r14 = (e42.e0) r14
            com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsSingleVideoEditJumpMJ r2 = new com.tencent.mm.repairer.config.mjtemplate.RepairerConfigSnsSingleVideoEditJumpMJ
            r2.<init>()
            h62.d r14 = (h62.d) r14
            int r14 = r14.nj(r2)
            if (r14 != r5) goto La8
            goto La9
        La8:
            r5 = r7
        La9:
            st3.l.f412553a = r5
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r2 = "updateJumpOnSnsSingleVideoEditor: "
            r14.<init>(r2)
            boolean r2 = st3.l.f412553a
            r14.append(r2)
            java.lang.String r14 = r14.toString()
            java.lang.String r2 = "MicroMsg.EditorJumpSecondCutAppConfig"
            com.tencent.mars.xlog.Log.i(r2, r14)
            boolean r14 = st3.l.f412553a
            java.lang.String r2 = "key_show_entrance_jump_secondcut"
            r15.putBoolean(r2, r14)
            android.os.Bundle r14 = r13.M
            boolean r15 = r11.b()
            java.lang.String r2 = "key_use_music_panel_v2"
            r14.putBoolean(r2, r15)
            ta4.b1 r14 = ta4.b1.f416725a
            r14.a(r10, r12)
            java.lang.String r10 = "getSnsAlbumVideoCompositionProvider"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r12)
            boolean r11 = r11.c()
            if (r11 == 0) goto Lea
            java.lang.String r11 = "com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout"
            r13.a(r4, r11)
        Lea:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r12)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ee0.b4.wi(java.lang.String, int, java.lang.String, java.lang.String, int, java.util.ArrayList):com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider");
    }
}
