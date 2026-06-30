package x64;

/* loaded from: classes.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f452322d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f452323e;

    /* renamed from: f, reason: collision with root package name */
    public int f452324f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.mr5 f452325g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f452326h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f452327i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r45.mr5 mr5Var, int i17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f452325g = mr5Var;
        this.f452326h = i17;
        this.f452327i = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
        x64.s sVar = new x64.s(this.f452325g, this.f452326h, this.f452327i, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
        return sVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
        java.lang.Object invokeSuspend = ((x64.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f452324f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.mr5 mr5Var = this.f452325g;
            int i18 = this.f452326h;
            java.lang.String str = this.f452327i;
            this.f452322d = mr5Var;
            this.f452323e = str;
            this.f452324f = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            x64.q qVar = new x64.q(rVar);
            k64.h.a(mr5Var, i18, str, qVar, (r45.js5) r45.ua0.class.newInstance(), true);
            rVar.m(new x64.r(qVar, i18, mr5Var));
            obj = rVar.j();
            if (obj == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdJumpWxKefuClick$jumpWxKefu$1$invokeSuspend$$inlined$requestCgiAsync$default$1");
        return obj;
    }
}
