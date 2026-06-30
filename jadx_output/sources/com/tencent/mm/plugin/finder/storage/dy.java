package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class dy extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.dy f126675d = new com.tencent.mm.plugin.finder.storage.dy();

    public dy() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(false, "视频宽高改变后做数据上报开关", "FINDER_VIDEO_RESIZE_REPORT_SWITCH", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_video_resize_report_switch, false, 2, null);
        return aVar;
    }
}
