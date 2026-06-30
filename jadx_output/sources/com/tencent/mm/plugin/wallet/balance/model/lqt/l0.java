package com.tencent.mm.plugin.wallet.balance.model.lqt;

/* loaded from: classes9.dex */
public class l0 {

    /* renamed from: q, reason: collision with root package name */
    public static final com.tencent.mm.plugin.wallet.balance.model.lqt.l0 f177669q = new com.tencent.mm.plugin.wallet.balance.model.lqt.l0();

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.String f177670r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.lang.String f177671s;

    /* renamed from: a, reason: collision with root package name */
    public r45.be4 f177672a;

    /* renamed from: b, reason: collision with root package name */
    public r45.be4 f177673b;

    /* renamed from: c, reason: collision with root package name */
    public long f177674c;

    /* renamed from: d, reason: collision with root package name */
    public long f177675d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f177676e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f177677f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f177679h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f177680i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f177681j;

    /* renamed from: k, reason: collision with root package name */
    public int f177682k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f177683l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f177684m;

    /* renamed from: n, reason: collision with root package name */
    public r45.bp0 f177685n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.LinkedList f177686o;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f177678g = new java.util.concurrent.locks.ReentrantLock();

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Vector f177687p = new java.util.Vector();

    static {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(lp0.b.D() + "wallet/lqt/");
        sb6.append("/save/");
        f177670r = sb6.toString();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append(lp0.b.D() + "wallet/lqt/");
        sb7.append("/fetch/");
        f177671s = sb7.toString();
    }

    public final void a(boolean z17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        r45.be4 be4Var = z17 ? this.f177672a : this.f177673b;
        long j17 = z17 ? this.f177674c : this.f177675d;
        if (be4Var != null || !z17) {
            if (currentTimeMillis - j17 > 3600000) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LqtBindQueryInfoCache", "checkCache, saveCache time exceed, try reload from disk");
                return;
            }
            return;
        }
        java.lang.String str = z17 ? f177670r : f177671s;
        java.lang.Iterable s17 = com.tencent.mm.vfs.w6.s(str, false);
        if (s17 == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LqtBindQueryInfoCache", "tryLoadCacheFromDisk: %s, save: %s", s17, java.lang.Boolean.valueOf(z17));
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        java.util.Iterator it = s17.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = ((com.tencent.mm.vfs.x1) it.next()).f213232b;
            java.lang.String str3 = str + str2;
            long V = com.tencent.mm.sdk.platformtools.t8.V(str2, 0L);
            com.tencent.mars.xlog.Log.i("MicroMsg.LqtBindQueryInfoCache", "file name: %s", java.lang.Long.valueOf(V));
            if (V <= 0) {
                com.tencent.mm.vfs.w6.h(str3);
            } else if (currentTimeMillis2 - V < 3600000) {
                byte[] N = com.tencent.mm.vfs.w6.N(str3, 0, -1);
                r45.be4 be4Var2 = new r45.be4();
                try {
                    be4Var2.parseFrom(N);
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LqtBindQueryInfoCache", e17, "parse bindquery from cache error: %s", e17.getMessage());
                    be4Var2 = null;
                }
                if (be4Var2 != null) {
                    java.util.concurrent.locks.ReentrantLock reentrantLock = this.f177678g;
                    reentrantLock.lock();
                    if (z17) {
                        this.f177672a = be4Var2;
                        this.f177676e = null;
                        this.f177674c = V;
                    } else {
                        this.f177673b = be4Var2;
                        this.f177677f = null;
                        this.f177675d = V;
                    }
                    reentrantLock.unlock();
                    com.tencent.mars.xlog.Log.i("MicroMsg.LqtBindQueryInfoCache", "succ get saveCache: %s %s", be4Var2, java.lang.Long.valueOf(V));
                    return;
                }
            } else {
                com.tencent.mm.vfs.w6.h(str3);
            }
        }
    }

    public com.tencent.mm.plugin.wallet_core.model.Bankcard b(boolean z17) {
        java.util.List<com.tencent.mm.plugin.wallet_core.model.Bankcard> d17;
        a(z17);
        r45.be4 be4Var = z17 ? this.f177672a : this.f177673b;
        if (be4Var == null || com.tencent.mm.sdk.platformtools.t8.K0(be4Var.f370696d) || (d17 = d(z17)) == null || d17.size() <= 0) {
            return null;
        }
        java.lang.String str = be4Var.f370696d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        for (com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard : d17) {
            if (bankcard != null && str.equals(bankcard.field_bindSerial)) {
                return bankcard;
            }
        }
        return null;
    }

    public java.util.List c(boolean z17) {
        a(z17);
        if ((z17 ? this.f177672a : this.f177673b) != null) {
            return d(z17);
        }
        return null;
    }

    public final java.util.List d(boolean z17) {
        com.tencent.mm.plugin.wallet_core.model.Bankcard b17;
        com.tencent.mm.plugin.wallet_core.model.Bankcard b18;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f177678g;
        r45.be4 be4Var = z17 ? this.f177672a : this.f177673b;
        try {
            reentrantLock.lock();
            if (be4Var == null) {
                if (z17) {
                    this.f177676e = null;
                } else {
                    this.f177677f = null;
                }
                return null;
            }
            if (z17) {
                java.util.List list = this.f177676e;
                if (list != null && list.size() > 0) {
                    return this.f177676e;
                }
            } else {
                java.util.List list2 = this.f177677f;
                if (list2 != null && list2.size() > 0) {
                    return this.f177677f;
                }
            }
            if (z17) {
                this.f177676e = new java.util.ArrayList();
                r45.gd gdVar = this.f177672a.f370699g;
                if (gdVar != null && (b18 = at4.r1.b(gdVar)) != null) {
                    this.f177676e.add(b18);
                }
                java.util.LinkedList linkedList = this.f177672a.f370697e;
                if (linkedList != null && linkedList.size() > 0) {
                    java.util.Iterator it = this.f177672a.f370697e.iterator();
                    while (it.hasNext()) {
                        com.tencent.mm.plugin.wallet_core.model.Bankcard b19 = at4.i.b((r45.qv) it.next());
                        if (b19 != null) {
                            this.f177676e.add(b19);
                        }
                    }
                }
                return this.f177676e;
            }
            this.f177677f = new java.util.ArrayList();
            r45.gd gdVar2 = this.f177673b.f370699g;
            if (gdVar2 != null && (b17 = at4.r1.b(gdVar2)) != null) {
                this.f177677f.add(b17);
            }
            java.util.LinkedList linkedList2 = this.f177673b.f370697e;
            if (linkedList2 != null && linkedList2.size() > 0) {
                java.util.Iterator it6 = this.f177673b.f370697e.iterator();
                while (it6.hasNext()) {
                    com.tencent.mm.plugin.wallet_core.model.Bankcard b27 = at4.i.b((r45.qv) it6.next());
                    if (b27 != null) {
                        this.f177677f.add(b27);
                    }
                }
            }
            return this.f177677f;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void e(r45.be4 be4Var, boolean z17, boolean z18, java.lang.String str) {
        if (z18) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.wallet.balance.model.lqt.h0(this, str));
            return;
        }
        if (be4Var != null) {
            java.util.concurrent.locks.ReentrantLock reentrantLock = this.f177678g;
            reentrantLock.lock();
            if (z17) {
                this.f177672a = be4Var;
                this.f177676e = null;
                this.f177674c = java.lang.System.currentTimeMillis();
            } else {
                this.f177673b = be4Var;
                this.f177677f = null;
                this.f177675d = java.lang.System.currentTimeMillis();
            }
            reentrantLock.unlock();
            com.tencent.mars.xlog.Log.i("MicroMsg.LqtBindQueryInfoCache", "setCache: %s, save: %s", be4Var, java.lang.Boolean.valueOf(z17));
            try {
                s75.d.b(new com.tencent.mm.plugin.wallet.balance.model.lqt.j0(this, be4Var.toByteArray(), z17), "LqtBindQueryInfoCache_saveCacheToDiski");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LqtBindQueryInfoCache", e17, "saveCacheToDisk error: %s", e17.getMessage());
            }
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.wallet.balance.model.lqt.i0(this));
        }
    }

    public void f(r45.ny4 ny4Var, int i17) {
        this.f177679h = ny4Var.f381748g;
        this.f177680i = ny4Var.f381749h;
        this.f177681j = ny4Var.f381750i;
        this.f177682k = ny4Var.f381751m;
        this.f177683l = ny4Var.f381753o;
        this.f177685n = ny4Var.f381754p;
        this.f177686o = ny4Var.f381764z;
        r45.ny4 ny4Var2 = new r45.ny4();
        ny4Var2.BaseResponse = ny4Var.BaseResponse;
        ny4Var2.f381752n = ny4Var.f381752n;
        ny4Var2.f381756r = ny4Var.f381756r;
        ny4Var2.f381757s = ny4Var.f381757s;
        ny4Var2.f381758t = ny4Var.f381758t;
        ny4Var2.f381759u = ny4Var.f381759u;
        ny4Var2.f381760v = ny4Var.f381760v;
        ny4Var2.f381761w = ny4Var.f381761w;
        ny4Var2.f381762x = ny4Var.f381762x;
        ny4Var2.f381763y = ny4Var.f381763y;
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("WCPay.OnClickPurchaseRes");
        java.lang.String str = "";
        java.lang.String str2 = ((java.lang.String) gm0.j1.u().c().l(2, "")) + i17;
        try {
            byte[] byteArray = ny4Var2.toByteArray();
            java.lang.String encodeToString = byteArray.length > 0 ? android.util.Base64.encodeToString(byteArray, 0) : "";
            if (encodeToString != null && encodeToString.length() != 0) {
                str = encodeToString;
            }
            M.putString(str2, str);
        } catch (java.lang.Exception unused) {
        }
    }
}
