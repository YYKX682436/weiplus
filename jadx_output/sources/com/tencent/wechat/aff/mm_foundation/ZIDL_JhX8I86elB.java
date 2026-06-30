package com.tencent.wechat.aff.mm_foundation;

/* loaded from: classes.dex */
class ZIDL_JhX8I86elB extends com.tencent.wechat.zidl2.ZidlBaseBridge {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.mm_foundation.e f217393a;

    public void ZIDL_A(long j17, byte[] bArr) {
        kotlinx.coroutines.l.d(((e50.a0) this.f217393a).f249474a, null, null, new e50.z(j17, new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8), null), 3, null);
    }

    public void ZIDL_B(long j17, long j18, long j19) {
        kotlinx.coroutines.l.d(((e50.a0) this.f217393a).f249474a, null, null, new e50.y(j17, j18, j19, null), 3, null);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        this.f217393a = (com.tencent.wechat.aff.mm_foundation.e) obj;
    }
}
