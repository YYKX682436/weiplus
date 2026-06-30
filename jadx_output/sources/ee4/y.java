package ee4;

/* loaded from: classes4.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee4.c0 f251769d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ee4.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f251769d = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commit$1$1");
        ee4.y yVar = new ee4.y(this.f251769d, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commit$1$1");
        return yVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commit$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commit$1$1");
        java.lang.Object invokeSuspend = ((ee4.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commit$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commit$1$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commit$1$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getContext", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc");
        com.tencent.mm.ui.MMActivity c17 = this.f251769d.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getContext", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc");
        jz5.f0 f0Var = null;
        com.tencent.mm.plugin.sns.ui.SnsUploadUI snsUploadUI = c17 instanceof com.tencent.mm.plugin.sns.ui.SnsUploadUI ? (com.tencent.mm.plugin.sns.ui.SnsUploadUI) c17 : null;
        if (snsUploadUI != null) {
            snsUploadUI.n7(false);
            f0Var = jz5.f0.f302826a;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicCommitPc$commit$1$1");
        return f0Var;
    }
}
