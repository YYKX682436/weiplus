package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f168749d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f168749d = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$dispatcher$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$dispatcher$2");
        androidx.appcompat.app.AppCompatActivity activity = this.f168749d;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.sns.ui.improve.component.v vVar = (com.tencent.mm.plugin.sns.ui.improve.component.v) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.sns.ui.improve.component.v.class);
        vVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHandlerDispatcher", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveDispatchUIC");
        t26.d dVar = vVar.f169030f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHandlerDispatcher", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveDispatchUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$dispatcher$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.BaseSnsTimelineUIC$dispatcher$2");
        return dVar;
    }
}
