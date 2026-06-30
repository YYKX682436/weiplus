package com.tencent.wechat.aff.data_report;

/* loaded from: classes15.dex */
public enum i implements com.tencent.mm.protobuf.h {
    DEFAULT(0),
    PAGE_OUT(1),
    SESSION_OUT(2);


    /* renamed from: d, reason: collision with root package name */
    public final int f216613d;

    i(int i17) {
        this.f216613d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f216613d;
    }
}
