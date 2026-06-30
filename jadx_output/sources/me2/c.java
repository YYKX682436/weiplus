package me2;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final me2.c f325921a = new me2.c();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f325922b = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f325923c = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f325924d = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f325925e = java.util.Collections.synchronizedMap(new java.util.HashMap());

    public final boolean a(long j17) {
        java.lang.Long l17 = (java.lang.Long) f325925e.get(java.lang.Long.valueOf(j17));
        if (l17 != null) {
            return java.lang.System.currentTimeMillis() - l17.longValue() < 60000;
        }
        return true;
    }

    public final void b(long j17, me2.a data) {
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mars.xlog.Log.i("FinderLiveFeedDataCnl", "saveFeedData feedId: " + j17);
        java.util.Map channelMap = f325922b;
        kotlin.jvm.internal.o.f(channelMap, "channelMap");
        channelMap.put(java.lang.Long.valueOf(j17), data);
        java.util.Map channelSaveTimeMap = f325925e;
        kotlin.jvm.internal.o.f(channelSaveTimeMap, "channelSaveTimeMap");
        channelSaveTimeMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
    }
}
