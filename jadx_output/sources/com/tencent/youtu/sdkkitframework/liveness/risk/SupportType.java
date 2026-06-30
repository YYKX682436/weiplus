package com.tencent.youtu.sdkkitframework.liveness.risk;

/* loaded from: classes14.dex */
public enum SupportType {
    SUCCESS(0),
    GET_CAMERA_PARAM_ERROR(1),
    GET_CAMERA_PARAM_ZOOM_ERROR(2),
    GET_CAMERA_PARAM_EXPOSURE_ERROR(3),
    GET_CAMERA_PARAM_WH_ERROR(4),
    CAMERA_PARAM_TRANSFORM_ERROR(5),
    CAMERA_PARAM_ZOOM_TRANSFORM_ERROR(6),
    CAMERA_PARAM_EXPOSURE_TRANSFORM_ERROR(7),
    CAMERA_PARAM_WH_TRANSFORM_ERROR(8);

    public final int value;

    SupportType(int i17) {
        this.value = i17;
    }
}
