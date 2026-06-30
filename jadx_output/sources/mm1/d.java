package mm1;

/* loaded from: classes14.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static volatile android.media.AudioDeviceInfo f328647a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile int f328648b;

    static {
        android.media.AudioManager audioManager = (android.media.AudioManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService(android.media.AudioManager.class);
        mm1.b bVar = mm1.b.f328634a;
        mm1.c cVar = mm1.c.f328643a;
        ku5.f p17 = ((ku5.t0) ku5.t0.f312615d).p("audio_device_manager");
        f328647a = audioManager.getCommunicationDevice();
        audioManager.addOnCommunicationDeviceChangedListener(p17, bVar);
        f328648b = audioManager.getMode();
        audioManager.addOnModeChangedListener(p17, cVar);
    }
}
