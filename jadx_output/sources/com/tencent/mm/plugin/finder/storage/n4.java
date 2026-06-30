package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class n4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.n4 f127226d = new com.tencent.mm.plugin.finder.storage.n4();

    public n4() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(86400, "视频本地续播距离上次播放间隔s", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_auto_seek_local_interval, false, 2, null);
        aVar.a("FINDER_AUTO_SEEK_LOCAL_INTERVAL", kz5.c0.i(0, 86400, 60, 10), kz5.c0.i("不判断", "24小时", "1分钟", "10s"));
        return aVar;
    }
}
