package f2;

/* loaded from: classes13.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f2.e0 f258797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f2.c0 f258798e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(f2.e0 e0Var, f2.c0 c0Var) {
        super(1);
        this.f258797d = e0Var;
        this.f258798e = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        f2.g0 finalResult = (f2.g0) obj;
        kotlin.jvm.internal.o.g(finalResult, "finalResult");
        f2.e0 e0Var = this.f258797d;
        i2.h hVar = e0Var.f258799a;
        f2.c0 c0Var = this.f258798e;
        synchronized (hVar) {
            if (finalResult.a()) {
                e0Var.f258800b.b(c0Var, finalResult);
            } else {
                e0Var.f258800b.c(c0Var);
            }
        }
        return jz5.f0.f302826a;
    }
}
