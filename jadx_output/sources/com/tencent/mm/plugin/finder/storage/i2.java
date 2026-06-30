package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class i2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.i2 f126922d = new com.tencent.mm.plugin.finder.storage.i2();

    public i2() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "强制所有feed都为新闻类", null, null, 12, null);
        aVar.a("FEED_ALL_FORCE_NEWS", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
