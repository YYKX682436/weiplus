package com.tencent.wechat.aff.emoticon;

/* loaded from: classes8.dex */
class ZIDL_QiUbg9_8B extends com.tencent.wechat.zidl2.ZidlBaseBridge {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.emoticon.b f216631a;

    public byte[] ZIDL_A() {
        ((com.tencent.mm.feature.emoji.d) this.f216631a).getClass();
        java.lang.String c17 = com.tencent.mm.vfs.q7.c("emoticon-temp");
        if (c17 == null) {
            c17 = "";
        }
        return c17.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public byte[] ZIDL_B(int i17) {
        ((com.tencent.mm.feature.emoji.d) this.f216631a).getClass();
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    public byte[] ZIDL_C(int i17) {
        ((com.tencent.mm.feature.emoji.d) this.f216631a).getClass();
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    public byte[] ZIDL_D() {
        ((com.tencent.mm.feature.emoji.d) this.f216631a).getClass();
        java.lang.String c17 = com.tencent.mm.vfs.q7.c("emoticon-shared");
        if (c17 == null) {
            c17 = "";
        }
        return c17.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public byte[] ZIDL_E() {
        ((com.tencent.mm.feature.emoji.d) this.f216631a).getClass();
        java.lang.String c17 = com.tencent.mm.vfs.q7.c("emoticon-user-files");
        if (c17 == null) {
            c17 = "";
        }
        return c17.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public byte[] ZIDL_F() {
        ((com.tencent.mm.feature.emoji.d) this.f216631a).getClass();
        java.lang.String c17 = com.tencent.mm.vfs.q7.c("emoticon-user-core");
        if (c17 == null) {
            c17 = "";
        }
        return c17.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public byte[] ZIDL_G(byte[] bArr) {
        com.tencent.wechat.aff.emoticon.b bVar = this.f216631a;
        new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        bVar.getClass();
        return "".getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        this.f216631a = (com.tencent.wechat.aff.emoticon.b) obj;
    }
}
