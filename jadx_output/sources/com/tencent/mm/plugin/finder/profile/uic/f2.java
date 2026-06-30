package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.j2 f123682d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(com.tencent.mm.plugin.finder.profile.uic.j2 j2Var) {
        super(0);
        this.f123682d = j2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.profile.uic.j2 j2Var = this.f123682d;
        com.tencent.mars.xlog.Log.i(j2Var.f123824i, "[fetchEndCallback] totalSize=" + j2Var.O6().getSize());
        if (j2Var.getRlLayout().getLoadMoreFooter() != null) {
            android.widget.TextView textView = (android.widget.TextView) j2Var.findViewById(com.tencent.mm.R.id.ili);
            if (textView != null) {
                textView.setText(com.tencent.mm.R.string.f491896el3);
            }
            android.widget.TextView textView2 = (android.widget.TextView) j2Var.findViewById(com.tencent.mm.R.id.ili);
            if (textView2 != null) {
                textView2.setTextColor(j2Var.getActivity().getResources().getColor(com.tencent.mm.R.color.FG_2));
            }
            android.widget.TextView textView3 = (android.widget.TextView) j2Var.findViewById(com.tencent.mm.R.id.ili);
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            android.view.View findViewById = j2Var.findViewById(com.tencent.mm.R.id.ilg);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfileCourseUIC$onCreate$4", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/profile/uic/FinderProfileCourseUIC$onCreate$4", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        j2Var.getRlLayout().E(true);
        return jz5.f0.f302826a;
    }
}
