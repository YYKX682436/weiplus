package gm0;

/* loaded from: classes10.dex */
public final class b implements androidx.lifecycle.m1, androidx.lifecycle.y {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.sdk.coroutines.LifecycleScope f273145e;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.l1 f273144d = new androidx.lifecycle.l1();

    /* renamed from: f, reason: collision with root package name */
    public final gm0.a f273146f = new gm0.a(this);

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.f273146f;
    }

    @Override // androidx.lifecycle.m1
    /* renamed from: getViewModelStore */
    public androidx.lifecycle.l1 getViewModel() {
        return this.f273144d;
    }
}
