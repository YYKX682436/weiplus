package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class fj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.fj f126780d = new com.tencent.mm.plugin.finder.storage.fj();

    public fj() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "使用Monitor观察视频播放", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_enable_monitor, false, 2, null);
        aVar.a("FINDER_MONITOR_ENABLE", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
