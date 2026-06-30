package j52;

/* loaded from: classes15.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static j52.c f297798e;

    /* renamed from: a, reason: collision with root package name */
    public j52.a f297799a;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f297801c;

    /* renamed from: b, reason: collision with root package name */
    public int f297800b = -1;

    /* renamed from: d, reason: collision with root package name */
    public final yj0.d f297802d = new j52.b(this);

    public c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(android.util.Pair.create("onPostOpen", "(Z)V"));
        arrayList.add(android.util.Pair.create("onPostClose", "()V"));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("com/tencent/mm/ui/widget/listview/PullDownListView$IPullDownCallback", arrayList);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        this.f297801c = hashMap2;
        hashMap2.put("com/tencent/mm/ui/MoreTabUI$", hashMap);
    }

    public static void a(j52.c cVar, java.lang.Object obj, boolean z17) {
        cVar.getClass();
        r45.a07 a07Var = new r45.a07();
        a07Var.f369601d = z17 ? "onStoryOpen" : "onStoryClose";
        a07Var.f369609o = java.lang.System.currentTimeMillis();
        a07Var.f369602e = a07Var.f369601d;
        androidx.fragment.app.Fragment e17 = i52.l.e("com.tencent.mm.ui.LauncherUI");
        a07Var.f369604g = e17 == null ? "MoreTabUI" : e17.getClass().getSimpleName();
        a07Var.f369608n = e17 == null ? -1 : e17.hashCode();
        java.lang.String str = a07Var.f369604g;
        a07Var.f369603f = str;
        if (obj != null) {
            str = obj.getClass().getName();
        }
        a07Var.f369605h = str;
        k52.g gVar = k52.g.f304294e;
        a07Var.f369606i = 10;
        a07Var.f369615u = 0;
        java.util.Map map = k52.l.f304310a;
        k52.l.f304314e.a(null, a07Var);
    }

    public static j52.c c() {
        if (f297798e == null) {
            synchronized (j52.c.class) {
                if (f297798e == null) {
                    f297798e = new j52.c();
                }
            }
        }
        return f297798e;
    }

    public void b(androidx.fragment.app.FragmentActivity fragmentActivity) {
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor, endHook");
        androidx.fragment.app.Fragment f17 = i52.l.f(fragmentActivity, "com.tencent.mm.ui.MoreTabUI");
        if (f17 == null) {
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor, curFragment == null");
            return;
        }
        java.lang.String canonicalName = f17.getClass().getCanonicalName();
        if (!"com.tencent.mm.ui.MoreTabUI".equals(canonicalName)) {
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor endHook FALSE: %s", canonicalName);
        } else {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor endHook real: %s", canonicalName);
            xj0.a.h().q(this.f297801c, this.f297802d);
        }
    }

    public final void d(int i17, long j17) {
        this.f297800b = i17;
        j52.a aVar = this.f297799a;
        if (aVar != null) {
            ((i52.j) aVar).getClass();
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FragmentMonitor", "mHijackCallback, event: %d", java.lang.Integer.valueOf(i17));
            d52.d.a().d(i17 == 0 ? 300 : i17 == 1 ? 301 : -1, java.lang.Long.valueOf(j17));
        }
    }

    public void e(androidx.fragment.app.FragmentActivity fragmentActivity, j52.a aVar) {
        if (!a52.a.b()) {
            com.tencent.mars.xlog.Log.w("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor, startHook, fetchHellhoundConfig: FALSE");
            return;
        }
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor startHook");
        androidx.fragment.app.Fragment f17 = i52.l.f(fragmentActivity, "com.tencent.mm.ui.MoreTabUI");
        if (f17 == null) {
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor startHook: curFragment == null");
            return;
        }
        java.lang.String canonicalName = f17.getClass().getCanonicalName();
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor startHook-2: %s", canonicalName);
        if (!"com.tencent.mm.ui.MoreTabUI".equals(canonicalName)) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor startHook Fail: %s", canonicalName);
            return;
        }
        this.f297799a = aVar;
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.StoryGalleryMonitor", "StoryGalleryMonitor startHook real: %s", canonicalName);
        xj0.a.h().n(this.f297801c, this.f297802d);
    }
}
