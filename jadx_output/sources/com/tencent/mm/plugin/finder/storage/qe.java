package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class qe extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.qe f127427d = new com.tencent.mm.plugin.finder.storage.qe();

    public qe() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "视频号全局收藏开关", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_global_fav_switch, false, 2, null);
        aVar.a("FINDER_GLOBAL_FAV_SWITCH", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
