package p52;

/* loaded from: classes15.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f351994a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f351995b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f351996c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f351997d;

    /* renamed from: e, reason: collision with root package name */
    public final o52.e f351998e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f351999f;
    private java.lang.reflect.Field field_activity;
    private java.lang.reflect.Field field_fragments;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f352000g;

    /* renamed from: i, reason: collision with root package name */
    public int f352002i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f352003j;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.HashMap f352005l;

    /* renamed from: m, reason: collision with root package name */
    public final p52.a f352006m;

    /* renamed from: h, reason: collision with root package name */
    public int f352001h = -1;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.Object f352004k = new java.lang.Object();

    public b() {
        this.f351997d = true;
        this.f352002i = -1;
        java.util.HashMap hashMap = new java.util.HashMap();
        this.f352005l = hashMap;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new android.util.Pair("onUserVisibleFragmentChange", "(ZILcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;)V"));
        arrayList.add(new android.util.Pair("onFragmentChange", "(IIII)V"));
        hashMap.put("com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$fragmentChangeObserver$", new android.util.Pair("com/tencent/mm/plugin/finder/view/FinderFragmentChangeObserver", arrayList));
        try {
            java.lang.reflect.Field declaredField = com.tencent.mm.plugin.finder.view.FinderFragmentChangeObserver.class.getDeclaredField(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            this.field_activity = declaredField;
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
            java.lang.reflect.Field declaredField2 = com.tencent.mm.plugin.finder.view.FinderFragmentChangeObserver.class.getDeclaredField("fragments");
            this.field_fragments = declaredField2;
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.FinderFragmentCallback", e17, "FinderFragmentCallback reflect crash: " + e17.getMessage(), new java.lang.Object[0]);
        }
        this.f352002i = -1;
        this.f351994a = null;
        this.f351995b = null;
        this.f351996c = false;
        this.f351997d = true;
        this.f351998e = new o52.e();
        this.f352006m = new p52.a(this);
    }

    public static final com.tencent.mm.ui.component.UIComponentActivity a(p52.b bVar, java.lang.Object obj) {
        bVar.getClass();
        try {
            java.lang.reflect.Field field = bVar.field_activity;
            java.lang.Object obj2 = field != null ? field.get(obj) : null;
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.ui.component.UIComponentActivity");
            return (com.tencent.mm.ui.component.UIComponentActivity) obj2;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final com.tencent.mm.ui.component.UIComponentFragment b(java.lang.Object obj, int i17) {
        if (obj != null && i17 >= 0) {
            try {
                return c(obj, i17);
            } catch (java.lang.Exception unused) {
                java.lang.ref.WeakReference weakReference = this.f352000g;
                return weakReference != null ? (com.tencent.mm.ui.component.UIComponentFragment) weakReference.get() : null;
            }
        }
        java.lang.ref.WeakReference weakReference2 = this.f352000g;
        if (weakReference2 != null) {
            return (com.tencent.mm.ui.component.UIComponentFragment) weakReference2.get();
        }
        return null;
    }

    public final com.tencent.mm.ui.component.UIComponentFragment c(java.lang.Object obj, int i17) {
        if (i17 < 0) {
            return null;
        }
        try {
            java.lang.reflect.Field field = this.field_fragments;
            java.lang.Object obj2 = field != null ? field.get(obj) : null;
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
            java.lang.Object obj3 = ((java.util.List) obj2).get(i17);
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type com.tencent.mm.ui.component.UIComponentFragment");
            return (com.tencent.mm.ui.component.UIComponentFragment) obj3;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.FinderFragmentCallback", e17, "getFragment exception: " + e17.getMessage(), new java.lang.Object[0]);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
    
        if (kotlin.jvm.internal.o.b(r3.f360165b, r5) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(androidx.fragment.app.FragmentActivity r9, long r10) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p52.b.d(androidx.fragment.app.FragmentActivity, long):void");
    }

    public final void e(androidx.fragment.app.FragmentActivity activity, long j17) {
        androidx.fragment.app.Fragment c17;
        java.lang.String str;
        kotlin.jvm.internal.o.g(activity, "activity");
        o52.e eVar = this.f351998e;
        if (eVar != null) {
            q52.e eVar2 = new q52.e(null, null, 0L, 0L, 0L, null, null, 0, false, null, null, null, false, 0, false, 0, 0, null, 262143, null);
            eVar.f343102d = eVar2;
            eVar2.f360164a = w52.g.wi().Ri();
            q52.e eVar3 = eVar.f343102d;
            if (eVar3 == null) {
                kotlin.jvm.internal.o.o("statyTimeStaticHome");
                throw null;
            }
            eVar3.f360165b = b52.b.g(activity.getClass().getName());
            q52.e eVar4 = eVar.f343102d;
            if (eVar4 == null) {
                kotlin.jvm.internal.o.o("statyTimeStaticHome");
                throw null;
            }
            eVar4.f360167d = j17;
            eVar4.f360170g = "143";
            p52.d[] dVarArr = p52.d.f352007d;
            eVar4.f360171h = 0;
            android.content.Intent intent = activity.getIntent();
            if (intent == null || (str = intent.getStringExtra("key_extra_info")) == null) {
                str = "";
            }
            eVar4.f360173j = str;
            q52.e eVar5 = eVar.f343102d;
            if (eVar5 == null) {
                kotlin.jvm.internal.o.o("statyTimeStaticHome");
                throw null;
            }
            java.lang.String str2 = eVar5.f360173j;
            r30.m.f368946a = str2 != null ? str2 : "";
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FinderHomeMonitor", "onFinderHomeUIResume...");
        }
        if (this.f351995b != null && !kotlin.jvm.internal.o.b(activity.getClass().getName(), this.f351995b) && !this.f351996c) {
            this.f351996c = false;
            this.f351995b = null;
            this.f351994a = null;
            if (eVar != null) {
                eVar.e(activity, j17, true);
                return;
            }
            return;
        }
        if (this.f351996c) {
            this.f351996c = false;
            this.f351995b = null;
            this.f351994a = null;
        } else {
            if (eVar == null || (c17 = eVar.c(activity)) == null) {
                return;
            }
            eVar.b(activity, c17, j17, 2);
        }
    }
}
