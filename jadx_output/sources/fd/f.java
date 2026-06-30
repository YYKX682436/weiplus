package fd;

/* loaded from: classes12.dex */
public final class f extends com.tencent.kinda.gen.KCgi {

    /* renamed from: a, reason: collision with root package name */
    public final int f261245a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f261246b;

    /* renamed from: c, reason: collision with root package name */
    public final int f261247c;

    /* renamed from: d, reason: collision with root package name */
    public final int f261248d;

    /* renamed from: e, reason: collision with root package name */
    public final int f261249e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f261250f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f261251g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f261252h;

    /* renamed from: i, reason: collision with root package name */
    public fd.b f261253i;

    public f(org.json.JSONObject config, java.nio.ByteBuffer data) {
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(data, "data");
        this.f261246b = "";
        this.f261247c = 2;
        this.f261249e = 2;
        this.f261250f = true;
        int optInt = config.optInt("cgiId", 0);
        java.lang.String optString = config.optString("cgiUrl", "");
        java.lang.String optString2 = config.optString("routeInfo", "");
        int optInt2 = config.optInt("channelType", 2);
        int optInt3 = config.optInt("timeout", 0);
        int optInt4 = config.optInt("retryCount", 2);
        boolean optBoolean = config.optBoolean("needNotify", true);
        if (!(optInt > 0)) {
            throw new java.lang.IllegalArgumentException("参数非法: cgiId".toString());
        }
        kotlin.jvm.internal.o.d(optString);
        if (!(optString.length() > 0)) {
            throw new java.lang.IllegalArgumentException("参数非法: cgiUrl".toString());
        }
        if (!(data.capacity() != 0)) {
            throw new java.lang.IllegalArgumentException("参数非法: requestData".toString());
        }
        this.f261245a = optInt;
        this.f261246b = optString;
        this.f261251g = optString2;
        this.f261247c = optInt2;
        this.f261248d = optInt3;
        this.f261249e = optInt4;
        this.f261250f = optBoolean;
        this.f261252h = data.array();
    }

    @Override // com.tencent.kinda.gen.KCgi
    public int getCgiId() {
        return this.f261245a;
    }

    @Override // com.tencent.kinda.gen.KCgi
    public java.lang.String getCgiUrl() {
        return this.f261246b;
    }

    @Override // com.tencent.kinda.gen.KCgi
    public int getChannelType() {
        return this.f261247c;
    }

    @Override // com.tencent.kinda.gen.KCgi
    public boolean getNeedNotify() {
        return this.f261250f;
    }

    @Override // com.tencent.kinda.gen.KCgi
    public com.tencent.kinda.gen.KindaNewDNSBusinessType getNewDNSBusinessType() {
        return this.f261245a != 665 ? com.tencent.kinda.gen.KindaNewDNSBusinessType.PAY : com.tencent.kinda.gen.KindaNewDNSBusinessType.BASE;
    }

    @Override // com.tencent.kinda.gen.KCgi
    public byte[] getRequestData() {
        return this.f261252h;
    }

    @Override // com.tencent.kinda.gen.KCgi
    public int getRetryCount() {
        return this.f261249e;
    }

    @Override // com.tencent.kinda.gen.KCgi
    public java.lang.String getRouteInfo() {
        return this.f261251g;
    }

    @Override // com.tencent.kinda.gen.KCgi
    public int getTimeout() {
        return this.f261248d;
    }

    @Override // com.tencent.kinda.gen.KCgi
    public void onResp(int i17, byte[] bArr, java.util.HashMap hashMap) {
        fd.b bVar = this.f261253i;
        if (bVar != null) {
            kotlin.jvm.internal.o.d(bVar);
            fd.d dVar = (fd.d) bVar;
            java.lang.Object[] objArr = new java.lang.Object[4];
            fd.f fVar = dVar.f261241a;
            objArr[0] = java.lang.Integer.valueOf(fVar.f261245a);
            objArr[1] = fVar.f261246b;
            objArr[2] = java.lang.Integer.valueOf(i17);
            objArr[3] = bArr != null ? java.lang.Integer.valueOf(bArr.length) : null;
            com.tencent.mars.xlog.Log.i("MicroMsg.WXPLiteAppNetworkService", "cgi resp - cgiId: %d cgiUrl: %s errType: %d dataSize: %d", objArr);
            dVar.f261242b.getClass();
            com.tencent.liteapp.framework.dynamic_module.model.WXPLiteAppNetworkResponse wXPLiteAppNetworkResponse = new com.tencent.liteapp.framework.dynamic_module.model.WXPLiteAppNetworkResponse(i17, "", bArr != null ? java.nio.ByteBuffer.wrap(bArr) : null);
            wXPLiteAppNetworkResponse.setExtraInfo(hashMap);
            dVar.f261243c.onResp(wXPLiteAppNetworkResponse);
        }
    }
}
