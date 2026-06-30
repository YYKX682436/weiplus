package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class p1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.p1 f127342d = new com.tencent.mm.plugin.finder.storage.p1();

    public p1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "关注/好友tab流刷完以后，底部是否插入流已空的提示", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_follow_and_friend_stream_ignore_empty_footer_tips, false, 2, null);
        aVar.a("EMPTY_FOOTER_TIPS_IGNORE", kz5.c0.i(0, 1), kz5.c0.i("否", "是"));
        return aVar;
    }
}
