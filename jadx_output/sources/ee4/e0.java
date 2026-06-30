package ee4;

/* loaded from: classes4.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee4.f0 f251699d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(ee4.f0 f0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f251699d = f0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc$showCommitLoadingDialog$1");
        ee4.e0 e0Var = new ee4.e0(this.f251699d, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc$showCommitLoadingDialog$1");
        return e0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc$showCommitLoadingDialog$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc$showCommitLoadingDialog$1");
        java.lang.Object invokeSuspend = ((ee4.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc$showCommitLoadingDialog$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc$showCommitLoadingDialog$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc$showCommitLoadingDialog$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getCommitLoadingDialog$p", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc");
        ee4.f0 f0Var = this.f251699d;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = f0Var.f251705n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getCommitLoadingDialog$p", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc");
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (u3Var != null) {
            f0Var.e("showCommitLoadingDialog has dialog");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc$showCommitLoadingDialog$1");
            return f0Var2;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getContext", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc");
        com.tencent.mm.ui.MMActivity c17 = f0Var.c();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getContext", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showCommitLoadingDialog", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicUIHelper");
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(c17, c17.getString(com.tencent.mm.R.string.f490573yv), c17.getString(com.tencent.mm.R.string.f490469vy), false, false, ie4.b.f291004d);
        kotlin.jvm.internal.o.f(Q, "showProgressDlg(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showCommitLoadingDialog", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicUIHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setCommitLoadingDialog$p", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc");
        f0Var.f251705n = Q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setCommitLoadingDialog$p", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc$showCommitLoadingDialog$1");
        return f0Var2;
    }
}
