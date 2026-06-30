package h41;

/* loaded from: classes14.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.x f278823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f278824e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(h41.x xVar, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f278823d = xVar;
        this.f278824e = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new h41.l(this.f278823d, this.f278824e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        h41.l lVar = (h41.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        lVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        h41.x xVar = this.f278823d;
        h41.j jVar = xVar.f278885b;
        jVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCChatBot", "destroy");
        g41.f fVar = jVar.f278815q;
        if (fVar != null) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new g41.d(fVar, null), 3, null);
        }
        jVar.f278815q = null;
        wx.f1 f1Var = jVar.f278807f;
        if (f1Var != null) {
            ((hy.a0) f1Var).d(jVar);
        }
        wx.f1 f1Var2 = jVar.f278807f;
        if (f1Var2 != null) {
            ((hy.a0) f1Var2).c(com.tencent.wechat.aff.chatbot.d3.HANGUP_REASON_MANUAL, h41.b.f278759d);
        }
        jVar.f278807f = null;
        com.tencent.wechat.aff.ovc.a aVar2 = xVar.f278884a;
        if (aVar2 != null) {
            aVar2.L0(this.f278824e);
        }
        return jz5.f0.f302826a;
    }
}
