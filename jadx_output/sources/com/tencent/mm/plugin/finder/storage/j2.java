package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class j2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.j2 f126975d = new com.tencent.mm.plugin.finder.storage.j2();

    public j2() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "feed播放一段时间后，出评论输入框", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_feed_show_comment_auto, false, 2, null);
        aVar.a("FEED_COMMENT_EDU", new java.util.ArrayList(kz5.c0.i(0, 1)), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
