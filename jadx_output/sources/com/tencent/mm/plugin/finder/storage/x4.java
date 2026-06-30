package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class x4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.x4 f128285d = new com.tencent.mm.plugin.finder.storage.x4();

    public x4() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "横屏播放器预加载缓存有效期s", null, null, 12, null);
        aVar.a("FINDER_BIZ_PRELOAD_CACHE_VALID_INTERVAL", kz5.c0.i(0, 10, 30), kz5.c0.i("用后台", "10s", "30s"));
        return aVar;
    }
}
