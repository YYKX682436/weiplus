package zh5;

/* loaded from: classes12.dex */
public final class d0 implements sf3.d {

    /* renamed from: a, reason: collision with root package name */
    public final sf3.c f473016a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f473017b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.coroutines.LifecycleScope f473018c;

    public d0(androidx.appcompat.app.AppCompatActivity activity, sf3.c cacheManager) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(cacheManager, "cacheManager");
        this.f473016a = cacheManager;
        this.f473017b = new java.util.ArrayList();
        this.f473018c = new com.tencent.mm.sdk.coroutines.LifecycleScope("DiskImageLoaderImpl", activity, 1);
    }

    @Override // sf3.d
    public android.graphics.Bitmap a(sf3.g loadParam) {
        kotlin.jvm.internal.o.g(loadParam, "loadParam");
        loadParam.c();
        android.graphics.Bitmap a17 = this.f473016a.a(loadParam);
        if (a17 != null) {
            return a17;
        }
        return null;
    }

    @Override // sf3.d
    public void b(sf3.g loadParam, sf3.j callback) {
        kotlin.jvm.internal.o.g(loadParam, "loadParam");
        kotlin.jvm.internal.o.g(callback, "callback");
        loadParam.c();
        ((java.util.ArrayList) this.f473017b).add(v65.i.b(this.f473018c, null, new zh5.c0(this, loadParam, callback, null), 1, null));
    }

    @Override // sf3.d
    public void recycle() {
        java.util.Iterator it = this.f473017b.iterator();
        while (it.hasNext()) {
            kotlinx.coroutines.p2.a((kotlinx.coroutines.r2) it.next(), null, 1, null);
        }
    }
}
