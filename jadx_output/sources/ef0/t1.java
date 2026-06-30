package ef0;

@j95.b
/* loaded from: classes11.dex */
public final class t1 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f252326d = jz5.h.b(ef0.s1.f252318d);

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        rk4.k5.e("TingAudioPushConfigService onAccountInitialized", null);
        com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic tingAudioPushConfigLogic = (com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic) ((jz5.n) this.f252326d).getValue();
        com.tencent.mars.xlog.Log.i(tingAudioPushConfigLogic.f174639a, "isOutdoorOpenFeature " + tingAudioPushConfigLogic.d());
        if (tingAudioPushConfigLogic.d()) {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            java.util.Iterator it = tingAudioPushConfigLogic.L.iterator();
            while (it.hasNext()) {
                intentFilter.addAction((java.lang.String) it.next());
            }
            java.util.Iterator it6 = tingAudioPushConfigLogic.M.iterator();
            while (it6.hasNext()) {
                intentFilter.addAction((java.lang.String) it6.next());
            }
            com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(tingAudioPushConfigLogic, intentFilter);
            ((android.media.AudioManager) ((jz5.n) tingAudioPushConfigLogic.H).getValue()).registerAudioDeviceCallback(new tk4.i(tingAudioPushConfigLogic), null);
        }
        super.onAccountInitialized(context);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic tingAudioPushConfigLogic = (com.tencent.mm.plugin.ting.audiopush.TingAudioPushConfigLogic) ((jz5.n) this.f252326d).getValue();
        if (tingAudioPushConfigLogic.d()) {
            com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(tingAudioPushConfigLogic);
        }
        super.onAccountReleased(context);
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        rk4.k5.e("TingAudioPushConfigService onCreate", null);
    }
}
