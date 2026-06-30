package ew1;

/* loaded from: classes14.dex */
public final class a extends xm1.j {

    /* renamed from: k, reason: collision with root package name */
    public boolean f257031k;

    /* renamed from: l, reason: collision with root package name */
    public com.tencent.mm.plugin.voip.model.e f257032l;

    /* renamed from: m, reason: collision with root package name */
    public final fp.e f257033m = new fp.e(com.tencent.mm.sdk.platformtools.x2.f193071a);

    public a() {
        ym1.e eVar = ym1.f.f463134h;
        eVar.d().f463135d.registerBroadcasts();
        i();
        eVar.h(this, "openvoice");
    }

    public final boolean D(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoiceAudioManager", "setSpeakerPhoneOn, isSpeakerPhoneOn: %b", java.lang.Boolean.valueOf(z17));
        A(z17);
        com.tencent.mm.plugin.voip.model.e eVar = this.f257032l;
        if (!((eVar == null || eVar.f176438a) ? false : true)) {
            return false;
        }
        kotlin.jvm.internal.o.d(eVar);
        return eVar.j(z17);
    }

    @Override // xm1.h
    public void o(int i17) {
        super.o(i17);
        switch (i17) {
            case 1:
            case 3:
            case 6:
            case 7:
                this.f257031k &= D(true);
                return;
            case 2:
                this.f257031k &= D(false);
                return;
            case 4:
            case 5:
            default:
                return;
            case 8:
                com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoiceAudioManager", " isHeadsetPlug connected, isBluetoothConnected: %s", java.lang.Boolean.valueOf(m(4)));
                this.f257031k &= D(false);
                return;
            case 9:
                com.tencent.mars.xlog.Log.i("MicroMsg.OpenVoiceAudioManager", "isHeadsetPlugged disconnected, isBluetoothConnected: %s", java.lang.Boolean.valueOf(m(4)));
                this.f257031k = D(!m(4)) & this.f257031k;
                return;
        }
    }
}
