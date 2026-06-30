package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class p6 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.r2 f192922a;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o6 f192924c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f192925d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f192926e;

    /* renamed from: f, reason: collision with root package name */
    public final long f192927f;

    /* renamed from: g, reason: collision with root package name */
    public final long f192928g;

    /* renamed from: h, reason: collision with root package name */
    public final long f192929h;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedHashMap f192923b = new java.util.LinkedHashMap();

    /* renamed from: i, reason: collision with root package name */
    public boolean f192930i = true;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f192931j = false;

    public p6(com.tencent.mm.sdk.platformtools.o6 o6Var, android.os.Looper looper, int i17, int i18, long j17, long j18) {
        if (o6Var == null) {
            throw new java.lang.IllegalArgumentException("arg appender can not be null!");
        }
        if (looper == null) {
            throw new java.lang.IllegalArgumentException("arg looper can not be null!");
        }
        if (i17 <= 0) {
            throw new java.lang.IllegalArgumentException("arg size can not be <= 0!");
        }
        this.f192924c = o6Var;
        this.f192922a = new com.tencent.mm.sdk.platformtools.r2(i17);
        this.f192927f = i18 > 0 ? i18 : 40L;
        this.f192928g = j17 <= 0 ? 60000L : j17;
        this.f192929h = j18 <= 0 ? 60000L : j18;
        this.f192925d = new com.tencent.mm.sdk.platformtools.b4(looper, (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.sdk.platformtools.k6(this), false);
        this.f192926e = new com.tencent.mm.sdk.platformtools.b4("RWCache_timeoutChecker", (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.sdk.platformtools.l6(this), false);
    }

    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RWCache", "summer appendAll force: " + z17 + " tid: " + java.lang.Thread.currentThread().getId() + " holderMap size: " + this.f192923b.size());
        synchronized (this) {
            this.f192930i = true;
            if (this.f192923b.isEmpty()) {
                return;
            }
            if (this.f192924c.B()) {
                java.util.Iterator it = this.f192923b.entrySet().iterator();
                if (z17) {
                    while (it.hasNext()) {
                        this.f192924c.d0(this, (com.tencent.mm.sdk.platformtools.n6) ((java.util.Map.Entry) it.next()).getValue());
                        it.remove();
                    }
                } else {
                    this.f192931j = false;
                    com.tencent.mm.sdk.platformtools.b4 b4Var = this.f192926e;
                    long j17 = this.f192929h;
                    b4Var.c(j17, j17);
                    while (!this.f192931j && it.hasNext()) {
                        this.f192924c.d0(this, (com.tencent.mm.sdk.platformtools.n6) ((java.util.Map.Entry) it.next()).getValue());
                        it.remove();
                    }
                    if (this.f192931j) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.RWCache", "summer appendAll timeout size[%d] hasNext[%b] end", java.lang.Integer.valueOf(this.f192923b.size()), java.lang.Boolean.valueOf(it.hasNext()));
                    }
                    this.f192926e.d();
                }
                this.f192924c.u();
            }
        }
    }

    public java.lang.Object b(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.NullPointerException("key == null");
        }
        com.tencent.mm.sdk.platformtools.r2 r2Var = this.f192922a;
        com.tencent.mm.sdk.platformtools.m6 m6Var = (com.tencent.mm.sdk.platformtools.m6) r2Var.get(obj);
        if (m6Var != null) {
            return m6Var.f192855a;
        }
        r2Var.put(obj, new com.tencent.mm.sdk.platformtools.m6(null));
        return null;
    }

    public boolean c(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            throw new java.lang.NullPointerException("key == null");
        }
        com.tencent.mm.sdk.platformtools.m6 m6Var = (com.tencent.mm.sdk.platformtools.m6) this.f192922a.get(obj);
        com.tencent.mm.sdk.platformtools.m6 m6Var2 = new com.tencent.mm.sdk.platformtools.m6(obj2);
        if (m6Var2.equals(m6Var)) {
            return false;
        }
        this.f192922a.put(obj, m6Var2);
        com.tencent.mm.sdk.platformtools.n6 n6Var = new com.tencent.mm.sdk.platformtools.n6();
        n6Var.f192873b = obj;
        n6Var.f192874c = obj2;
        n6Var.f192872a = obj2 == null ? 2 : 1;
        synchronized (this) {
            this.f192923b.put(obj, n6Var);
            if (this.f192930i && this.f192923b.size() > this.f192927f) {
                this.f192925d.c(0L, 0L);
                this.f192930i = false;
            } else if (this.f192925d.e()) {
                com.tencent.mm.sdk.platformtools.b4 b4Var = this.f192925d;
                long j17 = this.f192928g;
                b4Var.c(j17, j17);
            }
        }
        return true;
    }
}
