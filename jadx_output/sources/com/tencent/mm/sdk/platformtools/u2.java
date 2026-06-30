package com.tencent.mm.sdk.platformtools;

/* loaded from: classes15.dex */
public class u2 {

    /* renamed from: f, reason: collision with root package name */
    public static int f193004f;

    /* renamed from: h, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.t2 f193006h;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f193008j;

    /* renamed from: a, reason: collision with root package name */
    public final int f193009a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f193010b;

    /* renamed from: c, reason: collision with root package name */
    public long f193011c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f193012d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.s2 f193013e;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f193005g = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public static boolean f193007i = false;

    public u2(com.tencent.mm.sdk.platformtools.s2 s2Var, boolean z17) {
        iz5.a.g("bumper not initialized", f193007i);
        this.f193013e = s2Var;
        this.f193010b = z17;
        if (f193004f >= 8192) {
            f193004f = 0;
        }
        int i17 = f193004f + 1;
        f193004f = i17;
        this.f193009a = i17;
    }

    public static long a() {
        com.tencent.mm.sdk.platformtools.t2 t2Var;
        boolean z17;
        f193008j = false;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Map map = f193005g;
        hashSet.addAll(((java.util.HashMap) map).keySet());
        java.util.Iterator it = hashSet.iterator();
        long j17 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it.next();
            com.tencent.mm.sdk.platformtools.u2 u2Var = (com.tencent.mm.sdk.platformtools.u2) ((java.util.HashMap) map).get(num);
            if (u2Var != null) {
                long j18 = u2Var.f193011c;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j18;
                if (elapsedRealtime < 0) {
                    elapsedRealtime = 0;
                }
                long j19 = u2Var.f193012d;
                if (elapsedRealtime > j19) {
                    dh4.f0 f0Var = ((dh4.d0) u2Var.f193013e).f232508a;
                    if (f0Var.f232517i == 0 || com.tencent.mm.sdk.platformtools.t8.K0(f0Var.f232516h)) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.TalkRoomServer", "talkNoopTimer error: roomId %d, talkUsername %s", java.lang.Integer.valueOf(f0Var.f232517i), f0Var.f232516h);
                        f0Var.f232527v = null;
                        z17 = false;
                    } else {
                        java.lang.String str = f0Var.f232516h;
                        c01.d9.e().g(new eh4.e(str, f0Var.f232517i, f0Var.f232518m, f0Var.l(str)));
                        z17 = true;
                    }
                    if (z17 && u2Var.f193010b) {
                        j17 = u2Var.f193012d;
                    } else {
                        linkedList.add(num);
                    }
                    u2Var.f193011c = android.os.SystemClock.elapsedRealtime();
                } else if (j19 - elapsedRealtime < j17) {
                    j17 = j19 - elapsedRealtime;
                }
            }
        }
        for (int i17 = 0; i17 < linkedList.size(); i17++) {
            ((java.util.HashMap) map).remove(linkedList.get(i17));
        }
        if (!f193008j && j17 == com.tencent.wcdb.core.Database.DictDefaultMatchValue && (t2Var = f193006h) != null) {
            t2Var.cancel();
        }
        return j17;
    }

    public void finalize() {
        ((java.util.HashMap) f193005g).remove(java.lang.Integer.valueOf(this.f193009a));
        super.finalize();
    }
}
