package m50;

/* loaded from: classes5.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.f f323488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f323489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m50.x f323490f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f323491g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.ui.widget.dialog.f fVar, kotlin.jvm.internal.c0 c0Var, m50.x xVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f323488d = fVar;
        this.f323489e = c0Var;
        this.f323490f = xVar;
        this.f323491g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new m50.m(this.f323488d, this.f323489e, this.f323490f, this.f323491g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((m50.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        c01.nb nbVar;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f323488d.a();
        boolean z17 = this.f323489e.f310112d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!z17) {
            m50.x xVar = this.f323490f;
            if (!xVar.getActivity().isFinishing() && !xVar.getActivity().isDestroyed()) {
                java.lang.String p76 = xVar.p7();
                java.lang.String plainTextValue = this.f323491g;
                kotlin.jvm.internal.o.g(plainTextValue, "plainTextValue");
                if (p76 != null) {
                    java.lang.String uuid = java.util.UUID.randomUUID().toString();
                    kotlin.jvm.internal.o.f(uuid, "toString(...)");
                    kotlinx.coroutines.z a17 = kotlinx.coroutines.b0.a(null, 1, null);
                    kotlinx.coroutines.p2.a(a17, null, 1, null);
                    kotlinx.coroutines.z a18 = kotlinx.coroutines.b0.a(null, 1, null);
                    ((kotlinx.coroutines.a0) a18).U(p76);
                    nbVar = new c01.nb(uuid, a17, a18);
                } else {
                    nbVar = null;
                }
                kotlinx.coroutines.z a19 = kotlinx.coroutines.b0.a(null, 1, null);
                ((kotlinx.coroutines.a0) a19).U(plainTextValue);
                c01.ob obVar = new c01.ob(null, nbVar, a19);
                ct.j3 j3Var = (ct.j3) i95.n0.c(ct.j3.class);
                android.app.Activity uiCtx = xVar.getContext();
                java.util.List c17 = kz5.b0.c(obVar);
                m50.l lVar = new m50.l(xVar);
                qg5.z2 z2Var = (qg5.z2) j3Var;
                z2Var.getClass();
                kotlin.jvm.internal.o.g(uiCtx, "uiCtx");
                xj.m mVar = z2Var.f363277s;
                z2Var.f363277s = null;
                if (mVar == null) {
                    ((wj.j0) z2Var.Zi()).Vi(wj.t0.f446507J, 2000L, new qg5.v2(z2Var, uiCtx, c17, lVar));
                } else {
                    if (!jm0.g.class.isAssignableFrom(qg5.q4.class)) {
                        throw new java.lang.IllegalArgumentException(qg5.z2.class.getName().concat(" must extends FeatureServiceComponent"));
                    }
                    androidx.lifecycle.c1 a27 = new androidx.lifecycle.j1(z2Var.getViewModel(), new jm0.e(z2Var)).a(qg5.q4.class);
                    kotlin.jvm.internal.o.f(a27, "get(...)");
                    ((qg5.q4) ((jm0.g) a27)).X6(uiCtx, c17, mVar, lVar);
                }
            }
        }
        return f0Var;
    }
}
