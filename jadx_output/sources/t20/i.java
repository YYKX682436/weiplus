package t20;

/* loaded from: classes9.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final t20.g f414675a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.l f414676b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.l f414677c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f414678d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.p8 f414679e;

    public i(t20.g service) {
        kotlin.jvm.internal.o.g(service, "service");
        this.f414675a = service;
    }

    public void a(android.view.View view, java.lang.String identifier) {
        if (view != null) {
            if (identifier == null || identifier.length() == 0) {
                return;
            }
            t20.g gVar = this.f414675a;
            gVar.getClass();
            kotlin.jvm.internal.o.g(identifier, "identifier");
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.LinkedHashMap) gVar.f414671d).get(identifier);
            android.view.View view2 = weakReference != null ? (android.view.View) weakReference.get() : null;
            if (view2 != null && view2 != view) {
                gVar.Di(view2);
            }
            if (gVar.Ai(view) != null) {
                gVar.Di(view);
            }
            y02.n0 b17 = b();
            if (b17 != null) {
                view.setTag(com.tencent.mm.R.id.t68, b17);
                gVar.getClass();
                view.setTag(com.tencent.mm.R.id.t67, identifier);
                gVar.f414671d.put(identifier, new java.lang.ref.WeakReference(view));
                gVar.wi(view);
                com.tencent.mars.xlog.Log.i("Ecs.Oracle.EcsOracleService", "[bindSessionWithIdentifier] view:%s, identifier:%s, session:%s", view, identifier, b17);
            }
        }
    }

    public final y02.n0 b() {
        int i17 = y02.o0.f458616d;
        y02.n0 n0Var = (y02.n0) urgen.ur_E2DE.UR_2E17.UR_21C5();
        if (n0Var == null) {
            return null;
        }
        yz5.l lVar = this.f414676b;
        if (lVar != null) {
            y02.o1 o1Var = new y02.o1();
            o1Var.f458618d = lVar;
        }
        yz5.l lVar2 = this.f414677c;
        if (lVar2 != null) {
            y02.o1 o1Var2 = new y02.o1();
            o1Var2.f458618d = lVar2;
        }
        yz5.l lVar3 = this.f414678d;
        if (lVar3 != null) {
            y02.o1 o1Var3 = new y02.o1();
            o1Var3.f458618d = lVar3;
        }
        bw5.p8 p8Var = this.f414679e;
        if (p8Var != null) {
            byte[] byteArray = p8Var.toByteArray();
            long cppPointer = ((y02.o0) n0Var).getCppPointer();
            kotlin.jvm.internal.o.d(byteArray);
        }
        return n0Var;
    }
}
