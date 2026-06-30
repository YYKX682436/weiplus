package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class iu extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.iu f126965d = new com.tencent.mm.plugin.finder.storage.iu();

    public iu() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "朋友圈自动播放丝滑进入", null, null, 12, null);
        aVar.a("FINDER_SNS_AUTO_PLAY_FLUENT_ENABLE", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_sns_auto_play_fluent_enable, false, 2, null);
        return aVar;
    }
}
