package com.tencent.qqmusic.mediaplayer;

/* loaded from: classes13.dex */
public class MediaCodecFactory {
    private static final java.lang.String TAG = "MediaCodecFactory";
    private static java.util.HashMap<com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType, java.lang.Class<? extends com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition>> mDecoderMap = new java.util.HashMap<>();
    private static java.util.ArrayList<com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType> mSupportAudioType = new java.util.ArrayList<>();

    static {
        registerDecoder(com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.M4A, com.tencent.qqmusic.mediaplayer.codec.ffmpeg.FfmpegRecognition.class);
        registerDecoder(com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.OGG, com.tencent.qqmusic.mediaplayer.codec.ogg.VorbisRecognition.class);
        registerDecoder(com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.FLAC, com.tencent.qqmusic.mediaplayer.codec.flac.FLACRecognition.class);
        registerDecoder(com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.MP3, com.tencent.qqmusic.mediaplayer.codec.mp3.MP3Recognition.class);
        registerDecoder(com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.APE, com.tencent.qqmusic.mediaplayer.codec.ape.ApeRecognition.class);
        registerDecoder(com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.WAV, com.tencent.qqmusic.mediaplayer.codec.wav.WavRecognition.class);
        registerDecoder(com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.WMA, com.tencent.qqmusic.mediaplayer.codec.wma.WmaRecognition.class);
        registerDecoder(com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.MP4, com.tencent.qqmusic.mediaplayer.codec.ffmpeg.FfmpegRecognition.class);
        registerDecoder(com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.AAC, com.tencent.qqmusic.mediaplayer.codec.ffmpeg.FfmpegRecognition.class);
    }

    public static com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition createDecoderByType(com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType audioType) {
        if (!com.tencent.qqmusic.mediaplayer.AudioFormat.isAudioType(audioType) || !mDecoderMap.containsKey(audioType)) {
            return null;
        }
        try {
            return mDecoderMap.get(audioType).newInstance();
        } catch (java.lang.Throwable th6) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "createDecoderByType error", th6);
            return null;
        }
    }

    public static java.util.ArrayList<com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType> getSupportAudioType() {
        return new java.util.ArrayList<>(mSupportAudioType);
    }

    private static void registerDecoder(com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType audioType, java.lang.Class<? extends com.tencent.qqmusic.mediaplayer.codec.IAudioRecognition> cls) {
        mDecoderMap.put(audioType, cls);
        mSupportAudioType.add(audioType);
    }

    public static void unRegisterDecoder(com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType audioType) {
        mSupportAudioType.remove(audioType);
        mDecoderMap.remove(audioType);
    }
}
