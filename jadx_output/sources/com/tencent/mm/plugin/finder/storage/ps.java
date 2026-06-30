package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ps extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ps f127389d = new com.tencent.mm.plugin.finder.storage.ps();

    public ps() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mb2.d dVar = new mb2.d(0.6f, "设置分享红点和推荐理由最大宽度/屏幕宽度百分比");
        dVar.a("FINDER_SHARE_BUBBLE_AND_RECOMMEND_TV_MAX_WIDTH", kz5.c0.i(java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.6f)), kz5.c0.i("不设置", "0.6"));
        lb2.j.d(dVar, e42.c0.clicfg_finder_share_bubble_and_recommend_max_width, false, 2, null);
        return dVar;
    }
}
