package l01;

/* loaded from: classes7.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f314795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l01.c0 f314796e;

    public z(l01.c0 c0Var, android.graphics.Bitmap bitmap) {
        this.f314796e = c0Var;
        this.f314795d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        l01.c0 c0Var = this.f314796e;
        android.graphics.Bitmap bitmap = this.f314795d;
        if (bitmap != null) {
            c0Var.getClass();
            if (!bitmap.isRecycled()) {
                c0Var.g(bitmap);
                return;
            }
        }
        l01.b bVar = c0Var.f314753g;
        l01.u uVar = (l01.u) ((java.util.concurrent.ConcurrentHashMap) bVar.f314740b).remove(c0Var.f314757n + c0Var.e());
        if (uVar != null) {
            uVar.b();
            ((java.util.concurrent.ConcurrentHashMap) bVar.f314739a).remove(uVar);
        }
    }
}
