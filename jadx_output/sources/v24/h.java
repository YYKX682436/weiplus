package v24;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final v24.h f432923a = new v24.h();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.Boolean f432924b;

    public final boolean a() {
        java.lang.Boolean bool = f432924b;
        if (bool != null) {
            return bool.booleanValue();
        }
        p75.n0 n0Var = dm.i2.K;
        p75.d dVar = dm.i2.T;
        p75.i0 g17 = n0Var.g(kz5.b0.c(dVar.h()));
        p75.m0 x17 = dVar.x(0);
        p75.d dVar2 = dm.i2.W;
        g17.f352657d = x17.c(dVar2.m().d(dVar2.j("message_fold")));
        g17.c(1, 0);
        boolean z17 = g17.a().n(gm0.j1.u().f273153f) > 0;
        f432924b = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ConversationFlagFixer", "[checkHasWrongConv] hasWrongConv=" + z17);
        return z17;
    }
}
