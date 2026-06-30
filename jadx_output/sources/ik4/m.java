package ik4;

/* loaded from: classes4.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ik4.p f291945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.thumbplayer.api.ITPPlayer f291946e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ik4.p pVar, com.tencent.thumbplayer.api.ITPPlayer iTPPlayer, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f291945d = pVar;
        this.f291946e = iTPPlayer;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ik4.m(this.f291945d, this.f291946e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ik4.m mVar = (ik4.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        mVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ik4.p pVar = this.f291945d;
        pVar.f("onPrepared and trigger start2");
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f291946e;
        if (iTPPlayer != null) {
            iTPPlayer.start();
        }
        if (iTPPlayer != null) {
            iTPPlayer.switchHdrModeWithSurface(pVar.f291958f, pVar.f291961i);
        }
        pVar.f("onPrepared and trigger start3");
        return jz5.f0.f302826a;
    }
}
