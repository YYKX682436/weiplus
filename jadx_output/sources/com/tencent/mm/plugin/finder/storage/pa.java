package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class pa extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.pa f127359d = new com.tencent.mm.plugin.finder.storage.pa();

    public pa() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "视频号投屏功能开关", null, null, 12, null);
        aVar.a("FINDER_DLNA_PROJECTION_SCREEN_SWITCH", new java.util.ArrayList(kz5.c0.i(0, 1)), kz5.c0.i("关", "开"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_projection_screen, false, 2, null);
        return aVar;
    }
}
