package gx0;

/* loaded from: classes5.dex */
public final class xa extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f277169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f277170e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f277171f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(gx0.ac acVar, com.tencent.maas.model.time.MJTime mJTime, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277170e = acVar;
        this.f277171f = mJTime;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.xa(this.f277170e, this.f277171f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.xa) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f277169d;
        gx0.ac acVar = this.f277170e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.bf c86 = acVar.c8();
            com.tencent.maas.model.time.MJTime seekTime = this.f277171f;
            kotlin.jvm.internal.o.f(seekTime, "$seekTime");
            this.f277169d = 1;
            if (gx0.bf.d7(c86, null, seekTime, true, this, 1, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        gx0.kh d86 = acVar.d8();
        java.lang.String string = acVar.getContext().getString(com.tencent.mm.R.string.lww);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        d86.r7(string, null);
        return jz5.f0.f302826a;
    }
}
