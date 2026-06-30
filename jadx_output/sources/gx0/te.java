package gx0;

/* loaded from: classes5.dex */
public final class te extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f276996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f276997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f276998f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f276999g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te(gx0.bf bfVar, com.tencent.maas.model.time.MJTime mJTime, long j17, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276996d = bfVar;
        this.f276997e = mJTime;
        this.f276998f = j17;
        this.f276999g = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.te(this.f276996d, this.f276997e, this.f276998f, this.f276999g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.te) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        if (!this.f276996d.m7()) {
            return java.lang.Boolean.FALSE;
        }
        gx0.bf bfVar = this.f276996d;
        return kotlinx.coroutines.l.e(bfVar.f276252s, new gx0.se(bfVar, this.f276997e, this.f276998f, this.f276999g, null));
    }
}
