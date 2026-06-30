package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class v5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.v5 f128171d = new com.tencent.mm.plugin.finder.storage.v5();

    public v5() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(3000, "弹幕重试时长", null, null, 12, null);
        aVar.a("FINDER_BULLET_RETRY_TIME", kz5.c0.i(1000, 2000, 3000), kz5.c0.i("1000", "2000", "3000"));
        lb2.j.d(aVar, e42.c0.clicfg_finder_bullet_retry_time, false, 2, null);
        return aVar;
    }
}
