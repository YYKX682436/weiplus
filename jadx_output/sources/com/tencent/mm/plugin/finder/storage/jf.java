package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class jf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.jf f127007d = new com.tencent.mm.plugin.finder.storage.jf();

    public jf() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "(新)发现页预加载feed后提前初始化播放器", null, null, 12, null);
        aVar.a("FINDER_HOME_PRELOAD_VIDEO_VIEW_2", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_home_preload_video_view_2, false, 2, null);
        return aVar;
    }
}
