package p52;

/* loaded from: classes15.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f352043a;

    /* renamed from: b, reason: collision with root package name */
    public static final p52.b f352044b;

    /* renamed from: c, reason: collision with root package name */
    public static final r52.c f352045c;

    /* renamed from: d, reason: collision with root package name */
    public static final p52.m f352046d;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f352043a = hashMap;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(android.util.Pair.create("onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V"));
        arrayList.add(android.util.Pair.create("onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V"));
        hashMap.put("androidx/recyclerview/widget/RecyclerView$OnScrollListener", arrayList);
        f352044b = new p52.b();
        f352045c = new r52.c();
        f352046d = new p52.m();
    }

    public static final androidx.fragment.app.Fragment a() {
        java.lang.ref.WeakReference weakReference;
        p52.b bVar = f352044b;
        o52.e eVar = bVar.f351998e;
        androidx.fragment.app.Fragment fragment = (eVar == null || (weakReference = eVar.f343099a) == null) ? null : (androidx.fragment.app.Fragment) weakReference.get();
        if (fragment != null) {
            return fragment;
        }
        java.lang.ref.WeakReference weakReference2 = bVar.f351999f;
        return bVar.b(weakReference2 != null ? (com.tencent.mm.ui.component.UIComponentActivity) weakReference2.get() : null, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0129 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(android.app.Activity r20, long r21) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p52.k.b(android.app.Activity, long):void");
    }

    public static final void c(java.lang.String str) {
        p52.b bVar = f352044b;
        bVar.f351994a = str;
        if (kotlin.jvm.internal.o.b("com.tencent.mm.plugin.finder.ui.FinderHomeUI", str) || kotlin.jvm.internal.o.b("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI", str) || kotlin.jvm.internal.o.b("com.tencent.mm.plugin.finder.ui.FinderConversationUI", str)) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FinderFragmentCallback", "monitor...");
            bVar.f352002i = -1;
            bVar.f351996c = true;
            bVar.f351997d = false;
            synchronized (bVar.f352004k) {
                if (!bVar.f352003j) {
                    bVar.f352003j = true;
                    xj0.a.h().m(bVar.f352005l, bVar.f352006m);
                }
            }
        }
    }

    public static final void d(java.lang.String str) {
        p52.b bVar = f352044b;
        bVar.f351995b = str;
        if (kotlin.jvm.internal.o.b("com.tencent.mm.plugin.finder.ui.FinderHomeUI", str) || kotlin.jvm.internal.o.b("com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI", str) || kotlin.jvm.internal.o.b("com.tencent.mm.plugin.finder.ui.FinderConversationUI", str)) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FinderFragmentCallback", "unmonitor...");
            bVar.f351996c = false;
            bVar.f351997d = true;
            synchronized (bVar.f352004k) {
                xj0.a.h().p(bVar.f352005l, bVar.f352006m);
                bVar.f352003j = false;
            }
        }
    }
}
