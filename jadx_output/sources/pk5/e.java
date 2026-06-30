package pk5;

/* loaded from: classes14.dex */
public final class e implements androidx.lifecycle.y {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.o f356548d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f356549e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.b0 f356550f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f356551g;

    public e(androidx.lifecycle.o fragmentLifeCycle) {
        kotlin.jvm.internal.o.g(fragmentLifeCycle, "fragmentLifeCycle");
        this.f356548d = fragmentLifeCycle;
        this.f356549e = true;
        this.f356550f = new androidx.lifecycle.b0(this, true);
        this.f356551g = jz5.h.b(new pk5.b(this));
        fragmentLifeCycle.a(new androidx.lifecycle.f() { // from class: com.tencent.mm.ui.vas.fragment.VASFragmentLifeCycle$lifecycleObserver$1
            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public void onCreate(androidx.lifecycle.y owner) {
                kotlin.jvm.internal.o.g(owner, "owner");
                pk5.e.this.f356550f.f(androidx.lifecycle.m.ON_CREATE);
            }

            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public void onDestroy(androidx.lifecycle.y owner) {
                kotlin.jvm.internal.o.g(owner, "owner");
                pk5.e eVar = pk5.e.this;
                eVar.f356550f.f(androidx.lifecycle.m.ON_DESTROY);
                eVar.f356548d.c(this);
            }

            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public void onPause(androidx.lifecycle.y owner) {
                kotlin.jvm.internal.o.g(owner, "owner");
                pk5.e.this.f356550f.f(androidx.lifecycle.m.ON_PAUSE);
            }

            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public void onResume(androidx.lifecycle.y owner) {
                kotlin.jvm.internal.o.g(owner, "owner");
                pk5.e.this.f356550f.f(androidx.lifecycle.m.ON_RESUME);
            }

            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public void onStart(androidx.lifecycle.y owner) {
                kotlin.jvm.internal.o.g(owner, "owner");
                pk5.e eVar = pk5.e.this;
                eVar.f356550f.f(androidx.lifecycle.m.ON_START);
                if (eVar.f356549e) {
                    ((jz5.n) eVar.f356551g).getValue();
                }
            }

            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public void onStop(androidx.lifecycle.y owner) {
                kotlin.jvm.internal.o.g(owner, "owner");
                pk5.e.this.f356550f.f(androidx.lifecycle.m.ON_STOP);
            }
        });
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.f356550f;
    }
}
