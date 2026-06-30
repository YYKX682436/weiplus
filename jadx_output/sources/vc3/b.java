package vc3;

/* loaded from: classes7.dex */
public final class b implements cl.o {

    /* renamed from: a, reason: collision with root package name */
    public long f435256a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.appbrand.v8.IJSRuntime$Config f435257b;

    public b(com.tencent.mm.appbrand.v8.IJSRuntime$Config iJSRuntime$Config) {
        this.f435257b = iJSRuntime$Config;
    }

    @Override // cl.o
    public void a() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f435256a = android.os.SystemClock.elapsedRealtime();
    }

    @Override // cl.o
    public void b(long j17, long j18) {
        java.lang.Long valueOf = java.lang.Long.valueOf(this.f435256a);
        if (!(valueOf.longValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            long longValue = valueOf.longValue();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hy: js runtime created using ");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(android.os.SystemClock.elapsedRealtime() - longValue);
            sb6.append(" and is node snapshot? ");
            sb6.append(this.f435257b.f53945c);
            com.tencent.mars.xlog.Log.i("MBNodeJSRuntimeWrapper", sb6.toString());
        }
    }
}
