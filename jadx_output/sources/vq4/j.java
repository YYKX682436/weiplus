package vq4;

/* loaded from: classes12.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh.o2 f439316d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(rh.o2 o2Var) {
        super(1);
        this.f439316d = o2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject subJson = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(subJson, "$this$subJson");
        rh.o2 o2Var = this.f439316d;
        subJson.put("currCount", ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) o2Var.f395485b).f52563i);
        subJson.put("deadCount", ((com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot) o2Var.f395486c).f52564j.f395560a.size());
        return jz5.f0.f302826a;
    }
}
