package q71;

/* loaded from: classes.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f360320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f360321e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.modelbase.f fVar, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f360320d = fVar;
        this.f360321e = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new q71.a(this.f360320d, this.f360321e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        q71.a aVar = (q71.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        aVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doCgi error: [");
        com.tencent.mm.modelbase.f fVar = this.f360320d;
        sb6.append(fVar.f70615a);
        sb6.append(':');
        sb6.append(fVar.f70616b);
        sb6.append(':');
        sb6.append(fVar.f70617c);
        sb6.append(']');
        com.tencent.mars.xlog.Log.e("MicroMsg.AnalyseRcptInfoCgi", sb6.toString());
        this.f360321e.invoke(null);
        return jz5.f0.f302826a;
    }
}
