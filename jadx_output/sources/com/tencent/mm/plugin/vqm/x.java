package com.tencent.mm.plugin.vqm;

/* loaded from: classes6.dex */
public enum x implements com.tencent.mm.protobuf.h {
    VQMProfileInfoNotificationSettingNull(0),
    VQMProfileInfoNotificationSettingNotSupport(10000),
    VQMProfileInfoNotificationSettingDisabled(10001),
    VQMProfileInfoNotificationSettingEnabled(10002);


    /* renamed from: d, reason: collision with root package name */
    public final int f177515d;

    x(int i17) {
        this.f177515d = i17;
    }

    public static com.tencent.mm.plugin.vqm.x a(int i17) {
        if (i17 == 0) {
            return VQMProfileInfoNotificationSettingNull;
        }
        switch (i17) {
            case 10000:
                return VQMProfileInfoNotificationSettingNotSupport;
            case 10001:
                return VQMProfileInfoNotificationSettingDisabled;
            case 10002:
                return VQMProfileInfoNotificationSettingEnabled;
            default:
                return null;
        }
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f177515d;
    }
}
