package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class v30 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.v30 f128168d = new com.tencent.mm.plugin.finder.storage.v30();

    public v30() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(800, "纯文本字数限制15", null, null, 12, null);
        aVar.b("FinderPureTextPublishTextLimit");
        aVar.a("PURE_TEXT_LIMIT_CONFIG", kz5.b0.c(20), kz5.b0.c("纯文本字数限制15"));
        return aVar;
    }
}
