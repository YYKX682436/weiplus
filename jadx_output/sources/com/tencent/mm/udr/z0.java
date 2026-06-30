package com.tencent.mm.udr;

/* loaded from: classes5.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f196529d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f196530e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f196531f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f196532g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.udr.r f196533h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(java.lang.String str, java.lang.String str2, long j17, int i17, com.tencent.wechat.aff.udr.r rVar) {
        super(1);
        this.f196529d = str;
        this.f196530e = str2;
        this.f196531f = j17;
        this.f196532g = i17;
        this.f196533h = rVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ea5.k kVar = (ea5.k) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("crossProcessCallBack onSuccess projectId:");
        java.lang.String str = this.f196529d;
        sb6.append(str);
        sb6.append(", name:");
        sb6.append(this.f196530e);
        com.tencent.mars.xlog.Log.i("UDRFeatureService", sb6.toString());
        com.tencent.wechat.aff.udr.r type = this.f196533h;
        if (kVar != null) {
            long j17 = this.f196531f;
            java.lang.String str2 = this.f196529d;
            java.lang.String str3 = this.f196530e;
            int i17 = this.f196532g;
            kotlin.jvm.internal.o.f(type, "$type");
            kVar.onCallBackSuccessAsync(j17, str2, str3, i17, type);
        } else {
            ea5.l wi6 = ((com.tencent.mm.udr.e1) ((com.tencent.mm.udr.c0) i95.n0.c(com.tencent.mm.udr.c0.class))).wi(str);
            if (wi6 != null) {
                long j18 = this.f196531f;
                java.lang.String str4 = this.f196529d;
                java.lang.String str5 = this.f196530e;
                int i18 = this.f196532g;
                kotlin.jvm.internal.o.f(type, "$type");
                wi6.onCallBackSuccessAsync(j18, str4, str5, i18, type);
            }
        }
        return jz5.f0.f302826a;
    }
}
