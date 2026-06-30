package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes15.dex */
public enum z implements com.tencent.mm.protobuf.h {
    Unknown(-1),
    Android_Native(1),
    Android_CrossPlatform(2),
    Ohos_CrossPlatform(3),
    iOS_Native(4),
    iOS_CrossPlatform(5);


    /* renamed from: d, reason: collision with root package name */
    public final int f217201d;

    z(int i17) {
        this.f217201d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f217201d;
    }
}
