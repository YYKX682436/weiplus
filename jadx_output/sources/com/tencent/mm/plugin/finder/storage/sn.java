package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class sn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.sn f127560d = new com.tencent.mm.plugin.finder.storage.sn();

    public sn() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "发表影视综选择入口", null, null, 12, null);
        aVar.a("FINDER_POST_SELECT_VIDEO_NEW", kz5.c0.i(1, 0), kz5.c0.i("开", "关"));
        aVar.c(e42.c0.clicfg_finder_post_select_video_new, false);
        return aVar;
    }
}
