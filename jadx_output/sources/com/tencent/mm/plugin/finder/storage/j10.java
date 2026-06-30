package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class j10 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.j10 f126974d = new com.tencent.mm.plugin.finder.storage.j10();

    public j10() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "视频号聊天气泡分享样式调整开关", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_share_chatting_style, false, 2, null);
        aVar.a("FinderShareChattingStyle", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
