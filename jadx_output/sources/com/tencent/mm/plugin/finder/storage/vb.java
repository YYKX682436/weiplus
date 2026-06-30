package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class vb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.vb f128185d = new com.tencent.mm.plugin.finder.storage.vb();

    public vb() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "进入视频号立刻显示朋友点赞气泡", null, null, 12, null);
        aVar.a("FINDER_ENTER_SHOW_FRIEND_TAB_LIKE_TIPS", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_enter_show_friend_tab_like_tips, false, 2, null);
        return aVar;
    }
}
