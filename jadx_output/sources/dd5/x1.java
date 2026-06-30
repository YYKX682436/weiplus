package dd5;

/* loaded from: classes9.dex */
public final class x1 extends dd5.u1 {

    /* renamed from: p, reason: collision with root package name */
    public static final dd5.x1 f229334p = new dd5.x1();

    public x1() {
        super(dd5.z1.f229357b.f426539a);
    }

    @Override // uc5.n
    public void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        em.a2 binding = (em.a2) obj;
        dd5.v1 v1Var = (dd5.v1) r0Var;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(binding, "binding");
        if (v1Var == null) {
            return;
        }
        java.lang.String U1 = v1Var.f229315f.U1();
        if (!(true ^ (U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return;
        }
        v05.b bVar = new v05.b();
        bVar.fromXml(U1);
        z05.c cVar = (z05.c) bVar.getCustom(bVar.f432315e + 64);
        q80.d0 d0Var = new q80.d0();
        if (cVar != null) {
            d0Var.f360649a = bVar.getString(bVar.f368365d + 0);
            d0Var.f360650b = cVar.getPath();
            d0Var.f360651c = cVar.p();
            d0Var.f360654f = cVar.n();
        }
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(context, d0Var, new dd5.w1(d0Var));
    }
}
