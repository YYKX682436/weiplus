package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class o20 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.o20 f127282d = new com.tencent.mm.plugin.finder.storage.o20();

    public o20() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(3, "最大话题数改为3个", null, null, 12, null);
        aVar.b("FinderMaxTopicCount");
        aVar.a("MAX_TOPIC_CONFIG", kz5.b0.c(3), kz5.b0.c("最大话题数改为3个"));
        return aVar;
    }
}
