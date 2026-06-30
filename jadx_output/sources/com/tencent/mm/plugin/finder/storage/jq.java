package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class jq extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.jq f127025d = new com.tencent.mm.plugin.finder.storage.jq();

    public jq() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(2, "视频渲染View类型", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_render_view_type, false, 2, null);
        aVar.a("FINDER_RENDER_VIEW_TYPE", kz5.c0.i(0, 1, 2), kz5.c0.i("TextureView", "SurfaceView", "自动"));
        return aVar;
    }
}
