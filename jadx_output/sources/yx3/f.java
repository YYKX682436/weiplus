package yx3;

/* loaded from: classes15.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx3.j f467903d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yx3.j jVar) {
        super(0);
        this.f467903d = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yx3.j jVar = this.f467903d;
        m8.i0 i0Var = jVar.f467911f;
        if (i0Var != null) {
            i0Var.n();
        }
        m8.i0 i0Var2 = jVar.f467911f;
        if (i0Var2 != null) {
            i0Var2.release();
        }
        return jz5.f0.f302826a;
    }
}
