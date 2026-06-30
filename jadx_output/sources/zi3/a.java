package zi3;

/* loaded from: classes14.dex */
public final class a extends zi3.f {
    @Override // zi3.f, xm1.h
    public void o(int i17) {
        if (com.tencent.mm.plugin.multitalk.model.e3.Ri().f150176s == sj3.e4.Init) {
            super.o(i17);
            return;
        }
        switch (i17) {
            case 1:
            case 3:
            case 6:
            case 7:
                D(true);
                break;
            case 2:
                D(false);
                break;
            case 8:
                com.tencent.mars.xlog.Log.i("MicroMsg.ILinkAudioManager", " isHeadsetPlug connected, isBluetoothConnected: %s", java.lang.Boolean.valueOf(m(4)));
                this.f473171l &= D(false);
                break;
            case 9:
                com.tencent.mars.xlog.Log.i("MicroMsg.ILinkAudioManager", "isHeadsetPlugged disconnected, isBluetoothConnected: %s", java.lang.Boolean.valueOf(m(4)));
                this.f473171l = D(!m(4)) & this.f473171l;
                break;
        }
        super.o(i17);
    }
}
