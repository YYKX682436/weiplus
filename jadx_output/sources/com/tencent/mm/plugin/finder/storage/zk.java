package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class zk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.zk f128461d = new com.tencent.mm.plugin.finder.storage.zk();

    public zk() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(2, "横屏播放器底部预加载阈值-大卡样式", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_new_style_ui_big_card_preload_threshold_count, false, 2, null);
        aVar.a("FINDER_NEW_STYLE_UI_BIG_CARD_PRELOAD_THRESHOLD_COUNT", kz5.c0.i(2, 3, 5, 7, 9), kz5.c0.i("2", "3", "5", "7", "9"));
        return aVar;
    }
}
