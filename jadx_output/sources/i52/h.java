package i52;

/* loaded from: classes15.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final b52.d f288480a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Class f288481b;

    /* renamed from: c, reason: collision with root package name */
    public final i52.d f288482c;

    /* renamed from: d, reason: collision with root package name */
    public int f288483d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f288485f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f288487h;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f288486g = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final yj0.d f288484e = new i52.g(this);

    public h(b52.d dVar) {
        java.lang.Class<?> cls;
        this.f288480a = dVar;
        try {
            try {
                cls = java.lang.Class.forName("com.tencent.mm.ui.LauncherUI");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.FragmentLauncherUIMonitor", e17, "FragmentLauncherUIMonitor", new java.lang.Object[0]);
            }
        } catch (java.lang.ClassNotFoundException unused) {
            cls = null;
        }
        this.f288481b = cls;
        this.f288482c = new i52.d(dVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(android.util.Pair.create("onPageSelected", "(I)V"));
        arrayList.add(android.util.Pair.create("onPageScrollStateChanged", "(I)V"));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("androidx/viewpager/widget/ViewPager$OnPageChangeListener", arrayList);
        this.f288486g.put("com/tencent/mm/ui/MainTabUI$TabsAdapter", hashMap);
    }
}
