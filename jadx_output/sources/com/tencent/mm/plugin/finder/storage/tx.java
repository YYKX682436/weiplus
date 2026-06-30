package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class tx extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.tx f128103d = new com.tencent.mm.plugin.finder.storage.tx();

    public tx() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "视频号UI刷新帧率(动态)", null, null, 12, null);
        aVar.a("FINDER_UI_REFRESH_RATE_AUTO", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
