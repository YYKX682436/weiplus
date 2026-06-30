package com.tencent.mm.plugin.vqm;

/* loaded from: classes6.dex */
public enum i implements com.tencent.mm.protobuf.h {
    VQMProfileInfoAppStateNull(0),
    VQMProfileInfoAppStateActive(10000),
    VQMProfileInfoAppStateInactive(10001),
    VQMProfileInfoAppStateBackground(10002);


    /* renamed from: d, reason: collision with root package name */
    public final int f177347d;

    i(int i17) {
        this.f177347d = i17;
    }

    public static com.tencent.mm.plugin.vqm.i a(int i17) {
        if (i17 == 0) {
            return VQMProfileInfoAppStateNull;
        }
        switch (i17) {
            case 10000:
                return VQMProfileInfoAppStateActive;
            case 10001:
                return VQMProfileInfoAppStateInactive;
            case 10002:
                return VQMProfileInfoAppStateBackground;
            default:
                return null;
        }
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f177347d;
    }
}
