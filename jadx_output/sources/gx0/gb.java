package gx0;

/* loaded from: classes5.dex */
public final class gb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f276460d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f276461e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f276462f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f276463g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gb(gx0.ac acVar, boolean z17, com.tencent.maas.model.time.MJTime mJTime, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276461e = acVar;
        this.f276462f = z17;
        this.f276463g = mJTime;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.gb(this.f276461e, this.f276462f, this.f276463g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.gb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ex0.e eVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f276460d;
        gx0.ac acVar = this.f276461e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.bf c86 = acVar.c8();
            this.f276460d = 1;
            if (gx0.bf.t7(c86, false, this, 1, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (this.f276462f) {
            ex0.a0 e86 = acVar.e8();
            if (e86 != null && (eVar = e86.I) != null) {
                eVar.f257126d = false;
            }
            gx0.bf.q7(acVar.c8(), this.f276463g, false, 0L, 4, null);
            acVar.g8(this.f276463g);
        }
        return jz5.f0.f302826a;
    }
}
