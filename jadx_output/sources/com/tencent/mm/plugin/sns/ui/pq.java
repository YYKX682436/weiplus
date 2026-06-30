package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class pq extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI f170253d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq(com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI snsSpringUploadUI) {
        super(0);
        this.f170253d = snsSpringUploadUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI$inputView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI$inputView$2");
        android.view.View findViewById = this.f170253d.findViewById(com.tencent.mm.R.id.n7w);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI$inputView$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsSpringUploadUI$inputView$2");
        return findViewById;
    }
}
