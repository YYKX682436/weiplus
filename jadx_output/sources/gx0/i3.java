package gx0;

/* loaded from: classes5.dex */
public final class i3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f276523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f276524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx0.y3 f276525f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(double d17, ex0.a0 a0Var, gx0.y3 y3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276523d = d17;
        this.f276524e = a0Var;
        this.f276525f = y3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.i3(this.f276523d, this.f276524e, this.f276525f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        gx0.i3 i3Var = (gx0.i3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        i3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        gx0.y3 y3Var = this.f276525f;
        com.tencent.maas.model.time.MJTime fromSeconds = com.tencent.maas.model.time.MJTime.fromSeconds(this.f276523d / this.f276524e.s(y3Var.o7().getTimelineLayoutType()));
        gx0.bf z76 = y3Var.z7();
        kotlin.jvm.internal.o.d(fromSeconds);
        gx0.bf.q7(z76, fromSeconds, true, 0L, 4, null);
        return jz5.f0.f302826a;
    }
}
