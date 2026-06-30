package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class lg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.lg f127136d = new com.tencent.mm.plugin.finder.storage.lg();

    public lg() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mb2.d dVar = new mb2.d(1.0f, "自定义点赞动效-浏览侧气泡延时");
        lb2.j.d(dVar, e42.c0.clicfg_finder_interaction_easter_egg_bubble_delay, false, 2, null);
        dVar.a("FINDER_INTERACTION_EASTER_EGG_BUBBLE_DELAY", kz5.c0.i(java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(1.0f), java.lang.Float.valueOf(1.2f), java.lang.Float.valueOf(1.5f), java.lang.Float.valueOf(2.0f), java.lang.Float.valueOf(2.5f), java.lang.Float.valueOf(3.0f)), kz5.c0.i("0s", "1s", "1.2s", "1.5s", "2s", "2.5s", "3s"));
        return dVar;
    }
}
