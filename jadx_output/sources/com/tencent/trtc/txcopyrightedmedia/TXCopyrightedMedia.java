package com.tencent.trtc.txcopyrightedmedia;

/* loaded from: classes16.dex */
public abstract class TXCopyrightedMedia {
    public static com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMediaImpl impl = new com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMediaImpl();

    /* loaded from: classes16.dex */
    public interface ITXMusicPreloadCallback {
        void onPreloadComplete(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3);

        void onPreloadProgress(java.lang.String str, java.lang.String str2, float f17);

        void onPreloadStart(java.lang.String str, java.lang.String str2);
    }

    /* loaded from: classes16.dex */
    public interface ITXSongScore {
        int calculateTotalScore();

        void destroy();

        void finish();

        com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.TXSongScoreNoteItem[] getAllGrove();

        void prepare();

        void process(byte[] bArr, int i17, float f17);

        void setKeyShift(int i17);

        void setSongScoreCallback(com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScoreCallback iTXSongScoreCallback);
    }

    /* loaded from: classes16.dex */
    public interface ITXSongScoreCallback {
        void onMIDIGroveAndHint(java.lang.String str, boolean z17, float f17, float f18, int i17);

        void onMIDISCoreUpdate(java.lang.String str, int i17, int i18, int i19);

        void onMIDIScoreError(java.lang.String str, int i17, java.lang.String str2);

        void onMIDIScoreFinish(java.lang.String str, int[] iArr, int i17);

        void onMIDIScorePrepared(java.lang.String str);
    }

    /* loaded from: classes6.dex */
    public static class TXCopyrightedError {
        public static int ERR_ACCOMPANIMENT_NOT_EXIST = -7;
        public static int ERR_CANCEL = -1;
        public static int ERR_INNER_ERROR = -4;
        public static int ERR_LICENSE_FAILED = -5;
        public static int ERR_LYRIC_NOT_EXIST = -9;
        public static int ERR_MIDI_NOT_EXIST = -10;
        public static int ERR_MUSIC_IS_DOWNLOADING = -6;
        public static int ERR_NET_FAILED = -3;
        public static int ERR_NONE = 0;
        public static int ERR_NOT_PREPARE = -12;
        public static int ERR_ORIGIN_NOT_EXIST = -8;
        public static int ERR_PREPARE_FAILED = -11;
        public static int ERR_TOKEN_OVERDUE = -2;
    }

    /* loaded from: classes16.dex */
    public static class TXSongScoreNoteItem {
        public static final int INVALID_GROVE_VALUE = -1;
        public static final int MAX_GROVE_VALUE = 100;
        public static final int MAX_VOICE_PITCH_VALUE = 90;
        public int duration;
        public int endTime;
        public int noteHeight;
        public int startTime;

        public int getEndTime() {
            return this.startTime + this.duration;
        }

        public boolean isSame(int i17) {
            return java.lang.Math.abs(this.noteHeight - i17) < 11 && this.noteHeight > 0 && i17 > 0;
        }

        public java.lang.String toString() {
            return java.lang.String.format("startTime = %d ; endTime = %d ; duration = %d ; height = %d;", java.lang.Integer.valueOf(this.startTime), java.lang.Integer.valueOf(this.endTime), java.lang.Integer.valueOf(this.duration), java.lang.Integer.valueOf(this.noteHeight));
        }
    }

    public static com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia instance() {
        return impl;
    }

    public abstract void cancelPreloadMusic(java.lang.String str, java.lang.String str2);

    public abstract void clearMusicCache();

    public abstract com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXSongScore createSongScore(java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3, java.lang.String str4);

    public abstract void destroy();

    public abstract java.lang.String genMusicURI(java.lang.String str, int i17, java.lang.String str2);

    public abstract void init();

    public abstract boolean isMusicPreloaded(java.lang.String str, java.lang.String str2);

    public abstract void preloadMusic(java.lang.String str, java.lang.String str2, java.lang.String str3);

    public abstract void setLicense(android.content.Context context, java.lang.String str, java.lang.String str2);

    public abstract void setMusicCacheMaxCount(int i17);

    public abstract void setMusicPreloadCallback(com.tencent.trtc.txcopyrightedmedia.TXCopyrightedMedia.ITXMusicPreloadCallback iTXMusicPreloadCallback);
}
