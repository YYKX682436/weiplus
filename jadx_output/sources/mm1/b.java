package mm1;

/* loaded from: classes14.dex */
public final class b implements android.media.AudioManager.OnCommunicationDeviceChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public static final mm1.b f328634a = new mm1.b();

    @Override // android.media.AudioManager.OnCommunicationDeviceChangedListener
    public final void onCommunicationDeviceChanged(android.media.AudioDeviceInfo audioDeviceInfo) {
        android.media.AudioDeviceInfo audioDeviceInfo2 = mm1.d.f328647a;
        mm1.d.f328647a = audioDeviceInfo;
    }
}
