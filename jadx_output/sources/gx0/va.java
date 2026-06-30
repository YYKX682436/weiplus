package gx0;

/* loaded from: classes5.dex */
public final class va extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ double f277069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f277070e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f277071f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va(double d17, ex0.a0 a0Var, gx0.ac acVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277069d = d17;
        this.f277070e = a0Var;
        this.f277071f = acVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.va(this.f277069d, this.f277070e, this.f277071f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        gx0.va vaVar = (gx0.va) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        vaVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        gx0.ac acVar = this.f277071f;
        com.tencent.maas.model.time.MJTime fromSeconds = com.tencent.maas.model.time.MJTime.fromSeconds(this.f277069d / this.f277070e.s(acVar.A7().getTimelineLayoutType()));
        gx0.bf c86 = acVar.c8();
        kotlin.jvm.internal.o.d(fromSeconds);
        gx0.bf.q7(c86, fromSeconds, true, 0L, 4, null);
        return jz5.f0.f302826a;
    }
}
