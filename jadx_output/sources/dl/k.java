package dl;

/* loaded from: classes10.dex */
public class k implements bn5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dl.t f235108a;

    public k(dl.t tVar) {
        this.f235108a = tVar;
    }

    @Override // bn5.e
    public void b() {
        dl.t tVar = this.f235108a;
        if (tVar.d() == null) {
            return;
        }
        if (((um.d) tVar.d()).f428674f.isIdentity()) {
            um.d dVar = (um.d) tVar.d();
            dVar.f428674f.set(tVar.h());
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        l45.n nVar = (l45.n) tVar.f235039a;
        android.graphics.Bitmap bitmap = nVar.f316465f;
        if (bitmap == null) {
            rect.set(0, 0, nVar.f316460a.getBaseBoardView().getBoardRect().width(), ((l45.n) tVar.f235039a).f316460a.getBaseBoardView().getBoardRect().height());
        } else {
            rect.set(0, 0, bitmap.getWidth(), ((l45.n) tVar.f235039a).f316465f.getHeight());
        }
        ((l45.n) tVar.f235039a).f316460a.getBaseBoardView().k(rect);
        dl.t.G(tVar, 200L, true, false);
        dl.t.H(tVar);
        tVar.s();
    }

    @Override // bn5.e
    public void onStart() {
        dl.t tVar = this.f235108a;
        tVar.E = false;
        tVar.P = false;
    }
}
