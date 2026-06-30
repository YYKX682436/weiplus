package lx;

/* loaded from: classes11.dex */
public final class q2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.w0 f321920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lx.v2 f321921e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hr1.e f321922f;

    public q2(l75.w0 w0Var, lx.v2 v2Var, hr1.e eVar) {
        this.f321920d = w0Var;
        this.f321921e = v2Var;
        this.f321922f = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l75.w0 w0Var = this.f321920d;
        int i17 = w0Var.f316974b;
        lx.v2 v2Var = this.f321921e;
        if (i17 == 1 || i17 == 2 || i17 == 5 || i17 == 7) {
            lx.v2.b(v2Var, this.f321922f);
            return;
        }
        if (i17 != 8) {
            lx.v2.a(v2Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizPhotoPrivateMsgPlugin", "[onConversationStorageChange] unhandled eventId=" + w0Var.f316974b);
            return;
        }
        com.tencent.pigeon.biz.BizPhotoPrivateMsgCallbackApi bizPhotoPrivateMsgCallbackApi = v2Var.f321982h;
        if (bizPhotoPrivateMsgCallbackApi == null) {
            return;
        }
        try {
            bizPhotoPrivateMsgCallbackApi.reloadData(new lx.s2(v2Var));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FlutterBizPhotoPrivateMsgPlugin", "notifyReloadData error: " + e17.getMessage());
        }
    }
}
