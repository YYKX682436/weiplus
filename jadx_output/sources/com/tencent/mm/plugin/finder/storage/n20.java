package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class n20 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.n20 f127223d = new com.tencent.mm.plugin.finder.storage.n20();

    public n20() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1000, "最大at数改为3个", null, null, 12, null);
        aVar.b("FinderMaxMentionSbCount");
        aVar.a("MAX_AT_COUNT_CONFIG", kz5.b0.c(3), kz5.b0.c("最大at数改为3个"));
        return aVar;
    }
}
