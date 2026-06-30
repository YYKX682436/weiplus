package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes9.dex */
public final class zh extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView f171692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.lh0 f171693e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171694f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f171695g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh(com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView snsEcsShareTailView, r45.lh0 lh0Var, java.lang.String str, long j17) {
        super(1);
        this.f171692d = snsEcsShareTailView;
        this.f171693e = lh0Var;
        this.f171694f = str;
        this.f171695g = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView$bindEcsShareInfo$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView$bindEcsShareInfo$4");
        com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView.a(this.f171692d, "element_click", this.f171693e, this.f171694f, this.f171695g);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView$bindEcsShareInfo$4");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView$bindEcsShareInfo$4");
        return f0Var;
    }
}
