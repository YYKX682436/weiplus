package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class o4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.o4 f127285d = new com.tencent.mm.plugin.finder.storage.o4();

    public o4() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "视频全局续播回滚时间s", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_auto_seek_rollback_time, false, 2, null);
        aVar.a("FINDER_AUTO_SEEK_ROLLBACK_TIME", kz5.c0.i(0, 3, 5), kz5.c0.i("0s", "3s", "5s"));
        return aVar;
    }
}
