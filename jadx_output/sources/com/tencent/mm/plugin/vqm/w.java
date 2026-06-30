package com.tencent.mm.plugin.vqm;

/* loaded from: classes6.dex */
public enum w implements com.tencent.mm.protobuf.h {
    VQMProfileInfoNotificationPushTypeNull(0),
    VQMProfileInfoNotificationPushTypeNone(10000),
    VQMProfileInfoNotificationPushTypePushKit(10001),
    VQMProfileInfoNotificationPushTypeAPNS(10002);


    /* renamed from: d, reason: collision with root package name */
    public final int f177509d;

    w(int i17) {
        this.f177509d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f177509d;
    }
}
