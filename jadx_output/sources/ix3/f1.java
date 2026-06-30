package ix3;

/* loaded from: classes10.dex */
public final class f1 extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f295405d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f295406e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f295407f;

    public f1(java.lang.String dirPath, java.lang.String pickFileName) {
        kotlin.jvm.internal.o.g(dirPath, "dirPath");
        kotlin.jvm.internal.o.g(pickFileName, "pickFileName");
        this.f295405d = dirPath;
        this.f295406e = pickFileName;
        this.f295407f = new java.util.ArrayList();
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        xm3.r0 r0Var = xm3.s0.f455378a;
        return r0Var.a(scope, r0Var.b(((java.util.ArrayList) this.f295407f).size(), request, new ix3.d1(this)));
    }

    @Override // ym3.f
    public void onCreate() {
        java.util.List list = this.f295407f;
        ((java.util.ArrayList) list).clear();
        java.lang.Iterable s17 = com.tencent.mm.vfs.w6.s(this.f295405d, false);
        int i17 = 0;
        for (java.lang.Object obj : kz5.n0.F0(s17 != null ? kz5.n0.S0(s17) : kz5.p0.f313996d, ix3.e1.f295392d)) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.vfs.x1 x1Var = (com.tencent.mm.vfs.x1) obj;
            if (kotlin.jvm.internal.o.b(this.f295406e, x1Var.f213232b)) {
                ((java.util.ArrayList) list).add(new ix3.l1(x1Var, -1, true));
            } else {
                ((java.util.ArrayList) list).add(new ix3.l1(x1Var, i17, false));
            }
            i17 = i18;
        }
    }
}
