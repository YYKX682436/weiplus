package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class hc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.hc f126885d = new com.tencent.mm.plugin.finder.storage.hc();

    public hc() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "Feed可和点赞共存推荐理由默认走富文本", "FINDER_FEED_COEXIST_RECOMMEND_REASON_OPT", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_feed_coexist_recommend_reason_opt, false, 2, null);
        return aVar;
    }
}
