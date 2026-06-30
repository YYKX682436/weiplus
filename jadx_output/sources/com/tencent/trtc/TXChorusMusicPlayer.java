package com.tencent.trtc;

/* loaded from: classes10.dex */
public abstract class TXChorusMusicPlayer {

    /* loaded from: classes10.dex */
    public interface ITXChorusPlayerListener {
        void onChorusError(com.tencent.trtc.TXChorusMusicPlayer.TXChorusError tXChorusError, java.lang.String str);

        void onChorusMusicLoadProgress(java.lang.String str, float f17);

        void onChorusMusicLoadSucceed(java.lang.String str, java.util.List<com.tencent.trtc.TXChorusMusicPlayer.TXLyricLine> list, java.util.List<com.tencent.trtc.TXChorusMusicPlayer.TXReferencePitch> list2);

        void onChorusPaused();

        void onChorusRequireLoadMusic(java.lang.String str);

        void onChorusResumed();

        void onChorusStarted();

        void onChorusStopped();

        void onMusicProgressUpdated(long j17, long j18);

        void onNetworkQualityUpdated(int i17, int i18, int i19);

        void onVoicePitchUpdated(int i17, boolean z17, long j17);

        void onVoiceScoreUpdated(int i17, int i18, int i19);

        void shouldDecryptAudioData(java.nio.ByteBuffer byteBuffer);
    }

    /* loaded from: classes10.dex */
    public static class TXChorusCopyrightedMusicParams {
        public java.lang.String musicId = null;
        public java.lang.String playToken = null;
        public java.lang.String copyrightedLicenseKey = null;
        public java.lang.String copyrightedLicenseUrl = null;
    }

    /* loaded from: classes10.dex */
    public enum TXChorusError {
        TXChorusErrorInvalidParameters,
        TXChorusErrorTrtcCloudNotFound,
        TXChorusErrorRestrictedToLeadSinger,
        TXChorusErrorMusicPreloadRequired,
        TXChorusErrorMusicLoadFailed,
        TXChorusErrorMusicDecodeFailed,
        TXChorusErrorEnterRoomFailed,
        TXChorusErrorRoomDisconnected,
        TXChorusErrorTrtcError
    }

    /* loaded from: classes10.dex */
    public static class TXChorusExternalMusicParams {
        public java.lang.String musicId = null;
        public java.lang.String musicUrl = null;
        public java.lang.String accompanyUrl = null;
        public boolean isEncrypted = false;
        public int encryptBlockLength = 0;
    }

    /* loaded from: classes10.dex */
    public static class TXChorusLyricCharacter {
        public long startTimeMs = 0;
        public long durationMs = 0;
        public java.lang.String utf8Character = null;
    }

    /* loaded from: classes10.dex */
    public enum TXChorusMusicTrack {
        TXChorusAccompaniment,
        TXChorusOriginalSong
    }

    /* loaded from: classes10.dex */
    public enum TXChorusRole {
        TXChorusRoleLeadSinger,
        TXChorusRoleBackSinger,
        TXChorusRoleAnchor,
        TXChorusRoleAudience
    }

    /* loaded from: classes10.dex */
    public static class TXLyricLine {
        public long startTimeMs = 0;
        public long durationMs = 0;
        public java.util.List<com.tencent.trtc.TXChorusMusicPlayer.TXChorusLyricCharacter> characterArray = null;
    }

    /* loaded from: classes10.dex */
    public static class TXReferencePitch {
        public long startTimeMs = 0;
        public long durationMs = 0;
        public int referencePitch = 0;
    }

    public static com.tencent.trtc.TXChorusMusicPlayer create(com.tencent.trtc.TRTCCloud tRTCCloud, java.lang.String str, com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener) {
        return com.tencent.liteav.trtc.TXChorusMusicPlayerImpl.create(tRTCCloud, str, iTXChorusPlayerListener);
    }

    public abstract void callExperimentalAPI(java.lang.String str);

    public abstract void destroy();

    public abstract void loadExternalMusic(com.tencent.trtc.TXChorusMusicPlayer.TXChorusExternalMusicParams tXChorusExternalMusicParams);

    public abstract void loadMusic(com.tencent.trtc.TXChorusMusicPlayer.TXChorusCopyrightedMusicParams tXChorusCopyrightedMusicParams);

    public abstract void pause();

    public abstract void resume();

    public abstract void seek(long j17);

    public abstract void setChorusRole(com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole tXChorusRole, com.tencent.trtc.TRTCCloudDef.TRTCParams tRTCParams);

    public abstract void setListener(com.tencent.trtc.TXChorusMusicPlayer.ITXChorusPlayerListener iTXChorusPlayerListener);

    public abstract void setMusicPitch(float f17);

    public abstract void setPlayoutVolume(int i17);

    public abstract void setPublishVolume(int i17);

    public abstract void start();

    public abstract void stop();

    public abstract void switchMusicTrack(com.tencent.trtc.TXChorusMusicPlayer.TXChorusMusicTrack tXChorusMusicTrack);
}
