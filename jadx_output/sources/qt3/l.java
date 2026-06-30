package qt3;

/* loaded from: classes8.dex */
public class l implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f366646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel f366647e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qt3.m f366648f;

    public l(qt3.m mVar, android.content.Context context, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel) {
        this.f366648f = mVar;
        this.f366646d = context;
        this.f366647e = captureDataManager$CaptureVideoNormalModel;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel = this.f366647e;
        qt3.m mVar = this.f366648f;
        android.content.Context context = this.f366646d;
        if (i17 == 0) {
            java.lang.String str = captureDataManager$CaptureVideoNormalModel.f155662f;
            mVar.f366649d = str;
            ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
            jd5.a aVar = new jd5.a();
            aVar.p(str);
            n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
            n13.r a17 = n13.r.a(1);
            a17.f334120d.f334139a = 9;
            ((dk5.b0) b0Var).Bi(context, aVar, a17);
            return;
        }
        if (i17 != 1) {
            if (i17 == 2) {
                ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(context, new qt3.j(this), new qt3.k(this));
                return;
            }
            return;
        }
        java.lang.String str2 = captureDataManager$CaptureVideoNormalModel.f155662f;
        mVar.getClass();
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        ((com.tencent.mm.pluginsdk.model.b2) ((o72.c5) i95.n0.c(o72.c5.class))).getClass();
        com.tencent.mm.pluginsdk.model.a2.g(doFavoriteEvent, 2, str2);
        doFavoriteEvent.f54090g.f6327m = 44;
        doFavoriteEvent.e();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMRecordUI", "[doFavInMM] path:%s", str2);
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, context.getResources().getString(com.tencent.mm.R.string.c9o), 1).show();
        ((android.app.Activity) context).setResult(-1);
        ((android.app.Activity) context).finish();
    }
}
