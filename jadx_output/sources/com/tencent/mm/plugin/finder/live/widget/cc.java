package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class cc {
    public cc(kotlin.jvm.internal.i iVar) {
    }

    public final void a(gk2.e buContext, int i17, java.util.Map map) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        org.json.JSONObject jSONObject = new org.json.JSONObject(map == null ? kz5.q0.f314001d : map);
        jSONObject.put("type", i17);
        jSONObject.put("hscreen_switch_status", ((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) ((mm2.j2) buContext.a(mm2.j2.class)).f329165m).getValue()).booleanValue() ? 1 : 0);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.V1, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
    }
}
