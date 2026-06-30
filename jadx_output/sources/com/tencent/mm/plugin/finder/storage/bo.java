package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class bo extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.bo f126540d = new com.tencent.mm.plugin.finder.storage.bo();

    public bo() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "视频号私密赞和星标绑定", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_private_like_bind_star_switch_android, false, 2, null);
        aVar.a("FINDER_PRIVATE_LIKE_BIND_STAR", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
