package com.tencent.tav.core;

/* loaded from: classes16.dex */
public class CMTimeUtils {
    public static long CMTimeConvertToUs(com.tencent.tav.coremedia.CMTime cMTime) {
        return cMTime.getTimeSeconds() * 1000.0f * 1000.0f;
    }
}
