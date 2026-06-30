package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class q3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.q3 f127405d = new com.tencent.mm.plugin.finder.storage.q3();

    public q3() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "视频号app push 标志位重置逻辑优化", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_app_push_reset_flag_opt, false, 2, null);
        aVar.a("FINDER_APP_PUSH_FLAG_RESET", kz5.c0.i(0, 1), kz5.c0.i("现网", "退出视频号重置"));
        return aVar;
    }
}
