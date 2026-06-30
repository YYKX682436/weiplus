package qt3;

/* loaded from: classes4.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt3.g f366638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f366639e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel f366640f;

    public f(qt3.g gVar, android.content.Context context, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel) {
        this.f366638d = gVar;
        this.f366639e = context;
        this.f366640f = captureDataManager$CaptureVideoNormalModel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qt3.g gVar = this.f366638d;
        android.content.Context context = this.f366639e;
        com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel = this.f366640f;
        gVar.getClass();
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMRecordUI", "handleSaveMediaToLocalWithPermission save pic, imageState : %s", java.lang.Boolean.valueOf(o17));
        java.lang.Boolean bool = (java.lang.Boolean) captureDataManager$CaptureVideoNormalModel.a().b("KEY_PHOTO_IS_EDITED_BOOLEAN", java.lang.Boolean.TRUE);
        if (!o17 || !bool.booleanValue()) {
            ((ku5.t0) ku5.t0.f312615d).g(new qt3.b(captureDataManager$CaptureVideoNormalModel));
        }
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, context.getResources().getString(com.tencent.mm.R.string.f491160c62, q75.c.d()), 1).show();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            activity.finish();
        }
    }
}
