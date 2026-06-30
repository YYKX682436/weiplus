package qp2;

/* loaded from: classes2.dex */
public final class g implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f365774d;

    /* renamed from: e, reason: collision with root package name */
    public final int f365775e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f365776f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f365777g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f365778h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f365779i;

    /* renamed from: m, reason: collision with root package name */
    public qp2.z f365780m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.s f365781n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f365782o;

    public g(android.content.Context context, int i17, java.lang.String byPass, java.lang.String encrypted_object_id, java.lang.String object_nonce_id, java.lang.String title) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(byPass, "byPass");
        kotlin.jvm.internal.o.g(encrypted_object_id, "encrypted_object_id");
        kotlin.jvm.internal.o.g(object_nonce_id, "object_nonce_id");
        kotlin.jvm.internal.o.g(title, "title");
        this.f365774d = context;
        this.f365775e = i17;
        this.f365776f = byPass;
        this.f365777g = encrypted_object_id;
        this.f365778h = object_nonce_id;
        this.f365779i = title;
    }

    public final void a(r45.qt2 contextObj, boolean z17, boolean z18, yz5.s callback) {
        az2.w e17;
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kotlin.jvm.internal.o.g(callback, "callback");
        tq2.a aVar = tq2.d.f421230a;
        tq2.d.f421230a.c("startFetchTabs");
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabFetcher", "fetch forcePermission:" + z17 + " isUseCache:" + z18);
        this.f365781n = callback;
        if (z18) {
            nq2.d dVar = nq2.d.f338980a;
            pq2.h hVar = nq2.d.f338981b;
            if (hVar != null) {
                rq2.s sVar = rq2.s.f398879a;
                boolean z19 = hVar.f357585n == pq2.a.f357574h;
                com.tencent.mars.xlog.Log.i("FinderNearbyLiveLoadingReporter", "tickHasCacheFromClick isFromClick : " + rq2.s.f398882d + " hasCache: " + z19);
                if (rq2.s.f398882d) {
                    rq2.s.f398884f = z19;
                }
                int ordinal = hVar.f357585n.ordinal();
                if (ordinal == 1) {
                    hVar.f(new qp2.a(this, contextObj, z17));
                    return;
                } else if (ordinal == 5 && (e17 = hVar.e()) != null) {
                    onSceneEnd(e17.f16158b, e17.f16157a, e17.f16159c, (com.tencent.mm.modelbase.m1) e17.f16160d);
                    return;
                }
            }
        }
        b(contextObj, z17, 2);
    }

    public final void b(r45.qt2 qt2Var, boolean z17, int i17) {
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabFetcher", "fetchLiveSquareTabs, contextObj:" + qt2Var + " forcePermission:" + z17 + " invokeSource:" + i17);
        if (!z17) {
            c(qt2Var);
            return;
        }
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabFetcher", "fetchLiveSquareTabsForPermission, contextObj:" + qt2Var + " invokeSource:" + i17);
        qp2.d dVar = new qp2.d(this, qt2Var);
        qp2.e eVar = new qp2.e(this, qt2Var);
        ey2.k0 k0Var = (ey2.k0) ((ya2.o1) pf5.u.f353936a.e(zy2.b6.class).c(ya2.o1.class));
        if (!k0Var.N6()) {
            com.tencent.mars.xlog.Log.w("NearbyLiveSquareTabFetcher", "fetchLiveSquareTabsForPermission no location permission");
        } else if (c01.id.a() - k0Var.Q6() < 300000) {
            eVar.invoke();
        } else {
            dVar.invoke();
        }
    }

    public final void c(r45.qt2 qt2Var) {
        qp2.z zVar = new qp2.z(qt2Var, this.f365775e, this.f365776f, this.f365779i, this.f365777g, this.f365778h);
        this.f365780m = zVar;
        android.content.Context context = this.f365774d;
        zVar.f16155e = az2.c.a(az2.f.f16125d, context, context.getResources().getString(com.tencent.mm.R.string.f9y), 500L, null, 8, null);
        gm0.j1.d().a(4210, this);
        gm0.j1.d().g(this.f365780m);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 scene) {
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabFetcher", "onSceneEnd handle NetSceneNearbyLiveSquareTabs, errType:" + i17 + " errCode:" + i18);
        gm0.j1.d().q(4210, this);
        if ((i17 != 0 || i18 != 0) && i18 != -200008) {
            com.tencent.mars.xlog.Log.e("NearbyLiveSquareTabFetcher", "onSceneEnd handle NetSceneNearbyLiveSquareTabs error");
            return;
        }
        com.tencent.mm.modelbase.o oVar = ((qp2.z) scene).f365828h;
        kotlin.jvm.internal.o.d(oVar);
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLiveTabsResponse");
        tq2.d.f421230a.c("fetchTabsDone");
        pm0.v.X(new qp2.f((r45.h81) fVar, this));
    }
}
