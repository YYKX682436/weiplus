package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class hc0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.hc0 f126886d = new com.tencent.mm.plugin.finder.storage.hc0();

    public hc0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1000, "发表短标题字数限制-用户粉丝数", null, null, 12, null);
        aVar.b("FinderShowShortTextFansLimitCount");
        aVar.a("FINDER_POST_SHORT_TITLE_FANS_COUNT", kz5.b0.c(0), kz5.b0.c("用户粉丝数0"));
        return aVar;
    }
}
