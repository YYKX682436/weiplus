package com.tencent.thumbplayer.adapter.player.systemplayer;

/* loaded from: classes15.dex */
public class TPMediaPlayer extends android.media.MediaPlayer {
    private static final java.lang.String TAG = "TPThumbPlayer[TPMediaPlayer.java]";

    @Override // android.media.MediaPlayer
    public void finalize() {
        try {
            super.finalize();
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        }
    }

    @Override // android.media.MediaPlayer
    public int getCurrentPosition() {
        try {
            return super.getCurrentPosition();
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            return 0;
        }
    }

    @Override // android.media.MediaPlayer
    public int getDuration() {
        try {
            return super.getDuration();
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            return 0;
        }
    }

    @Override // android.media.MediaPlayer
    public int getSelectedTrack(int i17) {
        try {
            return super.getSelectedTrack(i17);
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            return 0;
        }
    }

    @Override // android.media.MediaPlayer
    public android.media.MediaPlayer.TrackInfo[] getTrackInfo() {
        try {
            return super.getTrackInfo();
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            return new android.media.MediaPlayer.TrackInfo[0];
        }
    }

    @Override // android.media.MediaPlayer
    public int getVideoHeight() {
        try {
            return super.getVideoHeight();
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            return 0;
        }
    }

    @Override // android.media.MediaPlayer
    public int getVideoWidth() {
        try {
            return super.getVideoWidth();
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
            return 0;
        }
    }

    @Override // android.media.MediaPlayer
    public void prepare() {
        try {
            super.prepare();
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        }
    }

    @Override // android.media.MediaPlayer
    public void release() {
        try {
            if ("N1W".equalsIgnoreCase(com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName()) || "X909T".equalsIgnoreCase(com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName()) || "X909".equalsIgnoreCase(com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName()) || "N1T".equalsIgnoreCase(com.tencent.thumbplayer.core.common.TPSystemInfo.getDeviceName())) {
                super.setOnPreparedListener(null);
                super.setOnCompletionListener(null);
                super.setOnErrorListener(null);
                super.setOnInfoListener(null);
                super.setOnBufferingUpdateListener(null);
                super.setOnSeekCompleteListener(null);
                super.setOnVideoSizeChangedListener(null);
                ((android.os.Handler) getClass().getDeclaredField("mA2dpHandler").get(this)).removeCallbacksAndMessages(null);
            }
        } catch (java.lang.IllegalAccessException e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        } catch (java.lang.NoSuchFieldException e18) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e18);
        }
        try {
            super.release();
        } catch (java.lang.Exception e19) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e19);
        }
    }

    @Override // android.media.MediaPlayer
    public void reset() {
        try {
            super.reset();
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        }
    }

    @Override // android.media.MediaPlayer
    public void setDataSource(android.content.Context context, android.net.Uri uri) {
        try {
            super.setDataSource(context, uri);
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        }
    }

    @Override // android.media.MediaPlayer
    public void setDisplay(android.view.SurfaceHolder surfaceHolder) {
        try {
            super.setDisplay(surfaceHolder);
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        }
    }

    @Override // android.media.MediaPlayer
    public void setLooping(boolean z17) {
        try {
            super.setLooping(z17);
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        }
    }

    @Override // android.media.MediaPlayer
    public void setPlaybackParams(android.media.PlaybackParams playbackParams) {
        try {
            super.setPlaybackParams(playbackParams);
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        }
    }

    @Override // android.media.MediaPlayer
    public void setSurface(android.view.Surface surface) {
        try {
            super.setSurface(surface);
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        }
    }

    @Override // android.media.MediaPlayer
    public void setVolume(float f17, float f18) {
        try {
            super.setVolume(f17, f18);
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        }
    }

    @Override // android.media.MediaPlayer
    public void stop() {
        try {
            super.stop();
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        }
    }

    @Override // android.media.MediaPlayer
    public void setDataSource(java.io.FileDescriptor fileDescriptor) {
        try {
            super.setDataSource(fileDescriptor);
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        }
    }

    @Override // android.media.MediaPlayer
    public void setDataSource(android.content.Context context, android.net.Uri uri, java.util.Map<java.lang.String, java.lang.String> map) {
        try {
            super.setDataSource(context, uri, map);
        } catch (java.lang.Exception e17) {
            com.tencent.thumbplayer.utils.TPLogUtil.e(TAG, e17);
        }
    }
}
