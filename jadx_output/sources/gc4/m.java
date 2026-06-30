package gc4;

/* loaded from: classes4.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f270462d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gc4.l f270463e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f270464f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(gc4.l lVar, yz5.l lVar2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f270463e = lVar;
        this.f270464f = lVar2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$awaitTmplInfoBlocking$1");
        gc4.m mVar = new gc4.m(this.f270463e, this.f270464f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$awaitTmplInfoBlocking$1");
        return mVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$awaitTmplInfoBlocking$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$awaitTmplInfoBlocking$1");
        java.lang.Object invokeSuspend = ((gc4.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$awaitTmplInfoBlocking$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$awaitTmplInfoBlocking$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$awaitTmplInfoBlocking$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f270462d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            uy0.h hVar = (uy0.h) i95.n0.c(uy0.h.class);
            gc4.l lVar = this.f270463e;
            lVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTemplateId", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$MiaoJianCutSameInfo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTemplateId", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$MiaoJianCutSameInfo");
            this.f270462d = 1;
            ((ez0.i) hVar).getClass();
            obj = nz0.o.f341530a.b(lVar.f270460a, 4, this);
            if (obj == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$awaitTmplInfoBlocking$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$awaitTmplInfoBlocking$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f270464f.invoke((r45.rz6) obj);
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.helper.ThirdAppJumpHelper$awaitTmplInfoBlocking$1");
        return f0Var;
    }
}
