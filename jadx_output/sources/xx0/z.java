package xx0;

/* loaded from: classes5.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xx0.d0 f457957d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(xx0.d0 d0Var) {
        super(0);
        this.f457957d = d0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        xx0.d0 d0Var = this.f457957d;
        synchronized (d0Var) {
            d0Var.f457882m = kotlinx.coroutines.l.d(d0Var.f457876d, null, null, new xx0.y(d0Var, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
