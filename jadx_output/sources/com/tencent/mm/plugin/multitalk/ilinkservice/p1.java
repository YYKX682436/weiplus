package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class p1 implements com.tencent.mm.plugin.multitalk.ilinkservice.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.i4 f149741a;

    public p1(com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var) {
        this.f149741a = i4Var;
    }

    @Override // com.tencent.mm.plugin.multitalk.ilinkservice.e0
    public java.lang.Object a(int i17, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "accept call timeout");
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = this.f149741a;
        com.tencent.mm.plugin.multitalk.ilinkservice.c cVar = i4Var.Y;
        cVar.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.multitalk.ilinkservice.e(cVar, i4Var.f149623f));
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
        return false;
    }
}
