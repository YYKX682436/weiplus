package kc2;

/* loaded from: classes15.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final kc2.g1 f306470a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f306471b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f306472c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f306473d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f306474e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f306475f;

    /* renamed from: g, reason: collision with root package name */
    public int f306476g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f306477h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f306478i;

    public q(kc2.g1 karaInfoManager, com.tencent.mm.sdk.platformtools.n3 handler) {
        kotlin.jvm.internal.o.g(karaInfoManager, "karaInfoManager");
        kotlin.jvm.internal.o.g(handler, "handler");
        this.f306470a = karaInfoManager;
        this.f306471b = handler;
        this.f306472c = "FinderKaraInfoManager.Business";
        this.f306473d = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f306474e = new java.util.concurrent.ConcurrentHashMap();
        this.f306475f = java.util.Collections.synchronizedList(new java.util.LinkedList());
        this.f306477h = java.util.Collections.synchronizedList(new java.util.LinkedList());
        this.f306478i = new java.util.concurrent.atomic.AtomicBoolean(false);
        handler.post(new kc2.n(this));
    }

    public final int a(java.lang.String tabKey) {
        int i17;
        kotlin.jvm.internal.o.g(tabKey, "tabKey");
        java.util.List businessSeq = this.f306475f;
        kotlin.jvm.internal.o.f(businessSeq, "businessSeq");
        synchronized (businessSeq) {
            java.util.List businessSeq2 = this.f306475f;
            kotlin.jvm.internal.o.f(businessSeq2, "businessSeq");
            java.util.Iterator it = businessSeq2.iterator();
            i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (kotlin.jvm.internal.o.b((java.lang.String) it.next(), tabKey)) {
                    break;
                }
                i17++;
            }
        }
        return i17;
    }

    public final int b(java.util.List tabKeyList) {
        int i17;
        kotlin.jvm.internal.o.g(tabKeyList, "tabKeyList");
        java.util.Iterator it = tabKeyList.iterator();
        do {
            i17 = -1;
            if (!it.hasNext()) {
                return -1;
            }
            java.lang.String str = (java.lang.String) it.next();
            java.util.List businessSeq = this.f306475f;
            kotlin.jvm.internal.o.f(businessSeq, "businessSeq");
            synchronized (businessSeq) {
                java.util.List businessSeq2 = this.f306475f;
                kotlin.jvm.internal.o.f(businessSeq2, "businessSeq");
                java.util.Iterator it6 = businessSeq2.iterator();
                int i18 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    if (kotlin.jvm.internal.o.b((java.lang.String) it6.next(), str)) {
                        i17 = i18;
                        break;
                    }
                    i18++;
                }
            }
        } while (i17 < 0);
        return i17;
    }

    public final void c() {
        int i17 = 0;
        if (this.f306473d.compareAndSet(false, true)) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f306474e;
            java.util.List businessSeq = this.f306475f;
            kotlin.jvm.internal.o.f(businessSeq, "businessSeq");
            java.util.List labelBusiness = this.f306477h;
            kotlin.jvm.internal.o.f(labelBusiness, "labelBusiness");
            e(concurrentHashMap, businessSeq, labelBusiness);
            if (!concurrentHashMap.isEmpty()) {
                java.util.Iterator it = concurrentHashMap.entrySet().iterator();
                int i18 = 0;
                while (it.hasNext()) {
                    int intValue = ((java.lang.Number) ((java.util.Map.Entry) it.next()).getValue()).intValue();
                    kc2.l[] lVarArr = kc2.l.f306452d;
                    if (intValue == 1) {
                        i18++;
                    }
                }
                i17 = i18;
            }
            this.f306476g = i17;
            com.tencent.mars.xlog.Log.i(this.f306472c, "init businessCnt=" + this.f306476g + ",businessSeq=" + businessSeq);
        }
    }

    public final int d(boolean z17) {
        if (z17) {
            kc2.l[] lVarArr = kc2.l.f306452d;
            return 1;
        }
        kc2.l[] lVarArr2 = kc2.l.f306452d;
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.util.concurrent.ConcurrentHashMap r12, java.util.List r13, java.util.List r14) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kc2.q.e(java.util.concurrent.ConcurrentHashMap, java.util.List, java.util.List):void");
    }
}
