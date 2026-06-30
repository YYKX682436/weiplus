package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class yx extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.yx f128413d = new com.tencent.mm.plugin.finder.storage.yx();

    public yx() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(15, "finder弹幕字数限制", null, null, 12, null);
        aVar.a("FINDER_VIDEO_BULLET_TEXT_LIMIT", kz5.c0.i(15, 30), kz5.c0.i("finder弹幕字数限制15", "finder弹幕字数限制30"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_video_bullet_text_limit, false, 2, null);
        return aVar;
    }
}
