package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class zm extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.zm f128463d = new com.tencent.mm.plugin.finder.storage.zm();

    public zm() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "发表改为异步确认", null, null, 12, null);
        aVar.a("FINDER_POST_ASYNC_CONFIRM", kz5.c0.i(1, 0), kz5.c0.i("开", "关"));
        aVar.c(e42.c0.clicfg_finder_post_async_confirm, false);
        return aVar;
    }
}
