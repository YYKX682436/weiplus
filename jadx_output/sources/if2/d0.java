package if2;

/* loaded from: classes3.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f291105a;

    /* renamed from: b, reason: collision with root package name */
    public final if2.m0 f291106b;

    /* renamed from: c, reason: collision with root package name */
    public int f291107c;

    /* renamed from: d, reason: collision with root package name */
    public int f291108d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f291109e;

    public d0(android.view.View view, if2.m0 checkVisibleCallback) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(checkVisibleCallback, "checkVisibleCallback");
        this.f291105a = view;
        this.f291106b = checkVisibleCallback;
        this.f291107c = view.getVisibility();
    }

    public void a(int i17) {
        this.f291107c = i17;
        android.view.View view = this.f291105a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "forceVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "forceVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f291105a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "forceVisible", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "forceVisible", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public void b(int i17) {
        int i18 = this.f291108d;
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        int i19 = (~i17) & i18;
        this.f291108d = i19;
        if (this.f291109e && i19 == 0) {
            android.view.View view = this.f291105a;
            int i27 = this.f291107c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i27));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "removeBarrier", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "removeBarrier", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f291109e = false;
        }
    }

    public void c(int i17, int i18) {
        int i19 = this.f291108d;
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        this.f291108d = i18 | i19;
        android.view.View view = this.f291105a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "setBarrier", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "setBarrier", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f291109e = true;
    }

    public void d(int i17) {
        this.f291107c = i17;
        if (!this.f291106b.k()) {
            android.view.View view = this.f291105a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (this.f291109e) {
            return;
        }
        android.view.View view2 = this.f291105a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
