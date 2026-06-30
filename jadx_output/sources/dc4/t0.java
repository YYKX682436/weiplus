package dc4;

/* loaded from: classes4.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228817d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dc4.u0 f228818e;

    public t0(dc4.u0 u0Var, java.lang.String str) {
        this.f228818e = u0Var;
        this.f228817d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3$2");
        dc4.u0 u0Var = this.f228818e;
        java.lang.String str = dc4.v0.n(u0Var.f228830a) != null ? dc4.v0.n(u0Var.f228830a).f166095g : "";
        java.lang.String str2 = this.f228817d;
        if (str2 == null || !str2.equals(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SphereImageView.SphereCardAdDetailItem", "before do shot, url != CardInfo.sphereImageUrl, url=" + str2 + ", info.url=" + str);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "do shot");
            jb4.v.f(u0Var.f228830a.f228848x, str, "scene_timeline");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdDetailItem", "enable touch and sensor after shot");
        u0Var.f228830a.f228848x.setSensorEnabled(true);
        u0Var.f228830a.f228848x.setTouchEnabled(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.detail.item.SphereCardAdDetailItem$3$2");
    }
}
