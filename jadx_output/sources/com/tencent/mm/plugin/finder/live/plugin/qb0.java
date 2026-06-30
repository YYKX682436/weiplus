package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class qb0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f113985d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.dc0 f113986e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb0(com.tencent.mm.plugin.finder.live.plugin.dc0 dc0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f113986e = dc0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.qb0(this.f113986e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.qb0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f113985d;
        com.tencent.mm.plugin.finder.live.plugin.dc0 dc0Var = this.f113986e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long j17 = dc0Var.f112261n;
            this.f113985d = 1;
            if (kotlinx.coroutines.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i(dc0Var.f112258h, "[launchDismissJob] after " + dc0Var.f112261n);
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null) {
            qo0.b bVar = qo0.b.O2;
            android.os.Bundle bundle = new android.os.Bundle();
            r45.f52 f52Var = new r45.f52();
            f52Var.set(0, 19);
            bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.toByteArray());
            k0Var.statusChange(bVar, bundle);
        }
        return jz5.f0.f302826a;
    }
}
