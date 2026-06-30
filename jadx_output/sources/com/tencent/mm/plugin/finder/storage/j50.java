package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class j50 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.j50 f126982d = new com.tencent.mm.plugin.finder.storage.j50();

    public j50() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(259200000, "3天超时阈值", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_3_day_threshold, false, 2, null);
        aVar.a("THREE_DAY_THRESHOLD", new java.util.ArrayList(kz5.c0.i(259200000, 30000, 180000)), kz5.c0.i("3天", "30 秒", "3 分钟"));
        return aVar;
    }
}
