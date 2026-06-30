package ni3;

/* loaded from: classes10.dex */
public final class b1 {
    public final void a(long j17, ni3.p0 p0Var, com.tencent.mm.autogen.mmdata.rpt.FinderVideoLoadMonitorStruct finderVideoLoadMonitorStruct) {
        finderVideoLoadMonitorStruct.f57994d = 2L;
        finderVideoLoadMonitorStruct.f57995e = finderVideoLoadMonitorStruct.b("contextId", p0Var.f337671b.f337647a, true);
        ni3.o0 o0Var = p0Var.f337671b;
        finderVideoLoadMonitorStruct.f57996f = o0Var.f337648b;
        finderVideoLoadMonitorStruct.f57997g = o0Var.f337649c;
        finderVideoLoadMonitorStruct.f57998h = o0Var.f337650d;
        finderVideoLoadMonitorStruct.f57999i = finderVideoLoadMonitorStruct.b("feedId", pm0.v.u(p0Var.f337670a.getItemId()), true);
        finderVideoLoadMonitorStruct.f58000j = finderVideoLoadMonitorStruct.b("mediaId", p0Var.f337672c.f337719a, true);
        finderVideoLoadMonitorStruct.f58001k = j17;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("isFirstPlay", p0Var.f337672c.f337721c);
        jSONObject.put("exposeTime", p0Var.f337672c.f337722d);
        jSONObject.put("playTime", p0Var.f337672c.f337723e);
        jSONObject.put("firstLoadTime", p0Var.f337672c.f337724f);
        jSONObject.put("firstFrameTime", p0Var.f337672c.f337725g);
        jSONObject.put("userFirstFrameTime", p0Var.f337672c.f337726h);
        jSONObject.put("bufferCount", p0Var.f337672c.f337727i);
        jSONObject.put("bufferTotalTime", p0Var.f337672c.f337728j);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        finderVideoLoadMonitorStruct.f58002l = finderVideoLoadMonitorStruct.b("VideoPlayInfo", r26.i0.t(jSONObject2, ",", ";", false), true);
    }
}
