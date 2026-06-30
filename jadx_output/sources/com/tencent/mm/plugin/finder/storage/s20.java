package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class s20 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.s20 f127519d = new com.tencent.mm.plugin.finder.storage.s20();

    public s20() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1000, "Media字数限制15", null, null, 12, null);
        aVar.b("FinderMediaPublishTextLimit");
        aVar.a("MEDIA_TEXT_LIMIT_CONFIG", kz5.b0.c(15), kz5.b0.c("Media字数限制15"));
        return aVar;
    }
}
