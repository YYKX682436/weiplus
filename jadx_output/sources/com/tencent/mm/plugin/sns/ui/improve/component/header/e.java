package com.tencent.mm.plugin.sns.ui.improve.component.header;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f168833a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.LinearLayout f168834b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f168835c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f168836d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f168837e;

    public e(kotlinx.coroutines.y0 lifecycleScope, android.widget.LinearLayout layout) {
        kotlin.jvm.internal.o.g(lifecycleScope, "lifecycleScope");
        kotlin.jvm.internal.o.g(layout, "layout");
        this.f168833a = lifecycleScope;
        this.f168834b = layout;
        this.f168835c = new java.util.HashMap();
        this.f168836d = layout.getContext();
        this.f168837e = "";
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshError", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
        kotlinx.coroutines.l.d(this.f168833a, kotlinx.coroutines.q1.f310568a, null, new com.tencent.mm.plugin.sns.ui.improve.component.header.d(this, null), 2, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshError", "com.tencent.mm.plugin.sns.ui.improve.component.header.HeaderErrorPostHandle");
    }
}
