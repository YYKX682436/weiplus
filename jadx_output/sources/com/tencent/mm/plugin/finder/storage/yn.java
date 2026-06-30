package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class yn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.yn f128403d = new com.tencent.mm.plugin.finder.storage.yn();

    public yn() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "预加载前台轮询", null, null, 12, null);
        aVar.a("FINDER_PRELOAD_FRONT_SWITCH", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开(30秒)"));
        return aVar;
    }
}
