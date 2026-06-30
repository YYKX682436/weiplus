package id2;

/* loaded from: classes3.dex */
public final class v4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f290859d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ il2.a f290860e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(xg2.h hVar, kotlin.coroutines.Continuation continuation, il2.a aVar) {
        super(2, continuation);
        this.f290859d = hVar;
        this.f290860e = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new id2.v4(this.f290859d, continuation, this.f290860e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        id2.v4 v4Var = (id2.v4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        v4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f290859d).f454381b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleFaceResult verify fail: ");
        sb6.append(aVar2);
        sb6.append(" verifyData: ");
        il2.a aVar3 = this.f290860e;
        sb6.append(aVar3);
        com.tencent.mars.xlog.Log.i("FinderLiveRemindRestric", sb6.toString());
        aVar3.f292036d.invoke(java.lang.Boolean.FALSE);
        return jz5.f0.f302826a;
    }
}
