package rt2;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rt2.g f399504d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(rt2.g gVar) {
        super(1);
        this.f399504d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.content.Intent intent = (android.content.Intent) obj;
        kotlin.jvm.internal.o.g(intent, "intent");
        this.f399504d.getClass();
        float floatExtra = intent.getFloatExtra("sysPercent", 0.0f);
        float floatExtra2 = intent.getFloatExtra("playerGainPercent", 0.0f);
        float floatExtra3 = intent.getFloatExtra("targetGainPercent", 0.0f);
        com.tencent.mm.plugin.finder.video.FinderAudioVolumeController.f130491x = floatExtra;
        com.tencent.mm.plugin.finder.video.FinderAudioVolumeController.f130492y = floatExtra2;
        com.tencent.mm.plugin.finder.video.FinderAudioVolumeController.f130493z = floatExtra3;
        return jz5.f0.f302826a;
    }
}
