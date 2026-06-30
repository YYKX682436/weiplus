package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class zl extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.zl f128462d = new com.tencent.mm.plugin.finder.storage.zl();

    public zl() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "海外用户可以创建用户", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_foreign_can_create_account, false, 2, null);
        aVar.a("FINDER_OVER_SEA_CAN_CREATE_ACCOUNT", kz5.c0.i(0, 1), kz5.c0.i("不允许", "允许"));
        return aVar;
    }
}
