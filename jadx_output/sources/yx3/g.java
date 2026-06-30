package yx3;

/* loaded from: classes15.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f467904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx3.j f467905e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z17, yx3.j jVar) {
        super(0);
        this.f467904d = z17;
        this.f467905e = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f467904d;
        yx3.j jVar = this.f467905e;
        if (z17) {
            m8.i0 i0Var = jVar.f467911f;
            jVar.f467910e = i0Var != null ? i0Var.f324571l : 1.0f;
            if (i0Var != null) {
                i0Var.m(0.0f);
            }
        } else {
            m8.i0 i0Var2 = jVar.f467911f;
            if (i0Var2 != null) {
                i0Var2.m(jVar.f467910e);
            }
        }
        return jz5.f0.f302826a;
    }
}
