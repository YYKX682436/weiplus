package ko3;

/* loaded from: classes13.dex */
public class v implements android.media.AudioManager.OnModeChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ko3.w f310027a;

    public v(ko3.w wVar) {
        this.f310027a = wVar;
    }

    @Override // android.media.AudioManager.OnModeChangedListener
    public void onModeChanged(int i17) {
        com.tencent.mm.plugin.normsg.api.AudioModeStatus audioModeStatus;
        com.tencent.mm.plugin.normsg.api.AudioModeStatus audioModeStatus2 = this.f310027a.f310030d;
        synchronized (audioModeStatus2) {
            audioModeStatus2.f152403f = audioModeStatus2.f152401d;
            audioModeStatus2.f152404g = audioModeStatus2.f152402e;
            audioModeStatus2.f152401d = i17;
            audioModeStatus2.f152402e = java.lang.System.currentTimeMillis() / 1000;
        }
        w04.l lVar = w04.l.INSTANCE;
        com.tencent.mm.plugin.normsg.api.AudioModeStatus audioModeStatus3 = this.f310027a.f310030d;
        synchronized (audioModeStatus3) {
            audioModeStatus = new com.tencent.mm.plugin.normsg.api.AudioModeStatus();
            audioModeStatus.f152401d = audioModeStatus3.f152401d;
            audioModeStatus.f152402e = audioModeStatus3.f152402e;
            audioModeStatus.f152403f = audioModeStatus3.f152403f;
            audioModeStatus.f152404g = audioModeStatus3.f152404g;
        }
        lVar.G7(540999712, audioModeStatus);
    }
}
