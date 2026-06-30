package com.tencent.mm.plugin.sns.ui.improve.component;

/* loaded from: classes10.dex */
public final class n0 extends androidx.recyclerview.widget.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f168952n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(int i17, android.app.Activity activity) {
        super(activity);
        this.f168952n = i17;
    }

    @Override // androidx.recyclerview.widget.o1, androidx.recyclerview.widget.g3
    public void e(android.view.View targetView, androidx.recyclerview.widget.h3 state, androidx.recyclerview.widget.e3 action) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTargetFound", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$unreadScrollListener$1$callback$linearSmoothScroller$1");
        kotlin.jvm.internal.o.g(targetView, "targetView");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        super.e(targetView, state, action);
        int h17 = h(targetView, m());
        int i17 = i(targetView, -1);
        int k17 = k((int) java.lang.Math.sqrt((h17 * h17) + (i17 * i17)));
        if (k17 > 0) {
            action.b(-h17, (-i17) - this.f168952n, k17, this.f12176i);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTargetFound", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$unreadScrollListener$1$callback$linearSmoothScroller$1");
    }
}
