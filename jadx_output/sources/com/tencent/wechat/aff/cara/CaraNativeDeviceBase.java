package com.tencent.wechat.aff.cara;

/* loaded from: classes15.dex */
public interface CaraNativeDeviceBase {
    float battery();

    com.tencent.wechat.aff.cara.CaraFoundationProto.CaraDeviceBrand brand();

    boolean isCharging();

    boolean isReachable();

    com.tencent.wechat.aff.cara.CaraFoundationProto.CaraNetworkType networkType();

    com.tencent.wechat.aff.cara.CaraFoundationProto.CaraSize screenSize();
}
