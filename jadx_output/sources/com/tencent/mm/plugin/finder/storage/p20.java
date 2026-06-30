package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class p20 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.p20 f127345d = new com.tencent.mm.plugin.finder.storage.p20();

    public p20() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(15, "话题最大长度改为10", null, null, 12, null);
        aVar.b("FinderTopicTextLimit");
        aVar.a("MAX_TOPIC_LENGTH_CONFIG", kz5.b0.c(10), kz5.b0.c("话题最大长度改为10"));
        return aVar;
    }
}
