package ha3;

/* loaded from: classes15.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.v f279908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f279909e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ha3.v vVar, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f279908d = vVar;
        this.f279909e = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ha3.o(this.f279908d, this.f279909e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ha3.o oVar = (ha3.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        oVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ha3.v vVar = this.f279908d;
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = vVar.f279940b;
        if (iTPPlayer != null) {
            iTPPlayer.resumeDownload();
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer2 = vVar.f279940b;
        if (iTPPlayer2 != null) {
            iTPPlayer2.seekTo(this.f279909e, 3);
        }
        return jz5.f0.f302826a;
    }
}
