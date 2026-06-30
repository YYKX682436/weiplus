package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class x5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.x5 f128287d = new com.tencent.mm.plugin.finder.storage.x5();

    public x5() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "长视频弹幕全局开关", null, null, 12, null);
        aVar.a("FINDER_BULLET_SWITCH", kz5.c0.i(1, 0), kz5.c0.i("开", "关"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_bullet_switch, false, 2, null);
        return aVar;
    }
}
