package com.tencent.mm.plugin.game.luggage.liteapp;

/* loaded from: classes8.dex */
public class b extends sd.l0 {

    /* renamed from: f, reason: collision with root package name */
    public sd.h f139810f;

    /* renamed from: g, reason: collision with root package name */
    public od.l f139811g;

    public b(android.content.Context context, java.lang.Class cls, nw4.e eVar) {
        sd.h hVar = (sd.h) new d56.b(cls, cls).d(context, eVar).f226632b;
        this.f139810f = hVar;
        this.f139811g = new od.l(hVar);
        this.f139810f.injectInitScript();
    }

    @Override // sd.l0
    public void a() {
        this.f139810f.destroy();
        this.f139810f = null;
    }

    @Override // sd.l0
    public void b(java.lang.String str, org.json.JSONObject jSONObject) {
        if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Ij()) {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
            com.tencent.mm.plugin.lite.w.l(str, jSONObject);
        }
    }

    @Override // sd.l0
    public od.l d() {
        return this.f139811g;
    }

    @Override // sd.l0
    public java.lang.String e() {
        return this.f139810f.getUserAgent();
    }
}
