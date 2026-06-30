package com.tencent.qqmusic.mediaplayer.utils;

/* loaded from: classes13.dex */
public class AudioUtil {
    private static final int DEFAULT_DECODE_BUFFER_SIZE = 8192;
    private static final java.lang.String TAG = "AudioUtil";

    public static int getDecodeBufferSize(com.tencent.qqmusic.mediaplayer.codec.NativeDecoder nativeDecoder) {
        com.tencent.qqmusic.mediaplayer.AudioInformation audioInformation = nativeDecoder.getAudioInformation();
        int minBufferSize = (audioInformation == null || audioInformation.getAudioType() != com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.FLAC) ? 0 : (int) nativeDecoder.getMinBufferSize();
        if (minBufferSize <= 0) {
            return 8192;
        }
        return minBufferSize;
    }

    public static int getDecodeBufferSizeForPlay(com.tencent.qqmusic.mediaplayer.codec.NativeDecoder nativeDecoder) {
        int i17;
        int decodeBufferSize = getDecodeBufferSize(nativeDecoder);
        com.tencent.qqmusic.mediaplayer.AudioInformation audioInformation = nativeDecoder.getAudioInformation();
        if (audioInformation == null || audioInformation.getAudioType() == com.tencent.qqmusic.mediaplayer.AudioFormat.AudioType.FLAC) {
            return decodeBufferSize;
        }
        int channels = audioInformation.getChannels();
        if (channels == 1) {
            i17 = 4;
        } else {
            if (channels != 2) {
                if (channels == 6) {
                    i17 = 252;
                } else if (channels == 8) {
                    i17 = com.tencent.rtmp.TXLiveConstants.PUSH_EVT_ROOM_USERLIST;
                }
            }
            i17 = 12;
        }
        return java.lang.Math.max(android.media.AudioTrack.getMinBufferSize((int) audioInformation.getSampleRate(), i17, audioInformation.getBitDepth() == 1 ? 3 : 2), decodeBufferSize);
    }

    public static com.tencent.qqmusic.mediaplayer.codec.NativeDecoder getDecoder(java.lang.String str, boolean z17, long j17, long j18) {
        return z17 ? getDecoderFromTrack(str, j17, j18) : com.tencent.qqmusic.mediaplayer.AudioRecognition.getDecoderFormFile(str);
    }

    public static com.tencent.qqmusic.mediaplayer.codec.NativeDecoder getDecoderFromTrack(java.lang.String str, long j17, long j18) {
        if (android.text.TextUtils.isEmpty(str) || j17 >= j18) {
            return null;
        }
        com.tencent.qqmusic.mediaplayer.codec.NativeDecoder nativeDecoder = new com.tencent.qqmusic.mediaplayer.codec.NativeDecoder();
        com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo trackInfo = new com.tencent.qqmusic.mediaplayer.audioplaylist.TrackInfo(com.tencent.qqmusic.mediaplayer.audioplaylist.AudioPlayListItemInfo.TYPE_CUE);
        trackInfo.setFilePath(str);
        trackInfo.setStartPosition(j17);
        trackInfo.setEndPostion(j18);
        try {
            com.tencent.qqmusic.mediaplayer.upstream.TrackDataSource trackDataSource = new com.tencent.qqmusic.mediaplayer.upstream.TrackDataSource(trackInfo);
            if (nativeDecoder.init(trackDataSource) != 0) {
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "init decoder from track failed!");
                return null;
            }
            long seek = new com.tencent.qqmusic.mediaplayer.seektable.NativeSeekTable(nativeDecoder).seek(j18);
            if (seek <= 0) {
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "endPos from track <= 0");
                return null;
            }
            trackDataSource.setEndBytePosition(seek);
            nativeDecoder.seekTo((int) j17);
            return nativeDecoder;
        } catch (java.lang.Exception e17) {
            com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, e17);
            return null;
        }
    }

    public static int getPlaybackHeadPositionSafely(android.media.AudioTrack audioTrack) {
        if (audioTrack != null) {
            try {
                return audioTrack.getPlaybackHeadPosition();
            } catch (java.lang.Exception e17) {
                com.tencent.qqmusic.mediaplayer.util.Logger.e(TAG, "getPlaybackHeadPositionSafely", e17);
            }
        }
        return 0;
    }
}
