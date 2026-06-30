package ib2;

/* loaded from: classes2.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ib2.i0 f290098d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ib2.i0 i0Var) {
        super(0);
        this.f290098d = i0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ib2.i0 i0Var = this.f290098d;
        ib2.l0 l0Var = i0Var.f290121c;
        if (l0Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        l0Var.f();
        i0Var.c();
        return jz5.f0.f302826a;
    }
}
