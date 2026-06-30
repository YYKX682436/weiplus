package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes9.dex */
public final class yh extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView f171632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.lh0 f171633e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171634f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f171635g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh(com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView snsEcsShareTailView, r45.lh0 lh0Var, java.lang.String str, long j17) {
        super(1);
        this.f171632d = snsEcsShareTailView;
        this.f171633e = lh0Var;
        this.f171634f = str;
        this.f171635g = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView$bindEcsShareInfo$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView$bindEcsShareInfo$3");
        com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView.a(this.f171632d, "element_expose", this.f171633e, this.f171634f, this.f171635g);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView$bindEcsShareInfo$3");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView$bindEcsShareInfo$3");
        return f0Var;
    }
}
