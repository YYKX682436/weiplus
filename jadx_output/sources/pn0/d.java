package pn0;

/* loaded from: classes14.dex */
public class d implements android.view.SurfaceHolder.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn0.e f356949d;

    public d(pn0.e eVar) {
        this.f356949d = eVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i17, int i18, int i19) {
        android.view.Surface surface = surfaceHolder.getSurface();
        pn0.e eVar = this.f356949d;
        eVar.f356951m = surface;
        eVar.u(i18, i19);
        eVar.f356944h = true;
        eVar.f356945i = false;
        com.tencent.mars.xlog.Log.i(eVar.f356950l, "surfaceChanged " + surfaceHolder.getSurface() + " format = " + i17 + " width = " + i18 + " height = " + i19);
        eVar.f356946j.Gg(eVar);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
        com.tencent.mars.xlog.Log.i(this.f356949d.f356950l, "surfaceCreated " + surfaceHolder.getSurface());
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
        pn0.e eVar = this.f356949d;
        com.tencent.mars.xlog.Log.i(eVar.f356950l, "surfaceDestroyed = " + surfaceHolder.getSurface());
        eVar.f356945i = true;
        eVar.f356946j.O2(eVar);
    }
}
