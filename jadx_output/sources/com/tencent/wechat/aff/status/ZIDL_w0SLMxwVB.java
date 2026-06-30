package com.tencent.wechat.aff.status;

/* loaded from: classes10.dex */
class ZIDL_w0SLMxwVB extends com.tencent.wechat.zidl2.ZidlBaseBridge {
    private com.tencent.wechat.aff.status.StatusInitManagerBase stub;

    public byte[] ZIDL_A() {
        return this.stub.getInitRootPath().getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public byte[] ZIDL_B() {
        return this.stub.getInitMediaPath().getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        this.stub = (com.tencent.wechat.aff.status.StatusInitManagerBase) obj;
    }
}
