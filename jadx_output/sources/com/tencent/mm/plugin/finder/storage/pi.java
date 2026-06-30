package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class pi extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.pi f127375d = new com.tencent.mm.plugin.finder.storage.pi();

    public pi() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "看一看长视频卡片是否展示时长", null, null, 12, null);
        aVar.a("FINDER_MEGA_VIDEO_CARD_SHOW_DURATION", kz5.c0.i(0, 1), kz5.c0.i("否", "是"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_longvideo_recommend_card_show_duration_android, false, 2, null);
        return aVar;
    }
}
