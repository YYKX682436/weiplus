package n74;

/* loaded from: classes4.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f335425a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f335426b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f335427c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f335428d;

    public s0(java.lang.String snsId, java.lang.String weappUserName, java.lang.String prerenderWeappPath, java.lang.String weappPath) {
        kotlin.jvm.internal.o.g(snsId, "snsId");
        kotlin.jvm.internal.o.g(weappUserName, "weappUserName");
        kotlin.jvm.internal.o.g(prerenderWeappPath, "prerenderWeappPath");
        kotlin.jvm.internal.o.g(weappPath, "weappPath");
        this.f335425a = snsId;
        this.f335426b = weappUserName;
        this.f335427c = prerenderWeappPath;
        this.f335428d = weappPath;
    }

    public java.lang.String toString() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("toString", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper$PreRenderCache");
        java.lang.String str = "[snsId is " + this.f335425a + ", weappUserName is " + this.f335426b + ", prerenderWeappPath is " + this.f335427c + ", weappPath is " + this.f335428d + ']';
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("toString", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdWeappPreRenderHelper$PreRenderCache");
        return str;
    }
}
