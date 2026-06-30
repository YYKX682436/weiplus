package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class w3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.w3 f128225d = new com.tencent.mm.plugin.finder.storage.w3();

    public w3() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "异步操控TP播放器", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_async_op_tp_enable, false, 2, null);
        aVar.a("FINDER_ASYNC_OP_TP_ENABLE", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        aVar.f317745p = "滑动流畅优化";
        return aVar;
    }
}
