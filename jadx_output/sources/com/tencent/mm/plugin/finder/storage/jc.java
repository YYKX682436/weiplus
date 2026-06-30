package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class jc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.jc f127001d = new com.tencent.mm.plugin.finder.storage.jc();

    public jc() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "视频号feed切换为精准seek", null, null, 12, null);
        aVar.a("FINDER_FEED_DEFAULT_ACCURATE_SEEK_MODE", kz5.c0.i(0, 1), kz5.c0.i("关", "开"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_feed_default_accurate_seek_mode, false, 2, null);
        return aVar;
    }
}
