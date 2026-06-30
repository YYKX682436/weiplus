package com.tencent.mm.xwebutil;

/* loaded from: classes13.dex */
public class p0 extends i11.s {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.xwebutil.r0 f214867b;

    public p0(com.tencent.mm.xwebutil.r0 r0Var) {
        this.f214867b = r0Var;
    }

    @Override // i11.s
    public void a(boolean z17, double d17, double d18, int i17, double d19, double d27, double d28, java.lang.String str, java.lang.String str2, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MM.XWebMMLocationProxy", "onLocationChanged, longitude:%s, latitude:%s, locType:%s, spped:%s", java.lang.Double.valueOf(d18), java.lang.Double.valueOf(d17), java.lang.Integer.valueOf(i17), java.lang.Double.valueOf(d19));
        if (z17) {
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.xwebutil.n0(this, d17, d18, d27, d28, d19));
        } else {
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.xwebutil.o0(this));
        }
    }

    @Override // com.tencent.map.geolocation.sapp.TencentLocationListener
    public void onStatusUpdate(java.lang.String str, int i17, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MM.XWebMMLocationProxy", "onStatusUpdate, name:%s, status:%s", str, java.lang.Integer.valueOf(i17));
    }
}
