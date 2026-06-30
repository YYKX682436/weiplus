package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class m0 implements la4.e {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f164438a;

    /* renamed from: b, reason: collision with root package name */
    public long f164439b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f164440c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f164441d = 2;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f164442e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f164443f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f164444g = new byte[0];

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f164445h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public boolean f164446i = true;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Set f164447j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.Set f164448k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.LinkedList f164449l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f164450m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f164451n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f164452o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f164453p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f164454q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f164455r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f164456s;

    public m0() {
        this.f164438a = null;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = new java.util.concurrent.CopyOnWriteArraySet();
        this.f164447j = copyOnWriteArraySet;
        copyOnWriteArraySet.add(new com.tencent.mm.plugin.sns.model.a0(this));
        this.f164448k = new java.util.HashSet();
        this.f164449l = new java.util.LinkedList();
        this.f164450m = new java.util.HashMap();
        this.f164451n = new java.util.concurrent.ConcurrentHashMap();
        this.f164452o = new java.util.HashMap();
        this.f164453p = new java.util.concurrent.ConcurrentHashMap();
        this.f164454q = new java.util.concurrent.ConcurrentHashMap();
        this.f164455r = new java.util.concurrent.ConcurrentHashMap();
        this.f164456s = new java.util.concurrent.CopyOnWriteArrayList();
        this.f164438a = com.tencent.mm.plugin.sns.model.l4.Tj();
        o();
    }

    public static boolean a(com.tencent.mm.plugin.sns.model.m0 m0Var) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.model.DownloadManager");
        m0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pullFile", "com.tencent.mm.plugin.sns.model.DownloadManager");
        synchronized (m0Var.f164444g) {
            try {
                java.util.LinkedList linkedList = m0Var.f164442e;
                z17 = false;
                if (linkedList == null || linkedList.size() <= 0) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pullFile", "com.tencent.mm.plugin.sns.model.DownloadManager");
                } else {
                    android.support.v4.media.f.a(m0Var.f164442e.remove());
                    new com.tencent.mm.plugin.sns.model.j7().f(null);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pullFile", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    z17 = true;
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pullFile", "com.tencent.mm.plugin.sns.model.DownloadManager");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x031e, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.DownloadManager", "others http: urlType" + r14 + " -- url : " + r9 + " isThumb :" + r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0273 A[Catch: all -> 0x0660, TryCatch #0 {all -> 0x0660, blocks: (B:21:0x0093, B:23:0x00a1, B:25:0x00b4, B:27:0x0109, B:30:0x0113, B:32:0x0161, B:33:0x0166, B:35:0x0170, B:38:0x017c, B:40:0x01d4, B:52:0x01e9, B:54:0x0268, B:56:0x0273, B:59:0x0285, B:61:0x028b, B:62:0x0295, B:65:0x029f, B:67:0x02bf, B:69:0x02c9, B:78:0x0311, B:80:0x031e, B:81:0x033f, B:85:0x034d, B:88:0x037a, B:90:0x03eb, B:92:0x03fc, B:166:0x0387, B:168:0x038f, B:170:0x03a7, B:172:0x03af, B:175:0x03d7, B:176:0x03e1, B:179:0x03d5, B:180:0x0359, B:181:0x027e, B:185:0x01f4, B:187:0x0207, B:189:0x0210, B:195:0x0224, B:198:0x022d, B:199:0x0232, B:200:0x023a, B:202:0x0241, B:204:0x0249, B:205:0x024b, B:207:0x0254, B:209:0x025b), top: B:20:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x028b A[Catch: all -> 0x0660, TryCatch #0 {all -> 0x0660, blocks: (B:21:0x0093, B:23:0x00a1, B:25:0x00b4, B:27:0x0109, B:30:0x0113, B:32:0x0161, B:33:0x0166, B:35:0x0170, B:38:0x017c, B:40:0x01d4, B:52:0x01e9, B:54:0x0268, B:56:0x0273, B:59:0x0285, B:61:0x028b, B:62:0x0295, B:65:0x029f, B:67:0x02bf, B:69:0x02c9, B:78:0x0311, B:80:0x031e, B:81:0x033f, B:85:0x034d, B:88:0x037a, B:90:0x03eb, B:92:0x03fc, B:166:0x0387, B:168:0x038f, B:170:0x03a7, B:172:0x03af, B:175:0x03d7, B:176:0x03e1, B:179:0x03d5, B:180:0x0359, B:181:0x027e, B:185:0x01f4, B:187:0x0207, B:189:0x0210, B:195:0x0224, B:198:0x022d, B:199:0x0232, B:200:0x023a, B:202:0x0241, B:204:0x0249, B:205:0x024b, B:207:0x0254, B:209:0x025b), top: B:20:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x029f A[Catch: all -> 0x0660, TRY_ENTER, TryCatch #0 {all -> 0x0660, blocks: (B:21:0x0093, B:23:0x00a1, B:25:0x00b4, B:27:0x0109, B:30:0x0113, B:32:0x0161, B:33:0x0166, B:35:0x0170, B:38:0x017c, B:40:0x01d4, B:52:0x01e9, B:54:0x0268, B:56:0x0273, B:59:0x0285, B:61:0x028b, B:62:0x0295, B:65:0x029f, B:67:0x02bf, B:69:0x02c9, B:78:0x0311, B:80:0x031e, B:81:0x033f, B:85:0x034d, B:88:0x037a, B:90:0x03eb, B:92:0x03fc, B:166:0x0387, B:168:0x038f, B:170:0x03a7, B:172:0x03af, B:175:0x03d7, B:176:0x03e1, B:179:0x03d5, B:180:0x0359, B:181:0x027e, B:185:0x01f4, B:187:0x0207, B:189:0x0210, B:195:0x0224, B:198:0x022d, B:199:0x0232, B:200:0x023a, B:202:0x0241, B:204:0x0249, B:205:0x024b, B:207:0x0254, B:209:0x025b), top: B:20:0x0093 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A() {
        /*
            Method dump skipped, instructions count: 1761
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.m0.A():void");
    }

    public void B(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unFinishBySceneDown", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.tencent.mm.plugin.sns.model.l4.Tj().post(new com.tencent.mm.plugin.sns.model.f0(this, str));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unFinishBySceneDown", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    public void C(java.lang.String str, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unLockDownLoad", "com.tencent.mm.plugin.sns.model.DownloadManager");
        synchronized (this.f164444g) {
            try {
                java.lang.Thread.currentThread().getId();
                ca4.m mVar = (ca4.m) ((java.util.HashMap) this.f164452o).get(str);
                if (mVar != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRequestType", "com.tencent.mm.plugin.sns.data.DownloaderLockElment");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRequestType", "com.tencent.mm.plugin.sns.data.DownloaderLockElment");
                    if (9 == mVar.f39998b) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDecodeElements", "com.tencent.mm.plugin.sns.data.DownloaderLockElment");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDecodeElements", "com.tencent.mm.plugin.sns.data.DownloaderLockElment");
                        ca4.s0 s0Var = (ca4.s0) mVar.f39999c.get(i17);
                        if (s0Var != null) {
                            com.tencent.mm.plugin.sns.model.l4.hj().e(s0Var, str);
                        }
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDecodeInfo", "com.tencent.mm.plugin.sns.data.DownloaderLockElment");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDecodeInfo", "com.tencent.mm.plugin.sns.data.DownloaderLockElment");
                        ca4.s0 s0Var2 = mVar.f39997a;
                        if (s0Var2 != null) {
                            com.tencent.mm.plugin.sns.model.l4.hj().e(s0Var2, str);
                        }
                    }
                }
                if (z17) {
                    ((java.util.HashMap) this.f164452o).remove(str);
                    y(str);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unLockDownLoad", "com.tencent.mm.plugin.sns.model.DownloadManager");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unLockDownLoad", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x013c A[Catch: all -> 0x0178, TryCatch #0 {all -> 0x0178, blocks: (B:29:0x00b8, B:31:0x00c1, B:33:0x00cb, B:35:0x00e1, B:37:0x00ee, B:39:0x00f8, B:40:0x017c, B:57:0x013c, B:58:0x0142, B:60:0x0148, B:63:0x0163, B:65:0x016b, B:66:0x0170), top: B:28:0x00b8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.lang.String r17, android.util.SparseArray r18, android.util.SparseArray r19, com.tencent.mm.storage.s7 r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.m0.b(java.lang.String, android.util.SparseArray, android.util.SparseArray, com.tencent.mm.storage.s7, int, int):void");
    }

    public void c(com.tencent.mm.plugin.sns.model.h0 h0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addDownLoadEndListener", "com.tencent.mm.plugin.sns.model.DownloadManager");
        this.f164438a.post(new com.tencent.mm.plugin.sns.model.b0(this, h0Var));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDownLoadEndListener", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    public boolean d(r45.jj4 jj4Var, int i17, ca4.s0 s0Var, com.tencent.mm.storage.s7 s7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
        boolean e17 = e(jj4Var, i17, s0Var, s7Var, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return e17;
    }

    public boolean e(r45.jj4 jj4Var, int i17, ca4.s0 s0Var, com.tencent.mm.storage.s7 s7Var, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
        boolean f17 = f(jj4Var, i17, s0Var, s7Var, str, "", "", 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return f17;
    }

    public boolean f(r45.jj4 jj4Var, int i17, ca4.s0 s0Var, com.tencent.mm.storage.s7 s7Var, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
        if (jj4Var == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unknow case media is null ");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(com.tencent.mm.sdk.platformtools.z3.b(true));
            com.tencent.mars.xlog.Log.e("MicroMsg.DownloadManager", sb6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
            return false;
        }
        synchronized (this.f164444g) {
            try {
                java.lang.String str4 = jj4Var.f377855d;
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.sns.model.n7.f164515a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("recordStartLoadSmallPic", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
                boolean z18 = x51.o1.f452042a;
                com.tencent.mm.plugin.sns.model.n7.a(str4);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recordStartLoadSmallPic", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
                s7Var.equals(com.tencent.mm.storage.s7.f195299c);
                java.lang.String str5 = jj4Var.f377855d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setScene", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
                com.tencent.mm.plugin.sns.model.n7.a(str5);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setScene", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
                h(jj4Var, i17, s0Var, s7Var, null, null, str, str2, str3);
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDownLoadSns", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return true;
    }

    public boolean g(r45.jj4 jj4Var, int i17, ca4.s0 s0Var, com.tencent.mm.storage.s7 s7Var, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addDownLoadSnsAd", "com.tencent.mm.plugin.sns.model.DownloadManager");
        if (jj4Var == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("unknow case media is null ");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(com.tencent.mm.sdk.platformtools.z3.b(true));
            com.tencent.mars.xlog.Log.e("MicroMsg.DownloadManager", sb6.toString());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDownLoadSnsAd", "com.tencent.mm.plugin.sns.model.DownloadManager");
            return false;
        }
        synchronized (this.f164444g) {
            try {
                java.lang.String str3 = jj4Var.f377855d;
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.tencent.mm.plugin.sns.model.n7.f164515a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("recordStartLoadSmallPic", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
                boolean z18 = x51.o1.f452042a;
                com.tencent.mm.plugin.sns.model.n7.a(str3);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recordStartLoadSmallPic", "com.tencent.mm.plugin.sns.model.TimelineSmallPicStat");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addDownLoadSnsImpl", "com.tencent.mm.plugin.sns.model.DownloadManager");
                h(jj4Var, i17, s0Var, s7Var, str, str2, null, "", "");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDownLoadSnsImpl", "com.tencent.mm.plugin.sns.model.DownloadManager");
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDownLoadSnsAd", "com.tencent.mm.plugin.sns.model.DownloadManager");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDownLoadSnsAd", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return true;
    }

    public final boolean h(r45.jj4 jj4Var, int i17, ca4.s0 s0Var, com.tencent.mm.storage.s7 s7Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addDownLoadSnsImpl", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadManager", "[%s][media:%s] run addDownLoadSnsImpl type:%d start", "[image-flow]", jj4Var.f377855d, java.lang.Integer.valueOf(i17));
        if (!ca4.z0.j0(com.tencent.mm.plugin.sns.model.l4.Bi())) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DownloadManager", "[%s][media:%s] run addDownLoadSnsImpl isHasSdcard is false accpath %s sdcard: %s", "[image-flow]", jj4Var.f377855d, com.tencent.mm.plugin.sns.model.l4.Bi(), lp0.b.e0());
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDownLoadSnsImpl", "com.tencent.mm.plugin.sns.model.DownloadManager");
            return false;
        }
        if (jj4Var.f377855d.startsWith("Locall_path") || jj4Var.f377855d.startsWith("pre_temp_sns_pic")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DownloadManager", "[%s][media:%s] is a local img not need download", "[image-flow]", jj4Var.f377855d);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDownLoadSnsImpl", "com.tencent.mm.plugin.sns.model.DownloadManager");
            return false;
        }
        java.lang.String G = ca4.z0.G(i17, jj4Var.f377855d);
        synchronized (this.f164444g) {
            try {
                if (((java.util.HashMap) this.f164452o).containsKey(G)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.DownloadManager", "[%s][media:%s] run addDownLoadSnsImpl what are u doing?", "[image-flow]", jj4Var.f377855d);
                    java.util.Iterator it = this.f164449l.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ca4.t0 t0Var = (ca4.t0) it.next();
                        if (t0Var.c() != null && t0Var.c().f377855d.equals(jj4Var.f377855d)) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRequestType", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRequestType", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                            if (t0Var.f40018b == i17) {
                                if (this.f164449l.remove(t0Var)) {
                                    this.f164449l.addLast(t0Var);
                                }
                            }
                        }
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.DownloadManager", "[%s][media:%s] run addDownLoadSnsImpl add to net lists:%s", "[image-flow]", jj4Var.f377855d, q());
                    java.util.HashMap hashMap = this.f164450m;
                    java.lang.String str6 = jj4Var.f377855d;
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    hashMap.put(str6, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
                    ((java.util.HashMap) this.f164452o).put(G, new ca4.m(s0Var, i17));
                    ca4.t0 t0Var2 = new ca4.t0(jj4Var, i17, G, s7Var, str, str2, str4, str5);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsId", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                    t0Var2.f40025i = str3;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsId", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                    this.f164449l.add(t0Var2);
                    java.lang.String mediaId = jj4Var.f377855d;
                    int size = this.f164449l.size();
                    int size2 = ((java.util.concurrent.ConcurrentHashMap) this.f164451n).size();
                    ta4.u0 u0Var = ta4.u0.f416838a;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enqueueDownloadList", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                    kotlin.jvm.internal.o.g(mediaId, "mediaId");
                    pm0.v.O("SnsImageLoadReporter", new ta4.d0(mediaId, size, size2));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enqueueDownloadList", "com.tencent.mm.plugin.sns.report.SnsImageLoadReporter");
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                        java.lang.String w17 = ca4.z0.w(9, str3);
                        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadManager", "snsId: %s, mediaId: %s, batchKey: %s.", str3, jj4Var.f377855d, w17);
                        if (this.f164453p.containsKey(w17)) {
                            java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) this.f164453p.get(w17);
                            if (atomicInteger == null) {
                                atomicInteger = new java.util.concurrent.atomic.AtomicInteger(0);
                            }
                            i18 = atomicInteger.incrementAndGet();
                        } else {
                            java.util.concurrent.atomic.AtomicInteger atomicInteger2 = new java.util.concurrent.atomic.AtomicInteger(0);
                            int incrementAndGet = atomicInteger2.incrementAndGet();
                            this.f164453p.put(w17, atomicInteger2);
                            i18 = incrementAndGet;
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadManager", "res: %s.", java.lang.Integer.valueOf(i18));
                        this.f164454q.put(G, w17);
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDownLoadSnsImpl", "com.tencent.mm.plugin.sns.model.DownloadManager");
                throw th6;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadManager", "tryStartNetscene size %s Tsize : %s, list:%s", java.lang.Integer.valueOf(com.tencent.mm.plugin.sns.model.l4.xj().m()), java.lang.Integer.valueOf(((java.util.concurrent.ConcurrentHashMap) this.f164451n).size()), q());
        ((java.util.HashMap) this.f164452o).size();
        this.f164442e.size();
        if (android.os.Looper.myLooper() != null) {
            android.os.Looper.myQueue().addIdleHandler(new com.tencent.mm.plugin.sns.model.l0(this));
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.DownloadManager", "Looper.myLooper() == null");
        }
        n();
        m();
        if (this.f164449l.size() > 0) {
            A();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDownLoadSnsImpl", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return true;
    }

    public void i(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, boolean z17, int i18, boolean z18, dn.n nVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addDownloadStreamVideoTask", "com.tencent.mm.plugin.sns.model.DownloadManager");
        dn.o oVar = new dn.o();
        oVar.f241785d = "task_DownloadManager";
        oVar.field_mediaId = str;
        oVar.M1 = str2;
        oVar.H1 = 1;
        oVar.field_fileType = 100;
        oVar.Z = 5;
        oVar.A1 = i17;
        oVar.f241809y0 = 3;
        oVar.field_fullpath = str3;
        oVar.f241808y = z18;
        oVar.f241815c2 = nVar;
        if (i17 == 1) {
            oVar.f241809y0 = 10;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkAdDeviceSupportH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            if ((oVar.Z == 5) && !android.text.TextUtils.isEmpty(oVar.M1)) {
                try {
                    if (oVar.M1.contains("svpuseh265flag=1")) {
                        boolean Di = d11.s.Di(6);
                        if (Di) {
                            oVar.field_requestVideoFormat = 2;
                        } else {
                            oVar.field_requestVideoFormat = 1;
                            try {
                                ca4.e0.a("dev_disable_hevc", wo.w0.m().toLowerCase(), 0, 0, "");
                            } catch (java.lang.Throwable th6) {
                                com.tencent.mars.xlog.Log.e("AdH265Helper", "checkAdDeviceSupportH265 report exp=" + th6.toString());
                            }
                        }
                        com.tencent.mars.xlog.Log.i("AdH265Helper", "checkAppendAdH265Flag, isDeviceSupportHevc=" + Di + ", requestVideoFormat=" + oVar.field_requestVideoFormat + ", url=" + oVar.M1);
                        l44.c0.f(oVar.A1, true, Di);
                    } else {
                        oVar.field_requestVideoFormat = 1;
                        com.tencent.mars.xlog.Log.i("AdH265Helper", "checkAppendAdH265Flag, url has no h265 flag, url=" + oVar.M1);
                        l44.c0.f(oVar.A1, false, false);
                    }
                } catch (java.lang.Throwable th7) {
                    oVar.field_requestVideoFormat = 1;
                    com.tencent.mars.xlog.Log.e("AdH265Helper", "checkAppendAdH265Flag, exp=" + th7.toString());
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkAdDeviceSupportH265", "com.tencent.mm.plugin.sns.ad.helper.AdH265Helper");
            if (z17) {
                oVar.H1 = 2;
                oVar.field_preloadRatio = i18;
            }
        }
        t21.o2.Di().e(oVar, false);
        synchronized (this.f164445h) {
            try {
                this.f164445h.put(str, str3);
            } catch (java.lang.Throwable th8) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDownloadStreamVideoTask", "com.tencent.mm.plugin.sns.model.DownloadManager");
                throw th8;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addDownloadStreamVideoTask", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    public void j(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addMediaId", "com.tencent.mm.plugin.sns.model.DownloadManager");
        this.f164456s.add(str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addMediaId", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0031, code lost:
    
        if (r3.f164338a.equals(r8.f164338a) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(java.lang.String r7, com.tencent.mm.plugin.sns.model.k0 r8) {
        /*
            r6 = this;
            java.lang.String r0 = "addReporter"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.model.DownloadManager"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r7)
            if (r2 != 0) goto L36
            if (r8 == 0) goto L36
            java.util.concurrent.ConcurrentHashMap r2 = r6.f164455r
            java.lang.Object r3 = r2.get(r7)
            com.tencent.mm.plugin.sns.model.k0 r3 = (com.tencent.mm.plugin.sns.model.k0) r3
            if (r3 == 0) goto L33
            java.lang.String r4 = "access$400"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            java.lang.String r3 = r3.f164338a
            java.lang.String r4 = r8.f164338a
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L36
        L33:
            r2.put(r7, r8)
        L36:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.m0.k(java.lang.String, com.tencent.mm.plugin.sns.model.k0):void");
    }

    public boolean l(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkBigMediaIdDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
        synchronized (this.f164444g) {
            try {
                if (!((java.util.concurrent.ConcurrentHashMap) this.f164451n).containsKey(ca4.z0.G(2, str))) {
                    if (!((java.util.concurrent.ConcurrentHashMap) this.f164451n).containsKey(ca4.z0.G(10, str))) {
                        if (!((java.util.concurrent.ConcurrentHashMap) this.f164451n).containsKey(ca4.z0.G(11, str))) {
                            if (!((java.util.concurrent.ConcurrentHashMap) this.f164451n).containsKey(ca4.z0.G(8, str))) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkBigMediaIdDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
                                return false;
                            }
                        }
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkBigMediaIdDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
                return true;
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkBigMediaIdDownloading", "com.tencent.mm.plugin.sns.model.DownloadManager");
                throw th6;
            }
        }
    }

    public final void m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkDownloadingItem", "com.tencent.mm.plugin.sns.model.DownloadManager");
        java.util.LinkedList<java.lang.String> linkedList = new java.util.LinkedList();
        synchronized (this.f164444g) {
            try {
                java.util.Iterator it = ((java.util.concurrent.ConcurrentHashMap) this.f164451n).entrySet().iterator();
                while (it.hasNext()) {
                    linkedList.add((java.lang.String) ((java.util.Map.Entry) it.next()).getKey());
                }
                for (java.lang.String str : linkedList) {
                    if (((java.util.concurrent.ConcurrentHashMap) this.f164451n).containsKey(str) && com.tencent.mm.sdk.platformtools.t8.H1(((java.lang.Long) ((java.util.concurrent.ConcurrentHashMap) this.f164451n).get(str)).longValue()) * 1000 > 300000) {
                        ((java.util.concurrent.ConcurrentHashMap) this.f164451n).remove(str);
                        ((java.util.HashMap) this.f164452o).remove(str);
                        y(str);
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkDownloadingItem", "com.tencent.mm.plugin.sns.model.DownloadManager");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkDownloadingItem", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    public final void n() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkIdleFile", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("expired", "com.tencent.mm.plugin.sns.model.DownloadManager");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.H1(this.f164439b) * 1000 > 300000;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("expired", "com.tencent.mm.plugin.sns.model.DownloadManager");
        if (z17) {
            this.f164438a.postDelayed(new com.tencent.mm.plugin.sns.model.e0(this), 500L);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkIdleFile", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    public void o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cleanQueue", "com.tencent.mm.plugin.sns.model.DownloadManager");
        synchronized (this.f164444g) {
            try {
                this.f164449l.clear();
                this.f164452o.clear();
                this.f164451n.clear();
                this.f164442e.clear();
                this.f164443f.clear();
                this.f164453p.clear();
                this.f164454q.clear();
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanQueue", "com.tencent.mm.plugin.sns.model.DownloadManager");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanQueue", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    public void p() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cleanTask", "com.tencent.mm.plugin.sns.model.DownloadManager");
        synchronized (this.f164444g) {
            try {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.Iterator it = this.f164449l.iterator();
                while (it.hasNext()) {
                    ca4.t0 t0Var = (ca4.t0) it.next();
                    t0Var.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRequestType", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRequestType", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                    if (t0Var.f40018b != 6) {
                        java.util.Map map = this.f164452o;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getKey", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getKey", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                        ((java.util.HashMap) map).remove(t0Var.f40019c);
                        linkedList.add(t0Var);
                    }
                }
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    this.f164449l.remove((ca4.t0) it6.next());
                }
                this.f164453p.clear();
                this.f164454q.clear();
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanTask", "com.tencent.mm.plugin.sns.model.DownloadManager");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanTask", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    public final java.lang.String q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dumpDownloadListsId", "com.tencent.mm.plugin.sns.model.DownloadManager");
        java.util.LinkedList linkedList = this.f164449l;
        if (linkedList.size() <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dumpDownloadListsId", "com.tencent.mm.plugin.sns.model.DownloadManager");
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ca4.t0 t0Var = (ca4.t0) it.next();
            if (t0Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaObjs", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaObjs", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                android.util.SparseArray sparseArray = t0Var.f40026j;
                if (sparseArray != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaObjs", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaObjs", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                    if (sparseArray.size() > 0) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                        java.lang.String str = t0Var.f40025i;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.data.SnsDownLoadElment");
                        sb6.append(str);
                        sb6.append(",");
                    }
                }
                if (t0Var.c() != null) {
                    sb6.append(t0Var.c().f377855d);
                }
                sb6.append(",");
            }
        }
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dumpDownloadListsId", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return sb7;
    }

    public final java.lang.String r() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dumpDownloadingListId", "com.tencent.mm.plugin.sns.model.DownloadManager");
        java.util.Map map = this.f164451n;
        if (((java.util.concurrent.ConcurrentHashMap) map).size() <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dumpDownloadingListId", "com.tencent.mm.plugin.sns.model.DownloadManager");
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        for (java.lang.String str : ((java.util.concurrent.ConcurrentHashMap) map).keySet()) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                sb6.append(str);
                sb6.append(",");
            }
        }
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dumpDownloadingListId", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return sb7;
    }

    public final void s(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("logDownloadCostTime", "com.tencent.mm.plugin.sns.model.DownloadManager");
        java.lang.String[] split = str.split("-");
        java.lang.String substring = (split == null || split.length != 2 || str.contains("sns_table_")) ? str.substring(2) : split[1].trim();
        java.util.HashMap hashMap = this.f164450m;
        if (hashMap.containsKey(substring)) {
            long longValue = ((java.lang.Long) hashMap.get(substring)).longValue();
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - longValue;
            if (elapsedRealtime > 2000) {
                com.tencent.mars.xlog.Log.i("MicroMsg.DownloadManager", "mediaId:%s download cost:%sms too long!", substring, java.lang.Long.valueOf(elapsedRealtime));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.DownloadManager", "mediaId:%s download cost:%sms", substring, java.lang.Long.valueOf(elapsedRealtime));
            }
            if (z17) {
                hashMap.remove(substring);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("logDownloadCostTime", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    public void t(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onProgress", "com.tencent.mm.plugin.sns.model.DownloadManager");
        com.tencent.mm.plugin.sns.model.l4.Tj().post(new com.tencent.mm.plugin.sns.model.d0(this, str, str2));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onProgress", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    public void u(int i17, r45.jj4 jj4Var, int i18, boolean z17, java.lang.String str, int i19, int i27, boolean z18) {
        boolean z19;
        int i28;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTaskFinish", "com.tencent.mm.plugin.sns.model.DownloadManager");
        java.lang.String str2 = jj4Var == null ? "" : jj4Var.f377855d;
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadManager", "[%s][media:%s]onTaskFinish state:%d, reqDownloadType:%d, isThumb:%b,requestKey:%s, totalSize:%d", "[image-flow]", str2, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17), str, java.lang.Integer.valueOf(i19));
        if (!com.tencent.mm.plugin.sns.model.l4.Xj()) {
            gm0.j1.i();
            if (gm0.j1.b().m()) {
                int i29 = 2;
                if (i17 != 2) {
                    this.f164440c += i19;
                }
                synchronized (this.f164444g) {
                    try {
                        z19 = false;
                        if (this.f164440c > 512000 && this.f164449l.size() == 0) {
                            c01.s8 s8Var = c01.n8.f37348a;
                            if (s8Var != null) {
                                ((com.tencent.mm.modelstat.s0) s8Var).a(this.f164440c, 0, 0);
                            }
                            this.f164440c = 0;
                        }
                        i28 = 3;
                        if (9 == i18) {
                            if ((i17 == 1 || i17 == 3) && z18) {
                                this.f164443f.put(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                            }
                        } else if (i17 == 1 || i17 == 3) {
                            this.f164443f.put(str, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                        }
                    } finally {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTaskFinish", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    }
                }
                if (i17 != 3 && ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_try_fix_mismatch_image, false) && i17 == 1 && i18 != 3 && jj4Var != null) {
                    com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
                    hj6.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    com.tencent.mars.xlog.Log.i("MicroMsg.LazyerImageLoader2", "updateCache " + jj4Var.f377855d);
                    com.tencent.mm.memory.r rVar = (com.tencent.mm.memory.r) hj6.f164254c.get(ca4.z0.x(1, jj4Var.f377855d));
                    if (ca4.z0.g(rVar)) {
                        rVar.f68973g.decrementAndGet();
                        rVar.f();
                        com.tencent.mm.plugin.sns.model.l4.Sj().execute(new com.tencent.mm.plugin.sns.model.j1(hj6, jj4Var));
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateCache", "com.tencent.mm.plugin.sns.model.LazyerImageLoader2");
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.DownloadManager", "[%s][media:%s]SnsImageLoadReporter callbackToUI", "[image-flow]", str2);
                if (jj4Var != null) {
                    ta4.u0.h(jj4Var.f377855d, this.f164449l.size(), ((java.util.concurrent.ConcurrentHashMap) this.f164451n).size());
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownLoadFinishByCdn", "com.tencent.mm.plugin.sns.model.DownloadManager");
                synchronized (this.f164444g) {
                    try {
                        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadManager", "onDownLoadFinish by cdn %s, taskDone %s.", str, java.lang.Boolean.valueOf(z18));
                        s(str, z18);
                        if (z18) {
                            ((java.util.concurrent.ConcurrentHashMap) this.f164451n).remove(str);
                        }
                    } catch (java.lang.Throwable th6) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownLoadFinishByCdn", "com.tencent.mm.plugin.sns.model.DownloadManager");
                        throw th6;
                    }
                }
                A();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownLoadFinishByCdn", "com.tencent.mm.plugin.sns.model.DownloadManager");
                C(str, i27, z18);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onReport", "com.tencent.mm.plugin.sns.model.DownloadManager");
                synchronized (this.f164444g) {
                    if (jj4Var != null) {
                        try {
                            com.tencent.mm.plugin.sns.model.k0 x17 = x(jj4Var.f377855d);
                            if (x17 != null) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isDownloadFinished", "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter");
                                boolean z27 = x17.f164342e;
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isDownloadFinished", "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter");
                                if (z27) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter");
                                    if (x17.f164342e) {
                                        long j17 = x17.f164340c;
                                        boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                                        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
                                        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                                        g0Var.C(1040L, 0L, currentTimeMillis);
                                        g0Var.A(1040, 1);
                                    }
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter");
                                }
                            }
                        } catch (java.lang.Throwable th7) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onReport", "com.tencent.mm.plugin.sns.model.DownloadManager");
                            throw th7;
                        }
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onReport", "com.tencent.mm.plugin.sns.model.DownloadManager");
                java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) this.f164447j).iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.sns.model.h0 h0Var = (com.tencent.mm.plugin.sns.model.h0) it.next();
                    if (h0Var != null) {
                        if (i17 == i29 || jj4Var == null) {
                            if ((i18 == i29 || i18 == 10 || i18 == 11 || i18 == 8) && jj4Var != null) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.DownloadManager", "[%s][media:%s]listener onImageFinish[false] listener:%s", "[image-flow]", str2, h0Var);
                                h0Var.onImageFinish(jj4Var.f377855d, i18, z19);
                            } else if ((i18 == 4 || i18 == 6) && jj4Var != null) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.DownloadManager", "[%s][media:%s]listener onSightFinish[false] listener:%s", "[image-flow]", str2, h0Var);
                                h0Var.onSightFinish(jj4Var.f377855d, z19);
                            } else if ((h0Var instanceof com.tencent.mm.plugin.sns.model.i0) && i18 == 1) {
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onThumbFinishFail", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
                                com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentMediaLoadManager", "onThumbFail id:" + str2);
                                java.util.HashSet hashSet = (java.util.HashSet) kotlin.jvm.internal.m0.c(com.tencent.mm.plugin.sns.ui.widget.q2.f171252e).remove(str2);
                                if (hashSet == null) {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onThumbFinishFail", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
                                } else {
                                    java.util.Iterator it6 = hashSet.iterator();
                                    while (it6.hasNext()) {
                                        com.tencent.mm.plugin.sns.ui.widget.k2 k2Var = (com.tencent.mm.plugin.sns.ui.widget.k2) it6.next();
                                        com.tencent.mm.plugin.sns.ui.widget.r2 r2Var = com.tencent.mm.plugin.sns.ui.widget.r2.f171259a;
                                        k2Var.getClass();
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadItem");
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadItem");
                                        java.lang.String str3 = k2Var.f171182a;
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadItem");
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getComment", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadItem");
                                        r45.e86 e86Var = k2Var.f171183b;
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportCommentShowFail$default", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
                                        r2Var.f(str3, e86Var, -1);
                                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportCommentShowFail$default", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaReportManager");
                                    }
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onThumbFinishFail", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentMediaLoadManager");
                                }
                            }
                        } else if (i18 == i28) {
                            h0Var.onSetbg(jj4Var.f377855d);
                        } else if (i18 == 1 || i18 == 9 || i18 == 5 || i18 == 7) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.DownloadManager", "[%s][media:%s]listener onThumbFinish listener:%s", "[image-flow]", str2, h0Var);
                            h0Var.onThumbFinish(jj4Var.f377855d);
                        } else if (i18 == i29 || i18 == 10 || i18 == 11 || i18 == 8) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.DownloadManager", "[%s][media:%s]listener onImageFinish[true] listener:%s", "[image-flow]", str2, h0Var);
                            h0Var.onImageFinish(jj4Var.f377855d, i18, true);
                        } else if (i18 == 4 || i18 == 6) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.DownloadManager", "[%s][media:%s]listener onSightFinish[true] listener:%s", "[image-flow]", str2, h0Var);
                            h0Var.onSightFinish(jj4Var.f377855d, true);
                        }
                        i29 = 2;
                        i28 = 3;
                        z19 = false;
                    }
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.DownloadManager", "[%s][media:%s]onTaskFinish account().hasInitialized", "[image-flow]", str2);
        o();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTaskFinish", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    public void v(com.tencent.mm.plugin.sns.model.h0 h0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeDownLoadEndListener", "com.tencent.mm.plugin.sns.model.DownloadManager");
        this.f164438a.post(new com.tencent.mm.plugin.sns.model.c0(this, h0Var));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeDownLoadEndListener", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    public void w(java.lang.String str, java.lang.Object[] objArr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeDownloadStreamVideoTask", "com.tencent.mm.plugin.sns.model.DownloadManager");
        t21.o2.Di().g(str, objArr);
        synchronized (this.f164445h) {
            try {
                this.f164445h.remove(str);
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeDownloadStreamVideoTask", "com.tencent.mm.plugin.sns.model.DownloadManager");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeDownloadStreamVideoTask", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }

    public com.tencent.mm.plugin.sns.model.k0 x(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeReporter", "com.tencent.mm.plugin.sns.model.DownloadManager");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeReporter", "com.tencent.mm.plugin.sns.model.DownloadManager");
            return null;
        }
        com.tencent.mm.plugin.sns.model.k0 k0Var = (com.tencent.mm.plugin.sns.model.k0) this.f164455r.remove(str);
        if (k0Var != null) {
            k0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("decPicNum", "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter");
            synchronized (k0Var.f164343f) {
                try {
                    int i17 = k0Var.f164339b;
                    if (i17 > 0) {
                        k0Var.f164339b = i17 - 1;
                    }
                    if (k0Var.f164339b == 0) {
                        k0Var.f164342e = true;
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("decPicNum", "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter");
                    throw th6;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("decPicNum", "com.tencent.mm.plugin.sns.model.DownloadManager$SingleImgDownloadByFeedReporter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeReporter", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return k0Var;
    }

    public final boolean y(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeRequestMap", "com.tencent.mm.plugin.sns.model.DownloadManager");
        boolean z17 = false;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f164454q;
            if (concurrentHashMap.containsKey(str)) {
                java.lang.String str2 = (java.lang.String) concurrentHashMap.remove(str);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("decBatchRetryRecordMap", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = this.f164453p;
                    if (concurrentHashMap2.containsKey(str2)) {
                        java.util.concurrent.atomic.AtomicInteger atomicInteger = (java.util.concurrent.atomic.AtomicInteger) concurrentHashMap2.get(str2);
                        if (atomicInteger != null) {
                            int decrementAndGet = atomicInteger.decrementAndGet();
                            com.tencent.mars.xlog.Log.i("MicroMsg.DownloadManager", "unLockDownLoad, key: %s, v: %s.", str2, java.lang.Integer.valueOf(decrementAndGet));
                            if (decrementAndGet == 0) {
                                concurrentHashMap2.remove(str2);
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("decBatchRetryRecordMap", "com.tencent.mm.plugin.sns.model.DownloadManager");
                            z17 = true;
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeRequestMap", "com.tencent.mm.plugin.sns.model.DownloadManager");
                            return z17;
                        }
                        com.tencent.mars.xlog.Log.e("MicroMsg.DownloadManager", "unLockDownLoad, key: %s, value is null.", str2);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("decBatchRetryRecordMap", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeRequestMap", "com.tencent.mm.plugin.sns.model.DownloadManager");
                    return z17;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeRequestMap", "com.tencent.mm.plugin.sns.model.DownloadManager");
        return false;
    }

    public void z(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setMaxThread", "com.tencent.mm.plugin.sns.model.DownloadManager");
        this.f164441d = i17;
        try {
            java.lang.String d17 = com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) ? ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SnsImgDownloadConcurrentCountForWifi") : ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("SnsImgDownloadConcurrentCountForNotWifi");
            if (com.tencent.mm.sdk.platformtools.t8.K0(d17) && z65.c.a()) {
                d17 = "00:00-18:30-1-3;19:30-23:00-1-2;23:00-23:59-1-3;18:30-19:30-3-5;";
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
                java.lang.String[] split = new java.text.SimpleDateFormat("HH:mm").format(new java.util.Date()).split(":");
                int D1 = (com.tencent.mm.sdk.platformtools.t8.D1(split[0], 0) * 60) + com.tencent.mm.sdk.platformtools.t8.D1(split[1], 0);
                android.os.Vibrator vibrator = ca4.z0.f40068a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTimeZoneDis", "com.tencent.mm.plugin.sns.data.SnsUtil");
                long rawOffset = ((int) (java.util.TimeZone.getDefault().getRawOffset() / 60000)) / 60;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTimeZoneDis", "com.tencent.mm.plugin.sns.data.SnsUtil");
                int i18 = D1 - ((((int) rawOffset) - 8) * 60);
                if (i18 < 0) {
                    i18 += 1440;
                } else if (i18 >= 1440) {
                    i18 -= 1440;
                }
                java.lang.String[] split2 = d17.split(";");
                for (int i19 = 0; i19 < split2.length; i19++) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(split2[i19])) {
                        java.lang.String[] split3 = split2[i19].split("-");
                        if (split3 != null && split3.length >= 4) {
                            java.lang.String[] split4 = split3[0].split(":");
                            int D12 = (com.tencent.mm.sdk.platformtools.t8.D1(split4[0], 0) * 60) + com.tencent.mm.sdk.platformtools.t8.D1(split4[1], 0);
                            java.lang.String[] split5 = split3[1].split(":");
                            int D13 = (com.tencent.mm.sdk.platformtools.t8.D1(split5[0], 0) * 60) + com.tencent.mm.sdk.platformtools.t8.D1(split5[1], 0);
                            com.tencent.mars.xlog.Log.i("MicroMsg.DownloadManager", "setMaxThread i:%d [%d,%d] now:%d threadcnt:[%s,%s]", java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(D12), java.lang.Integer.valueOf(D13), java.lang.Integer.valueOf(i18), split3[2], split3[3]);
                            if (i18 <= D13 && i18 > D12) {
                                int D14 = com.tencent.mm.sdk.platformtools.t8.D1(z17 ? split3[2] : split3[3], 0);
                                if (D14 > 0) {
                                    this.f164441d = D14;
                                }
                            }
                        }
                        com.tencent.mars.xlog.Log.e("MicroMsg.DownloadManager", "setMaxThread Err i%d :%s", java.lang.Integer.valueOf(i19), d17);
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.DownloadManager", "setMaxThread :%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DownloadManager", "setMaxThread Res:%d ", java.lang.Integer.valueOf(this.f164441d));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setMaxThread", "com.tencent.mm.plugin.sns.model.DownloadManager");
    }
}
