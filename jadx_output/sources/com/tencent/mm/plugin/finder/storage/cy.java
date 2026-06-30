package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class cy extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.cy f126608d = new com.tencent.mm.plugin.finder.storage.cy();

    public cy() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mb2.d dVar = new mb2.d(0.1f, "视频宽高resize宽高比阈值");
        lb2.j.d(dVar, e42.c0.clicfg_finder_video_resize_ratio_delta_threshold, false, 2, null);
        dVar.a("FINDER_VIDEO_RESIZE_RATIO_DELTA_THRESHOLD", kz5.c0.i(java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.05f), java.lang.Float.valueOf(0.1f), java.lang.Float.valueOf(0.2f)), kz5.c0.i("0f", "0.05f", "0.1f", "0.2f"));
        return dVar;
    }
}
