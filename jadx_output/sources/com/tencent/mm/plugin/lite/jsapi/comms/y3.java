package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes7.dex */
public class y3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Exception f143833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.z3 f143834e;

    public y3(com.tencent.mm.plugin.lite.jsapi.comms.z3 z3Var, java.lang.Exception exc) {
        this.f143834e = z3Var;
        this.f143833d = exc;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f143834e.f143842f.f143443f.a(this.f143833d.getMessage());
    }
}
