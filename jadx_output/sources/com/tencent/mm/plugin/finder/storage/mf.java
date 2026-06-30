package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class mf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.mf f127193d = new com.tencent.mm.plugin.finder.storage.mf();

    public mf() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "播放器预加载view播放前强制刷新view", null, null, 12, null);
        aVar.a("FINDER_HOME_PRELOAD_VIDEO_VIEW_FORCE_REQUEST_LAYOUT", kz5.c0.i(0, 1), kz5.c0.i("否", "是"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_home_preload_video_view_force_request_layout, false, 2, null);
        return aVar;
    }
}
