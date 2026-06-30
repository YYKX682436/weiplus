package qa4;

/* loaded from: classes3.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f361100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361101e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f361102f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f361103g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String str, int i17, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f361101e = str;
        this.f361102f = i17;
        this.f361103g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion$showAlertListDialog$2$1");
        qa4.m mVar = new qa4.m(this.f361101e, this.f361102f, this.f361103g, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion$showAlertListDialog$2$1");
        return mVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion$showAlertListDialog$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion$showAlertListDialog$2$1");
        java.lang.Object invokeSuspend = ((qa4.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion$showAlertListDialog$2$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion$showAlertListDialog$2$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion$showAlertListDialog$2$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f361100d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            qa4.k kVar = qa4.k.f361095a;
            this.f361100d = 1;
            obj = kVar.t(this.f361101e, this.f361102f, this);
            if (obj == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion$showAlertListDialog$2$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion$showAlertListDialog$2$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f361103g.invoke(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()));
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.model.withta.WithTaRemove$Companion$showAlertListDialog$2$1");
        return f0Var;
    }
}
