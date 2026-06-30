package df2;

/* loaded from: classes.dex */
public final class jq extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f230493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.ar f230494e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq(xg2.h hVar, kotlin.coroutines.Continuation continuation, df2.ar arVar) {
        super(2, continuation);
        this.f230493d = hVar;
        this.f230494e = arVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.jq(this.f230493d, continuation, this.f230494e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.jq jqVar = (df2.jq) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        jqVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.wk1 wk1Var = (r45.wk1) ((xg2.i) this.f230493d).f454393b;
        df2.ar arVar = this.f230494e;
        com.tencent.mars.xlog.Log.i(arVar.f229737m, "followAttend success");
        if (arVar.e7((r45.lv1) wk1Var.getCustom(2))) {
            df2.ar arVar2 = this.f230494e;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            com.tencent.mm.plugin.finder.live.util.y.o(arVar2, kotlinx.coroutines.internal.b0.f310484a, null, new df2.hq(arVar2, null), 2, null);
        }
        return jz5.f0.f302826a;
    }
}
