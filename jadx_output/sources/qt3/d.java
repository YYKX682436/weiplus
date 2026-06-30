package qt3;

/* loaded from: classes4.dex */
public final class d implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt3.g f366633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f366634e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel f366635f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f366636g;

    public d(qt3.g gVar, android.content.Context context, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel, android.os.Bundle bundle) {
        this.f366633d = gVar;
        this.f366634e = context;
        this.f366635f = captureDataManager$CaptureVideoNormalModel;
        this.f366636g = bundle;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel model = this.f366635f;
        android.content.Context context = this.f366634e;
        qt3.g gVar = this.f366633d;
        if (i17 == 0) {
            gVar.getClass();
            if (model != null) {
                java.lang.String str = model.f155662f;
                if (str == null || str.length() == 0) {
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_extra_data", this.f366636g);
                intent.putExtra("KSEGMENTMEDIAINFO", model);
                intent.putExtra("Op_Replace_Source_Pic", true);
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                android.app.Activity activity = (android.app.Activity) context;
                activity.setResult(-1, intent);
                activity.finish();
                return;
            }
            return;
        }
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            gVar.getClass();
            kotlin.jvm.internal.o.g(context, "context");
            kotlin.jvm.internal.o.g(model, "model");
            ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Ni(context, new qt3.f(gVar, context, model), new qt3.e(context));
            return;
        }
        java.lang.String str2 = model.f155662f;
        if (str2 == null) {
            str2 = "";
        }
        gVar.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.MMRecordUI", "gotoSelectConversationUI: path=".concat(str2));
        gVar.f366641d = str2;
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        jd5.a aVar = new jd5.a();
        aVar.p(str2);
        n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
        n13.r rVar = new n13.r();
        rVar.f334118b = 1;
        rVar.f334120d.f334139a = 9;
        ((dk5.b0) b0Var).Bi(context, aVar, rVar);
    }
}
