package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public class g0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.b f139644d;

    public g0(com.tencent.mm.plugin.game.luggage.jsapi.i0 i0Var, sd.b bVar) {
        this.f139644d = bVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        sd.b bVar = this.f139644d;
        try {
            bVar.e(new org.json.JSONObject(((android.os.Bundle) obj).getString("backResult")));
        } catch (org.json.JSONException unused) {
            bVar.a();
        }
    }
}
