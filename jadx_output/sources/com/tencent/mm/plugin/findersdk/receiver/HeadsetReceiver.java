package com.tencent.mm.plugin.findersdk.receiver;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/findersdk/receiver/HeadsetReceiver;", "Landroid/content/BroadcastReceiver;", "Lfz2/a;", "<init>", "()V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class HeadsetReceiver extends android.content.BroadcastReceiver implements fz2.a {

    /* renamed from: d, reason: collision with root package name */
    public fz2.b f136976d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f136977e;

    public boolean a() {
        xm1.h hVar = (xm1.h) ((bv.a) ((cv.s0) i95.n0.c(cv.s0.class))).wi();
        boolean l17 = hVar.l();
        boolean j17 = hVar.j();
        com.tencent.mars.xlog.Log.i("HeadsetReceiver", "isHeadsetOn isHeadsetPlugged:" + l17 + " isBluetoothOn:" + j17);
        return l17 || j17;
    }

    public void b(android.content.Context context, fz2.b bVar) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("HeadsetReceiver", "register stateChangeListener：" + bVar);
        this.f136976d = bVar;
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.media.AUDIO_BECOMING_NOISY");
        context.registerReceiver(this, intentFilter);
        intentFilter.addAction("android.intent.action.HEADSET_PLUG");
        context.registerReceiver(this, intentFilter);
        this.f136977e = true;
        intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        context.registerReceiver(this, intentFilter);
        fz2.b bVar2 = this.f136976d;
        if (bVar2 != null) {
            bVar2.M7(a());
        }
    }

    public void c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("HeadsetReceiver", "unRegister");
        try {
            if (this.f136977e) {
                context.unregisterReceiver(this);
                this.f136977e = false;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("HeadsetReceiver", "unregisterReceiver(HeadsetPlugReceiver.this) error:%s", e17.getMessage());
        }
        this.f136976d = null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        com.tencent.mars.xlog.Log.i("HeadsetReceiver", "headset onReceive %s  %d", intent.getAction(), java.lang.Integer.valueOf(intent.getIntExtra("state", 0)));
        java.lang.String action = intent.getAction();
        if (kotlin.jvm.internal.o.b("android.media.AUDIO_BECOMING_NOISY", action)) {
            com.tencent.mars.xlog.Log.i("HeadsetReceiver", "headset onReceive 耳机断开");
            fz2.b bVar = this.f136976d;
            if (bVar != null) {
                kotlin.jvm.internal.o.d(bVar);
                bVar.M7(false);
                return;
            }
            return;
        }
        if (intent.getAction() != null && kotlin.jvm.internal.o.b(intent.getAction(), "android.intent.action.HEADSET_PLUG")) {
            if (intent.getIntExtra("state", -1) == 1) {
                com.tencent.mars.xlog.Log.i("HeadsetReceiver", "headset onReceive 有线耳机连接");
                fz2.b bVar2 = this.f136976d;
                if (bVar2 != null) {
                    kotlin.jvm.internal.o.d(bVar2);
                    bVar2.M7(true);
                    return;
                }
                return;
            }
            return;
        }
        if (android.text.TextUtils.equals(action, "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED") && intent.getIntExtra("android.bluetooth.profile.extra.STATE", -1) == 2) {
            com.tencent.mars.xlog.Log.i("HeadsetReceiver", "headset onReceive 蓝牙耳机连接");
            fz2.b bVar3 = this.f136976d;
            if (bVar3 != null) {
                kotlin.jvm.internal.o.d(bVar3);
                bVar3.M7(true);
            }
        }
    }
}
