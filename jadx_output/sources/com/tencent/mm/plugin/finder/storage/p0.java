package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.p0 f127340d = new com.tencent.mm.plugin.finder.storage.p0();

    public p0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(200, "评论字数限制", null, null, 12, null);
        aVar.b("FinderCommentTextLimit");
        aVar.a("COMMENT_TEXT_LIMIT_CONFIG", kz5.b0.c(10), kz5.b0.c("评论字数限制10"));
        return aVar;
    }
}
