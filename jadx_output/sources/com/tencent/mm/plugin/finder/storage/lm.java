package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class lm extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.lm f127146d = new com.tencent.mm.plugin.finder.storage.lm();

    public lm() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mb2.d dVar = new mb2.d(1.0f, "视频播放旧样式透明度alpha");
        lb2.j.d(dVar, e42.c0.clicfg_finder_player_loading_alpha, false, 2, null);
        dVar.a("FINDER_PLAYER_LOADING_ALPHA", kz5.c0.i(java.lang.Float.valueOf(0.5f), java.lang.Float.valueOf(1.0f)), kz5.c0.i("0.5f", "1f"));
        return dVar;
    }
}
