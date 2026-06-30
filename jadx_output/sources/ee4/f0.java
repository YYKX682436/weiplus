package ee4;

/* loaded from: classes4.dex */
public final class f0 extends ee4.t {

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f251705n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(ce4.b pcContext) {
        super(pcContext);
        kotlin.jvm.internal.o.g(pcContext, "pcContext");
    }

    @Override // ce4.a
    public java.lang.String d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc");
        return "SnsPublish.MultiPicDialogPc";
    }

    @Override // ce4.a
    public void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc");
        super.i();
        this.f251705n = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc");
    }

    public final void p() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dismissCommitLoadingDialog", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc");
        kotlinx.coroutines.l.d(o().q(), null, null, new ee4.d0(this, null), 3, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dismissCommitLoadingDialog", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc");
    }

    public final void q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showCommitLoadingDialog", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc");
        kotlinx.coroutines.l.d(o().q(), null, null, new ee4.e0(this, null), 3, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showCommitLoadingDialog", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicDialogPc");
    }
}
