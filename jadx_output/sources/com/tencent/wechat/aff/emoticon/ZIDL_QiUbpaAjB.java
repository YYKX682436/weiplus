package com.tencent.wechat.aff.emoticon;

/* loaded from: classes8.dex */
class ZIDL_QiUbpaAjB extends com.tencent.wechat.zidl2.ZidlBaseBridge {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.emoticon.a f216632a;

    public boolean ZIDL_A(byte[] bArr, byte[] bArr2) {
        com.tencent.wechat.aff.emoticon.a aVar = this.f216632a;
        bw5.b0 b0Var = (bw5.b0) com.tencent.wechat.zidl2.ZidlUtil.mmpbUnSerialize(bw5.b0.f25468f, bArr);
        java.lang.String str = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        ((com.tencent.mm.feature.emoji.b) aVar).getClass();
        com.tencent.mm.vfs.w6.u(str);
        return com.tencent.mm.vfs.w6.R(str, fp.i0.a(b0Var)) != 0;
    }

    public byte[] ZIDL_B(byte[] bArr) {
        java.lang.String M;
        com.tencent.wechat.aff.emoticon.a aVar = this.f216632a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((com.tencent.mm.feature.emoji.b) aVar).getClass();
        bw5.b0 b0Var = new bw5.b0();
        try {
            if (com.tencent.mm.vfs.w6.j(str) && (M = com.tencent.mm.vfs.w6.M(str)) != null) {
                java.nio.charset.Charset charset = r26.c.f368865a;
                byte[] bytes = M.getBytes(charset);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                b0Var.parseFrom(bytes);
                byte[] bytes2 = M.getBytes(charset);
                kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
                b0Var.f25470e = bytes2.length;
            }
        } catch (java.lang.Exception e17) {
            java.lang.System.out.println((java.lang.Object) ("read file fail: " + e17.getMessage()));
        }
        return b0Var.toByteArrayOrNull();
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        this.f216632a = (com.tencent.wechat.aff.emoticon.a) obj;
    }
}
