package vp1;

/* loaded from: classes15.dex */
public final class i extends vp1.d {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f438890b;

    /* renamed from: c, reason: collision with root package name */
    public static int f438891c;

    /* renamed from: d, reason: collision with root package name */
    public static int f438892d;

    /* renamed from: e, reason: collision with root package name */
    public static int f438893e;

    /* renamed from: a, reason: collision with root package name */
    public static final vp1.i f438889a = new vp1.i();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f438894f = new java.util.LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f438895g = new java.util.LinkedHashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final wp1.b f438896h = new wp1.b();

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f438897i = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    public static final jz5.g f438898j = jz5.h.b(vp1.h.f438888d);

    /* renamed from: k, reason: collision with root package name */
    public static final jz5.g f438899k = jz5.h.b(vp1.g.f438887d);

    public static final void H(vp1.i iVar, r45.f83 f83Var, android.content.Intent intent) {
        iVar.getClass();
        r45.f83 V = iVar.V(f83Var.f374089h);
        if (V == null) {
            vp1.e[] eVarArr = vp1.e.f438885d;
            f83Var.f374097s = 2;
            f438894f.put(java.lang.Integer.valueOf(f83Var.f374089h), f83Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleMonitor", "addActivityRecord  " + f83Var.f374086e + ' ' + f83Var.f374089h);
            V = f83Var;
        }
        iVar.Y("on_create", f83Var);
        wp1.b bVar = f438896h;
        bVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMSg.ActivityStackService", "onCreate " + V.f374090i + ' ' + V.f374085d + ' ' + V.f374089h);
        java.util.Map map = bVar.f448379a;
        if (!map.containsKey(java.lang.Integer.valueOf(V.f374090i))) {
            int i17 = V.f374090i;
            java.lang.String activityName = V.f374085d;
            kotlin.jvm.internal.o.f(activityName, "activityName");
            if (!map.containsKey(java.lang.Integer.valueOf(i17))) {
                com.tencent.mars.xlog.Log.i("MicroMSg.ActivityStackService", "add taskAffinity [" + i17 + "] ");
                map.put(java.lang.Integer.valueOf(i17), new wp1.a(i17, activityName));
                bVar.f448381c = kotlin.jvm.internal.o.b(activityName, bVar.f448382d);
            }
        }
        bVar.f448382d = null;
        wp1.a aVar = (wp1.a) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(V.f374090i));
        if (aVar != null) {
            long j17 = V.f374092n;
            int i18 = V.f374088g;
            if (i18 != 0) {
                java.util.Stack stack = aVar.f448378b;
                boolean z17 = true;
                if (i18 == 1) {
                    java.util.Iterator it = stack.iterator();
                    kotlin.jvm.internal.o.f(it, "iterator(...)");
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        r45.f83 f83Var2 = (r45.f83) it.next();
                        if (kotlin.jvm.internal.o.b(f83Var2.f374085d, V.f374085d)) {
                            while (!kotlin.jvm.internal.o.b(aVar.a(), f83Var2)) {
                                aVar.b(j17, intent);
                            }
                            z17 = false;
                        }
                    }
                    if (z17) {
                        aVar.c(V, j17, intent);
                    }
                } else if (i18 == 2) {
                    if (!stack.isEmpty()) {
                        r45.f83 a17 = aVar.a();
                        if (kotlin.jvm.internal.o.b(a17 != null ? a17.f374085d : null, V.f374085d)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ActivityStackManager", "top is target activity");
                        }
                    }
                    aVar.c(V, j17, intent);
                } else if (i18 == 3) {
                    while (!stack.isEmpty()) {
                        aVar.b(j17, intent);
                    }
                    aVar.c(V, j17, intent);
                }
            } else {
                aVar.c(V, j17, intent);
            }
        }
        java.util.Iterator it6 = f438897i.iterator();
        while (it6.hasNext()) {
            ((up1.a) it6.next()).o(V, intent, f83Var.f374092n);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleMonitor", "onActivityCreate [" + V.f374086e + "] " + V.f374090i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a9, code lost:
    
        if (r0.f448378b.isEmpty() == true) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void I(vp1.i r11, r45.f83 r12, android.content.Intent r13) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vp1.i.I(vp1.i, r45.f83, android.content.Intent):void");
    }

    public static final void J(vp1.i iVar, r45.f83 f83Var, android.content.Intent intent) {
        iVar.Y("on_pause", f83Var);
        r45.f83 V = iVar.V(f83Var.f374089h);
        if (V != null) {
            java.util.LinkedList linkedList = V.f374094p;
            java.util.ListIterator listIterator = linkedList.listIterator(linkedList.size());
            kotlin.jvm.internal.o.f(listIterator, "listIterator(...)");
            while (listIterator.hasPrevious()) {
                r45.g83 g83Var = (r45.g83) listIterator.previous();
                g83Var.f374986n = f83Var.f374092n;
                f438889a.U(V, g83Var, intent);
                listIterator.remove();
            }
            java.util.Iterator it = f438897i.iterator();
            while (it.hasNext()) {
                ((up1.a) it.next()).e(V, intent, f83Var.f374092n);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleMonitor", "onActivityPause [" + V.f374086e + "] " + V.f374090i + ' ' + f83Var.f374092n);
        }
    }

    public static final void K(vp1.i iVar, r45.f83 f83Var, android.content.Intent intent) {
        iVar.Y("on_resume", f83Var);
        long j17 = f83Var.f374092n;
        wp1.b bVar = f438896h;
        bVar.getClass();
        int i17 = bVar.f448380b;
        int i18 = f83Var.f374090i;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = f438897i;
        if (i17 != i18) {
            com.tencent.mars.xlog.Log.i("MicroMSg.ActivityStackService", bVar.f448380b + " ---> " + f83Var.f374090i + " target activity = " + f83Var.f374086e);
            r45.f83 b17 = bVar.b();
            boolean z17 = bVar.f448381c;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stackChange ");
            sb6.append(b17 != null ? b17.f374086e : null);
            sb6.append(" ---> ");
            sb6.append(f83Var.f374086e);
            sb6.append("  ");
            sb6.append(b17 != null ? java.lang.Integer.valueOf(b17.f374090i) : null);
            sb6.append(" ---> ");
            sb6.append(java.lang.Integer.valueOf(f83Var.f374090i));
            sb6.append(" isCreateNewStack = ");
            sb6.append(z17);
            com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleMonitor", sb6.toString());
            if (b17 != null) {
                java.util.Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    ((up1.a) it.next()).x(b17, f83Var, z17, intent, j17);
                }
            }
            bVar.f448380b = f83Var.f374090i;
            bVar.f448381c = false;
        }
        r45.f83 V = iVar.V(f83Var.f374089h);
        if (V != null) {
            java.util.Iterator it6 = copyOnWriteArrayList.iterator();
            while (it6.hasNext()) {
                ((up1.a) it6.next()).g(V, intent, f83Var.f374092n);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleMonitor", "onActivityResume [" + V.f374086e + "] " + V.f374090i + ' ' + f83Var.f374092n);
        }
    }

    public static final void L(vp1.i iVar, r45.f83 f83Var, android.content.Intent intent) {
        iVar.Y("on_start", f83Var);
        r45.f83 V = iVar.V(f83Var.f374089h);
        if (V != null) {
            f438891c++;
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                f438892d++;
            } else {
                f438893e++;
            }
            vp1.i iVar2 = f438889a;
            iVar2.e0();
            long j17 = f83Var.f374092n;
            boolean z17 = f438890b;
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = f438897i;
            if (!z17) {
                f438890b = true;
                r45.f83 V2 = iVar2.V(V.f374089h);
                if (V2 != null) {
                    java.util.Iterator it = copyOnWriteArrayList.iterator();
                    while (it.hasNext()) {
                        ((up1.a) it.next()).h(V2, intent, j17);
                    }
                }
                vp1.e[] eVarArr = vp1.e.f438885d;
                wp1.b bVar = f438896h;
                bVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMSg.ActivityStackService", "setStackPageEnterType 5");
                wp1.a aVar = (wp1.a) ((java.util.LinkedHashMap) bVar.f448379a).get(java.lang.Integer.valueOf(bVar.f448380b));
                if (aVar != null) {
                    java.util.Iterator it6 = aVar.f448378b.iterator();
                    while (it6.hasNext()) {
                        ((r45.f83) it6.next()).f374097s = 5;
                    }
                }
                iVar2.d0(false);
                for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) f438895g).entrySet()) {
                    ((java.lang.Number) entry.getKey()).intValue();
                    r45.g83 g83Var = (r45.g83) entry.getValue();
                    vp1.e[] eVarArr2 = vp1.e.f438885d;
                    g83Var.f374990r = 5;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleMonitor", "on App In " + j17 + ' ' + bm5.f1.a());
            }
            java.util.Iterator it7 = copyOnWriteArrayList.iterator();
            while (it7.hasNext()) {
                ((up1.a) it7.next()).c(V, intent, f83Var.f374092n);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleMonitor", "onActivityStart [" + V.f374086e + "] " + V.f374090i + " mActivityCount " + f438891c);
        }
    }

    public static final void M(vp1.i iVar, r45.f83 f83Var, android.content.Intent intent) {
        iVar.Y("on_stop", f83Var);
        r45.f83 V = iVar.V(f83Var.f374089h);
        if (V != null) {
            f438891c--;
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                f438892d--;
            } else {
                f438893e--;
            }
            vp1.i iVar2 = f438889a;
            iVar2.e0();
            long j17 = f83Var.f374092n;
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                iVar2.X().putLong("mmkv_key_mp_last_stop_time", j17);
            } else {
                iVar2.X().putLong("mmkv_key_op_last_stop_time", j17);
            }
            java.util.Iterator it = f438897i.iterator();
            while (it.hasNext()) {
                ((up1.a) it.next()).C(V, intent, f83Var.f374092n);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleMonitor", "onActivityStop [" + V.f374086e + "] " + V.f374090i + " mActivityCount: " + f438891c);
        }
        int a07 = iVar.a0();
        int i17 = com.tencent.mm.sdk.platformtools.x2.n() ? f438892d : f438893e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAppOut check: localCount=");
        sb6.append(i17);
        sb6.append(", otherCount=");
        sb6.append(a07);
        sb6.append(", changingConfig=");
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) f438894f;
        r45.f83 f83Var2 = (r45.f83) linkedHashMap.get(java.lang.Integer.valueOf(f83Var.f374089h));
        sb6.append(f83Var2 != null ? java.lang.Boolean.valueOf(f83Var2.f374093o) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleMonitor", sb6.toString());
        if (i17 == 0) {
            r45.f83 f83Var3 = (r45.f83) linkedHashMap.get(java.lang.Integer.valueOf(f83Var.f374089h));
            if ((f83Var3 == null || f83Var3.f374093o) ? false : true) {
                com.tencent.mm.sdk.platformtools.n3 W = iVar.W();
                android.os.Message obtainMessage = iVar.W().obtainMessage();
                obtainMessage.what = 10016;
                obtainMessage.obj = nm5.j.c(f83Var, intent);
                W.sendMessageDelayed(obtainMessage, 100L);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b1, code lost:
    
        if (((r2 == null || r2.f374093o) ? false : true) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void N(vp1.i r15, r45.f83 r16, android.content.Intent r17) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vp1.i.N(vp1.i, r45.f83, android.content.Intent):void");
    }

    public static final void O(vp1.i iVar, r45.g83 g83Var, android.content.Intent intent) {
        iVar.getClass();
        r45.g83 g83Var2 = (r45.g83) ((java.util.LinkedHashMap) f438895g).get(java.lang.Integer.valueOf(g83Var.f374982g));
        if (g83Var2 != null) {
            r45.f83 V = iVar.V(g83Var.f374988p);
            wp1.b bVar = f438896h;
            if (V == null) {
                V = bVar.b();
            }
            if (V != null) {
                java.util.Iterator it = f438897i.iterator();
                while (it.hasNext()) {
                    ((up1.a) it.next()).A(V, g83Var2, intent, g83Var.f374986n);
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(V.f374086e);
                sb6.append(" [");
                sb6.append(g83Var2.f374980e);
                sb6.append("] ");
                sb6.append(g83Var2.f374985m);
                sb6.append(" parentActivity = ");
                sb6.append(g83Var2.f374981f);
                sb6.append(" topActivity ");
                r45.f83 b17 = bVar.b();
                sb6.append(b17 != null ? b17.f374085d : null);
                sb6.append(" on destroy");
                com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleMonitor", sb6.toString());
                f438889a.c0(g83Var2);
            }
        }
    }

    public static final void P(vp1.i iVar, r45.g83 g83Var, android.content.Intent intent) {
        java.util.LinkedList linkedList;
        r45.g83 Q = iVar.Q(g83Var);
        if (iVar.Z("on_resume", g83Var)) {
            r45.f83 V = iVar.V(g83Var.f374988p);
            if (V == null) {
                V = f438896h.a("on_resume");
            }
            if (V != null && (linkedList = V.f374094p) != null) {
                if (!linkedList.contains(Q)) {
                    Q.f374989q = linkedList.size();
                    linkedList.add(Q);
                }
                Q.f374981f = V.f374085d;
                Q.f374988p = V.f374089h;
            }
            if (V != null) {
                java.util.Iterator it = f438897i.iterator();
                while (it.hasNext()) {
                    ((up1.a) it.next()).f(V, Q, intent, g83Var.f374986n);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleMonitor", V.f374086e + " [" + Q.f374980e + "] " + Q.f374985m + " parentActivity = " + Q.f374981f + " on resume " + g83Var.f374986n);
            }
        }
    }

    public static /* synthetic */ r45.g83 T(vp1.i iVar, androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.String str2, boolean z17, long j17, int i17, java.lang.Object obj) {
        return iVar.S(fragment, (i17 & 2) != 0 ? "" : str, (i17 & 4) != 0 ? "" : str2, (i17 & 8) != 0 ? true : z17, j17);
    }

    @Override // vp1.d, up1.b
    public void B(android.app.Activity activity, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.sdk.platformtools.n3 W = W();
        android.os.Message obtainMessage = W().obtainMessage();
        obtainMessage.what = 10007;
        obtainMessage.obj = nm5.j.c(f438889a.R(activity, j17), intent);
        W.sendMessage(obtainMessage);
    }

    @Override // vp1.d, up1.b
    public void G(java.lang.String activityName, int i17, long j17, int i18) {
        kotlin.jvm.internal.o.g(activityName, "activityName");
        com.tencent.mm.sdk.platformtools.n3 W = W();
        android.os.Message obtainMessage = W().obtainMessage();
        obtainMessage.what = 10014;
        obtainMessage.obj = nm5.j.e(activityName, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18));
        W.sendMessage(obtainMessage);
    }

    public final r45.g83 Q(r45.g83 g83Var) {
        int i17 = g83Var.f374982g;
        java.util.Map map = f438895g;
        r45.g83 g83Var2 = (r45.g83) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(i17));
        if (g83Var2 != null) {
            return g83Var2;
        }
        vp1.e[] eVarArr = vp1.e.f438885d;
        g83Var.f374990r = 2;
        map.put(java.lang.Integer.valueOf(g83Var.f374982g), g83Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleMonitor", "addFragmentRecord  " + g83Var.f374980e + ' ' + g83Var.f374982g);
        return g83Var;
    }

    public final r45.f83 R(android.app.Activity activity, long j17) {
        int i17;
        if (activity != null) {
            try {
                android.content.Intent intent = activity.getIntent();
                if (intent != null && intent.getComponent() != null) {
                    r45.f83 f83Var = new r45.f83();
                    f83Var.f374085d = activity.getClass().getName();
                    f83Var.f374086e = activity.getClass().getSimpleName();
                    f83Var.f374090i = activity.getTaskId();
                    f83Var.f374087f = "";
                    int flags = intent.getFlags();
                    if ((268435456 & flags) == 0) {
                        if ((536870912 & flags) != 0) {
                            i17 = 2;
                        } else if ((67108864 & flags) == 0) {
                            i17 = (flags & 524288) != 0 ? 3 : 0;
                        }
                        f83Var.f374088g = i17;
                        f83Var.f374089h = activity.hashCode();
                        f83Var.f374092n = j17;
                        f83Var.f374093o = activity.isChangingConfigurations();
                        f83Var.f374095q = bm5.f1.a();
                        return f83Var;
                    }
                    i17 = 1;
                    f83Var.f374088g = i17;
                    f83Var.f374089h = activity.hashCode();
                    f83Var.f374092n = j17;
                    f83Var.f374093o = activity.isChangingConfigurations();
                    f83Var.f374095q = bm5.f1.a();
                    return f83Var;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return null;
    }

    public final r45.g83 S(androidx.fragment.app.Fragment fragment, java.lang.String str, java.lang.String str2, boolean z17, long j17) {
        r45.g83 g83Var = new r45.g83();
        g83Var.f374979d = fragment.getClass().getName();
        g83Var.f374980e = fragment.getClass().getSimpleName();
        androidx.fragment.app.FragmentActivity activity = fragment.getActivity();
        g83Var.f374981f = activity != null ? activity.getClass().getName() : null;
        androidx.fragment.app.FragmentActivity activity2 = fragment.getActivity();
        g83Var.f374988p = activity2 != null ? activity2.hashCode() : 0;
        g83Var.f374982g = fragment.hashCode();
        g83Var.f374986n = j17;
        g83Var.f374984i = str;
        g83Var.f374987o = z17;
        g83Var.f374985m = str2;
        return g83Var;
    }

    public final void U(r45.f83 f83Var, r45.g83 g83Var, android.content.Intent intent) {
        if (Z("on_pause", g83Var)) {
            java.util.Iterator it = f438897i.iterator();
            while (it.hasNext()) {
                ((up1.a) it.next()).D(f83Var, g83Var, intent, g83Var.f374986n);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleMonitor", f83Var.f374086e + " [" + g83Var.f374980e + "] " + g83Var.f374985m + " parentActivity = " + g83Var.f374981f + " on pause " + g83Var.f374986n);
        }
    }

    public final r45.f83 V(int i17) {
        return (r45.f83) ((java.util.LinkedHashMap) f438894f).get(java.lang.Integer.valueOf(i17));
    }

    public final com.tencent.mm.sdk.platformtools.n3 W() {
        return (com.tencent.mm.sdk.platformtools.n3) ((jz5.n) f438899k).getValue();
    }

    public final com.tencent.mm.sdk.platformtools.o4 X() {
        java.lang.Object value = ((jz5.n) f438898j).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.sdk.platformtools.o4) value;
    }

    public final void Y(java.lang.String str, r45.f83 f83Var) {
        jz5.f0 f0Var;
        r45.f83 f83Var2 = (r45.f83) ((java.util.LinkedHashMap) f438894f).get(java.lang.Integer.valueOf(f83Var.f374089h));
        if (f83Var2 != null) {
            vp1.j jVar = vp1.j.f438900a;
            int b17 = jVar.b(str);
            if (b17 != f83Var2.f374091m) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleMonitor", "moveActivityStatus " + f83Var2.f374086e + ' ' + jVar.a(f83Var2.f374091m) + " --> " + str);
                f83Var2.f374091m = b17;
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PageLifecycleMonitor", "moveActivityStatus err " + f83Var.f374086e + ' ' + f83Var.f374089h + " evenId " + str);
        }
    }

    public final boolean Z(java.lang.String str, r45.g83 g83Var) {
        jz5.f0 f0Var;
        r45.g83 g83Var2 = (r45.g83) ((java.util.LinkedHashMap) f438895g).get(java.lang.Integer.valueOf(g83Var.f374982g));
        if (g83Var2 != null) {
            vp1.j jVar = vp1.j.f438900a;
            int b17 = jVar.b(str);
            if (b17 != g83Var2.f374983h) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleMonitor", "moveFragmentStatus " + g83Var2.f374980e + ' ' + jVar.a(g83Var2.f374983h) + " --> " + str);
                g83Var2.f374983h = b17;
                return true;
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var != null) {
            return false;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.PageLifecycleMonitor", "moveActivityStatus err " + g83Var.f374980e + ' ' + g83Var.f374982g + " evenId " + str);
        return false;
    }

    @Override // up1.b
    public void a(androidx.fragment.app.Fragment fragment, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
        com.tencent.mm.sdk.platformtools.n3 W = W();
        android.os.Message obtainMessage = W().obtainMessage();
        obtainMessage.what = 10012;
        obtainMessage.obj = nm5.j.c(T(f438889a, fragment, null, null, false, j17, 14, null), intent);
        W.sendMessage(obtainMessage);
    }

    public final int a0() {
        int i17 = X().getInt(com.tencent.mm.sdk.platformtools.x2.n() ? "mmkv_key_other_process_on_start" : "mmkv_key_main_process_on_start", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleMonitor", bm5.f1.a() + ", other process start count " + i17);
        return i17;
    }

    @Override // up1.b
    public void b(android.app.Activity activity, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.sdk.platformtools.n3 W = W();
        android.os.Message obtainMessage = W().obtainMessage();
        obtainMessage.what = 10001;
        obtainMessage.obj = nm5.j.c(f438889a.R(activity, j17), intent);
        W.sendMessage(obtainMessage);
    }

    public final void b0(r45.f83 f83Var, long j17, android.content.Intent intent) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("outStack [");
        sb6.append(f83Var != null ? f83Var.f374086e : null);
        sb6.append("] ");
        sb6.append(f83Var != null ? java.lang.Integer.valueOf(f83Var.f374090i) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleMonitor", sb6.toString());
        if (f83Var != null) {
            java.util.Iterator it = f438897i.iterator();
            while (it.hasNext()) {
                ((up1.a) it.next()).m(f83Var, intent, j17);
            }
        }
    }

    public final void c0(r45.g83 g83Var) {
        java.util.Map map = f438895g;
        if (!map.containsKey(java.lang.Integer.valueOf(g83Var.f374982g))) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PageLifecycleMonitor", "removeFragmentRecord err " + g83Var.f374980e + ' ' + g83Var.f374982g);
            return;
        }
        map.remove(java.lang.Integer.valueOf(g83Var.f374982g));
        com.tencent.mars.xlog.Log.i("MicroMsg.PageLifecycleMonitor", "removeFragmentRecord  " + g83Var.f374980e + ' ' + g83Var.f374982g);
    }

    public final void d0(boolean z17) {
        java.util.ArrayList arrayList;
        wp1.b bVar = f438896h;
        wp1.a aVar = (wp1.a) ((java.util.LinkedHashMap) bVar.f448379a).get(java.lang.Integer.valueOf(bVar.f448380b));
        if (aVar != null) {
            arrayList = new java.util.ArrayList();
            for (r45.f83 f83Var : aVar.f448378b) {
                kotlin.jvm.internal.o.d(f83Var);
                arrayList.add(f83Var);
                if (z17) {
                    f83Var.f374098t++;
                } else {
                    f83Var.f374099u++;
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            java.util.Iterator it = f438897i.iterator();
            while (it.hasNext()) {
                ((up1.a) it.next()).E(arrayList, z17);
            }
        }
    }

    public final void e0() {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            X().putInt("mmkv_key_main_process_on_start", f438892d);
        } else {
            X().putInt("mmkv_key_other_process_on_start", f438893e);
        }
    }

    @Override // vp1.d, up1.b
    public void i(android.app.Activity activity, boolean z17, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.sdk.platformtools.n3 W = W();
        android.os.Message obtainMessage = W().obtainMessage();
        obtainMessage.what = 10010;
        obtainMessage.obj = nm5.j.c(f438889a.R(activity, j17), java.lang.Boolean.valueOf(z17));
        W.sendMessage(obtainMessage);
    }

    @Override // vp1.d, up1.b
    public void k(androidx.fragment.app.Fragment fragment, java.lang.String vasName, java.lang.String vasSimpleName, boolean z17, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
        kotlin.jvm.internal.o.g(vasName, "vasName");
        kotlin.jvm.internal.o.g(vasSimpleName, "vasSimpleName");
        com.tencent.mm.sdk.platformtools.n3 W = W();
        android.os.Message obtainMessage = W().obtainMessage();
        obtainMessage.what = 10015;
        obtainMessage.obj = nm5.j.c(f438889a.S(fragment, vasName, vasSimpleName, z17, j17), intent);
        W.sendMessage(obtainMessage);
    }

    @Override // vp1.d, up1.b
    public void l(android.app.Activity activity, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.sdk.platformtools.n3 W = W();
        android.os.Message obtainMessage = W().obtainMessage();
        obtainMessage.what = com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL;
        obtainMessage.obj = nm5.j.c(f438889a.R(activity, j17), intent);
        W.sendMessage(obtainMessage);
    }

    @Override // up1.b
    public void n(android.app.Activity activity, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.sdk.platformtools.n3 W = W();
        android.os.Message obtainMessage = W().obtainMessage();
        obtainMessage.what = com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NOT_VALID;
        obtainMessage.obj = nm5.j.c(f438889a.R(activity, j17), intent);
        W.sendMessage(obtainMessage);
    }

    @Override // vp1.d, up1.b
    public void p(android.app.Activity activity, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(intent, "intent");
        com.tencent.mm.sdk.platformtools.n3 W = W();
        android.os.Message obtainMessage = W().obtainMessage();
        obtainMessage.what = 10002;
        obtainMessage.obj = nm5.j.c(f438889a.R(activity, j17), intent);
        W.sendMessage(obtainMessage);
    }

    @Override // up1.b
    public void r(android.app.Activity activity, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.sdk.platformtools.n3 W = W();
        android.os.Message obtainMessage = W().obtainMessage();
        obtainMessage.what = 10005;
        obtainMessage.obj = nm5.j.c(f438889a.R(activity, j17), intent);
        W.sendMessage(obtainMessage);
    }

    @Override // vp1.d, up1.b
    public void t(android.app.Activity activity, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.sdk.platformtools.n3 W = W();
        android.os.Message obtainMessage = W().obtainMessage();
        obtainMessage.what = 10008;
        obtainMessage.obj = nm5.j.c(f438889a.R(activity, j17), intent);
        W.sendMessage(obtainMessage);
    }

    @Override // vp1.d, up1.b
    public void u(android.app.Activity activity, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(intent, "intent");
        com.tencent.mm.sdk.platformtools.n3 W = W();
        android.os.Message obtainMessage = W().obtainMessage();
        obtainMessage.what = 10000;
        obtainMessage.obj = nm5.j.d(f438889a.R(activity, j17), intent, java.lang.Long.valueOf(j17));
        W.sendMessage(obtainMessage);
    }

    @Override // up1.b
    public void v(androidx.fragment.app.Fragment fragment, java.lang.String vasName, java.lang.String vasSimpleName, boolean z17, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
        kotlin.jvm.internal.o.g(vasName, "vasName");
        kotlin.jvm.internal.o.g(vasSimpleName, "vasSimpleName");
        com.tencent.mm.sdk.platformtools.n3 W = W();
        android.os.Message obtainMessage = W().obtainMessage();
        obtainMessage.what = 10011;
        obtainMessage.obj = nm5.j.c(f438889a.S(fragment, vasName, vasSimpleName, z17, j17), intent);
        W.sendMessage(obtainMessage);
    }

    @Override // up1.b
    public void w(android.app.Activity activity, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.sdk.platformtools.n3 W = W();
        android.os.Message obtainMessage = W().obtainMessage();
        obtainMessage.what = 10009;
        obtainMessage.obj = nm5.j.c(f438889a.R(activity, j17), intent);
        W.sendMessage(obtainMessage);
    }

    @Override // vp1.d, up1.b
    public void y(android.app.Activity activity, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.sdk.platformtools.n3 W = W();
        android.os.Message obtainMessage = W().obtainMessage();
        obtainMessage.what = 10006;
        obtainMessage.obj = nm5.j.c(f438889a.R(activity, j17), intent);
        W.sendMessage(obtainMessage);
    }

    @Override // vp1.d, up1.b
    public void z(androidx.fragment.app.Fragment fragment, android.content.Intent intent, long j17) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
        com.tencent.mm.sdk.platformtools.n3 W = W();
        android.os.Message obtainMessage = W().obtainMessage();
        obtainMessage.what = 10013;
        obtainMessage.obj = nm5.j.c(T(f438889a, fragment, null, null, false, j17, 14, null), intent);
        W.sendMessage(obtainMessage);
    }
}
