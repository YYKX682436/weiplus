package gy;

/* loaded from: classes7.dex */
public final class d implements android.media.AudioManager.OnAudioFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public static final gy.d f277477d = new gy.d();

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i17) {
        com.tencent.mars.xlog.Log.i("ChatBot.SMCAudioManager", "audio focus change: " + i17);
    }
}
