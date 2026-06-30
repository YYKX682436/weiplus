package x44;

/* loaded from: classes4.dex */
public final class s0 implements y44.b {

    /* renamed from: a, reason: collision with root package name */
    public final w44.a f451885a;

    public s0(w44.a aVar) {
        this.f451885a = aVar;
    }

    public void a(java.lang.String pkg) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OnInstallAction");
        kotlin.jvm.internal.o.g(pkg, "pkg");
        com.tencent.mars.xlog.Log.i("SnsAdJs.InstallAction", "{pkg:\"" + pkg + "\", installed:1}");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("pkg", pkg);
        jSONObject.put("installed", 1);
        w44.a aVar = this.f451885a;
        if (aVar != null) {
            aVar.a("onApkInstalled", jSONObject);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.OnInstallAction");
    }
}
