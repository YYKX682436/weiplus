package lm2;

/* loaded from: classes3.dex */
public final class h0 {

    /* renamed from: i, reason: collision with root package name */
    public static final lm2.p f319392i = new lm2.p(null);

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.List f319393j = kz5.c0.i(20057, 20034, 20035, 20002);

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f319394a;

    /* renamed from: b, reason: collision with root package name */
    public final lm2.g f319395b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.j0 f319396c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f319397d;

    /* renamed from: e, reason: collision with root package name */
    public androidx.lifecycle.j0 f319398e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f319399f;

    /* renamed from: g, reason: collision with root package name */
    public km2.m0 f319400g;

    /* renamed from: h, reason: collision with root package name */
    public km2.m0 f319401h;

    public h0(gk2.e liveBuContext, lm2.g bulletStore) {
        kotlin.jvm.internal.o.g(liveBuContext, "liveBuContext");
        kotlin.jvm.internal.o.g(bulletStore, "bulletStore");
        this.f319394a = liveBuContext;
        this.f319395b = bulletStore;
        this.f319396c = new androidx.lifecycle.j0(new java.util.concurrent.ConcurrentHashMap());
        this.f319397d = new java.util.concurrent.ConcurrentHashMap();
        this.f319398e = new androidx.lifecycle.j0(new java.util.concurrent.ConcurrentHashMap());
        this.f319399f = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(lm2.h0 r32, java.lang.String r33, java.util.List r34, r45.qn r35, lm2.j0 r36, lm2.o r37) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lm2.h0.a(lm2.h0, java.lang.String, java.util.List, r45.qn, lm2.j0, lm2.o):void");
    }

    public final void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("Finder.BoxDataStore", "boxDebugLog, " + str);
    }

    public final lm2.j0 c() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f319396c.getValue();
        if (concurrentHashMap == null) {
            return null;
        }
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            return (lm2.j0) ((java.util.Map.Entry) it.next()).getValue();
        }
        return null;
    }

    public final lm2.j0 d(java.lang.String boxId) {
        kotlin.jvm.internal.o.g(boxId, "boxId");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f319396c.getValue();
        if (concurrentHashMap != null) {
            return (lm2.j0) concurrentHashMap.get(boxId);
        }
        return null;
    }

    public final long e() {
        return ((mm2.e1) this.f319394a.a(mm2.e1.class)).f328988r.getLong(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r9, boolean r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lm2.h0.f(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g(java.lang.String r21, r45.qn r22, lm2.j0 r23, r45.ch1 r24, lm2.o r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lm2.h0.g(java.lang.String, r45.qn, lm2.j0, r45.ch1, lm2.o, boolean):boolean");
    }

    public final boolean h(r45.ch1 updateInfo) {
        lm2.j0 d17;
        kotlin.jvm.internal.o.g(updateInfo, "updateInfo");
        r45.qm1 qm1Var = (r45.qm1) updateInfo.getCustom(8);
        boolean z17 = true;
        java.lang.String string = qm1Var != null ? qm1Var.getString(1) : null;
        if (string != null && string.length() != 0) {
            z17 = false;
        }
        if (z17 || (d17 = d(string)) == null) {
            return false;
        }
        return g("selfLike", d17.f319411d, d17, updateInfo, (lm2.o) this.f319397d.get(string), true);
    }
}
