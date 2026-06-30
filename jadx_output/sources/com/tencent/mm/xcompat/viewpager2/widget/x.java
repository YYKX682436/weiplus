package com.tencent.mm.xcompat.viewpager2.widget;

/* loaded from: classes3.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final int f214786d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.xcompat.recyclerview.widget.RecyclerView f214787e;

    public x(int i17, com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView) {
        this.f214786d = i17;
        this.f214787e = recyclerView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = this.f214787e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(this.f214786d));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/xcompat/viewpager2/widget/ViewPager2$SmoothScrollToPosition", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerView.e0(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/xcompat/viewpager2/widget/ViewPager2$SmoothScrollToPosition", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
