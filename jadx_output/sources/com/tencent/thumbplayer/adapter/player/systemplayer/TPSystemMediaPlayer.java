package com.tencent.thumbplayer.adapter.player.systemplayer;

/* loaded from: classes16.dex */
public class TPSystemMediaPlayer implements com.tencent.thumbplayer.adapter.player.ITPPlayerBase {
    private static final int RESET_TYPE_SEL_AUDIO_TRACK = 2;
    private static final int RESET_TYPE_SWITCH_URL = 1;
    private static final java.lang.String TAG = "TPSystemMediaPlayer";
    private static final int TP_SYSTEM_PLAYER_INNER_RESTORE_STATE_ERR = -10004;
    private static final int TP_SYSTEM_PLAYER_INNER_SEL_TRACK_EXCEPTION = -10000;
    private static final int TP_SYSTEM_PLAYER_INNER_SEL_TRACK_NOT_SUPPORT = -10001;
    private static final int TP_SYSTEM_PLAYER_INNER_TRACK_INDEX_ERR = -10002;
    private static final int TP_SYSTEM_PLAYER_INNER_TRACK_TYPE_NOT_SUPPORT = -10003;
    private static final int mIntervalCheckBuffering = 400;
    private android.content.res.AssetFileDescriptor mAssetFd;
    private com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.BufferCheck mBufferCheck;
    private android.content.Context mContext;
    private com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle mExtSub;
    private java.io.FileDescriptor mFd;
    private java.util.Map<java.lang.String, java.lang.String> mHeader;
    private com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.InnerPlayerListener mInnerPlayerListener;
    private com.tencent.thumbplayer.log.TPBaseLogger mLogger;
    private volatile android.media.MediaPlayer mMediaPlayer;
    private volatile com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState mMediaPlayerState;
    private com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnCompletionListener mOnCompletionListener;
    private com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnErrorListener mOnErrorListener;
    private com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnInfoListener mOnInfoListener;
    private com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnPreparedListener mOnPreparedListener;
    private com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSeekCompleteListener mOnSeekCompleteListener;
    private com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleDataListener mOnSubtitleDataListener;
    private com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleFrameOutListener mOnSubtitleFrameOutListener;
    private com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoSizeChangedListener mOnVideoSizeChangedListener;
    private volatile com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState mState;
    private java.lang.Object mSurfaceObj;
    private com.tencent.thumbplayer.caputure.TPSystemCapture mTpSystemCapture;
    private java.lang.String mUrl;
    private boolean mIsLoopback = false;
    private long mLoopStartPositionMs = 0;
    private long mLoopEndPositionMs = 0;
    private boolean mMute = false;
    private float mAudioGain = 1.0f;
    private float mPlaySpeed = 1.0f;
    private int mStartPositionMs = 0;
    private long mSkipEndPositionMs = -1;
    private boolean mIsLive = false;
    private long mCgiDuration = -1;
    private int mCgiVideoHeight = -1;
    private int mCgiVideoWidth = -1;
    private com.tencent.thumbplayer.api.TPAudioAttributes mAttributes = null;
    private boolean mIsAllowCheckBuffingByPosition = true;
    private java.util.concurrent.Future<?> mCheckPrepareTimeoutTask = null;
    private final java.lang.Object mCheckPrepareTimeoutLock = new java.lang.Object();
    private long mIntervalCheckPreparingTimeOut = 25000;
    private final java.lang.Object mCheckBuffingTimerLock = new java.lang.Object();
    private int mCheckBufferFrequent = 3;
    private int mCheckBufferTimeroutFrequent = 30;
    private final java.lang.Object mCheckBufferTimerOutByInfoLock = new java.lang.Object();
    private java.util.concurrent.Future<?> mCheckBufferTimeOutBySystemInfoTimer = null;
    private boolean mIsNotSeekable = false;
    private boolean mSuspend = false;
    private long mBaseDuration = 0;
    private long mLastCheckPos = -1;
    private int mVideoWidth = 0;
    private int mVideoHeight = 0;
    private volatile boolean mIsBuffering = false;
    private int mcheckBufferPosNoChangeCount = 0;
    private int mSelectSubtitleIndex = -1;
    private int mCurAudioTrackIndex = 0;
    private int mCurSubTrackIndex = -1;
    private int mCurInnerAudioTrackIndex = -1;
    private java.util.List<com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.ExternalTrackInfo> mAudioTrackInfo = new java.util.ArrayList();
    private java.util.List<com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.ExternalTrackInfo> mSubTrackInfo = new java.util.ArrayList();
    private long mPosChangeCount = 0;
    private com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.ResetActionInfo mLastestAction = null;
    private android.media.MediaPlayer.OnTimedTextListener mOnTimedTextListener = new android.media.MediaPlayer.OnTimedTextListener() { // from class: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.8
        @Override // android.media.MediaPlayer.OnTimedTextListener
        public void onTimedText(android.media.MediaPlayer mediaPlayer, android.media.TimedText timedText) {
            if (com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mOnSubtitleDataListener != null) {
                com.tencent.thumbplayer.api.TPSubtitleData tPSubtitleData = new com.tencent.thumbplayer.api.TPSubtitleData();
                tPSubtitleData.subtitleData = timedText != null ? timedText.getText() : "";
                tPSubtitleData.trackIndex = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mSelectSubtitleIndex;
                tPSubtitleData.startPositionMs = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.getCurrentPositionMs();
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mOnSubtitleDataListener.onSubtitleData(tPSubtitleData);
            }
        }
    };

    /* loaded from: classes16.dex */
    public static class BufferCheck {
        boolean mCheckAbort;
        java.util.concurrent.Future<?> mCheckBuffingTimer;

        private BufferCheck() {
        }
    }

    /* loaded from: classes16.dex */
    public static class ExternalTrackInfo {
        public java.util.Map<java.lang.String, java.lang.String> httpHeader;
        public com.tencent.thumbplayer.api.TPTrackInfo info;
        public java.util.List<com.tencent.thumbplayer.api.TPOptionalParam> paramData;
        public java.lang.String url;

        private ExternalTrackInfo() {
            this.url = "";
        }
    }

    /* loaded from: classes13.dex */
    public static class HookCallback implements android.os.Handler.Callback {
        private android.os.Handler impl;

        public HookCallback(android.os.Handler handler) {
            this.impl = handler;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            try {
                this.impl.handleMessage(message);
                return true;
            } catch (java.lang.Exception e17) {
                com.tencent.thumbplayer.utils.TPLogUtil.e(com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.TAG, "mediaPlayerExceptionHook, HookCallback, " + android.util.Log.getStackTraceString(e17));
                return true;
            }
        }
    }

    /* loaded from: classes16.dex */
    public class InnerPlayerListener implements android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnInfoListener, android.media.MediaPlayer.OnSeekCompleteListener, android.media.MediaPlayer.OnVideoSizeChangedListener, android.media.MediaPlayer.OnBufferingUpdateListener {
        private InnerPlayerListener() {
        }

        private int heightToCgiHeight(int i17) {
            return com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mCgiVideoHeight > 0 ? com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mCgiVideoHeight : i17;
        }

        private int widthToCgiWidth(int i17) {
            return com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mCgiVideoWidth > 0 ? com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mCgiVideoWidth : i17;
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(android.media.MediaPlayer mediaPlayer, int i17) {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(android.media.MediaPlayer mediaPlayer) {
            if (com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mIsLive) {
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mLogger.warn("onCompletion, unknown err.");
                return;
            }
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mLogger.info("onCompletion.");
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mMediaPlayerState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.COMPLETE;
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.destroyCheckBuffingTimer();
            com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnCompletionListener iOnCompletionListener = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mOnCompletionListener;
            if (iOnCompletionListener != null) {
                iOnCompletionListener.onCompletion();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
        
            if (r12 == 100) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
        @Override // android.media.MediaPlayer.OnErrorListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean onError(android.media.MediaPlayer r11, int r12, int r13) {
            /*
                r10 = this;
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.access$600(r11)
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r0 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.COMPLETE
                r1 = 1
                if (r11 == r0) goto L97
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.access$600(r11)
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r0 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.STOPPED
                if (r11 == r0) goto L97
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.access$600(r11)
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r0 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.RELEASE
                if (r11 == r0) goto L97
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.access$600(r11)
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r0 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.IDLE
                if (r11 == r0) goto L97
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.access$600(r11)
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r0 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.ERROR
                if (r11 != r0) goto L34
                goto L97
            L34:
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this
                com.tencent.thumbplayer.log.TPBaseLogger r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.access$400(r11)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                java.lang.String r3 = "onError, what: "
                r2.<init>(r3)
                r2.append(r12)
                java.lang.String r3 = ", extra: "
                r2.append(r3)
                r2.append(r13)
                java.lang.String r2 = r2.toString()
                r11.info(r2)
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.access$1100(r11)
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.access$2300(r11)
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.access$602(r11, r0)
                r11 = -1010(0xfffffffffffffc0e, float:NaN)
                r0 = 2000(0x7d0, float:2.803E-42)
                if (r13 == r11) goto L7e
                r11 = -1007(0xfffffffffffffc11, float:NaN)
                if (r13 == r11) goto L7e
                r11 = -110(0xffffffffffffff92, float:NaN)
                r2 = 2001(0x7d1, float:2.804E-42)
                if (r13 == r11) goto L7c
                switch(r13) {
                    case -1005: goto L7c;
                    case -1004: goto L7c;
                    case -1003: goto L7c;
                    default: goto L75;
                }
            L75:
                if (r12 == r1) goto L7e
                r11 = 100
                if (r12 == r11) goto L7c
                goto L7e
            L7c:
                r4 = r2
                goto L7f
            L7e:
                r4 = r0
            L7f:
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.access$1000(r11)
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this
                com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener$IOnErrorListener r3 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.access$1200(r11)
                if (r3 == 0) goto L96
                int r5 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.access$800(r12)
                long r6 = (long) r13
                r8 = 0
                r3.onError(r4, r5, r6, r8)
            L96:
                return r1
            L97:
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this
                com.tencent.thumbplayer.log.TPBaseLogger r11 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.access$400(r11)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = "onError, illegal state:"
                r0.<init>(r2)
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer r2 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer$PlayerState r2 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.access$600(r2)
                r0.append(r2)
                java.lang.String r2 = ", what:"
                r0.append(r2)
                r0.append(r12)
                java.lang.String r12 = ", extra:"
                r0.append(r12)
                r0.append(r13)
                java.lang.String r12 = r0.toString()
                r11.info(r12)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.InnerPlayerListener.onError(android.media.MediaPlayer, int, int):boolean");
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
            int i19;
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mLogger.info("mediaplayer, onInfo. what:" + i17 + ", extra:" + i18);
            if (i17 != 3) {
                if (i17 == 801) {
                    com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mIsNotSeekable = true;
                } else if (i17 == 701) {
                    i19 = 200;
                } else if (i17 == 702) {
                    i19 = 201;
                }
                i19 = -1;
            } else {
                i19 = 106;
            }
            if (i19 != -1) {
                if (200 == i19 || 201 == i19) {
                    if (!com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.isAllowCheckBufferByPosition()) {
                        if (200 == i19) {
                            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mIsBuffering = true;
                            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.startCheckBufferTimeOutByInfo();
                        } else {
                            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mIsBuffering = false;
                            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.destroyCheckBufferTimeOutByInfo();
                        }
                        if (com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mOnInfoListener != null) {
                            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mOnInfoListener.onInfo(i19, 0L, 0L, null);
                        }
                    }
                } else if (com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mOnInfoListener != null) {
                    com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mOnInfoListener.onInfo(i19, 0L, 0L, null);
                }
            }
            if (i19 == 106) {
                int widthToCgiWidth = widthToCgiWidth(mediaPlayer.getVideoWidth());
                int heightToCgiHeight = heightToCgiHeight(mediaPlayer.getVideoHeight());
                if ((heightToCgiHeight != com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mVideoHeight || widthToCgiWidth != com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mVideoWidth) && heightToCgiHeight > 0 && widthToCgiWidth > 0) {
                    com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mVideoHeight = heightToCgiHeight;
                    com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mVideoWidth = widthToCgiWidth;
                    if (com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mOnVideoSizeChangedListener != null) {
                        com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mOnVideoSizeChangedListener.onVideoSizeChanged(com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mVideoWidth, com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mVideoHeight);
                    }
                }
            }
            return true;
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(android.media.MediaPlayer mediaPlayer) {
            if (com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mState != com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PREPARING) {
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mLogger.info("onPrepared() is called in a wrong situation, mState = " + com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mState);
                return;
            }
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mMediaPlayerState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PREPARED;
            long duration = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mMediaPlayer.getDuration();
            if (duration <= 0) {
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mIsNotSeekable = true;
            }
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mLogger.info("onPrepared() , mStartPositionMs=" + com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mStartPositionMs + ", duration:" + duration + ", mIsLive:" + com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mIsLive);
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.destroyCheckPrepareTimeoutTimer();
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.playerResetEnd();
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(android.media.MediaPlayer mediaPlayer) {
            if (com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mMediaPlayer == null) {
                return;
            }
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mLogger.info("onSeekComplete().");
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState playerState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mState;
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState playerState2 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.STARTED;
            if (playerState == playerState2 && com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mMediaPlayerState == com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.COMPLETE) {
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mState = playerState2;
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mMediaPlayerState = playerState2;
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mMediaPlayer.start();
            }
            if (com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PREPARED == com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mState || com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mOnSeekCompleteListener == null) {
                return;
            }
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mOnSeekCompleteListener.onSeekComplete();
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(android.media.MediaPlayer mediaPlayer, int i17, int i18) {
            if (i17 == 0 || i18 == 0) {
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mLogger.error("onVideoSizeChanged() size error, width:" + i17 + " height:" + i18);
                return;
            }
            int widthToCgiWidth = widthToCgiWidth(i17);
            int heightToCgiHeight = heightToCgiHeight(i18);
            try {
                if ((widthToCgiWidth != com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mVideoWidth || heightToCgiHeight != com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mVideoHeight) && heightToCgiHeight > 0 && widthToCgiWidth > 0) {
                    com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mOnVideoSizeChangedListener.onVideoSizeChanged(widthToCgiWidth, heightToCgiHeight);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mLogger.warn(e17.toString());
            }
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mVideoWidth = widthToCgiWidth;
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mVideoHeight = heightToCgiHeight;
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mLogger.info("onVideoSizeChanged(), width:" + widthToCgiWidth + " height:" + heightToCgiHeight);
        }
    }

    /* loaded from: classes16.dex */
    public enum PlayerState {
        IDLE,
        INITIALIZED,
        PREPARING,
        PREPARED,
        STARTED,
        PAUSED,
        STOPPED,
        COMPLETE,
        ERROR,
        RELEASE
    }

    /* loaded from: classes16.dex */
    public static class ResetActionInfo {
        int externalAudioTrackIndex;
        int innerAudioTrackIndex;
        int innerSubtitleTrackIndex;
        int mResetType;
        long opaque;
        long position;
        com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState state;
        java.lang.String url;

        private ResetActionInfo() {
        }
    }

    public TPSystemMediaPlayer(android.content.Context context, com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext) {
        this.mLogger = new com.tencent.thumbplayer.log.TPBaseLogger(tPLoggerContext, TAG);
        this.mContext = context;
        this.mInnerPlayerListener = new com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.InnerPlayerListener();
        com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.ExternalTrackInfo externalTrackInfo = new com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.ExternalTrackInfo();
        com.tencent.thumbplayer.api.TPTrackInfo tPTrackInfo = new com.tencent.thumbplayer.api.TPTrackInfo();
        externalTrackInfo.info = tPTrackInfo;
        tPTrackInfo.isSelected = true;
        tPTrackInfo.name = "audio_1";
        this.mAudioTrackInfo.add(externalTrackInfo);
        initMediaPlayer();
        com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle tPSysPlayerExternalSubtitle = new com.tencent.thumbplayer.adapter.player.systemplayer.TPSysPlayerExternalSubtitle();
        this.mExtSub = tPSysPlayerExternalSubtitle;
        tPSysPlayerExternalSubtitle.setOnSubTitleListener(new com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle.IOnSubTitleListener() { // from class: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.1
            @Override // com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle.IOnSubTitleListener
            public void onEventInfo() {
            }

            @Override // com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle.IOnSubTitleListener
            public void onSubtitleFrameData(com.tencent.thumbplayer.core.common.TPSubtitleFrame tPSubtitleFrame) {
                com.tencent.thumbplayer.api.TPSubtitleFrameBuffer convert2TPSubtitleFrameBuffer = com.tencent.thumbplayer.adapter.player.thumbplayer.TPThumbPlayerUtils.convert2TPSubtitleFrameBuffer(tPSubtitleFrame);
                com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mOnSubtitleFrameOutListener;
                if (iOnSubtitleFrameOutListener != null) {
                    iOnSubtitleFrameOutListener.onSubtitleFrameOut(convert2TPSubtitleFrameBuffer);
                }
            }

            @Override // com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle.IOnSubTitleListener
            public void onSubtitleInfo(com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle.SubtitleData subtitleData) {
                com.tencent.thumbplayer.api.TPSubtitleData tPSubtitleData = new com.tencent.thumbplayer.api.TPSubtitleData();
                tPSubtitleData.subtitleData = subtitleData.text;
                com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleDataListener iOnSubtitleDataListener = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mOnSubtitleDataListener;
                if (iOnSubtitleDataListener != null) {
                    iOnSubtitleDataListener.onSubtitleData(tPSubtitleData);
                }
            }

            @Override // com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle.IOnSubTitleListener
            public void onSubtitleNote(java.lang.String str) {
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mLogger.info("onSubtitleNote, " + str);
                com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnInfoListener iOnInfoListener = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mOnInfoListener;
                if (iOnInfoListener != null) {
                    iOnInfoListener.onInfo(506, 0L, 0L, str);
                }
            }
        });
        this.mExtSub.setPlayerPositionListener(new com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle.IPlayPositionListener() { // from class: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.2
            @Override // com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle.IPlayPositionListener
            public long getCurrentPosition() {
                if (com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mState == com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PAUSED || com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mState == com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.STARTED) {
                    return com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.getCurrentPositionMs();
                }
                return -1L;
            }
        });
        this.mExtSub.setTrackSelectListener(new com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle.IOnTrackSelectListener() { // from class: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.3
            @Override // com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle.IOnTrackSelectListener
            public void onTrackSelectFailure(int i17, long j17) {
                if (com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mOnInfoListener != null) {
                    com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mOnInfoListener.onInfo(4, 2000L, com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.formatErrorCode(i17), java.lang.Long.valueOf(j17));
                }
            }

            @Override // com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle.IOnTrackSelectListener
            public void onTrackSelectSuccess(long j17) {
                if (com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mState == com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.STARTED) {
                    com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mExtSub.startAsync();
                }
                if (com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mOnInfoListener != null) {
                    com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mOnInfoListener.onInfo(4, 1000L, 0L, java.lang.Long.valueOf(j17));
                }
            }
        });
        this.mExtSub.setSubtitleErrorListener(new com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle.IOnSubtitleErrorListener() { // from class: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.4
            @Override // com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle.IOnSubtitleErrorListener
            public void onSubtitleError(int i17, int i18) {
                if (com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mOnInfoListener != null) {
                    com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mOnInfoListener.onInfo(254, i17, i18, null);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkBuffingEvent() {
        long currentPositionMs = getCurrentPositionMs();
        long j17 = this.mLastCheckPos;
        this.mLastCheckPos = currentPositionMs;
        if (this.mState != com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.STARTED) {
            if (this.mState == com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PAUSED && this.mIsBuffering) {
                this.mLogger.info("checkBuffingEvent, pause state and send end buffering");
                this.mIsBuffering = false;
                this.mcheckBufferPosNoChangeCount = 0;
                com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnInfoListener iOnInfoListener = this.mOnInfoListener;
                if (iOnInfoListener != null) {
                    iOnInfoListener.onInfo(201, 0L, 0L, null);
                    return;
                }
                return;
            }
            return;
        }
        if (this.mIsLoopback) {
            long j18 = this.mLoopEndPositionMs;
            if (j18 > 0 && currentPositionMs >= j18 && !this.mIsNotSeekable) {
                this.mLogger.info("checkBuffingEvent, loopback skip end, curPosition:" + currentPositionMs + ", mLoopStartPositionMs:" + this.mLoopStartPositionMs);
                this.mMediaPlayer.seekTo((int) this.mLoopStartPositionMs);
            }
        } else if (this.mSkipEndPositionMs > 0 && currentPositionMs >= getDurationMs() - this.mSkipEndPositionMs) {
            this.mLogger.info("checkBuffingEvent, skip end, mBaseDuration: " + this.mBaseDuration + ", curPosition:" + currentPositionMs + ", mSkipEndMilsec:" + this.mSkipEndPositionMs);
            this.mState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.COMPLETE;
            mediaPlayerStopAndRelease();
            destroyCheckBuffingTimer();
            com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnCompletionListener iOnCompletionListener = this.mOnCompletionListener;
            if (iOnCompletionListener != null) {
                iOnCompletionListener.onCompletion();
                return;
            }
            return;
        }
        if (currentPositionMs != j17) {
            this.mPosChangeCount++;
        }
        if (currentPositionMs != j17 || currentPositionMs <= 0) {
            if (this.mIsBuffering) {
                this.mLogger.info("checkBuffingEvent, position change, send end buffering");
                com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnInfoListener iOnInfoListener2 = this.mOnInfoListener;
                if (iOnInfoListener2 != null) {
                    iOnInfoListener2.onInfo(201, currentPositionMs, this.mBaseDuration, java.lang.Long.valueOf(this.mPosChangeCount));
                }
            }
            this.mIsBuffering = false;
            this.mcheckBufferPosNoChangeCount = 0;
            return;
        }
        int i17 = this.mcheckBufferPosNoChangeCount + 1;
        this.mcheckBufferPosNoChangeCount = i17;
        if (i17 >= this.mCheckBufferFrequent && !this.mIsBuffering) {
            this.mIsBuffering = true;
            this.mLogger.info("checkBuffingEvent, position no change,send start buffering");
            com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnInfoListener iOnInfoListener3 = this.mOnInfoListener;
            if (iOnInfoListener3 != null) {
                iOnInfoListener3.onInfo(200, currentPositionMs, this.mBaseDuration, java.lang.Long.valueOf(this.mPosChangeCount));
            }
        }
        if (this.mcheckBufferPosNoChangeCount >= this.mCheckBufferTimeroutFrequent) {
            this.mLogger.error("checkBuffingEvent post error");
            this.mState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.ERROR;
            mediaPlayerStopAndRelease();
            this.mIsBuffering = false;
            destroyCheckBuffingTimer();
            com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnErrorListener iOnErrorListener = this.mOnErrorListener;
            if (iOnErrorListener != null) {
                iOnErrorListener.onError(2001, formatErrorCode(-110), 0L, 0L);
            }
        }
    }

    private void deselectSubTrack(int i17, long j17) {
        this.mLogger.info("deselectSubTrack, trackIndex:" + i17 + ", opaque:" + j17);
        this.mExtSub.reset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void destroyCheckBufferTimeOutByInfo() {
        synchronized (this.mCheckBufferTimerOutByInfoLock) {
            java.util.concurrent.Future<?> future = this.mCheckBufferTimeOutBySystemInfoTimer;
            if (future != null) {
                future.cancel(true);
                this.mCheckBufferTimeOutBySystemInfoTimer = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void destroyCheckBuffingTimer() {
        synchronized (this.mCheckBuffingTimerLock) {
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.BufferCheck bufferCheck = this.mBufferCheck;
            if (bufferCheck != null) {
                bufferCheck.mCheckAbort = true;
                java.util.concurrent.Future<?> future = bufferCheck.mCheckBuffingTimer;
                if (future != null) {
                    future.cancel(true);
                }
                this.mBufferCheck.mCheckBuffingTimer = null;
                this.mBufferCheck = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void destroyCheckPrepareTimeoutTimer() {
        synchronized (this.mCheckPrepareTimeoutLock) {
            java.util.concurrent.Future<?> future = this.mCheckPrepareTimeoutTask;
            if (future != null) {
                future.cancel(true);
                this.mCheckPrepareTimeoutTask = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int formatErrorCode(int i17) {
        long j17 = i17 < 0 ? 10000000 - i17 : 10000000 + i17;
        if (j17 >= 2147483647L) {
            j17 = 2147483647L;
        }
        return (int) j17;
    }

    private void handleDataSource(int i17) {
        if (i17 <= 0) {
            return;
        }
        com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.ExternalTrackInfo externalTrackInfo = this.mAudioTrackInfo.get(i17);
        com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnInfoListener iOnInfoListener = this.mOnInfoListener;
        if (iOnInfoListener != null) {
            com.tencent.thumbplayer.api.TPPlayerMsg.TPAudioTrackInfo tPAudioTrackInfo = new com.tencent.thumbplayer.api.TPPlayerMsg.TPAudioTrackInfo();
            tPAudioTrackInfo.audioTrackUrl = externalTrackInfo.url;
            tPAudioTrackInfo.paramData = externalTrackInfo.paramData;
            this.mLogger.info("handleDataSource, audioTrack url:" + tPAudioTrackInfo.audioTrackUrl);
            iOnInfoListener.onInfo(1011, 0L, 0L, tPAudioTrackInfo);
        }
    }

    private void handleSetDataSourceWithAfd(android.content.res.AssetFileDescriptor assetFileDescriptor) {
        this.mMediaPlayer.setDataSource(assetFileDescriptor);
    }

    private void initMediaPlayer() {
        this.mMediaPlayer = mediaPlayerCreate();
        com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState playerState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.IDLE;
        this.mState = playerState;
        this.mMediaPlayerState = playerState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isAllowCheckBufferByPosition() {
        if (this.mIsLive) {
            return false;
        }
        return this.mIsAllowCheckBuffingByPosition;
    }

    private boolean isValidRelease(com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState playerState) {
        return playerState != com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.RELEASE;
    }

    private boolean isValidStop(com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState playerState) {
        return playerState == com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PREPARED || playerState == com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.STARTED || playerState == com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PAUSED;
    }

    private android.media.MediaPlayer mediaPlayerCreate() {
        com.tencent.thumbplayer.adapter.player.systemplayer.TPMediaPlayer tPMediaPlayer = new com.tencent.thumbplayer.adapter.player.systemplayer.TPMediaPlayer();
        tPMediaPlayer.setOnPreparedListener(this.mInnerPlayerListener);
        tPMediaPlayer.setOnCompletionListener(this.mInnerPlayerListener);
        tPMediaPlayer.setOnErrorListener(this.mInnerPlayerListener);
        tPMediaPlayer.setOnInfoListener(this.mInnerPlayerListener);
        tPMediaPlayer.setOnBufferingUpdateListener(this.mInnerPlayerListener);
        tPMediaPlayer.setOnSeekCompleteListener(this.mInnerPlayerListener);
        tPMediaPlayer.setOnVideoSizeChangedListener(this.mInnerPlayerListener);
        tPMediaPlayer.setOnTimedTextListener(this.mOnTimedTextListener);
        return tPMediaPlayer;
    }

    private void mediaPlayerExceptionHook(android.media.MediaPlayer mediaPlayer) {
        try {
            java.lang.reflect.Field declaredField = android.media.MediaPlayer.class.getDeclaredField("mEventHandler");
            declaredField.setAccessible(true);
            android.os.Handler handler = (android.os.Handler) declaredField.get(mediaPlayer);
            java.lang.reflect.Field declaredField2 = android.os.Handler.class.getDeclaredField("mCallback");
            declaredField2.setAccessible(true);
            if (((android.os.Handler.Callback) declaredField2.get(handler)) == null) {
                declaredField2.set(handler, new com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.HookCallback(handler));
            }
        } catch (java.lang.Exception e17) {
            this.mLogger.error("mediaPlayerExceptionHook, " + android.util.Log.getStackTraceString(e17));
        }
    }

    private void mediaPlayerRelease() {
        if (isValidRelease(this.mMediaPlayerState)) {
            this.mMediaPlayerState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.RELEASE;
            this.mLogger.info("MediaPlayer release.");
            this.mMediaPlayer.release();
        }
    }

    private void mediaPlayerReset() {
        destroyCheckPrepareTimeoutTimer();
        destroyCheckBuffingTimer();
        destroyCheckBufferTimeOutByInfo();
        mediaPlayerStopAndRelease();
        this.mMediaPlayer = new com.tencent.thumbplayer.adapter.player.systemplayer.TPMediaPlayer();
        this.mMediaPlayer.setOnPreparedListener(this.mInnerPlayerListener);
        this.mMediaPlayer.setOnCompletionListener(this.mInnerPlayerListener);
        this.mMediaPlayer.setOnErrorListener(this.mInnerPlayerListener);
        this.mMediaPlayer.setOnInfoListener(this.mInnerPlayerListener);
        this.mMediaPlayer.setOnBufferingUpdateListener(this.mInnerPlayerListener);
        this.mMediaPlayer.setOnSeekCompleteListener(this.mInnerPlayerListener);
        this.mMediaPlayer.setOnVideoSizeChangedListener(this.mInnerPlayerListener);
        this.mMediaPlayer.setOnTimedTextListener(this.mOnTimedTextListener);
        if (this.mMute) {
            this.mMediaPlayer.setVolume(0.0f, 0.0f);
        } else if (this.mAudioGain != 1.0f) {
            android.media.MediaPlayer mediaPlayer = this.mMediaPlayer;
            float f17 = this.mAudioGain;
            mediaPlayer.setVolume(f17, f17);
        }
        float f18 = this.mPlaySpeed;
        if (f18 != 1.0d) {
            setPlaySpeedRatio(f18);
        }
        if (this.mIsLoopback) {
            this.mMediaPlayer.setLooping(this.mIsLoopback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mediaPlayerStopAndRelease() {
        unRegisterListener();
        mediaPlayerstop();
        mediaPlayerRelease();
    }

    private void mediaPlayerstop() {
        if (isValidStop(this.mMediaPlayerState)) {
            this.mMediaPlayerState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.STOPPED;
            this.mLogger.info("MediaPlayer stop.");
            this.mMediaPlayer.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void playerResetEnd() {
        com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.ResetActionInfo resetActionInfo = this.mLastestAction;
        this.mLogger.info("playerResetEnd, actionInfo:" + resetActionInfo + ", mSuspend:" + this.mSuspend);
        if (resetActionInfo == null || !this.mSuspend) {
            if (this.mStartPositionMs > 0 && !this.mIsNotSeekable) {
                this.mLogger.info("onPrepared(), and seekto:" + this.mStartPositionMs);
                try {
                    this.mMediaPlayer.seekTo(this.mStartPositionMs);
                } catch (java.lang.Exception e17) {
                    this.mLogger.printException(e17);
                }
            }
            this.mState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PREPARED;
            com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnPreparedListener iOnPreparedListener = this.mOnPreparedListener;
            if (iOnPreparedListener != null) {
                iOnPreparedListener.onPrepared();
            }
            return;
        }
        com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnInfoListener iOnInfoListener = this.mOnInfoListener;
        int i17 = resetActionInfo.mResetType == 1 ? 3 : 4;
        if (iOnInfoListener != null) {
            iOnInfoListener.onInfo(i17, 1000L, 0L, java.lang.Long.valueOf(resetActionInfo.opaque));
        }
        if (resetActionInfo.innerAudioTrackIndex > 0) {
            this.mMediaPlayer.selectTrack(resetActionInfo.innerAudioTrackIndex);
        }
        if (resetActionInfo.innerSubtitleTrackIndex > 0) {
            this.mMediaPlayer.selectTrack(resetActionInfo.innerSubtitleTrackIndex);
        }
        if (resetActionInfo.position > 0 && !this.mIsNotSeekable) {
            this.mLogger.info("playerResetEnd, onPrepared(), and seek to:" + resetActionInfo.position);
            try {
                this.mMediaPlayer.seekTo((int) resetActionInfo.position);
            } catch (java.lang.Exception e18) {
                this.mLogger.printException(e18);
            }
        }
        this.mLogger.info("playerResetEnd, restore state:" + resetActionInfo.state);
        com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState playerState = resetActionInfo.state;
        if (playerState != com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.IDLE && playerState != com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.INITIALIZED && playerState != com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PREPARING) {
            if (playerState != com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PREPARED && playerState != com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PAUSED) {
                com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState playerState2 = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.STARTED;
                if (playerState == playerState2) {
                    this.mLogger.info("playerResetEnd,  MediaPlayer.start().");
                    this.mMediaPlayer.start();
                    this.mState = resetActionInfo.state;
                    this.mMediaPlayerState = playerState2;
                    startCheckBufferingTimer();
                } else {
                    this.mLogger.error("illegal state, state:" + resetActionInfo.state);
                    this.mState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.ERROR;
                    mediaPlayerStopAndRelease();
                    com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnErrorListener iOnErrorListener = this.mOnErrorListener;
                    if (iOnErrorListener != null) {
                        iOnErrorListener.onError(2000, formatErrorCode(TP_SYSTEM_PLAYER_INNER_RESTORE_STATE_ERR), 0L, 0L);
                    }
                }
                this.mSuspend = false;
                this.mLastestAction = null;
                return;
            }
            this.mState = playerState;
            this.mSuspend = false;
            this.mLastestAction = null;
            return;
        }
        this.mState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PREPARED;
        com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnPreparedListener iOnPreparedListener2 = this.mOnPreparedListener;
        if (iOnPreparedListener2 != null) {
            iOnPreparedListener2.onPrepared();
        }
        this.mSuspend = false;
        this.mLastestAction = null;
        return;
    }

    private synchronized void playerResetStart(com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.ResetActionInfo resetActionInfo) {
        int i17;
        java.lang.String str = resetActionInfo.url;
        resetActionInfo.position = getCurrentPositionMs();
        resetActionInfo.state = this.mState;
        resetActionInfo.innerAudioTrackIndex = this.mCurInnerAudioTrackIndex;
        resetActionInfo.innerSubtitleTrackIndex = this.mSelectSubtitleIndex;
        this.mLogger.info("playerResetStart, pos:" + resetActionInfo.position + ", state:" + resetActionInfo.state);
        this.mSuspend = true;
        mediaPlayerReset();
        this.mMediaPlayerState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.IDLE;
        if (this.mFd != null) {
            this.mMediaPlayer.setDataSource(this.mFd);
        } else {
            android.content.res.AssetFileDescriptor assetFileDescriptor = this.mAssetFd;
            if (assetFileDescriptor != null) {
                handleSetDataSourceWithAfd(assetFileDescriptor);
            } else {
                handleDataSource(resetActionInfo.externalAudioTrackIndex);
                java.util.Map<java.lang.String, java.lang.String> map = this.mHeader;
                if (map == null || map.isEmpty()) {
                    this.mMediaPlayer.setDataSource(str);
                } else {
                    this.mMediaPlayer.setDataSource(this.mContext, android.net.Uri.parse(str), this.mHeader);
                }
            }
        }
        this.mMediaPlayerState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.INITIALIZED;
        java.lang.Object obj = this.mSurfaceObj;
        if (obj == null) {
            this.mMediaPlayer.setDisplay(null);
        } else if (obj instanceof android.view.SurfaceHolder) {
            this.mMediaPlayer.setDisplay((android.view.SurfaceHolder) this.mSurfaceObj);
        } else if (obj instanceof android.view.Surface) {
            this.mMediaPlayer.setSurface((android.view.Surface) this.mSurfaceObj);
        }
        com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.ResetActionInfo resetActionInfo2 = this.mLastestAction;
        if (resetActionInfo2 != null && (i17 = resetActionInfo2.mResetType) != resetActionInfo.mResetType) {
            com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnInfoListener iOnInfoListener = this.mOnInfoListener;
            int i18 = i17 == 1 ? 3 : 4;
            if (iOnInfoListener != null) {
                iOnInfoListener.onInfo(i18, resetActionInfo2.opaque, 0L, null);
            }
            resetActionInfo.state = resetActionInfo2.state;
            resetActionInfo.position = resetActionInfo2.position;
        }
        this.mLastestAction = resetActionInfo;
        com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState playerState = resetActionInfo.state;
        if (playerState == com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PREPARING || playerState == com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PREPARED || playerState == com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.STARTED || playerState == com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PAUSED) {
            prepareAsync();
        }
    }

    private void seekToComm(android.media.MediaPlayer mediaPlayer, int i17, @com.tencent.thumbplayer.api.TPCommonEnum.TPSeekMode int i18) {
        int i19 = android.os.Build.VERSION.SDK_INT;
        if (i19 < 26) {
            this.mLogger.info("os ver is too low, current sdk int:" + i19 + ", is less than 26, use seekTo(int positionMs) instead");
            mediaPlayer.seekTo(i17);
            return;
        }
        int i27 = 1;
        try {
            if (i18 != 1) {
                if (i18 != 2) {
                    if (i18 == 3) {
                        i27 = 2;
                    }
                }
                mediaPlayer.seekTo(i17, i27);
                return;
            }
            mediaPlayer.seekTo(i17, i27);
            return;
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
            try {
                if (this.mMediaPlayerState == com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.COMPLETE) {
                    this.mState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.STARTED;
                }
                mediaPlayer.seekTo(i17);
                return;
            } catch (java.lang.Exception e18) {
                this.mLogger.printException(e18);
                return;
            }
        }
        i27 = 0;
    }

    private void selectAudioTrack(int i17, long j17) {
        com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.ResetActionInfo resetActionInfo = new com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.ResetActionInfo();
        resetActionInfo.opaque = j17;
        resetActionInfo.externalAudioTrackIndex = i17;
        resetActionInfo.mResetType = 2;
        resetActionInfo.url = this.mUrl;
        playerResetStart(resetActionInfo);
    }

    private void selectSubTrack(int i17, long j17) {
        this.mExtSub.reset();
        com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.ExternalTrackInfo externalTrackInfo = this.mSubTrackInfo.get(i17);
        this.mExtSub.setDataSource(externalTrackInfo.url, externalTrackInfo.httpHeader, j17);
        this.mExtSub.prepare();
    }

    private void setAudioAttributes(com.tencent.thumbplayer.api.TPAudioAttributes tPAudioAttributes) {
        if (tPAudioAttributes == null) {
            return;
        }
        int i17 = android.os.Build.VERSION.SDK_INT;
        this.mMediaPlayer.setAudioAttributes(this.mAttributes.toAndroidMediaAudioAttributes());
        this.mLogger.info("set audio attributes into MediaPlayer, API:" + i17 + ">=21, " + this.mAttributes.toString());
    }

    private void setInitParamsBeforePrepare() {
        setAudioAttributes(this.mAttributes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startCheckBufferTimeOutByInfo() {
        synchronized (this.mCheckBufferTimerOutByInfoLock) {
            if (this.mCheckBufferTimeOutBySystemInfoTimer == null) {
                this.mCheckBufferTimeOutBySystemInfoTimer = com.tencent.thumbplayer.utils.TPThreadPool.getInstance().obtainScheduledExecutorService().schedule(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mState == com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PAUSED || !com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mIsBuffering) {
                            return;
                        }
                        com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mLogger.error("startCheckBufferTimeOutByInfo, buffer last too long");
                        com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.ERROR;
                        com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mediaPlayerStopAndRelease();
                        com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mIsBuffering = false;
                        com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.destroyCheckBufferTimeOutByInfo();
                        com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnErrorListener iOnErrorListener = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mOnErrorListener;
                        if (iOnErrorListener != null) {
                            iOnErrorListener.onError(2001, com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.formatErrorCode(-110), 0L, 0L);
                        }
                    }
                }, this.mCheckBufferTimeroutFrequent * 400, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
        }
    }

    private void startCheckBufferingTimer() {
        synchronized (this.mCheckBuffingTimerLock) {
            if (!isAllowCheckBufferByPosition()) {
                this.mLogger.info("startCheckBufferingTimer, forbidden check buffer by position");
                return;
            }
            if (this.mBufferCheck == null) {
                final com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.BufferCheck bufferCheck = new com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.BufferCheck();
                this.mBufferCheck = bufferCheck;
                bufferCheck.mCheckAbort = false;
                bufferCheck.mCheckBuffingTimer = com.tencent.thumbplayer.utils.TPThreadPool.getInstance().obtainScheduledExecutorService().schedule(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.6
                    @Override // java.lang.Runnable
                    public void run() {
                        while (!bufferCheck.mCheckAbort) {
                            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.checkBuffingEvent();
                            try {
                                java.lang.Thread.sleep(400L);
                            } catch (java.lang.InterruptedException unused) {
                            }
                        }
                    }
                }, 0L, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
        }
    }

    private void startCheckPrepareTimeoutTimer() {
        this.mLogger.info("startCheckPrepareTimeoutTimer");
        synchronized (this.mCheckPrepareTimeoutLock) {
            if (this.mCheckPrepareTimeoutTask == null) {
                this.mCheckPrepareTimeoutTask = com.tencent.thumbplayer.utils.TPThreadPool.getInstance().obtainScheduledExecutorService().schedule(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mState == com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PREPARING) {
                            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mLogger.error("startCheckPrepareTimeoutTimer, post error");
                            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.ERROR;
                            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mediaPlayerStopAndRelease();
                            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.destroyCheckPrepareTimeoutTimer();
                            com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnErrorListener iOnErrorListener = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.this.mOnErrorListener;
                            if (iOnErrorListener != null) {
                                iOnErrorListener.onError(2001, com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.formatErrorCode(-110), 0L, 0L);
                            }
                        }
                    }
                }, this.mIntervalCheckPreparingTimeOut, java.util.concurrent.TimeUnit.MILLISECONDS);
            }
        }
    }

    private int systemTrackType2TPTrackType(int i17) {
        if (2 == i17) {
            return 2;
        }
        if (1 == i17) {
            return 1;
        }
        return 4 == i17 ? 3 : 0;
    }

    private void unRegisterListener() {
        this.mMediaPlayer.setOnPreparedListener(null);
        this.mMediaPlayer.setOnCompletionListener(null);
        this.mMediaPlayer.setOnErrorListener(null);
        this.mMediaPlayer.setOnInfoListener(null);
        this.mMediaPlayer.setOnBufferingUpdateListener(null);
        this.mMediaPlayer.setOnSeekCompleteListener(null);
        this.mMediaPlayer.setOnVideoSizeChangedListener(null);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void addAudioTrackSource(java.lang.String str, java.lang.String str2, java.util.List<com.tencent.thumbplayer.api.TPOptionalParam> list) {
        addAudioTrackSource(str, null, str2, list);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void addSubtitleSource(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        addSubtitleSource(str, null, str2, str3);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void captureVideo(com.tencent.thumbplayer.api.TPCaptureParams tPCaptureParams, com.tencent.thumbplayer.api.TPCaptureCallBack tPCaptureCallBack) {
        if (this.mTpSystemCapture == null) {
            tPCaptureCallBack.onCaptureVideoFailed(com.tencent.thumbplayer.core.common.TPGeneralError.UNMATCHED_STATE);
            return;
        }
        com.tencent.thumbplayer.core.imagegenerator.TPImageGeneratorParams tPImageGeneratorParams = new com.tencent.thumbplayer.core.imagegenerator.TPImageGeneratorParams();
        tPImageGeneratorParams.width = tPCaptureParams.width;
        tPImageGeneratorParams.height = tPCaptureParams.height;
        tPImageGeneratorParams.format = tPCaptureParams.format;
        tPImageGeneratorParams.requestedTimeMsToleranceBefore = tPCaptureParams.requestedTimeMsToleranceBefore;
        tPImageGeneratorParams.requestedTimeMsToleranceAfter = tPCaptureParams.requestedTimeMsToleranceAfter;
        this.mTpSystemCapture.generateImageAsyncAtTime(getCurrentPositionMs(), tPImageGeneratorParams, tPCaptureCallBack);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public int configBufferDurationAsync(int i17, long j17, long j18, long j19) {
        return 0;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void deselectTrack(int i17, long j17) {
        this.mLogger.info("deselectTrack, trackID " + i17);
        int size = this.mAudioTrackInfo.size();
        int size2 = this.mSubTrackInfo.size();
        if (i17 < size || i17 >= size2 + size) {
            this.mMediaPlayer.deselectTrack(i17);
            return;
        }
        int i18 = i17 - size;
        try {
            deselectSubTrack(i18, j17);
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
        this.mSubTrackInfo.get(i18).info.isSelected = false;
        this.mCurSubTrackIndex = -1;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public int getAutoExpendBufferCount() {
        return 0;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getBufferIOMaxReadDurationPosMs() {
        return 0L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getBufferIOMaxReadFileOffset() {
        return 0L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getBufferIOMaxWriteDurationPosMs() {
        return 0L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getBufferIOMaxWriteFileOffset() {
        return 0L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getBufferedDurationMs() {
        return 0L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getBufferedSize() {
        return 0L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getCurrentPositionMs() {
        if (this.mIsLive) {
            return 0L;
        }
        if (!this.mSuspend && this.mState != com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.ERROR) {
            return (this.mState == com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.IDLE || this.mState == com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.INITIALIZED || this.mState == com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PREPARING || this.mState == com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.STOPPED || this.mState == com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PREPARED) ? this.mStartPositionMs : this.mMediaPlayer.getCurrentPosition();
        }
        long j17 = this.mLastCheckPos;
        return j17 == -1 ? this.mStartPositionMs : j17;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getDemuxerOffsetInFile() {
        return -1L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getDurationMs() {
        if (this.mIsLive) {
            return 0L;
        }
        if (this.mSuspend) {
            return this.mBaseDuration;
        }
        if (this.mState != com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PREPARED && this.mState != com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.STARTED && this.mState != com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PAUSED) {
            return -1L;
        }
        if (this.mBaseDuration <= 0) {
            this.mBaseDuration = this.mMediaPlayer.getDuration();
        }
        long j17 = this.mCgiDuration;
        if (j17 > 0) {
            long j18 = this.mBaseDuration;
            if (j18 <= 0) {
                this.mBaseDuration = j17;
            } else {
                long abs = java.lang.Math.abs(j17 - j18) * 100;
                long j19 = this.mCgiDuration;
                if (abs / j19 > 1) {
                    this.mBaseDuration = j19;
                }
            }
        }
        return this.mBaseDuration;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public com.tencent.thumbplayer.core.player.TPDynamicStatisticParams getDynamicStatisticParams(boolean z17) {
        return null;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public com.tencent.thumbplayer.core.player.TPGeneralPlayFlowParams getGeneralPlayFlowParams() {
        return null;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getPlayableDurationMs() {
        return -1L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public com.tencent.thumbplayer.api.TPProgramInfo[] getProgramInfo() {
        return new com.tencent.thumbplayer.api.TPProgramInfo[0];
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public long getPropertyLong(int i17) {
        return -1L;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public java.lang.String getPropertyString(int i17) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f A[LOOP:0: B:21:0x0059->B:23:0x005f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079 A[LOOP:1: B:26:0x0073->B:28:0x0079, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090 A[LOOP:2: B:34:0x008e->B:35:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004e  */
    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.thumbplayer.api.TPTrackInfo[] getTrackInfo() {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.getTrackInfo():com.tencent.thumbplayer.api.TPTrackInfo[]");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public int getVideoHeight() {
        this.mLogger.info("getVideoHeight, height:" + this.mVideoHeight);
        return this.mVideoHeight;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public int getVideoWidth() {
        this.mLogger.info("getVideoWidth, width:" + this.mVideoWidth);
        return this.mVideoWidth;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public synchronized void pause() {
        this.mLogger.info("pause ");
        if (this.mSuspend) {
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.ResetActionInfo resetActionInfo = this.mLastestAction;
            if (resetActionInfo != null) {
                resetActionInfo.state = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PAUSED;
            }
            this.mLogger.warn("system player is busy.");
            return;
        }
        com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle iTPSysPlayerExternalSubtitle = this.mExtSub;
        if (iTPSysPlayerExternalSubtitle != null) {
            iTPSysPlayerExternalSubtitle.pauseAsync();
        }
        this.mMediaPlayer.pause();
        com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState playerState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PAUSED;
        this.mState = playerState;
        this.mMediaPlayerState = playerState;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void prepare() {
        if (this.mMediaPlayerState == com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.COMPLETE) {
            this.mLogger.warn("call prepare() on mMediaPlayerState==COMPLETE");
            return;
        }
        setInitParamsBeforePrepare();
        this.mLogger.info("prepare ");
        com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState playerState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PREPARING;
        this.mState = playerState;
        this.mMediaPlayerState = playerState;
        this.mMediaPlayer.prepare();
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void prepareAsync() {
        setInitParamsBeforePrepare();
        this.mLogger.info("prepareAsync ");
        com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState playerState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PREPARING;
        this.mState = playerState;
        this.mMediaPlayerState = playerState;
        this.mMediaPlayer.prepareAsync();
        startCheckPrepareTimeoutTimer();
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public synchronized void release() {
        this.mLogger.info("release ");
        this.mExtSub.release();
        destroyCheckPrepareTimeoutTimer();
        destroyCheckBuffingTimer();
        destroyCheckBufferTimeOutByInfo();
        this.mState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.RELEASE;
        mediaPlayerStopAndRelease();
        this.mOnPreparedListener = null;
        this.mOnCompletionListener = null;
        this.mOnInfoListener = null;
        this.mOnErrorListener = null;
        this.mOnSeekCompleteListener = null;
        this.mOnVideoSizeChangedListener = null;
        this.mOnSubtitleDataListener = null;
        this.mSurfaceObj = null;
        this.mLogger.info("release over.");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public synchronized void reset() {
        this.mLogger.info("reset ");
        com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState playerState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.IDLE;
        this.mState = playerState;
        this.mMediaPlayerState = playerState;
        this.mExtSub.reset();
        this.mMediaPlayer.reset();
        this.mStartPositionMs = 0;
        this.mSkipEndPositionMs = -1L;
        this.mIsLive = false;
        this.mCgiDuration = -1L;
        this.mCgiVideoHeight = -1;
        this.mCgiVideoWidth = -1;
        this.mAttributes = null;
        destroyCheckPrepareTimeoutTimer();
        destroyCheckBuffingTimer();
        destroyCheckBufferTimeOutByInfo();
        this.mLogger.info("reset over.");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void seekTo(int i17) {
        this.mLogger.info("seekTo, position: " + i17);
        if (this.mIsNotSeekable) {
            this.mLogger.info("current media is not seekable, ignore");
            return;
        }
        if (this.mSuspend) {
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.ResetActionInfo resetActionInfo = this.mLastestAction;
            if (resetActionInfo != null) {
                resetActionInfo.position = i17;
                return;
            }
            return;
        }
        if (this.mMediaPlayerState == com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.COMPLETE) {
            this.mState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.STARTED;
        }
        this.mMediaPlayer.seekTo(i17);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void selectProgram(int i17, long j17) {
        this.mLogger.error("selectProgram, android mediaplayer not support");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void selectTrack(int i17, long j17) {
        android.media.MediaPlayer.TrackInfo[] trackInfoArr;
        this.mLogger.info("selectTrack, trackID:" + i17 + ", opaque:" + j17);
        int size = this.mAudioTrackInfo.size();
        int size2 = this.mSubTrackInfo.size();
        this.mAudioTrackInfo.size();
        com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnInfoListener iOnInfoListener = this.mOnInfoListener;
        if (i17 >= 0 && i17 < size) {
            try {
                selectAudioTrack(i17, j17);
                this.mAudioTrackInfo.get(this.mCurAudioTrackIndex).info.isSelected = false;
                this.mAudioTrackInfo.get(i17).info.isSelected = true;
                this.mCurAudioTrackIndex = i17;
                return;
            } catch (java.lang.Exception e17) {
                this.mLogger.printException(e17);
                if (iOnInfoListener != null) {
                    iOnInfoListener.onInfo(4, 2000L, formatErrorCode(-10000), java.lang.Long.valueOf(j17));
                    return;
                }
                return;
            }
        }
        if (i17 >= size && i17 < size + size2) {
            int i18 = i17 - size;
            try {
                selectSubTrack(i18, j17);
            } catch (java.lang.Exception e18) {
                this.mLogger.printException(e18);
                if (iOnInfoListener != null) {
                    iOnInfoListener.onInfo(4, 2000L, formatErrorCode(-10000), java.lang.Long.valueOf(j17));
                }
            }
            int i19 = this.mCurSubTrackIndex;
            if (i19 >= 0 && i19 < size2) {
                this.mSubTrackInfo.get(i19).info.isSelected = false;
            }
            this.mSubTrackInfo.get(i18).info.isSelected = true;
            this.mCurSubTrackIndex = i17;
            return;
        }
        int i27 = i17 - (size + size2);
        if (this.mState != com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PREPARED && this.mState != com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.STARTED && this.mState != com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PAUSED) {
            this.mLogger.error("selectTrack, illegal state:" + this.mState);
            return;
        }
        try {
            trackInfoArr = this.mMediaPlayer.getTrackInfo();
        } catch (java.lang.Exception unused) {
            this.mLogger.error("getTrackInfo, android getTrackInfo crash");
            trackInfoArr = null;
        }
        if (trackInfoArr == null || trackInfoArr.length <= i27) {
            if (iOnInfoListener != null) {
                iOnInfoListener.onInfo(4, 2000L, formatErrorCode(TP_SYSTEM_PLAYER_INNER_TRACK_INDEX_ERR), java.lang.Long.valueOf(j17));
                return;
            }
            return;
        }
        android.media.MediaPlayer.TrackInfo trackInfo = trackInfoArr[i27];
        if (trackInfo.getTrackType() == 2) {
            this.mCurInnerAudioTrackIndex = i27;
        } else {
            if (trackInfo.getTrackType() != 4) {
                if (iOnInfoListener != null) {
                    iOnInfoListener.onInfo(4, 2000L, formatErrorCode(TP_SYSTEM_PLAYER_INNER_TRACK_TYPE_NOT_SUPPORT), java.lang.Long.valueOf(j17));
                    return;
                }
                return;
            }
            this.mSelectSubtitleIndex = i27;
        }
        this.mMediaPlayer.selectTrack(i27);
        if (iOnInfoListener != null) {
            iOnInfoListener.onInfo(4, 1000L, 0L, java.lang.Long.valueOf(j17));
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setAudioGainRatio(float f17) {
        this.mLogger.info("setAudioGainRatio, : " + f17);
        this.mAudioGain = f17;
        try {
            if (this.mMediaPlayer != null) {
                android.media.MediaPlayer mediaPlayer = this.mMediaPlayer;
                float f18 = this.mAudioGain;
                mediaPlayer.setVolume(f18, f18);
            }
        } catch (java.lang.IllegalStateException e17) {
            this.mLogger.info("setAudioGainRatio ex : " + e17.toString());
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setAudioNormalizeVolumeParams(java.lang.String str) {
        this.mLogger.info("setAudioNormalizeVolumeParams not supported.");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setDataSource(java.lang.String str) {
        this.mLogger.info("setDataSource， url: " + str);
        this.mUrl = str;
        this.mMediaPlayer.setDataSource(str);
        this.mTpSystemCapture = new com.tencent.thumbplayer.caputure.TPSystemCapture(str);
        com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState playerState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.INITIALIZED;
        this.mState = playerState;
        this.mMediaPlayerState = playerState;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setLoopback(boolean z17) {
        this.mLogger.info("setLoopback, : " + z17);
        this.mIsLoopback = z17;
        this.mMediaPlayer.setLooping(z17);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnAudioPcmOutputListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioPcmOutListener iOnAudioPcmOutListener) {
        throw new java.lang.IllegalStateException("system Mediaplayer cannot support audio frame out");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnAudioProcessOutputListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnAudioProcessOutListener iOnAudioProcessOutListener) {
        throw new java.lang.IllegalStateException("system Mediaplayer cannot support audio postprocess frame out");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnCompletionListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnCompletionListener iOnCompletionListener) {
        this.mOnCompletionListener = iOnCompletionListener;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnDemuxerListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnDemuxerListener iOnDemuxerListener) {
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnDetailInfoListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnDetailInfoListener iOnDetailInfoListener) {
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnErrorListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnErrorListener iOnErrorListener) {
        this.mOnErrorListener = iOnErrorListener;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnEventRecordListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnEventRecordListener iOnEventRecordListener) {
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnInfoListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnInfoListener iOnInfoListener) {
        this.mOnInfoListener = iOnInfoListener;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnPreparedListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnPreparedListener iOnPreparedListener) {
        this.mOnPreparedListener = iOnPreparedListener;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnSeekCompleteListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSeekCompleteListener iOnSeekCompleteListener) {
        this.mOnSeekCompleteListener = iOnSeekCompleteListener;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnSubtitleDataListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleDataListener iOnSubtitleDataListener) {
        this.mOnSubtitleDataListener = iOnSubtitleDataListener;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnSubtitleFrameOutListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnSubtitleFrameOutListener iOnSubtitleFrameOutListener) {
        this.mOnSubtitleFrameOutListener = iOnSubtitleFrameOutListener;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnVideoFrameOutListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoFrameOutListener iOnVideoFrameOutListener) {
        throw new java.lang.IllegalStateException("system Mediaplayer cannot support video frame out");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnVideoProcessOutputListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoProcessOutListener iOnVideoProcessOutListener) {
        throw new java.lang.IllegalStateException("system Mediaplayer cannot support video postprocess frame out");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOnVideoSizeChangedListener(com.tencent.thumbplayer.adapter.player.ITPPlayerBaseListener.IOnVideoSizeChangedListener iOnVideoSizeChangedListener) {
        this.mOnVideoSizeChangedListener = iOnVideoSizeChangedListener;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setOutputMute(boolean z17) {
        this.mLogger.info("setOutputMute, : " + z17);
        this.mMute = z17;
        try {
            if (z17) {
                this.mMediaPlayer.setVolume(0.0f, 0.0f);
                this.mLogger.info("setOutputMute, true");
            } else {
                android.media.MediaPlayer mediaPlayer = this.mMediaPlayer;
                float f17 = this.mAudioGain;
                mediaPlayer.setVolume(f17, f17);
                this.mLogger.info("setOutputMute, false, mAudioGain: " + this.mAudioGain);
            }
        } catch (java.lang.Exception e17) {
            this.mLogger.info("setOutputMute, Exception: " + e17.toString());
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setPlaySharpenSwitch() {
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setPlaySpeedRatio(float f17) {
        this.mLogger.info("setPlaySpeedRatio, : " + f17);
        this.mPlaySpeed = f17;
        this.mLogger.info("setPlaySpeedRatio play speed:" + f17);
        try {
            android.media.PlaybackParams playbackParams = this.mMediaPlayer.getPlaybackParams();
            if (playbackParams.getSpeed() != f17) {
                playbackParams.setSpeed(f17);
                this.mMediaPlayer.setPlaybackParams(playbackParams);
            }
        } catch (java.lang.Exception e17) {
            this.mLogger.printException(e17);
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setPlayerOptionalParam(com.tencent.thumbplayer.api.TPOptionalParam tPOptionalParam) {
        int key = tPOptionalParam.getKey();
        if (key == 1) {
            this.mCgiDuration = tPOptionalParam.getParamLong().value;
            return;
        }
        if (key == 2) {
            this.mCgiVideoWidth = (int) tPOptionalParam.getParamLong().value;
            this.mLogger.info("setPlayerOptionalParam, video width:" + this.mCgiVideoWidth);
            return;
        }
        if (key == 3) {
            this.mCgiVideoHeight = (int) tPOptionalParam.getParamLong().value;
            this.mLogger.info("setPlayerOptionalParam, video height:" + this.mCgiVideoHeight);
            return;
        }
        if (key == 4) {
            this.mIsLive = tPOptionalParam.getParamBoolean().value;
            this.mIsNotSeekable = true;
            this.mLogger.info("setPlayerOptionalParam, is live:" + this.mIsLive);
            return;
        }
        if (key == 5) {
            this.mIsAllowCheckBuffingByPosition = tPOptionalParam.getParamBoolean().value;
            return;
        }
        if (key == 7) {
            this.mCheckBufferFrequent = (int) (tPOptionalParam.getParamLong().value / 400);
            this.mLogger.info("setPlayerOptionalParam, on buffer timeout:" + tPOptionalParam.getParamLong().value + "(ms)");
            return;
        }
        if (key == 100) {
            this.mStartPositionMs = (int) tPOptionalParam.getParamLong().value;
            this.mLogger.info("setPlayerOptionalParam, start position:" + this.mStartPositionMs);
            return;
        }
        if (key == 107) {
            this.mCheckBufferTimeroutFrequent = (int) ((tPOptionalParam.getParamLong().value + 400) / 400);
            this.mLogger.info("setPlayerOptionalParam, buffer timeout:" + tPOptionalParam.getParamLong().value + "(ms)");
            return;
        }
        if (key == 128) {
            this.mIntervalCheckPreparingTimeOut = tPOptionalParam.getParamLong().value;
            this.mLogger.info("setPlayerOptionalParam, prepare timeout:" + this.mIntervalCheckPreparingTimeOut + "(ms)");
            return;
        }
        if (key == 414) {
            this.mAttributes = (com.tencent.thumbplayer.api.TPAudioAttributes) tPOptionalParam.getParamObject().objectValue;
            this.mLogger.info("setPlayerOptionalParam, " + this.mAttributes.toString());
            return;
        }
        if (key == 450) {
            int i17 = (int) tPOptionalParam.getParamLong().value;
            com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle iTPSysPlayerExternalSubtitle = this.mExtSub;
            if (iTPSysPlayerExternalSubtitle != null) {
                iTPSysPlayerExternalSubtitle.setSubtitleType(i17);
            }
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "setPlayerOptionalParam, subtitle type:" + tPOptionalParam.getParamLong().value);
            return;
        }
        if (key == 500) {
            this.mSkipEndPositionMs = tPOptionalParam.getParamLong().value;
            this.mLogger.info("setPlayerOptionalParam, skip end position:" + this.mSkipEndPositionMs);
            return;
        }
        if (key != 507) {
            return;
        }
        com.tencent.thumbplayer.api.TPSubtitleRenderModel tPSubtitleRenderModel = (com.tencent.thumbplayer.api.TPSubtitleRenderModel) tPOptionalParam.getParamObject().objectValue;
        com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle iTPSysPlayerExternalSubtitle2 = this.mExtSub;
        if (iTPSysPlayerExternalSubtitle2 != null) {
            iTPSysPlayerExternalSubtitle2.setSubtitleRenderModel(tPSubtitleRenderModel);
        }
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "setPlayerOptionalParam, subtitle render model");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setSurface(android.view.Surface surface, @com.tencent.thumbplayer.api.TPCommonEnum.TPSurfaceType int i17) {
        this.mLogger.info("setSurface, surface: " + surface);
        this.mSurfaceObj = surface;
        this.mMediaPlayer.setSurface(surface);
        this.mLogger.info("setSurface over, surface: " + surface);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setSurfaceHolder(android.view.SurfaceHolder surfaceHolder) {
        this.mLogger.info("setSurfaceHolder, sh: " + surfaceHolder);
        this.mSurfaceObj = surfaceHolder;
        this.mMediaPlayer.setDisplay(surfaceHolder);
        this.mLogger.info("setSurfaceHolder over, sh: " + surfaceHolder);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void start() {
        this.mLogger.info("start ");
        if (this.mSuspend) {
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.ResetActionInfo resetActionInfo = this.mLastestAction;
            if (resetActionInfo != null) {
                resetActionInfo.state = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.STARTED;
            }
            this.mLogger.warn("system player is busy.");
            return;
        }
        if (this.mState != com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PREPARED && this.mState != com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.PAUSED) {
            this.mLogger.warn("start(), illegal state, state:" + this.mState);
            return;
        }
        com.tencent.thumbplayer.adapter.player.systemplayer.ITPSysPlayerExternalSubtitle iTPSysPlayerExternalSubtitle = this.mExtSub;
        if (iTPSysPlayerExternalSubtitle != null) {
            iTPSysPlayerExternalSubtitle.startAsync();
        }
        this.mMediaPlayer.start();
        com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState playerState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.STARTED;
        this.mState = playerState;
        this.mMediaPlayerState = playerState;
        float f17 = this.mPlaySpeed;
        if (f17 != 1.0d) {
            setPlaySpeedRatio(f17);
        }
        startCheckBufferingTimer();
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public synchronized void stop() {
        this.mLogger.info("stop ");
        destroyCheckPrepareTimeoutTimer();
        destroyCheckBuffingTimer();
        destroyCheckBufferTimeOutByInfo();
        this.mState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.STOPPED;
        mediaPlayerstop();
        this.mCurAudioTrackIndex = 0;
        this.mCurSubTrackIndex = -1;
        this.mLastestAction = null;
        this.mSelectSubtitleIndex = -1;
        this.mCurInnerAudioTrackIndex = -1;
        this.mExtSub.stop();
        this.mPosChangeCount = 0L;
        this.mLogger.info("stop over.");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void switchDefinition(com.tencent.thumbplayer.api.composition.ITPMediaAsset iTPMediaAsset, @com.tencent.thumbplayer.api.TPCommonEnum.TPSwitchDefMode int i17, long j17) {
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void switchHdrModeWithSurface(android.view.Surface surface, int i17, int i18) {
        this.mSurfaceObj = surface;
        this.mMediaPlayer.setSurface(surface);
        this.mLogger.info("setSurface over, surface: " + surface);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void updateLoggerContext(com.tencent.thumbplayer.log.TPLoggerContext tPLoggerContext) {
        this.mLogger.updateContext(new com.tencent.thumbplayer.log.TPLoggerContext(tPLoggerContext, TAG));
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void addAudioTrackSource(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.util.List<com.tencent.thumbplayer.api.TPOptionalParam> list) {
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str2)) {
            com.tencent.thumbplayer.api.TPTrackInfo tPTrackInfo = new com.tencent.thumbplayer.api.TPTrackInfo();
            tPTrackInfo.name = str2;
            tPTrackInfo.isExclusive = true;
            tPTrackInfo.isInternal = false;
            tPTrackInfo.isSelected = false;
            tPTrackInfo.trackType = 2;
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.ExternalTrackInfo externalTrackInfo = new com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.ExternalTrackInfo();
            externalTrackInfo.info = tPTrackInfo;
            externalTrackInfo.url = str;
            externalTrackInfo.httpHeader = map;
            externalTrackInfo.paramData = list;
            this.mLogger.info("addAudioTrackSource, name:" + tPTrackInfo.name + ", url:" + str2);
            this.mAudioTrackInfo.add(externalTrackInfo);
            return;
        }
        this.mLogger.error("addAudioTrackSource, illegal argument.");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void addSubtitleSource(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, java.lang.String str2, java.lang.String str3) {
        if (!android.text.TextUtils.isEmpty(str) && !android.text.TextUtils.isEmpty(str3)) {
            com.tencent.thumbplayer.api.TPTrackInfo tPTrackInfo = new com.tencent.thumbplayer.api.TPTrackInfo();
            tPTrackInfo.name = str3;
            tPTrackInfo.isExclusive = true;
            tPTrackInfo.isInternal = false;
            tPTrackInfo.isSelected = false;
            tPTrackInfo.trackType = 3;
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.ExternalTrackInfo externalTrackInfo = new com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.ExternalTrackInfo();
            externalTrackInfo.info = tPTrackInfo;
            externalTrackInfo.url = str;
            externalTrackInfo.httpHeader = map;
            this.mLogger.info("addSubtitleSource, name:" + tPTrackInfo.name + ", url:" + str3);
            this.mSubTrackInfo.add(externalTrackInfo);
            return;
        }
        this.mLogger.error("addSubtitleSource, illegal argument.");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void switchDefinition(java.lang.String str, @com.tencent.thumbplayer.api.TPCommonEnum.TPSwitchDefMode int i17, long j17) {
        this.mLogger.info("switchDefinition, defUrl: " + str);
        if (android.text.TextUtils.isEmpty(str)) {
            this.mLogger.info("switchDefinition, defUrl is null");
            return;
        }
        this.mUrl = str;
        com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.ResetActionInfo resetActionInfo = new com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.ResetActionInfo();
        resetActionInfo.opaque = j17;
        resetActionInfo.externalAudioTrackIndex = this.mCurAudioTrackIndex;
        resetActionInfo.mResetType = 1;
        resetActionInfo.url = str;
        try {
            playerResetStart(resetActionInfo);
        } catch (java.lang.Exception unused) {
            throw new java.lang.IllegalStateException("playerResetStart");
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setLoopback(boolean z17, long j17, long j18) {
        this.mLogger.info("setLoopback, : " + z17 + ", loopStart: " + j17 + ", loopEnd: " + j18);
        if (j17 >= 0) {
            long j19 = this.mBaseDuration;
            if (j17 <= j19 && j18 <= j19) {
                this.mIsLoopback = z17;
                this.mLoopStartPositionMs = j17;
                this.mLoopEndPositionMs = j18;
                this.mMediaPlayer.setLooping(z17);
                return;
            }
        }
        throw new java.lang.IllegalArgumentException("position error, must more than 0 and less than duration");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setDataSource(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        this.mLogger.info("setDataSource httpHeader, url: " + str);
        this.mUrl = str;
        this.mHeader = map;
        this.mMediaPlayer.setDataSource(this.mContext, android.net.Uri.parse(str), this.mHeader);
        this.mTpSystemCapture = new com.tencent.thumbplayer.caputure.TPSystemCapture(str);
        com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState playerState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.INITIALIZED;
        this.mState = playerState;
        this.mMediaPlayerState = playerState;
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void seekTo(int i17, @com.tencent.thumbplayer.api.TPCommonEnum.TPSeekMode int i18) {
        this.mLogger.info("seekTo, position: " + i17 + ", mode: " + i18);
        if (this.mIsNotSeekable) {
            this.mLogger.info("current media is not seekable, ignore");
            return;
        }
        if (this.mSuspend) {
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.ResetActionInfo resetActionInfo = this.mLastestAction;
            if (resetActionInfo != null) {
                resetActionInfo.position = i17;
                return;
            }
            return;
        }
        seekToComm(this.mMediaPlayer, i17, i18);
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void switchDefinition(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map, @com.tencent.thumbplayer.api.TPCommonEnum.TPSwitchDefMode int i17, long j17) {
        this.mLogger.info("switchDefinition, defUrl: " + str);
        if (android.text.TextUtils.isEmpty(str)) {
            this.mLogger.info("switchDefinition, defUrl is null");
            return;
        }
        this.mUrl = str;
        com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.ResetActionInfo resetActionInfo = new com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.ResetActionInfo();
        resetActionInfo.opaque = j17;
        resetActionInfo.externalAudioTrackIndex = this.mCurAudioTrackIndex;
        resetActionInfo.mResetType = 1;
        resetActionInfo.url = str;
        try {
            playerResetStart(resetActionInfo);
        } catch (java.lang.Exception unused) {
            throw new java.lang.IllegalStateException("playerResetStart");
        }
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setDataSource(android.os.ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            this.mLogger.info("setDataSource pfd， pfd: " + parcelFileDescriptor.toString());
            this.mFd = parcelFileDescriptor.getFileDescriptor();
            this.mMediaPlayer.setDataSource(parcelFileDescriptor.getFileDescriptor());
            this.mTpSystemCapture = new com.tencent.thumbplayer.caputure.TPSystemCapture(parcelFileDescriptor.getFileDescriptor());
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState playerState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.INITIALIZED;
            this.mState = playerState;
            this.mMediaPlayerState = playerState;
            return;
        }
        this.mLogger.info("setDataSource pfd is null ");
        throw new java.lang.IllegalArgumentException("pfd is null");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setDataSource(android.content.res.AssetFileDescriptor assetFileDescriptor) {
        if (assetFileDescriptor != null) {
            this.mLogger.info("setDataSource afd， afd: " + assetFileDescriptor.toString());
            this.mAssetFd = assetFileDescriptor;
            handleSetDataSourceWithAfd(assetFileDescriptor);
            this.mTpSystemCapture = new com.tencent.thumbplayer.caputure.TPSystemCapture(assetFileDescriptor);
            com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState playerState = com.tencent.thumbplayer.adapter.player.systemplayer.TPSystemMediaPlayer.PlayerState.INITIALIZED;
            this.mState = playerState;
            this.mMediaPlayerState = playerState;
            return;
        }
        this.mLogger.info("setDataSource afd is null ");
        throw new java.lang.IllegalArgumentException("afd is null");
    }

    @Override // com.tencent.thumbplayer.adapter.player.ITPPlayerBase
    public void setDataSource(com.tencent.thumbplayer.api.composition.ITPMediaAsset iTPMediaAsset) {
        throw new java.lang.IllegalArgumentException("setDataSource by asset, android mediaplayer not support");
    }
}
