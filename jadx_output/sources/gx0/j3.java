package gx0;

/* loaded from: classes5.dex */
public final class j3 implements fy0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gx0.y3 f276567a;

    public j3(gx0.y3 y3Var) {
        this.f276567a = y3Var;
    }

    @Override // fy0.b
    public void a(double d17, fy0.q source) {
        kotlin.jvm.internal.o.g(source, "source");
        gx0.y3 y3Var = this.f276567a;
        ex0.a0 A7 = y3Var.A7();
        if (A7 == null) {
            return;
        }
        int ordinal = source.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            kotlinx.coroutines.l.d(y3Var.getMainScope(), null, null, new gx0.h3(this.f276567a, d17, A7, null), 3, null);
        } else {
            if (ordinal != 3) {
                return;
            }
            kotlinx.coroutines.l.d(y3Var.getMainScope(), null, null, new gx0.i3(d17, A7, this.f276567a, null), 3, null);
        }
    }
}
