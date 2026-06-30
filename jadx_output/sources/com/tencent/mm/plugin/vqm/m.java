package com.tencent.mm.plugin.vqm;

/* loaded from: classes6.dex */
public enum m implements com.tencent.mm.protobuf.h {
    VQMProfileInfoCommonKernalNull(0),
    VQMProfileInfoCommonKernalNormal(10000),
    VQMProfileInfoCommonKernalIlink(10001);


    /* renamed from: d, reason: collision with root package name */
    public final int f177399d;

    m(int i17) {
        this.f177399d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f177399d;
    }
}
