package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class fz extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f112610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hz f112611e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz(com.tencent.mm.plugin.finder.live.plugin.hz hzVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f112611e = hzVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.fz(this.f112611e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.fz) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f112610d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f112610d = 1;
            if (kotlinx.coroutines.k1.b(2000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.finder.live.plugin.hz hzVar = this.f112611e;
        if (hzVar.w0() == 8) {
            rk2.r.b(rk2.r.f396485a, 1, null, null, 6, null);
        }
        hzVar.t1();
        com.tencent.mm.plugin.finder.live.plugin.ui uiVar = (com.tencent.mm.plugin.finder.live.plugin.ui) hzVar.X0(com.tencent.mm.plugin.finder.live.plugin.ui.class);
        if (uiVar != null) {
            uiVar.K0(8);
        }
        df2.pv pvVar = (df2.pv) hzVar.U0(df2.pv.class);
        if (pvVar != null) {
            pvVar.d7(hzVar);
        }
        return jz5.f0.f302826a;
    }
}
