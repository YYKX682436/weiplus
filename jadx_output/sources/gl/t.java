package gl;

/* loaded from: classes14.dex */
public final class t extends android.media.AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gl.y f272773a;

    public t(gl.y yVar) {
        this.f272773a = yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac  */
    @Override // android.media.AudioDeviceCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAudioDevicesAdded(android.media.AudioDeviceInfo[] r18) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gl.t.onAudioDevicesAdded(android.media.AudioDeviceInfo[]):void");
    }

    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesRemoved(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
        gl.q qVar;
        super.onAudioDevicesRemoved(audioDeviceInfoArr);
        gl.y yVar = this.f272773a;
        if (audioDeviceInfoArr != null) {
            for (android.media.AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LEAudioProfile", "onAudioDevicesRemoved device is " + audioDeviceInfo.getAddress() + " and " + ((java.lang.Object) audioDeviceInfo.getProductName()));
                if ((audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 26) && (qVar = yVar.f272788c) != null) {
                    ((gl.i) qVar).nj(4, audioDeviceInfo.getProductName().toString());
                }
                if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 22 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4) {
                    yVar.f272731a = null;
                    gl.q qVar2 = yVar.f272788c;
                    if (qVar2 != null) {
                        ((gl.i) qVar2).nj(3, audioDeviceInfo.getProductName().toString());
                    }
                }
            }
        }
        kotlinx.coroutines.r2 r2Var = yVar.f272792g;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        yVar.f272791f = java.lang.Boolean.TRUE;
        yVar.l(new android.media.AudioDeviceInfo[0]);
    }
}
