package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class m4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.m4 f127168d = new com.tencent.mm.plugin.finder.storage.m4();

    public m4() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(10, "视频全局续播距离当前播放时间阈值s", null, null, 12, null);
        aVar.a("FINDER_AUTO_SEEK_INTERVAL_THRESHOLD", kz5.c0.i(0, 10), kz5.c0.i("0s", "10s"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_auto_seek_interval_threshold, false, 2, null);
        return aVar;
    }
}
