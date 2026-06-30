package dl;

/* loaded from: classes10.dex */
public class l implements bn5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dl.t f235109a;

    public l(dl.t tVar) {
        this.f235109a = tVar;
    }

    @Override // bn5.e
    public void b() {
        android.graphics.Rect rect;
        dl.t tVar = this.f235109a;
        tVar.P = true;
        if (((l45.n) tVar.f235039a).f316465f == null) {
            rect = new android.graphics.Rect();
            com.tencent.mars.xlog.Log.e("MicroMsg.CropArtist", "getImageBitmap is null!");
        } else {
            rect = new android.graphics.Rect(0, 0, ((l45.n) tVar.f235039a).f316465f.getWidth(), ((l45.n) tVar.f235039a).f316465f.getHeight());
        }
        ((l45.n) tVar.f235039a).f316460a.getBaseBoardView().k(rect);
        dl.t.G(tVar, 200L, true, false);
        dl.t.H(tVar);
    }

    @Override // bn5.e
    public void onStart() {
        dl.t tVar = this.f235109a;
        tVar.E = false;
        tVar.P = false;
        tVar.D.getClass();
        xk0.c.f454927r.setAlpha((int) (282 * 0.9019608f));
    }
}
