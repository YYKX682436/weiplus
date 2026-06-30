package e54;

/* loaded from: classes.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f249643d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f249644e;

    /* renamed from: f, reason: collision with root package name */
    public int f249645f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.mr5 f249646g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f249647h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f249648i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(r45.mr5 mr5Var, int i17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f249646g = mr5Var;
        this.f249647h = i17;
        this.f249648i = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlHandler$suspendGetRedPacketCoverUrl$$inlined$requestCgiAsync$1");
        e54.d dVar = new e54.d(this.f249646g, this.f249647h, this.f249648i, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlHandler$suspendGetRedPacketCoverUrl$$inlined$requestCgiAsync$1");
        return dVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlHandler$suspendGetRedPacketCoverUrl$$inlined$requestCgiAsync$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlHandler$suspendGetRedPacketCoverUrl$$inlined$requestCgiAsync$1");
        java.lang.Object invokeSuspend = ((e54.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlHandler$suspendGetRedPacketCoverUrl$$inlined$requestCgiAsync$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlHandler$suspendGetRedPacketCoverUrl$$inlined$requestCgiAsync$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlHandler$suspendGetRedPacketCoverUrl$$inlined$requestCgiAsync$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f249645f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.mr5 mr5Var = this.f249646g;
            int i18 = this.f249647h;
            java.lang.String str = this.f249648i;
            this.f249643d = mr5Var;
            this.f249644e = str;
            this.f249645f = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            e54.b bVar = new e54.b(rVar);
            k64.l.a(mr5Var, i18, str, bVar, (r45.js5) r45.h93.class.newInstance(), true);
            rVar.m(new e54.c(bVar, i18, mr5Var));
            obj = rVar.j();
            if (obj == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlHandler$suspendGetRedPacketCoverUrl$$inlined$requestCgiAsync$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlHandler$suspendGetRedPacketCoverUrl$$inlined$requestCgiAsync$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.handler.RedPacketCoverUrlHandler$suspendGetRedPacketCoverUrl$$inlined$requestCgiAsync$1");
        return obj;
    }
}
