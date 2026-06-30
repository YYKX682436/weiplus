package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes8.dex */
public class k3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean[] f143633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.m3 f143634e;

    public k3(com.tencent.mm.plugin.lite.jsapi.comms.m3 m3Var, boolean[] zArr) {
        this.f143634e = m3Var;
        this.f143633d = zArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f143633d) {
            if (!this.f143633d[0]) {
                com.tencent.mars.xlog.Log.w("LiteAppJsApiLogin", "geta8key timeout");
                this.f143633d[0] = true;
                this.f143634e.f143443f.a("getA8Key timeout");
            }
        }
    }
}
