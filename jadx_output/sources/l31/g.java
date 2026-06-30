package l31;

/* loaded from: classes9.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l31.i f315352d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f315353e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f315354f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315355g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.SubscribeMsgRequestResult f315356h;

    public g(l31.i iVar, int i17, int i18, java.lang.String str, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult) {
        this.f315352d = iVar;
        this.f315353e = i17;
        this.f315354f = i18;
        this.f315355g = str;
        this.f315356h = subscribeMsgRequestResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult;
        l31.f fVar = this.f315352d.f315361f;
        if (fVar != null) {
            java.lang.String errMsg = this.f315355g;
            kotlin.jvm.internal.o.g(errMsg, "errMsg");
            g31.c0 c0Var = ((g31.a0) fVar).f268060a;
            c0Var.f268070b = null;
            int i17 = this.f315353e;
            int i18 = this.f315354f;
            if (i17 != 0 || i18 != 0 || (subscribeMsgRequestResult = this.f315356h) == null) {
                com.tencent.mars.xlog.Log.e("SubscribeSwitchInfoSyncer", "[handleGetNotifySwitchResult] failed, errType=%d, errCode=%d, errMsg=%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), errMsg);
                return;
            }
            boolean z17 = subscribeMsgRequestResult.A;
            com.tencent.mars.xlog.Log.i("SubscribeSwitchInfoSyncer", "[handleGetNotifySwitchResult] success, globalNotifySwitchStatus=%b", java.lang.Boolean.valueOf(z17));
            c0Var.a(z17);
        }
    }
}
