package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class u20 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.u20 f128112d = new com.tencent.mm.plugin.finder.storage.u20();

    public u20() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(30, "长视频弹幕字数限制", null, null, 12, null);
        aVar.a("MEGA_VIDEO_BULLET_TEXT_LIMIT", kz5.c0.i(15, 30), kz5.c0.i("长视频弹幕字数限制15", "长视频弹幕字数限制30"));
        lb2.j.d(aVar, e42.d0.clicfg_mega_video_bullet_text_limit, false, 2, null);
        return aVar;
    }
}
