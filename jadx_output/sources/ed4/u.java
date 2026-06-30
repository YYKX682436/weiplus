package ed4;

/* loaded from: classes4.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f251325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.p0 f251326e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ed4.v f251327f;

    public u(ed4.v vVar, java.lang.String str, com.tencent.mm.plugin.sns.ui.item.p0 p0Var) {
        this.f251327f = vVar;
        this.f251325d = str;
        this.f251326e = p0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3$2");
        ed4.v vVar = this.f251327f;
        com.tencent.mm.plugin.sns.storage.p pVar = vVar.f251328a.f169407r;
        java.lang.String str = pVar != null ? pVar.f166095g : "";
        java.lang.String str2 = this.f251325d;
        com.tencent.mm.plugin.sns.ui.item.p0 p0Var = this.f251326e;
        if (str2 == null || !str2.equals(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "before do shot, url != CardInfo.sphereImageUrl, url=" + str2 + ", info.url=" + str);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "do shot");
            jb4.v.f(p0Var.G0, str, "scene_timeline");
            vVar.f251328a.f169409t = false;
        }
        vVar.f251328a.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "enable touch and sensor after shot, isInLowPriority=false");
        vVar.f251328a.getClass();
        p0Var.G0.setSensorEnabled(true);
        p0Var.G0.setTouchEnabled(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$3$2");
    }
}
