package df2;

/* loaded from: classes3.dex */
public final class na extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f230842e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.zb f230843f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na(java.lang.String str, java.lang.String str2, df2.zb zbVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230841d = str;
        this.f230842e = str2;
        this.f230843f = zbVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.na(this.f230841d, this.f230842e, this.f230843f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.na naVar = (df2.na) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        naVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        cl0.g gVar = new cl0.g();
        gVar.h("ai_session_id", this.f230841d);
        gVar.h("ai_msg_id", this.f230842e);
        gVar.o("type", 2);
        gVar.o("function_type", 1);
        com.tencent.mars.xlog.Log.i(this.f230843f.f231939m, "[reportAiAssistantOp] js = " + gVar);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.J2, gVar.toString(), null, 4, null);
        return jz5.f0.f302826a;
    }
}
