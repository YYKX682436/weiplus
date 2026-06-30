package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class qu {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f170358a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f170359b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f170360c;

    /* renamed from: d, reason: collision with root package name */
    public final sb4.y f170361d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f170362e;

    /* renamed from: f, reason: collision with root package name */
    public int f170363f;

    /* renamed from: g, reason: collision with root package name */
    public int f170364g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f170365h;

    /* renamed from: i, reason: collision with root package name */
    public int f170366i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f170367j;

    public qu(android.app.Activity context, java.lang.String userName, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f170358a = context;
        this.f170359b = userName;
        this.f170360c = z17;
        this.f170361d = new sb4.y(context, userName, z17);
        this.f170362e = new java.util.ArrayList();
        this.f170365h = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f170367j = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsStarFeedOperateEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$operateListener$1
            {
                this.__eventId = 778735630;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsStarFeedOperateEvent snsStarFeedOperateEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$operateListener$1");
                com.tencent.mm.autogen.events.SnsStarFeedOperateEvent event = snsStarFeedOperateEvent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$operateListener$1");
                kotlin.jvm.internal.o.g(event, "event");
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.sns.ui.pu(event, com.tencent.mm.plugin.sns.ui.qu.this));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$operateListener$1");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper$operateListener$1");
                return false;
            }
        };
    }

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserName", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserName", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
        return this.f170359b;
    }

    public final void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadSlotData", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
        if (cc4.b.f40482a.a()) {
            kotlinx.coroutines.l.d(this.f170365h, null, null, new com.tencent.mm.plugin.sns.ui.ou(this, null), 3, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadSlotData", "com.tencent.mm.plugin.sns.ui.SnsUserStarSlotHelper");
    }
}
