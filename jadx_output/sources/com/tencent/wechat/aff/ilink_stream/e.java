package com.tencent.wechat.aff.ilink_stream;

/* loaded from: classes12.dex */
public enum e implements com.tencent.mm.protobuf.h {
    kDebugEnvNone(0),
    kDebugEnvShanghai995(1),
    kDebugEnvShenzhen995(2),
    kDebugEnvSG995(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f217265d;

    e(int i17) {
        this.f217265d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f217265d;
    }
}
