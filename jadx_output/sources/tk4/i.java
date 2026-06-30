package tk4;

/* loaded from: classes11.dex */
public final class i extends android.media.AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic f419987a;

    public i(com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic tingAudioPushConfigLogic) {
        this.f419987a = tingAudioPushConfigLogic;
    }

    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesAdded(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
        super.onAudioDevicesAdded(audioDeviceInfoArr);
        com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic tingAudioPushConfigLogic = this.f419987a;
        kotlinx.coroutines.l.d(tingAudioPushConfigLogic.K, null, null, new tk4.h(tingAudioPushConfigLogic, audioDeviceInfoArr, null), 3, null);
    }
}
