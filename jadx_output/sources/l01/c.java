package l01;

/* loaded from: classes7.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f314746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l01.u f314747e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l01.c0 f314748f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l01.b f314749g;

    public c(l01.b bVar, java.lang.String str, l01.u uVar, java.lang.String str2, l01.c0 c0Var) {
        this.f314749g = bVar;
        this.f314746d = str;
        this.f314747e = uVar;
        this.f314748f = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        l01.b bVar = this.f314749g;
        android.graphics.Bitmap a17 = ((l01.n) bVar.f314743e).a(this.f314746d);
        if (a17 == null || a17.isRecycled()) {
            a17 = null;
        }
        l01.u uVar = this.f314747e;
        if (a17 != null) {
            uVar.onBitmapLoaded(a17);
            return;
        }
        l01.c0 c0Var = this.f314748f;
        java.lang.String str = c0Var.f314757n + c0Var.e();
        ((java.util.concurrent.ConcurrentHashMap) bVar.f314739a).put(uVar, str);
        ((java.util.concurrent.ConcurrentHashMap) bVar.f314740b).put(str, uVar);
        uVar.d();
        c0Var.f314753g.f314742d.f314784a.post(new l01.y(c0Var));
    }
}
