package ha3;

/* loaded from: classes15.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.v f279928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f279929e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ha3.v vVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f279928d = vVar;
        this.f279929e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ha3.r(this.f279928d, this.f279929e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ha3.r rVar = (ha3.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        rVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ha3.v vVar = this.f279928d;
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = vVar.f279940b;
        boolean z17 = this.f279929e;
        if (iTPPlayer != null) {
            iTPPlayer.setLoopback(z17);
        }
        vVar.f279945g = z17;
        return jz5.f0.f302826a;
    }
}
