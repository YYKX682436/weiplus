package o52;

/* loaded from: classes15.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference f343099a;

    /* renamed from: b, reason: collision with root package name */
    public b52.d f343100b;

    /* renamed from: c, reason: collision with root package name */
    public q52.e f343101c;

    /* renamed from: d, reason: collision with root package name */
    public q52.e f343102d;

    /* renamed from: e, reason: collision with root package name */
    public q52.e f343103e;

    public final void a(androidx.fragment.app.FragmentActivity activity, androidx.fragment.app.Fragment fragment, long j17, int i17) {
        java.lang.String name = fragment.getClass().getName();
        java.lang.String g17 = b52.b.g(name);
        q52.e eVar = this.f343101c;
        boolean z17 = true;
        if (eVar != null) {
            if (eVar == null) {
                kotlin.jvm.internal.o.o("statyTimeStatic");
                throw null;
            }
            if (kotlin.jvm.internal.o.b(eVar.f360165b, g17)) {
                q52.e eVar2 = this.f343101c;
                if (eVar2 == null) {
                    kotlin.jvm.internal.o.o("statyTimeStatic");
                    throw null;
                }
                eVar2.f360168e = java.lang.System.currentTimeMillis();
                q52.e eVar3 = this.f343101c;
                if (eVar3 == null) {
                    kotlin.jvm.internal.o.o("statyTimeStatic");
                    throw null;
                }
                eVar3.f360166c = eVar3.f360168e - eVar3.f360167d;
                eVar3.f360169f = b52.b.d();
                q52.e eVar4 = this.f343101c;
                if (eVar4 == null) {
                    kotlin.jvm.internal.o.o("statyTimeStatic");
                    throw null;
                }
                eVar4.f360170g = "143";
                eVar4.f360177n = v52.c.g().f433311g;
                q52.e eVar5 = this.f343101c;
                if (eVar5 == null) {
                    kotlin.jvm.internal.o.o("statyTimeStatic");
                    throw null;
                }
                eVar5.f360179p = v52.c.g().f433312h;
                q52.c cVar = q52.d.f360163a;
                q52.e eVar6 = this.f343101c;
                if (eVar6 == null) {
                    kotlin.jvm.internal.o.o("statyTimeStatic");
                    throw null;
                }
                cVar.b(eVar6);
            }
        }
        if (d(name)) {
            java.util.HashMap hashMap = p52.k.f352043a;
            kotlin.jvm.internal.o.g(activity, "activity");
        } else {
            if (!kotlin.jvm.internal.o.b("com.tencent.mm.plugin.finder.ui.fragment.FinderLbsTabFragment", name) && !kotlin.jvm.internal.o.b("com.tencent.mm.plugin.finder.ui.fragment.FinderNativeDramaTabFragment", name)) {
                z17 = false;
            }
            if (z17) {
                java.util.HashMap hashMap2 = p52.k.f352043a;
            }
        }
        b52.d dVar = this.f343100b;
        if (dVar != null) {
            ((i52.k) dVar).b(activity, name, fragment.hashCode(), j17, true);
        }
    }

    public final void b(androidx.fragment.app.FragmentActivity activity, androidx.fragment.app.Fragment fragment, long j17, int i17) {
        this.f343099a = new java.lang.ref.WeakReference(fragment);
        java.lang.String name = fragment.getClass().getName();
        q52.e eVar = new q52.e(null, null, 0L, 0L, 0L, null, null, 0, false, null, null, null, false, 0, false, 0, 0, null, 262143, null);
        this.f343101c = eVar;
        eVar.f360164a = w52.g.wi().Ri();
        q52.e eVar2 = this.f343101c;
        if (eVar2 == null) {
            kotlin.jvm.internal.o.o("statyTimeStatic");
            throw null;
        }
        eVar2.f360165b = b52.b.g(name);
        q52.e eVar3 = this.f343101c;
        if (eVar3 == null) {
            kotlin.jvm.internal.o.o("statyTimeStatic");
            throw null;
        }
        eVar3.f360167d = java.lang.System.currentTimeMillis();
        q52.e eVar4 = this.f343101c;
        if (eVar4 == null) {
            kotlin.jvm.internal.o.o("statyTimeStatic");
            throw null;
        }
        eVar4.f360170g = "143";
        p52.d[] dVarArr = p52.d.f352007d;
        eVar4.f360171h = 0;
        q52.e eVar5 = this.f343102d;
        if (eVar5 != null) {
            if (eVar5 == null) {
                kotlin.jvm.internal.o.o("statyTimeStaticHome");
                throw null;
            }
            eVar5.f360173j = r30.m.f368946a;
        }
        if (d(name)) {
            java.util.HashMap hashMap = p52.k.f352043a;
            kotlin.jvm.internal.o.g(activity, "activity");
        } else {
            if (kotlin.jvm.internal.o.b("com.tencent.mm.plugin.finder.ui.fragment.FinderLbsTabFragment", name) || kotlin.jvm.internal.o.b("com.tencent.mm.plugin.finder.ui.fragment.FinderNativeDramaTabFragment", name)) {
                java.util.HashMap hashMap2 = p52.k.f352043a;
            }
        }
        b52.d dVar = this.f343100b;
        if (dVar != null) {
            ((i52.k) dVar).c(activity, fragment, name, fragment.hashCode(), j17, true);
        }
    }

    public final androidx.fragment.app.Fragment c(android.app.Activity activity) {
        androidx.fragment.app.Fragment a17 = p52.k.a();
        if (a17 != null) {
            return a17;
        }
        p52.b bVar = p52.k.f352044b;
        bVar.getClass();
        java.lang.String name = activity != null ? activity.getClass().getName() : null;
        if (name != null && (kotlin.jvm.internal.o.b(name, "com.tencent.mm.plugin.finder.ui.FinderHomeUI") || kotlin.jvm.internal.o.b(name, "com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI") || kotlin.jvm.internal.o.b(name, "com.tencent.mm.plugin.finder.ui.FinderConversationUI"))) {
            return bVar.b(null, -1);
        }
        return null;
    }

    public final boolean d(java.lang.String str) {
        return kotlin.jvm.internal.o.b("com.tencent.mm.plugin.finder.ui.fragment.FinderFollowTabFragment", str) || kotlin.jvm.internal.o.b("com.tencent.mm.plugin.finder.ui.fragment.FinderFriendTabFragment", str) || kotlin.jvm.internal.o.b("com.tencent.mm.plugin.finder.ui.fragment.FinderMachineTabFragment", str);
    }

    public final void e(androidx.fragment.app.FragmentActivity activity, long j17, boolean z17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.fragment.app.Fragment c17 = c(activity);
        if (c17 == null) {
            return;
        }
        if (z17) {
            b(activity, c17, j17, 0);
        } else {
            a(activity, c17, j17, 1);
        }
    }
}
