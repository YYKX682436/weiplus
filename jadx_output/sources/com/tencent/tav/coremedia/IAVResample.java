package com.tencent.tav.coremedia;

/* loaded from: classes16.dex */
public interface IAVResample {
    byte[] resample(java.nio.ByteBuffer byteBuffer, int i17);

    void updateSrcFormat(int i17, int i18);
}
