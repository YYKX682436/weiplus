package com.tencent.mm.plugin.sns.ui;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/SnsUploadV2SayFooter;", "Lcom/tencent/mm/plugin/sns/ui/widget/AbsSnsUploadSayFooter;", "", "getSoftInputMode", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SnsUploadV2SayFooter extends com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter {

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f167591u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f167592v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnsUploadV2SayFooter(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f167591u = "MicroMsg.SnsUploadV2SayFooter";
    }

    public static final /* synthetic */ java.lang.String i(com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter snsUploadV2SayFooter) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
        java.lang.String str = snsUploadV2SayFooter.f167591u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
        return str;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter
    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshBottomPanelHeight", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
        int g17 = com.tencent.mm.sdk.platformtools.d2.g(this.f170756f);
        android.view.ViewGroup.LayoutParams layoutParams = this.f170757g.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = g17;
        }
        this.f170757g.setLayoutParams(layoutParams);
        com.tencent.mars.xlog.Log.i(this.f167591u, "refreshBottomPanelHeight: smileyPanel height=%d", java.lang.Integer.valueOf(g17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshBottomPanelHeight", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter
    public void d(boolean z17, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshUIOnInputPanelChange", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
        if (this.f170762o != i17 && i17 != 0) {
            this.f170762o = i17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("saveKeyboardHeight", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            fp.w.m(getContext(), i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("saveKeyboardHeight", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            c();
        }
        if (z17) {
            f();
        } else {
            e();
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.sns.ui.ju(this, z17, i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshUIOnInputPanelChange", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
    }

    @Override // com.tencent.mm.ui.widget.SnsUploadInputPanelLinearLayout
    public int getSoftInputMode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSoftInputMode", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
        int i17 = com.tencent.mm.ui.b4.c(this.f170756f) ? 32 : 18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSoftInputMode", "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
        return i17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter
    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(hc1.i.NAME, "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
        this.f170763p = true;
        this.f170757g.i();
        getInputPanelHelper().e(new com.tencent.mm.plugin.sns.ui.lu(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(hc1.i.NAME, "com.tencent.mm.plugin.sns.ui.SnsUploadV2SayFooter");
    }
}
