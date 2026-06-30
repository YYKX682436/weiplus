package md3;

/* loaded from: classes.dex */
public final class n implements vz.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ md3.o f325858a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lc3.a0 f325859b;

    public n(md3.o oVar, lc3.a0 a0Var) {
        this.f325858a = oVar;
        this.f325859b = a0Var;
    }

    @Override // vz.o1
    public final void d(int i17, java.lang.String str) {
        lc3.a0 a0Var = this.f325859b;
        md3.o oVar = this.f325858a;
        if (i17 == 0) {
            oVar.s().invoke(oVar.k());
            oVar.u(a0Var, mq0.a.f330522q, "");
        } else {
            oVar.s().invoke(oVar.h(i17, str != null ? str : ""));
            mq0.a aVar = mq0.a.f330523r;
            kotlin.jvm.internal.o.d(str);
            oVar.u(a0Var, aVar, str);
        }
    }
}
