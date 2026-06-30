package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class f9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.f9 f126755d = new com.tencent.mm.plugin.finder.storage.f9();

    public f9() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "评论列表回包feedId检查", "FINDER_COMMENT_RESP_FEEDID_CHECK", null);
        lb2.j.d(aVar, e42.c0.clicfg_enable_finder_comment_resp_feed_check, false, 2, null);
        return aVar;
    }
}
