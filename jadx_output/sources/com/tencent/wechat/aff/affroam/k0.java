package com.tencent.wechat.aff.affroam;

/* loaded from: classes5.dex */
public enum k0 implements com.tencent.mm.protobuf.h {
    kDefault(0),
    /* JADX INFO: Fake field, exist only in values array */
    kShouldPause(1),
    kShouldDowngrade(2),
    /* JADX INFO: Fake field, exist only in values array */
    kCouldResume(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f215883d;

    k0(int i17) {
        this.f215883d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f215883d;
    }
}
