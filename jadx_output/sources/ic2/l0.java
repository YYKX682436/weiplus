package ic2;

/* loaded from: classes8.dex */
public final class l0 implements ya2.u1, com.tencent.mm.modelbase.u0 {

    /* renamed from: q, reason: collision with root package name */
    public static final android.util.SparseArray f290337q = new android.util.SparseArray();

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArraySet f290338r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.HashSet f290339s;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f290340d = jz5.h.b(ic2.f0.f290327d);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f290341e;

    /* renamed from: f, reason: collision with root package name */
    public ic2.a f290342f;

    /* renamed from: g, reason: collision with root package name */
    public int f290343g;

    /* renamed from: h, reason: collision with root package name */
    public int f290344h;

    /* renamed from: i, reason: collision with root package name */
    public final int f290345i;

    /* renamed from: m, reason: collision with root package name */
    public final int f290346m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f290347n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Runnable f290348o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f290349p;

    static {
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = new java.util.concurrent.CopyOnWriteArraySet();
        copyOnWriteArraySet.add(new ic2.p0());
        f290338r = copyOnWriteArraySet;
        f290339s = new java.util.HashSet();
    }

    public l0() {
        com.tencent.mm.app.w.INSTANCE.a(new ic2.d0(this));
        this.f290341e = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f290345i = 3;
        this.f290346m = ma1.i.CTRL_INDEX;
        this.f290347n = new com.tencent.mm.sdk.platformtools.n3("finder_sync_thread", new ic2.j0(this));
        this.f290348o = new ic2.e0(this);
        this.f290349p = new ic2.k0(this);
    }

    public void b(int i17, ya2.x1 handler) {
        kotlin.jvm.internal.o.g(handler, "handler");
        android.util.SparseArray sparseArray = f290337q;
        if (((java.util.HashSet) sparseArray.get(i17)) == null) {
            sparseArray.append(i17, new java.util.HashSet());
        }
        ((java.util.HashSet) sparseArray.get(i17)).add(handler);
    }

    public final void c() {
        int i17 = this.f290344h;
        int i18 = this.f290345i;
        java.util.HashSet hashSet = f290339s;
        if (i17 >= i18) {
            com.tencent.mars.xlog.Log.i("Finder.SyncExtension", "checkLoop finderAliveUI " + hashSet.size() + " sync_fail_count " + this.f290344h + " so ignore checkloop");
        }
        if (hashSet.size() > 0) {
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f290347n;
            java.lang.Runnable runnable = this.f290349p;
            n3Var.removeCallbacks(runnable);
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            n3Var.postDelayed(runnable, com.tencent.mm.plugin.finder.storage.t70.f128011x);
        }
    }

    public void d(java.util.List cmdItemList, int i17, int i18) {
        kotlin.jvm.internal.o.g(cmdItemList, "cmdItemList");
        java.util.Iterator it = cmdItemList.iterator();
        while (it.hasNext()) {
            r45.hx0 hx0Var = (r45.hx0) it.next();
            java.util.Iterator it6 = f290338r.iterator();
            while (it6.hasNext()) {
                ((ya2.x1) it6.next()).j7(hx0Var, i17, i18);
            }
            java.util.HashSet hashSet = (java.util.HashSet) f290337q.get(hx0Var.getInteger(0));
            if (hashSet != null) {
                synchronized (hashSet) {
                    java.util.Iterator it7 = hashSet.iterator();
                    while (it7.hasNext()) {
                        ((ya2.x1) it7.next()).j7(hx0Var, i17, i18);
                    }
                }
            }
        }
    }

    public void e(int i17, int i18) {
        ya2.u1.a(this, i17, i18, null, null, 8, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(int r23, int r24, r45.qt2 r25, ya2.t1 r26) {
        /*
            Method dump skipped, instructions count: 2062
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ic2.l0.f(int, int, r45.qt2, ya2.t1):void");
    }

    public final void g(int i17, ya2.t1 t1Var) {
        com.tencent.mm.plugin.finder.extension.reddot.jb L0;
        int i18;
        com.tencent.mm.plugin.finder.extension.reddot.jb L02;
        r45.vs2 vs2Var;
        com.tencent.mm.plugin.finder.extension.reddot.jb L03;
        r45.vs2 vs2Var2;
        java.util.Iterator it;
        java.util.Iterator it6;
        if (t1Var == null) {
            return;
        }
        com.tencent.mm.plugin.finder.storage.aj0 aj0Var = com.tencent.mm.plugin.finder.storage.aj0.f126440a;
        boolean z17 = aj0Var.F() == 1;
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        if (z17) {
            com.tencent.mm.plugin.finder.extension.reddot.jb L04 = nk6.L0("FinderEntrance");
            L0 = L04 != null ? L04.u1() : null;
        } else {
            L0 = nk6.L0("FinderEntrance");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fillRedDotArgs args=" + t1Var + ",copyReddot=" + z17 + ",finderEntranceCtrlInfo=" + L0);
        if (L0 != null && L0.field_ctrInfo == null && aj0Var.G() == 1) {
            sb6.append(",throw redDot!");
            L0 = null;
        }
        com.tencent.mars.xlog.Log.i("Finder.SyncExtension", sb6.toString());
        if ((t1Var.f460538a.length() == 0) && L0 != null) {
            java.lang.String str = L0.field_tipsId;
            if (str == null) {
                str = "";
            }
            t1Var.f460538a = str;
        }
        java.util.LinkedList linkedList = t1Var.f460539b;
        if (L0 != null) {
            java.util.Iterator it7 = linkedList.iterator();
            int i19 = 0;
            while (true) {
                if (!it7.hasNext()) {
                    i19 = -1;
                    break;
                } else if (kotlin.jvm.internal.o.b(L0.field_tipsId, ((r45.vs2) it7.next()).f388490h)) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i19 < 0) {
                ya2.w1.a(linkedList, L0);
                java.lang.String str2 = L0.field_tips_uuid;
                if (str2 != null) {
                    nk6.z("FinderEntrance", str2, L0);
                }
            }
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L05 = nk6.L0("FinderMentionEntrance");
        if (L05 != null) {
            java.util.Iterator it8 = linkedList.iterator();
            int i27 = 0;
            while (true) {
                if (!it8.hasNext()) {
                    i27 = -1;
                    break;
                } else if (kotlin.jvm.internal.o.b(L05.field_tipsId, ((r45.vs2) it8.next()).f388490h)) {
                    break;
                } else {
                    i27++;
                }
            }
            if (i27 < 0) {
                ya2.w1.a(linkedList, L05);
            }
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L06 = nk6.L0("TLFollow");
        if (L06 != null) {
            java.util.Iterator it9 = linkedList.iterator();
            int i28 = 0;
            while (true) {
                if (!it9.hasNext()) {
                    i28 = -1;
                    break;
                } else if (kotlin.jvm.internal.o.b(L06.field_tipsId, ((r45.vs2) it9.next()).f388490h)) {
                    break;
                } else {
                    i28++;
                }
            }
            if (i28 < 0) {
                ya2.w1.a(linkedList, L06);
            }
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L07 = nk6.L0("TLRecommendTab");
        if (L07 != null) {
            java.util.Iterator it10 = linkedList.iterator();
            int i29 = 0;
            while (true) {
                if (!it10.hasNext()) {
                    i29 = -1;
                    break;
                } else if (kotlin.jvm.internal.o.b(L07.field_tipsId, ((r45.vs2) it10.next()).f388490h)) {
                    break;
                } else {
                    i29++;
                }
            }
            if (i29 < 0) {
                ya2.w1.a(linkedList, L07);
            }
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L08 = nk6.L0("finder_tl_hot_tab");
        if (L08 != null) {
            java.util.Iterator it11 = linkedList.iterator();
            int i37 = 0;
            while (true) {
                if (!it11.hasNext()) {
                    i37 = -1;
                    break;
                } else if (kotlin.jvm.internal.o.b(L08.field_tipsId, ((r45.vs2) it11.next()).f388490h)) {
                    break;
                } else {
                    i37++;
                }
            }
            if (i37 < 0) {
                ya2.w1.a(linkedList, L08);
            }
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L09 = nk6.L0("finder_tl_nearby_tab");
        if (L09 != null) {
            java.util.Iterator it12 = linkedList.iterator();
            int i38 = 0;
            while (true) {
                if (!it12.hasNext()) {
                    i38 = -1;
                    break;
                } else if (kotlin.jvm.internal.o.b(L09.field_tipsId, ((r45.vs2) it12.next()).f388490h)) {
                    break;
                } else {
                    i38++;
                }
            }
            if (i38 < 0) {
                ya2.w1.a(linkedList, L09);
            }
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L010 = nk6.L0("finder_tl_city_tab");
        if (L010 != null) {
            java.util.Iterator it13 = linkedList.iterator();
            int i39 = 0;
            while (true) {
                if (!it13.hasNext()) {
                    i39 = -1;
                    break;
                } else if (kotlin.jvm.internal.o.b(L010.field_tipsId, ((r45.vs2) it13.next()).f388490h)) {
                    break;
                } else {
                    i39++;
                }
            }
            if (i39 < 0) {
                ya2.w1.a(linkedList, L010);
            }
        }
        for (java.lang.String str3 : r26.n0.f0(com.tencent.mm.plugin.finder.storage.aj0.f126440a.s(), new java.lang.String[]{";"}, false, 0, 6, null)) {
            com.tencent.mm.plugin.finder.extension.reddot.jb L011 = nk6.L0(str3);
            if (L011 != null) {
                java.util.Iterator it14 = linkedList.iterator();
                int i47 = 0;
                while (true) {
                    if (!it14.hasNext()) {
                        i47 = -1;
                        break;
                    } else if (kotlin.jvm.internal.o.b(L011.field_tipsId, ((r45.vs2) it14.next()).f388490h)) {
                        break;
                    } else {
                        i47++;
                    }
                }
                boolean z18 = i47 >= 0;
                com.tencent.mars.xlog.Log.i("Finder.SyncExtension", "[FINDER_REDDOT_SYNC_PATH_LIST] path=" + str3 + " isExist=" + z18 + " ctrlInfo=" + hc2.u0.e(L011.field_ctrInfo));
                if (!z18) {
                    ya2.w1.a(linkedList, L011);
                }
            }
        }
        java.util.Iterator it15 = ((java.util.ArrayList) ((ey2.c2) ((xy2.n) pf5.u.f353936a.e(zy2.b6.class).c(xy2.n.class))).N6()).iterator();
        while (it15.hasNext()) {
            int intValue = ((java.lang.Number) it15.next()).intValue();
            java.util.Iterator it16 = nk6.f(intValue, g92.b.f269769e.T0()).iterator();
            while (it16.hasNext()) {
                com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = (com.tencent.mm.plugin.finder.extension.reddot.jb) it16.next();
                java.util.Iterator it17 = linkedList.iterator();
                int i48 = 0;
                while (true) {
                    if (!it17.hasNext()) {
                        it = it15;
                        it6 = it16;
                        i48 = -1;
                        break;
                    } else {
                        it = it15;
                        it6 = it16;
                        if (kotlin.jvm.internal.o.b(jbVar.field_tips_uuid, ((r45.vs2) it17.next()).f388503x)) {
                            break;
                        }
                        i48++;
                        it16 = it6;
                        it15 = it;
                    }
                }
                boolean z19 = i48 >= 0;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[FINDER_REDDOT_SYNC_PATH_LIST] type=");
                sb7.append(intValue);
                sb7.append(" isExist=");
                sb7.append(z19);
                sb7.append(" ctrlInfo=");
                r45.vs2 vs2Var3 = jbVar.field_ctrInfo;
                sb7.append(vs2Var3 != null ? hc2.u0.e(vs2Var3) : null);
                com.tencent.mars.xlog.Log.i("Finder.SyncExtension", sb7.toString());
                if (!z19) {
                    ya2.w1.a(linkedList, jbVar);
                }
                it16 = it6;
                it15 = it;
            }
        }
        if ((t1Var.f460540c.length() == 0) && (L03 = nk6.L0("NearbyEntrance")) != null && (vs2Var2 = L03.field_ctrInfo) != null) {
            java.lang.String str4 = vs2Var2.f388490h;
            if (str4 == null) {
                str4 = "";
            }
            t1Var.f460540c = str4;
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L012 = nk6.L0("FinderLiveEntrance");
        if (L012 != null && (vs2Var = L012.field_ctrInfo) != null) {
            java.lang.String str5 = vs2Var.f388490h;
            t1Var.f460540c = str5 != null ? str5 : "";
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L013 = nk6.L0("NearbyEntrance");
        java.util.LinkedList linkedList2 = t1Var.f460541d;
        if (L013 != null) {
            java.util.Iterator it18 = linkedList2.iterator();
            int i49 = 0;
            while (true) {
                if (!it18.hasNext()) {
                    i49 = -1;
                    break;
                } else if (kotlin.jvm.internal.o.b(L013.field_tipsId, ((r45.vs2) it18.next()).f388490h)) {
                    break;
                } else {
                    i49++;
                }
            }
            if (i49 < 0) {
                ya2.w1.a(linkedList2, L013);
            }
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L014 = nk6.L0("NearbyFeedTab");
        if (L014 != null) {
            java.util.Iterator it19 = linkedList2.iterator();
            int i57 = 0;
            while (true) {
                if (!it19.hasNext()) {
                    i57 = -1;
                    break;
                } else if (kotlin.jvm.internal.o.b(L014.field_tipsId, ((r45.vs2) it19.next()).f388490h)) {
                    break;
                } else {
                    i57++;
                }
            }
            if (i57 < 0) {
                ya2.w1.a(linkedList2, L014);
            }
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L015 = nk6.L0("NearbyLiveTab");
        if (L015 != null) {
            java.util.Iterator it20 = linkedList2.iterator();
            int i58 = 0;
            while (true) {
                if (!it20.hasNext()) {
                    i58 = -1;
                    break;
                } else if (kotlin.jvm.internal.o.b(L015.field_tipsId, ((r45.vs2) it20.next()).f388490h)) {
                    break;
                } else {
                    i58++;
                }
            }
            if (i58 < 0) {
                ya2.w1.a(linkedList2, L015);
            }
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L016 = nk6.L0("NearbyPeopleTab");
        if (L016 != null) {
            java.util.Iterator it21 = linkedList2.iterator();
            int i59 = 0;
            while (true) {
                if (!it21.hasNext()) {
                    i59 = -1;
                    break;
                } else if (kotlin.jvm.internal.o.b(L016.field_tipsId, ((r45.vs2) it21.next()).f388490h)) {
                    break;
                } else {
                    i59++;
                }
            }
            if (i59 < 0) {
                ya2.w1.a(linkedList2, L016);
            }
        }
        ae2.b2 b2Var = ae2.b2.f3461a;
        for (java.lang.String str6 : r26.n0.f0((java.lang.CharSequence) ((lb2.j) ((jz5.n) ae2.b2.f3487u).getValue()).r(), new java.lang.String[]{";"}, false, 0, 6, null)) {
            if ((str6.length() > 0) && (L02 = nk6.L0(str6)) != null) {
                java.util.Iterator it22 = linkedList2.iterator();
                int i66 = 0;
                while (true) {
                    if (!it22.hasNext()) {
                        i66 = -1;
                        break;
                    } else if (kotlin.jvm.internal.o.b(L02.field_tipsId, ((r45.vs2) it22.next()).f388490h)) {
                        break;
                    } else {
                        i66++;
                    }
                }
                boolean z27 = i66 >= 0;
                com.tencent.mars.xlog.Log.i("Finder.SyncExtension", "[FINDER_LIVE_REDDOT_SYNC_PATH_LIST] path=" + str6 + " isExist=" + z27 + " ctrlInfo=" + hc2.u0.e(L02.field_ctrInfo));
                if (!z27) {
                    ya2.w1.a(linkedList2, L02);
                }
            }
        }
        com.tencent.mm.plugin.finder.extension.reddot.jb L017 = nk6.L0("FinderSnsDeliveryEntrance");
        java.util.LinkedList linkedList3 = t1Var.f460542e;
        if (L017 != null) {
            java.util.Iterator it23 = linkedList3.iterator();
            int i67 = 0;
            while (true) {
                if (!it23.hasNext()) {
                    i18 = -1;
                    break;
                } else {
                    if (kotlin.jvm.internal.o.b(L017.field_tipsId, ((r45.vs2) it23.next()).f388490h)) {
                        i18 = i67;
                        break;
                    }
                    i67++;
                }
            }
            if (i18 < 0) {
                ya2.w1.a(linkedList3, L017);
            }
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("scene=");
        sb8.append(i17);
        sb8.append(" FINDER_REDDOT_SYNC_PATH_LIST=");
        sb8.append(com.tencent.mm.plugin.finder.storage.aj0.f126440a.s());
        sb8.append(" FINDER_LIVE_REDDOT_SYNC_PATH_LIST=");
        ae2.b2 b2Var2 = ae2.b2.f3461a;
        sb8.append((java.lang.String) ((lb2.j) ((jz5.n) ae2.b2.f3487u).getValue()).r());
        com.tencent.mars.xlog.Log.i("Finder.SyncExtension", sb8.toString());
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("[fillRedDotArgs] scene=");
        sb9.append(i17);
        sb9.append(" finderCtrlInfoList=");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it24 = linkedList.iterator();
        while (it24.hasNext()) {
            arrayList.add(((r45.vs2) it24.next()).f388490h);
        }
        sb9.append(arrayList);
        com.tencent.mars.xlog.Log.i("Finder.SyncExtension", sb9.toString());
        java.lang.StringBuilder sb10 = new java.lang.StringBuilder("[fillRedDotArgs] scene=");
        sb10.append(i17);
        sb10.append(" nearbyCtrlInfoList=");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
        java.util.Iterator it25 = linkedList2.iterator();
        while (it25.hasNext()) {
            arrayList2.add(((r45.vs2) it25.next()).f388490h);
        }
        sb10.append(arrayList2);
        com.tencent.mars.xlog.Log.i("Finder.SyncExtension", sb10.toString());
        java.lang.StringBuilder sb11 = new java.lang.StringBuilder("[fillRedDotArgs] scene=");
        sb11.append(i17);
        sb11.append(" snsCtrlInfoList=");
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(linkedList3, 10));
        java.util.Iterator it26 = linkedList3.iterator();
        while (it26.hasNext()) {
            arrayList3.add(((r45.vs2) it26.next()).f388490h);
        }
        sb11.append(arrayList3);
        com.tencent.mars.xlog.Log.i("Finder.SyncExtension", sb11.toString());
        k(linkedList);
        k(linkedList2);
        k(linkedList3);
    }

    public long h(int i17) {
        ic2.a aVar;
        r45.gl0 gl0Var;
        r45.gl0 gl0Var2;
        long j17 = 0;
        if (i17 == 24) {
            ic2.a aVar2 = this.f290342f;
            if (aVar2 != null) {
                r45.hl0 hl0Var = aVar2.f290304a;
                aVar = (hl0Var == null || (gl0Var = (r45.gl0) hl0Var.getCustom(11)) == null || gl0Var.getInteger(0) != 1) ? false : true ? aVar2 : null;
                if (aVar != null) {
                    j17 = aVar.f290315l;
                }
            }
        } else if (i17 != 25) {
            j17 = -1;
        } else {
            ic2.a aVar3 = this.f290342f;
            if (aVar3 != null) {
                r45.hl0 hl0Var2 = aVar3.f290304a;
                aVar = (hl0Var2 == null || (gl0Var2 = (r45.gl0) hl0Var2.getCustom(15)) == null || gl0Var2.getInteger(0) != 1) ? false : true ? aVar3 : null;
                if (aVar != null) {
                    j17 = aVar.f290316m;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.SyncExtension", "getEntranceReportTime type=" + i17 + " socialHotSpot,discovery tab sync time = " + j17);
        return j17;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0314  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(boolean r25, int r26, r45.zy2 r27, r45.az2 r28) {
        /*
            Method dump skipped, instructions count: 1125
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ic2.l0.i(boolean, int, r45.zy2, r45.az2):void");
    }

    public final boolean j(int i17) {
        java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_FINDER_SYNC_MERGE_SCENE_STRING_SYNC, "");
        kotlin.jvm.internal.o.d(v17);
        java.util.Set X0 = kz5.n0.X0(r26.n0.f0(r26.n0.W(r26.n0.Z(v17, "]"), "["), new java.lang.String[]{","}, false, 0, 6, null));
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(X0, 10));
        java.util.Iterator it = X0.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) it.next())));
        }
        com.tencent.mars.xlog.Log.i("Finder.SyncExtension", "[isMergeScene] mergeSet=" + arrayList);
        return arrayList.isEmpty() ^ true ? arrayList.contains(java.lang.Integer.valueOf(i17)) : i17 == 13 || i17 == 14 || i17 == 15 || i17 == 16 || i17 == 17 || i17 == 18 || i17 == 19 || i17 == 20 || i17 == 22 || i17 == 23;
    }

    public final void k(java.util.LinkedList linkedList) {
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.vs2 vs2Var = (r45.vs2) it.next();
            com.tencent.mm.protobuf.g gVar = vs2Var.f388501v;
            if (gVar != null) {
                r45.vs2 vs2Var2 = new r45.vs2();
                vs2Var2.f388501v = gVar;
                java.util.LinkedList<r45.f03> show_infos = vs2Var.f388489g;
                kotlin.jvm.internal.o.f(show_infos, "show_infos");
                for (r45.f03 f03Var : show_infos) {
                    java.util.LinkedList linkedList3 = vs2Var2.f388489g;
                    r45.f03 f03Var2 = new r45.f03();
                    f03Var2.f373892i = f03Var.f373892i;
                    linkedList3.add(f03Var2);
                }
                linkedList2.add(vs2Var2);
                com.tencent.mars.xlog.Log.i("Finder.SyncExtension", "[optCtrlInfoReport] " + hc2.u0.e(vs2Var2));
            } else {
                linkedList2.add(vs2Var);
            }
        }
        linkedList.clear();
        linkedList.addAll(linkedList2);
    }

    public void l(int i17, ya2.x1 handler) {
        kotlin.jvm.internal.o.g(handler, "handler");
        java.util.HashSet hashSet = (java.util.HashSet) f290337q.get(i17);
        if (hashSet != null) {
            hashSet.remove(handler);
        }
    }

    public final java.lang.String m(int i17) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        ya2.u1.f460554o1.getClass();
        jz5.l[] lVarArr = ya2.s1.f460533b;
        for (int i18 = 0; i18 < 14; i18++) {
            jz5.l lVar = lVarArr[i18];
            if ((((java.lang.Number) lVar.f302833d).intValue() & i17) != 0) {
                stringBuffer.append(((java.lang.String) lVar.f302834e) + " ,");
            }
        }
        java.lang.String stringBuffer2 = stringBuffer.toString();
        kotlin.jvm.internal.o.f(stringBuffer2, "toString(...)");
        return stringBuffer2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        if (r5 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0074, code lost:
    
        if (((r6 == null || (r6 = (r45.gl0) r6.getCustom(11)) == null || r6.getInteger(0) != 1) ? false : true) != false) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean n(int r9) {
        /*
            r8 = this;
            r0 = 24
            java.lang.String r1 = "updateEntranceReportTime type="
            java.lang.String r2 = "Finder.SyncExtension"
            r3 = 1
            r4 = 0
            r5 = 0
            if (r9 == r0) goto L5a
            r0 = 25
            if (r9 == r0) goto L12
            goto La2
        L12:
            ic2.a r0 = r8.f290342f
            if (r0 == 0) goto L2e
            r45.hl0 r6 = r0.f290304a
            if (r6 == 0) goto L2b
            r7 = 15
            com.tencent.mm.protobuf.f r6 = r6.getCustom(r7)
            r45.gl0 r6 = (r45.gl0) r6
            if (r6 == 0) goto L2b
            int r6 = r6.getInteger(r5)
            if (r6 != r3) goto L2b
            r5 = r3
        L2b:
            if (r5 == 0) goto L2e
            goto L2f
        L2e:
            r0 = r4
        L2f:
            if (r0 != 0) goto L32
            goto L38
        L32:
            long r5 = android.os.SystemClock.uptimeMillis()
            r0.f290316m = r5
        L38:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = " socialHotSpot,discovery tab social hot sync time = "
            r0.append(r9)
            ic2.a r9 = r8.f290342f
            if (r9 == 0) goto L4f
            long r4 = r9.f290316m
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
        L4f:
            r0.append(r4)
            java.lang.String r9 = r0.toString()
            com.tencent.mars.xlog.Log.i(r2, r9)
            return r3
        L5a:
            ic2.a r0 = r8.f290342f
            if (r0 == 0) goto L77
            r45.hl0 r6 = r0.f290304a
            if (r6 == 0) goto L73
            r7 = 11
            com.tencent.mm.protobuf.f r6 = r6.getCustom(r7)
            r45.gl0 r6 = (r45.gl0) r6
            if (r6 == 0) goto L73
            int r6 = r6.getInteger(r5)
            if (r6 != r3) goto L73
            goto L74
        L73:
            r3 = r5
        L74:
            if (r3 == 0) goto L77
            goto L78
        L77:
            r0 = r4
        L78:
            if (r0 != 0) goto L7b
            goto L81
        L7b:
            long r6 = android.os.SystemClock.uptimeMillis()
            r0.f290315l = r6
        L81:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = " socialHotSpot,discovery tab sync time = "
            r0.append(r9)
            ic2.a r9 = r8.f290342f
            if (r9 == 0) goto L98
            long r3 = r9.f290315l
            java.lang.Long r4 = java.lang.Long.valueOf(r3)
        L98:
            r0.append(r4)
            java.lang.String r9 = r0.toString()
            com.tencent.mars.xlog.Log.i(r2, r9)
        La2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ic2.l0.n(int):boolean");
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (((java.lang.Boolean) ((jz5.n) this.f290340d).getValue()).booleanValue()) {
            return;
        }
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        kotlin.jvm.internal.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.cgi.NetSceneFinderSync");
        db2.d6 d6Var = (db2.d6) m1Var;
        com.tencent.mm.modelbase.o oVar = d6Var.f227944g;
        com.tencent.mm.protobuf.f fVar = oVar.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSyncRequest");
        int integer = ((r45.zy2) fVar).getInteger(1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errType ");
        sb6.append(i17);
        sb6.append(", errCode ");
        sb6.append(i18);
        sb6.append(", errMsg ");
        sb6.append(str);
        sb6.append(", cmdList=");
        com.tencent.mm.modelbase.n nVar = oVar.f70711b;
        com.tencent.mm.protobuf.f fVar2 = nVar.f70700a;
        kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSyncResponse");
        java.util.LinkedList list = ((r45.az2) fVar2).getList(6);
        kotlin.jvm.internal.o.f(list, "getCmdList(...)");
        sb6.append(list.size());
        sb6.append(", (curSelector,selector) (");
        sb6.append(this.f290343g);
        sb6.append(',');
        sb6.append(integer);
        sb6.append("), continueFlag ");
        com.tencent.mm.protobuf.f fVar3 = nVar.f70700a;
        kotlin.jvm.internal.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSyncResponse");
        sb6.append(((r45.az2) fVar3).getInteger(2));
        com.tencent.mars.xlog.Log.i("Finder.SyncExtension", sb6.toString());
        boolean z17 = i17 == 0 && i18 == 0;
        com.tencent.mm.protobuf.f fVar4 = oVar.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar4, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSyncRequest");
        com.tencent.mm.protobuf.f fVar5 = nVar.f70700a;
        kotlin.jvm.internal.o.e(fVar5, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSyncResponse");
        i(z17, d6Var.f227946i, (r45.zy2) fVar4, (r45.az2) fVar5);
        com.tencent.mars.xlog.Log.i("Finder.SyncExtension", "[onSceneEnd] cost=" + (android.os.SystemClock.uptimeMillis() - uptimeMillis) + "ms");
    }
}
