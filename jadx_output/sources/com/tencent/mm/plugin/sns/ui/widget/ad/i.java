package com.tencent.mm.plugin.sns.ui.widget.ad;

/* loaded from: classes3.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.ad.v0 f171000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.y f171001e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.tencent.mm.plugin.sns.ui.widget.ad.v0 v0Var, androidx.lifecycle.y yVar) {
        super(0);
        this.f171000d = v0Var;
        this.f171001e = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$multiViewGroup$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$multiViewGroup$2");
        com.tencent.mm.plugin.sns.ui.widget.ad.v0 v0Var = this.f171000d;
        v0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActionBtnContainer", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionBtnContainer", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent");
        android.view.ViewStub viewStub = (android.view.ViewStub) v0Var.f171050o.findViewById(com.tencent.mm.R.id.f486972n20);
        android.view.ViewGroup viewGroup = viewStub != null ? (android.view.ViewGroup) a84.y0.h(viewStub) : null;
        if (viewGroup == null) {
            com.tencent.mars.xlog.Log.e(v0Var.j(), "weird multiView inflate!");
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$multiViewGroup$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.ad.AdMultiProductComponent$multiViewGroup$2");
        return viewGroup;
    }
}
