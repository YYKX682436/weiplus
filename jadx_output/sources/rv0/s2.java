package rv0;

/* loaded from: classes5.dex */
public final class s2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.j7 f400231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f400232e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400233f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.r f400234g;

    public s2(rv0.j7 j7Var, ex0.a0 a0Var, rv0.n1 n1Var, ex0.r rVar) {
        this.f400231d = j7Var;
        this.f400232e = a0Var;
        this.f400233f = n1Var;
        this.f400234g = rVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        rv0.j7 j7Var = this.f400231d;
        j7Var.J();
        double currentSpeed = j7Var.getCurrentSpeed();
        ex0.a0 a0Var = this.f400232e;
        java.util.List list = a0Var.f257097g.f257177e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ex0.r rVar = (ex0.r) it.next();
            ex0.c cVar = rVar instanceof ex0.c ? (ex0.c) rVar : null;
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList2.add(java.lang.Boolean.valueOf(((ex0.c) it6.next()).F(currentSpeed)));
        }
        java.util.EnumSet of6 = java.util.EnumSet.of(cx0.d.f224510f);
        kotlin.jvm.internal.o.f(of6, "of(...)");
        a0Var.J(of6, null);
        rv0.n1 n1Var = this.f400233f;
        gx0.kh q76 = n1Var.q7();
        java.lang.String string = j7Var.getContext().getString(com.tencent.mm.R.string.m1u);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        q76.r7(string, null);
        j7Var.D = false;
        j7Var.e(true, true);
        kotlinx.coroutines.l.d(n1Var.getMainScope(), null, null, new rv0.r2(n1Var, this.f400234g, null), 3, null);
    }
}
