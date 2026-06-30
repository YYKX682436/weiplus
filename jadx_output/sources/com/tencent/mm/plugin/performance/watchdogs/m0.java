package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public final class m0 extends com.tencent.mm.plugin.performance.watchdogs.l0 {

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.plugin.performance.watchdogs.m0 f153102c = new com.tencent.mm.plugin.performance.watchdogs.m0();

    @Override // com.tencent.mm.plugin.performance.watchdogs.o0
    public java.lang.String c() {
        return "native_heap";
    }

    @Override // com.tencent.mm.plugin.performance.watchdogs.o0
    public int d() {
        return 300;
    }

    @Override // com.tencent.mm.plugin.performance.watchdogs.l0
    public boolean i(com.tencent.matrix.util.MemInfo memInfo) {
        com.tencent.matrix.util.NativeMemInfo nativeMemInfo;
        return ((memInfo == null || (nativeMemInfo = memInfo.f53100h) == null) ? 0L : nativeMemInfo.f53107f) > 2147483648L;
    }

    @Override // com.tencent.mm.plugin.performance.watchdogs.l0
    public boolean j(ob0.s3 info) {
        kotlin.jvm.internal.o.g(info, "info");
        long j17 = info.f343957n;
        return 2147483649L <= j17 && j17 < 500000000001L;
    }

    @Override // com.tencent.mm.plugin.performance.watchdogs.l0
    public void k(com.tencent.matrix.util.MemInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.matrix.util.NativeMemInfo nativeMemInfo = info.f53100h;
        kotlin.jvm.internal.o.d(nativeMemInfo);
        g(nativeMemInfo.f53107f);
    }

    @Override // com.tencent.mm.plugin.performance.watchdogs.l0
    public void l(ob0.s3 info) {
        kotlin.jvm.internal.o.g(info, "info");
        g(info.f343957n);
    }
}
