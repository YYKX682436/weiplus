package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class mg extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.mg f127195d = new com.tencent.mm.plugin.finder.storage.mg();

    public mg() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mb2.d dVar = new mb2.d(5.0f, "自定义点赞动效-浏览侧气泡显示时间");
        lb2.j.d(dVar, e42.c0.clicfg_finder_interaction_easter_egg_bubble_duration, false, 2, null);
        dVar.a("FINDER_INTERACTION_EASTER_EGG_BUBBLE_DURATION", kz5.c0.i(java.lang.Float.valueOf(3.0f), java.lang.Float.valueOf(4.0f), java.lang.Float.valueOf(4.5f), java.lang.Float.valueOf(5.0f), java.lang.Float.valueOf(5.5f), java.lang.Float.valueOf(6.0f), java.lang.Float.valueOf(6.5f)), kz5.c0.i("3s", "4s", "4.5s", "5s", "5.5s", "6s", "6.5s"));
        return dVar;
    }
}
