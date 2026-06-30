package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class hz extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.hz f126915d = new com.tencent.mm.plugin.finder.storage.hz();

    public hz() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "视频号hashtag跳搜索", null, null, 12, null);
        aVar.c(e42.c0.clicfg_finder_comment_hast_tag_jump_search, false);
        aVar.a("FinderCommentHashTagJumpSearch", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
