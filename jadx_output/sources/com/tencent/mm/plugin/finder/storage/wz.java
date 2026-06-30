package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class wz extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.wz f128275d = new com.tencent.mm.plugin.finder.storage.wz();

    public wz() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "热评显示作者有回复后缀", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_hot_comment_show_author_reply_suffix, false, 2, null);
        aVar.a("FinderHotCommentShowAuthorReply", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
