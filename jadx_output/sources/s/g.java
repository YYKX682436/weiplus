package s;

/* loaded from: classes16.dex */
public final class g extends qz5.l implements yz5.p {
    public final /* synthetic */ s.i L;
    public final /* synthetic */ long M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(s.i iVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.L = iVar;
        this.M = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new s.g(this.L, this.M, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        s.g gVar = (s.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        gVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        s.i iVar = this.L;
        iVar.f401838h = true;
        kotlinx.coroutines.r2 r2Var = iVar.f401837g;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        iVar.f401837g = null;
        com.tencent.mm.open_voice_control.card.LoadingCard loadingCard = iVar.f401833c;
        if (loadingCard == null) {
            loadingCard = iVar.f401834d;
        }
        if (loadingCard == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCLoadingUI", "dismiss: not attached yet, keep ui for late attach id=" + iVar.f401836f);
        } else {
            loadingCard.dismiss();
            int i17 = iVar.f401836f;
            if (i17 > 0) {
                s.i.f401828i.a(i17);
                iVar.f401836f = 0;
            }
        }
        iVar.f401833c = null;
        iVar.f401834d = null;
        iVar.f401835e = 0L;
        com.tencent.wechat.aff.ovc.r rVar = iVar.f401832b;
        if (rVar != null) {
            rVar.b(this.M);
        }
        iVar.f401832b = null;
        return jz5.f0.f302826a;
    }
}
