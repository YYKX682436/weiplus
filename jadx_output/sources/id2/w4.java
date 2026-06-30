package id2;

/* loaded from: classes3.dex */
public final class w4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f290868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ il2.a f290869e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4(xg2.h hVar, kotlin.coroutines.Continuation continuation, il2.a aVar) {
        super(2, continuation);
        this.f290868d = hVar;
        this.f290869e = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new id2.w4(this.f290868d, continuation, this.f290869e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        id2.w4 w4Var = (id2.w4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        w4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.mn1 mn1Var = (r45.mn1) ((xg2.i) this.f290868d).f454393b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleFaceResult verify success is_passed: ");
        sb6.append(mn1Var.getBoolean(1));
        sb6.append(" verifyData: ");
        il2.a aVar2 = this.f290869e;
        sb6.append(aVar2);
        com.tencent.mars.xlog.Log.i("FinderLiveRemindRestric", sb6.toString());
        aVar2.f292036d.invoke(java.lang.Boolean.valueOf(mn1Var.getBoolean(1)));
        return jz5.f0.f302826a;
    }
}
