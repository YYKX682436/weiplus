package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class cw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.cw f126606d = new com.tencent.mm.plugin.finder.storage.cw();

    public cw() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(30, "青少年-每隔几分钟提醒休息", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_teenager_rest_period_in_minutes, false, 2, null);
        java.util.List S0 = kz5.n0.S0(new e06.k(0, 1440));
        e06.k kVar = new e06.k(0, 1440);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(kVar, 10));
        java.util.Iterator it = kVar.iterator();
        while (((e06.j) it).hasNext()) {
            arrayList.add(java.lang.String.valueOf(((kz5.x0) it).b()));
        }
        aVar.a("FINDER_TEENAGER_REST_PERIOD_IN_MINUTES", S0, arrayList);
        return aVar;
    }
}
