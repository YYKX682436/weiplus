package df2;

/* loaded from: classes3.dex */
public final class m3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230749d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f230750e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.p3 f230751f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f230752g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(java.lang.Object obj, df2.p3 p3Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230750e = obj;
        this.f230751f = p3Var;
        this.f230752g = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.m3(this.f230750e, this.f230751f, this.f230752g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.m3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230749d;
        df2.p3 p3Var = this.f230751f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("FinderLiveRenderController", "viewScopeLaunch start panelClass: " + this.f230750e);
            this.f230749d = 1;
            p3Var.getClass();
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            v65.n nVar = new v65.n(rVar);
            com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var = (com.tencent.mm.plugin.finder.live.plugin.ob0) p3Var.R6(com.tencent.mm.plugin.finder.live.plugin.ob0.class);
            if (ob0Var != null) {
                mn0.b0 B1 = ob0Var.B1();
                com.tencent.mm.live.core.view.DebugCanvasView debugCanvasView = ((com.tencent.mm.live.core.view.LiveVideoView) ob0Var.C1()).getDebugCanvasView();
                if (B1 != null && debugCanvasView != null) {
                    nn0.c cVar = B1 instanceof nn0.c ? (nn0.c) B1 : null;
                    nn0.i iVar = cVar != null ? (nn0.i) cVar.p() : null;
                    if (!(iVar instanceof nn0.i)) {
                        iVar = null;
                    }
                    nn0.o oVar = iVar != null ? iVar.f338584b : null;
                    nn0.s sVar = oVar instanceof nn0.s ? (nn0.s) oVar : null;
                    if (sVar != null) {
                        df2.o3 o3Var = new df2.o3(java.lang.System.currentTimeMillis(), nVar, sVar, p3Var, debugCanvasView);
                        nn0.q qVar = sVar.f338612h;
                        if (qVar == null) {
                            com.tencent.mars.xlog.Log.e(sVar.f338608d, "fastQueue: gl handler is null");
                        } else {
                            qVar.removeMessages(2);
                            sVar.f338612h.post(o3Var);
                        }
                    }
                }
            }
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.graphics.RectF rectF = (android.graphics.RectF) obj;
        com.tencent.mars.xlog.Log.i("FinderLiveRenderController", "startCaptureVideoFrameRect cost: " + (java.lang.System.currentTimeMillis() - this.f230752g));
        if (rectF != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            df2.l3 l3Var = new df2.l3(rectF, p3Var, null);
            this.f230749d = 2;
            if (kotlinx.coroutines.l.g(g3Var, l3Var, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
