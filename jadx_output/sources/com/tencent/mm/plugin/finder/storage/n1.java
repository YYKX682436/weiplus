package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class n1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.n1 f127220d = new com.tencent.mm.plugin.finder.storage.n1();

    public n1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.l Bi = ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).Bi();
        ob2.a aVar = new ob2.a(0, "设备分数", null, null, 12, null);
        aVar.a("DEVICE_SCORE", kz5.c0.i(0, 1), kz5.c0.i("CPU分数:" + ((java.lang.Number) Bi.f302833d).floatValue(), "GPU分数:" + ((java.lang.Number) Bi.f302834e).floatValue()));
        return aVar;
    }
}
