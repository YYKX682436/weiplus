package com.tencent.mm.plugin.finder.view;

/* loaded from: classes.dex */
public final class zj implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.ck f133469d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f133470e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f133471f;

    public zj(com.tencent.mm.plugin.finder.view.ck ckVar, yz5.l lVar, android.content.Context context) {
        this.f133469d = ckVar;
        this.f133470e = lVar;
        this.f133471f = context;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        yz5.l lVar = this.f133470e;
        com.tencent.mm.plugin.finder.view.ck ckVar = this.f133469d;
        com.tencent.mars.xlog.Log.i("Finder.FinderShareProductWxaCoverWidget", "fetch data onCallback " + iPCString.f68406d);
        try {
            java.lang.String value = iPCString.f68406d;
            kotlin.jvm.internal.o.f(value, "value");
            ckVar.f131783b = value;
            org.json.JSONObject jSONObject = new org.json.JSONObject(iPCString.f68406d);
            java.lang.String optString = jSONObject.optString("feedId");
            kotlin.jvm.internal.o.f(optString, "optString(...)");
            ckVar.f131784c = optString;
            kotlin.jvm.internal.o.f(jSONObject.optString("nonceId"), "optString(...)");
            if (ckVar.f131784c.length() > 0) {
                lVar.invoke(ckVar.e(this.f133471f));
            } else {
                lVar.invoke(null);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.FinderShareProductWxaCoverWidget", th6, "createWidgetAsync parse result failed", new java.lang.Object[0]);
            lVar.invoke(null);
        }
    }
}
