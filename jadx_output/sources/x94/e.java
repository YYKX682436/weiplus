package x94;

/* loaded from: classes10.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f452737d;

    /* renamed from: e, reason: collision with root package name */
    public int f452738e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout f452739f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout snsCoverVideoEditPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f452739f = snsCoverVideoEditPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout$statusChange$2");
        x94.e eVar = new x94.e(this.f452739f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout$statusChange$2");
        return eVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout$statusChange$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout$statusChange$2");
        java.lang.Object invokeSuspend = ((x94.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout$statusChange$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout$statusChange$2");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        ru3.f fVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout$statusChange$2");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f452738e;
        com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout snsCoverVideoEditPluginLayout = this.f452739f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i18 = com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout.f163994o;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getPreviewPlugin$p", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout");
            y94.f0 f0Var = snsCoverVideoEditPluginLayout.f163996m;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getPreviewPlugin$p", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout");
            f0Var.onPause();
            ru3.f fVar2 = new ru3.f();
            android.content.Context context = snsCoverVideoEditPluginLayout.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            fVar2.b(context, false, com.tencent.mm.R.string.i1q, x94.d.f452736d);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getExportPlugin$p", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout");
            y94.h0 h0Var = snsCoverVideoEditPluginLayout.f163997n;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getExportPlugin$p", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout");
            this.f452737d = fVar2;
            this.f452738e = 1;
            java.lang.Object z17 = h0Var.z(this);
            if (z17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout$statusChange$2");
                return aVar;
            }
            fVar = fVar2;
            obj = z17;
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout$statusChange$2");
                throw illegalStateException;
            }
            fVar = (ru3.f) this.f452737d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.mediabasic.data.MediaResultInfo mediaResultInfo = (com.tencent.mm.plugin.mediabasic.data.MediaResultInfo) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverVideoEditPluginLayout", "Export Result:" + mediaResultInfo);
        fVar.a();
        ut3.f.f431176c.b(snsCoverVideoEditPluginLayout.getContext(), -1, mediaResultInfo);
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
        s0Var.A().f60514e = 2;
        s0Var.z().f60509e = 2;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverVideoEditPluginLayout$statusChange$2");
        return f0Var2;
    }
}
