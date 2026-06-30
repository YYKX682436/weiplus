package oz1;

/* loaded from: classes13.dex */
public class d extends mz1.a implements ez1.a, gy1.c {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Map f350221h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Map f350222i = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: m, reason: collision with root package name */
    public static volatile oz1.d f350223m;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f350224d = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Boolean f350225e = java.lang.Boolean.TRUE;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f350226f = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f350227g = false;

    public static oz1.d c() {
        if (f350223m == null) {
            synchronized (oz1.d.class) {
                if (f350223m == null) {
                    f350223m = new oz1.d();
                }
            }
        }
        return f350223m;
    }

    public static java.lang.String e(java.lang.Object obj) {
        return obj == null ? "" : u46.l.c(obj.getClass().getSimpleName(), "MainUI") ? "tab_red_dot_0" : u46.l.c(obj.getClass().getSimpleName(), "MvvmAddressUIFragment") ? "tab_red_dot_1" : u46.l.c(obj.getClass().getSimpleName(), "FindMoreFriendsUI") ? "tab_red_dot_2" : u46.l.c(obj.getClass().getSimpleName(), "MoreTabUI") ? "tab_red_dot_3" : "";
    }

    @Override // gy1.c
    public void D2(androidx.fragment.app.Fragment fragment) {
        if (u46.l.e(e(fragment))) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Amoeba.NewUserBehaviourRD", "[onFragmentAppear] fragment : " + fragment);
        a(fragment);
        this.f350226f = new java.lang.ref.WeakReference(fragment);
    }

    @Override // ez1.a
    public void Na(long j17, boolean z17, android.app.Activity activity) {
        if (this.f350226f != null) {
            com.tencent.mars.xlog.Log.i("Amoeba.NewUserBehaviourRD", "[onAppIn] mLastFragment : " + this.f350226f.get());
            a((androidx.fragment.app.Fragment) this.f350226f.get());
        }
    }

    public final void a(androidx.fragment.app.Fragment fragment) {
        if (fragment == null) {
            return;
        }
        final java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(fragment);
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: oz1.d$$a
            @Override // java.lang.Runnable
            public final void run() {
                androidx.fragment.app.Fragment fragment2;
                oz1.d dVar = oz1.d.this;
                if (dVar.f350226f == null || (fragment2 = (androidx.fragment.app.Fragment) weakReference.get()) == null || fragment2 != dVar.f350226f.get()) {
                    return;
                }
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(fragment2, "tab_in_red_dot_start_time", 0);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(fragment2, "tab_out_red_dot_start_time", 0);
                long d17 = dVar.d(oz1.d.e(fragment2));
                if (d17 > 0) {
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(fragment2, "tab_in_red_dot_start_time", java.lang.Long.valueOf(d17));
                }
                java.util.Map bj6 = ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).bj(fragment2);
                if (bj6 != null) {
                    com.tencent.mars.xlog.Log.i("Amoeba.NewUserBehaviourRD", "[bindRedDotInfoWhenTabIn] fragment : " + fragment2.getClass().getSimpleName() + ", tab_in_red_dot_start_time : " + bj6.get("tab_in_red_dot_start_time"));
                    java.util.Objects.toString(bj6.get("tab_in_red_dot_start_time"));
                }
            }
        };
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f350224d;
        n3Var.postDelayed(runnable, 500L);
        if (this.f350225e.booleanValue()) {
            n3Var.postDelayed(runnable, 5000L);
            this.f350225e = java.lang.Boolean.FALSE;
        }
        if (this.f350227g) {
            n3Var.postDelayed(runnable, 3000L);
            this.f350227g = false;
        }
    }

    public final void b(androidx.fragment.app.Fragment fragment) {
        if (fragment == null) {
            return;
        }
        long d17 = d(e(fragment));
        if (d17 > 0) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(fragment, "tab_out_red_dot_start_time", java.lang.Long.valueOf(d17));
        }
        java.util.Map bj6 = ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).bj(fragment);
        if (bj6 != null) {
            com.tencent.mars.xlog.Log.i("Amoeba.NewUserBehaviourRD", "[bindRedDotInfoWhenTabOut] fragment : " + fragment.getClass().getSimpleName() + ", tab_in_red_dot_start_time : " + bj6.get("tab_in_red_dot_start_time") + ", tab_out_red_dot_start_time : " + bj6.get("tab_out_red_dot_start_time"));
            java.util.Objects.toString(bj6.get("tab_in_red_dot_start_time"));
            java.util.Objects.toString(bj6.get("tab_out_red_dot_start_time"));
        }
    }

    @Override // ez1.a
    public void b7(long j17, boolean z17, android.app.Activity activity) {
        if (this.f350226f != null) {
            com.tencent.mars.xlog.Log.i("Amoeba.NewUserBehaviourRD", "[onAppOut] mLastFragment : " + this.f350226f.get());
            b((androidx.fragment.app.Fragment) this.f350226f.get());
        }
    }

    public long d(java.lang.String str) {
        if (u46.l.e(str)) {
            return 0L;
        }
        java.lang.Long l17 = (java.lang.Long) ((java.util.concurrent.ConcurrentHashMap) f350221h).get(str);
        if (l17 == null) {
            l17 = (java.lang.Long) ((java.util.concurrent.ConcurrentHashMap) f350222i).get(str);
        }
        if (l17 != null) {
            return l17.longValue();
        }
        return 0L;
    }

    @Override // mz1.c
    public void onActivityResumed(android.app.Activity activity) {
        com.tencent.mars.xlog.Log.i("Amoeba.NewUserBehaviourRD", "[onActivityResumed] activity : " + activity);
        if (this.f350226f != null) {
            if (u46.l.c(activity.getClass().getSimpleName(), "LauncherUI")) {
                a((androidx.fragment.app.Fragment) this.f350226f.get());
            } else {
                b((androidx.fragment.app.Fragment) this.f350226f.get());
            }
        }
        if (u46.l.c(activity.getClass().getSimpleName(), "SnsMsgUIWithRelevance")) {
            this.f350227g = true;
        }
    }

    @Override // gy1.c
    public void w8(androidx.fragment.app.Fragment fragment) {
        if (u46.l.e(e(fragment))) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Amoeba.NewUserBehaviourRD", "[onFragmentDisappear] fragment : " + fragment);
        b(fragment);
        this.f350226f = null;
    }
}
