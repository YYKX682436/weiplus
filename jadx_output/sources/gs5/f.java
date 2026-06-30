package gs5;

/* loaded from: classes13.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static kr5.g f275168a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Runnable f275169b = new gs5.d();

    public static void a(java.lang.String str, tr5.g0 g0Var) {
        kr5.c cVar;
        if (g0Var == null) {
            throw new java.lang.IllegalArgumentException("lookupResult".concat(" can not be null"));
        }
        tr5.q qVar = g0Var.f421493e;
        if (!(qVar instanceof fs5.c)) {
            or5.b.e("lookupResult.stat is not instanceof StatisticsMerge", new java.lang.Object[0]);
            return;
        }
        fs5.c cVar2 = (fs5.c) qVar;
        kr5.c c17 = kr5.c.c();
        java.lang.String b17 = c17.b();
        int i17 = cVar2.f266356h;
        java.lang.String str2 = gs5.b.f275164a;
        java.lang.String str3 = i17 != 1 ? i17 != 2 ? i17 != 3 ? null : "dual" : "aaaa" : "a";
        kr5.g gVar = f275168a;
        boolean z17 = gVar.f311555j;
        bs5.g gVar2 = cVar2.f266358m;
        if (gVar2.f24036s) {
            return;
        }
        int i18 = gVar2.f24029i;
        if (i18 == 0) {
            java.lang.Integer num = 0;
            c17.f311526a.set(num.intValue());
            or5.b.a(java.lang.Thread.currentThread().getName() + " set mErrorCount: " + num, new java.lang.Object[0]);
            if (z17) {
                lr5.f fVar = lr5.e.f320769b;
                java.lang.String str4 = cVar2.f266352d;
                kr5.g gVar3 = f275168a;
                java.lang.String str5 = gVar3.f311548c.f24056b;
                java.lang.String str6 = gVar3.f311547b;
                java.lang.String str7 = gVar3.f311554i;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                bs5.g gVar4 = cVar2.f266358m;
                ((lr5.c) fVar).execute(gs5.b.a(str4, str5, str6, str7, str, currentTimeMillis, b17, gVar4.f266349f, r7.f266349f, cVar2.f266354f, str3, f275168a.f311549d, gVar4.f24032o, gVar4.f24029i, gVar4.f24039v, gVar4.f24036s, 1, sr5.a.f(cVar2.f266357i.f266347d, ","), sr5.a.f(cVar2.f266358m.f266347d, ",")));
                return;
            }
            return;
        }
        if (i18 != 2 && (!"Https".equals(gVar.f311554i) || cVar2.f266358m.f24029i != 1)) {
            if (z17) {
                lr5.f fVar2 = lr5.e.f320769b;
                java.lang.String str8 = cVar2.f266352d;
                kr5.g gVar5 = f275168a;
                java.lang.String str9 = gVar5.f311548c.f24056b;
                java.lang.String str10 = gVar5.f311547b;
                java.lang.String str11 = gVar5.f311554i;
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                bs5.g gVar6 = cVar2.f266358m;
                ((lr5.c) fVar2).execute(gs5.b.a(str8, str9, str10, str11, str, currentTimeMillis2, b17, gVar6.f266349f, r15.f266349f, cVar2.f266354f, str3, f275168a.f311549d, gVar6.f24032o, gVar6.f24029i, gVar6.f24039v, gVar6.f24036s, 1, sr5.a.f(cVar2.f266357i.f266347d, ","), sr5.a.f(cVar2.f266358m.f266347d, ",")));
                return;
            }
            return;
        }
        if (z17) {
            if (c17.f311526a.get() + 1 >= 3) {
                lr5.f fVar3 = lr5.e.f320769b;
                java.lang.String str12 = cVar2.f266352d;
                kr5.g gVar7 = f275168a;
                java.lang.String str13 = gVar7.f311548c.f24056b;
                java.lang.String str14 = gVar7.f311547b;
                java.lang.String str15 = gVar7.f311554i;
                long currentTimeMillis3 = java.lang.System.currentTimeMillis();
                bs5.g gVar8 = cVar2.f266358m;
                long j17 = gVar8.f266349f;
                wr5.a aVar = cVar2.f266357i;
                long j18 = aVar.f266349f;
                java.lang.String str16 = cVar2.f266354f;
                long j19 = f275168a.f311549d;
                java.util.Map map = gVar8.f24032o;
                long j27 = gVar8.f24029i;
                int i19 = gVar8.f24039v;
                boolean z18 = gVar8.f24036s;
                java.lang.String f17 = sr5.a.f(aVar.f266347d, ",");
                java.lang.String f18 = sr5.a.f(cVar2.f266358m.f266347d, ",");
                cVar = c17;
                ((lr5.c) fVar3).execute(gs5.b.a(str12, str13, str14, str15, str, currentTimeMillis3, b17, j17, j18, str16, str3, j19, map, j27, i19, z18, 1, f17, f18));
                or5.b.a(java.lang.Thread.currentThread().getName() + " increment mErrorCount: " + java.lang.Integer.valueOf(cVar.f311526a.incrementAndGet()), new java.lang.Object[0]);
            }
        }
        cVar = c17;
        or5.b.a(java.lang.Thread.currentThread().getName() + " increment mErrorCount: " + java.lang.Integer.valueOf(cVar.f311526a.incrementAndGet()), new java.lang.Object[0]);
    }

    public static void b(kr5.g gVar) {
        if (gVar == null) {
            throw new java.lang.IllegalArgumentException("dnsConfig".concat(" can not be null"));
        }
        f275168a = gVar;
        java.util.Random random = new java.util.Random();
        char[] cArr = new char[12];
        for (int i17 = 0; i17 < 12; i17++) {
            cArr[i17] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(random.nextInt(62));
        }
        gs5.g.f275170a = new java.lang.String(cArr);
        ((lr5.c) lr5.e.f320769b).b(f275169b, 300000L);
        gs5.e eVar = new gs5.e();
        java.util.List list = nr5.c.f339342a;
        synchronized (nr5.c.class) {
            if (nr5.c.f339343b) {
                ((java.util.concurrent.CopyOnWriteArrayList) nr5.c.f339342a).add(eVar);
            }
        }
    }

    public static void c(java.lang.String str, java.util.Map map) {
        java.util.List list = rr5.a.f399234a;
        if (android.text.TextUtils.isEmpty(str) || map == null) {
            return;
        }
        boolean z17 = true;
        if (2 >= or5.b.f347703a) {
            for (java.util.Map.Entry entry : map.entrySet()) {
                or5.b.a("%s: %s", entry.getKey(), entry.getValue());
            }
        }
        java.util.List list2 = rr5.a.f399234a;
        if (list2.isEmpty() && rr5.a.f399235b.isEmpty()) {
            z17 = false;
        }
        if (z17) {
            or5.b.a("HTTPDNS_SDK_VER:4.11.0a, Try to report %s", str);
            java.util.Iterator it = list2.iterator();
            if (it.hasNext()) {
                android.support.v4.media.f.a(it.next());
                throw null;
            }
            java.util.Iterator it6 = rr5.a.f399235b.iterator();
            if (it6.hasNext()) {
                android.support.v4.media.f.a(it6.next());
                throw null;
            }
        }
    }
}
