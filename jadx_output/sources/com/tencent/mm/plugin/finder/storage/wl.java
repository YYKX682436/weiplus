package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class wl extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.wl f128261d = new com.tencent.mm.plugin.finder.storage.wl();

    public wl() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "视频号外评论区@微信号开关", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_outside_comment_at_friend_switch, false, 2, null);
        aVar.a("FINDER_COMMENT_MENTION_SWITCH", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
