package ln1;

/* loaded from: classes12.dex */
public class x {
    public static boolean B = false;
    public static int C = 8;
    public static final boolean D = j62.e.g().l("clicfg_backup_recover_merge_optimize", false, true, true);
    public static final boolean E = j62.e.g().l("clicfg_backup_recover_merge_mem_strictly", false, true, true);
    public static final boolean F = j62.e.g().l("clicfg_backup_recover_merge_mem_loosely", false, true, true);
    public static final boolean G;
    public int A;

    /* renamed from: a, reason: collision with root package name */
    public boolean f319847a;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f319850d;

    /* renamed from: f, reason: collision with root package name */
    public final int f319852f;

    /* renamed from: g, reason: collision with root package name */
    public final long f319853g;

    /* renamed from: h, reason: collision with root package name */
    public volatile long f319854h;

    /* renamed from: j, reason: collision with root package name */
    public final kn1.f f319856j;

    /* renamed from: k, reason: collision with root package name */
    public final int f319857k;

    /* renamed from: m, reason: collision with root package name */
    public kn1.e f319859m;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f319861o;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f319863q;

    /* renamed from: t, reason: collision with root package name */
    public java.util.concurrent.ExecutorService f319866t;

    /* renamed from: z, reason: collision with root package name */
    public boolean f319872z;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f319848b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f319849c = false;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f319851e = new java.util.HashSet();

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Object f319855i = new java.lang.Object();

    /* renamed from: l, reason: collision with root package name */
    public long f319858l = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f319860n = 0;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.BackupReportErrorStruct f319862p = new com.tencent.mm.autogen.mmdata.rpt.BackupReportErrorStruct();

    /* renamed from: r, reason: collision with root package name */
    public long f319864r = 0;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Map f319865s = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentSkipListSet f319867u = new java.util.concurrent.ConcurrentSkipListSet();

    /* renamed from: v, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentSkipListSet f319868v = new java.util.concurrent.ConcurrentSkipListSet();

    /* renamed from: w, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentSkipListSet f319869w = new java.util.concurrent.ConcurrentSkipListSet();

    /* renamed from: x, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f319870x = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: y, reason: collision with root package name */
    public long f319871y = 0;

    static {
        j62.e.g().l("clicfg_backup_recover_merge_complement_media", false, true, true);
        G = j62.e.g().l("clicfg_backup_recover_avoid_same_message", false, true, true);
    }

    public x(kn1.f fVar, int i17, kn1.e eVar, int i18, boolean z17, java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        long j17;
        com.tencent.mm.storage.o h17 = c01.d9.b().h();
        h17.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        android.database.Cursor all = h17.getAll();
        if (all == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupRecoverMsgListDataIdStorage", "getAllData failed.");
        } else {
            while (all.moveToNext()) {
                com.tencent.mm.storage.n nVar = new com.tencent.mm.storage.n();
                nVar.convertFrom(all);
                hashMap.put(nVar.field_msgListDataId, nVar.field_sessionName);
            }
            all.close();
        }
        this.f319850d = hashMap;
        this.f319856j = fVar;
        this.f319857k = i17;
        this.f319859m = eVar;
        this.f319852f = i18;
        B = z17;
        com.tencent.mm.storage.o h18 = c01.d9.b().h();
        h18.getClass();
        android.database.Cursor cursor = null;
        try {
            try {
                cursor = h18.f195188d.B("SELECT COUNT(*) FROM BackupRecoverMsgListDataId", null);
                j17 = cursor.moveToLast() ? cursor.getLong(0) : 0L;
                cursor.close();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupRecoverMsgListDataIdStorage", e17, "longForQuery failed", new java.lang.Object[0]);
                if (cursor != null) {
                    cursor.close();
                }
                j17 = 0;
            }
            this.f319853g = j17;
            java.util.HashMap hashMap2 = new java.util.HashMap();
            java.util.Iterator it = linkedList2.iterator();
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                java.lang.String str = (java.lang.String) it6.next();
                if (it.hasNext()) {
                    long longValue = ((java.lang.Long) it.next()).longValue();
                    longValue = longValue == 0 ? Long.MIN_VALUE : longValue;
                    if (!it.hasNext()) {
                        break;
                    }
                    long longValue2 = ((java.lang.Long) it.next()).longValue();
                    hashMap2.put(str, new android.util.Pair(java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(longValue2 == 0 ? com.tencent.wcdb.core.Database.DictDefaultMatchValue : longValue2)));
                }
            }
            this.f319863q = hashMap2;
            this.f319851e.clear();
            this.f319854h = 0L;
            this.f319861o = com.tencent.mm.sdk.platformtools.o4.M("MMKV_BACKUP");
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupRecoverMerger", "BackupRecoverMerger, msgListDataIdHashMap[%d], backupMode[%d], totalMsgList[%d], totalSession[%d], isQuickBackup[%b]", java.lang.Integer.valueOf(this.f319850d.size()), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(this.f319853g), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17));
        } catch (java.lang.Throwable th6) {
            if (cursor != null) {
                cursor.close();
            }
            throw th6;
        }
    }

    public static void a(ln1.x xVar, boolean z17, int i17) {
        int i18 = xVar.f319860n;
        if (i18 == 1 || i18 == 0) {
            if (i18 == 1) {
                xVar.c();
            }
            xVar.f319860n = 2;
            if (z17) {
                int i19 = xVar.f319857k;
                if (i19 == 1) {
                    c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_BACKUP_PC_MERGERING_BOOLEAN, java.lang.Boolean.FALSE);
                } else if (i19 == 2) {
                    c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_BACKUP_MOVE_MERGERING_BOOLEAN, java.lang.Boolean.FALSE);
                }
                ((ku5.t0) ku5.t0.f312615d).g(new ln1.w(xVar));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupRecoverMerger", "cancel and restart sync");
            if (i17 != 0) {
                xVar.f319856j.e().f309609a = i17;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                xVar.i(i17);
            }
            xVar.f319860n = 0;
            synchronized (xVar) {
                xVar.f319849c = false;
            }
            int i27 = xVar.f319861o.getInt("MMKV_BACKUP_TRY_TIME", 0);
            xVar.f319861o.A("MMKV_BACKUP_TRY_TIME", i27 > 0 ? i27 - 1 : 0);
            xVar.f319861o.G("MMKV_BACKUP_NEED_REPORT", false);
            xVar.f319861o.D("MMKV_BACKUP_ERROR_CACHE", "");
            xVar.f319856j.g();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x020e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x022a A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02f8 A[Catch: all -> 0x0302, TryCatch #1 {all -> 0x0302, blocks: (B:163:0x0253, B:164:0x025a, B:166:0x0260, B:269:0x0272, B:274:0x0282, B:272:0x028a, B:191:0x02f2, B:193:0x02f8, B:200:0x030a, B:202:0x0314, B:204:0x0318, B:206:0x031e, B:211:0x0343, B:213:0x0361, B:215:0x0379, B:216:0x0399, B:225:0x0468, B:227:0x048f, B:230:0x03ce, B:232:0x03e2, B:234:0x03ec, B:235:0x03f1, B:236:0x03f2, B:238:0x03fa, B:240:0x0408, B:242:0x0416, B:244:0x0422, B:246:0x042a, B:247:0x0443, B:249:0x0458, B:250:0x045d, B:251:0x045e, B:169:0x0298, B:257:0x02ae, B:259:0x02ba, B:265:0x02c3, B:177:0x02c9, B:181:0x02d7, B:183:0x02e3, B:190:0x02ed, B:277:0x04a3, B:208:0x0324), top: B:162:0x0253, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x02ae A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(ln1.x r33, java.lang.String r34, java.util.Map r35, android.util.Pair r36, java.lang.String r37, com.tencent.mm.pointers.PString r38, com.tencent.mm.pointers.PBool r39) {
        /*
            Method dump skipped, instructions count: 1512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ln1.x.b(ln1.x, java.lang.String, java.util.Map, android.util.Pair, java.lang.String, com.tencent.mm.pointers.PString, com.tencent.mm.pointers.PBool):int");
    }

    public void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupRecoverMerger", "backupFinishMerge");
        new com.tencent.mm.autogen.events.CleanWxFileIndexEvent().e();
        new com.tencent.mm.autogen.events.BackupResetAccUinEvent().e();
        tn1.c d17 = tn1.f.f().d();
        d17.f420797b.post(new tn1.a(d17));
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).tb();
        new com.tencent.mm.autogen.events.ShouldRescanMessagesEvent().e();
        z65.c.f470458d = false;
        com.tencent.mm.sdk.platformtools.t8.f192989a = false;
        fq3.n nVar = (fq3.n) ((gq3.e) i95.n0.c(gq3.e.class));
        nVar.getClass();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(nVar.C, null);
        on1.c.f346809d.clear();
        this.f319867u.clear();
        this.f319868v.clear();
        this.f319869w.clear();
        this.f319870x.clear();
        if (G && this.f319871y > 0) {
            jx3.f.INSTANCE.d(21019, 0, java.lang.Long.valueOf(this.f319871y), java.lang.Integer.valueOf(com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT), "existMsgSvrIdSet_finish");
        }
        java.util.concurrent.ExecutorService executorService = this.f319866t;
        if (executorService != null) {
            executorService.shutdownNow();
        }
    }

    public void d(boolean z17, int i17) {
        synchronized (this.f319855i) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupRecoverMerger", "cancel, needClearContinueRecoverData[%b], mergeState[%d], updateState[%d]", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f319860n), java.lang.Integer.valueOf(i17));
            this.f319847a = true;
        }
        if (G && this.f319871y > 0) {
            jx3.f.INSTANCE.d(21019, 0, java.lang.Long.valueOf(this.f319871y), java.lang.Integer.valueOf(com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT), "existMsgSvrIdSet_cancel");
        }
        this.f319872z = z17;
        this.A = i17;
        ((com.tencent.mm.booter.notification.x) c01.d9.f()).k(false);
        this.f319856j.g();
        this.f319859m = null;
        java.util.concurrent.ExecutorService executorService = this.f319866t;
        if (executorService != null) {
            executorService.shutdownNow();
        }
    }

    public final r45.ed e(java.lang.String str, java.util.List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        r45.ed edVar = (r45.ed) list.get(0);
        r45.k55 k55Var = new r45.k55();
        k55Var.f378385d = str;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            k55Var.f378386e.addAll(bm5.d1.e(((r45.ed) it.next()).f373283h.f372756d).f378386e);
        }
        ot0.q qVar = new ot0.q();
        mp3.a aVar = new mp3.a();
        aVar.f330450b = k55Var;
        qVar.f(aVar);
        qVar.f348666i = 62;
        qVar.f348654f = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.giz);
        qVar.f348674k = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f492409gj0);
        r45.du5 du5Var = new r45.du5();
        java.lang.String u17 = ot0.q.u(qVar, "", null);
        du5Var.c(u17 != null ? u17 : "");
        edVar.f373283h = du5Var;
        return edVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String f(r45.ed r3, java.lang.String r4) {
        /*
            r2 = this;
            r45.du5 r0 = r3.f373281f
            java.lang.String r0 = r0.f372756d
            r45.du5 r3 = r3.f373282g
            java.lang.String r3 = r3.f372756d
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L2d
            tn1.f r4 = tn1.f.f()
            tn1.d r4 = r4.e()
            int r1 = r4.f420812o
            if (r1 == 0) goto L27
            xg3.r0 r4 = r4.f420804g
            com.tencent.mm.storage.ka r4 = (com.tencent.mm.storage.ka) r4
            boolean r4 = r4.s0(r0)
            if (r4 == 0) goto L25
            goto L2d
        L25:
            r4 = 0
            goto L2e
        L27:
            c01.c r3 = new c01.c
            r3.<init>()
            throw r3
        L2d:
            r4 = 1
        L2e:
            if (r4 == 0) goto L31
            r0 = r3
        L31:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ln1.x.f(r45.ed, java.lang.String):java.lang.String");
    }

    public void g(boolean z17) {
        boolean z18;
        int i17;
        synchronized (this) {
            if (this.f319849c) {
                z18 = true;
            } else {
                this.f319849c = true;
                z18 = false;
            }
        }
        if (z18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupRecoverMerger", "Already start merge, return.");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupRecoverMerger", "startMerge");
        this.f319858l = 0L;
        z65.c.f470458d = true;
        com.tencent.mm.sdk.platformtools.t8.f192989a = true;
        this.f319856j.f();
        ((com.tencent.mm.booter.notification.x) c01.d9.f()).k(true);
        fq3.n nVar = (fq3.n) ((gq3.e) i95.n0.c(gq3.e.class));
        nVar.getClass();
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(nVar.C);
        boolean z19 = D;
        java.util.HashMap hashMap = this.f319850d;
        if (E) {
            java.util.Iterator it = hashMap.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.String str = (java.lang.String) it.next();
                java.lang.String str2 = kn1.k.m(str) + str;
                long k17 = com.tencent.mm.vfs.w6.k(str2);
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupRecoverMerger", "itemPath = " + str2 + ", fileSize = " + k17);
                if (k17 > 10485760) {
                    C = 1;
                    break;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupRecoverMerger", "chooseRecoverMode, INSERT_THREAD_POOL_SIZE = " + C + ", duration" + (java.lang.System.currentTimeMillis() - 0) + ", sOptimizeExpt = " + z19);
        } else if (F) {
            long j17 = 0;
            for (java.lang.String str3 : hashMap.keySet()) {
                java.lang.String str4 = kn1.k.m(str3) + str3;
                long k18 = com.tencent.mm.vfs.w6.k(str4);
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupRecoverMerger", "itemPath = " + str4 + ", fileSize = " + k18);
                j17 = java.lang.Math.max(k18, j17);
            }
            int i18 = C;
            if (j17 > 10485760) {
                int i19 = (int) ((157286400 / j17) / 2);
                i17 = i19 == 0 ? 1 : java.lang.Math.min(i19, i18);
            } else {
                i17 = i18;
            }
            C = i17;
            long currentTimeMillis = java.lang.System.currentTimeMillis() - 0;
            jx3.f.INSTANCE.d(21019, java.lang.Integer.valueOf(C), java.lang.Long.valueOf(j17), 261, "maxFileSize", "", java.lang.Long.valueOf(currentTimeMillis));
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupRecoverMerger", "chooseRecoverMode, maxFileSize = " + j17 + ", duration = " + currentTimeMillis + ", INSERT_THREAD_POOL_SIZE = " + C + ", sOptimizeExpt = " + z19);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupRecoverMerger", "startMerge optimize open");
        ((ku5.t0) ku5.t0.f312615d).h(new ln1.u(this, z17), "startMergeImplOptimize");
    }

    public final void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupRecoverMerger", "startMergeImplOptimizeDone");
        this.f319856j.e().f309620l = this.f319858l;
        this.f319856j.e().f309610b = java.lang.Math.min(this.f319851e.size(), this.f319852f);
        this.f319856j.e().f309611c = this.f319852f;
        this.f319856j.e().f309612d = (int) (this.f319854h <= this.f319853g ? (this.f319854h * 100) / this.f319853g : 100L);
        i(30);
        tn1.e.a(this.f319865s, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupRecoverMerger", "startMergeImpl buildConversation finish! transferMsgList[%d], totalMsgList[%d], transferSession[%d], totalSession[%d]", java.lang.Long.valueOf(this.f319854h), java.lang.Long.valueOf(this.f319853g), java.lang.Integer.valueOf(this.f319851e.size()), java.lang.Integer.valueOf(this.f319852f));
        if (this.f319860n != 2) {
            this.f319860n = 2;
            c();
            int i17 = this.f319857k;
            if (i17 == 1) {
                c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_BACKUP_PC_MERGERING_BOOLEAN, java.lang.Boolean.FALSE);
            } else if (i17 == 2) {
                c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_BACKUP_MOVE_MERGERING_BOOLEAN, java.lang.Boolean.FALSE);
            }
            this.f319861o.A("MMKV_BACKUP_TRY_TIME", 0);
            this.f319861o.G("MMKV_BACKUP_NEED_REPORT", false);
            this.f319861o.D("MMKV_BACKUP_ERROR_CACHE", "");
            kn1.e eVar = this.f319859m;
            if (eVar != null) {
                eVar.c();
            }
            kn1.g e17 = this.f319856j.e();
            int size = this.f319851e.size();
            int i18 = this.f319852f;
            if (size <= i18) {
                i18 = this.f319851e.size();
            }
            e17.a(27, i18, this.f319852f);
            i(27);
            kn1.k.i();
            if (!kn1.k.f309630a) {
                kn1.k.k(kn1.k.o());
                kn1.k.h();
            }
            this.f319860n = 0;
            synchronized (this) {
                this.f319849c = false;
            }
            ((com.tencent.mm.booter.notification.x) c01.d9.f()).k(false);
            this.f319856j.g();
        }
    }

    public void i(int i17) {
        kn1.e eVar = this.f319859m;
        if (eVar != null) {
            eVar.a(i17);
        }
    }
}
