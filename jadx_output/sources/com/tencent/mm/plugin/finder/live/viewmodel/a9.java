package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class a9 extends com.tencent.mm.ui.component.UIComponent implements zy2.t8 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.RelativeLayout f116904d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.view.View findViewById = getActivity().findViewById(com.tencent.mm.R.id.qfz);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f116904d = (android.widget.RelativeLayout) findViewById;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        jz5.f0 f0Var;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.live.viewmodel.z2.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.live.viewmodel.z2 z2Var = (com.tencent.mm.plugin.finder.live.viewmodel.z2) a17;
        r45.lc1 u47 = g92.b.f269769e.u4();
        android.widget.RelativeLayout relativeLayout = this.f116904d;
        if (relativeLayout == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        relativeLayout.removeAllViews();
        r45.s02 s02Var = new r45.s02();
        s02Var.set(3, 2);
        s02Var.set(4, java.lang.Long.valueOf(c01.id.a()));
        android.view.View Q6 = z2Var.Q6(u47, s02Var, true, true, false);
        if (Q6 != null) {
            android.widget.RelativeLayout relativeLayout2 = this.f116904d;
            if (relativeLayout2 == null) {
                kotlin.jvm.internal.o.o("root");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(relativeLayout2, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(relativeLayout2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorRolePrivacyUIC", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            relativeLayout2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(relativeLayout2, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorRolePrivacyUIC", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(relativeLayout2, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.RelativeLayout relativeLayout3 = this.f116904d;
            if (relativeLayout3 == null) {
                kotlin.jvm.internal.o.o("root");
                throw null;
            }
            relativeLayout3.addView(Q6, new android.widget.RelativeLayout.LayoutParams(-1, -2));
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            android.widget.RelativeLayout relativeLayout4 = this.f116904d;
            if (relativeLayout4 != null) {
                relativeLayout4.setVisibility(8);
            } else {
                kotlin.jvm.internal.o.o("root");
                throw null;
            }
        }
    }
}
