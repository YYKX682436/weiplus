package ha3;

/* loaded from: classes15.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.v f279899d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ha3.v vVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f279899d = vVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ha3.m(this.f279899d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ha3.m mVar = (ha3.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        mVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ha3.v vVar = this.f279899d;
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = vVar.f279940b;
        if (iTPPlayer != null) {
            iTPPlayer.resumeDownload();
        }
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer2 = vVar.f279940b;
        if (iTPPlayer2 != null) {
            iTPPlayer2.start();
        }
        return jz5.f0.f302826a;
    }
}
