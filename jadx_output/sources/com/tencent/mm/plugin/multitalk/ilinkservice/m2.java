package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes8.dex */
public class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f149720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f149721e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.n2 f149722f;

    public m2(com.tencent.mm.plugin.multitalk.ilinkservice.n2 n2Var, int i17, byte[] bArr) {
        this.f149722f = n2Var;
        this.f149720d = i17;
        this.f149721e = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f149720d == 18) {
            byte[] bArr = this.f149721e;
            int i17 = 0;
            if (bArr != null && bArr.length > 0) {
                r45.v70 v70Var = new r45.v70();
                try {
                    v70Var.parseFrom(this.f149721e);
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Multitalk.ILinkService", e17, "ConfFailInfo unable to parse from data", new java.lang.Object[0]);
                }
                i17 = v70Var.f387957d;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "tim: on switch av fail, retrySeconds: %s", java.lang.Integer.valueOf(i17));
            com.tencent.mm.plugin.multitalk.ilinkservice.c cVar = this.f149722f.f149731a.Y;
            if (cVar != null) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
                cVar.getClass();
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.multitalk.ilinkservice.l(cVar, -1700, valueOf));
            }
        }
    }
}
