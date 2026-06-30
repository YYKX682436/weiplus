package com.tencent.qqmusic.mediaplayer.codec.ffmpeg;

/* loaded from: classes13.dex */
public class FfmpegRecognition implements com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition {
    private static final java.lang.String SO_AUDIO_COMMON = "audio_common";
    private static final java.lang.String SO_BASE_NAME = "FFmpeg";
    private static final java.lang.String SO_NAME = "ffmpeg_decoder";
    private static final java.lang.String SO_NEON_BASE_NAME = "FFmpeg_v7a";
    private static final java.lang.String SO_NEON_NAME = "ffmpeg_decoder_v7a";
    private static final java.lang.String TAG = "FfmpegRecognition";

    public static boolean isM4a(com.tencent.qqmusic.mediaplayer.upstream.IDataSource iDataSource) {
        byte[] bArr = new byte[4];
        try {
            iDataSource.readAt(4L, bArr, 0, 4);
        } catch (java.io.IOException unused) {
        }
        return bArr[0] == 102 && bArr[1] == 116 && bArr[2] == 121 && bArr[3] == 112;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType getAudioType(java.lang.String r5, byte[] r6) {
        /*
            r4 = this;
            java.lang.String r0 = "FfmpegRecognition"
            if (r6 == 0) goto Le
            int r1 = r6.length
            if (r1 != 0) goto L8
            goto Le
        L8:
            java.lang.String r5 = new java.lang.String
            r5.<init>(r6)
            goto L41
        Le:
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            r5 = 64
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            r2.read(r5)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2d
            r2.close()     // Catch: java.lang.Exception -> L24
            goto L28
        L24:
            r5 = move-exception
            com.tencent.qqmusic.mediaplayer.util.Logger.e(r0, r5)
        L28:
            r5 = r3
            goto L41
        L2a:
            r5 = move-exception
            r1 = r2
            goto L6f
        L2d:
            r5 = move-exception
            goto L33
        L2f:
            r5 = move-exception
            goto L6f
        L31:
            r5 = move-exception
            r2 = r1
        L33:
            com.tencent.qqmusic.mediaplayer.util.Logger.e(r0, r5)     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L40
            r2.close()     // Catch: java.lang.Exception -> L3c
            goto L40
        L3c:
            r5 = move-exception
            com.tencent.qqmusic.mediaplayer.util.Logger.e(r0, r5)
        L40:
            r5 = r1
        L41:
            if (r5 == 0) goto L4e
            java.lang.String r0 = "ftyp"
            boolean r5 = r5.contains(r0)
            if (r5 == 0) goto L4e
            com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType r5 = com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.M4A
            return r5
        L4e:
            if (r6 == 0) goto L6c
            int r5 = r6.length
            r0 = 2
            if (r5 <= r0) goto L6c
            r5 = 0
            r5 = r6[r5]
            r0 = -1
            if (r5 != r0) goto L6c
            r5 = 1
            r5 = r6[r5]
            r6 = r5 & 240(0xf0, float:3.36E-43)
            r0 = 240(0xf0, float:3.36E-43)
            if (r6 != r0) goto L6c
            r5 = r5 & 15
            r5 = r5 & 6
            if (r5 != 0) goto L6c
            com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType r5 = com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.M4A
            return r5
        L6c:
            com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType r5 = com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT
            return r5
        L6f:
            if (r1 == 0) goto L79
            r1.close()     // Catch: java.lang.Exception -> L75
            goto L79
        L75:
            r6 = move-exception
            com.tencent.qqmusic.mediaplayer.util.Logger.e(r0, r6)
        L79:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.codec.ffmpeg.FfmpegRecognition.getAudioType(java.lang.String, byte[]):com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType");
    }

    @Override // com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition
    public com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType guessAudioType(java.lang.String str) {
        return getAudioType(str, null);
    }
}
