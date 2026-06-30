package ua1;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f425918a = false;

    /* renamed from: b, reason: collision with root package name */
    public long f425919b = 0;

    /* renamed from: c, reason: collision with root package name */
    public short f425920c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f425921d = 0;

    /* renamed from: e, reason: collision with root package name */
    public byte[] f425922e = null;

    public synchronized byte[] a() {
        if (!this.f425918a) {
            return null;
        }
        try {
            int nativeMixerGetMixedPCM = com.tencent.mm.plugin.ap.WVAPJNI.nativeMixerGetMixedPCM(this.f425919b, this.f425922e, this.f425920c);
            if (nativeMixerGetMixedPCM <= 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAudioMixer", "[hilive] getData " + nativeMixerGetMixedPCM);
            }
            return this.f425922e;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameLiveAudioMixer", "[hilive] nativeMixerGetMixedPCM Exception " + e17.getMessage());
            return null;
        } catch (java.lang.UnsatisfiedLinkError e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameLiveAudioMixer", "[hilive] nativeMixerGetMixedPCM UnsatisfiedLinkError " + e18.getMessage());
            return null;
        }
    }

    public synchronized boolean b(int i17, short s17) {
        int i18;
        try {
            try {
                try {
                    if (this.f425918a) {
                        i18 = 0;
                    } else {
                        i18 = com.tencent.mm.plugin.ap.WVAPJNI.nativeInitMixerFunc("libvoipCodec.so");
                        this.f425919b = com.tencent.mm.plugin.ap.WVAPJNI.nativeMixerInit(128, i17, 40);
                        this.f425918a = true;
                        this.f425920c = s17;
                        int i19 = 2 * (((s17 * i17) * 40) / 1000);
                        this.f425921d = i19;
                        this.f425922e = new byte[i19];
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameLiveAudioMixer", "[hilive] init outputSamplerate: " + i17 + " outputChannel: " + ((int) s17) + " outputSize: " + this.f425921d + " handle: " + this.f425919b + " code: " + i18);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.GameLiveAudioMixer", e17.getMessage());
                    return this.f425918a;
                }
            } catch (java.lang.UnsatisfiedLinkError e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GameLiveAudioMixer", e18.getMessage());
                return this.f425918a;
            }
        } catch (java.lang.Throwable unused) {
            return this.f425918a;
        }
        return this.f425918a;
    }

    public synchronized boolean c(short s17, short s18, int i17, byte[] bArr) {
        if (!this.f425918a) {
            return false;
        }
        try {
            com.tencent.mm.plugin.ap.WVAPJNI.nativeMixerInsertRawPCM(this.f425919b, (short) (((40 * i17) / 1000) << 1), s17, s18, i17, bArr);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameLiveAudioMixer", "[hilive] nativeMixerInsertRawPCM Exception " + e17.getMessage());
        } catch (java.lang.UnsatisfiedLinkError e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GameLiveAudioMixer", "[hilive] nativeMixerInsertRawPCM UnsatisfiedLinkError " + e18.getMessage());
        }
        return true;
    }
}
