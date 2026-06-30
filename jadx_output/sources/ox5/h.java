package ox5;

/* loaded from: classes14.dex */
public class h implements android.view.SurfaceHolder.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox5.a f349814d;

    public h(ox5.a aVar) {
        this.f349814d = aVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        ox5.k kVar = this.f349814d.f349800i;
        if (kVar != null) {
            com.tencent.liteapp.gen.LiteAppReporter liteAppReporter = com.tencent.liteapp.ui.WxaLiteAppUI.L1;
            com.tencent.liteapp.ui.WxaLiteAppUI wxaLiteAppUI = ((com.tencent.liteapp.ui.z0) kVar).f46244a;
            wxaLiteAppUI.getClass();
            new android.os.Handler().postDelayed(new com.tencent.liteapp.ui.WxaLiteAppUI$$b(wxaLiteAppUI), 60);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        ox5.k kVar = this.f349814d.f349800i;
        if (kVar != null) {
            ((com.tencent.liteapp.ui.z0) kVar).f46244a.C1.setVisibility(0);
        }
    }
}
