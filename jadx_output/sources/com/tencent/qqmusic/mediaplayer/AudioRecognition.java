package com.tencent.qqmusic.mediaplayer;

/* loaded from: classes13.dex */
public class AudioRecognition {
    private static final int READ_FILE_HEADER_SIZE = 64;
    private static java.lang.String TAG = "AudioRecognition";
    private static java.util.HashMap<java.lang.String, com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType> mRecognitionResultCache = new java.util.HashMap<>();
    private static java.util.HashMap<java.lang.String, com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType> mGuessFormatResultCache = new java.util.HashMap<>();

    public static int calcBitDept(long j17, long j18, int i17, long j19) {
        if (0 == j18 || i17 == 0) {
            return 0;
        }
        double d17 = (((float) j17) * 1000.0f) / ((float) ((i17 * j18) * j19));
        int round = (int) java.lang.Math.round(d17);
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "byteNumbers = " + j17 + ",time = " + j18 + ",channels = " + i17 + ",sampleRate = " + j19 + ",bitDept = " + d17);
        return round;
    }

    public static int getAudioBitDept(com.tencent.qqmusic.mediaplayer.codec.BaseDecoder baseDecoder, com.tencent.qqmusic.mediaplayer.AudioInformation audioInformation) {
        int i17 = 0;
        boolean z17 = audioInformation.getAudioType() == com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.FLAC;
        if (z17) {
            try {
                i17 = (int) baseDecoder.getMinBufferSize();
            } catch (java.lang.Throwable th6) {
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, th6);
            }
        }
        int minBufferSize = android.media.AudioTrack.getMinBufferSize((int) audioInformation.getSampleRate(), audioInformation.getChannels(), 2);
        if (!z17) {
            if (minBufferSize % 2048 != 0) {
                minBufferSize = ((minBufferSize / 2048) + 1) * 2048;
            }
            i17 = minBufferSize;
        }
        int decodeData = baseDecoder.decodeData(i17, new byte[i17]);
        if (decodeData <= 0) {
            decodeData = i17 * 2;
        }
        return calcBitDept(decodeData, baseDecoder.getCurrentTime(), audioInformation.getChannels(), audioInformation.getSampleRate());
    }

    public static com.tencent.qqmusic.mediaplayer.codec.NativeDecoder getDecoderFormFile(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        com.tencent.qqmusic.mediaplayer.codec.NativeDecoder nativeDecoder = new com.tencent.qqmusic.mediaplayer.codec.NativeDecoder();
        if (nativeDecoder.init(str, false) == 0) {
            return nativeDecoder;
        }
        return null;
    }

    public static com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType guessFormat(java.lang.String str) {
        java.util.HashMap<java.lang.String, com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType> hashMap = mGuessFormatResultCache;
        if (hashMap != null && hashMap.containsKey(str)) {
            return mGuessFormatResultCache.get(str);
        }
        java.util.Iterator<com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType> it = com.tencent.qqmusic.mediaplayer.MediaCodecFactory.getSupportAudioType().iterator();
        while (it.hasNext()) {
            com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition createDecoderByType = com.tencent.qqmusic.mediaplayer.MediaCodecFactory.createDecoderByType(it.next());
            if (createDecoderByType != null) {
                com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType guessAudioType = createDecoderByType.guessAudioType(str);
                if (com.tencent.qqmusic.mediaplayer.AudioFormat.isAudioType(guessAudioType)) {
                    mGuessFormatResultCache.put(str, guessAudioType);
                    return guessAudioType;
                }
            }
        }
        return com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.UNSUPPORT;
    }

    public static com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType recognitionAudioFormatByExtensions(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        if (mRecognitionResultCache.containsKey(str)) {
            com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType audioType = mRecognitionResultCache.get(str);
            com.tencent.qqmusic.mediaplayer.util.Logger.w(TAG, "Get from cache " + audioType + ",filepath = " + str + ",retType = " + audioType);
            return audioType;
        }
        com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType guessFormat = guessFormat(str);
        if (!com.tencent.qqmusic.mediaplayer.AudioFormat.isAudioType(guessFormat)) {
            com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "recognitionAudioFormatByExtensions guessAudioType = null,so recognitionAudioFormatExactly filepath = " + str);
            try {
                guessFormat = recognitionAudioFormatExactly(str);
            } catch (java.io.IOException e17) {
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, e17);
            }
        }
        com.tencent.qqmusic.mediaplayer.util.Logger.i(TAG, "recognitionAudioFormatByExtensions filepath = " + str + ",guessAudioType = " + guessFormat);
        return guessFormat;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013f A[EDGE_INSN: B:50:0x013f->B:18:0x013f BREAK  A[LOOP:0: B:34:0x00d5->B:45:0x00d5], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType recognitionAudioFormatExactly(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.qqmusic.mediaplayer.AudioRecognition.recognitionAudioFormatExactly(java.lang.String):com.tencent.qqmusic.mediaplayer.AudioFormat$AudioType");
    }
}
