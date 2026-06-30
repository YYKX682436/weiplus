package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class hr extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.hr f126907d = new com.tencent.mm.plugin.finder.storage.hr();

    public hr() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mb2.d dVar = new mb2.d(0.25f, "视频号滑动帧率采样控制");
        lb2.j.d(dVar, e42.d0.clicfg_finder_scroll_fps_enable, false, 2, null);
        dVar.a("FinderScrollFps", kz5.c0.i(java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(1.0f)), kz5.c0.i("关闭", "打开"));
        return dVar;
    }
}
