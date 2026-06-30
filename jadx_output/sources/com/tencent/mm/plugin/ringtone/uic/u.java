package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class u implements f25.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.v f158492d;

    public u(com.tencent.mm.plugin.ringtone.uic.v vVar) {
        this.f158492d = vVar;
    }

    @Override // f25.f
    public void c(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneDataUIC", "onPause, loss audio focus");
        this.f158492d.O6();
    }

    @Override // f25.f
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneDataUIC", "onResume, gain audio focus");
        this.f158492d.P6();
    }

    @Override // f25.f
    public void onStop() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtoneDataUIC", "onStop, loss audio focus");
        this.f158492d.O6();
    }
}
