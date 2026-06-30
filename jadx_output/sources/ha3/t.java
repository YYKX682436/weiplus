package ha3;

/* loaded from: classes15.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.v f279934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f279935e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(ha3.v vVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f279934d = vVar;
        this.f279935e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ha3.t(this.f279934d, this.f279935e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ha3.t tVar = (ha3.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        tVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ha3.v vVar = this.f279934d;
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = vVar.f279940b;
        if (iTPPlayer != null) {
            iTPPlayer.setOutputMute(this.f279935e);
        }
        vVar.getClass();
        return jz5.f0.f302826a;
    }
}
