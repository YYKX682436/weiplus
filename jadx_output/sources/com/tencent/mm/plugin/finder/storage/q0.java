package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.q0 f127399d = new com.tencent.mm.plugin.finder.storage.q0();

    public q0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(10, "评论行数限制", null, null, 12, null);
        aVar.b("FinderCommentLineWrapLimit");
        aVar.a("COMMENT_TEXT_LINE_LIMIT", kz5.b0.c(2), kz5.b0.c("评论行数限制2"));
        return aVar;
    }
}
