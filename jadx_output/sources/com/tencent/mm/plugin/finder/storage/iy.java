package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class iy extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.iy f126969d = new com.tencent.mm.plugin.finder.storage.iy();

    public iy() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "是否开启视频preparing", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_enable_tp_video_prepare, false, 2, null);
        aVar.a("FINDER_VIDEO_TP_PREPARE_ENABLE", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
