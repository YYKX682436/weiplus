package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class fz extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.fz f126796d = new com.tencent.mm.plugin.finder.storage.fz();

    public fz() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "可长按评论反馈「不喜欢」", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_comment_dislike, false, 2, null);
        aVar.a("FinderCommentDislike", kz5.c0.i(1, 0), kz5.c0.i("打开", "关闭"));
        return aVar;
    }
}
