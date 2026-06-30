package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class l2 implements com.tencent.mm.plugin.multitalk.ilinkservice.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.i4 f149688a;

    public l2(com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var) {
        this.f149688a = i4Var;
    }

    @Override // com.tencent.mm.plugin.multitalk.ilinkservice.e0
    public java.lang.Object a(int i17, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.w("MicroMsg.Multitalk.ILinkService", "hy: bind network! %d, %s", java.lang.Integer.valueOf(i17), (java.lang.String) obj);
        this.f149688a.J(new com.tencent.mm.plugin.multitalk.ilinkservice.k2(this, i17));
        return "";
    }

    @Override // com.tencent.mm.plugin.multitalk.ilinkservice.e0
    public /* bridge */ /* synthetic */ java.lang.Object b(byte[] bArr) {
        return "";
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
