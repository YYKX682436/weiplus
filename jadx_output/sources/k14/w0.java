package k14;

/* loaded from: classes4.dex */
public class w0 implements wu5.h, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.setting.ui.setting.hq f303395d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f303396e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.m1 f303397f;

    /* renamed from: g, reason: collision with root package name */
    public long f303398g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k14.x0 f303399h;

    public w0(k14.x0 x0Var, com.tencent.mm.plugin.setting.ui.setting.hq hqVar, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f303399h = x0Var;
        this.f303395d = hqVar;
        this.f303396e = countDownLatch;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "load_unfamiliar_contact";
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UnfamiliarContactEngine", "[onSceneEnd] errType:%s errCode:%s errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            this.f303396e.countDown();
        } else if (m1Var.getType() == 292) {
            this.f303397f = m1Var;
            ((ku5.t0) ku5.t0.f312615d).g(this);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.UpdateSnsTagListEvent updateSnsTagListEvent = new com.tencent.mm.autogen.events.UpdateSnsTagListEvent();
        updateSnsTagListEvent.f54925g.f6515a = this.f303397f;
        updateSnsTagListEvent.e();
        am.f00 f00Var = updateSnsTagListEvent.f54926h;
        int i17 = f00Var.f6623a;
        java.util.List list = f00Var.f6624b;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Boolean.valueOf(list == null);
        objArr[2] = java.lang.Integer.valueOf(list != null ? ((java.util.LinkedList) list).size() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.UnfamiliarContactEngine", "[callback] state:%s,tagList is null?%s,tagList size:%s", objArr);
        k14.x0 x0Var = this.f303399h;
        if (i17 == 1) {
            if (this.f303395d != null) {
                x0Var.f303406e.postUI(new k14.u0(this));
            }
            x0Var.f303406e.postDelayed(new k14.v0(this), 30000L);
        } else {
            if (list != null) {
                x0Var.f303411j.addAll(list);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.UnfamiliarContactEngine", "[AsyncGetSnsTagInfo] %sms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f303398g));
            this.f303396e.countDown();
        }
    }
}
