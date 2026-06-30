package com.tencent.mm.sdk.platformtools;

/* loaded from: classes11.dex */
public final class d6 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.d6 f192524a = new com.tencent.mm.sdk.platformtools.d6();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f192525b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static long f192526c = 200;

    /* renamed from: d, reason: collision with root package name */
    public static long f192527d = 1000;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f192528e = true;

    public static final boolean a(com.tencent.mm.sdk.platformtools.d6 d6Var, int i17) {
        boolean z17;
        synchronized (d6Var) {
            if (f192528e) {
                java.util.HashMap hashMap = f192525b;
                if (hashMap.containsKey(java.lang.Integer.valueOf(i17))) {
                    java.lang.Long l17 = (java.lang.Long) hashMap.get(java.lang.Integer.valueOf(i17));
                    if (l17 == null) {
                        l17 = -1L;
                    }
                    long longValue = l17.longValue();
                    if (longValue > 0) {
                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        z17 = android.os.SystemClock.elapsedRealtime() - longValue <= f192526c;
                    }
                }
            }
        }
        return z17;
    }

    public static final void b(com.tencent.mm.sdk.platformtools.d6 d6Var, int i17) {
        synchronized (d6Var) {
            if (f192528e) {
                com.tencent.mars.xlog.Log.i("MicroMsg.PlaySoundNew", "updateAssetPlayTime:" + i17);
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
                java.util.HashMap hashMap = f192525b;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                hashMap.put(valueOf, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
                d6Var.c();
            }
        }
    }

    public static final void d(android.content.Context context, int i17, com.tencent.mm.sdk.platformtools.x5 speakeron, boolean z17, com.tencent.mm.sdk.platformtools.w5 w5Var) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(speakeron, "speakeron");
        e(context, i17, speakeron, -1, z17, w5Var);
    }

    public static final void e(android.content.Context context, int i17, com.tencent.mm.sdk.platformtools.x5 speakeron, int i18, boolean z17, com.tencent.mm.sdk.platformtools.w5 w5Var) {
        kotlin.jvm.internal.o.g(speakeron, "speakeron");
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.PlaySoundNew", "play Err context:%s pathId:%d speekeron:%s looping:%b listener:%s", context, java.lang.Integer.valueOf(i17), speakeron, java.lang.Boolean.valueOf(z17), w5Var);
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.sdk.platformtools.c6(context, i17, speakeron, i18, z17, w5Var));
    }

    public final void c() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.util.HashMap hashMap = f192525b;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            if (elapsedRealtime - ((java.lang.Number) entry.getValue()).longValue() >= f192527d) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.Set keySet = linkedHashMap.keySet();
        if (!keySet.isEmpty()) {
            java.util.Iterator it6 = keySet.iterator();
            while (it6.hasNext()) {
                int intValue = ((java.lang.Number) it6.next()).intValue();
                com.tencent.mars.xlog.Log.i("MicroMsg.PlaySoundNew", "evictOutDateRateControlInfo:" + intValue);
                hashMap.remove(java.lang.Integer.valueOf(intValue));
            }
        }
    }
}
