package kh;

/* loaded from: classes11.dex */
public final class x extends android.media.AudioDeviceCallback {
    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesAdded(android.media.AudioDeviceInfo[] addedDevices) {
        kotlin.jvm.internal.o.g(addedDevices, "addedDevices");
        super.onAudioDevicesAdded(addedDevices);
    }
}
