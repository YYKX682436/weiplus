package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class yd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.yd f128381d = new com.tencent.mm.plugin.finder.storage.yd();

    public yd() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(false, "启用 fps monitor", "FINDER_FPS_MONITOR_ENABLE", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_fps_monitor_enable, false, 2, null);
        return aVar;
    }
}
