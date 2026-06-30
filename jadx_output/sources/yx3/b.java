package yx3;

/* loaded from: classes15.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx3.j f467891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f467892e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yx3.j jVar, float f17) {
        super(0);
        this.f467891d = jVar;
        this.f467892e = f17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        m8.i0 i0Var = this.f467891d.f467911f;
        if (i0Var != null) {
            i0Var.m(this.f467892e);
        }
        return jz5.f0.f302826a;
    }
}
