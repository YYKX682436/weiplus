package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class id extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.id f126943d = new com.tencent.mm.plugin.finder.storage.id();

    public id() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "修复18054多任务上报", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_fix_multi_task_18054_report, false, 2, null);
        aVar.a("FINDER_FIX_MULTI_REPORT", kz5.c0.i(0, 1), kz5.c0.i("0", "1"));
        return aVar;
    }
}
