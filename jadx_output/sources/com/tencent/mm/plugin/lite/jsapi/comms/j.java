package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class j implements com.tencent.mm.model.gdpr.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143618a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f143619b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f143620c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.k f143621d;

    public j(com.tencent.mm.plugin.lite.jsapi.comms.k kVar, java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        this.f143621d = kVar;
        this.f143618a = str;
        this.f143619b = jSONObject;
        this.f143620c = z17;
    }

    @Override // com.tencent.mm.model.gdpr.b
    public void a(int i17) {
        com.tencent.mm.plugin.lite.jsapi.comms.k kVar = this.f143621d;
        if (i17 == 0) {
            kVar.A(this.f143618a, this.f143619b, this.f143620c);
        } else {
            com.tencent.mars.xlog.Log.i("LiteAppJsApiAddContact", "EU user failed");
            kVar.f143443f.a("addContact:fail  EU user failed");
        }
    }
}
