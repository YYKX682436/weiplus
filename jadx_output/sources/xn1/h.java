package xn1;

/* loaded from: classes12.dex */
public final class h extends xn1.d implements ln1.m {

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f455462h;

    /* renamed from: m, reason: collision with root package name */
    public boolean f455464m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.LinkedList f455465n;

    /* renamed from: p, reason: collision with root package name */
    public long f455467p;

    /* renamed from: r, reason: collision with root package name */
    public int f455469r;

    /* renamed from: t, reason: collision with root package name */
    public java.util.LinkedList f455471t;

    /* renamed from: g, reason: collision with root package name */
    public ln1.h f455461g = new ln1.h();

    /* renamed from: i, reason: collision with root package name */
    public xn1.a f455463i = xn1.a.f455451d;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Object f455466o = new java.lang.Object();

    /* renamed from: q, reason: collision with root package name */
    public long f455468q = com.tencent.wcdb.core.Database.DictDefaultMatchValue;

    /* renamed from: s, reason: collision with root package name */
    public java.util.LinkedList f455470s = new java.util.LinkedList();

    @Override // ln1.m
    public void X0(java.util.LinkedList convInfo, kn1.i updateInfo, int i17) {
        kotlin.jvm.internal.o.g(convInfo, "convInfo");
        kotlin.jvm.internal.o.g(updateInfo, "updateInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.ConvChooseHelper", "onCalcuSizeProgress.");
        i(convInfo);
        java.util.LinkedList linkedList = this.f455465n;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                kn1.i iVar = (kn1.i) it.next();
                if (kotlin.jvm.internal.o.b(iVar.f309625d, updateInfo.f309625d)) {
                    iVar.f309628g = updateInfo.f309628g;
                    iVar.f309629h = updateInfo.f309629h;
                    break;
                }
            }
        }
        if (mn1.d.i().k().f329893a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ConvChooseHelper", "onCalcuChooseSizeFinish startRequestNotify");
            mn1.d.i().e().a(13, i17, convInfo.size());
            ((mn1.w) mn1.d.i().k().f329895c).a(13);
        }
        ln1.m mVar = this.f455455d;
        if (mVar != null) {
            mVar.X0(b(), updateInfo, i17);
        }
    }

    @Override // xn1.d
    public void a(int i17, int i18, long j17, long j18) {
        long j19;
        long j27;
        int i19;
        long j28 = j17;
        java.util.LinkedList allConvName = this.f455470s;
        kotlin.jvm.internal.o.g(allConvName, "allConvName");
        if (i18 == 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : allConvName) {
                if (h((kn1.i) obj)) {
                    arrayList.add(obj);
                }
            }
            this.f455465n = new java.util.LinkedList(arrayList);
            ln1.n nVar = this.f455456e;
            if (nVar != null) {
                nn1.k kVar = (nn1.k) nVar;
                kVar.f338667a.runOnUiThread(new nn1.j(kVar));
                return;
            }
            return;
        }
        this.f455467p = j28;
        this.f455468q = j18;
        this.f455469r = i17;
        this.f455465n = new java.util.LinkedList();
        java.util.Iterator it = allConvName.iterator();
        while (it.hasNext()) {
            kn1.i iVar = (kn1.i) it.next();
            xg3.m0 g17 = tn1.f.f().e().g();
            final java.lang.String str = iVar.f309625d;
            final com.tencent.mm.storage.g9 g9Var = (com.tencent.mm.storage.g9) g17;
            g9Var.getClass();
            if (j18 < j28) {
                j27 = j28;
                j19 = j18;
            } else {
                j19 = j28;
                j27 = j18;
            }
            final java.lang.String X8 = g9Var.X8(str);
            if (g9Var.Da(X8)) {
                final long j29 = j27;
                final long j37 = j19;
                i19 = ot0.c3.l().b("getCountAfterCreateTimeBeforeEndTime", new yz5.a() { // from class: com.tencent.mm.storage.g9$$l
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        return java.lang.Integer.valueOf(ot0.z2.f348822a.G(com.tencent.mm.storage.g9.this.f193989r, X8, str, j37, j29));
                    }
                }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$w
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        com.tencent.mm.storage.g9 g9Var2 = com.tencent.mm.storage.g9.this;
                        g9Var2.getClass();
                        android.database.Cursor f17 = g9Var2.f193989r.f("SELECT COUNT(*) FROM " + X8 + " WHERE" + g9Var2.Z8(str) + "AND createTime > " + j37 + " AND createTime < " + j29, null, 2);
                        int i27 = 0;
                        try {
                            try {
                                if (f17.moveToFirst()) {
                                    i27 = f17.getInt(0);
                                }
                            } catch (java.lang.Exception e17) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MsgInfoStorage", e17, "", new java.lang.Object[0]);
                            }
                            f17.close();
                            return java.lang.Integer.valueOf(i27);
                        } catch (java.lang.Throwable th6) {
                            f17.close();
                            throw th6;
                        }
                    }
                });
            } else {
                long j38 = j27;
                long j39 = j19;
                if (g9Var.Pb(X8)) {
                    i19 = ot0.z2.f348822a.G(g9Var.f193989r, X8, str, j39, j38);
                } else {
                    android.database.Cursor f17 = g9Var.f193989r.f("SELECT COUNT(*) FROM " + X8 + " WHERE" + g9Var.Z8(str) + "AND createTime > " + j39 + " AND createTime < " + j38, null, 2);
                    try {
                        try {
                        } catch (java.lang.Exception e17) {
                            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MsgInfoStorage", e17, "", new java.lang.Object[0]);
                        }
                        i19 = f17.moveToFirst() ? f17.getInt(0) : 0;
                    } finally {
                        f17.close();
                    }
                }
            }
            if (i19 > 0) {
                iVar.f309629h = i19;
                if (h(iVar)) {
                    java.util.LinkedList linkedList = this.f455465n;
                    kotlin.jvm.internal.o.d(linkedList);
                    linkedList.add(iVar);
                }
            }
            j28 = j17;
        }
        ln1.n nVar2 = this.f455456e;
        if (nVar2 != null) {
            nn1.k kVar2 = (nn1.k) nVar2;
            kVar2.f338667a.runOnUiThread(new nn1.j(kVar2));
        }
    }

    @Override // xn1.d
    public java.util.LinkedList b() {
        java.util.LinkedList linkedList = this.f455465n;
        return linkedList == null ? new java.util.LinkedList() : linkedList;
    }

    public void c(boolean z17) {
        this.f455464m = z17;
        tn1.f.f().c();
        s75.d.b(new xn1.e(this), "BakMoveChooseServer.calculateToChoose");
    }

    public final void d() {
        synchronized (this.f455466o) {
            this.f455461g.b();
            this.f455461g = new ln1.h();
        }
    }

    public final void e() {
        if (this.f455462h == null) {
            this.f455462h = new com.tencent.mm.sdk.platformtools.b4(new xn1.f(this), false);
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f455462h;
        kotlin.jvm.internal.o.d(b4Var);
        long j17 = 300000;
        b4Var.c(j17, j17);
    }

    @Override // ln1.m
    public void e1(java.util.LinkedList backupSessionInfo) {
        kotlin.jvm.internal.o.g(backupSessionInfo, "backupSessionInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.ConvChooseHelper", "onCalcuSizeFinish size:%d", java.lang.Integer.valueOf(backupSessionInfo.size()));
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f455462h;
        if (b4Var != null) {
            b4Var.d();
        }
        k();
        if (this.f455464m) {
            java.util.LinkedList g17 = g();
            kotlin.jvm.internal.o.d(g17);
            g17.clear();
            java.util.LinkedList linkedList = this.f455465n;
            kotlin.jvm.internal.o.d(linkedList);
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                kn1.i iVar = (kn1.i) it.next();
                java.util.LinkedList g18 = g();
                kotlin.jvm.internal.o.d(g18);
                g18.add(iVar);
            }
        }
        if (!mn1.d.i().k().f329893a) {
            ln1.m mVar = this.f455455d;
            if (mVar != null) {
                mVar.e1(backupSessionInfo);
                return;
            }
            return;
        }
        mn1.y k17 = mn1.d.i().k();
        k17.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupMoveServer", "startRequestNotify receive start request.");
        k17.f329893a = false;
        mn1.d.i().e().f309609a = 12;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        ((mn1.w) k17.f329895c).a(12);
        tn1.f.f().c();
    }

    public final long f() {
        long j17 = 0;
        if (g() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ConvChooseHelper", "getChooseSize conv 0");
            return 0L;
        }
        java.util.LinkedList g17 = g();
        kotlin.jvm.internal.o.d(g17);
        java.util.Iterator it = g17.iterator();
        while (it.hasNext()) {
            j17 += ((kn1.i) it.next()).f309628g;
        }
        return j17;
    }

    public final java.util.LinkedList g() {
        if (this.f455471t == null) {
            this.f455471t = new java.util.LinkedList();
        }
        return this.f455471t;
    }

    public final boolean h(kn1.i conv) {
        kotlin.jvm.internal.o.g(conv, "conv");
        java.lang.String str = conv.f309625d;
        if (!(str == null || r26.n0.N(str))) {
            java.lang.String convName = conv.f309625d;
            kotlin.jvm.internal.o.f(convName, "convName");
            if (!r26.n0.B(convName, ",", false)) {
                return true;
            }
        }
        return false;
    }

    public final void i(java.util.LinkedList value) {
        kotlin.jvm.internal.o.g(value, "value");
        java.util.LinkedList linkedList = new java.util.LinkedList(value);
        this.f455470s = linkedList;
        if (linkedList.size() > 0) {
            long j17 = ((kn1.i) linkedList.get(0)).f309626e;
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                long j18 = ((kn1.i) it.next()).f309626e;
                if (j17 > j18) {
                    j17 = j18;
                }
            }
        }
    }

    public void j(java.util.LinkedList linkedList) {
        if (linkedList == null || linkedList.size() == 0) {
            this.f455471t = new java.util.LinkedList();
            return;
        }
        java.util.LinkedList linkedList2 = new java.util.LinkedList(linkedList.subList((linkedList.size() * 3) / 4, linkedList.size()));
        this.f455471t = linkedList2;
        linkedList2.addAll(linkedList.subList(0, (linkedList.size() * 3) / 4));
    }

    public final void k() {
        android.content.SharedPreferences d17 = kn1.f.d();
        if (this.f455463i == xn1.a.f455451d) {
            a(this.f455469r, d17.getInt("BACKUP_MOVE_CHOOSE_SELECT_TIME_MODE", 0), d17.getLong("BACKUP_MOVE_CHOOSE_SELECT_START_TIME", 0L), d17.getLong("BACKUP_MOVE_CHOOSE_SELECT_END_TIME", 0L));
            return;
        }
        a(this.f455469r, d17.getInt("BACKUP_PC_CHOOSE_SELECT_TIME_MODE", 0), d17.getLong("BACKUP_PC_CHOOSE_SELECT_START_TIME", 0L), d17.getLong("BACKUP_PC_CHOOSE_SELECT_END_TIME", 0L));
    }

    @Override // ln1.l
    public void s2(java.util.LinkedList calAllConvNames) {
        kotlin.jvm.internal.o.g(calAllConvNames, "calAllConvNames");
        this.f455457f = true;
        i(calAllConvNames);
        k();
        com.tencent.mars.xlog.Log.i("MicroMsg.ConvChooseHelper", "onCalcuConvFinish, calAllConvNames size[%d], showConvNames size[%d]", java.lang.Integer.valueOf(this.f455470s.size()), java.lang.Integer.valueOf(b().size()));
        ln1.m mVar = this.f455455d;
        if (mVar != null) {
            kotlin.jvm.internal.o.d(mVar);
            mVar.s2(b());
        }
        s75.d.b(new xn1.g(this), "BackupMoveChooseServer.calculate");
    }
}
