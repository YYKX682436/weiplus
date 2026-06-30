package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class q2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.q2 f127403d = new com.tencent.mm.plugin.finder.storage.q2();

    public q2() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(7, "常读账号b 天内对于同作者最多出 1 次", null, null, 12, null);
        aVar.a("FINDER_ACCOUNT_INFO_UPDATE_X_DAY_ONE_COUNT", kz5.c0.i(0, -1, 1, 3, 7, 100), kz5.c0.i("禁止出", "无限制", "1", "3", "5", "200"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_x_day_one_count, false, 2, null);
        return aVar;
    }
}
