package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.w0 f143804e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(java.lang.String str, com.tencent.mm.plugin.lite.jsapi.comms.w0 w0Var) {
        super(1);
        this.f143803d = str;
        this.f143804e = w0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String path = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(path, "path");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(this.f143803d, path);
        this.f143804e.f143443f.c(jSONObject, false);
        return jz5.f0.f302826a;
    }
}
