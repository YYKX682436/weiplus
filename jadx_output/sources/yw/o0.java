package yw;

/* loaded from: classes11.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.mm.biz.a1 f466413d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.tencent.wechat.mm.biz.a1 a1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f466413d = a1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yw.o0(this.f466413d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yw.o0 o0Var = (yw.o0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        o0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        yw.q0 q0Var = yw.q0.f466429a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init finder live dot mode: ");
        com.tencent.wechat.mm.biz.a1 finderLiveInfo = this.f466413d;
        sb6.append(finderLiveInfo.c().name());
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterDigestHelper", sb6.toString());
        com.tencent.mm.pluginsdk.model.b0 b0Var = com.tencent.mm.pluginsdk.model.b0.f189197a;
        kotlin.jvm.internal.o.f(finderLiveInfo, "$finderLiveInfo");
        boolean l17 = b0Var.l(finderLiveInfo);
        com.tencent.mm.pluginsdk.model.b0.f189202f = finderLiveInfo;
        if (l17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterDigestHelper", "update main session by finder info change");
            yw.q0.b(yw.q0.f466429a, yw.d0.f466296m, null, 2, null);
        }
        return jz5.f0.f302826a;
    }
}
