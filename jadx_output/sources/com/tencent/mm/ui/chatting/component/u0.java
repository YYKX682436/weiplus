package com.tencent.mm.ui.chatting.component;

/* loaded from: classes15.dex */
public final class u0 extends com.tencent.mm.ui.chatting.component.a implements yn.e, f4.g {

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.HashMap f200034m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.ArrayList f200035n;

    /* renamed from: e, reason: collision with root package name */
    public boolean f200036e;

    /* renamed from: g, reason: collision with root package name */
    public f4.i f200038g;

    /* renamed from: f, reason: collision with root package name */
    public boolean f200037f = true;

    /* renamed from: h, reason: collision with root package name */
    public final long f200039h = c06.e.f37716d.g(com.tencent.wcdb.core.Database.DictDefaultMatchValue);

    /* renamed from: i, reason: collision with root package name */
    public final int f200040i = tb5.v.f417082r.a();

    static {
        new com.tencent.mm.ui.chatting.component.t0(null);
        f200034m = new java.util.HashMap();
        f200035n = new java.util.ArrayList();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        boolean z17 = od5.b.f344655a;
        if (od5.b.f344655a) {
            if (this.f200037f) {
                java.lang.Object p17 = this.f198580d.p();
                android.view.View view = p17 instanceof android.view.View ? (android.view.View) p17 : null;
                if (view != null) {
                    android.view.ViewParent parent = view.getParent();
                    while (parent instanceof android.view.View) {
                        view = parent;
                        parent = view.getParent();
                    }
                    java.lang.Object tag = view.getTag(com.tencent.mm.R.id.jid);
                    if (tag == null) {
                        tag = new f4.s();
                        view.setTag(com.tencent.mm.R.id.jid, tag);
                    }
                    android.view.Window window = this.f198580d.g().getWindow();
                    kotlin.jvm.internal.o.f(window, "getWindow(...)");
                    kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                    this.f200038g = new f4.i(window, kotlinx.coroutines.h2.a(kotlinx.coroutines.internal.b0.f310484a), this, null);
                }
                this.f200037f = false;
            }
            f4.i iVar = this.f200038g;
            if (iVar == null) {
                return;
            }
            iVar.a(true);
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        f200035n.clear();
        f200034m.clear();
        f4.i iVar = this.f200038g;
        if (iVar == null) {
            return;
        }
        iVar.a(false);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void L(yb5.d dVar) {
        super.L(dVar);
    }

    @Override // yn.d
    public void j0(android.view.View view, int i17) {
        if (i17 == 0) {
            this.f200036e = false;
        } else if (i17 == 1 || i17 == 2) {
            this.f200036e = true;
        }
    }

    @Override // f4.g
    public void q1(f4.d frameData) {
        kotlin.jvm.internal.o.g(frameData, "frameData");
        if (frameData.f259381c) {
            com.tencent.mm.autogen.mmdata.rpt.ChatFrameJankReportStruct chatFrameJankReportStruct = new com.tencent.mm.autogen.mmdata.rpt.ChatFrameJankReportStruct();
            chatFrameJankReportStruct.f55604d = chatFrameJankReportStruct.b("SessionId", this.f198580d.x(), true);
            chatFrameJankReportStruct.f55606f = frameData.f259380b;
            chatFrameJankReportStruct.f55615o = chatFrameJankReportStruct.b("StringVal2", "true", true);
            if (frameData instanceof f4.e) {
                android.app.Activity g17 = this.f198580d.g();
                kotlin.jvm.internal.o.f(g17, "getContext(...)");
                if (com.tencent.mm.ui.chatting.component.v0.f200103a == 0) {
                    android.view.Window window = g17.getWindow();
                    float f17 = 60.0f;
                    float refreshRate = window != null ? window.getWindowManager().getDefaultDisplay().getRefreshRate() : 60.0f;
                    if (refreshRate >= 30.0f && refreshRate <= 200.0f) {
                        f17 = refreshRate;
                    }
                    com.tencent.mm.ui.chatting.component.v0.f200103a = (int) f17;
                }
                chatFrameJankReportStruct.f55611k = com.tencent.mm.ui.chatting.component.v0.f200103a;
                f4.e eVar = (f4.e) frameData;
                android.view.FrameMetrics frameMetrics = eVar.f259384f;
                long metric = frameMetrics != null ? frameMetrics.getMetric(0) : -1L;
                android.view.FrameMetrics frameMetrics2 = eVar.f259384f;
                long metric2 = frameMetrics2 != null ? frameMetrics2.getMetric(1) : -1L;
                android.view.FrameMetrics frameMetrics3 = eVar.f259384f;
                long metric3 = frameMetrics3 != null ? frameMetrics3.getMetric(2) : -1L;
                android.view.FrameMetrics frameMetrics4 = eVar.f259384f;
                long metric4 = frameMetrics4 != null ? frameMetrics4.getMetric(3) : -1L;
                android.view.FrameMetrics frameMetrics5 = eVar.f259384f;
                long metric5 = frameMetrics5 != null ? frameMetrics5.getMetric(4) : -1L;
                android.view.FrameMetrics frameMetrics6 = eVar.f259384f;
                long metric6 = frameMetrics6 != null ? frameMetrics6.getMetric(5) : -1L;
                android.view.FrameMetrics frameMetrics7 = eVar.f259384f;
                long metric7 = frameMetrics7 != null ? frameMetrics7.getMetric(6) : -1L;
                android.view.FrameMetrics frameMetrics8 = eVar.f259384f;
                long metric8 = frameMetrics8 != null ? frameMetrics8.getMetric(7) : -1L;
                chatFrameJankReportStruct.f55613m = this.f200036e ? 1L : 0L;
                chatFrameJankReportStruct.f55605e = metric;
                chatFrameJankReportStruct.f55607g = metric2;
                chatFrameJankReportStruct.f55616p = metric3;
                chatFrameJankReportStruct.f55617q = metric4;
                chatFrameJankReportStruct.f55618r = metric5;
                chatFrameJankReportStruct.f55619s = metric6;
                chatFrameJankReportStruct.f55620t = metric7;
                chatFrameJankReportStruct.f55621u = metric8;
                if (metric5 != 0) {
                    java.lang.String format = java.lang.String.format("%.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Float.valueOf((((float) metric4) * 1.0f) / ((float) metric5))}, 1));
                    kotlin.jvm.internal.o.f(format, "format(...)");
                    chatFrameJankReportStruct.f55614n = chatFrameJankReportStruct.b("StringVal1", r26.i0.t(format, ",", ";", false), true);
                }
            }
            if (frameData instanceof f4.f) {
                chatFrameJankReportStruct.f55608h = ((f4.f) frameData).f259385g;
            }
            chatFrameJankReportStruct.f55609i = oj.d.e(com.tencent.mm.sdk.platformtools.x2.f193071a).f345682d;
            chatFrameJankReportStruct.f55610j = this.f200040i;
            chatFrameJankReportStruct.f55612l = this.f200039h;
            chatFrameJankReportStruct.k();
        }
        f200035n.clear();
        f200034m.clear();
    }
}
