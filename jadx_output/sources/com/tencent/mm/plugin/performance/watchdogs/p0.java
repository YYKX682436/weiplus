package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public final class p0 extends com.tencent.mm.plugin.performance.watchdogs.l0 {

    /* renamed from: c, reason: collision with root package name */
    public static final com.tencent.mm.plugin.performance.watchdogs.p0 f153111c = new com.tencent.mm.plugin.performance.watchdogs.p0();

    @Override // com.tencent.mm.plugin.performance.watchdogs.o0
    public java.lang.String c() {
        return "pss";
    }

    @Override // com.tencent.mm.plugin.performance.watchdogs.o0
    public int d() {
        return 301;
    }

    @Override // com.tencent.mm.plugin.performance.watchdogs.l0
    public boolean i(com.tencent.matrix.util.MemInfo memInfo) {
        com.tencent.matrix.util.PssInfo pssInfo;
        return ((memInfo == null || (pssInfo = memInfo.f53103n) == null) ? 0L : (long) pssInfo.f53114d) > 2147483648L;
    }

    @Override // com.tencent.mm.plugin.performance.watchdogs.l0
    public boolean j(ob0.s3 info) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(info, "info");
        java.util.Map map = info.f343946c;
        return ((map == null || (str = (java.lang.String) map.get("summary.total-pss")) == null) ? 0L : java.lang.Long.parseLong(str)) > 2147483648L;
    }

    @Override // com.tencent.mm.plugin.performance.watchdogs.l0
    public void k(com.tencent.matrix.util.MemInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        g(info.f53103n != null ? r3.f53114d : 0L);
    }

    @Override // com.tencent.mm.plugin.performance.watchdogs.l0
    public void l(ob0.s3 info) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(info, "info");
        java.util.Map map = info.f343946c;
        g((map == null || (str = (java.lang.String) map.get("summary.total-pss")) == null) ? 0L : java.lang.Long.parseLong(str));
    }
}
