package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ic0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ic0 f126942d = new com.tencent.mm.plugin.finder.storage.ic0();

    public ic0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(20, "发表短标题字数限制", null, null, 12, null);
        aVar.b("FinderMediaShortTextLimit");
        aVar.a("FINDER_POST_SHORT_TITLE_LIMIT", kz5.b0.c(10), kz5.b0.c("字数限制10"));
        return aVar;
    }
}
