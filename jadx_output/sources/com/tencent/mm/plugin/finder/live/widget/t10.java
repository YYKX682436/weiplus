package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class t10 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.z10 f119859d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t10(com.tencent.mm.plugin.finder.live.widget.z10 z10Var) {
        super(0);
        this.f119859d = z10Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.widget.z10 z10Var = this.f119859d;
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = z10Var.f120499h;
        if (liveBottomSheetPanel == null) {
            kotlin.jvm.internal.o.o("container");
            throw null;
        }
        if (!liveBottomSheetPanel.isShowing) {
            android.view.View view = z10Var.f120498g;
            if (view == null) {
                kotlin.jvm.internal.o.o("rootView");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget$hideLoading$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorGameTogetherWidget$hideLoading$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel2 = z10Var.f120499h;
            if (liveBottomSheetPanel2 == null) {
                kotlin.jvm.internal.o.o("container");
                throw null;
            }
            liveBottomSheetPanel2.f();
        }
        z10Var.d();
        android.widget.TextView textView = z10Var.f120502k;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.widget.FrameLayout frameLayout = z10Var.f120496e;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        return jz5.f0.f302826a;
    }
}
