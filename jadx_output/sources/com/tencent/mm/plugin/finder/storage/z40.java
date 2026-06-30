package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class z40 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.z40 f128426d = new com.tencent.mm.plugin.finder.storage.z40();

    public z40() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(5, "Feed关注动画启动阈值s", null, null, 12, null);
        aVar.a("SHOW_FOLLOW_ANIM_OFFSET", kz5.c0.i(5, 10, 30), kz5.c0.i("5s", "10s", "30s"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_feed_show_follow_anim_offset, false, 2, null);
        return aVar;
    }
}
