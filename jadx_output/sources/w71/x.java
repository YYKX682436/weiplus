package w71;

/* loaded from: classes11.dex */
public final class x extends com.tencent.mm.modelbase.m1 {

    /* renamed from: d, reason: collision with root package name */
    public final w71.s f443460d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f443461e;

    /* renamed from: f, reason: collision with root package name */
    public final long f443462f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f443463g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.network.l0 f443464h;

    public x(w71.s cgi) {
        kotlin.jvm.internal.o.g(cgi, "cgi");
        this.f443460d = cgi;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f443462f = java.lang.System.currentTimeMillis();
        this.f443464h = new w71.w(this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public boolean accept(com.tencent.mm.modelbase.m1 m1Var) {
        return true;
    }

    @Override // com.tencent.mm.modelbase.m1
    public void callbackErrorIfNeed(int i17, int i18, java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", "scene callback error");
        super.callbackErrorIfNeed(i17, i18, errMsg);
        com.tencent.mm.modelbase.o oVar = this.f443463g;
        this.f443460d.a(i17, i18, errMsg, oVar != null ? oVar.f70711b.f70700a : null);
    }

    @Override // com.tencent.mm.modelbase.m1
    public void cancel() {
        com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", "scene cancel: %d, func: %d", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(getType()));
        super.cancel();
        this.f443460d.a(3, -1, "cancel", null);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 iose) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(iose, "iose");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "into scene doScene: %d, func: %d", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(getType()));
        this.f443461e = iose;
        int dispatch = dispatch(dispatcher, this.f443463g, this.f443464h);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(getType());
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(dispatch);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "scene doScene, dispatch finish, %d, func: %d, netId: %d, time: %d", valueOf, valueOf2, valueOf3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f443462f));
        if (dispatch < 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTSPlatformWebView", "scene doScene, dispatch failed, net id:%d, func: %d", java.lang.Integer.valueOf(dispatch), java.lang.Integer.valueOf(getType()));
            com.tencent.mm.modelbase.o oVar = this.f443463g;
            this.f443460d.a(3, -1, "dispatch failed, netId < 0", oVar != null ? oVar.f70711b.f70700a : null);
        }
        return dispatch;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.network.v0 getReqResp() {
        com.tencent.mm.network.v0 reqResp = super.getReqResp();
        return reqResp != null ? reqResp : this.f443463g;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        com.tencent.mm.modelbase.o oVar = this.f443463g;
        if (oVar != null) {
            return oVar.f70713d;
        }
        return 0;
    }

    @Override // com.tencent.mm.modelbase.m1
    public boolean uniqueInNetsceneQueue() {
        return true;
    }
}
