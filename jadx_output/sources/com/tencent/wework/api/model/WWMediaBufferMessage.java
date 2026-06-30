package com.tencent.wework.api.model;

/* loaded from: classes9.dex */
public class WWMediaBufferMessage extends com.tencent.wework.api.model.WWMediaMessage {

    /* renamed from: f, reason: collision with root package name */
    public byte[] f220147f = null;

    @Override // com.tencent.wework.api.model.WWMediaMessage, com.tencent.wework.api.model.BaseMessage
    public boolean b() {
        byte[] bArr;
        return (!super.b() || (bArr = this.f220147f) == null || bArr.length == 0) ? false : true;
    }

    @Override // com.tencent.wework.api.model.WWMediaMessage, com.tencent.wework.api.model.BaseMessage
    public void f(android.os.Bundle bundle) {
        bundle.putByteArray("_wwmergedconvobject_buffer", this.f220147f);
        super.f(bundle);
    }
}
