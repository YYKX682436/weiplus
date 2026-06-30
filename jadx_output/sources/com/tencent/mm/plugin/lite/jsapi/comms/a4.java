package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes7.dex */
public class a4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f143497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.b4 f143498e;

    public a4(com.tencent.mm.plugin.lite.jsapi.comms.b4 b4Var, org.json.JSONObject jSONObject) {
        this.f143498e = b4Var;
        this.f143497d = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f143498e.f143443f.c(this.f143497d, false);
    }
}
