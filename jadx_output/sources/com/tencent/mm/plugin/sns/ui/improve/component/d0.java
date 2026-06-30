package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f168754d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC f168755e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC improveInputUIC) {
        super(0);
        this.f168754d = appCompatActivity;
        this.f168755e = improveInputUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$commentKeyBoardStateDelegate$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$commentKeyBoardStateDelegate$2");
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f168754d;
        kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        gc4.b bVar = new gc4.b((com.tencent.mm.ui.MMActivity) appCompatActivity, com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC.O6(this.f168755e));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$commentKeyBoardStateDelegate$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$commentKeyBoardStateDelegate$2");
        return bVar;
    }
}
