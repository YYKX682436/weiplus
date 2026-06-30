package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class a4 implements com.tencent.mm.plugin.multitalk.ilinkservice.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.i4 f149509a;

    public a4(com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var) {
        this.f149509a = i4Var;
    }

    @Override // com.tencent.mm.plugin.multitalk.ilinkservice.e0
    public java.lang.Object a(int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = this.f149509a;
        i4Var.w();
        i4Var.s(null, -10086, -6, "join room talk callback failed: " + i17);
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
