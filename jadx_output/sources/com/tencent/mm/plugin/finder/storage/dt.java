package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class dt extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.dt f126670d = new com.tencent.mm.plugin.finder.storage.dt();

    public dt() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "分享完播下拉引导是否显示描述", null, null, 12, null);
        aVar.a("FINDER_SHARE_POPUP_PULL_TIPS_SHOW_DESC", kz5.c0.i(1, 0), kz5.c0.i("打开", "关闭"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_share_popup_pull_tips_show_desc, false, 2, null);
        return aVar;
    }
}
