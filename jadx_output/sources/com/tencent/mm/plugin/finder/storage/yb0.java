package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class yb0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.yb0 f128378d = new com.tencent.mm.plugin.finder.storage.yb0();

    public yb0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "发表设置热点新闻本地开关", null, null, 12, null);
        aVar.a("FINDER_POST_HOT_NEWS_ENABLE", new java.util.ArrayList(kz5.c0.i(0, 1)), kz5.c0.i("关", "开"));
        return aVar;
    }
}
