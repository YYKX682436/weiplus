package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class n2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.n2 f127222d = new com.tencent.mm.plugin.finder.storage.n2();

    public n2() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(3, "常读账号一天最多出 a 次", null, null, 12, null);
        aVar.a("FINDER_ACCOUNT_INFO_UPDATE_ONE_DAY_MAX_COUNT", kz5.c0.i(0, -1, 3, 5, 100), kz5.c0.i("禁止出", "无限制", "3", "5", "200"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_one_day_max_count, false, 2, null);
        return aVar;
    }
}
