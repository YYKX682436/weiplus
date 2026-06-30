package com.tencent.wechat.aff.ext_device;

/* loaded from: classes15.dex */
public enum a implements com.tencent.mm.protobuf.h {
    ExtDeviceHandoff_Undefined(0),
    ExtDeviceHandoff_View(1),
    ExtDeviceHandoff_Open(2),
    ExtDeviceHandoff_Float_Window(3),
    ExtDeviceHandoff_Download(4),
    /* JADX INFO: Fake field, exist only in values array */
    ExtDeviceHandoff_Transfer(5);


    /* renamed from: d, reason: collision with root package name */
    public final int f216695d;

    a(int i17) {
        this.f216695d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f216695d;
    }
}
