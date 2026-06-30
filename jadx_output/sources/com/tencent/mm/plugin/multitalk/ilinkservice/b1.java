package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class b1 implements com.tencent.mm.plugin.multitalk.ilinkservice.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.i4 f149510a;

    public b1(com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var) {
        this.f149510a = i4Var;
    }

    @Override // com.tencent.mm.plugin.multitalk.ilinkservice.e0
    public java.lang.Object a(int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = this.f149510a;
        java.util.Map map = i4Var.f149634l2;
        if (map != null && ((java.util.concurrent.ConcurrentHashMap) map).size() > 0) {
            ((java.util.concurrent.ConcurrentHashMap) i4Var.f149634l2).clear();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "recv notify fail");
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
