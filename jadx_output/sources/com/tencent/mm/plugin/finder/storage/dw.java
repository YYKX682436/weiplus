package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class dw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.dw f126673d = new com.tencent.mm.plugin.finder.storage.dw();

    public dw() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(7200, "16岁以上未成年防沉迷时长", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_old_teens_anti_addict_interval, false, 2, null);
        aVar.a("FINDER_TEENMODE_OLD_TEENS_ANTI_ADDICT_INTERVAL", kz5.c0.i(10, 7200), kz5.c0.i("10s", "2小时"));
        return aVar;
    }
}
