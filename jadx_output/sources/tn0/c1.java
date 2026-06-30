package tn0;

/* loaded from: classes3.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tn0.j1 f420658d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(tn0.j1 j1Var) {
        super(1);
        this.f420658d = j1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        go0.v0 it = (go0.v0) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.view.Surface surface = it.f273884k;
        tn0.j1 j1Var = this.f420658d;
        if (surface != null) {
            j1Var.f420701d = surface;
        }
        it.f273883j = new tn0.b1(it, j1Var);
        return jz5.f0.f302826a;
    }
}
