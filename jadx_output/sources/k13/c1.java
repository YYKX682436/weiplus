package k13;

/* loaded from: classes3.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k13.l1 f303199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f303200e;

    public c1(k13.l1 l1Var, int i17) {
        this.f303199d = l1Var;
        this.f303200e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f303199d.f303236n;
        if (recyclerView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(this.f303200e));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/forcenotify/ui/MsgWindow$smoothScrollTo$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/forcenotify/ui/MsgWindow$smoothScrollTo$1", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }
}
