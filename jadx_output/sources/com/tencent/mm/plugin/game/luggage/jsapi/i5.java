package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes5.dex */
public final class i5 implements m33.w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.jsapi.j5 f139677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sd.b f139678b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139679c;

    public i5(com.tencent.mm.plugin.game.luggage.jsapi.j5 j5Var, sd.b bVar, java.lang.String str) {
        this.f139677a = j5Var;
        this.f139678b = bVar;
        this.f139679c = str;
    }

    @Override // m33.w0
    public void a(org.json.JSONObject jSONObject) {
        sd.l0 runtime;
        m33.x0.f323344a.f323345a.remove(this.f139679c);
        if (jSONObject != null) {
            this.f139677a.getClass();
            com.tencent.mars.xlog.Log.i("showInputToolView", "onFinish result = " + jSONObject);
            sd.a aVar = (sd.a) this.f139678b.f406596a;
            if (aVar == null || (runtime = aVar.getRuntime()) == null) {
                return;
            }
            runtime.b("GCInputDidCommit", jSONObject);
        }
    }

    @Override // m33.w0
    public void b(m33.u0 u0Var) {
        sd.l0 runtime;
        if (u0Var == null) {
            return;
        }
        this.f139677a.getClass();
        com.tencent.mars.xlog.Log.i("showInputToolView", "GameInputStateChange onChanged state = " + u0Var);
        sd.a aVar = (sd.a) this.f139678b.f406596a;
        if (aVar == null || (runtime = aVar.getRuntime()) == null) {
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("gamecenter_identifier", this.f139679c);
        jSONObject.put("isShow", u0Var.f323340d);
        jSONObject.put("inputHeight", u0Var.f323339c);
        jSONObject.put("inputTop", u0Var.f323338b);
        jSONObject.put("contentText", u0Var.f323337a);
        runtime.b("GCInputStateChange", jSONObject);
    }
}
