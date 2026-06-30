package fl4;

/* loaded from: classes10.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final fl4.a f263930d = new fl4.a();

    public a() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.ting.media.TingHeadsetChangeReceiver tingHeadsetChangeReceiver = new com.tencent.mm.plugin.ting.media.TingHeadsetChangeReceiver(null);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingApp.HeadsetChangeReceiver", "registerHeadsetReceiver");
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(tingHeadsetChangeReceiver, intentFilter);
        return tingHeadsetChangeReceiver;
    }
}
