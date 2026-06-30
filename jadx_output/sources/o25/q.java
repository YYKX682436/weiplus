package o25;

/* loaded from: classes11.dex */
public final class q {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f342575b;

    /* renamed from: a, reason: collision with root package name */
    public static final o25.q f342574a = new o25.q();

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f342576c = jz5.h.b(o25.j.f342540d);

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f342577d = jz5.h.b(o25.n.f342563d);

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f342578e = jz5.h.b(o25.d.f342493d);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f342579f = jz5.h.b(o25.p.f342569d);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f342580g = jz5.h.b(o25.k.f342548d);

    public static final java.util.List a(o25.q qVar, o25.c cVar, int i17, yz5.l lVar) {
        qVar.getClass();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        int i18 = cVar.f342482b;
        boolean z17 = false;
        java.util.List list = cVar.f342481a;
        if (i18 == 1) {
            if (!(list == null || list.isEmpty())) {
                z17 = true;
            }
        }
        if (z17) {
            java.util.List V = kz5.n0.V(list);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) V).iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) next)) {
                    arrayList.add(next);
                }
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                linkedHashSet.add((java.lang.String) it6.next());
            }
        }
        java.lang.String str = cVar.f342485e;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            kotlin.jvm.internal.o.d(str);
            linkedHashSet.add(str);
        }
        java.lang.String str2 = cVar.f342483c;
        java.lang.String str3 = cVar.f342484d;
        if (i17 == 0) {
            if (lVar != null ? ((java.lang.Boolean) lVar.invoke(java.lang.Boolean.TRUE)).booleanValue() : true) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    kotlin.jvm.internal.o.d(str2);
                    linkedHashSet.add(str2);
                }
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                kotlin.jvm.internal.o.d(str3);
                linkedHashSet.add(str3);
            }
        } else {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                str2 = str3;
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                kotlin.jvm.internal.o.d(str2);
                linkedHashSet.add(str2);
            }
        }
        java.lang.String str4 = cVar.f342486f;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            kotlin.jvm.internal.o.d(str4);
            linkedHashSet.add(str4);
        }
        java.lang.String str5 = cVar.f342487g;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            kotlin.jvm.internal.o.d(str5);
            linkedHashSet.add(str5);
        }
        return kz5.n0.S0(linkedHashSet);
    }

    public static final void b(o25.q qVar) {
        if (com.tencent.mm.storage.c2.f193805c) {
            qVar.d().clear();
            com.tencent.mars.xlog.Log.i("MicroMsg.BizImagePreloadStrategy", "isInTimeLine clear");
            return;
        }
        java.lang.String str = (java.lang.String) qVar.d().pollFirst();
        com.tencent.mars.xlog.Log.i("MicroMsg.BizImagePreloadStrategy", "residue url count = " + qVar.d().size() + ", current download url = " + str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() / com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
        jz5.g gVar = f342577d;
        java.lang.Integer num = (java.lang.Integer) ((java.util.concurrent.ConcurrentHashMap) ((jz5.n) gVar).getValue()).get(java.lang.Long.valueOf(currentTimeMillis));
        if (num == null) {
            num = 0;
        }
        if (num.intValue() > qVar.e().getInt("biz_time_line_pic_limit_minute", 60)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizImagePreloadStrategy", "download too much in one minute, count:%d", num);
            return;
        }
        long j17 = qVar.e().getLong("biz_time_line_pic_download_gap", 200L);
        java.lang.String b17 = qk.c.b(str, 1, true);
        o11.f fVar = new o11.f();
        fVar.f342078b = true;
        fVar.A = new r35.n0(0);
        fVar.f342082f = tv.a.b(b17);
        o11.g a17 = fVar.a();
        ((java.util.concurrent.ConcurrentHashMap) ((jz5.n) gVar).getValue()).put(java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(num.intValue() + 1));
        com.tencent.mm.sdk.platformtools.u3.h(new o25.i(b17, a17, j17));
    }

    public final boolean c() {
        return e().getBoolean("biz_time_preload_at_biz_box_expose", false);
    }

    public final java.util.concurrent.ConcurrentLinkedDeque d() {
        return (java.util.concurrent.ConcurrentLinkedDeque) ((jz5.n) f342576c).getValue();
    }

    public final com.tencent.mm.sdk.platformtools.o4 e() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f342580g).getValue();
    }

    public final boolean f() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_biz_time_line_img_preload, 1) == 1;
    }

    public final boolean g() {
        if (com.tencent.mm.storage.c2.f193805c) {
            return false;
        }
        return e().getBoolean("biz_time_line_need_preload", false);
    }

    public final void h() {
        if (com.tencent.mm.storage.c2.f193805c) {
            return;
        }
        if (f342575b) {
            try {
                f342575b = false;
                com.tencent.mm.sdk.platformtools.b4 b4Var = (com.tencent.mm.sdk.platformtools.b4) ((jz5.n) f342579f).getValue();
                long j17 = e().getLong("biz_time_line_msg_sync_gap", 500L);
                b4Var.c(j17, j17);
                return;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BizImagePreloadStrategy", e17.getMessage());
            }
        }
        f342575b = false;
        ((ku5.t0) ku5.t0.f312615d).g(o25.m.f342556d);
    }

    public final void i() {
        if (f() && g()) {
            if (java.lang.System.currentTimeMillis() - e().getLong("biz_time_line_need_last_load_time", 0L) <= e().getInt("biz_time_line_need_preload_interval", com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizImagePreloadStrategy", "tryDownloadTopNImage delta <= interval");
                return;
            }
            try {
                jz5.g gVar = f342579f;
                if (!((com.tencent.mm.sdk.platformtools.b4) ((jz5.n) gVar).getValue()).e()) {
                    ((com.tencent.mm.sdk.platformtools.b4) ((jz5.n) gVar).getValue()).d();
                }
                f342575b = false;
                com.tencent.mm.sdk.platformtools.b4 b4Var = (com.tencent.mm.sdk.platformtools.b4) ((jz5.n) gVar).getValue();
                long j17 = e().getLong("biz_time_line_msg_sync_gap", 500L);
                b4Var.c(j17, j17);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BizImagePreloadStrategy", e17.getMessage());
            }
        }
    }
}
