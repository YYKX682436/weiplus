package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class u3 implements com.tencent.mm.plugin.multitalk.ilinkservice.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149830a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149831b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.i4 f149832c;

    public u3(com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var, java.lang.String str, java.lang.String str2) {
        this.f149832c = i4Var;
        this.f149830a = str;
        this.f149831b = str2;
    }

    @Override // com.tencent.mm.plugin.multitalk.ilinkservice.e0
    public java.lang.Object a(int i17, java.lang.Object obj) {
        this.f149832c.J(new com.tencent.mm.plugin.multitalk.ilinkservice.k3(this, (r45.d80) obj));
        return "";
    }

    @Override // com.tencent.mm.plugin.multitalk.ilinkservice.e0
    public java.lang.Object b(byte[] bArr) {
        r45.d80 d80Var = new r45.d80();
        try {
            d80Var.parseFrom(bArr);
            return d80Var;
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
        return false;
    }
}
