package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class x30 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.x30 f128284d = new com.tencent.mm.plugin.finder.storage.x30();

    public x30() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "视频号播放器画质增强QualityScore阈值", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_channel_sharpen_quality_score_android, false, 2, null);
        aVar.a("QUALITYSCORE_RENDERER_SHARPEN", new java.util.ArrayList(kz5.c0.i(0, 50, 60, 70, 99)), kz5.c0.i("0", "50", "60", "70", "99"));
        return aVar;
    }
}
