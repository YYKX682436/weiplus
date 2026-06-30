package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class uk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.uk f128144d = new com.tencent.mm.plugin.finder.storage.uk();

    public uk() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mb2.d dVar = new mb2.d(1.5f, "新版点赞彩蛋展示方式-表情持续时长");
        lb2.j.d(dVar, e42.c0.clicfg_finder_new_interaction_easter_egg_show_duration, false, 2, null);
        dVar.a("FINDER_NEW_INTERACTION_EASTER_EGG_SHOW_DURATION", kz5.c0.i(java.lang.Float.valueOf(1.0f), java.lang.Float.valueOf(1.5f), java.lang.Float.valueOf(2.0f), java.lang.Float.valueOf(2.5f), java.lang.Float.valueOf(3.0f)), kz5.c0.i("1s", "1.5s", "2s", "2.5s", "3s"));
        return dVar;
    }
}
