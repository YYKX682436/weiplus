package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class sa extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.sa f127536d = new com.tencent.mm.plugin.finder.storage.sa();

    public sa() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(40, "视频号timeline双击爱心赞最小间隔(毫秒)", null, null, 12, null);
        aVar.c(e42.c0.clicfg_finder_double_like_min_time_android, false);
        aVar.a("FINDER_DOUBLE_TAP_LIKE_MIN_TIME", kz5.c0.i(0, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200), kz5.c0.i("0", "50", "60", "70", "80", "90", "100", "110", "120", "130", "140", "150", "160", "170", "180", "190", "200"));
        return aVar;
    }
}
