package com.tencent.tav.core.audio;

/* loaded from: classes16.dex */
public interface ExportCallback {
    public static final int STATUS_CANCEL = 4;
    public static final int STATUS_ERROR = 255;
    public static final int STATUS_EXPORTING = 1;
    public static final int STATUS_FINISH = 2;
    public static final int STATUS_IDEL = 0;

    void onProgress(int i17, float f17);
}
