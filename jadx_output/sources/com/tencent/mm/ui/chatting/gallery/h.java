package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes12.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f200969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200970e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.storage.f9 f9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f200970e = f9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.gallery.h(this.f200970e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.gallery.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f200969d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            xf0.n nVar = xf0.s.f454216f;
            xf0.i U6 = nVar.a().U6(this.f200970e, xf0.f.f454163d, true);
            if (U6 != null) {
                U6.f454184l.put("downloadFrom", "downloadWhenOriginFileReady");
            } else {
                U6 = null;
            }
            if (U6 != null) {
                if (!(j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigVideoPathRenameEnable()) == 1)) {
                    U6.f454181i = false;
                }
                xf0.s a17 = nVar.a();
                this.f200969d = 1;
                if (a17.T6(U6, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
