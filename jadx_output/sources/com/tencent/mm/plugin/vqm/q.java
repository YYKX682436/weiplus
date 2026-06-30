package com.tencent.mm.plugin.vqm;

/* loaded from: classes6.dex */
public enum q implements com.tencent.mm.protobuf.h {
    VQMProfileInfoMatrixBatteryStateNull(0),
    VQMProfileInfoMatrixBatteryStateUnplugged(10001),
    VQMProfileInfoMatrixBatteryStateCharging(10002),
    VQMProfileInfoMatrixBatteryStateFull(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL);


    /* renamed from: d, reason: collision with root package name */
    public final int f177449d;

    q(int i17) {
        this.f177449d = i17;
    }

    public static com.tencent.mm.plugin.vqm.q a(int i17) {
        if (i17 == 0) {
            return VQMProfileInfoMatrixBatteryStateNull;
        }
        switch (i17) {
            case 10001:
                return VQMProfileInfoMatrixBatteryStateUnplugged;
            case 10002:
                return VQMProfileInfoMatrixBatteryStateCharging;
            case com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL /* 10003 */:
                return VQMProfileInfoMatrixBatteryStateFull;
            default:
                return null;
        }
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f177449d;
    }
}
