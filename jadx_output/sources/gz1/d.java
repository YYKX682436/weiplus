package gz1;

/* loaded from: classes13.dex */
public final class d extends gz1.e implements nz1.b {

    /* renamed from: d, reason: collision with root package name */
    public static final gz1.d f277714d = new gz1.d();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f277715e = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List f277716f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f277717g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f277718h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f277719i = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Map f277720m;

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f277721n;

    /* renamed from: o, reason: collision with root package name */
    public static final java.lang.String f277722o;

    /* renamed from: p, reason: collision with root package name */
    public static boolean f277723p;

    /* renamed from: q, reason: collision with root package name */
    public static java.lang.Boolean f277724q;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f277725r;

    /* renamed from: s, reason: collision with root package name */
    public static java.lang.Boolean f277726s;

    /* renamed from: t, reason: collision with root package name */
    public static final gz1.c f277727t;

    static {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        f277720m = linkedHashMap;
        f277721n = "doResume";
        f277722o = "doPause";
        f277725r = true;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new android.util.Pair("doResume", "()V"));
        arrayList.add(new android.util.Pair("doPause", "()V"));
        linkedHashMap.put("com/tencent/mm/ui/chatting/ChattingUIFragment", arrayList);
        f277727t = new gz1.c();
    }

    @Override // nz1.b
    public void F(androidx.fragment.app.Fragment fragment, boolean z17) {
        if (fragment != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f277717g;
            if (concurrentHashMap.containsKey(java.lang.Integer.valueOf(fragment.hashCode()))) {
                gz1.b bVar = (gz1.b) concurrentHashMap.get(java.lang.Integer.valueOf(fragment.hashCode()));
                if (bVar != null) {
                    bVar.f277703b = z17;
                }
            } else {
                concurrentHashMap.put(java.lang.Integer.valueOf(fragment.hashCode()), new gz1.b(new java.lang.ref.WeakReference(fragment), z17));
            }
            if (!fragment.isResumed() || h(fragment)) {
                return;
            }
            if (z17) {
                s(fragment);
                d(fragment);
            } else {
                b(fragment);
                p(fragment, false);
            }
        }
    }

    @Override // nz1.b
    public void L(androidx.fragment.app.Fragment fragment) {
        if (fragment != null) {
            java.lang.String simpleName = fragment.getClass().getSimpleName();
            if (fragment instanceof com.tencent.mm.ui.vas.VASCommonFragment) {
                com.tencent.mm.ui.vas.VASActivity vASActivity = ((com.tencent.mm.ui.vas.VASCommonFragment) fragment).f211121p;
                simpleName = java.lang.String.valueOf(vASActivity != null ? vASActivity.getClass().getSimpleName() : null);
            }
            com.tencent.mars.xlog.Log.i("Amoeba.FragmentEventMonitor", "[onFragmentDestroy] " + simpleName + ' ' + fragment.hashCode());
            int hashCode = fragment.hashCode();
            f277717g.remove(java.lang.Integer.valueOf(hashCode));
            ((java.util.ArrayList) f277716f).remove(java.lang.Integer.valueOf(hashCode));
            o(fragment, gz1.a.f277700h, true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if ((r0 != null && r0.f277710i) != false) goto L20;
     */
    @Override // nz1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void N(androidx.fragment.app.Fragment r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L46
            boolean r0 = r4.h(r5)
            if (r0 != 0) goto L46
            boolean r0 = r4.l(r5)
            if (r0 == 0) goto L46
            boolean r0 = r5 instanceof com.tencent.mm.ui.vas.VASCommonFragment
            r1 = 1
            if (r0 == 0) goto L41
            java.util.concurrent.ConcurrentHashMap r0 = gz1.d.f277718h
            int r2 = r5.hashCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r0 = r0.containsKey(r2)
            r2 = 0
            if (r0 != 0) goto L40
            java.util.concurrent.ConcurrentHashMap r0 = gz1.d.f277717g
            int r3 = r5.hashCode()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.get(r3)
            gz1.b r0 = (gz1.b) r0
            if (r0 == 0) goto L3c
            boolean r0 = r0.f277710i
            if (r0 != r1) goto L3c
            r0 = r1
            goto L3d
        L3c:
            r0 = r2
        L3d:
            if (r0 == 0) goto L40
            goto L41
        L40:
            r1 = r2
        L41:
            if (r1 == 0) goto L46
            r4.s(r5)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gz1.d.N(androidx.fragment.app.Fragment):void");
    }

    @Override // gz1.e
    public void a(android.app.Activity activity) {
        gz1.b bVar;
        kotlin.jvm.internal.o.g(activity, "activity");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f277718h;
        if (!concurrentHashMap.containsKey(java.lang.Integer.valueOf(activity.hashCode())) || (bVar = (gz1.b) f277717g.get(concurrentHashMap.get(java.lang.Integer.valueOf(activity.hashCode())))) == null) {
            return;
        }
        bVar.f277710i = true;
        androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) bVar.f277702a.get();
        if (fragment != null) {
            gz1.d dVar = f277714d;
            if (dVar.l(fragment)) {
                dVar.s(fragment);
            }
        }
    }

    public final void b(androidx.fragment.app.Fragment fragment) {
        for (androidx.fragment.app.Fragment fragment2 : g(fragment)) {
            gz1.d dVar = f277714d;
            if (!dVar.l(fragment2)) {
                dVar.p(fragment2, false);
            }
        }
    }

    @Override // nz1.b
    public void c(androidx.fragment.app.Fragment fragment) {
        if (fragment == null || h(fragment)) {
            return;
        }
        p(fragment, false);
    }

    public final void d(androidx.fragment.app.Fragment fragment) {
        for (androidx.fragment.app.Fragment fragment2 : g(fragment)) {
            gz1.d dVar = f277714d;
            if (dVar.l(fragment2)) {
                dVar.s(fragment2);
            }
        }
    }

    public final void e(androidx.fragment.app.Fragment fragment, boolean z17) {
        com.tencent.mm.ui.vas.VASActivity vASActivity;
        com.tencent.mm.autogen.events.FragmentLifecycleEvent fragmentLifecycleEvent = new com.tencent.mm.autogen.events.FragmentLifecycleEvent();
        am.ee eeVar = fragmentLifecycleEvent.f54351g;
        eeVar.f6553a = fragment;
        eeVar.getClass();
        fragmentLifecycleEvent.e();
        if (!z17) {
            com.tencent.mm.autogen.events.OnFragmentPauseEvent onFragmentPauseEvent = new com.tencent.mm.autogen.events.OnFragmentPauseEvent();
            am.vm vmVar = onFragmentPauseEvent.f54576g;
            vmVar.f8202a = fragment;
            vmVar.f8203b = java.lang.System.currentTimeMillis();
            onFragmentPauseEvent.e();
            return;
        }
        com.tencent.mm.autogen.events.OnFragmentResumeEvent onFragmentResumeEvent = new com.tencent.mm.autogen.events.OnFragmentResumeEvent();
        am.wm wmVar = onFragmentResumeEvent.f54577g;
        wmVar.f8301a = fragment;
        if ((fragment instanceof com.tencent.mm.ui.vas.VASCommonFragment) && (vASActivity = ((com.tencent.mm.ui.vas.VASCommonFragment) fragment).f211121p) != null) {
            wmVar.f8302b = vASActivity.getClass().getName();
            wmVar.f8303c = vASActivity.getClass().getSimpleName();
            wmVar.f8304d = !lk5.s.b(vASActivity);
        }
        wmVar.f8305e = java.lang.System.currentTimeMillis();
        onFragmentResumeEvent.e();
    }

    public final boolean f(androidx.fragment.app.Fragment fragment) {
        gz1.b bVar = (gz1.b) f277717g.get(java.lang.Integer.valueOf(fragment.hashCode()));
        return bVar != null && bVar.f277703b && !bVar.f277704c && bVar.f277713l;
    }

    public final java.util.List g(androidx.fragment.app.Fragment fragment) {
        kz5.p0 p0Var = kz5.p0.f313996d;
        try {
            if (!fragment.isAdded()) {
                return p0Var;
            }
            java.util.List<androidx.fragment.app.Fragment> fragments = fragment.getChildFragmentManager().getFragments();
            kotlin.jvm.internal.o.f(fragments, "getFragments(...)");
            return fragments;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Amoeba.FragmentEventMonitor", "getChildFragmentErr " + e17);
            return p0Var;
        }
    }

    public final boolean h(androidx.fragment.app.Fragment fragment) {
        return kotlin.jvm.internal.o.b("ChattingUIFragment", fragment.getClass().getSimpleName());
    }

    @Override // nz1.b
    public void i(androidx.fragment.app.Fragment fragment, boolean z17) {
        if (fragment == null || h(fragment)) {
            return;
        }
        u(fragment, z17);
        if (!fragment.isResumed() || h(fragment)) {
            return;
        }
        if (z17) {
            b(fragment);
            p(fragment, false);
        } else {
            s(fragment);
            d(fragment);
        }
    }

    @Override // nz1.b
    public void j(androidx.fragment.app.Fragment fragment) {
        com.tencent.mm.ui.vas.VASActivity vASActivity;
        if (fragment == null || h(fragment)) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f277717g;
        java.lang.Object obj = concurrentHashMap.get(java.lang.Integer.valueOf(fragment.hashCode()));
        if (obj == null) {
            obj = new gz1.b(new java.lang.ref.WeakReference(fragment), true);
            concurrentHashMap.put(java.lang.Integer.valueOf(fragment.hashCode()), obj);
        }
        if ((fragment instanceof com.tencent.mm.ui.vas.VASCommonFragment) && (vASActivity = ((com.tencent.mm.ui.vas.VASCommonFragment) fragment).f211121p) != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = f277718h;
            if (!concurrentHashMap2.containsKey(java.lang.Integer.valueOf(vASActivity.hashCode()))) {
                concurrentHashMap2.put(java.lang.Integer.valueOf(vASActivity.hashCode()), java.lang.Integer.valueOf(fragment.hashCode()));
            }
            ((gz1.b) obj).f277709h = !lk5.s.b(vASActivity);
        }
        o(fragment, gz1.a.f277696d, true);
    }

    public final boolean k(androidx.fragment.app.Fragment fragment) {
        androidx.fragment.app.FragmentActivity activity = fragment.getActivity();
        if (!((activity != null && (activity instanceof com.tencent.mm.ui.vas.launcher.VASLauncher)) ? ((com.tencent.mm.ui.vas.launcher.VASLauncher) activity).f211147e : false) || (fragment instanceof com.tencent.mm.ui.vas.VASCommonFragment)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("Amoeba.FragmentEventMonitor", "isFilterFragment fragment {" + fragment + '}');
        return true;
    }

    public final boolean l(androidx.fragment.app.Fragment fragment) {
        androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment();
        return parentFragment != null ? f(parentFragment) && !parentFragment.isHidden() && parentFragment.isResumed() && f(fragment) && !fragment.isHidden() && fragment.isResumed() : f(fragment) && !fragment.isHidden() && fragment.isResumed();
    }

    @Override // nz1.b
    public void m(androidx.fragment.app.Fragment fragment) {
        if (fragment != null) {
            o(fragment, gz1.a.f277699g, true);
        }
    }

    public final void n(androidx.fragment.app.Fragment fragment, boolean z17) {
        androidx.fragment.app.Fragment fragment2;
        java.util.ArrayList arrayList = (java.util.ArrayList) f277716f;
        java.util.Iterator it = arrayList.iterator();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            if (intValue != fragment.hashCode()) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = f277717g;
                gz1.b bVar = (gz1.b) concurrentHashMap.get(java.lang.Integer.valueOf(intValue));
                if (bVar != null && bVar.f277705d && (fragment2 = (androidx.fragment.app.Fragment) bVar.f277702a.get()) != null) {
                    gz1.d dVar = f277714d;
                    if (dVar.l(fragment2)) {
                        java.util.ArrayList arrayList3 = (java.util.ArrayList) bVar.f277711j;
                        if (arrayList3.contains(java.lang.Integer.valueOf(fragment.hashCode())) && z17) {
                            arrayList3.remove(java.lang.Integer.valueOf(fragment.hashCode()));
                            if (arrayList3.isEmpty()) {
                                gz1.b bVar2 = (gz1.b) concurrentHashMap.get(java.lang.Integer.valueOf(fragment.hashCode()));
                                if (bVar2 != null && bVar2.f277708g) {
                                    com.tencent.mm.autogen.events.FixVasLogicEvent fixVasLogicEvent = new com.tencent.mm.autogen.events.FixVasLogicEvent();
                                    am.vd vdVar = fixVasLogicEvent.f54342g;
                                    vdVar.f8191a = fragment;
                                    vdVar.f8192b = true;
                                    fixVasLogicEvent.e();
                                }
                                bVar.f277705d = false;
                                arrayList2.add(java.lang.Integer.valueOf(intValue));
                                dVar.r(fragment2, true);
                            }
                        }
                    }
                }
            }
        }
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            arrayList.remove(java.lang.Integer.valueOf(((java.lang.Number) it6.next()).intValue()));
        }
    }

    public final void o(androidx.fragment.app.Fragment fragment, gz1.a aVar, boolean z17) {
        com.tencent.mm.ui.vas.VASActivity vASActivity;
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            com.tencent.mm.autogen.events.OnFragmentCreateEvent onFragmentCreateEvent = new com.tencent.mm.autogen.events.OnFragmentCreateEvent();
            am.tm tmVar = onFragmentCreateEvent.f54574g;
            tmVar.f8019a = fragment;
            if ((fragment instanceof com.tencent.mm.ui.vas.VASCommonFragment) && (vASActivity = ((com.tencent.mm.ui.vas.VASCommonFragment) fragment).f211121p) != null) {
                tmVar.f8020b = vASActivity.getClass().getName();
                tmVar.f8021c = vASActivity.getClass().getSimpleName();
                tmVar.f8022d = !lk5.s.b(vASActivity);
            }
            tmVar.f8023e = java.lang.System.currentTimeMillis();
            onFragmentCreateEvent.e();
            return;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = f277715e;
        if (ordinal == 1) {
            java.util.Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                ((gy1.c) it.next()).D2(fragment);
            }
            e(fragment, true);
            return;
        }
        if (ordinal == 2) {
            java.util.Iterator it6 = copyOnWriteArrayList.iterator();
            while (it6.hasNext()) {
                ((gy1.c) it6.next()).w8(fragment);
            }
            e(fragment, false);
            return;
        }
        if (ordinal != 3) {
            if (ordinal != 4) {
                return;
            }
            java.util.Iterator it7 = copyOnWriteArrayList.iterator();
            while (it7.hasNext()) {
            }
            return;
        }
        java.util.Iterator it8 = copyOnWriteArrayList.iterator();
        while (it8.hasNext()) {
        }
        com.tencent.mm.autogen.events.OnFragmentDestroyEvent onFragmentDestroyEvent = new com.tencent.mm.autogen.events.OnFragmentDestroyEvent();
        am.um umVar = onFragmentDestroyEvent.f54575g;
        umVar.f8106a = fragment;
        umVar.f8107b = java.lang.System.currentTimeMillis();
        onFragmentDestroyEvent.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0088 A[Catch: Exception -> 0x0104, TryCatch #0 {Exception -> 0x0104, blocks: (B:3:0x0004, B:5:0x0016, B:7:0x001a, B:10:0x0023, B:12:0x0029, B:14:0x0033, B:16:0x0037, B:18:0x003f, B:19:0x0042, B:21:0x004f, B:23:0x0056, B:25:0x0060, B:27:0x0064, B:28:0x0066, B:30:0x0070, B:33:0x007d, B:37:0x0088, B:39:0x008e, B:40:0x00a4, B:42:0x00a8, B:44:0x00ac, B:45:0x00bc, B:47:0x00c0, B:49:0x00d6, B:51:0x00de, B:53:0x00ee, B:56:0x00f3, B:61:0x0100, B:65:0x00fe), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fe A[Catch: Exception -> 0x0104, TryCatch #0 {Exception -> 0x0104, blocks: (B:3:0x0004, B:5:0x0016, B:7:0x001a, B:10:0x0023, B:12:0x0029, B:14:0x0033, B:16:0x0037, B:18:0x003f, B:19:0x0042, B:21:0x004f, B:23:0x0056, B:25:0x0060, B:27:0x0064, B:28:0x0066, B:30:0x0070, B:33:0x007d, B:37:0x0088, B:39:0x008e, B:40:0x00a4, B:42:0x00a8, B:44:0x00ac, B:45:0x00bc, B:47:0x00c0, B:49:0x00d6, B:51:0x00de, B:53:0x00ee, B:56:0x00f3, B:61:0x0100, B:65:0x00fe), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(androidx.fragment.app.Fragment r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gz1.d.p(androidx.fragment.app.Fragment, boolean):void");
    }

    public final void q(androidx.fragment.app.Fragment fragment, boolean z17) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
        if (f277723p) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f277717g;
            gz1.b bVar = (gz1.b) concurrentHashMap.get(java.lang.Integer.valueOf(fragment.hashCode()));
            if (bVar == null) {
                bVar = new gz1.b(new java.lang.ref.WeakReference(fragment), true);
                concurrentHashMap.put(java.lang.Integer.valueOf(fragment.hashCode()), bVar);
            }
            bVar.f277713l = false;
            u(fragment, true);
            b(fragment);
            p(fragment, z17);
        }
    }

    public final void r(androidx.fragment.app.Fragment fragment, boolean z17) {
        java.lang.Integer num;
        gz1.b bVar;
        java.lang.ref.WeakReference weakReference;
        androidx.fragment.app.Fragment fragment2;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f277717g;
        gz1.b bVar2 = (gz1.b) concurrentHashMap.get(java.lang.Integer.valueOf(fragment.hashCode()));
        if (bVar2 != null) {
            java.util.List list = f277716f;
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = f277719i;
            gz1.d dVar = f277714d;
            if (z17 && bVar2.f277709h && !copyOnWriteArrayList.isEmpty()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (androidx.fragment.app.Fragment parentFragment = fragment.getParentFragment(); parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
                    arrayList.add(parentFragment);
                }
                java.util.List g17 = dVar.g(fragment);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = copyOnWriteArrayList.iterator();
                kotlin.jvm.internal.o.f(it, "iterator(...)");
                while (it.hasNext()) {
                    java.lang.Integer num2 = (java.lang.Integer) it.next();
                    gz1.b bVar3 = (gz1.b) concurrentHashMap.get(num2);
                    if (bVar3 != null && (weakReference = bVar3.f277702a) != null && (fragment2 = (androidx.fragment.app.Fragment) weakReference.get()) != null && (bVar3.f277706e || bVar3.f277707f)) {
                        int hashCode = fragment.hashCode();
                        if (num2 == null || num2.intValue() != hashCode) {
                            if (!g17.contains(fragment2) && dVar.l(fragment2) && (!arrayList.contains(fragment2) || ((fragment instanceof com.tencent.mm.ui.vas.VASCommonFragment) && (fragment2 instanceof com.tencent.mm.ui.vas.VASCommonFragment)))) {
                                bVar3.f277705d = true;
                                java.util.ArrayList arrayList3 = (java.util.ArrayList) bVar3.f277711j;
                                if (!arrayList3.contains(java.lang.Integer.valueOf(fragment.hashCode()))) {
                                    arrayList3.add(java.lang.Integer.valueOf(fragment.hashCode()));
                                }
                                java.util.ArrayList arrayList4 = (java.util.ArrayList) list;
                                if (!arrayList4.contains(java.lang.Integer.valueOf(fragment2.hashCode()))) {
                                    arrayList4.add(java.lang.Integer.valueOf(fragment2.hashCode()));
                                }
                                if (!bVar3.f277707f || bVar3.f277706e) {
                                    arrayList2.add(fragment2);
                                } else {
                                    bVar3.f277707f = false;
                                    it.remove();
                                }
                            }
                        }
                    }
                }
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    dVar.p((androidx.fragment.app.Fragment) it6.next(), false);
                }
                arrayList2.clear();
            }
            if (bVar2.f277705d && ((java.util.ArrayList) bVar2.f277711j).isEmpty()) {
                bVar2.f277705d = false;
                ((java.util.ArrayList) list).remove(java.lang.Integer.valueOf(fragment.hashCode()));
            }
            if (bVar2.f277706e || bVar2.f277705d) {
                return;
            }
            java.lang.String simpleName = fragment.getClass().getSimpleName();
            if (fragment instanceof com.tencent.mm.ui.vas.VASCommonFragment) {
                com.tencent.mm.ui.vas.VASActivity vASActivity = ((com.tencent.mm.ui.vas.VASCommonFragment) fragment).f211121p;
                simpleName = vASActivity != null ? vASActivity.getClass().getSimpleName() : null;
            }
            if (!dVar.k(fragment)) {
                com.tencent.mars.xlog.Log.i("Amoeba.FragmentEventMonitor", "[onResume] " + simpleName);
                dVar.o(fragment, gz1.a.f277697e, bVar2.f277709h);
                bVar2.f277706e = true;
                bVar2.f277713l = true;
            }
            if (copyOnWriteArrayList.contains(java.lang.Integer.valueOf(fragment.hashCode())) || copyOnWriteArrayList.size() < 0) {
                return;
            }
            if ((!copyOnWriteArrayList.isEmpty()) && (num = (java.lang.Integer) copyOnWriteArrayList.get(0)) != null && (bVar = (gz1.b) concurrentHashMap.get(java.lang.Integer.valueOf(num.intValue()))) != null) {
                bVar.f277712k = java.lang.Integer.valueOf(fragment.hashCode());
            }
            copyOnWriteArrayList.add(0, java.lang.Integer.valueOf(fragment.hashCode()));
        }
    }

    public final void s(androidx.fragment.app.Fragment fragment) {
        r(fragment, false);
    }

    public final void t(gy1.c listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = f277715e;
        if (copyOnWriteArrayList.contains(listener)) {
            return;
        }
        copyOnWriteArrayList.add(listener);
    }

    public final void u(androidx.fragment.app.Fragment fragment, boolean z17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f277717g;
        gz1.b bVar = (gz1.b) concurrentHashMap.get(java.lang.Integer.valueOf(fragment.hashCode()));
        if (bVar != null) {
            bVar.f277704c = z17;
        }
        java.util.Iterator it = g(fragment).iterator();
        while (it.hasNext()) {
            gz1.b bVar2 = (gz1.b) concurrentHashMap.get(java.lang.Integer.valueOf(((androidx.fragment.app.Fragment) it.next()).hashCode()));
            if (bVar2 != null) {
                bVar2.f277704c = z17;
            }
        }
    }
}
