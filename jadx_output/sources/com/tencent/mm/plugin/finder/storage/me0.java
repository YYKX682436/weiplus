package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class me0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.me0 f127192d = new com.tencent.mm.plugin.finder.storage.me0();

    public me0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.storage.xi0[] xi0VarArr = com.tencent.mm.plugin.finder.storage.xi0.f128314d;
        ob2.a aVar = new ob2.a(1, "发现页右侧红点安全距离", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_entrance_red_dot_occupied_width, false, 2, null);
        aVar.a("FINDER_ENTRANCE_REDDOT_OCCUPIED_WIDTH", kz5.c0.i(0, 1, 2), kz5.c0.i("现网默认值", "3A", "4A"));
        return aVar;
    }
}
