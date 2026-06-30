package com.tencent.mm.plugin.vqm;

/* loaded from: classes6.dex */
public enum u implements com.tencent.mm.protobuf.h {
    VQMProfileInfoNotificationAlertStyleNull(0),
    VQMProfileInfoNotificationAlertStyleNone(10000),
    VQMProfileInfoNotificationAlertStyleBanner(10001),
    VQMProfileInfoNotificationAlertStyleAlert(10002);


    /* renamed from: d, reason: collision with root package name */
    public final int f177495d;

    u(int i17) {
        this.f177495d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f177495d;
    }
}
