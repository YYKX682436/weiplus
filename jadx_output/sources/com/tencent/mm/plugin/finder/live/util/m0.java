package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class m0 {

    /* renamed from: b, reason: collision with root package name */
    public static km2.m f115608b = null;

    /* renamed from: c, reason: collision with root package name */
    public static long f115609c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static int f115610d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f115611e = false;

    /* renamed from: f, reason: collision with root package name */
    public static int f115612f = -1;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f115613g;

    /* renamed from: h, reason: collision with root package name */
    public static long f115614h;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.util.m0 f115607a = new com.tencent.mm.plugin.finder.live.util.m0();

    /* renamed from: i, reason: collision with root package name */
    public static com.tencent.mm.plugin.finder.live.util.o2 f115615i = new com.tencent.mm.plugin.finder.live.util.o2(0, null, 3, null);

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.ArrayList f115616j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.Set f115617k = new java.util.LinkedHashSet();

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.ArrayList f115618l = new java.util.ArrayList();

    public final void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("FinderLiveSlideStatusReport", "clear from=" + str);
        java.util.Set set = f115617k;
        synchronized (set) {
            set.clear();
        }
        java.util.ArrayList arrayList = f115616j;
        synchronized (arrayList) {
            arrayList.clear();
        }
        java.util.ArrayList arrayList2 = f115618l;
        synchronized (arrayList2) {
            arrayList2.clear();
        }
        f115615i = new com.tencent.mm.plugin.finder.live.util.o2(0L, null, 3, null);
        f115614h = 0L;
        f115609c = -1L;
        f115611e = false;
        f115612f = -1;
        f115608b = null;
        f115610d = 0;
        f115613g = false;
    }

    public final int b() {
        km2.t c17;
        boolean z17;
        km2.n nVar = dk2.ef.H;
        int d17 = nVar != null ? nVar.d() : 0;
        km2.n nVar2 = dk2.ef.H;
        if (nVar2 == null || (c17 = nVar2.c()) == null) {
            return 0;
        }
        km2.n nVar3 = dk2.ef.H;
        if (nVar3 != null) {
            km2.m mVar = c17.f309222d;
            if (mVar == null) {
                return 0;
            }
            z17 = nVar3.f309152d.contains(mVar);
        } else {
            z17 = false;
        }
        km2.n nVar4 = dk2.ef.H;
        int size = nVar4 != null ? nVar4.f309152d.size() : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getCurSelectedOffsetPos historyLiveSize=");
        sb6.append(size);
        sb6.append(" isHistoryLive=");
        sb6.append(z17);
        sb6.append(" curPos=");
        sb6.append(d17);
        sb6.append(" offsetPos=");
        int i17 = d17 - size;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("FinderLiveSlideStatusReport", sb6.toString());
        if (z17) {
            return -1;
        }
        return i17 >= 0 ? i17 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(int r17, co0.s r18) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.util.m0.c(int, co0.s):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0293  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.content.Context r25, r45.un5 r26, km2.m r27, tn0.w0 r28) {
        /*
            Method dump skipped, instructions count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.util.m0.d(android.content.Context, r45.un5, km2.m, tn0.w0):void");
    }
}
