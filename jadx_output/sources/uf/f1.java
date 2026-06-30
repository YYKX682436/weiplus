package uf;

/* loaded from: classes7.dex */
public final class f1 extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final android.media.AudioManager f427023a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(android.content.Context context, android.os.Handler handler) {
        super(handler);
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.Object systemService = context.getSystemService("audio");
        this.f427023a = systemService instanceof android.media.AudioManager ? (android.media.AudioManager) systemService : null;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        return false;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        android.media.AudioManager audioManager = this.f427023a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCastHandler", "Volume now " + (audioManager != null ? java.lang.Integer.valueOf(audioManager.getStreamVolume(3)) : null));
    }
}
