package com.tencent.mm.view.manager;

/* loaded from: classes3.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f213664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.manager.d f213665e;

    public k(com.tencent.mm.view.manager.d dVar, int i17) {
        this.f213665e = dVar;
        this.f213664d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f213665e.f213639o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(this.f213664d));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/view/manager/SmileyPanelManager$4", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/view/manager/SmileyPanelManager$4", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
