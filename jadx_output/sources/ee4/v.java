package ee4;

/* loaded from: classes4.dex */
public final class v extends ee4.t {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ce4.b pcContext) {
        super(pcContext);
        kotlin.jvm.internal.o.g(pcContext, "pcContext");
    }

    @Override // ce4.a
    public java.lang.String d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCapturePc");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCapturePc");
        return "SnsPublish.PicCapturePc";
    }

    public final void p() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doCaptureMMSight", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCapturePc");
        int f17 = 9 - m().v().f();
        if (f17 <= 0) {
            e("has select the max image count");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCaptureMMSight", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCapturePc");
            return;
        }
        com.tencent.mm.plugin.mmsight.SightParams sightParams = new com.tencent.mm.plugin.mmsight.SightParams(2, 0);
        java.lang.String k17 = ai3.d.k(t21.o2.Bi().Ai());
        java.lang.String m17 = ai3.d.m(k17);
        com.tencent.mm.plugin.sns.statistics.h hVar = com.tencent.mm.plugin.sns.statistics.h.f164856a;
        kotlin.jvm.internal.o.d(k17);
        kotlin.jvm.internal.o.d(m17);
        com.tencent.mm.modelcontrol.VideoTransPara videoParams = sightParams.f148819f;
        kotlin.jvm.internal.o.f(videoParams, "videoParams");
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider b17 = hVar.b(k17, m17, videoParams, sightParams.f148819f.f71195h * 1000, 49);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_ignore_remux_without_edit, false)) {
            b17.f155669d = 2;
        }
        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo = new com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo();
        videoCaptureReportInfo.f155690d = 7;
        b17.I = videoCaptureReportInfo;
        long c17 = c01.id.c();
        if (f17 < 9) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13822, 1, 2, ca4.z0.l(), java.lang.Long.valueOf(c17));
            b17.f155682t = java.lang.Boolean.FALSE;
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13822, 1, 2, ca4.z0.l(), java.lang.Long.valueOf(c17));
        }
        kotlinx.coroutines.l.d(o().q(), null, null, new ee4.u(this, b17, null), 3, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCaptureMMSight", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCapturePc");
    }

    public final void q(java.lang.Object o17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleMediaOptResult", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCapturePc");
        kotlin.jvm.internal.o.g(o17, "o");
        if (o17 instanceof qc0.m1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleMediaOptResult: resultCode=");
            qc0.m1 m1Var = (qc0.m1) o17;
            int i17 = m1Var.f361411b;
            sb6.append(i17);
            sb6.append(", optCode=");
            int i18 = m1Var.f361412c;
            sb6.append(i18);
            f(sb6.toString());
            if (i17 == -1 && i18 == 0) {
                qc0.l1 a17 = m1Var.a();
                com.tencent.mm.plugin.sns.model.g6 g6Var = com.tencent.mm.plugin.sns.model.g6.f164210a;
                kotlin.jvm.internal.o.d(a17);
                java.lang.String str = a17.f361396b;
                kotlin.jvm.internal.o.d(str);
                android.os.Bundle bundle = m1Var.f361414e;
                g6Var.c(str, bundle, "key_edit_safe_strategy_emotion_info_list");
                if (!a17.a()) {
                    r45.vh4 vh4Var = new r45.vh4();
                    vh4Var.f388235e = true;
                    vh4Var.f388234d = false;
                    java.lang.String str2 = a17.f361396b;
                    com.tencent.mm.plugin.mmsight.SightCaptureResult sightCaptureResult = new com.tencent.mm.plugin.mmsight.SightCaptureResult(true, str2, a17.f361397c, com.tencent.mm.vfs.w6.q(str2), by5.x.c(str2), (int) (a17.f361398d / 1000), vh4Var);
                    c().getIntent().putExtra("key_extra_data", bundle);
                    ((com.tencent.mm.plugin.sns.ui.SnsUploadUI) c()).p7(sightCaptureResult);
                } else if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_clear_sns_tmp_file, true)) {
                        dw3.c0.f244182a.w(str);
                    }
                    com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem c17 = m().v().c(str, 0, true);
                    ee4.b1 m17 = m();
                    java.util.List k17 = kz5.c0.k(c17);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addPreviewPublishPicItem$default", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
                    m17.r(k17, true, false, false);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addPreviewPublishPicItem$default", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMediaOptResult", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCapturePc");
                    return;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMediaOptResult", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCapturePc");
    }
}
