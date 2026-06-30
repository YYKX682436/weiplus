package l45;

/* loaded from: classes10.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f316453d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l45.l f316454e;

    public k(l45.l lVar, android.graphics.Bitmap bitmap) {
        this.f316454e = lVar;
        this.f316453d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        l45.l lVar = this.f316454e;
        java.util.Iterator it = lVar.f316459h.f316463d.iterator();
        while (it.hasNext()) {
            ((dl.b) it.next()).E(true);
        }
        lVar.f316455d.a(this.f316453d, lVar.f316456e);
        lVar.f316459h.f316460a.getBaseBoardView().invalidate();
    }
}
