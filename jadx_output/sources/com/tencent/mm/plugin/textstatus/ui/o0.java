package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes.dex */
public final class o0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f174138d;

    public o0(android.view.View view) {
        this.f174138d = view;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        android.view.View view = this.f174138d;
        if (view == null) {
            return;
        }
        kotlin.jvm.internal.o.d(bool);
        int i17 = bool.booleanValue() ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView$2", "onChanged", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/textstatus/ui/MoreTabCardView$2", "onChanged", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
