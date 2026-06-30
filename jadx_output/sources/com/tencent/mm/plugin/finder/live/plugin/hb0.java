package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class hb0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f112793d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f112794e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb0(java.lang.String str, int i17) {
        super(0);
        this.f112793d = str;
        this.f112794e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        java.lang.String q07 = r26.n0.q0(this.f112793d, ".flv?", "no flv!");
        new cz2.h();
        com.tencent.mm.autogen.mmdata.rpt.FinderStreamTrackStruct finderStreamTrackStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderStreamTrackStruct();
        finderStreamTrackStruct.f57872d = 8;
        finderStreamTrackStruct.f57873e = 10002L;
        finderStreamTrackStruct.f57874f = finderStreamTrackStruct.b("actionName", "finderlive_switchstream", true);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("ver", com.tencent.mm.sdk.platformtools.z.f193111g);
        jSONObject.put("ver_init", lp0.a.f320249c);
        java.lang.String format = java.lang.String.format("%08x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(o45.wf.f343029g)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        jSONObject.put("CLIENT_VERSION", format);
        jSONObject.put("tag", com.tencent.mm.sdk.platformtools.z.f193105a);
        jSONObject.put("rev", com.tencent.mm.sdk.platformtools.z.f193109e);
        jSONObject.put("switchUrl", q07);
        jSONObject.put("switchRet", this.f112794e);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        finderStreamTrackStruct.f57875g = finderStreamTrackStruct.b("actionExt", r26.i0.t(jSONObject2, ",", ";", false), true);
        finderStreamTrackStruct.f57881m = c01.id.a();
        finderStreamTrackStruct.f57876h = 0;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        java.lang.String a17 = com.tencent.mm.sdk.platformtools.z.a();
        jSONObject3.put("result", a17 != null ? r26.i0.t(a17, "\n", ";", false) : null);
        java.lang.String jSONObject4 = jSONObject3.toString();
        kotlin.jvm.internal.o.f(jSONObject4, "toString(...)");
        finderStreamTrackStruct.f57877i = finderStreamTrackStruct.b("resultExt", r26.i0.t(jSONObject4, ",", ";", false), true);
        finderStreamTrackStruct.f57878j = 0;
        finderStreamTrackStruct.f57880l = 0L;
        m92.b I1 = g92.a.I1(g92.b.f269769e, false, 1, null);
        if (I1 == null || (str = I1.field_nickname) == null) {
            str = "";
        }
        finderStreamTrackStruct.f57879k = finderStreamTrackStruct.b("snn", str, true);
        com.tencent.mars.xlog.Log.i(cz2.h.f225006b, "report value " + finderStreamTrackStruct.n());
        finderStreamTrackStruct.k();
        return jz5.f0.f302826a;
    }
}
