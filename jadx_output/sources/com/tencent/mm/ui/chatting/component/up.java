package com.tencent.mm.ui.chatting.component;

/* loaded from: classes8.dex */
public final class up extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f200096d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f200097e;

    /* renamed from: f, reason: collision with root package name */
    public int f200098f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f200099g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.wp f200100h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public up(com.tencent.mm.ui.chatting.component.wp wpVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f200100h = wpVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.ui.chatting.component.up upVar = new com.tencent.mm.ui.chatting.component.up(this.f200100h, continuation);
        upVar.f200099g = obj;
        return upVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.component.up) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.component.wp wpVar;
        kotlinx.coroutines.sync.d dVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f200098f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f200099g;
            com.tencent.mm.ui.chatting.component.wp wpVar2 = this.f200100h;
            kotlinx.coroutines.sync.d dVar2 = wpVar2.f200188a;
            this.f200099g = y0Var;
            this.f200096d = dVar2;
            this.f200097e = wpVar2;
            this.f200098f = 1;
            kotlinx.coroutines.sync.k kVar = (kotlinx.coroutines.sync.k) dVar2;
            if (kVar.b(null, this) == aVar) {
                return aVar;
            }
            wpVar = wpVar2;
            dVar = kVar;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wpVar = (com.tencent.mm.ui.chatting.component.wp) this.f200097e;
            dVar = (kotlinx.coroutines.sync.d) this.f200096d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        try {
            try {
                xj.m mVar = wpVar.f200189b;
                if (mVar == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.YuanBaoCopyAdReportHelper", "onAdExposeEnd: no ad info");
                } else {
                    ((wj.j0) wpVar.a()).mj(mVar.f454753a, wj.w0.f446542e, null);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.YuanBaoCopyAdReportHelper", "onAdExposeEnd: exception", e17);
            }
            ((kotlinx.coroutines.sync.k) dVar).d(null);
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            ((kotlinx.coroutines.sync.k) dVar).d(null);
            throw th6;
        }
    }
}
