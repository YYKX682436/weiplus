package pl2;

/* loaded from: classes3.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pl2.s f356643d;

    public p(pl2.s sVar) {
        this.f356643d = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pl2.s sVar = this.f356643d;
        com.tencent.mm.view.recyclerview.WxRecyclerView c17 = sVar.c();
        int i17 = sVar.f356657l;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$mount$3", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        c17.c1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c17, "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$mount$3", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
    }
}
