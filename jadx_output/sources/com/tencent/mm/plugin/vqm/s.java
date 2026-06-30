package com.tencent.mm.plugin.vqm;

/* loaded from: classes5.dex */
public enum s implements com.tencent.mm.protobuf.h {
    VQMProfileInfoMatrixThermalStateNull(0),
    VQMProfileInfoMatrixThermalStateNominal(10000),
    VQMProfileInfoMatrixThermalStateFair(10001),
    VQMProfileInfoMatrixThermalStateSerious(10002),
    VQMProfileInfoMatrixThermalStateCritical(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL);


    /* renamed from: d, reason: collision with root package name */
    public final int f177477d;

    s(int i17) {
        this.f177477d = i17;
    }

    public static com.tencent.mm.plugin.vqm.s a(int i17) {
        if (i17 == 0) {
            return VQMProfileInfoMatrixThermalStateNull;
        }
        switch (i17) {
            case 10000:
                return VQMProfileInfoMatrixThermalStateNominal;
            case 10001:
                return VQMProfileInfoMatrixThermalStateFair;
            case 10002:
                return VQMProfileInfoMatrixThermalStateSerious;
            case com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL /* 10003 */:
                return VQMProfileInfoMatrixThermalStateCritical;
            default:
                return null;
        }
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f177477d;
    }
}
