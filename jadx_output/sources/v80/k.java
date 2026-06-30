package v80;

@j95.b
/* loaded from: classes10.dex */
public final class k extends i95.w implements w80.i {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f434055d = new java.util.HashMap();

    public void Ai(java.lang.String currentTalker) {
        kotlin.jvm.internal.o.g(currentTalker, "currentTalker");
    }

    public void Bi(long j17, java.lang.String roomId, cn0.a aVar) {
        kotlin.jvm.internal.o.g(roomId, "roomId");
        java.lang.Integer num = (java.lang.Integer) this.f434055d.get(java.lang.Long.valueOf(j17));
        if (num == null || num.intValue() != 1) {
            if (aVar != null) {
                aVar.a(j17, 0);
            }
        } else if (aVar != null) {
            aVar.a(j17, num.intValue());
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveLogicFeatureService", "#onAccountInitialized beauty " + ko0.l.f309870a.b());
        ((ku5.t0) ku5.t0.f312615d).g(v80.j.f434054d);
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            i95.m c17 = i95.n0.c(zy.u.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((bz.a) zy.u.p3((zy.u) c17, null, 1, null)).b().f36719e = ko0.q0.f309901d;
            ko0.c0 c0Var = ko0.c0.f309825a;
            pm0.v.K(null, ko0.v.f309908d);
            ko0.l0 l0Var = ko0.l0.f309878a;
            pm0.v.K(null, ko0.f0.f309852d);
        }
    }

    public oo0.c wi() {
        java.lang.String[] strArr = oo0.e.f347118f;
        gm0.j1.i();
        gm0.j1.b().c();
        if (oo0.e.f347119g == null) {
            oo0.e.f347119g = new oo0.e(gm0.j1.u().f273153f);
        }
        return oo0.e.f347119g;
    }
}
