package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f168936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC f168937e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC snsWsFoldInputUIC) {
        super(0);
        this.f168936d = appCompatActivity;
        this.f168937e = snsWsFoldInputUIC;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$commentKeyBoardStateDelegate$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$commentKeyBoardStateDelegate$2");
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f168936d;
        kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        gc4.b bVar = new gc4.b((com.tencent.mm.ui.MMActivity) appCompatActivity, com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC.P6(this.f168937e));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$commentKeyBoardStateDelegate$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.SnsWsFoldInputUIC$commentKeyBoardStateDelegate$2");
        return bVar;
    }
}
