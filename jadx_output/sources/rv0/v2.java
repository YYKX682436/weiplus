package rv0;

/* loaded from: classes5.dex */
public final class v2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f400288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.j7 f400289e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400290f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.r f400291g;

    public v2(ex0.a0 a0Var, rv0.j7 j7Var, rv0.n1 n1Var, ex0.r rVar) {
        this.f400288d = a0Var;
        this.f400289e = j7Var;
        this.f400290f = n1Var;
        this.f400291g = rVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f400288d.b(1.0d);
        this.f400289e.setSpeed(1.0d);
        rv0.n1 n1Var = this.f400290f;
        kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new rv0.u2(n1Var, this.f400291g, null), 3, null);
    }
}
