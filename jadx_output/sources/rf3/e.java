package rf3;

/* loaded from: classes12.dex */
public final class e implements sf3.d {

    /* renamed from: a, reason: collision with root package name */
    public final sf3.c f394988a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f394989b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.coroutines.LifecycleScope f394990c;

    public e(androidx.appcompat.app.AppCompatActivity activity, sf3.c cacheManager) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(cacheManager, "cacheManager");
        this.f394988a = cacheManager;
        this.f394989b = new java.util.ArrayList();
        this.f394990c = new com.tencent.mm.sdk.coroutines.LifecycleScope("DiskImageLoaderImpl", activity, 1);
    }

    @Override // sf3.d
    public android.graphics.Bitmap a(sf3.g loadParam) {
        kotlin.jvm.internal.o.g(loadParam, "loadParam");
        loadParam.c();
        android.graphics.Bitmap a17 = this.f394988a.a(loadParam);
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
        ((java.util.ArrayList) this.f394989b).add(v65.i.b(this.f394990c, null, new rf3.d(this, loadParam, callback, null), 1, null));
    }

    @Override // sf3.d
    public void recycle() {
        java.util.Iterator it = this.f394989b.iterator();
        while (it.hasNext()) {
            kotlinx.coroutines.p2.a((kotlinx.coroutines.r2) it.next(), null, 1, null);
        }
    }
}
