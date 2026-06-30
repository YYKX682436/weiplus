package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.zoomimage.subsampling.internal.p0 f215054d = new com.tencent.mm.zoomimage.subsampling.internal.p0();

    public p0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yq5.i it = (yq5.i) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.util.List list = it.f464598b;
        long j17 = ((yq5.m) kz5.n0.i0(list)).f464606a;
        return it.f464597a + ':' + list.size() + ':' + zq5.d.b(zq5.d.a(((int) (j17 >> 32)) + 1, zq5.c.a(j17) + 1));
    }
}
