package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class o8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f199625d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f199626e;

    /* renamed from: f, reason: collision with root package name */
    public int f199627f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.y8 f199628g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(com.tencent.mm.ui.chatting.component.y8 y8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f199628g = y8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.component.o8(this.f199628g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.component.o8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.ui.chatting.component.y8 y8Var;
        fu.d dVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f199627f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            y8Var = this.f199628g;
            fu.d dVar2 = y8Var.M;
            if (dVar2 != null) {
                com.tencent.mm.ui.chatting.component.n8 n8Var = com.tencent.mm.ui.chatting.component.n8.f199566d;
                this.f199625d = y8Var;
                this.f199626e = dVar2;
                this.f199627f = 1;
                java.lang.Object D = dVar2.D(n8Var, this);
                if (D == aVar) {
                    return aVar;
                }
                dVar = dVar2;
                obj = D;
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dVar = (fu.d) this.f199626e;
        y8Var = (com.tencent.mm.ui.chatting.component.y8) this.f199625d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (((qi3.f0) obj).f363700a != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingVoice2TxtComponent", "prepare failed");
            y8Var.M = null;
        } else {
            oi3.e eVar = dVar.f266754o.f412188j;
            long j17 = eVar != null ? eVar.getLong(eVar.f345617d + 0) : 0L;
            y8Var.f200295p = j17;
            if (j17 > 0) {
                y8Var.s0(j17, false, true, false);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingVoice2TxtComponent", "prepare success but quickSendMsgId invalid");
                y8Var.M = null;
            }
        }
        return jz5.f0.f302826a;
    }
}
