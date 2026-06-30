package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes7.dex */
public class z3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f143840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f143841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.b4 f143842f;

    public z3(com.tencent.mm.plugin.lite.jsapi.comms.b4 b4Var, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        this.f143842f = b4Var;
        this.f143840d = arrayList;
        this.f143841e = arrayList2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.tencent.mm.plugin.lite.jsapi.comms.b4.A(this.f143842f, this.f143840d, this.f143841e);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteAppJsApiOpenFilePicker", e17, "Exception in processSelectedFiles", new java.lang.Object[0]);
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.lite.jsapi.comms.y3(this, e17));
        }
    }
}
