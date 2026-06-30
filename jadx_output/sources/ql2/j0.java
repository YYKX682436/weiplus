package ql2;

/* loaded from: classes10.dex */
public final class j0 implements bi4.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f364525d = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: e, reason: collision with root package name */
    public boolean f364526e;

    @Override // bi4.r0
    public al5.a0 A1(java.lang.String str, android.widget.FrameLayout container, pj4.j0 j0Var, pj4.t pullDownParam) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(pullDownParam, "pullDownParam");
        if (pullDownParam.f355289e == 0) {
            return null;
        }
        java.util.Map liveEndCache = this.f364525d;
        kotlin.jvm.internal.o.f(liveEndCache, "liveEndCache");
        return new ql2.d0(str, container, j0Var, pullDownParam, liveEndCache);
    }

    @Override // bi4.r0
    public void release() {
    }

    @Override // bi4.r0
    public bi4.o0 w7(java.lang.String str) {
        this.f364526e = true;
        return new ql2.i0(str, this);
    }
}
