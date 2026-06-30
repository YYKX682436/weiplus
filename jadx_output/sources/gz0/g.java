package gz0;

/* loaded from: classes13.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gz0.h f277660d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(gz0.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277660d = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gz0.g(this.f277660d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        gz0.g gVar = (gz0.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        gVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        gz0.h hVar = this.f277660d;
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = hVar.f277665e;
        if (iTPPlayer != null) {
            iTPPlayer.stopAsync();
            iTPPlayer.release();
        }
        hVar.f277665e = null;
        return jz5.f0.f302826a;
    }
}
