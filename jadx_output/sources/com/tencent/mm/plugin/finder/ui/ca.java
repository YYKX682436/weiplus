package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class ca {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.ui.ca f128983a = new com.tencent.mm.plugin.finder.ui.ca();

    public final android.view.View a(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        android.view.View findViewById = activity.findViewById(com.tencent.mm.R.id.he8);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderManagementUIHelper", "hideInteractiveInfo", "(Landroid/app/Activity;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/ui/FinderManagementUIHelper", "hideInteractiveInfo", "(Landroid/app/Activity;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return findViewById;
    }
}
