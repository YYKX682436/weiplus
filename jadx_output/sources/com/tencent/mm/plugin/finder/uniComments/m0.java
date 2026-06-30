package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class m0 extends androidx.recyclerview.widget.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f130303n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(int i17, int i18, android.content.Context context) {
        super(context);
        this.f130303n = i17;
    }

    @Override // androidx.recyclerview.widget.o1, androidx.recyclerview.widget.g3
    public void e(android.view.View targetView, androidx.recyclerview.widget.h3 state, androidx.recyclerview.widget.e3 action) {
        kotlin.jvm.internal.o.g(targetView, "targetView");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        targetView.toString();
        state.toString();
        super.e(targetView, state, action);
        int h17 = h(targetView, m());
        int i17 = i(targetView, 1);
        if (k((int) java.lang.Math.sqrt((h17 * h17) + (i17 * i17))) > 0) {
            action.b(-h17, (-i17) + 0, this.f130303n, new android.view.animation.LinearInterpolator());
        }
    }

    @Override // androidx.recyclerview.widget.o1
    public int l(int i17) {
        return this.f130303n;
    }
}
