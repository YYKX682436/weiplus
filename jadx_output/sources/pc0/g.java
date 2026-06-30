package pc0;

@j95.b
/* loaded from: classes4.dex */
public final class g extends i95.w implements ci0.r {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f353257d = jz5.h.b(pc0.f.f353250d);

    /* renamed from: e, reason: collision with root package name */
    public final pc0.e f353258e = new pc0.e(this);

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordVideo.CameraEditorReportFeatureService", "onAccountInitialized");
        ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).Zi(this.f353258e);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        jz5.g gVar = this.f353257d;
        long q17 = ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue()).q("setting_image_video_status_last_report_time_ms", 0L);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordVideo.CameraEditorReportFeatureService", "reportImageVideoSaveSettingStatusIfNeed lastReportTimeMs:" + q17 + " currentTimeMs:" + currentTimeMillis);
        if (q17 > 0 && currentTimeMillis - q17 <= 43200000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordVideo.CameraEditorReportFeatureService", "reportImageVideoSaveSettingStatusIfNeed skip, lastReportTimeMs:" + q17);
            return;
        }
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, true);
        boolean o18 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, true);
        int i17 = ((u24.h) ((ct.c3) i95.n0.c(ct.c3.class))).wi() ? 2 : 1;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("setting_image_video_status_polling", kz5.c1.k(new jz5.l("setting_general_image_status", java.lang.Integer.valueOf(o17 ? 1 : 0)), new jz5.l("setting_general_video_status", java.lang.Integer.valueOf(o18 ? 1 : 0)), new jz5.l("ui_version", java.lang.Integer.valueOf(i17))), 33328);
        ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue()).B("setting_image_video_status_last_report_time_ms", currentTimeMillis);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordVideo.CameraEditorReportFeatureService", "reportImageVideoSaveSettingStatus storedReportTimeMs:" + currentTimeMillis + " imageStatus:" + (o17 ? 1 : 0) + " videoStatus:" + (o18 ? 1 : 0) + " uiVersion:" + i17);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountReleased(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordVideo.CameraEditorReportFeatureService", "onAccountReleased");
        ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).mj(this.f353258e);
    }

    public void wi(java.lang.String videoPath, long j17, java.lang.String toUserName, int i17, int i18) {
        kotlin.jvm.internal.o.g(videoPath, "videoPath");
        kotlin.jvm.internal.o.g(toUserName, "toUserName");
        nu3.e eVar = nu3.e.f340198a;
        com.tencent.mm.storage.z3.R4(toUserName);
        eVar.e(toUserName);
        com.tencent.mm.autogen.mmdata.rpt.CameraEditorSessionActionStruct d17 = eVar.d(2, j17, toUserName, i17);
        d17.f55536i = i18 > 0 ? 1 : 0;
        if (d17.f55534g == 3) {
            nu3.e.f340202e = eVar.c(videoPath);
        }
        nu3.b bVar = nu3.e.f340202e;
        if (bVar != null) {
            d17.f55544q = d17.b("OriginalContentInformation", bVar.g(), true);
        }
        nu3.b bVar2 = nu3.e.f340203f;
        if (bVar2 != null) {
            d17.p(bVar2.g());
        }
        d17.f55546s = d17.b("SendContentInformation", eVar.c(videoPath).g(), true);
        d17.k();
        eVar.a();
    }
}
