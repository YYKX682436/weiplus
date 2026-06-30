package xn5;

/* loaded from: classes13.dex */
public final class m implements xn5.z {

    /* renamed from: a, reason: collision with root package name */
    public static final xn5.m f455694a = new xn5.m();

    @Override // xn5.z
    public android.view.View a(android.content.Context context, int i17, android.view.ViewGroup viewGroup, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        return null;
    }

    @Override // xn5.z
    public void b(r45.hg7 preloadData) {
        kotlin.jvm.internal.o.g(preloadData, "preloadData");
    }

    @Override // xn5.z
    public void c() {
    }

    @Override // xn5.z
    public void d(android.content.Context context, androidx.lifecycle.y lifecycleOwner, java.lang.String actName) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(actName, "actName");
        xn5.p0 p0Var = xn5.q0.f455702a;
        xn5.q0.f455709h = new xn5.l(context, lifecycleOwner, actName);
        lifecycleOwner.mo133getLifecycle().a(new androidx.lifecycle.f() { // from class: com.tencent.mm.view.x2c.DummyLayoutCachePool$preload$2
            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public void onDestroy(androidx.lifecycle.y owner) {
                kotlin.jvm.internal.o.g(owner, "owner");
                xn5.p0 p0Var2 = xn5.q0.f455702a;
                xn5.q0.f455709h = null;
            }
        });
    }
}
