package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class f3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.f3 f126742d = new com.tencent.mm.plugin.finder.storage.f3();

    public f3() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mb2.d dVar = new mb2.d(0.1f, "点赞后禁止滑动间隔(秒)");
        dVar.c(e42.c0.clicfg_finder_after_like_forbid_scroll_time, false);
        dVar.a("FINDER_AFTER_LIKE_FORBID_SCROLL_TIME", kz5.c0.i(java.lang.Float.valueOf(10.0f), java.lang.Float.valueOf(5.0f), java.lang.Float.valueOf(0.1f)), kz5.c0.i("10秒(测试用)", "5秒(测试用)", "0.1秒(默认)"));
        return dVar;
    }
}
