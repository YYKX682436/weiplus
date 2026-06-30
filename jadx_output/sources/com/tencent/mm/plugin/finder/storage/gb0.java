package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class gb0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.gb0 f126827d = new com.tencent.mm.plugin.finder.storage.gb0();

    public gb0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "音乐跟拍支持落评论区开关", null, null, 12, null);
        aVar.c(e42.c0.clicfg_finder_can_post_music_comment, false);
        aVar.a("FINDER_CAN_POST_MUSIC_COMMENT", kz5.c0.i(1, 0), kz5.c0.i("打开", "关闭"));
        return aVar;
    }
}
