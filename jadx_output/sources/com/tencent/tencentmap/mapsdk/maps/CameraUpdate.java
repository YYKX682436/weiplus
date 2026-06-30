package com.tencent.tencentmap.mapsdk.maps;

/* loaded from: classes13.dex */
public final class CameraUpdate {
    private final com.tencent.tencentmap.mapsdk.maps.model.CamerParameter camerPara;

    public CameraUpdate(com.tencent.tencentmap.mapsdk.maps.model.CamerParameter camerParameter) {
        this.camerPara = camerParameter;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.CamerParameter getParams() {
        return this.camerPara;
    }

    public final java.lang.String toString() {
        return "CameraUpdate{camerPara=" + this.camerPara + '}';
    }
}
