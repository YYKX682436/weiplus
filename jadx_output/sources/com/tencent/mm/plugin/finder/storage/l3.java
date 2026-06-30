package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class l3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.l3 f127105d = new com.tencent.mm.plugin.finder.storage.l3();

    public l3() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "上移动画-竖视频是否上移", null, null, 12, null);
        aVar.a("FINDER_ANIMATE_PORTRAIT_VIDEO_ENABLE", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_animate_portrait_video_enable, false, 2, null);
        return aVar;
    }
}
