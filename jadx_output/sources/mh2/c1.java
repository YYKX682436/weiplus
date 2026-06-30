package mh2;

/* loaded from: classes10.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f326307d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f326308e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mh2.f1 f326309f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f326310g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(long j17, mh2.f1 f1Var, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f326308e = j17;
        this.f326309f = f1Var;
        this.f326310g = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mh2.c1(this.f326308e, this.f326309f, this.f326310g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mh2.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f326307d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f326307d = 1;
            if (kotlinx.coroutines.k1.b(this.f326308e, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        mh2.f1 f1Var = this.f326309f;
        f1Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("realStartPlay startTime: ");
        int i18 = this.f326310g;
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i(f1Var.f326330e, sb6.toString());
        com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView ktvRenderLayoutView = (com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView) f1Var.f326331f;
        ktvRenderLayoutView.f111679n = i18;
        ktvRenderLayoutView.f111678m = java.lang.System.currentTimeMillis();
        if (ktvRenderLayoutView.f111677i) {
            ph2.e eVar = ktvRenderLayoutView.f111674f;
            if (eVar == null) {
                kotlin.jvm.internal.o.o("drawerLooper");
                throw null;
            }
            eVar.c();
        }
        ktvRenderLayoutView.f111677i = false;
        return jz5.f0.f302826a;
    }
}
