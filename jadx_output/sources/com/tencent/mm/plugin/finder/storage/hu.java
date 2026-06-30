package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class hu extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.hu f126910d = new com.tencent.mm.plugin.finder.storage.hu();

    public hu() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "朋友圈自动播放开关", null, null, 12, null);
        aVar.a("FINDER_SNS_AUTO_PLAY_ENABLE", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_sns_auto_play_enable, false, 2, null);
        return aVar;
    }
}
