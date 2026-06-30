package kh;

/* loaded from: classes12.dex */
public final class w extends android.media.AudioManager.AudioPlaybackCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Handler f307937a;

    public w(android.os.Handler handler) {
        this.f307937a = handler;
    }

    @Override // android.media.AudioManager.AudioPlaybackCallback
    public void onPlaybackConfigChanged(java.util.List configs) {
        kotlin.jvm.internal.o.g(configs, "configs");
        super.onPlaybackConfigChanged(configs);
        android.os.Handler handler = this.f307937a;
        kh.y yVar = kh.y.f307947d;
        handler.removeCallbacks(yVar);
        java.util.List list = (java.util.List) kh.y.f307949f.getValue();
        list.clear();
        list.addAll(configs);
        this.f307937a.postDelayed(yVar, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
    }
}
