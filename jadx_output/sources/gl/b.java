package gl;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f272733a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f272734b;

    public final void a() {
        java.util.List<android.media.AudioDeviceInfo> availableCommunicationDevices;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.media.AudioManager audioManager = (android.media.AudioManager) b3.l.getSystemService(context, android.media.AudioManager.class);
        if (fp.h.a(31)) {
            com.tencent.mars.xlog.Log.e("VoIPMP.AudioEarpieceTypeRouteStrategy", "API Level Below S");
            return;
        }
        if (audioManager == null || (availableCommunicationDevices = audioManager.getAvailableCommunicationDevices()) == null) {
            return;
        }
        this.f272733a = false;
        this.f272734b = false;
        java.util.Iterator<android.media.AudioDeviceInfo> it = availableCommunicationDevices.iterator();
        while (it.hasNext()) {
            int type = it.next().getType();
            if (type == 1) {
                this.f272733a = true;
            } else if (type != 2 && type != 3 && type != 4 && type != 7 && type != 8 && type != 11 && type != 22 && type != 24) {
                this.f272734b = true;
            }
        }
        com.tencent.mars.xlog.Log.i("VoIPMP.AudioEarpieceTypeRouteStrategy", "mHasEarpiece: " + this.f272733a + " mHasUndefinedDevices: " + this.f272734b);
    }
}
