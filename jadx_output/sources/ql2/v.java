package ql2;

/* loaded from: classes10.dex */
public final class v implements bi4.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f364562d = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f364563e = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f364564f = new java.util.ArrayList();

    @Override // bi4.r0
    public al5.a0 A1(java.lang.String str, android.widget.FrameLayout container, pj4.j0 j0Var, pj4.t pullDownParam) {
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(pullDownParam, "pullDownParam");
        if (pullDownParam.f355289e == 0) {
            return null;
        }
        java.util.Map liveEndCache = this.f364562d;
        kotlin.jvm.internal.o.f(liveEndCache, "liveEndCache");
        ql2.r rVar = new ql2.r(str, container, j0Var, pullDownParam, liveEndCache);
        if (j0Var != null) {
            byte[] decode = android.util.Base64.decode(j0Var.f355142g, 0);
            pj4.e0 e0Var = new pj4.e0();
            e0Var.parseFrom(decode);
            r45.g92 g92Var = (r45.g92) this.f364563e.get(e0Var.f355030g);
            if (g92Var != null) {
                rVar.p(g92Var);
            } else {
                this.f364564f.add(new jz5.l(e0Var.f355030g, new java.lang.ref.WeakReference(rVar)));
            }
        }
        return rVar;
    }

    @Override // bi4.r0
    public void release() {
    }

    @Override // bi4.r0
    public bi4.o0 w7(java.lang.String str) {
        return new ql2.u(str, this);
    }
}
