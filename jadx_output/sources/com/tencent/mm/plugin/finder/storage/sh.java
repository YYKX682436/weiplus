package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class sh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.sh f127550d = new com.tencent.mm.plugin.finder.storage.sh();

    public sh() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "直播刷新触发时间(秒)debug 覆盖,0=用后台值", null, null, 12, null);
        aVar.a("FINDER_LIVE_REFRESH_TRIGGER_TIME_DEBUG", kz5.c0.i(0, 10, 20), kz5.c0.i("用后台值", "10秒", "20秒"));
        return aVar;
    }
}
