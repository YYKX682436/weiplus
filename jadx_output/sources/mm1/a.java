package mm1;

/* loaded from: classes13.dex */
public final class a implements com.tencent.mm.booter.k {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f328626a = new java.util.HashMap();

    public final void a(android.content.BroadcastReceiver broadcastReceiver, java.lang.String[] strArr, java.lang.String[] strArr2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioBroadcastHelper", "registerBroadcast: ".concat(broadcastReceiver.getClass().getSimpleName()));
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        if (!com.tencent.mm.sdk.platformtools.t8.N0((java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length))) {
            for (java.lang.String str : strArr) {
                intentFilter.addAction(str);
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.N0((java.lang.String[]) java.util.Arrays.copyOf(strArr2, strArr2.length))) {
            for (java.lang.String str2 : strArr2) {
                intentFilter.addCategory(str2);
            }
        }
        if (fp.h.a(33)) {
            com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(broadcastReceiver, intentFilter);
        } else {
            com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(broadcastReceiver, intentFilter, 2);
        }
    }

    public final void b(android.content.BroadcastReceiver broadcastReceiver) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioBroadcastHelper", "unRegisterBroadcast: ".concat(broadcastReceiver.getClass().getSimpleName()));
        com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(broadcastReceiver);
    }

    @Override // com.tencent.mm.booter.k
    public void registerBroadcasts() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioBroadcastHelper", "registerBroadcasts()");
        com.tencent.mm.plugin.audio.broadcast.bluetooth.BluetoothReceiver bluetoothReceiver = new com.tencent.mm.plugin.audio.broadcast.bluetooth.BluetoothReceiver();
        java.util.HashMap hashMap = this.f328626a;
        hashMap.put("BluetoothReceiver", bluetoothReceiver);
        a(bluetoothReceiver, new java.lang.String[]{"android.media.ACTION_SCO_AUDIO_STATE_UPDATED", "android.bluetooth.headset.profile.action.ACTIVE_DEVICE_CHANGED", "android.bluetooth.adapter.action.STATE_CHANGED", "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED", "android.bluetooth.device.action.ACL_DISCONNECTED", "android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED", "android.bluetooth.headset.action.SHORTCUT_ACTION"}, new java.lang.String[0]);
        com.tencent.mm.plugin.audio.broadcast.headset.HeadsetPlugReceiver headsetPlugReceiver = new com.tencent.mm.plugin.audio.broadcast.headset.HeadsetPlugReceiver();
        hashMap.put("HeadsetPlugReceiver", headsetPlugReceiver);
        a(headsetPlugReceiver, new java.lang.String[]{"android.intent.action.HEADSET_PLUG"}, new java.lang.String[0]);
        com.tencent.mm.plugin.audio.broadcast.base.BaseAudioReceiver baseAudioReceiver = new com.tencent.mm.plugin.audio.broadcast.base.BaseAudioReceiver();
        hashMap.put("BaseAudioReceiver", baseAudioReceiver);
        a(baseAudioReceiver, new java.lang.String[]{"android.media.AUDIO_BECOMING_NOISY"}, new java.lang.String[0]);
    }

    @Override // com.tencent.mm.booter.k
    public void unRegisterBroadcasts() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioBroadcastHelper", "unRegisterBroadcasts()");
        java.util.HashMap hashMap = this.f328626a;
        try {
            java.lang.Object obj = hashMap.get("BluetoothReceiver");
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.audio.broadcast.bluetooth.BluetoothReceiver");
            b((com.tencent.mm.plugin.audio.broadcast.bluetooth.BluetoothReceiver) obj);
            java.lang.Object obj2 = hashMap.get("HeadsetPlugReceiver");
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.audio.broadcast.headset.HeadsetPlugReceiver");
            b((com.tencent.mm.plugin.audio.broadcast.headset.HeadsetPlugReceiver) obj2);
            java.lang.Object obj3 = hashMap.get("BaseAudioReceiver");
            kotlin.jvm.internal.o.e(obj3, "null cannot be cast to non-null type com.tencent.mm.plugin.audio.broadcast.base.BaseAudioReceiver");
            b((com.tencent.mm.plugin.audio.broadcast.base.BaseAudioReceiver) obj3);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AudioBroadcastHelper", "unRegisterBroadcasts() Exception = %s ", e17.getMessage());
        }
    }
}
