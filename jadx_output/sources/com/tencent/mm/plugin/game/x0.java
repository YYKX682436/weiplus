package com.tencent.mm.plugin.game;

/* loaded from: classes8.dex */
public class x0 implements l53.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m33.j1 f141969a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f141970b;

    public x0(com.tencent.mm.plugin.game.p0 p0Var, m33.j1 j1Var, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        this.f141969a = j1Var;
        this.f141970b = u3Var;
    }

    @Override // l53.a
    public void a(java.lang.String str) {
        m33.j1 j1Var = this.f141969a;
        if (j1Var != null) {
            ((com.tencent.mm.plugin.game.luggage.jsapi.u5) j1Var).a(str);
        }
        final com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f141970b;
        com.tencent.mm.plugin.appbrand.utils.d5.b(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.game.x0$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.ui.widget.dialog.u3.this.dismiss();
            }
        });
    }

    @Override // l53.a
    public void b(java.lang.String str, java.lang.String str2) {
        m33.j1 j1Var = this.f141969a;
        if (j1Var != null) {
            com.tencent.mm.plugin.game.luggage.jsapi.u5 u5Var = (com.tencent.mm.plugin.game.luggage.jsapi.u5) j1Var;
            u5Var.f139750a.getClass();
            com.tencent.mars.xlog.Log.i("uploadMiniGameVideoToShare", "gamelog.jsapi, web , uploadMiniGameVideoToShare, error videoId = " + u5Var.f139751b + ", videoUrl = " + str + ", thumbUrl = " + str2);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("videoUrl", str);
            jSONObject.put("thumbUrl", str2);
            u5Var.f139752c.a(null, jSONObject);
        }
    }

    @Override // l53.a
    public void c() {
        final com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f141970b;
        com.tencent.mm.plugin.appbrand.utils.d5.b(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.game.x0$$b
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.ui.widget.dialog.u3.this.dismiss();
            }
        });
    }

    @Override // l53.a
    public void onCancel() {
        m33.j1 j1Var = this.f141969a;
        if (j1Var != null) {
            com.tencent.mm.plugin.game.luggage.jsapi.u5 u5Var = (com.tencent.mm.plugin.game.luggage.jsapi.u5) j1Var;
            u5Var.f139750a.getClass();
            com.tencent.mars.xlog.Log.i("uploadMiniGameVideoToShare", "gamelog.jsapi, web , uploadMiniGameVideoToShare, user cancel");
            u5Var.f139752c.a("user cancel", null);
        }
    }

    @Override // l53.a
    public void onSuccess() {
    }
}
