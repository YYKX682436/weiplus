package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class i1 implements p94.k0 {

    /* renamed from: x, reason: collision with root package name */
    public static int f164251x;

    /* renamed from: c, reason: collision with root package name */
    public final jt0.i f164254c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.model.w5 f164255d;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f164258g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f164259h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f164260i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashMap f164261j;

    /* renamed from: k, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.model.h0 f164262k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f164263l;

    /* renamed from: m, reason: collision with root package name */
    public long f164264m;

    /* renamed from: n, reason: collision with root package name */
    public long f164265n;

    /* renamed from: o, reason: collision with root package name */
    public int f164266o;

    /* renamed from: p, reason: collision with root package name */
    public int f164267p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f164268q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashMap f164269r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashMap f164270s;

    /* renamed from: t, reason: collision with root package name */
    public int f164271t;

    /* renamed from: u, reason: collision with root package name */
    public int f164272u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.HashMap f164273v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.Set f164274w;

    /* renamed from: a, reason: collision with root package name */
    public long f164252a = 0;

    /* renamed from: b, reason: collision with root package name */
    public long f164253b = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f164256e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f164257f = new java.util.concurrent.ConcurrentHashMap();

    public i1() {
        new java.util.concurrent.ConcurrentHashMap();
        this.f164258g = new java.util.LinkedList();
        this.f164259h = false;
        this.f164260i = new java.util.concurrent.CopyOnWriteArraySet();
        this.f164261j = new java.util.HashMap();
        this.f164263l = true;
        this.f164264m = 0L;
        this.f164265n = 0L;
        this.f164266o = 0;
        this.f164267p = 0;
        this.f164268q = new java.util.HashMap();
        this.f164269r = new java.util.HashMap();
        this.f164270s = new java.util.HashMap();
        this.f164271t = 0;
        this.f164272u = 0;
        this.f164273v = new java.util.HashMap();
        this.f164274w = new java.util.HashSet();
        jt0.i.f301601j.put(com.tencent.mm.memory.r.class, new com.tencent.mm.plugin.sns.model.p1(this));
        int largeMemoryClass = ((android.app.ActivityManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME)).getLargeMemoryClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "BitmapPool %dMB", java.lang.Integer.valueOf(largeMemoryClass));
        this.f164254c = new jt0.i(largeMemoryClass > 256 ? 62914560 : 31457280, new com.tencent.mm.plugin.sns.model.q1(this), com.tencent.mm.plugin.sns.model.i1.class);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetSnsBig", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        this.f164255d = new com.tencent.mm.plugin.sns.model.w5(4, new com.tencent.mm.plugin.sns.model.r1(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetSnsBig", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.model.w5 a(com.tencent.mm.plugin.sns.model.i1 i1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.tencent.mm.plugin.sns.model.w5 w5Var = i1Var.f164255d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return w5Var;
    }

    public static /* synthetic */ void b(com.tencent.mm.plugin.sns.model.i1 i1Var, java.lang.Object obj, java.lang.String str, boolean z17, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        i1Var.t0(obj, str, z17, i17, i18, i19, i27);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(com.tencent.mm.plugin.sns.model.i1 r23, int r24, r45.jj4 r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.i1.c(com.tencent.mm.plugin.sns.model.i1, int, r45.jj4, boolean):boolean");
    }

    public static /* synthetic */ java.util.LinkedList d(com.tencent.mm.plugin.sns.model.i1 i1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.util.LinkedList linkedList = i1Var.f164258g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return linkedList;
    }

    public static java.lang.String l(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExistSnsDirectPath", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.lang.String u17 = u(jj4Var);
        if (com.tencent.mm.vfs.w6.j(u17)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExistSnsDirectPath", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return u17;
        }
        java.lang.String q17 = q(jj4Var);
        if (com.tencent.mm.vfs.w6.j(q17)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExistSnsDirectPath", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return q17;
        }
        java.lang.String r17 = r(jj4Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExistSnsDirectPath", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return r17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (com.tencent.mm.vfs.w6.j(r6) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String q(r45.jj4 r6) {
        /*
            java.lang.String r0 = "getSnsDirectHdPath"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            if (r6 != 0) goto Le
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            r6 = 0
            return r6
        Le:
            java.lang.String r2 = r6.f377855d
            java.lang.String r3 = "pre_temp_sns_pic"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L30
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.tencent.mm.plugin.sns.model.l4.Ni()
            r2.append(r3)
            java.lang.String r6 = r6.f377855d
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            goto Lb4
        L30:
            java.lang.String r2 = r6.f377855d
            java.lang.String r3 = "Locall_path"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L83
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.tencent.mm.plugin.sns.model.l4.Di()
            java.lang.String r4 = r6.f377855d
            java.lang.String r3 = com.tencent.mm.plugin.sns.model.f6.d(r3, r4)
            r2.append(r3)
            java.lang.String r3 = ca4.z0.W(r6)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r3 = com.tencent.mm.vfs.w6.j(r2)
            if (r3 != 0) goto L81
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = com.tencent.mm.plugin.sns.model.l4.Di()
            java.lang.String r5 = r6.f377855d
            java.lang.String r4 = com.tencent.mm.plugin.sns.model.f6.d(r4, r5)
            r3.append(r4)
            java.lang.String r6 = ca4.z0.U(r6)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            boolean r3 = com.tencent.mm.vfs.w6.j(r6)
            if (r3 == 0) goto L81
            goto Lb4
        L81:
            r6 = r2
            goto Lb4
        L83:
            java.lang.String r2 = r6.f377855d
            java.lang.String r3 = "pre_temp_extend_pic"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L97
            java.lang.String r6 = r6.f377855d
            r2 = 19
            java.lang.String r6 = r6.substring(r2)
            goto Lb4
        L97:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.tencent.mm.plugin.sns.model.l4.Di()
            java.lang.String r4 = r6.f377855d
            java.lang.String r3 = com.tencent.mm.plugin.sns.model.f6.d(r3, r4)
            r2.append(r3)
            java.lang.String r6 = ca4.z0.N(r6)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
        Lb4:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.i1.q(r45.jj4):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (com.tencent.mm.vfs.w6.j(r8) != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String r(r45.jj4 r8) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.i1.r(r45.jj4):java.lang.String");
    }

    public static java.lang.String t(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsDirectThumbPath", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.lang.String str = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d) + ca4.z0.U(jj4Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsDirectThumbPath", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        if (com.tencent.mm.vfs.w6.j(r6) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String u(r45.jj4 r6) {
        /*
            java.lang.String r0 = "getSnsDirectUhdPath"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            if (r6 != 0) goto Le
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            r6 = 0
            return r6
        Le:
            java.lang.String r2 = r6.f377855d
            java.lang.String r3 = "pre_temp_sns_pic"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L30
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.tencent.mm.plugin.sns.model.l4.Ni()
            r2.append(r3)
            java.lang.String r6 = r6.f377855d
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            goto Lb4
        L30:
            java.lang.String r2 = r6.f377855d
            java.lang.String r3 = "Locall_path"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L83
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.tencent.mm.plugin.sns.model.l4.Di()
            java.lang.String r4 = r6.f377855d
            java.lang.String r3 = com.tencent.mm.plugin.sns.model.f6.d(r3, r4)
            r2.append(r3)
            java.lang.String r3 = ca4.z0.W(r6)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            boolean r3 = com.tencent.mm.vfs.w6.j(r2)
            if (r3 != 0) goto L81
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = com.tencent.mm.plugin.sns.model.l4.Di()
            java.lang.String r5 = r6.f377855d
            java.lang.String r4 = com.tencent.mm.plugin.sns.model.f6.d(r4, r5)
            r3.append(r4)
            java.lang.String r6 = ca4.z0.U(r6)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            boolean r3 = com.tencent.mm.vfs.w6.j(r6)
            if (r3 == 0) goto L81
            goto Lb4
        L81:
            r6 = r2
            goto Lb4
        L83:
            java.lang.String r2 = r6.f377855d
            java.lang.String r3 = "pre_temp_extend_pic"
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L97
            java.lang.String r6 = r6.f377855d
            r2 = 19
            java.lang.String r6 = r6.substring(r2)
            goto Lb4
        L97:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.tencent.mm.plugin.sns.model.l4.Di()
            java.lang.String r4 = r6.f377855d
            java.lang.String r3 = com.tencent.mm.plugin.sns.model.f6.d(r3, r4)
            r2.append(r3)
            java.lang.String r6 = ca4.z0.d0(r6)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
        Lb4:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.i1.u(r45.jj4):java.lang.String");
    }

    public boolean A(r45.jj4 jj4Var) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFileExist", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (jj4Var == null || (str = jj4Var.f377855d) == null || str.equals("")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFileExist", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
        if (com.tencent.mm.vfs.w6.j(com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d) + ca4.z0.e0(jj4Var))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFileExist", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        if (com.tencent.mm.vfs.w6.j(com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d) + ca4.z0.U(jj4Var))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFileExist", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        boolean g17 = ca4.z0.g((com.tencent.mm.memory.r) this.f164254c.get(ca4.z0.x(1, jj4Var.f377855d)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFileExist", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return g17;
    }

    public boolean B(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isHidePlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.util.HashMap hashMap = this.f164261j;
        if (!hashMap.containsKey(jj4Var.f377855d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHidePlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
        if (((java.lang.Integer) hashMap.get(jj4Var.f377855d)).intValue() == 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHidePlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHidePlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return false;
    }

    public boolean C(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLoadBar", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.util.HashMap hashMap = this.f164261j;
        if (!hashMap.containsKey(jj4Var.f377855d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLoadBar", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
        if (((java.lang.Integer) hashMap.get(jj4Var.f377855d)).intValue() == 3) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLoadBar", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLoadBar", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return false;
    }

    public boolean D(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isMediaSightExist", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d);
        if (com.tencent.mm.vfs.w6.j(d17 + ca4.z0.R(jj4Var))) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isMediaSightExist", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        if (com.tencent.mm.vfs.w6.j(d17 + ca4.z0.Y(jj4Var)) && !com.tencent.mm.sdk.platformtools.t8.K0(jj4Var.f377855d) && jj4Var.f377855d.startsWith("Locall_path")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isMediaSightExist", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isMediaSightExist", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return false;
    }

    public boolean E(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isShowPlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.util.HashMap hashMap = this.f164261j;
        if (!hashMap.containsKey(jj4Var.f377855d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShowPlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
        if (((java.lang.Integer) hashMap.get(jj4Var.f377855d)).intValue() == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShowPlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShowPlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return false;
    }

    public final boolean F(java.lang.String str, int i17) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("parseInfoXml", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "SightDownloadControl", null);
        if (d17 == null || d17.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseInfoXml", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        if (i17 == 1) {
            z17 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".SightDownloadControl.G3PlusAutoDownload"), 0) == 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseInfoXml", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return z17;
        }
        z17 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".SightDownloadControl.WifiAutoDownload"), 0) == 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("parseInfoXml", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return z17;
    }

    public void G() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.LazyerImageLoader2", "%s download queue set pause", "[image-flow]");
        this.f164263l = false;
        com.tencent.mm.plugin.sns.model.m0 Cj = com.tencent.mm.plugin.sns.model.l4.Cj();
        Cj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.model.DownloadManager");
        Cj.f164446i = false;
        Cj.p();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public java.lang.String H(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, r45.jj4 jj4Var, com.tencent.mm.storage.s7 s7Var, boolean z17, java.lang.String str) {
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pushSightLoader", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (E(jj4Var)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pushSightLoader", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return "";
        }
        java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d);
        java.lang.String R = ca4.z0.R(jj4Var);
        if (com.tencent.mm.vfs.w6.j(d17 + R)) {
            java.lang.String str3 = d17 + R;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pushSightLoader", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return str3;
        }
        if (com.tencent.mm.vfs.w6.j(d17 + ca4.z0.Y(jj4Var)) && (str2 = jj4Var.f377855d) != null && str2.startsWith("Locall_path")) {
            java.lang.String str4 = d17 + ca4.z0.Y(jj4Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pushSightLoader", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return str4;
        }
        if (!this.f164263l) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pushSightLoader", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "push sight loader " + jj4Var.f377855d + " url: " + jj4Var.f377858g);
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "do no auto download sns sight.");
        } else if (v(snsInfo) == 5) {
            com.tencent.mm.plugin.sns.model.l4.Tj().postDelayed(new com.tencent.mm.plugin.sns.model.y1(this, jj4Var, s7Var, str), 0L);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pushSightLoader", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return "";
    }

    public boolean I(int i17, r45.jj4 jj4Var, com.tencent.mm.storage.s7 s7Var, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pushToImageLoaderUi", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (jj4Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pushToImageLoaderUi", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
        boolean z17 = jj4Var.N;
        com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "pushToImageLoaderUi snsid:%s, isRun:%s isAd:%b mediaId:%s", str, java.lang.Boolean.valueOf(this.f164263l), java.lang.Boolean.valueOf(z17), jj4Var.f377855d);
        if (this.f164263l || z17) {
            com.tencent.mm.plugin.sns.model.l4.Sj().execute(new com.tencent.mm.plugin.sns.model.x1(this, jj4Var, i17, s7Var, str));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pushToImageLoaderUi", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(jj4Var.f377855d)) {
            com.tencent.mm.plugin.sns.model.l4.Cj().x(jj4Var.f377855d);
        }
        java.lang.String mediaId = jj4Var.f377855d;
        ta4.u0 u0Var = ta4.u0.f416838a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cancelImageLoadByFling", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        pm0.v.O("SnsImageLoadReporter", new ta4.z(mediaId));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cancelImageLoadByFling", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pushToImageLoaderUi", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return false;
    }

    public boolean J(java.lang.String str, com.tencent.mm.memory.r rVar, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("putCacheUI", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        L(i17 + "-" + str, rVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putCacheUI", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return true;
    }

    public boolean K(java.lang.String str, java.lang.String str2) {
        java.lang.Object obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("putSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cleanLoadBarState", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.util.HashMap hashMap = this.f164261j;
        if (hashMap.containsKey(str) && 3 == ((java.lang.Integer) hashMap.get(str)).intValue()) {
            hashMap.remove(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanLoadBarState", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.lang.String x17 = ca4.z0.x(1, str);
        com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "TimeLineAdPreloadHelper, download video complete, mediaId=" + str + ", path=" + str2);
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) ((java.util.concurrent.ConcurrentHashMap) this.f164257f).get(x17);
        n74.a0 a0Var = new n74.a0(str, str2, n74.y.f335447f);
        n74.h0 h0Var = n74.h0.f335363a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVideoDownloadValue", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        java.util.Set set = n74.h0.f335367e;
        synchronized (set) {
            try {
                if (set.contains(str)) {
                    ((kotlinx.coroutines.flow.h3) n74.h0.c(str)).k(a0Var);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoDownloadValue", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoDownloadValue", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        if (copyOnWriteArrayList == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.sns.model.b2 b2Var = (com.tencent.mm.plugin.sns.model.b2) ((java.lang.ref.WeakReference) it.next()).get();
            if (b2Var != null && b2Var.f164088d && x17 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getId", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$MMPair");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getId", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$MMPair");
                if (x17.equals(b2Var.f164085a)) {
                    java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.concurrent.ConcurrentHashMap) this.f164256e).get(java.lang.Integer.valueOf(b2Var.a()));
                    if (weakReference != null && (obj = weakReference.get()) != null) {
                        if (obj instanceof com.tencent.mm.plugin.sight.decode.model.a) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "download fin set sight %s %s", str, str2);
                            com.tencent.mm.plugin.sight.decode.model.a aVar = (com.tencent.mm.plugin.sight.decode.model.a) obj;
                            if (aVar.getTagObject() instanceof com.tencent.mm.plugin.sns.ui.g9) {
                                com.tencent.mm.plugin.sns.ui.g9 g9Var = (com.tencent.mm.plugin.sns.ui.g9) aVar.getTagObject();
                                if (g9Var == null) {
                                    aVar.d(str2, !this.f164263l, 0);
                                } else if (com.tencent.mm.vfs.w6.j(str2)) {
                                    aVar.d(str2, !this.f164263l, g9Var.f168413c);
                                    aVar.setPosition(g9Var.f168413c);
                                    g9Var.f168420j.setVisibility(8);
                                    g9Var.f168419i.setVisibility(8);
                                    g9Var.f168421k.setVisibility(8);
                                    f(str);
                                } else {
                                    Q(str);
                                    g9Var.f168420j.setVisibility(8);
                                    g9Var.f168419i.setImageResource(com.tencent.mm.R.drawable.brn);
                                    g9Var.f168419i.setVisibility(0);
                                }
                            }
                        } else if (obj instanceof com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "SnsAdTimelineVideoView, download fin set sight %s %s", str, str2);
                            com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView snsAdTimelineVideoView = (com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView) obj;
                            if (snsAdTimelineVideoView.getTag() instanceof com.tencent.mm.plugin.sns.ui.g9) {
                                com.tencent.mm.plugin.sns.ui.g9 g9Var2 = (com.tencent.mm.plugin.sns.ui.g9) snsAdTimelineVideoView.getTag();
                                if (g9Var2 == null) {
                                    snsAdTimelineVideoView.setVideoPath(str2);
                                    snsAdTimelineVideoView.setShouldPlayWhenPrepared(true);
                                } else if (com.tencent.mm.vfs.w6.j(str2)) {
                                    snsAdTimelineVideoView.setVideoPath(str2);
                                    snsAdTimelineVideoView.setShouldPlayWhenPrepared(true);
                                    g9Var2.f168420j.setVisibility(8);
                                    g9Var2.f168419i.setVisibility(8);
                                    g9Var2.f168421k.setVisibility(8);
                                    f(str);
                                } else {
                                    Q(str);
                                    g9Var2.f168420j.setVisibility(8);
                                    g9Var2.f168419i.setImageResource(com.tencent.mm.R.drawable.brn);
                                    g9Var2.f168419i.setVisibility(0);
                                }
                            }
                        }
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return true;
    }

    public boolean L(java.lang.String str, com.tencent.mm.memory.r rVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("putThumbCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (rVar != null && str != null) {
            this.f164254c.put(str, rVar);
            n74.h0.e(str, new n74.z(str, new java.lang.ref.WeakReference(rVar), n74.y.f335447f));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("putThumbCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return true;
    }

    public final void M(java.lang.String str, r45.jj4 jj4Var, java.lang.String str2, com.tencent.mm.storage.s7 s7Var, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("recordStartLoadImage", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRequestTypeFromMedia", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        int i17 = jj4Var.f377856e == 6 ? 5 : 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRequestTypeFromMedia", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (z17) {
            i17 = 9;
        }
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.LazyerImageLoader2", "recordStartLoadImage:%s, cacheName:%s, fromScene:%s", jj4Var.f377855d, str2, s7Var.f195312a);
        ta4.u0.p(str, jj4Var.f377855d, i17, s7Var.f195312a, true, jj4Var.N);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recordStartLoadImage", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public void N(android.app.Activity activity) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeImageFromCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.util.Map map = this.f164256e;
        ((java.util.concurrent.ConcurrentHashMap) map).size();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f164260i;
        java.util.Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.sns.model.b2 b2Var = (com.tencent.mm.plugin.sns.model.b2) it.next();
            if (O(activity.getWindow().getDecorView(), b2Var.a())) {
                linkedList.add(java.lang.Integer.valueOf(b2Var.a()));
            }
        }
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            int intValue = ((java.lang.Integer) it6.next()).intValue();
            ((java.util.concurrent.ConcurrentHashMap) map).remove(java.lang.Integer.valueOf(intValue));
            java.util.Iterator it7 = copyOnWriteArraySet.iterator();
            while (true) {
                if (it7.hasNext()) {
                    com.tencent.mm.plugin.sns.model.b2 b2Var2 = (com.tencent.mm.plugin.sns.model.b2) it7.next();
                    if (b2Var2.a() == intValue) {
                        copyOnWriteArraySet.remove(b2Var2);
                        break;
                    }
                }
            }
        }
        linkedList.clear();
        java.util.Iterator it8 = copyOnWriteArraySet.iterator();
        while (it8.hasNext()) {
            com.tencent.mm.plugin.sns.model.b2 b2Var3 = (com.tencent.mm.plugin.sns.model.b2) it8.next();
            if (b2Var3.f164087c == activity.hashCode()) {
                linkedList.add(java.lang.Integer.valueOf(b2Var3.a()));
            }
        }
        java.util.Iterator it9 = linkedList.iterator();
        while (it9.hasNext()) {
            int intValue2 = ((java.lang.Integer) it9.next()).intValue();
            ((java.util.concurrent.ConcurrentHashMap) map).remove(java.lang.Integer.valueOf(intValue2));
            java.util.Iterator it10 = copyOnWriteArraySet.iterator();
            while (true) {
                if (it10.hasNext()) {
                    com.tencent.mm.plugin.sns.model.b2 b2Var4 = (com.tencent.mm.plugin.sns.model.b2) it10.next();
                    if (b2Var4.a() == intValue2) {
                        copyOnWriteArraySet.remove(b2Var4);
                        break;
                    }
                }
            }
        }
        this.f164255d.a();
        ((java.util.concurrent.ConcurrentHashMap) map).size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeImageFromCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public final boolean O(android.view.View view, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeImageIvInParis", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (view.hashCode() == i17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeImageIvInParis", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            do {
                childCount--;
                if (childCount >= 0) {
                }
            } while (!O(viewGroup.getChildAt(childCount), i17));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeImageIvInParis", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeImageIvInParis", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return false;
    }

    public void P(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeImageViewFromCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (view instanceof android.widget.ImageView) {
            ((android.widget.ImageView) view).setImageBitmap(null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeImageViewFromCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        } else if (!(view instanceof com.tencent.mm.ui.widget.QImageView)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeImageViewFromCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        } else {
            ((com.tencent.mm.ui.widget.QImageView) view).setImageBitmap(null);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeImageViewFromCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        }
    }

    public void Q(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setError", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        this.f164261j.put(str, 4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setError", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public final void R(java.lang.Object obj, java.lang.String str, com.tencent.mm.memory.r rVar, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImageDrawable", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (obj == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageDrawable", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return;
        }
        if (rVar != null) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.LazyerImageLoader2", "setImageDrawable %s %s %s", obj, str, rVar + " " + rVar.f68970d);
        }
        long j17 = 0;
        if (obj instanceof com.tencent.mm.ui.widget.QFadeImageView) {
            final com.tencent.mm.ui.widget.QFadeImageView qFadeImageView = (com.tencent.mm.ui.widget.QFadeImageView) obj;
            android.graphics.drawable.Drawable drawable = qFadeImageView.getDrawable();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(qFadeImageView.getImageKey()) && qFadeImageView.getImageKey().equals(str)) {
                j17 = qFadeImageView.getStartTimeMillis();
            }
            if (drawable != null && (drawable instanceof com.tencent.mm.plugin.sns.model.p5)) {
                j17 = ((com.tencent.mm.plugin.sns.model.p5) drawable).d();
            }
            final com.tencent.mm.plugin.sns.model.p5 p5Var = new com.tencent.mm.plugin.sns.model.p5(str, rVar, j17);
            qFadeImageView.H = p5Var.d();
            qFadeImageView.I = str;
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                qFadeImageView.setImageDrawable(p5Var);
                p5Var.invalidateSelf();
            } else {
                ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.model.i1$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$setImageDrawable$0", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                        com.tencent.mm.ui.widget.QFadeImageView qFadeImageView2 = com.tencent.mm.ui.widget.QFadeImageView.this;
                        com.tencent.mm.plugin.sns.model.p5 p5Var2 = p5Var;
                        qFadeImageView2.setImageDrawable(p5Var2);
                        p5Var2.invalidateSelf();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$setImageDrawable$0", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    }
                });
            }
        } else if (obj instanceof com.tencent.mm.ui.widget.QDisFadeImageView) {
            final com.tencent.mm.ui.widget.QDisFadeImageView qDisFadeImageView = (com.tencent.mm.ui.widget.QDisFadeImageView) obj;
            final mt0.a aVar = new mt0.a(str, rVar);
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                qDisFadeImageView.setImageDrawable(aVar);
                aVar.invalidateSelf();
            } else {
                ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.model.i1$$c
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$setImageDrawable$1", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                        com.tencent.mm.ui.widget.QDisFadeImageView qDisFadeImageView2 = com.tencent.mm.ui.widget.QDisFadeImageView.this;
                        mt0.a aVar2 = aVar;
                        qDisFadeImageView2.setImageDrawable(aVar2);
                        aVar2.invalidateSelf();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$setImageDrawable$1", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    }
                });
            }
        } else if (obj instanceof android.widget.ImageView) {
            final android.widget.ImageView imageView = (android.widget.ImageView) obj;
            android.graphics.drawable.Drawable drawable2 = imageView.getDrawable();
            final com.tencent.mm.plugin.sns.model.p5 p5Var2 = (drawable2 == null || !(drawable2 instanceof com.tencent.mm.plugin.sns.model.p5)) ? new com.tencent.mm.plugin.sns.model.p5(str, rVar, 0L) : new com.tencent.mm.plugin.sns.model.p5(str, rVar, ((com.tencent.mm.plugin.sns.model.p5) drawable2).d());
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                imageView.setImageDrawable(p5Var2);
                p5Var2.invalidateSelf();
            } else {
                ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.model.i1$$d
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$setImageDrawable$2", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                        android.widget.ImageView imageView2 = imageView;
                        com.tencent.mm.plugin.sns.model.p5 p5Var3 = p5Var2;
                        imageView2.setImageDrawable(p5Var3);
                        p5Var3.invalidateSelf();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$setImageDrawable$2", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    }
                });
            }
        } else if (obj instanceof com.tencent.mm.plugin.sight.decode.model.a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "update sight thumb " + str);
            if (obj instanceof com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView) {
                final com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView sightPlayImageView = (com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView) obj;
                android.graphics.drawable.Drawable drawable3 = sightPlayImageView.getDrawable();
                final com.tencent.mm.plugin.sns.model.p5 p5Var3 = (drawable3 == null || !(drawable3 instanceof com.tencent.mm.plugin.sns.model.p5)) ? new com.tencent.mm.plugin.sns.model.p5(str, rVar, 0L) : new com.tencent.mm.plugin.sns.model.p5(str, rVar, ((com.tencent.mm.plugin.sns.model.p5) drawable3).d());
                if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                    sightPlayImageView.setImageDrawable(p5Var3);
                    p5Var3.invalidateSelf();
                } else {
                    ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.model.i1$$e
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$setImageDrawable$3", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                            com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView sightPlayImageView2 = com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView.this;
                            com.tencent.mm.plugin.sns.model.p5 p5Var4 = p5Var3;
                            sightPlayImageView2.setImageDrawable(p5Var4);
                            p5Var4.invalidateSelf();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$setImageDrawable$3", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                        }
                    });
                }
            }
        } else if (obj instanceof com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "SnsAdTimelineVideoView, setImageDrawable, key=" + str);
            final com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView snsAdTimelineVideoView = (com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView) obj;
            android.graphics.drawable.Drawable thumbDrawable = snsAdTimelineVideoView.getThumbDrawable();
            final com.tencent.mm.plugin.sns.model.p5 p5Var4 = (thumbDrawable == null || !(thumbDrawable instanceof com.tencent.mm.plugin.sns.model.p5)) ? new com.tencent.mm.plugin.sns.model.p5(str, rVar, 0L) : new com.tencent.mm.plugin.sns.model.p5(str, rVar, ((com.tencent.mm.plugin.sns.model.p5) thumbDrawable).d());
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                snsAdTimelineVideoView.setThumbDrawable(p5Var4);
                p5Var4.invalidateSelf();
            } else {
                ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.model.i1$$f
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$setImageDrawable$4", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                        com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView snsAdTimelineVideoView2 = com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView.this;
                        com.tencent.mm.plugin.sns.model.p5 p5Var5 = p5Var4;
                        snsAdTimelineVideoView2.setThumbDrawable(p5Var5);
                        p5Var5.invalidateSelf();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$setImageDrawable$4", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    }
                });
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageDrawable", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public void S(android.view.View view, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImageViewBmp", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        u0(view, null, true, -1, i19, -1, -1, com.tencent.mm.plugin.sns.model.z1.IMG_SCENE_NONE);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (i17 != -1) {
            view.setBackgroundResource(i17);
        }
        if (i18 != -1) {
            if (view instanceof com.tencent.mm.ui.widget.QFadeImageView) {
                ((com.tencent.mm.ui.widget.QFadeImageView) view).setImageResource(i18);
            } else if (view instanceof android.widget.ImageView) {
                ((android.widget.ImageView) view).setImageDrawable(i65.a.i(view.getContext(), i18));
            }
        } else if (view instanceof com.tencent.mm.ui.widget.QFadeImageView) {
            ((com.tencent.mm.ui.widget.QFadeImageView) view).setImageDrawable(new android.graphics.drawable.ColorDrawable(view.getResources().getColor(com.tencent.mm.R.color.f478492d)));
        } else if (view instanceof android.widget.ImageView) {
            ((android.widget.ImageView) view).setImageDrawable(new android.graphics.drawable.ColorDrawable(view.getResources().getColor(com.tencent.mm.R.color.f478492d)));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImageViewBmp", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public boolean T(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, r45.jj4 jj4Var, com.tencent.mm.plugin.sns.ui.MaskImageView maskImageView, int i17, int i18, int i19, com.tencent.mm.storage.s7 s7Var, boolean z17, boolean z18, boolean z19) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setImproveSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (jj4Var == null || (str = jj4Var.f377855d) == null || str.equals("")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImproveSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
        java.lang.String x17 = ca4.z0.x(1, jj4Var.f377855d);
        M(snsInfo.getSnsId(), jj4Var, x17, s7Var, false);
        s0(maskImageView, x17, true, i17, i18);
        maskImageView.setTag(null);
        com.tencent.mm.memory.r k17 = k(x17, jj4Var.f377855d);
        if (ca4.z0.g(k17)) {
            R(maskImageView, x17, k17, false);
            ta4.u0.m(jj4Var.f377855d);
            ta4.u0.o(jj4Var.f377855d);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImproveSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        if (i17 == -1) {
            maskImageView.setImageBitmap(null);
        }
        if (((java.util.HashSet) this.f164274w).contains(x17)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImproveSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
        boolean I = I(1, jj4Var, s7Var, ca4.z0.t0(snsInfo.field_snsId));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setImproveSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return I;
    }

    public void U(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLoadingBar", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        this.f164261j.put(jj4Var.f377855d, 3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLoadingBar", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public void V(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShowPlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        this.f164261j.put(jj4Var.f377855d, 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShowPlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public boolean W(r45.jj4 jj4Var, android.view.View view, int i17, int i18, com.tencent.mm.storage.s7 s7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsBigImage", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        boolean i07 = i0(jj4Var, view, i17, i18, s7Var, 3, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsBigImage", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return i07;
    }

    public void X(java.lang.String str, r45.jj4 jj4Var, android.view.View view, int i17, int i18, com.tencent.mm.plugin.sns.model.z1 z1Var, com.tencent.mm.storage.s7 s7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        b0(jj4Var, view, i17, i18, z1Var, s7Var, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public void Y(java.lang.String str, r45.jj4 jj4Var, android.view.View view, int i17, com.tencent.mm.plugin.sns.model.z1 z1Var, com.tencent.mm.storage.s7 s7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        X(str, jj4Var, view, -1, i17, z1Var, s7Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public void Z(java.lang.String str, r45.jj4 jj4Var, android.view.View view, int i17, com.tencent.mm.storage.s7 s7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        b0(jj4Var, view, -1, i17, com.tencent.mm.plugin.sns.model.z1.IMG_SCENE_NONE, s7Var, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public void a0(r45.jj4 jj4Var, android.view.View view, int i17, int i18, com.tencent.mm.plugin.sns.model.z1 z1Var, com.tencent.mm.storage.s7 s7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        b0(jj4Var, view, i17, i18, z1Var, s7Var, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public void b0(r45.jj4 jj4Var, android.view.View view, int i17, int i18, com.tencent.mm.plugin.sns.model.z1 z1Var, com.tencent.mm.storage.s7 s7Var, java.lang.String str) {
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (jj4Var == null || (str2 = jj4Var.f377855d) == null || str2.equals("")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return;
        }
        view.setDrawingCacheEnabled(false);
        java.lang.String x17 = ca4.z0.x(0, jj4Var.f377855d);
        M(str, jj4Var, x17, s7Var, false);
        v0(view, x17, true, i17, i18, z1Var);
        com.tencent.mm.memory.r k17 = k(x17, jj4Var.f377855d);
        if (ca4.z0.g(k17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "setSnsGrid cache hit");
            com.tencent.mm.plugin.sns.model.l4.Cj().x(jj4Var.f377855d);
            R(view, x17, k17, false);
            ta4.u0.m(jj4Var.f377855d);
            ta4.u0.o(jj4Var.f377855d);
            if (!com.tencent.mm.plugin.sns.model.l4.hj().A(jj4Var) && pc4.d.f353410a.k()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "[%s][id:%s][media:%s] local file not exist,re download", "[image-flow]", str, jj4Var.f377855d);
                I(0, jj4Var, s7Var, str);
            }
        } else {
            if (i17 == -1) {
                q0(view);
            }
            if (((java.util.HashSet) this.f164274w).contains(x17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "%s in hashSet ignore", x17);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                return;
            }
            I(0, jj4Var, s7Var, str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public void c0(r45.jj4 jj4Var, android.view.View view, int i17, int i18, com.tencent.mm.storage.s7 s7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        a0(jj4Var, view, i17, i18, com.tencent.mm.plugin.sns.model.z1.IMG_SCENE_NONE, s7Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public void d0(r45.jj4 jj4Var, android.view.View view, int i17, com.tencent.mm.plugin.sns.model.z1 z1Var, com.tencent.mm.storage.s7 s7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        a0(jj4Var, view, -1, i17, z1Var, s7Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public boolean e(ca4.s0 s0Var, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addDeocodeElment", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        r45.jj4 jj4Var = (r45.jj4) s0Var.b().get(0);
        int i17 = 1;
        while (true) {
            if (i17 >= s0Var.b().size()) {
                break;
            }
            r45.jj4 jj4Var2 = (r45.jj4) s0Var.b().get(i17);
            if (str != null && str.indexOf(jj4Var2.f377855d) >= 0) {
                jj4Var = jj4Var2;
                break;
            }
            i17++;
        }
        java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d);
        java.lang.String e07 = s0Var.a() == 0 ? ca4.z0.e0(jj4Var) : s0Var.a() == 4 ? ca4.z0.M(jj4Var) : s0Var.a() == 5 ? ca4.z0.M(jj4Var) : s0Var.a() == 3 ? ca4.z0.J(jj4Var) : s0Var.a() == 8 ? ca4.z0.d0(jj4Var) : s0Var.a() == 9 ? ca4.z0.N(jj4Var) : ca4.z0.U(jj4Var);
        if (!this.f164254c.k(ca4.z0.x(s0Var.a(), jj4Var.f377855d))) {
            com.tencent.mm.plugin.sns.model.a2 a2Var = new com.tencent.mm.plugin.sns.model.a2(this, ca4.z0.x(s0Var.a(), jj4Var.f377855d), d17 + e07, d17, jj4Var, s0Var.a());
            java.util.Set set = this.f164274w;
            if (!((java.util.HashSet) set).contains(com.tencent.mm.plugin.sns.model.a2.e(a2Var))) {
                ((java.util.HashSet) set).add(com.tencent.mm.plugin.sns.model.a2.e(a2Var));
                com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "addDeocodeElment key:%s, media:%s", com.tencent.mm.plugin.sns.model.a2.e(a2Var), jj4Var.f377855d);
                a2Var.d(new java.lang.String[0]);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDeocodeElment", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return true;
    }

    public void e0(r45.jj4 jj4Var, android.view.View view, int i17, com.tencent.mm.storage.s7 s7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        c0(jj4Var, view, -1, i17, s7Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public boolean f(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cleanErrorState", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.util.HashMap hashMap = this.f164261j;
        if (hashMap.containsKey(str) && 4 == ((java.lang.Integer) hashMap.get(str)).intValue()) {
            hashMap.remove(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanErrorState", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return true;
    }

    public void f0(r45.jj4 jj4Var, android.view.View view, int i17, com.tencent.mm.storage.s7 s7Var, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        b0(jj4Var, view, -1, i17, com.tencent.mm.plugin.sns.model.z1.IMG_SCENE_NONE, s7Var, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cleanSnsCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (this.f164254c != null) {
            ((java.util.concurrent.ConcurrentHashMap) this.f164256e).clear();
            com.tencent.mm.plugin.sns.model.w5 w5Var = this.f164255d;
            w5Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clear", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
            ((java.util.HashMap) w5Var.f164736a).clear();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clear", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("putCount:");
            sb6.append(this.f164254c.f());
            sb6.append(";");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("missCount:");
            sb7.append(this.f164254c.a());
            sb7.append(";");
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("hitCount:");
            sb8.append(this.f164254c.e());
            sb8.append(";");
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("createCount:");
            sb9.append(this.f164254c.b());
            sb9.append(";");
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("evictionCount:");
            sb10.append(this.f164254c.h());
            sb10.append(";");
            com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "report lurcache ");
            this.f164254c.d(-1);
        }
        n74.h0 h0Var = n74.h0.f335363a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeAllThumbDownloadChannel", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        java.util.Map map = n74.h0.f335364b;
        synchronized (map) {
            try {
                ((java.util.LinkedHashMap) map).clear();
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeAllThumbDownloadChannel", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeAllThumbDownloadChannel", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper");
        this.f164255d.a();
        java.lang.System.gc();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanSnsCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public void g0(java.lang.String str, java.util.List list, android.view.View view, int i17, com.tencent.mm.plugin.sns.model.z1 z1Var, com.tencent.mm.storage.s7 s7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsGridList", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        h0(str, list, view, i17, z1Var, s7Var, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsGridList", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public boolean h(com.tencent.mm.plugin.sns.ui.widget.SnsAdTimelineVideoView snsAdTimelineVideoView, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cleanSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        s0(snsAdTimelineVideoView, "", true, i17, i18);
        snsAdTimelineVideoView.setThumbBmp(null);
        snsAdTimelineVideoView.u();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return true;
    }

    public void h0(java.lang.String str, java.util.List list, android.view.View view, int i17, com.tencent.mm.plugin.sns.model.z1 z1Var, com.tencent.mm.storage.s7 s7Var, boolean z17) {
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsGridList", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (list == null || list.size() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsGridList", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return;
        }
        int size = list.size();
        java.util.Set set = this.f164274w;
        if (size == 1) {
            if (z17) {
                r45.jj4 jj4Var = (r45.jj4) list.get(0);
                com.tencent.mm.plugin.sns.model.z1 z1Var2 = com.tencent.mm.plugin.sns.model.z1.IMG_SCENE_SNSUSER;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsBlurGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                if (jj4Var == null || (str2 = jj4Var.f377855d) == null || str2.equals("")) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsBlurGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                } else {
                    view.setDrawingCacheEnabled(false);
                    java.lang.String x17 = ca4.z0.x(5, jj4Var.f377855d);
                    M(str, jj4Var, x17, s7Var, false);
                    v0(view, x17, true, -1, i17, z1Var2);
                    com.tencent.mm.memory.r k17 = k(x17, jj4Var.f377855d);
                    if (ca4.z0.g(k17)) {
                        R(view, x17, k17, false);
                        ta4.u0.m(jj4Var.f377855d);
                        ta4.u0.o(jj4Var.f377855d);
                    } else {
                        q0(view);
                        if (((java.util.HashSet) set).contains(x17)) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsBlurGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                        } else {
                            I(5, jj4Var, s7Var, str);
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsBlurGrid", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                }
            } else {
                Z(str, (r45.jj4) list.get(0), view, i17, s7Var);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsGridList", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return;
        }
        java.lang.String O = ca4.z0.O(list);
        java.lang.String x18 = ca4.z0.x(0, O);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.jj4 jj4Var2 = (r45.jj4) it.next();
            if (O.contains(jj4Var2.f377855d)) {
                M(str, jj4Var2, x18, s7Var, false);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        u0(view, x18, true, -1, i17, -1, -1, z1Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.tencent.mm.memory.r k18 = k(x18, O);
        if (ca4.z0.g(k18)) {
            R(view, x18, k18, false);
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                r45.jj4 jj4Var3 = (r45.jj4) it6.next();
                ta4.u0.m(jj4Var3.f377855d);
                ta4.u0.o(jj4Var3.f377855d);
            }
        } else {
            q0(view);
            if (((java.util.HashSet) set).contains(x18)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsGridList", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                return;
            }
            new java.lang.ref.WeakReference(view);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pushToImageLoaderUi", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            com.tencent.mm.plugin.sns.model.l4.Sj().execute(new com.tencent.mm.plugin.sns.model.u1(this, list, 0, s7Var, str));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pushToImageLoaderUi", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsGridList", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public boolean i(com.tencent.mm.pluginsdk.ui.tools.VideoSightView videoSightView, int i17, int i18, int i19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cleanSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        s0(videoSightView, "", true, i17, i18);
        videoSightView.setThumbBmp(null);
        videoSightView.d(null, false, i19);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return true;
    }

    public boolean i0(r45.jj4 jj4Var, android.view.View view, int i17, int i18, com.tencent.mm.storage.s7 s7Var, int i19, java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsImage", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (jj4Var == null || (str2 = jj4Var.f377855d) == null || str2.equals("")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsImage", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
        java.lang.String x17 = ca4.z0.x(i19, jj4Var.f377855d);
        M(str, jj4Var, x17, s7Var, false);
        s0(view, x17, true, i17, i18);
        com.tencent.mm.memory.r k17 = k(x17, jj4Var.f377855d);
        boolean g17 = ca4.z0.g(k17);
        boolean z17 = jj4Var.N;
        com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "[%s][id:%s][media:%s] setSnsImage ad:%b bmAvailable:%b cacheName:%s isRun:%b", "[image-flow]", str, jj4Var.f377855d, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(g17), x17, java.lang.Boolean.valueOf(this.f164263l));
        if (g17) {
            R(view, x17, k17, false);
            ta4.u0.m(jj4Var.f377855d);
            ta4.u0.o(jj4Var.f377855d);
            com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "[%s][id:%s][media:%s] loadHitCache", "[image-flow]", str, jj4Var.f377855d, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(g17), x17, java.lang.Boolean.valueOf(this.f164263l));
            if (!com.tencent.mm.plugin.sns.model.l4.hj().A(jj4Var) && pc4.d.f353410a.k()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "[%s][id:%s][media:%s] local file not exist,re download", "[image-flow]", str, jj4Var.f377855d);
                I(i19, jj4Var, s7Var, str);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsImage", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        if (i17 == -1) {
            q0(view);
            str3 = "MicroMsg.LazyerImageLoader2";
            com.tencent.mars.xlog.Log.i(str3, "[%s][id:%s][media:%s] updateDefaultImg", "[image-flow]", str, jj4Var.f377855d, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(g17), x17, java.lang.Boolean.valueOf(this.f164263l));
        } else {
            str3 = "MicroMsg.LazyerImageLoader2";
        }
        if (((java.util.HashSet) this.f164274w).contains(x17)) {
            com.tencent.mars.xlog.Log.i(str3, "[%s][id:%s][media:%s] already in hashSet,ignore this", "[image-flow]", str, jj4Var.f377855d, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(g17), x17, java.lang.Boolean.valueOf(this.f164263l));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsImage", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        boolean I = I(i19, jj4Var, s7Var, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsImage", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return I;
    }

    public com.tencent.mm.memory.r j(int i17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCacheBm", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        jt0.i iVar = this.f164254c;
        if (iVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCacheBm", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return null;
        }
        com.tencent.mm.memory.r rVar = (com.tencent.mm.memory.r) iVar.get(i17 + "-" + str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCacheBm", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return rVar;
    }

    public boolean j0(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, r45.jj4 jj4Var, com.tencent.mm.pluginsdk.ui.tools.VideoSightView videoSightView, int i17, int i18, int i19, com.tencent.mm.storage.s7 s7Var, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        boolean k07 = k0(snsInfo, jj4Var, videoSightView, i17, i18, i19, s7Var, z17, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return k07;
    }

    public com.tencent.mm.memory.r k(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCacheSns", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        jt0.i iVar = this.f164254c;
        com.tencent.mm.memory.r rVar = (com.tencent.mm.memory.r) iVar.get(str);
        if (rVar != null && !rVar.e()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCacheSns", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return rVar;
        }
        iVar.remove(str);
        n74.h0.d(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCacheSns", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return null;
    }

    public boolean k0(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, r45.jj4 jj4Var, com.tencent.mm.pluginsdk.ui.tools.VideoSightView videoSightView, int i17, int i18, int i19, com.tencent.mm.storage.s7 s7Var, boolean z17, boolean z18) {
        boolean z19;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        int i27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (jj4Var == null || (str = jj4Var.f377855d) == null || str.equals("")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            z19 = false;
        } else {
            java.lang.String x17 = ca4.z0.x(1, jj4Var.f377855d);
            M(snsInfo.getSnsId(), jj4Var, x17, s7Var, false);
            s0(videoSightView, x17, true, i17, i18);
            java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d);
            java.lang.String U = ca4.z0.U(jj4Var);
            if (com.tencent.mm.vfs.w6.j(d17 + U)) {
                str2 = d17;
                str3 = "";
                str4 = U;
            } else {
                ca4.s0 s0Var = new ca4.s0(jj4Var);
                s0Var.d(1);
                s0Var.e(jj4Var.f377855d);
                com.tencent.mm.plugin.sns.model.m0 Cj = com.tencent.mm.plugin.sns.model.l4.Cj();
                if (jj4Var.f377856e == 6) {
                    i27 = 5;
                    str3 = "";
                } else {
                    str3 = "";
                    i27 = 1;
                }
                str4 = U;
                str2 = d17;
                Cj.e(jj4Var, i27, s0Var, s7Var, ca4.z0.t0(snsInfo.field_snsId));
            }
            java.lang.String H = z17 ? H(snsInfo, jj4Var, s7Var, z17, ca4.z0.t0(snsInfo.field_snsId)) : str3;
            com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "setsight %s sightPath %s isAd %b", x17, H, java.lang.Boolean.valueOf(z17));
            android.graphics.Bitmap bitmap = null;
            if (com.tencent.mm.sdk.platformtools.t8.K0(H) || E(jj4Var)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "sightPath %s", H);
                videoSightView.setVideoPath(null);
                videoSightView.p();
                com.tencent.mm.memory.r k17 = k(x17, jj4Var.f377855d);
                if (ca4.z0.g(k17)) {
                    R(videoSightView, x17, k17, false);
                    ta4.u0.m(jj4Var.f377855d);
                    ta4.u0.o(jj4Var.f377855d);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    z19 = true;
                } else {
                    if (i17 == -1) {
                        videoSightView.setPosition(0);
                        videoSightView.setThumbBmp(null);
                    }
                    if (((java.util.HashSet) this.f164274w).contains(x17)) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    } else {
                        I(1, jj4Var, s7Var, ca4.z0.t0(snsInfo.field_snsId));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    }
                    z19 = false;
                }
            } else {
                if (!H.equals(videoSightView.getVideoPath())) {
                    if (z18) {
                        bitmap = com.tencent.mm.sdk.platformtools.x.J(str2 + str4, null);
                    }
                    videoSightView.setThumbBmp(bitmap);
                }
                videoSightView.setVideoPath(H);
                videoSightView.setPosition(i19);
                ta4.u0.m(jj4Var.f377855d);
                ta4.u0.o(jj4Var.f377855d);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                z19 = true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsSight", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return z19;
    }

    public boolean l0(r45.jj4 jj4Var, android.view.View view, int i17, int i18, com.tencent.mm.storage.s7 s7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        boolean i07 = i0(jj4Var, view, i17, i18, s7Var, 1, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return i07;
    }

    public final android.graphics.Bitmap m(com.tencent.mm.plugin.sns.model.w5 w5Var, java.lang.String str) {
        java.lang.Object obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFromWeakReferenceB", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        w5Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("get", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
        java.util.HashMap hashMap = (java.util.HashMap) w5Var.f164736a;
        com.tencent.mm.plugin.sns.model.v5 v5Var = (com.tencent.mm.plugin.sns.model.v5) hashMap.get(str);
        if (v5Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
            obj = null;
        } else {
            ((com.tencent.mm.plugin.sns.model.v5) hashMap.get(str)).a();
            obj = v5Var.f164720a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("get", "com.tencent.mm.plugin.sns.model.SnsLRUMap");
        }
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFromWeakReference ");
        sb6.append(str);
        sb6.append("  ");
        sb6.append(weakReference == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", sb6.toString());
        if (weakReference == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFromWeakReferenceB", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return null;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) weakReference.get();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFromWeakReferenceB", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return bitmap;
    }

    public void m0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("start", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.LazyerImageLoader2", "%s download queue set start", "[image-flow]");
        this.f164263l = true;
        o0();
        com.tencent.mm.plugin.sns.model.m0 Cj = com.tencent.mm.plugin.sns.model.l4.Cj();
        Cj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("start", "com.tencent.mm.plugin.sns.model.DownloadManager");
        Cj.f164446i = true;
        Cj.A();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public android.graphics.Bitmap n(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, com.tencent.mm.storage.s7 s7Var, java.lang.String str4, java.lang.String str5) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsBg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (!z17 && com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsBg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return null;
        }
        r45.jj4 h17 = m21.y.h(str3, 2, str2, str2, 1, 1, "");
        ca4.z0.x(2, str3);
        if (str3.equals("")) {
            android.graphics.Bitmap o17 = ca4.z0.o(str);
            android.graphics.Bitmap bitmap = ca4.z0.f(o17) ? o17 : null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsBg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return bitmap;
        }
        if (ca4.z0.f(null)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsBg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return null;
        }
        android.graphics.Bitmap o18 = ca4.z0.o(com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), str3) + ca4.z0.J(h17));
        if (!ca4.z0.f(o18)) {
            o18 = ca4.z0.o(str);
        }
        if (o18 == null && z17 && !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mm.plugin.sns.model.m0 Cj = com.tencent.mm.plugin.sns.model.l4.Cj();
            Cj.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
            Cj.f(h17, 3, null, s7Var, null, str4, str5, 0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
        }
        if (ca4.z0.f(o18)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsBg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return o18;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsBg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean n0(r45.jj4 r9, int r10, com.tencent.mm.storage.s7 r11, boolean r12) {
        /*
            r8 = this;
            java.lang.String r0 = "tryGetSnsBm"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.LazyerImageLoader2"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r2 = 0
            if (r9 == 0) goto Le4
            java.lang.String r3 = r9.f377855d
            if (r3 == 0) goto Le4
            java.lang.String r4 = ""
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L19
            goto Le4
        L19:
            r3 = 3
            r4 = 1
            if (r10 != r3) goto L1f
        L1d:
            r10 = r2
            goto L2c
        L1f:
            r3 = 4
            if (r10 != r3) goto L2c
            java.lang.String r10 = r9.A1
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L2b
            goto L1d
        L2b:
            r10 = r4
        L2c:
            java.lang.String r3 = r9.f377855d
            java.lang.String r5 = "Locall_path"
            boolean r3 = r3.startsWith(r5)
            r5 = 2
            if (r3 == 0) goto L55
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = com.tencent.mm.plugin.sns.model.l4.Di()
            java.lang.String r7 = r9.f377855d
            java.lang.String r6 = com.tencent.mm.plugin.sns.model.f6.d(r6, r7)
            r3.append(r6)
            java.lang.String r6 = ca4.z0.W(r9)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            goto Lb2
        L55:
            if (r10 != r5) goto L75
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = com.tencent.mm.plugin.sns.model.l4.Di()
            java.lang.String r7 = r9.f377855d
            java.lang.String r6 = com.tencent.mm.plugin.sns.model.f6.d(r6, r7)
            r3.append(r6)
            java.lang.String r6 = ca4.z0.d0(r9)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            goto Lb2
        L75:
            if (r10 != r4) goto L95
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = com.tencent.mm.plugin.sns.model.l4.Di()
            java.lang.String r7 = r9.f377855d
            java.lang.String r6 = com.tencent.mm.plugin.sns.model.f6.d(r6, r7)
            r3.append(r6)
            java.lang.String r6 = ca4.z0.N(r9)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            goto Lb2
        L95:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = com.tencent.mm.plugin.sns.model.l4.Di()
            java.lang.String r7 = r9.f377855d
            java.lang.String r6 = com.tencent.mm.plugin.sns.model.f6.d(r6, r7)
            r3.append(r6)
            java.lang.String r6 = ca4.z0.J(r9)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
        Lb2:
            boolean r3 = com.tencent.mm.vfs.w6.j(r3)
            if (r3 != 0) goto Le0
            r3 = 0
            if (r10 != r5) goto Lc5
            com.tencent.mm.plugin.sns.model.m0 r10 = com.tencent.mm.plugin.sns.model.l4.Cj()
            r12 = 10
            r10.d(r9, r12, r3, r11)
            goto Ldc
        Lc5:
            if (r10 != r4) goto Ld1
            com.tencent.mm.plugin.sns.model.m0 r10 = com.tencent.mm.plugin.sns.model.l4.Cj()
            r12 = 11
            r10.d(r9, r12, r3, r11)
            goto Ldc
        Ld1:
            com.tencent.mm.plugin.sns.model.m0 r10 = com.tencent.mm.plugin.sns.model.l4.Cj()
            if (r12 == 0) goto Ld9
            r5 = 8
        Ld9:
            r10.d(r9, r5, r3, r11)
        Ldc:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        Le0:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        Le4:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.i1.n0(r45.jj4, int, com.tencent.mm.storage.s7, boolean):boolean");
    }

    public void o(r45.jj4 jj4Var, android.view.View view, int i17, boolean z17, com.tencent.mm.storage.s7 s7Var, boolean z18, java.lang.String str, com.tencent.mm.plugin.sns.model.c2 c2Var) {
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsDirect", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (jj4Var == null || (str2 = jj4Var.f377855d) == null || str2.equals("")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsDirect", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return;
        }
        java.lang.String x17 = ca4.z0.x(3, jj4Var.f377855d);
        java.lang.String r17 = r(jj4Var);
        if (com.tencent.mm.plugin.sns.model.l4.Cj().l(jj4Var.f377855d)) {
            t0(view, x17, false, -1, i17, -1, -1);
            if (c2Var != null) {
                c2Var.a(null);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsDirect", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return;
        }
        android.graphics.Bitmap m17 = m(this.f164255d, x17);
        if (ca4.z0.f(m17)) {
            t0(view, x17, false, -1, i17, m17.getWidth(), m17.getHeight());
            if (c2Var != null) {
                c2Var.a(m17);
            }
        } else {
            com.tencent.mm.plugin.sns.model.l4.bj().execute(new com.tencent.mm.plugin.sns.model.m1(this, r17, view, x17, i17, z17, jj4Var, z18, s7Var, str, c2Var));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsDirect", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public final boolean o0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryStart", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (this.f164259h) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LazyerImageLoader2", "[%s]already start,ignore start event1", "[image-flow]");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryStart", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
        com.tencent.mm.plugin.sns.model.l4.Tj().postDelayed(new com.tencent.mm.plugin.sns.model.v1(this), 0L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryStart", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return true;
    }

    public android.graphics.Bitmap p(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsDirectBig", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        com.tencent.mm.memory.r k17 = k(str, str2);
        if (ca4.z0.g(k17)) {
            k17.f68974h = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsDirectBig", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return k17.f68970d;
        }
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsDirectBig", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return null;
        }
        com.tencent.mm.memory.r c17 = str2.startsWith("pre_temp_extend_pic") ? com.tencent.mm.memory.r.c(com.tencent.mm.plugin.sns.storage.m2.k1(str)) : com.tencent.mm.memory.r.c(com.tencent.mm.plugin.sns.storage.m2.k1(str));
        if (!ca4.z0.g(c17)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsDirectBig", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return null;
        }
        L(str, c17);
        c17.f68974h = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsDirectBig", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return c17.f68970d;
    }

    public void p0(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unSetShowPlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        this.f164261j.put(jj4Var.f377855d, 2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unSetShowPlay", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public final void q0(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateDefaultImg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (view instanceof com.tencent.mm.ui.widget.QImageView) {
            ((com.tencent.mm.ui.widget.QImageView) view).setImageDrawable(new android.graphics.drawable.ColorDrawable(view.getResources().getColor(com.tencent.mm.R.color.f478492d)));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateDefaultImg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        } else if (!(view instanceof android.widget.ImageView)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateDefaultImg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        } else {
            ((android.widget.ImageView) view).setImageDrawable(new android.graphics.drawable.ColorDrawable(view.getResources().getColor(com.tencent.mm.R.color.f478492d)));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateDefaultImg", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        }
    }

    public void r0(final java.lang.String mediaId, java.lang.String str, com.tencent.mm.memory.r rVar) {
        java.lang.Object obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.mm.plugin.appbrand.jsapi.coverview.m0.NAME, "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.lang.System.currentTimeMillis();
        if (!ca4.z0.g(rVar)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCacheSns", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            jt0.i iVar = this.f164254c;
            com.tencent.mm.memory.r rVar2 = (com.tencent.mm.memory.r) iVar.get(str);
            if (rVar2 == null || rVar2.e()) {
                iVar.remove(str);
                n74.h0.d(str);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCacheSns", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                rVar = null;
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCacheSns", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                rVar = rVar2;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "[%s][media:%s] ImageLoader updateImageView2 key:%s bm valid:%b", "[image-flow]", mediaId, str, java.lang.Boolean.valueOf(ca4.z0.g(rVar)));
        if (ca4.z0.g(rVar)) {
            jt0.i iVar2 = this.f164254c;
            if (iVar2 != null && rVar != null && str != null) {
                iVar2.put(str, rVar);
                n74.h0.e(str, new n74.z(str, new java.lang.ref.WeakReference(rVar), n74.y.f335447f));
            }
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) ((java.util.concurrent.ConcurrentHashMap) this.f164257f).get(str);
            if (copyOnWriteArrayList != null) {
                java.util.Iterator it = copyOnWriteArrayList.iterator();
                boolean z17 = false;
                while (it.hasNext()) {
                    com.tencent.mm.plugin.sns.model.b2 b2Var = (com.tencent.mm.plugin.sns.model.b2) ((java.lang.ref.WeakReference) it.next()).get();
                    if (b2Var != null && b2Var.f164088d && str != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getId", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$MMPair");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getId", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2$MMPair");
                        if (str.equals(b2Var.f164085a)) {
                            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.concurrent.ConcurrentHashMap) this.f164256e).get(java.lang.Integer.valueOf(b2Var.a()));
                            if (weakReference != null && (obj = weakReference.get()) != null) {
                                if (obj instanceof com.tencent.mm.ui.widget.QFadeImageView) {
                                    synchronized (this) {
                                        try {
                                        } finally {
                                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.mm.plugin.appbrand.jsapi.coverview.m0.NAME, "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                                        }
                                    }
                                }
                                if (ca4.z0.g(rVar)) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "[%s][media:%s] ImageLoader load bitmap Success!!!", "[image-flow]", mediaId);
                                    java.lang.String[] mediaIds = mediaId.split("-");
                                    ta4.u0 u0Var = ta4.u0.f416838a;
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showBitmapSuccess", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                                    kotlin.jvm.internal.o.g(mediaIds, "mediaIds");
                                    for (java.lang.String str2 : mediaIds) {
                                        ta4.u0.o(str2);
                                    }
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBitmapSuccess", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                                    z17 = true;
                                    R(obj, str, rVar, true);
                                } else {
                                    com.tencent.mars.xlog.Log.e("MicroMsg.LazyerImageLoader2", "[%s][media:%s] ImageLoader load bitmap Fail!!! for bitmap recycle", "[image-flow]", mediaId);
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
                if (!z17) {
                    ta4.u0 u0Var2 = ta4.u0.f416838a;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showBitmapFail", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                    kotlin.jvm.internal.o.g(mediaId, "mediaId");
                    pm0.v.O("SnsImageLoadReporter", new ta4.n0(mediaId));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBitmapFail", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                    com.tencent.mars.xlog.Log.e("MicroMsg.LazyerImageLoader2", "[%s][media:%s] ImageLoader updateImageView fail for View null", "[image-flow]", mediaId);
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.LazyerImageLoader2", "[%s][media:%s] ImageLoader load bitmap Fail!!! for not found ref", "[image-flow]", mediaId);
                ta4.u0 u0Var3 = ta4.u0.f416838a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showBitmapFail", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                kotlin.jvm.internal.o.g(mediaId, "mediaId");
                pm0.v.O("SnsImageLoadReporter", new ta4.n0(mediaId));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showBitmapFail", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
            }
            if (this.f164262k != null) {
                ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.model.i1$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.tencent.mm.plugin.sns.model.i1 i1Var = com.tencent.mm.plugin.sns.model.i1.this;
                        i1Var.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$updateImageView$5", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                        ((com.tencent.mm.plugin.sns.ui.widget.q2) i1Var.f164262k).onThumbFinish(mediaId);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$updateImageView$5", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    }
                });
            }
        }
    }

    public android.graphics.Bitmap s(r45.jj4 jj4Var) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsDirectThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (jj4Var == null || (str = jj4Var.f377855d) == null || str.equals("")) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsDirectThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return null;
        }
        java.lang.String x17 = ca4.z0.x(1, jj4Var.f377855d);
        com.tencent.mm.memory.r k17 = k(x17, jj4Var.f377855d);
        if (ca4.z0.g(k17)) {
            k17.f68974h = false;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsDirectThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return k17.f68970d;
        }
        java.lang.String str2 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d) + ca4.z0.U(jj4Var);
        if (!com.tencent.mm.vfs.w6.j(str2)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsDirectThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return null;
        }
        com.tencent.mm.memory.r c17 = jj4Var.f377855d.startsWith("pre_temp_extend_pic") ? com.tencent.mm.memory.r.c(com.tencent.mm.plugin.sns.storage.m2.k1(str2)) : ca4.z0.n(str2);
        if (!ca4.z0.g(c17)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsDirectThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return null;
        }
        L(x17, c17);
        c17.f68974h = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsDirectThumb", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return c17.f68970d;
    }

    public final void s0(java.lang.Object obj, java.lang.String str, boolean z17, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        u0(obj, str, z17, i17, i18, -1, -1, com.tencent.mm.plugin.sns.model.z1.IMG_SCENE_NONE);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public final void t0(java.lang.Object obj, java.lang.String str, boolean z17, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        u0(obj, str, z17, i17, i18, i19, i27, com.tencent.mm.plugin.sns.model.z1.IMG_SCENE_NONE);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public final void u0(java.lang.Object obj, java.lang.String str, boolean z17, int i17, int i18, int i19, int i27, com.tencent.mm.plugin.sns.model.z1 z1Var) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        if (obj == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            str = "default";
        }
        int hashCode = obj.hashCode();
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = this.f164260i;
        copyOnWriteArraySet.remove(new com.tencent.mm.plugin.sns.model.b2(null, hashCode, 0, false));
        com.tencent.mm.plugin.sns.model.b2 b2Var = new com.tencent.mm.plugin.sns.model.b2(str, hashCode, i18, z17);
        copyOnWriteArraySet.add(b2Var);
        java.util.Map map = this.f164257f;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = (java.util.concurrent.CopyOnWriteArrayList) ((java.util.concurrent.ConcurrentHashMap) map).get(str);
        if (copyOnWriteArrayList2 == null) {
            copyOnWriteArrayList2 = new java.util.concurrent.CopyOnWriteArrayList();
            ((java.util.concurrent.ConcurrentHashMap) map).put(str, copyOnWriteArrayList2);
        }
        copyOnWriteArrayList2.add(new java.lang.ref.WeakReference(b2Var));
        com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "[%s]updateImageViewToKey cache key:%s", "[image-flow]", str);
        android.view.View view = (android.view.View) obj;
        java.lang.String str2 = (java.lang.String) view.getTag(2130706432);
        if (str2 != null && (copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) ((java.util.concurrent.ConcurrentHashMap) map).get(str2)) != null && !copyOnWriteArrayList.isEmpty()) {
            int i28 = 0;
            while (true) {
                if (i28 >= copyOnWriteArrayList.size()) {
                    i28 = -1;
                    break;
                }
                com.tencent.mm.plugin.sns.model.b2 b2Var2 = (com.tencent.mm.plugin.sns.model.b2) ((java.lang.ref.WeakReference) copyOnWriteArrayList.get(i28)).get();
                if (b2Var2 != null && b2Var2.f164086b == hashCode) {
                    break;
                } else {
                    i28++;
                }
            }
            if (i28 != -1) {
                copyOnWriteArrayList.remove(i28);
            }
        }
        view.setTag(2130706432, str);
        ((java.util.concurrent.ConcurrentHashMap) this.f164256e).put(java.lang.Integer.valueOf(hashCode), new java.lang.ref.WeakReference(obj));
        if (i17 != -1) {
            if (obj instanceof com.tencent.mm.ui.widget.QFadeImageView) {
                ((com.tencent.mm.ui.widget.QFadeImageView) obj).setImageResource(i17);
            } else if (obj instanceof android.widget.ImageView) {
                android.widget.ImageView imageView = (android.widget.ImageView) obj;
                imageView.setImageDrawable(i65.a.i(imageView.getContext(), i17));
            } else {
                ((com.tencent.mm.plugin.sight.decode.model.a) obj).d(null, !this.f164263l, 0);
            }
        }
        if ((z1Var != com.tencent.mm.plugin.sns.model.z1.IMG_SCENE_SNSUSER || (!(obj instanceof android.widget.ImageView) && !(obj instanceof com.tencent.mm.ui.widget.QFadeImageView))) && str != null && str.startsWith("3") && !(obj instanceof android.widget.ImageView)) {
            boolean z18 = obj instanceof com.tencent.mm.ui.widget.QFadeImageView;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    public int v(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAutoAdDownload", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        int w17 = w(snsInfo, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAutoAdDownload", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return w17;
    }

    public final void v0(java.lang.Object obj, java.lang.String str, boolean z17, int i17, int i18, com.tencent.mm.plugin.sns.model.z1 z1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        u0(obj, str, z17, i17, i18, -1, -1, z1Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateImageViewToKey", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e3, code lost:
    
        if (((java.lang.Boolean) r3.get(java.lang.Integer.valueOf(r4))).booleanValue() != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e6, code lost:
    
        r5 = 10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0115, code lost:
    
        com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "isAutoAdDownload(sight_autodownload) snsID:%d, result:%d", java.lang.Long.valueOf(r12.field_snsId), java.lang.Integer.valueOf(r5));
        r13.put(java.lang.Long.valueOf(r12.field_snsId), java.lang.Integer.valueOf(r5));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAutoAdDownload", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0139, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0113, code lost:
    
        if (((java.lang.Boolean) r3.get(java.lang.Integer.valueOf(r4))).booleanValue() != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if ((android.os.SystemClock.elapsedRealtime() - r7) > 60000) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int w(com.tencent.mm.plugin.sns.storage.SnsInfo r12, int[] r13) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.i1.w(com.tencent.mm.plugin.sns.storage.SnsInfo, int[]):int");
    }

    public int x(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAutoDownload", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        int y17 = y(snsInfo, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAutoDownload", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return y17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0234, code lost:
    
        if (((java.lang.Boolean) r9.get(java.lang.Integer.valueOf(r7))).booleanValue() != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0266, code lost:
    
        r6 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0264, code lost:
    
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0262, code lost:
    
        if (((java.lang.Boolean) r9.get(java.lang.Integer.valueOf(r7))).booleanValue() != false) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01ad A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int y(com.tencent.mm.plugin.sns.storage.SnsInfo r23, int[] r24) {
        /*
            Method dump skipped, instructions count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.i1.y(com.tencent.mm.plugin.sns.storage.SnsInfo, int[]):int");
    }

    public boolean z(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isError", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        java.util.HashMap hashMap = this.f164261j;
        if (!hashMap.containsKey(jj4Var.f377855d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isError", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return false;
        }
        if (((java.lang.Integer) hashMap.get(jj4Var.f377855d)).intValue() == 4) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isError", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isError", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
        return false;
    }
}
