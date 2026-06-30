package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class oi extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.oi f127317d = new com.tencent.mm.plugin.finder.storage.oi();

    public oi() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pb2.a aVar = new pb2.a(30L, "看一看长视频卡片曝光上报比例", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_top_story_mega_video_card_exporse_rate, false, 2, null);
        aVar.a("FINDER_MEGA_VIDEO__CARD_EXPOSED_REPORT_RATE", kz5.c0.i(30L, 40L, 50L), kz5.c0.i("30%", "40%", "50%"));
        return aVar;
    }
}
