package com.tencent.wechat.aff.mm_foundation;

/* loaded from: classes8.dex */
class ZIDL_JhX8nIbfB extends com.tencent.wechat.zidl2.ZidlBaseBridge {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.mm_foundation.c f217395a;

    public byte[] ZIDL_A(byte[] bArr) {
        f50.a0 a0Var;
        ((e50.x) this.f217395a).getClass();
        java.util.HashMap hashMap = f50.u.f259591a;
        r45.s33 s33Var = new r45.s33();
        if (bArr != null) {
            try {
                s33Var.parseFrom(bArr);
            } catch (java.lang.Exception e17) {
                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
            }
        }
        r45.t33 t33Var = new r45.t33();
        java.lang.String str = s33Var.f385462d;
        if (!(str == null || str.length() == 0) && (a0Var = (f50.a0) f50.u.f259591a.get(s33Var.f385462d)) != null) {
            byte[] g17 = s33Var.f385464f.g();
            java.lang.String str2 = s33Var.f385463e;
            com.tencent.mm.protobuf.f c17 = a0Var.c(g17, str2 != null ? str2 : "");
            if (c17 != null) {
                t33Var.f386092d = new com.tencent.mm.protobuf.g(c17.toByteArray());
            }
        }
        byte[] byteArray = t33Var.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        return byteArray;
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        this.f217395a = (com.tencent.wechat.aff.mm_foundation.c) obj;
    }
}
