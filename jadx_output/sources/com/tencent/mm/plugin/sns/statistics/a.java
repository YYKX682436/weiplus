package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.sns.statistics.a f164826a = new com.tencent.mm.plugin.sns.statistics.a();

    public final void a(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider provider, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealRecordEntrance", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        kotlin.jvm.internal.o.g(provider, "provider");
        if (i17 == 1) {
            provider.a(0, "com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveCameraKitPluginLayout");
        } else if (i17 == 2) {
            provider.a(0, "com.tencent.mm.plugin.recordvideo.plugin.parent.ImproveShieldCameraKitPluginLayout");
        } else if (i17 == 3) {
            provider.a(0, "com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout");
        } else if (i17 == 4) {
            provider.a(0, "com.tencent.mm.plugin.recordvideo.plugin.professional.ProfessionalCameraKitPluginLayout");
            provider.M.putInt("key_camera_light_type", 1);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealRecordEntrance", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
    }

    public final boolean b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableUseMusicPickerV2", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        boolean z17 = false;
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_EDIT_VIDEO_EDIT_MUSIC_V2_INT_SYNC, 0);
        if (r17 != 1) {
            if (r17 != 2) {
                z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_musicdrawer_v2, true);
            } else {
                z17 = true;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorVideoCompositionConfig", "enableUseMusicPickerV2 " + z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableUseMusicPickerV2", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        return z17;
    }

    public final boolean c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAlbumVideoCompositionSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        int g17 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Media_SnsAlbumUseVideoComposition_Int, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorVideoCompositionConfig", "getSnsAlbumVideoCompositionSwitch: true, repairConfig: " + g17);
        if (g17 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAlbumVideoCompositionSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            return true;
        }
        boolean z17 = g17 == 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAlbumVideoCompositionSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        return z17;
    }

    public final void d(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider provider) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsRecordVideoCompositionProvider", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        kotlin.jvm.internal.o.g(provider, "provider");
        int i17 = i();
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorVideoCompositionConfig", "getSnsRecordVideoCompositionProvider >> " + i17);
        fu3.e eVar = fu3.e.f266880a;
        if (i17 > 0) {
            a(provider, i17);
            provider.M.putInt("key_camera_instance", f());
            provider.M.putBoolean("key_record_keep_ratio", true);
            provider.M.putInt("key_maas_template_scene", 7);
            provider.a(2, "com.tencent.mm.plugin.vlog.ui.video.improve.ImproveEditorVideoCompositionPluginLayout");
            if (eVar.a()) {
                provider.a(1, "com.tencent.mm.plugin.recordvideo.plugin.improve_photo.ImproveRecordEditPhotoPluginLayout");
            } else {
                provider.a(1, "com.tencent.mm.plugin.recordvideo.plugin.parent.RecordEditPhotoPluginLayout");
            }
        } else {
            if (t94.a.f416583a.a()) {
                provider.a(0, com.tencent.mm.plugin.sns.ui.record.SnsFixedResolutionCameraKitPluginLayout.class.getName());
                na4.g gVar = na4.g.f335989a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateCurrentResolutionRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calculateResolutionRadioConfig$default", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
                na4.a a17 = gVar.a(-1);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calculateResolutionRadioConfig$default", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
                na4.g.f335990b = a17;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateCurrentResolutionRadioConfig", "com.tencent.mm.plugin.sns.model.resolutionratio.SnsResolutionRadioConfigManager");
            }
            if (e()) {
                provider.a(2, "com.tencent.mm.plugin.vlog.ui.video.EditorVideoCompositionPluginLayout");
            }
            if (eVar.a()) {
                provider.a(1, "com.tencent.mm.plugin.recordvideo.plugin.improve_photo.ImproveBaseEditPhotoLayout");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsRecordVideoCompositionProvider", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
    }

    public final boolean e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsRecordVideoCompositionSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        int g17 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Media_SnsRecordUseVideoComposition_Int, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorVideoCompositionConfig", "SnsRecordVideoCompositionSwitch: true, repairConfig: " + g17);
        if (g17 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsRecordVideoCompositionSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            return true;
        }
        boolean z17 = g17 == 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsRecordVideoCompositionSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        return z17;
    }

    public final int f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("improveUseCameraKitInstance", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        java.lang.Object b17 = bm5.o1.f22719a.b(bm5.h0.RepairerConfig_Camera_CameraKitImproveInstance_Int, 0);
        kotlin.jvm.internal.o.e(b17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) b17).intValue();
        if (intValue == 0) {
            intValue = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_camera_improve_camera_instance, 3);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("improveUseCameraKitInstance", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        return intValue;
    }

    public final boolean g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSnsAlbumBackgroundRemux", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        boolean c17 = c();
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorVideoCompositionConfig", "isSnsAlbumBackgroundRemux >> videoCompositionSwitch " + c17);
        if (!c17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSnsAlbumBackgroundRemux", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAlbumVideoRemuxBackgroundSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_album_video_remux_background_v2, true);
        int g17 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Media_SnsAlbumBackgroundRemux_Int, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorVideoCompositionConfig", "getSnsAlbumVideoRemuxBackgroundSwitch: " + fj6 + ", repairConfig: " + g17);
        if (g17 != 0) {
            boolean z17 = g17 == 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAlbumVideoRemuxBackgroundSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            fj6 = z17;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAlbumVideoRemuxBackgroundSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorVideoCompositionConfig", "isSnsAlbumBackgroundRemux >> backGroundSwitch " + fj6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSnsAlbumBackgroundRemux", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        return fj6;
    }

    public final boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSnsRecordBackgroundRemux", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        boolean e17 = e();
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorVideoCompositionConfig", "isSnsRecordBackgroundRemux >> videoCompositionSwitch " + e17);
        if (!e17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSnsRecordBackgroundRemux", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsRecordVideoRemuxBackgroundSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_record_video_remux_background_v2, true);
        int g17 = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_Media_SnsRecordBackgroundRemux_Int, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorVideoCompositionConfig", "getSnsAlbumVideoRemuxBackgroundSwitch: " + fj6 + ", repairConfig: " + g17);
        if (g17 != 0) {
            boolean z17 = g17 == 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsRecordVideoRemuxBackgroundSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            fj6 = z17;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsRecordVideoRemuxBackgroundSwitch", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorVideoCompositionConfig", "isSnsRecordBackgroundRemux >> backGroundSwitch " + fj6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSnsRecordBackgroundRemux", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        return fj6;
    }

    public final int i() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("useProfessionalRecord", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        java.lang.Object b17 = bm5.o1.f22719a.b(bm5.h0.RepairerConfig_Camera_CameraKitIsUseImproveILayout_Int, 0);
        kotlin.jvm.internal.o.e(b17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) b17).intValue();
        int i17 = 2;
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2 || intValue == 3 || intValue == 4) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useProfessionalRecord", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
                return intValue;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useProfessionalRecord", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            return 0;
        }
        if (com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useProfessionalRecord", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
            return 0;
        }
        java.util.List list = com.tencent.mm.plugin.sns.statistics.g.f164852b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkModelIsInBlackList", "com.tencent.mm.plugin.sns.statistics.ImproveCameraDeviceUtil");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (!com.tencent.mm.plugin.sns.statistics.g.f164853c || currentTimeMillis - com.tencent.mm.plugin.sns.statistics.g.f164851a >= 3600000) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeBlackModelsWithConfig", "com.tencent.mm.plugin.sns.statistics.ImproveCameraDeviceUtil");
            java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_camerakit_black_model, "", true);
            kotlin.jvm.internal.o.f(Zi, "getExpt(...)");
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveCameraDeviceUtil", "changeBlackModelsWithConfig ".concat(Zi));
            if (Zi.length() > 0) {
                com.tencent.mm.plugin.sns.statistics.g.f164852b = r26.n0.f0(Zi, new java.lang.String[]{";"}, false, 0, 6, null);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeBlackModelsWithConfig", "com.tencent.mm.plugin.sns.statistics.ImproveCameraDeviceUtil");
            java.lang.String str = android.os.Build.MANUFACTURER;
            java.util.Iterator it = com.tencent.mm.plugin.sns.statistics.g.f164852b.iterator();
            while (it.hasNext()) {
                if (r26.i0.p((java.lang.String) it.next(), str, true)) {
                    com.tencent.mm.plugin.sns.statistics.g.f164854d = true;
                }
            }
            com.tencent.mm.plugin.sns.statistics.g.f164853c = true;
            com.tencent.mm.plugin.sns.statistics.g.f164851a = currentTimeMillis;
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveCameraDeviceUtil", "checkModelIsInBlackList >> " + str + ' ' + com.tencent.mm.plugin.sns.statistics.g.f164854d);
            z17 = com.tencent.mm.plugin.sns.statistics.g.f164854d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkModelIsInBlackList", "com.tencent.mm.plugin.sns.statistics.ImproveCameraDeviceUtil");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveCameraDeviceUtil", "checkModelIsInBlackList >> isCheck " + com.tencent.mm.plugin.sns.statistics.g.f164854d);
            z17 = com.tencent.mm.plugin.sns.statistics.g.f164854d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkModelIsInBlackList", "com.tencent.mm.plugin.sns.statistics.ImproveCameraDeviceUtil");
        }
        if (!z17 && nr0.a.f339064a.a()) {
            i17 = 1;
        }
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_camerakit_use_professional, false);
        int i18 = fj6 ? z17 ? 4 : 3 : i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.EditorVideoCompositionConfig", "useProfessionalRecord >> " + z17 + ' ' + i17 + ' ' + fj6 + ' ' + i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("useProfessionalRecord", "com.tencent.mm.plugin.sns.statistics.EditorVideoCompositionConfig");
        return i18;
    }
}
