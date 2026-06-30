package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes15.dex */
public final class m1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f118995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f118996e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.t1 f118997f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(boolean z17, com.tencent.mm.plugin.finder.live.widget.t1 t1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f118996e = z17;
        this.f118997f = t1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.m1(this.f118996e, this.f118997f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.m1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f118995d;
        boolean z17 = this.f118996e;
        com.tencent.mm.plugin.finder.live.widget.t1 t1Var = this.f118997f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            if (z17) {
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
                com.tencent.mm.plugin.finder.live.widget.k1 k1Var = new com.tencent.mm.plugin.finder.live.widget.k1(t1Var, null);
                this.f118995d = 1;
                if (kotlinx.coroutines.l.g(g3Var, k1Var, this) == aVar) {
                    return aVar;
                }
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
        boolean d17 = com.tencent.mm.plugin.finder.assist.n3.f102399a.d();
        com.tencent.mars.xlog.Log.i(t1Var.i0(), "get lbs success");
        if (d17) {
            ey2.k0 k0Var = (ey2.k0) ((ya2.o1) pf5.u.f353936a.e(zy2.b6.class).c(ya2.o1.class));
            com.tencent.mm.plugin.finder.live.widget.t1.e0(t1Var, ((java.lang.Number) k0Var.P6().f302833d).floatValue(), ((java.lang.Number) k0Var.P6().f302834e).floatValue(), z17);
        } else {
            com.tencent.mm.plugin.finder.live.widget.t1.g0(t1Var);
            if (z17) {
                kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.g3 g3Var2 = kotlinx.coroutines.internal.b0.f310484a;
                com.tencent.mm.plugin.finder.live.widget.l1 l1Var = new com.tencent.mm.plugin.finder.live.widget.l1(t1Var, null);
                this.f118995d = 2;
                if (kotlinx.coroutines.l.g(g3Var2, l1Var, this) == aVar) {
                    return aVar;
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
