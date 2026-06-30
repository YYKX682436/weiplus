package nt3;

/* loaded from: classes10.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nt3.a0 f339814d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(nt3.a0 a0Var) {
        super(0);
        this.f339814d = a0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nt3.a0 a0Var = this.f339814d;
        com.tencent.mars.xlog.Log.i(a0Var.f339722m, "onEncodeEnd: " + a0Var.I);
        gs0.b bVar = a0Var.f339727r;
        if (bVar != null) {
            bVar.f();
        }
        a0Var.g(true);
        return jz5.f0.f302826a;
    }
}
