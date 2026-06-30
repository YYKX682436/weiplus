package mr3;

/* loaded from: classes10.dex */
public final class n extends ym3.a {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f330883d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f330884e;

    /* renamed from: f, reason: collision with root package name */
    public mr3.l f330885f;

    /* renamed from: g, reason: collision with root package name */
    public final int f330886g;

    public n(boolean z17, java.util.List dataList) {
        kotlin.jvm.internal.o.g(dataList, "dataList");
        this.f330883d = z17;
        this.f330884e = dataList;
        this.f330886g = 9;
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        int min;
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        boolean z17 = this.f330883d;
        java.util.List list = this.f330884e;
        if (z17) {
            min = list.size();
        } else {
            min = java.lang.Math.min(this.f330886g, list.size() + 1);
        }
        xm3.r0 r0Var = xm3.s0.f455378a;
        return r0Var.a(scope, r0Var.b(min, request, new mr3.m(this)));
    }
}
