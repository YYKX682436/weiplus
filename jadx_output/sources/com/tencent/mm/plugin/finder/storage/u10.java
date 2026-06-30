package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class u10 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.u10 f128110d = new com.tencent.mm.plugin.finder.storage.u10();

    public u10() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(60, "视频号播放器画质增强GPU阈值", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_channel_sharpen_gpu_score_android, false, 2, null);
        aVar.a("GPUSCORE_RENDERER_SHARPEN", new java.util.ArrayList(kz5.c0.i(60, 1000)), kz5.c0.i("60", "1000"));
        return aVar;
    }
}
