package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class c5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.c5 f126563d = new com.tencent.mm.plugin.finder.storage.c5();

    public c5() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "拉起弹幕输入框时视频是否暂停", "FINDER_BULLET_BTN_CLICK_PAUSE_VIDEO", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_video_bullet_btn_click_pause, false, 2, null);
        return aVar;
    }
}
