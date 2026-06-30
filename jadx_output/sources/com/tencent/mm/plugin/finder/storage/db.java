package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class db extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.db f126640d = new com.tencent.mm.plugin.finder.storage.db();

    public db() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "启用主动拉取预加载信息", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_enable_fetch_preload_info, false, 2, null);
        aVar.a("FINDER_ENABLE_FETCH_PRELOAD_INFO", kz5.c0.i(1, 0), kz5.c0.i("打开", "关闭"));
        return aVar;
    }
}
