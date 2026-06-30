package xt0;

/* loaded from: classes5.dex */
public final class d extends xt0.a {
    public final void c(android.content.Context context, double d17, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider, r45.q23 q23Var, boolean z17, xt0.h postSource, com.tencent.maas.model.time.MJTime mJTime, java.lang.String str, java.lang.String str2, java.lang.Boolean bool, com.tencent.mm.protobuf.g gVar, com.tencent.mm.protobuf.g gVar2, com.tencent.mm.protobuf.g gVar3, r45.ab4 ab4Var) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        kotlin.jvm.internal.o.g(postSource, "postSource");
        b(configProvider);
        android.os.Bundle bundle = ut3.f.f431176c.f431178b;
        bundle.putByteArray("KEY_POST_VIDEO_TEMPLATE", q23Var != null ? q23Var.toByteArray() : null);
        bundle.putDouble("KEY_POST_VIDEO_COVER_START_TIME", mJTime != null ? mJTime.toSeconds() : 0.0d);
        bundle.putBoolean("KEY_DELAY_ENTER_POST_UI", z17);
        bundle.putByteArray("KEY_POST_VIDEO_CLIP_BUNDLE_JSON", gVar != null ? gVar.g() : null);
        bundle.putByteArray("KEY_POST_VIDEO_CLIP_BUNDLE_TIMELIE", gVar2 != null ? gVar2.g() : null);
        bundle.putByteArray("KEY_POST_ASSET_INFO", gVar3 != null ? gVar3.g() : null);
        if (ab4Var != null) {
            bundle.putBoolean("KEY_IS_COMPOSING_CREATION_REEDIT", true);
            bundle.putByteArray("KEY_CREATE_TEMPLATE_INFO", ab4Var.toByteArray());
        }
        bundle.putBoolean("isLongVideoPost", postSource instanceof xt0.e);
        if (postSource instanceof xt0.g) {
            r45.h70 h70Var = ((xt0.g) postSource).f456422b;
            bundle.putByteArray("video_composition", h70Var.toByteArray());
            java.util.LinkedList tracks = h70Var.f375897d;
            kotlin.jvm.internal.o.f(tracks, "tracks");
            if (!tracks.isEmpty()) {
                kotlin.jvm.internal.o.f(tracks, "tracks");
                java.util.Iterator it = tracks.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((r45.ho6) obj).f376334e == 2) {
                            break;
                        }
                    }
                }
                r45.ho6 ho6Var = (r45.ho6) obj;
                if (ho6Var != null) {
                    bundle.putString("KEY_POST_ORIGIN_FILE_PATH", ho6Var.f376333d);
                }
            }
        }
        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo = configProvider.I;
        bundle.putInt("key_ref_enter_scene", videoCaptureReportInfo != null ? videoCaptureReportInfo.f155696m : 0);
        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo2 = configProvider.I;
        bundle.putLong("key_ref_feed_id", videoCaptureReportInfo2 != null ? videoCaptureReportInfo2.f155694h : 0L);
        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo3 = configProvider.I;
        bundle.putString("key_ref_feed_dup_flag", videoCaptureReportInfo3 != null ? videoCaptureReportInfo3.f155695i : null);
        if (!(str == null || str.length() == 0)) {
            bundle.putString("KEY_POST_MIAOJIAN_TONGKUAN_META", str);
        }
        if (!(str2 == null || str2.length() == 0)) {
            bundle.putString("KEY_POST_VIDEO_TITLE", str2);
        }
        if (bool != null) {
            bundle.putBoolean("KEY_POST_ASSETS_IS_REAL_SHOOT", bool.booleanValue());
        }
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        java.lang.String a17 = postSource.a();
        long j17 = (long) d17;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Boolean bool3 = java.lang.Boolean.FALSE;
        nu3.i iVar = nu3.i.f340218a;
        com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel = new com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel(bool2, a17, "", valueOf, bool3, iVar.l());
        iVar.n("KEY_ORIGIN_MEDIA_DURATION_MS_LONG", java.lang.Long.valueOf(j17));
        iVar.n("KEY_VIDEO_CROP_DURATION_MS_INT", java.lang.Long.valueOf(j17));
        ut3.f fVar = ut3.f.f431176c;
        fVar.a(context, captureDataManager$CaptureVideoNormalModel);
        fVar.d(true, iVar.l());
    }
}
