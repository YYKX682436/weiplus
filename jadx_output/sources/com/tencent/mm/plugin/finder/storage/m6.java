package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class m6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.m6 f127172d = new com.tencent.mm.plugin.finder.storage.m6();

    public m6() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1800, "清理视频号多任务activity阈值s", null, null, 12, null);
        aVar.a("FINDER_CLEAN_MULTI_TASK_THRESHOLD", kz5.c0.i(0, 10, 1800), kz5.c0.i("关", "10s", "30min"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_clean_multi_task_threshold, false, 2, null);
        return aVar;
    }
}
