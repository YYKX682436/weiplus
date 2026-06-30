package com.tencent.tav.core.audio;

/* loaded from: classes16.dex */
public interface IAudioExportTask {
    void cancel();

    void setExportCallback(com.tencent.tav.core.audio.ExportCallback exportCallback);

    void start();
}
