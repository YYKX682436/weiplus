package gl;

/* loaded from: classes14.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final gl.x f272783d = new gl.x();

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        ((android.media.AudioManager) systemService).clearCommunicationDevice();
    }
}
