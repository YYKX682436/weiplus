package rv0;

/* loaded from: classes5.dex */
public final class c3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f399951d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f399952e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.o7 f399953f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f399954g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f399955h;

    public c3(ex0.a0 a0Var, rv0.n1 n1Var, rv0.o7 o7Var, float f17, boolean z17) {
        this.f399951d = a0Var;
        this.f399952e = n1Var;
        this.f399953f = o7Var;
        this.f399954g = f17;
        this.f399955h = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ex0.a0 a0Var = this.f399951d;
        java.util.Iterator it = ((java.util.ArrayList) a0Var.f257097g.f257177e).iterator();
        while (true) {
            if (!it.hasNext()) {
                rv0.n1 n1Var = this.f399952e;
                rv0.a4.a(a0Var, n1Var);
                n1Var.p7().c7();
                gx0.kh q76 = n1Var.q7();
                rv0.o7 o7Var = this.f399953f;
                java.lang.String string = o7Var.getContext().getString(com.tencent.mm.R.string.m1v);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                q76.r7(string, null);
                o7Var.D = false;
                o7Var.e(true, true);
                return;
            }
            ex0.r rVar = (ex0.r) it.next();
            ex0.c cVar = rVar instanceof ex0.c ? (ex0.c) rVar : null;
            if (cVar != null) {
                cVar.E(this.f399954g);
                com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment = cVar.f257119p;
                clipSegment.getClass();
                com.tencent.maas.moviecomposing.Timeline D = clipSegment.D();
                if (D != null) {
                    com.tencent.maas.moviecomposing.segments.ClipSegment.I0(clipSegment, this.f399955h, D);
                }
            }
        }
    }
}
