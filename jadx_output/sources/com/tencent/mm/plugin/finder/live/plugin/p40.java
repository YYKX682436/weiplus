package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class p40 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f113829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.z40 f113830e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.d0 f113831f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p40(com.tencent.mm.plugin.finder.live.plugin.z40 z40Var, cm2.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f113830e = z40Var;
        this.f113831f = d0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.p40(this.f113830e, this.f113831f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.p40) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f113829d;
        com.tencent.mm.plugin.finder.live.plugin.z40 z40Var = this.f113830e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long j17 = z40Var.f115297w;
            this.f113829d = 1;
            if (kotlinx.coroutines.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        so2.j5 j5Var = ((mm2.f6) z40Var.f115282e.a(mm2.f6.class)).f329049w;
        cm2.t tVar = j5Var instanceof cm2.t ? (cm2.t) j5Var : null;
        if (tVar != null) {
            long j18 = tVar.f43385d;
            cm2.d0 d0Var = this.f113831f;
            if (j18 == d0Var.f43385d && kotlin.jvm.internal.o.b(tVar.f43396r, d0Var.f43396r)) {
                dk2.ef efVar = dk2.ef.f233372a;
                com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
                if (k0Var != null) {
                    qo0.b bVar = qo0.b.O2;
                    android.os.Bundle bundle = new android.os.Bundle();
                    r45.f52 f52Var = new r45.f52();
                    f52Var.set(0, 13);
                    f52Var.set(2, new com.tencent.mm.protobuf.g(d0Var.f43335v.toByteArray()));
                    f52Var.set(4, java.lang.Long.valueOf(d0Var.f43385d));
                    f52Var.set(13, d0Var.f43396r);
                    bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", f52Var.toByteArray());
                    k0Var.statusChange(bVar, bundle);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
