package ha3;

/* loaded from: classes15.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.v f279936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f279937e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ha3.v vVar, double d17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f279936d = vVar;
        this.f279937e = d17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ha3.u(this.f279936d, this.f279937e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ha3.u uVar = (ha3.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        uVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = this.f279936d.f279940b;
        if (iTPPlayer != null) {
            iTPPlayer.setAudioGainRatio((float) this.f279937e);
        }
        return jz5.f0.f302826a;
    }
}
