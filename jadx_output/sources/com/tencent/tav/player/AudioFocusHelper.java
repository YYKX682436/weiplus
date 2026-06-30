package com.tencent.tav.player;

/* loaded from: classes16.dex */
public class AudioFocusHelper {
    private android.media.AudioManager.OnAudioFocusChangeListener mAudioFocusListener;
    private android.media.AudioManager mAudioManager;
    private android.content.Context mContext;
    private boolean mIsAudioFocus;
    private com.tencent.tav.player.Player mPlayer;

    public AudioFocusHelper(android.content.Context context, com.tencent.tav.player.Player player) {
        this.mContext = context;
        this.mPlayer = player;
    }

    private void ensureAudioManager() {
        if (this.mAudioManager == null) {
            this.mAudioManager = (android.media.AudioManager) this.mContext.getSystemService("audio");
        }
    }

    private android.media.AudioManager.OnAudioFocusChangeListener getAudioFocusChangeListener() {
        if (this.mAudioFocusListener == null) {
            this.mAudioFocusListener = new android.media.AudioManager.OnAudioFocusChangeListener() { // from class: com.tencent.tav.player.AudioFocusHelper.1
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public void onAudioFocusChange(int i17) {
                    if (com.tencent.tav.player.AudioFocusHelper.this.mPlayer == null) {
                        return;
                    }
                    try {
                        if (i17 == -2) {
                            com.tencent.tav.player.AudioFocusHelper.this.onAudioFocusLoss(true);
                        } else {
                            if (i17 != -1) {
                                if (i17 == 1) {
                                    com.tencent.tav.player.AudioFocusHelper.this.mIsAudioFocus = true;
                                }
                            }
                            com.tencent.tav.player.AudioFocusHelper.this.onAudioFocusLoss(false);
                        }
                    } catch (java.lang.Exception unused) {
                    }
                }
            };
        }
        return this.mAudioFocusListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAudioFocusLoss(boolean z17) {
        if (!z17) {
            this.mAudioManager.abandonAudioFocus(this.mAudioFocusListener);
            this.mIsAudioFocus = false;
        }
        com.tencent.tav.player.Player player = this.mPlayer;
        if (player == null || !player.isPlaying()) {
            return;
        }
        this.mPlayer.pause();
    }

    public void release() {
        android.media.AudioManager audioManager = this.mAudioManager;
        if (audioManager != null) {
            audioManager.abandonAudioFocus(this.mAudioFocusListener);
            this.mAudioManager = null;
            this.mAudioFocusListener = null;
            this.mIsAudioFocus = false;
        }
        if (this.mPlayer != null) {
            this.mPlayer = null;
        }
    }

    public void requestFocus() {
        ensureAudioManager();
        if (this.mIsAudioFocus) {
            return;
        }
        this.mIsAudioFocus = this.mAudioManager.requestAudioFocus(getAudioFocusChangeListener(), 3, 1) == 1;
    }
}
