package com.tencent.qqmusic.mediaplayer.audiofx;

/* loaded from: classes13.dex */
public interface IAudioListenerBuilder {
    com.tencent.qqmusic.mediaplayer.audiofx.IAudioListener createAudioEffect(android.os.Bundle bundle);

    android.os.Bundle getConfiguration(int i17, android.os.Bundle bundle);

    java.lang.String getId();

    void init(android.content.Context context);

    boolean isEnabled();

    void release();

    void setConfiguration(int i17, android.os.Bundle bundle);

    boolean setEnabled(boolean z17);

    void setListener(com.tencent.qqmusic.mediaplayer.audiofx.OnBuilderStateChangedListener onBuilderStateChangedListener);
}
