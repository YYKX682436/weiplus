package com.tencent.mm.udr;

/* loaded from: classes5.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f196522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f196523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f196524f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f196525g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f196526h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.udr.r f196527i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j17, int i17, com.tencent.wechat.aff.udr.r rVar) {
        super(1);
        this.f196522d = str;
        this.f196523e = str2;
        this.f196524f = bundle;
        this.f196525g = j17;
        this.f196526h = i17;
        this.f196527i = rVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ea5.k kVar = (ea5.k) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("crossProcessCallBack onFailure projectId:");
        java.lang.String str = this.f196522d;
        sb6.append(str);
        sb6.append(", name:");
        sb6.append(this.f196523e);
        com.tencent.mars.xlog.Log.i("UDRFeatureService", sb6.toString());
        android.os.Bundle bundle = this.f196524f;
        int i17 = bundle.getInt("errNo");
        int i18 = bundle.getInt("errCode");
        com.tencent.wechat.aff.udr.r type = this.f196527i;
        if (kVar != null) {
            long j17 = this.f196525g;
            java.lang.String str2 = this.f196522d;
            java.lang.String str3 = this.f196523e;
            int i19 = this.f196526h;
            kotlin.jvm.internal.o.f(type, "$type");
            kVar.onCallBackFailAsync(j17, i17, i18, str2, str3, i19, type);
        } else {
            ea5.l wi6 = ((com.tencent.mm.udr.e1) ((com.tencent.mm.udr.c0) i95.n0.c(com.tencent.mm.udr.c0.class))).wi(str);
            if (wi6 != null) {
                long j18 = this.f196525g;
                java.lang.String str4 = this.f196522d;
                java.lang.String str5 = this.f196523e;
                int i27 = this.f196526h;
                kotlin.jvm.internal.o.f(type, "$type");
                wi6.onCallBackFailAsync(j18, i17, i18, str4, str5, i27, type);
            }
        }
        return jz5.f0.f302826a;
    }
}
