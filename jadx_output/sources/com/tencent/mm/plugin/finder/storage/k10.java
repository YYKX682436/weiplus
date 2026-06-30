package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class k10 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.k10 f127041d = new com.tencent.mm.plugin.finder.storage.k10();

    public k10() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "聊天打开相关流多任务", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_enable_finder_share_rel_multi_task, false, 2, null);
        aVar.a("FinderShareRelMultitask", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
