package i53;

/* loaded from: classes8.dex */
public class a4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f288517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel f288518e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f288519f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i53.d4 f288520g;

    public a4(i53.d4 d4Var, android.content.Context context, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel, android.os.Bundle bundle) {
        this.f288520g = d4Var;
        this.f288517d = context;
        this.f288518e = captureDataManager$CaptureVideoNormalModel;
        this.f288519f = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.tencent.mm.plugin.game.media.GameVideoEditorProxyUI gameVideoEditorProxyUI = this.f288520g.f288561d;
        int i18 = gameVideoEditorProxyUI.f140097u;
        android.os.Bundle bundle = this.f288519f;
        bundle.putInt("game_haowan_source_scene_id", i18);
        com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel = this.f288518e;
        j53.d.e(captureDataManager$CaptureVideoNormalModel, bundle);
        if (!captureDataManager$CaptureVideoNormalModel.f155660d.booleanValue()) {
            db5.t7.makeText(gameVideoEditorProxyUI.f140084e, com.tencent.mm.R.string.fpy, 1).show();
            com.tencent.mars.xlog.Log.e("MicroMsg.Haowan.GameVideoEditorProxyUI", "video remux error");
            return;
        }
        j53.d.g(gameVideoEditorProxyUI.f140093q, captureDataManager$CaptureVideoNormalModel);
        j53.d.f(gameVideoEditorProxyUI.f140094r, captureDataManager$CaptureVideoNormalModel);
        int i19 = gameVideoEditorProxyUI.f140085f;
        android.content.Context context = this.f288517d;
        if (i19 != 2) {
            boolean booleanValue = ((java.lang.Boolean) captureDataManager$CaptureVideoNormalModel.a().b("KEY_VIDEO_IS_EDITED_BOOLEAN", java.lang.Boolean.TRUE)).booleanValue();
            if (gameVideoEditorProxyUI.f140095s && booleanValue) {
                java.lang.String str = captureDataManager$CaptureVideoNormalModel.f155661e;
                java.lang.String b17 = q75.c.b("mp4");
                com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.ActionAfterVideoEdited", "auto save video :%s", b17);
                com.tencent.mm.vfs.w6.c(str, b17);
                q75.c.f(b17, com.tencent.mm.sdk.platformtools.x2.f193071a);
            }
            java.lang.String a17 = j53.d.a(captureDataManager$CaptureVideoNormalModel);
            if (a17 == null) {
                gameVideoEditorProxyUI.finish();
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_video_info", a17);
            android.app.Activity activity = (android.app.Activity) context;
            activity.setResult(-1, intent);
            activity.finish();
            return;
        }
        r45.vh4 vh4Var = new r45.vh4();
        vh4Var.f388235e = false;
        vh4Var.f388234d = false;
        java.lang.String q17 = com.tencent.mm.vfs.w6.q(captureDataManager$CaptureVideoNormalModel.f155661e);
        java.lang.String str2 = captureDataManager$CaptureVideoNormalModel.f155661e;
        com.tencent.mm.plugin.mmsight.SightCaptureResult sightCaptureResult = new com.tencent.mm.plugin.mmsight.SightCaptureResult(true, str2, captureDataManager$CaptureVideoNormalModel.f155662f, q17, com.tencent.mm.vfs.w6.p(str2), (int) (captureDataManager$CaptureVideoNormalModel.f155663g.longValue() / 1000), vh4Var);
        if (captureDataManager$CaptureVideoNormalModel.f155664h.booleanValue()) {
            sightCaptureResult.f148807e = true;
            i17 = 0;
            sightCaptureResult.f148806d = false;
            sightCaptureResult.f148815p = captureDataManager$CaptureVideoNormalModel.f155662f;
        } else {
            i17 = 0;
        }
        int i27 = bundle.getInt("key_selected_item", i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameVideoEditorProxyUI", "hy: generated video, selected item is %d", java.lang.Integer.valueOf(i27));
        android.util.SparseArray sparseArray = gameVideoEditorProxyUI.f140089m;
        com.tencent.mm.plugin.game.api.GameShareOption gameShareOption = sparseArray == null ? null : (com.tencent.mm.plugin.game.api.GameShareOption) sparseArray.get(i27);
        android.content.Intent intent2 = new android.content.Intent();
        if (gameShareOption != null && gameShareOption.f138696f) {
            intent2.putExtra("key_ext_url", gameVideoEditorProxyUI.O6(null, j53.d.a(captureDataManager$CaptureVideoNormalModel)));
        }
        intent2.putExtra("key_req_result", sightCaptureResult);
        intent2.putExtra("key_selected_item", i27);
        android.app.Activity activity2 = (android.app.Activity) context;
        activity2.setResult(-1, intent2);
        activity2.finish();
    }
}
