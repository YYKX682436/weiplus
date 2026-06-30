package l31;

/* loaded from: classes9.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l31.y f315396d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f315397e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f315398f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315399g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.SubscribeMsgRequestResult f315400h;

    public w(l31.y yVar, int i17, int i18, java.lang.String str, com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult) {
        this.f315396d = yVar;
        this.f315397e = i17;
        this.f315398f = i18;
        this.f315399g = str;
        this.f315400h = subscribeMsgRequestResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult;
        l31.v vVar = this.f315396d.f315404g;
        if (vVar != null) {
            java.lang.String errMsg = this.f315399g;
            kotlin.jvm.internal.o.g(errMsg, "errMsg");
            g31.c0 c0Var = ((g31.b0) vVar).f268066a;
            c0Var.f268071c = null;
            int i17 = this.f315397e;
            int i18 = this.f315398f;
            if (i17 != 0 || i18 != 0 || (subscribeMsgRequestResult = this.f315400h) == null) {
                com.tencent.mars.xlog.Log.e("SubscribeSwitchInfoSyncer", "[handleSetNotifySwitchResult] failed, errType=%d, errCode=%d, errMsg=%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), errMsg);
                return;
            }
            boolean z17 = subscribeMsgRequestResult.A;
            com.tencent.mars.xlog.Log.i("SubscribeSwitchInfoSyncer", "[handleSetNotifySwitchResult] success, globalNotifySwitchStatus=%b", java.lang.Boolean.valueOf(z17));
            c0Var.a(z17);
        }
    }
}
