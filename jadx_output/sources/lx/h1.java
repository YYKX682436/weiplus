package lx;

/* loaded from: classes8.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lx.r1 f321780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f321781e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f321782f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(lx.r1 r1Var, long j17, long j18) {
        super(1);
        this.f321780d = r1Var;
        this.f321781e = j17;
        this.f321782f = j18;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.pigeon.biz.BizPOIInfo bizPOIInfo = (com.tencent.pigeon.biz.BizPOIInfo) obj;
        java.lang.Double valueOf = java.lang.Double.valueOf(0.0d);
        if (bizPOIInfo == null) {
            bizPOIInfo = new com.tencent.pigeon.biz.BizPOIInfo(valueOf, valueOf, com.eclipsesource.mmv8.Platform.UNKNOWN, null, 8, null);
        }
        lx.r1 r1Var = this.f321780d;
        r1Var.getClass();
        java.lang.Double longitude = bizPOIInfo.getLongitude();
        java.lang.Double valueOf2 = java.lang.Double.valueOf(longitude != null ? longitude.doubleValue() : 0.0d);
        java.lang.Double latitude = bizPOIInfo.getLatitude();
        java.lang.Double valueOf3 = java.lang.Double.valueOf(latitude != null ? latitude.doubleValue() : 0.0d);
        java.lang.String cityCode = bizPOIInfo.getCityCode();
        if (cityCode == null) {
            cityCode = "";
        }
        com.tencent.pigeon.biz.BizUserLocationInfo bizUserLocationInfo = new com.tencent.pigeon.biz.BizUserLocationInfo(valueOf2, valueOf3, cityCode, java.lang.Long.valueOf(this.f321781e), java.lang.Long.valueOf(this.f321782f));
        r1Var.f321930g = bizUserLocationInfo;
        com.tencent.pigeon.biz.BizLocationCallbackApi bizLocationCallbackApi = r1Var.f321928e;
        if (bizLocationCallbackApi != null) {
            bizLocationCallbackApi.onPOIFetched(bizUserLocationInfo, java.lang.System.currentTimeMillis(), lx.g1.f321768d);
        }
        return jz5.f0.f302826a;
    }
}
