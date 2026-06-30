package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class o7 implements p94.r0 {

    /* renamed from: h, reason: collision with root package name */
    public static int f164554h;

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f164555i;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f164556a = "";

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.model.r2 f164557b = null;

    /* renamed from: c, reason: collision with root package name */
    public boolean f164558c = false;

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f164559d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f164560e;

    /* renamed from: f, reason: collision with root package name */
    public wa4.x f164561f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.model.y3 f164562g;

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        gm0.j1.i();
        sb6.append(gm0.j1.u().h());
        sb6.append("rangeCache.data");
        f164555i = sb6.toString();
    }

    public o7() {
        java.util.HashSet hashSet = new java.util.HashSet();
        this.f164560e = hashSet;
        hashSet.add(new com.tencent.mm.plugin.sns.model.p7(this));
        this.f164561f = new wa4.x();
        this.f164562g = new com.tencent.mm.plugin.sns.model.u7(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("restoreRangeCache", "com.tencent.mm.plugin.sns.model.UploadManager");
        java.lang.String str = f164555i;
        byte[] N = com.tencent.mm.vfs.w6.N(str, 0, -1);
        if (N == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restoreRangeCache", "com.tencent.mm.plugin.sns.model.UploadManager");
            return;
        }
        try {
            this.f164561f = (wa4.x) new wa4.x().parseFrom(N);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.UploadManager", e17, "", new java.lang.Object[0]);
            com.tencent.mm.vfs.w6.h(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("restoreRangeCache", "com.tencent.mm.plugin.sns.model.UploadManager");
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x095b, code lost:
    
        r6 = com.tencent.mm.plugin.sns.model.g6.f164210a;
        r6 = java.lang.String.valueOf(r20);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEmotionSafeStrategyInfoListOnPost", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        kotlin.jvm.internal.o.g(r6, "key");
        r9 = com.tencent.mm.plugin.sns.model.g6.f164212c;
        r10 = (java.util.LinkedHashMap) r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0979, code lost:
    
        if (r10.get(r6) != null) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x097b, code lost:
    
        r9.put(r6, new java.util.ArrayList());
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0983, code lost:
    
        r6 = r10.get(r6);
        kotlin.jvm.internal.o.d(r6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEmotionSafeStrategyInfoListOnPost", "com.tencent.mm.plugin.sns.model.SnsPostSafeStrategyDataHelper");
        r4 = new java.util.LinkedList((java.util.List) r6);
        r3.V = r4;
        r4.size();
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0a71 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0bfe  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0433 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(com.tencent.mm.plugin.sns.model.o7 r47, com.tencent.mm.plugin.sns.storage.SnsInfo r48) {
        /*
            Method dump skipped, instructions count: 3156
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.model.o7.a(com.tencent.mm.plugin.sns.model.o7, com.tencent.mm.plugin.sns.storage.SnsInfo):boolean");
    }

    public void b(com.tencent.mm.plugin.sns.model.v7 v7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addUploadEndListener", "com.tencent.mm.plugin.sns.model.UploadManager");
        ((java.util.HashSet) this.f164560e).add(v7Var);
        int i17 = f164554h + 1;
        f164554h = i17;
        if (i17 > 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addUploadEndListener", "com.tencent.mm.plugin.sns.model.UploadManager");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addUploadEndListener", "com.tencent.mm.plugin.sns.model.UploadManager");
        }
    }

    public void c(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        r45.kj4 kj4Var;
        java.util.LinkedList linkedList;
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cancelPost", "com.tencent.mm.plugin.sns.model.UploadManager");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cancelPost", "com.tencent.mm.plugin.sns.model.UploadManager");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.UploadManager", "cancel snsinfo " + snsInfo.getLocalid());
        try {
            kj4Var = (r45.kj4) new r45.kj4().parseFrom(snsInfo.getPostBuf());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UploadManager", "error to parser postinfo in canPost " + snsInfo.getLocalid());
            m(snsInfo, 2, "mediaPostInfo parser error " + e17.getMessage());
            kj4Var = null;
        }
        if (kj4Var != null && (linkedList = kj4Var.f378745h) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.ec4 ec4Var = (r45.ec4) it.next();
                com.tencent.mm.plugin.sns.model.i4 xj6 = com.tencent.mm.plugin.sns.model.l4.xj();
                int i18 = ec4Var.f373266d;
                synchronized (xj6) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSceneHashCodeByUploadId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                    if (((java.util.HashMap) xj6.f164304g).containsKey(java.lang.Integer.valueOf(i18))) {
                        i17 = ((java.lang.Integer) ((java.util.HashMap) xj6.f164304g).get(java.lang.Integer.valueOf(i18))).intValue();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSceneHashCodeByUploadId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                    } else {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSceneHashCodeByUploadId", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                        i17 = -1;
                    }
                }
                com.tencent.mm.plugin.sns.model.i4 xj7 = com.tencent.mm.plugin.sns.model.l4.xj();
                int i19 = ec4Var.f373266d;
                synchronized (xj7) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeReleationUploadScene", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                    ((java.util.HashMap) xj7.f164304g).remove(java.lang.Integer.valueOf(i19));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeReleationUploadScene", "com.tencent.mm.plugin.sns.model.SnsAsyncQueueMgr");
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.UploadManager", "cancel upload %d", java.lang.Integer.valueOf(i17));
                if (snsInfo.field_type != 15 && i17 >= 0) {
                    gm0.j1.i();
                    gm0.j1.n().f273288b.c(i17);
                    com.tencent.mm.plugin.sns.model.l4.xj().A(ec4Var.f373266d);
                }
            }
        }
        if (com.tencent.mm.plugin.sns.model.l4.xj().q(snsInfo.localid) && this.f164557b != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.UploadManager", "cancel post");
            com.tencent.mm.plugin.sns.model.r2 r2Var = this.f164557b;
            r2Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setDel", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
            r2Var.f164630m = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setDel", "com.tencent.mm.plugin.sns.model.NetSceneSnsPost");
            gm0.j1.i();
            gm0.j1.n().f273288b.d(this.f164557b);
            com.tencent.mm.plugin.sns.model.l4.xj().z(snsInfo.localid);
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo i110 = com.tencent.mm.plugin.sns.model.l4.Fj().i1(snsInfo.localid);
        if (i110 != null && i110.field_snsId != 0) {
            com.tencent.mm.plugin.sns.model.l4.xj().c(i110.field_snsId);
            gm0.j1.i();
            gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.q2(i110.field_snsId, 1));
        }
        com.tencent.mm.plugin.sns.model.l4.Fj().L0(snsInfo.localid);
        if (snsInfo.getTypeFlag() == 21) {
            ha4.h.a().d();
        }
        snsInfo.getLocalid();
        com.tencent.mm.autogen.events.SnsPostFailEvent snsPostFailEvent = new com.tencent.mm.autogen.events.SnsPostFailEvent();
        snsPostFailEvent.f54829g.f7276a = snsInfo.localid;
        snsPostFailEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cancelPost", "com.tencent.mm.plugin.sns.model.UploadManager");
    }

    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkPostInUI", "com.tencent.mm.plugin.sns.model.UploadManager");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkPostInUI: stack=");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(new com.tencent.mm.sdk.platformtools.z3());
        com.tencent.mars.xlog.Log.i("MicroMsg.UploadManager", sb6.toString());
        com.tencent.mm.plugin.sns.model.l4.Tj().postDelayed(new com.tencent.mm.plugin.sns.model.q7(this), 1000L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkPostInUI", "com.tencent.mm.plugin.sns.model.UploadManager");
    }

    public int e(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("convertTypeToMedia", "com.tencent.mm.plugin.sns.model.UploadManager");
        if (i17 == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertTypeToMedia", "com.tencent.mm.plugin.sns.model.UploadManager");
            return 1;
        }
        if (i17 == 2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertTypeToMedia", "com.tencent.mm.plugin.sns.model.UploadManager");
            return 2;
        }
        if (i17 == 3) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertTypeToMedia", "com.tencent.mm.plugin.sns.model.UploadManager");
            return 3;
        }
        if (i17 == 4) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertTypeToMedia", "com.tencent.mm.plugin.sns.model.UploadManager");
            return 4;
        }
        if (i17 == 76 || i17 == 92) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertTypeToMedia", "com.tencent.mm.plugin.sns.model.UploadManager");
            return 5;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("convertTypeToMedia", "com.tencent.mm.plugin.sns.model.UploadManager");
        return -1;
    }

    public final com.tencent.mm.plugin.sns.model.x7 f(java.lang.String str, int i17, boolean z17) {
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doUploadSight", "com.tencent.mm.plugin.sns.model.UploadManager");
        if (i17 == -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UploadManager", "uploading depend localMediaId can not get the media doUploadSight");
            com.tencent.mm.plugin.sns.model.x7 x7Var = com.tencent.mm.plugin.sns.model.x7.STATE_ERROR;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doUploadSight", "com.tencent.mm.plugin.sns.model.UploadManager");
            return x7Var;
        }
        com.tencent.mm.plugin.sns.storage.l2 n17 = com.tencent.mm.plugin.sns.model.l4.Hj().n1(i17);
        try {
            r45.mj4 mj4Var = (r45.mj4) new r45.mj4().parseFrom(n17.h());
            com.tencent.mars.xlog.Log.i("MicroMsg.UploadManager", "state " + mj4Var.f380570n + " doUploadSight, serverErr:" + mj4Var.f380575s);
            if (ca4.z0.G0(mj4Var)) {
                com.tencent.mm.plugin.sns.model.x7 x7Var2 = com.tencent.mm.plugin.sns.model.x7.STATE_ERROR;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doUploadSight", "com.tencent.mm.plugin.sns.model.UploadManager");
                return x7Var2;
            }
            if (com.tencent.mm.vfs.w6.k(mj4Var.f380576t) == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.UploadManager", "path not fileexist  " + mj4Var.f380576t);
                com.tencent.mm.plugin.sns.model.x7 x7Var3 = com.tencent.mm.plugin.sns.model.x7.STATE_ERROR;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doUploadSight", "com.tencent.mm.plugin.sns.model.UploadManager");
                return x7Var3;
            }
            if (com.tencent.mm.vfs.w6.k(mj4Var.f380577u) == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.UploadManager", "thumbpath not fileexist  " + mj4Var.f380577u);
                java.lang.String[] split = mj4Var.f380577u.split("/");
                java.lang.String str2 = je4.c.f299317a.a() + split[split.length - 1];
                long k17 = com.tencent.mm.vfs.w6.k(str2);
                com.tencent.mars.xlog.Log.i("MicroMsg.UploadManager", "fixPath:" + str2 + " size:" + k17);
                if (k17 <= 0) {
                    com.tencent.mm.plugin.sns.model.x7 x7Var4 = com.tencent.mm.plugin.sns.model.x7.STATE_ERROR;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doUploadSight", "com.tencent.mm.plugin.sns.model.UploadManager");
                    return x7Var4;
                }
                mj4Var.f380577u = str2;
            }
            if (ca4.z0.H0(mj4Var)) {
                com.tencent.mm.plugin.sns.model.x7 x7Var5 = com.tencent.mm.plugin.sns.model.x7.STATE_OK;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doUploadSight", "com.tencent.mm.plugin.sns.model.UploadManager");
                return x7Var5;
            }
            if (com.tencent.mm.plugin.sns.model.l4.xj().e(i17)) {
                com.tencent.mm.plugin.sns.model.l4.Hj().Y2(i17, n17);
                com.tencent.mm.plugin.sns.model.z3 z3Var = new com.tencent.mm.plugin.sns.model.z3(str, i17, n17, mj4Var.f380576t, mj4Var.f380577u, this.f164562g);
                java.lang.String str3 = mj4Var.f380580x;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkUpload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
                java.lang.String str4 = z3Var.f164796a;
                java.lang.String p17 = com.tencent.mm.vfs.w6.p(str4);
                boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(z3Var.f164803h);
                com.tencent.mm.plugin.sns.model.y3 y3Var = z3Var.f164800e;
                if (K0 || z3Var.f164803h.equals(p17)) {
                    r45.vh4 vh4Var = z3Var.f164804i.B;
                    if (vh4Var == null) {
                        vh4Var = new r45.vh4();
                    }
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str3) && vh4Var.f388241n) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SightCdnUpload", "from skip compress, set local capture to true, appId:%s", str3);
                        vh4Var.f388235e = true;
                        vh4Var.f388242o = str3;
                        if (!((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).bj() && t21.u2.b(str4)) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.SightCdnUpload", "checkUpload: from skip compress share h265 video, but user do not allow to export h265");
                            vh4Var.f388241n = false;
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.SightCdnUpload", "check upload %s %d %s %s", str4, java.lang.Integer.valueOf(vh4Var.f388236f), java.lang.Boolean.valueOf(vh4Var.f388235e), str3);
                    com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str4, true);
                    if (d17 != null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SightCdnUpload", "mediaInfo: %s", d17);
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                            i18 = com.tencent.mm.sdk.platformtools.o4.R("OpenSdkVideoTime").o(str3, d11.s.fj().nj().f71195h);
                        } else if (vh4Var.f388243p) {
                            i18 = d11.s.fj().qj().f71195h;
                        } else {
                            i18 = (vh4Var.f388235e ? d11.s.fj().pj() : d11.s.fj().nj()).f71195h;
                        }
                        long j17 = i18;
                        if (j17 <= 0) {
                            j17 = 10;
                        }
                        long j18 = (j17 * 1000) + 3000;
                        com.tencent.mars.xlog.Log.i("MicroMsg.SightCdnUpload", "maxVideoLen: %s", java.lang.Long.valueOf(j18));
                        int i19 = d17.f162382a;
                        if (i19 >= j18) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.SightCdnUpload", "checkUpload isNotSafeSightVideo videoDuration: %s ", java.lang.Integer.valueOf(i19));
                            z3Var.h(-2);
                            ((com.tencent.mm.plugin.sns.model.u7) y3Var).a(false, z3Var);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkUpload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
                        }
                    }
                    if (!vh4Var.f388235e) {
                        z3Var.f(vh4Var, str3);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkUpload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
                    } else if (vh4Var.f388236f >= 3) {
                        z3Var.g();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkUpload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SightCdnUpload", "try need remux %d %s", 1, str4);
                        com.tencent.mm.autogen.events.SnsRemuxTaskEvent snsRemuxTaskEvent = new com.tencent.mm.autogen.events.SnsRemuxTaskEvent();
                        snsRemuxTaskEvent.f192364d = new com.tencent.mm.plugin.sns.model.u3(z3Var, snsRemuxTaskEvent, vh4Var, str3);
                        com.tencent.mm.plugin.sns.model.v3 v3Var = new com.tencent.mm.plugin.sns.model.v3(z3Var);
                        am.qw qwVar = snsRemuxTaskEvent.f54834g;
                        qwVar.f7752d = v3Var;
                        qwVar.f7749a = str4;
                        qwVar.f7750b = vh4Var;
                        qwVar.f7751c = new com.tencent.mm.plugin.sns.model.w3(z3Var, vh4Var);
                        snsRemuxTaskEvent.d(com.tencent.mm.plugin.sns.model.l4.Sj());
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkUpload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
                    }
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SightCdnUpload", "checkUpload isNotSafeSightVideo old srcmd5 %s newmd5 %s ", z3Var.f164803h, p17);
                    z3Var.h(-2);
                    ((com.tencent.mm.plugin.sns.model.u7) y3Var).a(false, z3Var);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkUpload", "com.tencent.mm.plugin.sns.model.SightCdnUpload");
                }
            }
            com.tencent.mm.plugin.sns.model.x7 x7Var6 = com.tencent.mm.plugin.sns.model.x7.STATE_FALSE;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doUploadSight", "com.tencent.mm.plugin.sns.model.UploadManager");
            return x7Var6;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UploadManager", "parse uploadInfo error doUploadSight");
            com.tencent.mm.plugin.sns.model.x7 x7Var7 = com.tencent.mm.plugin.sns.model.x7.STATE_ERROR;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doUploadSight", "com.tencent.mm.plugin.sns.model.UploadManager");
            return x7Var7;
        }
    }

    public wa4.x g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRangeCache", "com.tencent.mm.plugin.sns.model.UploadManager");
        wa4.x xVar = this.f164561f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRangeCache", "com.tencent.mm.plugin.sns.model.UploadManager");
        return xVar;
    }

    public java.util.LinkedList h() {
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRecentUploadUrl", "com.tencent.mm.plugin.sns.model.UploadManager");
        if (this.f164559d == null) {
            java.lang.String string = com.tencent.mm.sdk.platformtools.o4.M("SnsMMKV").getString("SnsMMKVUploadUrl", "");
            if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                this.f164559d = new java.util.LinkedList();
            } else {
                java.lang.String[] split = string.split(" ");
                if (split == null || split.length == 0) {
                    linkedList = null;
                } else {
                    linkedList = new java.util.LinkedList();
                    for (int i17 = 1; i17 < split.length; i17 += 2) {
                        linkedList.add(new android.util.Pair(split[i17 - 1], split[i17]));
                    }
                }
                this.f164559d = linkedList;
                if (linkedList == null) {
                    this.f164559d = new java.util.LinkedList();
                }
            }
        }
        java.util.LinkedList linkedList2 = this.f164559d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRecentUploadUrl", "com.tencent.mm.plugin.sns.model.UploadManager");
        return linkedList2;
    }

    public final java.lang.String i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelfName", "com.tencent.mm.plugin.sns.model.UploadManager");
        java.lang.String str = this.f164556a;
        if (str == null || str.equals("")) {
            gm0.j1.i();
            this.f164556a = (java.lang.String) gm0.j1.u().c().l(2, null);
        }
        java.lang.String str2 = this.f164556a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelfName", "com.tencent.mm.plugin.sns.model.UploadManager");
        return str2;
    }

    public final void j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyChangedBg", "com.tencent.mm.plugin.sns.model.UploadManager");
        com.tencent.mm.plugin.sns.storage.x1 L0 = com.tencent.mm.plugin.sns.model.l4.Bj().L0(i());
        java.util.Iterator it = ((java.util.HashSet) this.f164560e).iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.sns.model.v7 v7Var = (com.tencent.mm.plugin.sns.model.v7) it.next();
            if (v7Var != null) {
                v7Var.updateBackView(L0);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyChangedBg", "com.tencent.mm.plugin.sns.model.UploadManager");
    }

    public void k(int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyEventUI", "com.tencent.mm.plugin.sns.model.UploadManager");
        com.tencent.mm.plugin.sns.model.l4.Tj().post(new com.tencent.mm.plugin.sns.model.s7(this, i17, z17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyEventUI", "com.tencent.mm.plugin.sns.model.UploadManager");
    }

    public void l(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, int i18, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processError", "com.tencent.mm.plugin.sns.model.UploadManager");
        com.tencent.mars.xlog.Log.i("MicroMsg.UploadManager", "localId " + snsInfo.getLocalid() + "processError " + i18 + " errMsg: " + str);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(22L, 129L, 1L, true);
        if (i18 == 7) {
            try {
                r45.kj4 postInfo = snsInfo.getPostInfo();
                if (postInfo != null) {
                    postInfo.f378753s = 7;
                    snsInfo.setPostBuf(postInfo.toByteArray());
                }
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.UploadManager", "parse uploadInfo error");
            }
        } else if (i17 != 0) {
            try {
                int i19 = ((r45.mj4) new r45.mj4().parseFrom(com.tencent.mm.plugin.sns.model.l4.Hj().n1(i17).h())).f380575s;
                r45.kj4 postInfo2 = snsInfo.getPostInfo();
                if (postInfo2 != null) {
                    postInfo2.f378753s = i19;
                    snsInfo.setPostBuf(postInfo2.toByteArray());
                }
            } catch (java.lang.Exception unused2) {
                com.tencent.mars.xlog.Log.e("MicroMsg.UploadManager", "parse uploadInfo error");
            }
        } else {
            snsInfo.getPostInfo();
        }
        snsInfo.setItemDie();
        com.tencent.mm.plugin.sns.model.l4.Fj().w3(snsInfo.localid, snsInfo);
        if (i18 != 7) {
            com.tencent.mm.autogen.events.SnsPostFailEvent snsPostFailEvent = new com.tencent.mm.autogen.events.SnsPostFailEvent();
            snsPostFailEvent.f54829g.f7276a = snsInfo.localid;
            snsPostFailEvent.e();
        }
        switch (i18) {
            case 1:
                com.tencent.mars.xlog.Log.e("MicroMsg.UploadManager", "upload find timeLine is null delete this item");
                break;
            case 2:
                com.tencent.mars.xlog.Log.e("MicroMsg.UploadManager", "parser protobuf error");
                break;
            case 3:
                com.tencent.mars.xlog.Log.e("MicroMsg.UploadManager", "local id is not in db");
                break;
            case 4:
                com.tencent.mars.xlog.Log.e("MicroMsg.UploadManager", "arg is error");
                break;
            case 5:
                com.tencent.mars.xlog.Log.e("MicroMsg.UploadManager", "pullTimeLineXml  error");
                break;
            case 6:
                com.tencent.mars.xlog.Log.e("MicroMsg.UploadManager", "errtle  error");
                break;
            case 7:
                com.tencent.mars.xlog.Log.e("MicroMsg.UploadManager", "ERR_BACKGROUND_VIDEO_REMUX_FAIED");
                break;
        }
        k(snsInfo.localid, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processError", "com.tencent.mm.plugin.sns.model.UploadManager");
    }

    public void m(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("processError", "com.tencent.mm.plugin.sns.model.UploadManager");
        l(snsInfo, 0, i17, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("processError", "com.tencent.mm.plugin.sns.model.UploadManager");
    }

    public void n(com.tencent.mm.plugin.sns.model.v7 v7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeUploadEndListener", "com.tencent.mm.plugin.sns.model.UploadManager");
        ((java.util.HashSet) this.f164560e).remove(v7Var);
        int i17 = f164554h - 1;
        f164554h = i17;
        if (i17 > 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeUploadEndListener", "com.tencent.mm.plugin.sns.model.UploadManager");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeUploadEndListener", "com.tencent.mm.plugin.sns.model.UploadManager");
        }
    }

    public final void o(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replaceFile", "com.tencent.mm.plugin.sns.model.UploadManager");
        com.tencent.mm.vfs.w6.h(str2);
        com.tencent.mm.vfs.w6.c(str, str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replaceFile", "com.tencent.mm.plugin.sns.model.UploadManager");
    }

    public boolean p(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsBg", "com.tencent.mm.plugin.sns.model.UploadManager");
        if (i() != null && !i().equals("")) {
            java.lang.String str = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), jj4Var.f377855d) + ca4.z0.J(jj4Var);
            java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), i());
            java.lang.String str2 = d17 + i() + "bg_";
            if (com.tencent.mm.vfs.w6.j(str)) {
                com.tencent.mm.vfs.w6.u(d17);
                com.tencent.mm.vfs.w6.h(str2);
                com.tencent.mm.vfs.w6.h(d17 + i() + "tbg_");
                com.tencent.mm.vfs.w6.c(str, str2);
            } else {
                com.tencent.mm.vfs.w6.h(str2);
                com.tencent.mm.vfs.w6.h(d17 + i() + "tbg_");
                com.tencent.mars.xlog.Log.e("MicroMsg.UploadManager", "bg file is not exist! wait to down it");
            }
            com.tencent.mm.plugin.sns.model.l4.Bj().P0(i(), d17 + i() + "bg_", "", 0.0f);
            oi0.e.f345591d.a(str, 0.0f);
        }
        j();
        com.tencent.mm.plugin.sns.model.y7 y7Var = new com.tencent.mm.plugin.sns.model.y7(7, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addMedia", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        jj4Var.f377871t = 1;
        y7Var.f164781f.ContentObj.f369840h.add(jj4Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addMedia", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        y7Var.F(2);
        int i17 = y7Var.i();
        com.tencent.mm.plugin.sns.statistics.s0.f164937k0.W = i17;
        boolean z17 = i17 > 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsBg", "com.tencent.mm.plugin.sns.model.UploadManager");
        return z17;
    }

    public void q(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia first;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsCoverByFinder", "com.tencent.mm.plugin.sns.model.UploadManager");
        if (i() != null && !i().equals("")) {
            java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), i());
            com.tencent.mm.vfs.w6.u(d17);
            com.tencent.mm.vfs.w6.h(d17 + i() + "bg_");
            com.tencent.mm.plugin.sns.storage.a2 Bj = com.tencent.mm.plugin.sns.model.l4.Bj();
            java.lang.String userName = i();
            Bj.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateCoverFinderInfo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            kotlin.jvm.internal.o.g(userName, "userName");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverStorage", "updateCoverFinderInfo :".concat(userName));
            if ((finderObject != null ? finderObject.getObjectDesc() : null) == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateCoverFinderInfo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            } else {
                com.tencent.mm.plugin.sns.storage.x1 L0 = Bj.L0(userName);
                Bj.z0(L0);
                ((ku5.t0) ku5.t0.f312615d).a(new com.tencent.mm.plugin.sns.storage.z1(L0.field_localVideo, L0.field_localThumb, L0.field_localImage));
                L0.field_localVideo = "";
                L0.field_localThumb = "";
                L0.field_localImage = "";
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
                java.lang.Integer valueOf = objectDesc != null ? java.lang.Integer.valueOf(objectDesc.getMediaType()) : null;
                if (valueOf != null && valueOf.intValue() == 2) {
                    L0.field_type = 4;
                } else if (valueOf != null && valueOf.intValue() == 4) {
                    L0.field_type = 3;
                } else {
                    L0.field_type = 0;
                }
                try {
                    L0.field_success = false;
                    L0.field_finderCheckTime = java.lang.System.currentTimeMillis();
                    L0.field_finderObject = finderObject.toByteArray();
                    com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = finderObject.getObjectDesc();
                    if (objectDesc2 != null && (media = objectDesc2.getMedia()) != null && (first = media.getFirst()) != null) {
                        L0.field_thumbUrl = first.getThumbUrl() + first.getThumb_url_token();
                    }
                } catch (java.io.IOException unused) {
                }
                Bj.W0(L0, false);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateCoverFinderInfo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            }
            oi0.e.f345591d.d(finderObject);
        }
        j();
        java.lang.String userName2 = i();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("uploadFinderVideoCover", "com.tencent.mm.plugin.sns.model.upload.SnsCoverUploadHelper");
        kotlin.jvm.internal.o.g(userName2, "userName");
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        ((ku5.t0) ku5.t0.f312615d).a(new oa4.b(finderObject, userName2));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("uploadFinderVideoCover", "com.tencent.mm.plugin.sns.model.upload.SnsCoverUploadHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsCoverByFinder", "com.tencent.mm.plugin.sns.model.UploadManager");
    }

    public void r(java.util.ArrayList arrayList, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsCoverByPhoto", "com.tencent.mm.plugin.sns.model.UploadManager");
        java.util.Iterator it = arrayList.iterator();
        java.lang.String str = "";
        java.lang.String str2 = str;
        while (it.hasNext()) {
            com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo mediaSingleInfo = (com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo) it.next();
            og3.a aVar = mediaSingleInfo.f148609d;
            og3.a aVar2 = og3.a.f345156e;
            java.lang.String str3 = mediaSingleInfo.f148610e;
            if (aVar == aVar2) {
                str = str3;
            }
            if (aVar == og3.a.f345157f) {
                str2 = str3;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.UploadManager", "coverPath:%s thumbPath:%s", str, str2);
        if (i() != null && !i().equals("")) {
            java.lang.String d17 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), i());
            com.tencent.mm.vfs.w6.u(d17);
            com.tencent.mm.vfs.w6.h(d17 + i() + "bg_");
            java.lang.String i17 = i();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getThumbPath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
            java.lang.String d18 = com.tencent.mm.plugin.sns.model.f6.d(com.tencent.mm.plugin.sns.model.l4.Di(), i17);
            com.tencent.mm.vfs.w6.u(d18);
            java.lang.String str4 = d18 + i17 + "thumb_bg_";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getThumbPath", "com.tencent.mm.plugin.sns.model.SnsPathHelper");
            java.lang.String c17 = com.tencent.mm.plugin.sns.model.f6.c(i());
            o(str, c17);
            o(str2, str4);
            com.tencent.mm.plugin.sns.model.l4.Bj().P0(i(), str4, c17, f17);
            oi0.e.f345591d.a(c17, f17);
        }
        j();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("uploadSnsImageCover", "com.tencent.mm.plugin.sns.model.upload.SnsCoverUploadHelper");
        com.tencent.mm.plugin.sns.model.y7 y7Var = new com.tencent.mm.plugin.sns.model.y7(7, null);
        if (com.tencent.mm.vfs.w6.j(str2)) {
            y7Var.a(str2, "");
        }
        if (com.tencent.mm.vfs.w6.j(str)) {
            y7Var.a(str, "");
        }
        y7Var.F(1);
        int i18 = (int) (f17 * 10000);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsCoverOffset", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        y7Var.f164781f.snsCoverOffset = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.UploadPackHelper", "setSnsCoverOffset:%d", java.lang.Integer.valueOf(i18));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsCoverOffset", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
        int i19 = y7Var.i();
        com.tencent.mm.plugin.sns.statistics.s0.f164937k0.W = i19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLocalId", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        ba4.b.f18700c = i19;
        ba4.b.f18699b = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLocalId", "com.tencent.mm.plugin.sns.cover.report.SnsCoverReporter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverUploadHelper", "uploadSnsImageCover source:" + str + "  thumb:" + str2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("uploadSnsImageCover", "com.tencent.mm.plugin.sns.model.upload.SnsCoverUploadHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsCoverByPhoto", "com.tencent.mm.plugin.sns.model.UploadManager");
    }

    public com.tencent.mm.plugin.sns.model.y7 s(com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
        java.lang.String str4 = wXMediaMessage.description;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject iMediaObject = wXMediaMessage.mediaObject;
        int type = iMediaObject.type();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
        if (type != 76) {
            if (type != 130) {
                if (type == 92) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
                    i17 = 47;
                } else if (type != 93) {
                    switch (type) {
                        case 1:
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
                            i17 = 2;
                            break;
                        case 2:
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
                            i17 = 1;
                            break;
                        case 3:
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
                            i17 = 4;
                            break;
                        case 4:
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
                            i17 = 5;
                            break;
                        case 5:
                        case 6:
                            break;
                        case 7:
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
                            i17 = 3;
                            break;
                        default:
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
                            i17 = -1;
                            break;
                    }
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
                    i17 = 48;
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
            i17 = 3;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ConvertTypeToTimeLine", "com.tencent.mm.plugin.sns.model.UploadManager");
            i17 = 42;
        }
        com.tencent.mm.plugin.sns.model.y7 y7Var = new com.tencent.mm.plugin.sns.model.y7(i17, null);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        y7Var.J(str2 == null ? "" : str2);
        y7Var.I(str3 == null ? "" : str3);
        y7Var.N(5);
        if (i17 == -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
            return null;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            y7Var.t(str);
        }
        java.lang.String str5 = wXMediaMessage.title;
        if (str5 == null) {
            str5 = "";
        }
        y7Var.C(str5);
        java.lang.String str6 = wXMediaMessage.description;
        if (str6 == null) {
            str6 = "";
        }
        y7Var.B(str6);
        int type2 = iMediaObject.type();
        if (type2 != 130) {
            switch (type2) {
                case 1:
                    y7Var.B("");
                    y7Var.t(((com.tencent.mm.opensdk.modelmsg.WXTextObject) iMediaObject).text);
                    break;
                case 2:
                    com.tencent.mm.opensdk.modelmsg.WXImageObject wXImageObject = (com.tencent.mm.opensdk.modelmsg.WXImageObject) iMediaObject;
                    if (com.tencent.mm.sdk.platformtools.t8.M0(wXImageObject.imageData)) {
                        if (com.tencent.mm.sdk.platformtools.t8.K0(wXImageObject.imagePath)) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.UploadManager", "share img but no res is exist!");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
                            return null;
                        }
                        if (!y7Var.a(wXImageObject.imagePath, "")) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
                            return null;
                        }
                    } else if (!y7Var.c(wXImageObject.imageData, "", "")) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
                        return null;
                    }
                    break;
                case 3:
                    com.tencent.mm.opensdk.modelmsg.WXMusicObject wXMusicObject = (com.tencent.mm.opensdk.modelmsg.WXMusicObject) iMediaObject;
                    java.lang.String str7 = !com.tencent.mm.sdk.platformtools.t8.K0(wXMusicObject.musicUrl) ? wXMusicObject.musicUrl : wXMusicObject.musicLowBandUrl;
                    java.lang.String str8 = str7 == null ? "" : str7;
                    java.lang.String str9 = !com.tencent.mm.sdk.platformtools.t8.K0(wXMusicObject.musicDataUrl) ? wXMusicObject.musicDataUrl : wXMusicObject.musicUrl;
                    java.lang.String str10 = str9 == null ? "" : str9;
                    y7Var.C("");
                    y7Var.B("");
                    int e17 = e(3);
                    if (e17 == -1) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
                        return null;
                    }
                    java.lang.String str11 = !com.tencent.mm.sdk.platformtools.t8.K0(wXMusicObject.musicLowBandDataUrl) ? wXMusicObject.musicLowBandDataUrl : wXMusicObject.musicLowBandUrl;
                    java.lang.String str12 = str11 == null ? "" : str11;
                    byte[] bArr = wXMediaMessage.thumbData;
                    java.lang.String str13 = wXMediaMessage.title;
                    java.lang.String str14 = str13 == null ? "" : str13;
                    java.lang.String str15 = wXMediaMessage.description;
                    if (!y7Var.e(bArr, str8, str12, str10, e17, str14, str15 == null ? "" : str15, wXMusicObject.songAlbumUrl, wXMusicObject.songLyric, "")) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
                        return null;
                    }
                    break;
                case 4:
                    com.tencent.mm.opensdk.modelmsg.WXVideoObject wXVideoObject = (com.tencent.mm.opensdk.modelmsg.WXVideoObject) iMediaObject;
                    y7Var.C("");
                    y7Var.B("");
                    int e18 = e(4);
                    if (e18 == -1) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
                        return null;
                    }
                    java.lang.String str16 = !com.tencent.mm.sdk.platformtools.t8.K0(wXVideoObject.videoUrl) ? wXVideoObject.videoUrl : wXVideoObject.videoLowBandUrl;
                    java.lang.String str17 = str16 == null ? "" : str16;
                    byte[] bArr2 = wXMediaMessage.thumbData;
                    java.lang.String str18 = wXVideoObject.videoLowBandUrl;
                    java.lang.String str19 = wXVideoObject.videoUrl;
                    java.lang.String str20 = wXMediaMessage.title;
                    java.lang.String str21 = str20 == null ? "" : str20;
                    java.lang.String str22 = wXMediaMessage.description;
                    if (!y7Var.e(bArr2, str17, str18, str19, e18, str21, str22 == null ? "" : str22, "", "", "")) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
                        return null;
                    }
                    break;
                case 5:
                    com.tencent.mm.opensdk.modelmsg.WXWebpageObject wXWebpageObject = (com.tencent.mm.opensdk.modelmsg.WXWebpageObject) iMediaObject;
                    if (!com.tencent.mm.sdk.platformtools.t8.M0(wXMediaMessage.thumbData)) {
                        byte[] bArr3 = wXMediaMessage.thumbData;
                        java.lang.String str23 = wXMediaMessage.description;
                        if (str23 == null) {
                            str23 = "";
                        }
                        java.lang.String str24 = wXMediaMessage.title;
                        y7Var.c(bArr3, str23, str24 != null ? str24 : "");
                    }
                    y7Var.B(wXWebpageObject.webpageUrl);
                    y7Var.D(wXWebpageObject.webpageUrl);
                    java.lang.String str25 = wXWebpageObject.webpageUrl;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContentUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                    y7Var.f164781f.ContentObj.f369839g = str25;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContentUrl", "com.tencent.mm.plugin.sns.model.UploadPackHelper");
                    y7Var.s(wXWebpageObject.canvasPageXml);
                    break;
                case 6:
                    break;
                case 7:
                    com.tencent.mm.opensdk.modelmsg.WXAppExtendObject wXAppExtendObject = (com.tencent.mm.opensdk.modelmsg.WXAppExtendObject) iMediaObject;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(wXAppExtendObject.filePath) && wXAppExtendObject.filePath.startsWith("http")) {
                        y7Var.C(wXAppExtendObject.filePath);
                        y7Var.B(wXAppExtendObject.filePath);
                        break;
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.UploadManager", "appdata is not support!");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
                        return null;
                    }
                    break;
                default:
                    com.tencent.mars.xlog.Log.e("MicroMsg.UploadManager", "none type not support!");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
                    return null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
            return y7Var;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.UploadManager", "file is not support!");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("shareAppMsgImp", "com.tencent.mm.plugin.sns.model.UploadManager");
        return null;
    }
}
