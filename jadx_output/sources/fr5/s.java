package fr5;

/* loaded from: classes15.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fr5.f0 f266020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ er5.g f266021e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(fr5.f0 f0Var, er5.g gVar) {
        super(1);
        this.f266020d = f0Var;
        this.f266021e = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.MotionEvent it = (android.view.MotionEvent) obj;
        kotlin.jvm.internal.o.g(it, "it");
        fr5.f0 f0Var = this.f266020d;
        f0Var.f265937b = false;
        f0Var.f265938c = false;
        f0Var.f265939d = null;
        f0Var.f265940e = false;
        f0Var.f265941f = null;
        f0Var.f265942g = zq5.l.f475077b;
        kotlinx.coroutines.y0 y0Var = f0Var.f265943h;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new fr5.r(this.f266021e, null), 2, null);
        return jz5.f0.f302826a;
    }
}
