package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class e8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.e8 f126696d = new com.tencent.mm.plugin.finder.storage.e8();

    public e8() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "评论草稿", "FINDER_COMMENT_EDIT_CACHE", null);
        lb2.j.d(aVar, e42.c0.clicfg_enable_finder_comment_draft, false, 2, null);
        return aVar;
    }
}
