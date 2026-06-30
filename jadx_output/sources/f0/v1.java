package f0;

/* loaded from: classes14.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public final f0.q f258251a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.r f258252b;

    /* renamed from: c, reason: collision with root package name */
    public final int f258253c;

    /* renamed from: d, reason: collision with root package name */
    public final f0.j2 f258254d;

    public v1(f0.q itemProvider, androidx.compose.foundation.lazy.layout.r measureScope, int i17, f0.j2 measuredItemFactory) {
        kotlin.jvm.internal.o.g(itemProvider, "itemProvider");
        kotlin.jvm.internal.o.g(measureScope, "measureScope");
        kotlin.jvm.internal.o.g(measuredItemFactory, "measuredItemFactory");
        this.f258251a = itemProvider;
        this.f258252b = measureScope;
        this.f258253c = i17;
        this.f258254d = measuredItemFactory;
    }

    public final f0.u1 a(int i17, int i18, long j17) {
        int i19;
        java.lang.Object c17 = ((f0.s) this.f258251a).c(i17);
        s1.o1[] b17 = ((androidx.compose.foundation.lazy.layout.s) this.f258252b).b(i17, j17);
        if (p2.c.f(j17)) {
            i19 = p2.c.j(j17);
        } else {
            if (!p2.c.e(j17)) {
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            i19 = p2.c.i(j17);
        }
        int i27 = i19;
        f0.h0 h0Var = (f0.h0) this.f258254d;
        h0Var.getClass();
        return new f0.u1(i17, c17, h0Var.f258104d, i27, i18, h0Var.f258105e, ((androidx.compose.foundation.lazy.layout.s) h0Var.f258101a).getLayoutDirection(), h0Var.f258106f, h0Var.f258107g, b17, h0Var.f258108h, p2.n.a(h0Var.f258102b, h0Var.f258103c), null);
    }
}
