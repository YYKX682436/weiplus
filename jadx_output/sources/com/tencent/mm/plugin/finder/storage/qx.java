package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class qx extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.qx f127451d = new com.tencent.mm.plugin.finder.storage.qx();

    public qx() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "关心/关注流自动播放", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_two_flow_auto_play_video, false, 2, null);
        aVar.a("FINDER_TWO_FLOW_AUTO_PLAY_VIDEO", kz5.c0.i(0, 1, 2, 3), kz5.c0.i("都关闭", "只关心打开", "只关注打开", "都打开"));
        return aVar;
    }
}
