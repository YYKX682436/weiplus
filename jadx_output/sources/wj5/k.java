package wj5;

/* loaded from: classes8.dex */
public final class k implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj5.l f446816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f446817e;

    public k(wj5.l lVar, long j17) {
        this.f446816d = lVar;
        this.f446817e = j17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 0) {
            java.lang.String str = this.f446816d.f446820g;
            long j17 = this.f446817e;
            com.tencent.mars.xlog.Log.i(str, "click close finder live tipsbar, liveId:".concat(pm0.v.u(j17)));
            rl2.v wi6 = ((vd2.u0) ((ss5.c0) i95.n0.c(ss5.c0.class))).wi();
            if (wi6 != null) {
                wi6.z0(j17, true);
            }
        }
    }
}
