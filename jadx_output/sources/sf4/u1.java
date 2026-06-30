package sf4;

/* loaded from: classes4.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public static final sf4.u1 f407583a = new sf4.u1();

    /* renamed from: b, reason: collision with root package name */
    public static final sf4.x f407584b = new sf4.x();

    /* renamed from: c, reason: collision with root package name */
    public static int f407585c;

    /* renamed from: d, reason: collision with root package name */
    public static int f407586d;

    /* renamed from: e, reason: collision with root package name */
    public static int f407587e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f407588f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f407589g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Set f407590h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.List f407591i;

    /* renamed from: j, reason: collision with root package name */
    public static int f407592j;

    /* renamed from: k, reason: collision with root package name */
    public static sf4.o1 f407593k;

    /* renamed from: l, reason: collision with root package name */
    public static volatile java.lang.String f407594l;

    /* renamed from: m, reason: collision with root package name */
    public static volatile java.lang.Long f407595m;

    /* renamed from: n, reason: collision with root package name */
    public static long f407596n;

    /* renamed from: o, reason: collision with root package name */
    public static long f407597o;

    /* renamed from: p, reason: collision with root package name */
    public static long f407598p;

    static {
        java.util.Map synchronizedMap = java.util.Collections.synchronizedMap(new java.util.HashMap());
        kotlin.jvm.internal.o.f(synchronizedMap, "synchronizedMap(...)");
        f407588f = synchronizedMap;
        java.util.Map synchronizedMap2 = java.util.Collections.synchronizedMap(new java.util.HashMap());
        kotlin.jvm.internal.o.f(synchronizedMap2, "synchronizedMap(...)");
        f407589g = synchronizedMap2;
        java.util.Set synchronizedSet = java.util.Collections.synchronizedSet(new java.util.HashSet());
        kotlin.jvm.internal.o.f(synchronizedSet, "synchronizedSet(...)");
        f407590h = synchronizedSet;
        java.util.List synchronizedList = java.util.Collections.synchronizedList(new java.util.LinkedList());
        kotlin.jvm.internal.o.f(synchronizedList, "synchronizedList(...)");
        f407591i = synchronizedList;
        f407592j = 3;
        f407593k = new sf4.o1(new java.util.ArrayList(), 0, 0, null, false, 16, null);
    }

    public static final void a(sf4.u1 u1Var, java.lang.String str) {
        u1Var.getClass();
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.StoryVideoPreloadMgr", "onVideoSourceChange: " + str, new java.lang.Object[0]);
        if4.h hVar = (if4.h) f407588f.get(str);
        if (hVar != null) {
            u1Var.d(hVar);
            nf4.o b17 = ef4.k0.f252459a.b(hVar);
            b17.field_cacheSize = 0;
            b17.field_totalSize = 0;
            ef4.w.f252468t.k().D0(b17);
            com.tencent.mm.vfs.w6.h(b17.field_filePath);
        }
    }

    public static void b(sf4.u1 u1Var, java.util.List videoItemList, int i17, int i18, java.lang.Object obj) {
        int intValue;
        java.lang.Object obj2;
        int i19 = 0;
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        u1Var.getClass();
        kotlin.jvm.internal.o.g(videoItemList, "videoItemList");
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.StoryVideoPreloadMgr", "addPreloadVideo withList " + videoItemList.size(), new java.lang.Object[0]);
        boolean h17 = u1Var.h();
        sf4.x xVar = f407584b;
        int i27 = xVar.f407609b;
        int g17 = u1Var.g();
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", "addPreloadVideo withList, isGoodNetwork:" + h17 + ", isBadNetwork:" + (1 <= g17 && g17 <= i27) + ", currentSpeed:" + u1Var.g() + " preloadRunningSet " + f407591i.size() + " downloadExpect " + i17);
        int i28 = xVar.f407609b;
        int g18 = u1Var.g();
        java.util.List list = 1 <= g18 && g18 <= i28 ? xVar.f407611d : xVar.f407610c;
        synchronized (videoItemList) {
            java.util.Iterator it = videoItemList.iterator();
            while (it.hasNext()) {
                if4.h hVar = (if4.h) it.next();
                sf4.u1 u1Var2 = f407583a;
                if (u1Var2.j(hVar)) {
                    if (i17 > 0) {
                        intValue = i17;
                    } else {
                        intValue = ((java.lang.Number) (i19 < list.size() ? list.get(i19) : kz5.n0.i0(list))).intValue();
                    }
                    int n17 = u1Var2.n(i19);
                    ef4.k0 k0Var = ef4.k0.f252459a;
                    java.lang.String a17 = k0Var.a(hVar.f291255c, hVar.f291258f.f390023f);
                    int c17 = u1Var2.c(a17, hVar.f291258f, intValue, u1Var2.h());
                    nf4.o b17 = k0Var.b(hVar);
                    java.util.Iterator it6 = f407591i.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = it6.next();
                            if (kotlin.jvm.internal.o.b(((sf4.q1) obj2).f407573c, a17)) {
                                break;
                            }
                        }
                    }
                    if (obj2 != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", "addPreloadVideo withList, " + a17 + ", already prealoding!");
                    } else {
                        if (!b17.u0() && (b17.field_cacheSize / b17.field_totalSize) * 100 < c17) {
                            if (f407583a.k(hVar, c17, n17, new sf4.q1(0, i19, hVar, intValue, n17))) {
                                i19++;
                            }
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", "addPreloadVideo withList, " + a17 + ", already reach cache size! cacheSize:" + b17.field_cacheSize + ", totalSize:" + b17.field_totalSize + ", cachePercent:" + ((b17.field_cacheSize / b17.field_totalSize) * 100));
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", "finish addPreloadVideo withList, total pull video task:" + i19 + " preloadRunningSet " + f407591i.size());
    }

    public static boolean l(sf4.u1 u1Var, java.util.List groupItems, int i17, int i18, boolean z17, int i19, java.lang.Object obj) {
        int i27;
        if4.f fVar;
        if4.h hVar;
        boolean z18 = (i19 & 8) != 0 ? true : z17;
        u1Var.getClass();
        kotlin.jvm.internal.o.g(groupItems, "groupItems");
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", "setPreloadQueueFromGallery, galleryItems size:" + groupItems.size() + ", positionV:" + i17 + "  positionH:" + i18 + ", skipPosition:" + z18);
        sf4.o1 o1Var = f407593k;
        o1Var.getClass();
        if (!(!o1Var.b(groupItems) && o1Var.f407539b == i18 && o1Var.f407538a == i17)) {
            if (i17 >= 0 && i18 >= 0 && i17 < groupItems.size() && i18 < ((java.util.List) groupItems.get(i17)).size() && (fVar = (if4.f) ((java.util.List) groupItems.get(i17)).get(i18)) != null && (hVar = fVar.f291247e) != null) {
                f407596n = hVar.f291254b;
            }
            f407597o = 0L;
            f407592j = 0;
            f407593k = new sf4.o1(groupItems, i17, i18, f407593k, z18);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            synchronized (groupItems) {
                int i28 = 0;
                for (java.lang.Object obj2 : groupItems) {
                    int i29 = i28 + 1;
                    if (i28 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    java.util.List list = (java.util.List) obj2;
                    if (i28 >= i17 && list.size() > 0) {
                        arrayList.add(java.lang.Integer.valueOf(((if4.f) list.get(0)).f291247e.f291253a));
                    }
                    i28 = i29;
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (i17 < groupItems.size() && i18 < ((java.util.List) groupItems.get(i17)).size()) {
                int size = ((java.util.List) groupItems.get(i17)).size();
                while (i18 < size) {
                    arrayList2.add(java.lang.Integer.valueOf(((if4.f) ((java.util.List) groupItems.get(i17)).get(i18)).f291247e.f291253a));
                    i18++;
                }
            }
            java.util.List list2 = f407591i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj3 : list2) {
                sf4.q1 q1Var = (sf4.q1) obj3;
                if ((arrayList.contains(java.lang.Integer.valueOf(q1Var.f407571a.f291253a)) || arrayList2.contains(java.lang.Integer.valueOf(q1Var.f407571a.f291253a))) ? false : true) {
                    arrayList3.add(obj3);
                }
            }
            synchronized (arrayList3) {
                java.util.Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    f407583a.d(((sf4.q1) it.next()).f407571a);
                }
            }
            f407585c = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_story_preload_strategy, 1);
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_story_preload_speed_good, 450);
            int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_story_preload_speed_bad, 200);
            f407586d = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_story_preload_force_preload, 0);
            f407587e = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_story_preload_force_canload, 100);
            sf4.x xVar = f407584b;
            xVar.f407608a = Ni;
            xVar.f407609b = Ni2;
            int g17 = u1Var.g();
            com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", "setPreloadQueueFromGallery clicfg_story_preload_strategy " + f407585c + " clicfg_story_preload_speed_good:" + Ni + " clicfg_story_preload_speed_bad:" + Ni2 + " clicfg_story_preload_force_preload " + f407586d + "  clicfg_story_preload_force_canload: " + f407587e + " speed:" + g17);
            if (g17 > 0 && (i27 = f407587e) > 0 && g17 < i27) {
                com.tencent.mars.xlog.Log.w("MicroMsg.StoryVideoPreloadMgr", "setPreloadQueueFromGallery speed too low then pass " + g17 + " clicfg_story_preload_force_canload: " + f407587e);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.addAll(f407591i);
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    u1Var.d(((sf4.q1) it6.next()).f407571a);
                }
            }
        }
        return false;
    }

    public final int c(java.lang.String str, r45.xe6 xe6Var, int i17, boolean z17) {
        int max;
        float f17 = xe6Var.f390040z;
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", "calcPreloadPercent, cacheSecondsDowngrade:" + i17 + ", mediaId:" + str + ", duration:" + f17 + ", isGoodNetwork:" + z17 + " media:" + xe6Var.f390040z);
        int i18 = z17 ? 5 : 3;
        sf4.x xVar = f407584b;
        if (f17 <= 0.0f) {
            xVar.getClass();
            max = 30;
        } else {
            max = (f17 > ((float) i18) || i17 > 0) ? (int) ((java.lang.Math.max(3, i17) / f17) * 100.0d) : 100;
        }
        xVar.getClass();
        if (max > 30) {
            return max;
        }
        xVar.getClass();
        return 30;
    }

    public final void d(if4.h videoItem) {
        java.lang.String b17;
        kotlin.jvm.internal.o.g(videoItem, "videoItem");
        java.lang.String str = videoItem.f291258f.f390023f;
        int i17 = videoItem.f291255c;
        if (str == null) {
            b17 = "story_local_video_" + i17;
        } else {
            b17 = com.tencent.mm.modelcdntran.i2.b("storyvideo", i17, "story", str);
        }
        java.lang.Object obj = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
            b17 = null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", "cancelPreloadTask, videoItem:" + b17);
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(b17);
        java.util.List list = f407591i;
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (kotlin.jvm.internal.o.b(((sf4.q1) next).f407573c, b17)) {
                obj = next;
                break;
            }
        }
        sf4.q1 q1Var = (sf4.q1) obj;
        if (q1Var != null) {
            list.remove(q1Var);
            int i18 = f407592j;
            if (i18 > 0) {
                f407592j = i18 - 1;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005b, code lost:
    
        if (r5 >= 30) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(if4.h r5) {
        /*
            r4 = this;
            java.lang.String r0 = "item"
            kotlin.jvm.internal.o.g(r5, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "checkPreLoad "
            r0.<init>(r1)
            r0.append(r5)
            r1 = 32
            r0.append(r1)
            java.lang.String r1 = com.tencent.mm.sdk.platformtools.z3.a()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.StoryVideoPreloadMgr"
            com.tencent.mars.xlog.Log.i(r1, r0)
            boolean r0 = r4.i(r5)
            r2 = 0
            if (r0 == 0) goto L35
            java.lang.String r5 = "checkPreLoad checkCanPlay isLocalVideo"
            com.tencent.mars.xlog.Log.i(r1, r5)
            r4.m(r2)
            return
        L35:
            ef4.k0 r0 = ef4.k0.f252459a
            nf4.o r5 = r0.b(r5)
            boolean r0 = r5.u0()
            r3 = 1
            if (r0 == 0) goto L43
            goto L5d
        L43:
            int r0 = r5.field_totalSize
            if (r0 > 0) goto L48
            goto L5e
        L48:
            int r5 = r5.field_cacheSize
            float r5 = (float) r5
            float r0 = (float) r0
            float r5 = r5 / r0
            r0 = 100
            float r0 = (float) r0
            float r5 = r5 * r0
            sf4.x r0 = sf4.u1.f407584b
            r0.getClass()
            r0 = 30
            float r0 = (float) r0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 < 0) goto L5e
        L5d:
            r2 = r3
        L5e:
            if (r2 != r3) goto L69
            java.lang.String r5 = "checkPreLoad checkCanPlay true"
            com.tencent.mars.xlog.Log.i(r1, r5)
            r4.m(r3)
            return
        L69:
            int r5 = sf4.u1.f407586d
            if (r5 != r3) goto L70
            r4.m(r3)
        L70:
            java.lang.String r5 = "nothing can checkPreLoad"
            com.tencent.mars.xlog.Log.i(r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sf4.u1.e(if4.h):void");
    }

    public final dn.o f(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", "createVideoPreloadCDNTask, mediaId:" + str + ", path:" + str3 + ", url:" + str2 + ", preloadPercent:" + i17 + ", connectionCount:" + i18);
        dn.o oVar = new dn.o();
        oVar.f241785d = "task_StoryVideoPreloadMgr";
        oVar.field_mediaId = str;
        oVar.M1 = str2;
        oVar.Y = 2;
        oVar.H1 = 2;
        oVar.Z = 6;
        oVar.V1 = i17;
        oVar.field_preloadRatio = i17;
        oVar.f241809y0 = 4;
        oVar.field_fullpath = str3;
        oVar.f241787f = new sf4.t1();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        oVar.f241796p0 = new sf4.s1(android.os.SystemClock.elapsedRealtime());
        oVar.f241806x0 = i18;
        oVar.field_fileType = 20302;
        oVar.field_requestVideoFormat = ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).Ai(2, str3);
        return oVar;
    }

    public final int g() {
        return ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).getRecentAverageSpeed(2);
    }

    public final boolean h() {
        return g() >= f407584b.f407608a;
    }

    public final boolean i(if4.h hVar) {
        if (hVar.a()) {
            return true;
        }
        ef4.k0 k0Var = ef4.k0.f252459a;
        long k17 = com.tencent.mm.vfs.w6.k(k0Var.d(hVar.f291258f));
        java.lang.String str = hVar.f291256d;
        if (k17 > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", "isLocalVideo video downloadDone " + hVar.f291258f.A + " username:" + str);
            return true;
        }
        if (!k0Var.b(hVar).u0()) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", " isLocalVideo video download finish " + hVar.f291258f.A + " username:" + str);
        return true;
    }

    public final boolean j(if4.h hVar) {
        java.lang.String b17;
        if (i(hVar) || hVar.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", "addPreloadVideo fail, " + hVar + " isLocalVideo or fake video");
            return false;
        }
        int i17 = hVar.f291255c;
        java.lang.String str = hVar.f291258f.f390023f;
        if (str == null) {
            b17 = "story_local_video_" + i17;
        } else {
            b17 = com.tencent.mm.modelcdntran.i2.b("storyvideo", i17, "story", str);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
            b17 = null;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(b17) && !com.tencent.mm.sdk.platformtools.t8.K0(hVar.f291258f.f390023f) && !r26.i0.q(f407594l, b17, false, 2, null)) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", "addPreloadVideo:" + b17 + ", already request preload or url " + hVar.f291258f.f390023f);
        return false;
    }

    public final synchronized boolean k(if4.h videoItem, int i17, int i18, sf4.q1 taskInfo) {
        kotlin.jvm.internal.o.g(videoItem, "videoItem");
        kotlin.jvm.internal.o.g(taskInfo, "taskInfo");
        int i19 = 0;
        if (!videoItem.a() && !com.tencent.mm.sdk.platformtools.t8.K0(videoItem.f291258f.f390023f)) {
            if (i(videoItem)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", "preloadVideoWithPercent, isLocalVideo: " + videoItem.f291258f.f390023f);
                return false;
            }
            java.lang.String str = videoItem.f291258f.f390023f;
            java.lang.String str2 = taskInfo.f407573c;
            nf4.o b17 = ef4.k0.f252459a.b(videoItem);
            com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", "preloadVideoWithPercent, " + str2 + ", " + i17 + ", playingMediaId:" + f407594l + ", " + b17.field_filePath + ", " + str + "  videoCache " + b17);
            if (str2 == null || r26.i0.q(f407594l, str2, false, 2, null)) {
                return false;
            }
            java.lang.String str3 = videoItem.f291256d;
            java.lang.String i27 = com.tencent.mm.vfs.w6.i(ef4.c0.f252438a.a(str3).concat("video/"), true);
            kotlin.jvm.internal.o.d(i27);
            com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoLogic", "get story video dir %s username %s", i27, str3);
            com.tencent.mm.vfs.w6.u(i27);
            kotlin.jvm.internal.o.d(str);
            java.lang.String field_filePath = b17.field_filePath;
            kotlin.jvm.internal.o.f(field_filePath, "field_filePath");
            dn.o f17 = f(str2, str, field_filePath, i17, i18);
            ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(f17);
            com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", "preloadVideoWithPercent:" + f17 + ", currentSpeed:" + g());
            f407588f.put(str2, videoItem);
            f407589g.put(str2, java.lang.Integer.valueOf(i17));
            java.util.Iterator it = f407591i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i19 = -1;
                    break;
                }
                if (kotlin.jvm.internal.o.b(((sf4.q1) it.next()).f407573c, taskInfo.f407573c)) {
                    break;
                }
                i19++;
            }
            if (i19 > 0) {
                f407591i.set(i19, taskInfo);
            } else {
                f407591i.add(taskInfo);
            }
            f407590h.remove(str2);
            return true;
        }
        return false;
    }

    public final void m(boolean z17) {
        java.lang.String str;
        java.util.List list;
        boolean z18;
        int i17;
        java.lang.Object obj;
        java.util.List list2;
        int i18;
        int i19;
        boolean h17 = h();
        sf4.x xVar = f407584b;
        int i27 = xVar.f407609b;
        int g17 = g();
        boolean z19 = 1 <= g17 && g17 <= i27;
        int g18 = g();
        if (z17 && g18 > 0 && (i19 = f407587e) > 0 && g18 < i19) {
            com.tencent.mars.xlog.Log.w("MicroMsg.StoryVideoPreloadMgr", "speed too low then pass " + g18 + " clicfg_story_preload_force_canload: " + f407587e + " callerFrom " + com.tencent.mm.sdk.platformtools.z3.a());
            return;
        }
        int i28 = 3;
        int i29 = z19 ? 1 : 3;
        if (f407585c == 1) {
            i29 = 1;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPreloadQueue, isGoodNetwork:");
        sb6.append(h17);
        sb6.append(", isBadNetwork:");
        sb6.append(z19);
        sb6.append(", currentSpeed:");
        sb6.append(g());
        sb6.append(" preloadRunningSet ");
        java.util.List list3 = f407591i;
        sb6.append(list3.size());
        sb6.append(" maxTaskNum ");
        sb6.append(i29);
        java.lang.String str2 = " totalPreLoadOneItemSelect ";
        sb6.append(" totalPreLoadOneItemSelect ");
        sb6.append(f407592j);
        sb6.append(" checkNet ");
        sb6.append(z17);
        sb6.append(" callerFrom ");
        sb6.append(com.tencent.mm.sdk.platformtools.z3.a());
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", sb6.toString());
        int i37 = xVar.f407609b;
        int g19 = g();
        java.util.List list4 = 1 <= g19 && g19 <= i37 ? xVar.f407611d : xVar.f407610c;
        int i38 = 0;
        while (list3.size() < i29 && i38 < list4.size() && f407592j < i28) {
            int intValue = ((java.lang.Number) list4.get(i38)).intValue();
            int n17 = n(i38);
            while (true) {
                sf4.o1 o1Var = f407593k;
                jz5.l lVar = null;
                int i39 = 0;
                while (true) {
                    java.util.List list5 = o1Var.f407547j;
                    if (i39 >= list5.size() || lVar != null) {
                        break;
                    }
                    try {
                        i18 = o1Var.f407544g;
                        list2 = list4;
                    } catch (java.lang.Exception e17) {
                        e = e17;
                        list2 = list4;
                    }
                    try {
                    } catch (java.lang.Exception e18) {
                        e = e18;
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GroupData.StoryVideoPreloadMgr", e, "error on produce", new java.lang.Object[0]);
                        lVar = null;
                        com.tencent.mars.xlog.Log.i("MicroMsg.GroupData.StoryVideoPreloadMgr", "produceVideoItem walkVertical:" + o1Var.f407542e + "  walkHorizontal:" + o1Var.f407543f + " positionV:" + o1Var.f407538a + " positionH:" + o1Var.f407539b + ", ret:" + lVar);
                        i39++;
                        list4 = list2;
                    }
                    if (i18 > o1Var.f407541d) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.GroupData.StoryVideoPreloadMgr", "stop preload now " + o1Var.f407544g);
                        lVar = null;
                        com.tencent.mars.xlog.Log.i("MicroMsg.GroupData.StoryVideoPreloadMgr", "produceVideoItem walkVertical:" + o1Var.f407542e + "  walkHorizontal:" + o1Var.f407543f + " positionV:" + o1Var.f407538a + " positionH:" + o1Var.f407539b + ", ret:" + lVar);
                        i39++;
                        list4 = list2;
                    } else {
                        lVar = (jz5.l) ((yz5.a) list5.get(i18 % list5.size())).invoke();
                        o1Var.f407544g++;
                        com.tencent.mars.xlog.Log.i("MicroMsg.GroupData.StoryVideoPreloadMgr", "produceVideoItem walkVertical:" + o1Var.f407542e + "  walkHorizontal:" + o1Var.f407543f + " positionV:" + o1Var.f407538a + " positionH:" + o1Var.f407539b + ", ret:" + lVar);
                        i39++;
                        list4 = list2;
                    }
                }
                list = list4;
                z18 = false;
                if (lVar == null) {
                    i17 = i29;
                    str = str2;
                    break;
                }
                if4.h hVar = (if4.h) lVar.f302833d;
                java.lang.Object obj2 = lVar.f302834e;
                sf4.q1 q1Var = (sf4.q1) obj2;
                java.lang.String str3 = q1Var.f407573c;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("try preload mediaId ");
                sb7.append(str3);
                sb7.append(" videoItem:");
                sb7.append(hVar);
                sb7.append(" pos:");
                sb7.append(obj2);
                sb7.append("  groupinfo ");
                sf4.o1 o1Var2 = f407593k;
                sb7.append("positionV:" + o1Var2.f407538a + ", positionH:" + o1Var2.f407539b + ", walkVertical:" + o1Var2.f407542e + ", walkHorizontal:" + o1Var2.f407543f);
                sb7.append(" quota:");
                sb7.append(intValue);
                sb7.append("  fromTag:startPreLoad");
                com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", sb7.toString());
                java.util.Iterator it = list3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (kotlin.jvm.internal.o.b(((sf4.q1) obj).f407573c, str3)) {
                            break;
                        }
                    }
                }
                sf4.q1 q1Var2 = (sf4.q1) obj;
                if (q1Var2 == null || intValue > q1Var2.f407572b) {
                    if ((str3.length() == 0 ? null : str3) != null) {
                        int c17 = c(str3, hVar.f291258f, intValue, h());
                        nf4.o b17 = ef4.k0.f252459a.b(hVar);
                        i17 = i29;
                        if (b17.u0()) {
                            str = str2;
                        } else {
                            str = str2;
                            if ((b17.field_cacheSize / b17.field_totalSize) * 100 < c17) {
                                if (k(hVar, c17, n17, q1Var)) {
                                    q1Var.f407572b = intValue;
                                    z18 = true;
                                    break;
                                } else {
                                    list4 = list;
                                    i29 = i17;
                                    str2 = str;
                                }
                            }
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", "pull preload video, " + str3 + ", already reach cache size! cacheSize:" + b17.field_cacheSize + ", totalSize:" + b17.field_totalSize + ", cachePercent:" + ((b17.field_cacheSize / b17.field_totalSize) * 100) + "  fromTag:startPreLoad");
                        i29 = i17;
                        str2 = str;
                        list4 = list;
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", "no need add quota " + intValue + " cur:" + q1Var2.f407572b + " fromTag:startPreLoad");
                }
                list4 = list;
            }
            if (!z18) {
                break;
            }
            i38++;
            f407592j++;
            i29 = i17;
            str2 = str;
            i28 = 3;
            list4 = list;
        }
        str = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", "startPreloadQueue finish loop preload queue, current queue size: " + list3.size() + ", pullPreloadTaskNum:0, preloadVideoNum:" + i38 + " preloadRunningSet " + list3.size() + str + f407592j + ' ');
    }

    public final int n(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryVideoPreloadMgr", "taskConnectionCount: " + i17);
        sf4.x xVar = f407584b;
        java.util.List list = xVar.f407612e;
        if (i17 >= list.size()) {
            i17 = xVar.f407612e.size() - 1;
        }
        return ((java.lang.Number) list.get(i17)).intValue();
    }
}
