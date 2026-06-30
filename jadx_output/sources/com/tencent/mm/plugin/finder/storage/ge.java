package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ge extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ge f126832d = new com.tencent.mm.plugin.finder.storage.ge();

    public ge() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mb2.d dVar = new mb2.d(1.773f, "全屏视频撑满比例（高/宽）");
        lb2.j.d(dVar, e42.d0.clicfg_finder_full_screen_inside_radio, false, 2, null);
        dVar.a("FINDER_FULLSCREEN_INSIDE_RADIO", kz5.c0.i(java.lang.Float.valueOf(1.773f), java.lang.Float.valueOf(1.333f), java.lang.Float.valueOf(2.0f)), kz5.c0.i("16:9", "4:3", "2:1"));
        return dVar;
    }
}
