package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class fw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.fw f126793d = new com.tencent.mm.plugin.finder.storage.fw();

    public fw() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(3600, "16岁以下未成年防沉迷时长", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_young_teens_anti_addict_interval, false, 2, null);
        aVar.a("FINDER_TEENMODE_YOUNG_TEENS_ANTI_ADDICT_INTERVAL", kz5.c0.i(10, 3600), kz5.c0.i("10s", "1小时"));
        return aVar;
    }
}
