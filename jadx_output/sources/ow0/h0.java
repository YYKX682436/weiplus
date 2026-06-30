package ow0;

/* loaded from: classes5.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f349314d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.u2 f349315e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.model.time.MJTime f349316f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(gx0.u2 u2Var, com.tencent.maas.model.time.MJTime mJTime, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f349315e = u2Var;
        this.f349316f = mJTime;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ow0.h0(this.f349315e, this.f349316f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ow0.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f349314d;
        gx0.u2 u2Var = this.f349315e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            gx0.bf R7 = u2Var.R7();
            com.tencent.maas.model.time.MJTime seekTime = this.f349316f;
            kotlin.jvm.internal.o.f(seekTime, "$seekTime");
            this.f349314d = 1;
            if (gx0.bf.d7(R7, null, seekTime, true, this, 1, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        gx0.kh S7 = u2Var.S7();
        java.lang.String string = u2Var.getContext().getString(com.tencent.mm.R.string.lww);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        S7.r7(string, null);
        return jz5.f0.f302826a;
    }
}
