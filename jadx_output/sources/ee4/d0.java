package ee4;

/* loaded from: classes4.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee4.f0 f251697d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(ee4.f0 f0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f251697d = f0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc$dismissCommitLoadingDialog$1");
        ee4.d0 d0Var = new ee4.d0(this.f251697d, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc$dismissCommitLoadingDialog$1");
        return d0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc$dismissCommitLoadingDialog$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc$dismissCommitLoadingDialog$1");
        ee4.d0 d0Var = (ee4.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        d0Var.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc$dismissCommitLoadingDialog$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc$dismissCommitLoadingDialog$1");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc$dismissCommitLoadingDialog$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getCommitLoadingDialog$p", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc");
        ee4.f0 f0Var = this.f251697d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = f0Var.f251705n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getCommitLoadingDialog$p", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc");
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setCommitLoadingDialog$p", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc");
        f0Var.f251705n = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setCommitLoadingDialog$p", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc");
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc$dismissCommitLoadingDialog$1");
        return f0Var2;
    }
}
