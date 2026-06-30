package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class zn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.zn f128464d = new com.tencent.mm.plugin.finder.storage.zn();

    public zn() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(500, "点赞彩蛋emoji预加载延时(ms)", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_preload_interaction_easter_egg_emoji_delay, false, 2, null);
        aVar.a("FINDER_PRELOAD_INTERACTION_EASTER_EGG_EMOJI_DELAY", kz5.c0.i(300, 500, 1000), kz5.c0.i("300ms", "500ms", "1000ms"));
        return aVar;
    }
}
