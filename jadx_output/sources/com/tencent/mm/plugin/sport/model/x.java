package com.tencent.mm.plugin.sport.model;

/* loaded from: classes12.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public long f171818a;

    /* renamed from: b, reason: collision with root package name */
    public long f171819b;

    /* renamed from: c, reason: collision with root package name */
    public long f171820c;

    /* renamed from: d, reason: collision with root package name */
    public long f171821d;

    /* renamed from: e, reason: collision with root package name */
    public long f171822e;

    /* renamed from: f, reason: collision with root package name */
    public long f171823f;

    /* renamed from: g, reason: collision with root package name */
    public long f171824g;

    public final void a(java.lang.String detailInfoStr) {
        kotlin.jvm.internal.o.g(detailInfoStr, "detailInfoStr");
        java.lang.String[] strArr = (java.lang.String[]) new r26.t(",").g(detailInfoStr, 0).toArray(new java.lang.String[0]);
        try {
            if (!(!(strArr.length == 0)) || strArr.length < 7) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Sport.SportKvStorage", "invalid sport detail str %s", detailInfoStr);
            } else {
                this.f171818a = com.tencent.mm.sdk.platformtools.t8.V(strArr[0], 0L);
                this.f171819b = com.tencent.mm.sdk.platformtools.t8.V(strArr[1], 0L);
                this.f171820c = com.tencent.mm.sdk.platformtools.t8.V(strArr[2], 0L);
                this.f171821d = com.tencent.mm.sdk.platformtools.t8.V(strArr[3], 0L);
                this.f171822e = com.tencent.mm.sdk.platformtools.t8.V(strArr[4], 0L);
                this.f171823f = com.tencent.mm.sdk.platformtools.t8.V(strArr[5], 0L);
                this.f171824g = com.tencent.mm.sdk.platformtools.t8.V(strArr[6], 0L);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Sport.SportKvStorage", e17, "fromStr:" + detailInfoStr + ' ', new java.lang.Object[0]);
        }
    }

    public java.lang.String toString() {
        java.lang.String format = java.lang.String.format("%d,%d,%d,%d,%d,%d,%d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(this.f171818a), java.lang.Long.valueOf(this.f171819b), java.lang.Long.valueOf(this.f171820c), java.lang.Long.valueOf(this.f171821d), java.lang.Long.valueOf(this.f171822e), java.lang.Long.valueOf(this.f171823f), java.lang.Long.valueOf(this.f171824g)}, 7));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }
}
