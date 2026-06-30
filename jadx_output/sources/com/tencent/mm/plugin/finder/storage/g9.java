package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class g9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.g9 f126818d = new com.tencent.mm.plugin.finder.storage.g9();

    public g9() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "评论转发", "FINDER_COMMENT_NEW_CONVERT", null);
        lb2.j.d(aVar, e42.c0.clicfg_enable_finder_comment_share, false, 2, null);
        return aVar;
    }
}
