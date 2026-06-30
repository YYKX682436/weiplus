package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class g20 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.g20 f126803d = new com.tencent.mm.plugin.finder.storage.g20();

    public g20() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(99999, "视频号播放器画质增强LevelOrder阈值", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_channel_sharpen_level_order_android, false, 2, null);
        aVar.a("LEVELORDER_RENDERER_SHARPEN", new java.util.ArrayList(kz5.c0.i(0, 100, 200, 300, 99999)), kz5.c0.i("0", "100", "200", "300", "99999"));
        return aVar;
    }
}
