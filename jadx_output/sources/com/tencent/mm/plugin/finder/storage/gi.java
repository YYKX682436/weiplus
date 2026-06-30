package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class gi extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.gi f126840d = new com.tencent.mm.plugin.finder.storage.gi();

    public gi() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "长视频稍后看（左下角）背景展示时长/秒", null, null, 12, null);
        aVar.a("FINDER_LONG_VIDEO_SEE_LATER_BG_SHOW_TIME", kz5.c0.i(0, 3000, 5000, 10000), kz5.c0.i("0秒", "3秒", "5秒", "10秒"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_long_video_see_later_bg_show_time, false, 2, null);
        return aVar;
    }
}
