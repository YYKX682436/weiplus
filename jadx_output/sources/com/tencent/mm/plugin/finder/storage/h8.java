package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class h8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.h8 f126877d = new com.tencent.mm.plugin.finder.storage.h8();

    public h8() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "评论表情点击", "FINDER_COMMENT_EMOTICON_CLICK", null);
        lb2.j.d(aVar, e42.c0.clicfg_enable_finder_comment_emoji_click, false, 2, null);
        return aVar;
    }
}
