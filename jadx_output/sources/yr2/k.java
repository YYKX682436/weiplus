package yr2;

/* loaded from: classes10.dex */
public final class k {
    public static final yr2.g X = new yr2.g(null);
    public static boolean Y;
    public int A;
    public boolean B;
    public int I;
    public int K;
    public int L;
    public float M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int V;

    /* renamed from: j, reason: collision with root package name */
    public int f464693j;

    /* renamed from: k, reason: collision with root package name */
    public long f464694k;

    /* renamed from: l, reason: collision with root package name */
    public long f464695l;

    /* renamed from: m, reason: collision with root package name */
    public long f464696m;

    /* renamed from: t, reason: collision with root package name */
    public boolean f464703t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f464704u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f464705v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f464707x;

    /* renamed from: y, reason: collision with root package name */
    public int f464708y;

    /* renamed from: z, reason: collision with root package name */
    public int f464709z;

    /* renamed from: a, reason: collision with root package name */
    public final yr2.o f464684a = new yr2.o();

    /* renamed from: b, reason: collision with root package name */
    public int f464685b = 1;

    /* renamed from: c, reason: collision with root package name */
    public int f464686c = 4;

    /* renamed from: d, reason: collision with root package name */
    public int f464687d = a06.d.b(30.000002f);

    /* renamed from: e, reason: collision with root package name */
    public long f464688e = 2097152;

    /* renamed from: f, reason: collision with root package name */
    public int f464689f = 1;

    /* renamed from: g, reason: collision with root package name */
    public int f464690g = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f464691h = 4;

    /* renamed from: i, reason: collision with root package name */
    public int f464692i = a06.d.b(0.0f);

    /* renamed from: n, reason: collision with root package name */
    public int f464697n = 1;

    /* renamed from: o, reason: collision with root package name */
    public int f464698o = 2;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f464699p = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f464700q = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: r, reason: collision with root package name */
    public final kk.l f464701r = new kk.l(300);

    /* renamed from: s, reason: collision with root package name */
    public final boolean f464702s = com.tencent.mm.plugin.finder.storage.t70.f127590a.X2();

    /* renamed from: w, reason: collision with root package name */
    public boolean f464706w = true;
    public int C = -1;
    public int D = 10000;
    public java.lang.String E = "";
    public int F = -1;
    public int G = -1;
    public int H = -1;

    /* renamed from: J, reason: collision with root package name */
    public final int f464683J = ((java.lang.Number) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.X).getValue()).intValue();
    public final java.util.concurrent.CopyOnWriteArrayList T = new java.util.concurrent.CopyOnWriteArrayList();
    public final java.util.concurrent.CopyOnWriteArrayList U = new java.util.concurrent.CopyOnWriteArrayList();
    public final java.util.concurrent.ConcurrentHashMap W = new java.util.concurrent.ConcurrentHashMap();

    static {
        ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
        Y = d11.s.Di(4);
    }

    public final jz5.o a(java.lang.String str, long j17, java.util.LinkedList linkedList, java.lang.String str2) {
        java.lang.Object obj;
        java.lang.String str3;
        java.lang.Object obj2;
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            r45.vf2 vf2Var = (r45.vf2) obj;
            if (r26.i0.p(vf2Var.getString(3), str, true) && ((long) vf2Var.getInteger(2)) < j17) {
                break;
            }
        }
        r45.vf2 vf2Var2 = (r45.vf2) obj;
        if (vf2Var2 == null) {
            java.util.ListIterator listIterator = linkedList.listIterator(linkedList.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj2 = null;
                    break;
                }
                obj2 = listIterator.previous();
                if (r26.i0.p(((r45.vf2) obj2).getString(3), str, true)) {
                    break;
                }
            }
            vf2Var2 = (r45.vf2) obj2;
            if (vf2Var2 == null) {
                vf2Var2 = null;
            }
            str3 = "step#2";
        } else {
            str3 = "step#1";
        }
        java.lang.String str4 = str2 + '.' + str3;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("findSpecInternal ");
        sb6.append(str2);
        sb6.append(" reqFormat");
        sb6.append(str);
        sb6.append(" maxBitRate:");
        sb6.append(j17);
        sb6.append(" output:");
        sb6.append(vf2Var2 != null ? yr2.l.c(vf2Var2) : null);
        sb6.append(" step:");
        sb6.append(str4);
        sb6.append(" input:");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            arrayList.add(yr2.l.c((r45.vf2) it6.next()));
        }
        sb6.append(arrayList);
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("Finder.MediaPreloadModel", sb6.toString());
        if (vf2Var2 == null) {
            return null;
        }
        return new jz5.o(vf2Var2, str4 + '+', java.lang.Long.valueOf(this.f464694k));
    }

    public final mn2.g4 b(long j17, r45.mb4 media) {
        kotlin.jvm.internal.o.g(media, "media");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        jz5.o c17 = c(j17, media, false, 0);
        r45.vf2 vf2Var = (r45.vf2) c17.f302841d;
        yr2.g gVar = X;
        java.lang.String string = vf2Var.getString(3);
        if (string == null) {
            string = "";
        }
        mn2.g4 g4Var = new mn2.g4(media, gVar.c(vf2Var.getString(0)), vf2Var.getString(0), gVar.b(string), vf2Var.getInteger(4), null, vf2Var.getBoolean(20), vf2Var, 32, null);
        this.f464701r.put(g4Var.n(), c17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[findTargetMedia] feedId=");
        sb6.append(pm0.v.u(j17));
        sb6.append(" stage=");
        sb6.append((java.lang.String) c17.f302842e);
        sb6.append(" target");
        sb6.append(yr2.l.c(vf2Var));
        sb6.append(" sdrSpec=");
        java.util.LinkedList<r45.vf2> list = media.getList(15);
        kotlin.jvm.internal.o.f(list, "getSpec(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (r45.vf2 vf2Var2 : list) {
            kotlin.jvm.internal.o.d(vf2Var2);
            arrayList.add(yr2.l.c(vf2Var2));
        }
        sb6.append(arrayList);
        sb6.append(" hdrSpec=");
        java.util.LinkedList<r45.vf2> list2 = media.getList(44);
        kotlin.jvm.internal.o.f(list2, "getHdr_spec(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list2, 10));
        for (r45.vf2 vf2Var3 : list2) {
            kotlin.jvm.internal.o.d(vf2Var3);
            arrayList2.add(yr2.l.c(vf2Var3));
        }
        sb6.append(arrayList2);
        sb6.append(" hlsSpec=");
        java.util.LinkedList<r45.jb1> list3 = media.getList(43);
        kotlin.jvm.internal.o.f(list3, "getHls_spec(...)");
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list3, 10));
        for (r45.jb1 jb1Var : list3) {
            kotlin.jvm.internal.o.d(jb1Var);
            arrayList3.add("Spec[" + jb1Var.getString(3) + ' ' + jb1Var.getString(0) + ' ' + com.tencent.mm.sdk.platformtools.t8.f0(jb1Var.getInteger(1)) + ']');
        }
        sb6.append(arrayList3);
        sb6.append(" maxBitRate:");
        sb6.append(this.f464694k);
        sb6.append(" isOverseasUser:");
        sb6.append(yr2.g.a(gVar));
        sb6.append(" Cost=");
        sb6.append(java.lang.System.currentTimeMillis() - currentTimeMillis);
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("Finder.MediaPreloadModel", sb6.toString());
        return g4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x027a, code lost:
    
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127770j9).getValue()).r()).intValue() == r11) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02d1, code lost:
    
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127770j9).getValue()).r()).intValue() == r11) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0238, code lost:
    
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127770j9).getValue()).r()).intValue() == 1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:216:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0a5c  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0a74  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0aa3  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0ab8  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0aca  */
    /* JADX WARN: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0aa8  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0a6e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x09c5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jz5.o c(long r43, r45.mb4 r45, boolean r46, int r47) {
        /*
            Method dump skipped, instructions count: 2765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yr2.k.c(long, r45.mb4, boolean, int):jz5.o");
    }

    public final int d() {
        return this.O;
    }

    public final int e() {
        return this.P;
    }

    public final int f() {
        return this.Q;
    }

    public final kk.l g() {
        return this.f464701r;
    }

    public final int h() {
        return this.K;
    }

    public final long i() {
        return this.f464694k;
    }

    public final long j() {
        return this.f464688e;
    }

    public final int k() {
        return this.f464687d;
    }

    public final int l() {
        return this.f464689f;
    }

    public final int m() {
        return this.f464708y;
    }

    public final int n() {
        return this.f464686c;
    }

    public final int o() {
        return this.f464691h;
    }

    public final int p() {
        return this.f464690g;
    }

    public final int q() {
        return this.f464685b;
    }

    public final int r(long j17) {
        int ceil;
        if (this.f464687d <= 0) {
            this.f464687d = a06.d.b(30.000002f);
        }
        if (j17 <= 0) {
            ceil = this.f464687d;
        } else {
            ceil = this.C > 0 ? (int) java.lang.Math.ceil((r0 * 100.0f) / ((float) j17)) : j17 < 60000 ? 100 : this.f464687d;
        }
        return java.lang.Math.min(100, ceil);
    }

    public final int s() {
        return this.f464692i;
    }

    public final int t() {
        return this.f464693j;
    }

    public final java.util.LinkedList u(java.util.LinkedList linkedList) {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Md).getValue()).r()).intValue() == 0) {
            return new java.util.LinkedList();
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.protobuf.f parseFrom = new r45.vf2().parseFrom(((r45.jb1) it.next()).toByteArray());
            r45.vf2 vf2Var = parseFrom instanceof r45.vf2 ? (r45.vf2) parseFrom : null;
            if (vf2Var != null) {
                vf2Var.set(20, java.lang.Boolean.TRUE);
                linkedList2.add(vf2Var);
            }
        }
        return linkedList2;
    }

    public final boolean v() {
        return this.f464702s;
    }

    public final boolean w() {
        return this.f464707x;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0268 A[LOOP:0: B:21:0x0262->B:23:0x0268, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List x(ek4.b r48, long r49, r45.mb4 r51, int r52) {
        /*
            Method dump skipped, instructions count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yr2.k.x(ek4.b, long, r45.mb4, int):java.util.List");
    }

    public final void y(r45.sq2 info, java.util.HashMap feedSet) {
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(feedSet, "feedSet");
        this.f464695l = info.getLong(0);
        r45.rq2 rq2Var = (r45.rq2) info.getCustom(1);
        if (rq2Var != null) {
            this.f464685b = rq2Var.getInteger(0);
            this.f464686c = rq2Var.getInteger(1);
            this.f464687d = a06.d.b(rq2Var.getFloat(3) * 100.0f);
            this.f464694k = rq2Var.getInteger(2);
            this.f464688e = rq2Var.getInteger(4);
            int integer = rq2Var.getInteger(5);
            if (1 >= integer) {
                integer = 1;
            }
            this.f464689f = integer;
            int integer2 = rq2Var.getInteger(6);
            this.f464690g = 1 < integer2 ? integer2 : 1;
            this.f464691h = rq2Var.getInteger(7);
            this.f464692i = a06.d.b(rq2Var.getFloat(8) * 100.0f);
            this.f464693j = rq2Var.getInteger(9);
            this.f464696m = rq2Var.getInteger(10);
            this.f464697n = rq2Var.getInteger(11);
            this.f464698o = rq2Var.getInteger(12);
            this.f464708y = rq2Var.getInteger(13);
            this.f464709z = rq2Var.getInteger(14);
            this.A = rq2Var.getInteger(15);
            this.B = rq2Var.getBoolean(16);
            this.C = rq2Var.getInteger(18);
            this.F = rq2Var.getInteger(19);
            this.G = rq2Var.getInteger(20);
            this.H = rq2Var.getInteger(21);
            this.I = rq2Var.getInteger(22);
            rq2Var.getInteger(23);
            this.K = rq2Var.getInteger(24);
            this.L = rq2Var.getInteger(25);
            this.M = (float) rq2Var.getDouble(29);
            this.N = rq2Var.getBoolean(40);
            this.O = rq2Var.getInteger(43);
            this.P = rq2Var.getInteger(44);
            this.Q = rq2Var.getInteger(45);
            this.R = rq2Var.getInteger(33);
            this.S = rq2Var.getInteger(49);
            rq2Var.getInteger(50);
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.T;
            copyOnWriteArrayList.clear();
            java.util.LinkedList list = rq2Var.getList(51);
            if (list != null) {
                copyOnWriteArrayList.addAll(list);
            }
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = this.U;
            copyOnWriteArrayList2.clear();
            java.util.LinkedList list2 = rq2Var.getList(52);
            if (list2 != null) {
                copyOnWriteArrayList2.addAll(list2);
            }
            this.V = rq2Var.getInteger(53);
            java.util.LinkedList<r45.tq2> list3 = info.getList(2);
            if (list3 != null) {
                for (r45.tq2 tq2Var : list3) {
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) feedSet.get(java.lang.Long.valueOf(tq2Var.getLong(0)));
                    if (finderObject != null && (objectDesc = finderObject.getObjectDesc()) != null && (media = objectDesc.getMedia()) != null) {
                        for (com.tencent.mm.protocal.protobuf.FinderMedia finderMedia : media) {
                            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f464699p;
                            kotlin.jvm.internal.o.d(finderMedia);
                            java.lang.String string = bu2.z.i(finderMedia).getString(9);
                            if (string == null) {
                                string = "";
                            }
                            concurrentHashMap.put(string, tq2Var);
                        }
                    }
                }
            }
            yr2.o oVar = this.f464684a;
            oVar.getClass();
            oVar.f464713a = android.os.SystemClock.uptimeMillis();
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TP_PLAYER_LOCAL_SERVER_BUFFER_SIZE_LONG_SYNC, java.lang.Long.valueOf(this.F));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TP_PLAYER_LOCAL_SERVER_SEND_SOCKET_BUFFER_SIZE_LONG_SYNC, java.lang.Long.valueOf(this.G));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_TP_PLAYER_FFMPEG_TCP_RECV_SOCKET_BUFFER_SIZE_LONG_SYNC, java.lang.Long.valueOf(this.H));
        pm0.v.X(new yr2.j(this));
        java.util.LinkedList linkedList = new java.util.LinkedList(info.getList(2));
        info.getList(2).clear();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_LAST_PRELOAD_INFO_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.l(info.toByteArray()));
        com.tencent.mars.xlog.Log.i("Finder.MediaPreloadModel", "[storePreloadInfo] buffer size=" + com.tencent.mm.sdk.platformtools.t8.f0(r0.length));
        info.getList(2).addAll(linkedList);
    }
}
