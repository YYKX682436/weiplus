package ha3;

/* loaded from: classes15.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ha3.v f279932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f279933e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ha3.v vVar, double d17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f279932d = vVar;
        this.f279933e = d17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ha3.s(this.f279932d, this.f279933e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ha3.s sVar = (ha3.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        sVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ha3.v vVar = this.f279932d;
        com.tencent.thumbplayer.api.ITPPlayer iTPPlayer = vVar.f279940b;
        if (iTPPlayer != null) {
            iTPPlayer.setPlaySpeedRatio((float) this.f279933e);
        }
        vVar.getClass();
        return jz5.f0.f302826a;
    }
}
