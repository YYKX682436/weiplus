package w44;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f442891a;

    /* renamed from: b, reason: collision with root package name */
    public final m54.l f442892b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f442893c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f442894d;

    /* renamed from: e, reason: collision with root package name */
    public final w44.a f442895e;

    public b(android.app.Activity activity, m54.l pageParam, boolean z17, yz5.l lVar, w44.a aVar) {
        kotlin.jvm.internal.o.g(pageParam, "pageParam");
        this.f442891a = activity;
        this.f442892b = pageParam;
        this.f442893c = z17;
        this.f442894d = lVar;
        this.f442895e = aVar;
    }

    public final android.app.Activity a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActivity", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActivity", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
        return this.f442891a;
    }

    public final m54.l b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPageParam", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPageParam", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
        return this.f442892b;
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
        if (this == obj) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
            return true;
        }
        if (!(obj instanceof w44.b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
            return false;
        }
        w44.b bVar = (w44.b) obj;
        if (!kotlin.jvm.internal.o.b(this.f442891a, bVar.f442891a)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f442892b, bVar.f442892b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
            return false;
        }
        if (this.f442893c != bVar.f442893c) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
            return false;
        }
        if (!kotlin.jvm.internal.o.b(this.f442894d, bVar.f442894d)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
            return false;
        }
        boolean b17 = kotlin.jvm.internal.o.b(this.f442895e, bVar.f442895e);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
        return b17;
    }

    public int hashCode() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
        android.app.Activity activity = this.f442891a;
        int hashCode = (((((activity == null ? 0 : activity.hashCode()) * 31) + this.f442892b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f442893c)) * 31;
        yz5.l lVar = this.f442894d;
        int hashCode2 = (hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        w44.a aVar = this.f442895e;
        int hashCode3 = hashCode2 + (aVar != null ? aVar.hashCode() : 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hashCode", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
        return hashCode3;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
        java.lang.String str = "JsApiEnv(activity=" + this.f442891a + ", pageParam=" + this.f442892b + ", async=" + this.f442893c + ", backToJS=" + this.f442894d + ", onEvent=" + this.f442895e + ')';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.JsApiEnv");
        return str;
    }
}
