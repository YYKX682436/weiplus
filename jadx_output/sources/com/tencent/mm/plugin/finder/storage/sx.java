package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class sx extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.sx f127570d = new com.tencent.mm.plugin.finder.storage.sx();

    public sx() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "视频号UI刷新帧率", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_ui_render_fps, false, 2, null);
        aVar.a("FINDER_RENDER_VIEW_TYPE", kz5.c0.i(0, 65, 95, 125), kz5.c0.i("默认", "60fps", "90fps", "120fps"));
        return aVar;
    }
}
