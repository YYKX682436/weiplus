package com.tencent.qqmusic.mediaplayer.codec.wma;

/* loaded from: classes13.dex */
public class WmaRecognition implements com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition {
    public static java.lang.String TAG = "WmaRecognition";
    private final int HEARER_LENGTH = 16;
    private final byte[] WMA_HEADER = {48, 38, -78, 117, -114, 102, -49, 17, -90, -39, 0, -86, 0, 98, -50, 108};

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    @Override // com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioType(java.lang.String r5, byte[] r6) {
        /*
            r4 = this;
            r0 = 16
            if (r6 == 0) goto L8
            int r1 = r6.length
            if (r1 < r0) goto L8
            goto L3c
        L8:
            r6 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L28
            byte[] r6 = new byte[r0]     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L21
            r1.read(r6)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L21
            r1.close()     // Catch: java.io.IOException -> L17
            goto L3c
        L17:
            r5 = move-exception
            java.lang.String r1 = com.tencent.qqmusic.mediaplayer.codec.wma.WmaRecognition.TAG
            com.tencent.qqmusic.mediaplayer.util.Logger.e(r1, r5)
            goto L3c
        L1e:
            r5 = move-exception
            r6 = r1
            goto L58
        L21:
            r5 = move-exception
            r3 = r1
            r1 = r6
            r6 = r3
            goto L2a
        L26:
            r5 = move-exception
            goto L58
        L28:
            r5 = move-exception
            r1 = r6
        L2a:
            java.lang.String r2 = com.tencent.qqmusic.mediaplayer.codec.wma.WmaRecognition.TAG     // Catch: java.lang.Throwable -> L26
            com.tencent.qqmusic.mediaplayer.util.Logger.e(r2, r5)     // Catch: java.lang.Throwable -> L26
            if (r6 == 0) goto L3b
            r6.close()     // Catch: java.io.IOException -> L35
            goto L3b
        L35:
            r5 = move-exception
            java.lang.String r6 = com.tencent.qqmusic.mediaplayer.codec.wma.WmaRecognition.TAG
            com.tencent.qqmusic.mediaplayer.util.Logger.e(r6, r5)
        L3b:
            r6 = r1
        L3c:
            if (r6 == 0) goto L55
            int r5 = r6.length
            if (r5 < r0) goto L55
            r5 = 0
        L42:
            if (r5 >= r0) goto L50
            r1 = r6[r5]
            byte[] r2 = r4.WMA_HEADER
            r2 = r2[r5]
            if (r1 == r2) goto L4d
            goto L50
        L4d:
            int r5 = r5 + 1
            goto L42
        L50:
            if (r5 != r0) goto L55
            com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType r5 = com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.WMA
            return r5
        L55:
            com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType r5 = com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT
            return r5
        L58:
            if (r6 == 0) goto L64
            r6.close()     // Catch: java.io.IOException -> L5e
            goto L64
        L5e:
            r6 = move-exception
            java.lang.String r0 = com.tencent.qqmusic.mediaplayer.codec.wma.WmaRecognition.TAG
            com.tencent.qqmusic.mediaplayer.util.Logger.e(r0, r6)
        L64:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.codec.wma.WmaRecognition.getAudioType(java.lang.String, byte[]):com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType");
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition
    public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType guessAudioType(java.lang.String str) {
        return (android.text.TextUtils.isEmpty(str) || !str.toLowerCase().contains(".wma")) ? com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT : com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.WMA;
    }
}
