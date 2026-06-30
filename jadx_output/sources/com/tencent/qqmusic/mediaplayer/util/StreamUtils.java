package com.tencent.qqmusic.mediaplayer.util;

/* loaded from: classes13.dex */
public class StreamUtils {
    public static long skipForBufferStream(java.io.InputStream inputStream, long j17) {
        if (inputStream == null || j17 <= 0) {
            return 0L;
        }
        long j18 = j17;
        long j19 = 0;
        do {
            j18 -= j19;
            j19 = inputStream.skip(j18);
            if (j19 <= 0) {
                break;
            }
        } while (j19 < j18);
        return j19 > 0 ? j17 : j17 - j18;
    }
}
