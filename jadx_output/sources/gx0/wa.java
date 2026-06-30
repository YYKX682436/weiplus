package gx0;

/* loaded from: classes5.dex */
public final class wa implements fy0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f277127a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f277128b;

    public wa(gx0.ac acVar, ex0.a0 a0Var) {
        this.f277127a = acVar;
        this.f277128b = a0Var;
    }

    @Override // fy0.b
    public void a(double d17, fy0.q source) {
        kotlin.jvm.internal.o.g(source, "source");
        int ordinal = source.ordinal();
        gx0.ac acVar = this.f277127a;
        if (ordinal == 1 || ordinal == 2) {
            kotlinx.coroutines.l.d(acVar.getMainScope(), null, null, new gx0.ua(this.f277127a, d17, this.f277128b, null), 3, null);
        } else if (ordinal == 3) {
            kotlinx.coroutines.l.d(acVar.getMainScope(), null, null, new gx0.va(d17, this.f277128b, this.f277127a, null), 3, null);
        }
        cw0.d dVar = (cw0.d) acVar.f69240i;
        if (dVar != null) {
            dVar.C(d17);
        }
        acVar.i8();
    }
}
