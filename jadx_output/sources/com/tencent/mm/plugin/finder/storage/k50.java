package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class k50 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.k50 f127049d = new com.tencent.mm.plugin.finder.storage.k50();

    public k50() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "3天2天总开关", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_3_day_2_day_enable, false, 2, null);
        aVar.a("THREE_DAY_TWO_DAY_ENABLE", new java.util.ArrayList(kz5.c0.i(0, 1)), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
