package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class l10 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.l10 f127102d = new com.tencent.mm.plugin.finder.storage.l10();

    public l10() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "相关流多任务跳3tab(后台x小时)", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_enable_finder_share_rel_multi_task_3tab, false, 2, null);
        aVar.a("FinderShareRelMultitaskJump3tab", kz5.c0.i(0, 6, 12, 24, -1, -2, -3), kz5.c0.i("关闭", "6h", "12h", "24h", "3s", "30m", "2m"));
        return aVar;
    }
}
