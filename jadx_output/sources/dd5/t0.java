package dd5;

/* loaded from: classes9.dex */
public final class t0 extends dd5.u1 {

    /* renamed from: p, reason: collision with root package name */
    public static final dd5.t0 f229289p = new dd5.t0();

    public t0() {
        super(dd5.v0.f229306b.f426539a);
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
        s15.m mVar = (s15.m) bVar.getCustom(bVar.f432315e + 71);
        if (mVar == null) {
            return;
        }
        r45.ev2 a17 = yu.m.a(mVar);
        int integer = bVar.getInteger(bVar.f368365d + 6);
        ya2.e1 e1Var = ya2.e1.f460472a;
        if (integer == 119) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            e1Var.u(context, a17, 6);
        } else {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            e1Var.n(context, a17, 6);
        }
    }

    @Override // dd5.u1, uc5.n
    public java.lang.Object w(android.content.Context context, com.tencent.mm.storage.f9 f9Var, kotlin.coroutines.Continuation continuation) {
        java.lang.String U1 = f9Var.U1();
        if (!(true ^ (U1 == null || r26.n0.N(U1)))) {
            U1 = null;
        }
        if (U1 == null) {
            return null;
        }
        v05.b bVar = new v05.b();
        bVar.fromXml(U1);
        s15.m mVar = (s15.m) bVar.getCustom(bVar.f432315e + 71);
        if (mVar == null) {
            return null;
        }
        java.lang.String title = mVar.getTitle();
        android.content.res.Resources resources = context.getResources();
        com.tencent.mm.ui.chatting.history.groups.k.f201766f.getClass();
        java.lang.String string = resources.getString(com.tencent.mm.ui.chatting.history.groups.k.f201767g);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return new dd5.v1(title, string, mVar.getThumbUrl(), bVar.getString(bVar.f368365d + 0), false, f9Var);
    }
}
