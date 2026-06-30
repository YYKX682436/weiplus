package kj2;

/* loaded from: classes10.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f308386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kj2.c0 f308387e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(boolean z17, kj2.c0 c0Var) {
        super(0);
        this.f308386d = z17;
        this.f308387e = c0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f308386d;
        kj2.c0 c0Var = this.f308387e;
        if (z17) {
            ((kj2.a0) c0Var.L).a();
        } else {
            ((kj2.a0) c0Var.L).b();
        }
        return jz5.f0.f302826a;
    }
}
