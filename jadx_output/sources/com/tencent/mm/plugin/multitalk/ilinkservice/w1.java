package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class w1 implements com.tencent.mm.plugin.multitalk.ilinkservice.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.i4 f149847a;

    public w1(com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var) {
        this.f149847a = i4Var;
    }

    @Override // com.tencent.mm.plugin.multitalk.ilinkservice.e0
    public java.lang.Object a(int i17, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "hy: on member changed");
        this.f149847a.J(new com.tencent.mm.plugin.multitalk.ilinkservice.v1(this, (r45.b80) obj));
        return "";
    }

    @Override // com.tencent.mm.plugin.multitalk.ilinkservice.e0
    public java.lang.Object b(byte[] bArr) {
        r45.b80 b80Var = new r45.b80();
        try {
            b80Var.parseFrom(bArr);
            return b80Var;
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Multitalk.ILinkService", e17, "hy: unable to parse from data", new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.tencent.mm.plugin.multitalk.ilinkservice.e0
    public byte[] c(java.lang.Object obj) {
        return new byte[0];
    }

    @Override // com.tencent.mm.plugin.multitalk.ilinkservice.e0
    public boolean d() {
        return true;
    }
}
