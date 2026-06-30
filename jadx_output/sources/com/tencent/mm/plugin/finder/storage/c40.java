package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class c40 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.c40 f126562d = new com.tencent.mm.plugin.finder.storage.c40();

    public c40() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mb2.d dVar = new mb2.d(1.0f, "视频号播放器画质增强机型对应强度");
        lb2.j.d(dVar, e42.d0.clicfg_channel_sharpen_deviceratio, false, 2, null);
        dVar.a("RENDERER_SHARPEN_DEVICERATIO", new java.util.ArrayList(kz5.c0.i(java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.5f), java.lang.Float.valueOf(1.0f))), kz5.c0.i(androidx.camera.core.processing.util.GLUtils.VERSION_UNKNOWN, "0.5", "1.0"));
        return dVar;
    }
}
