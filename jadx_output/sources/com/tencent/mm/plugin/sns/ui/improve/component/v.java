package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes4.dex */
public final class v extends com.tencent.mm.plugin.sns.ui.improve.component.j {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.HandlerThread f169028d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f169029e;

    /* renamed from: f, reason: collision with root package name */
    public final t26.d f169030f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        int i17 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("Sns-Dispatch", 5);
        this.f169028d = a17;
        a17.start();
        android.os.Handler handler = new android.os.Handler(a17.getLooper());
        this.f169029e = handler;
        this.f169030f = t26.e.b(handler, null, 1, null);
        rk0.c.c("MicroMsg.Improve.ImproveDispatchUIC", "create ImproveDispatchUIC", new java.lang.Object[0]);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveDispatchUIC");
        this.f169029e.removeCallbacksAndMessages(null);
        this.f169028d.quitSafely();
        rk0.c.c("MicroMsg.Improve.ImproveDispatchUIC", "onDestroy ImproveDispatchUIC", new java.lang.Object[0]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveDispatchUIC");
    }
}
