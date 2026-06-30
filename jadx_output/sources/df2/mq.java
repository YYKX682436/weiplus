package df2;

/* loaded from: classes.dex */
public final class mq extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f230794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.ar f230795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f230796f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq(xg2.h hVar, kotlin.coroutines.Continuation continuation, df2.ar arVar, kotlin.jvm.internal.h0 h0Var) {
        super(2, continuation);
        this.f230794d = hVar;
        this.f230795e = arVar;
        this.f230796f = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.mq(this.f230794d, continuation, this.f230795e, this.f230796f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.mq mqVar = (df2.mq) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        mqVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.rs1 rs1Var = (r45.rs1) ((xg2.i) this.f230794d).f454393b;
        java.lang.String str = this.f230795e.f229737m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getGiftInfo succ, ");
        r45.lv1 lv1Var = (r45.lv1) rs1Var.getCustom(2);
        sb6.append(lv1Var != null ? lv1Var.toJSON() : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        this.f230796f.f310123d = (r45.lv1) rs1Var.getCustom(2);
        return jz5.f0.f302826a;
    }
}
