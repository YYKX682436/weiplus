package kl;

/* loaded from: classes13.dex */
public class i extends kl.e {
    public i(java.lang.String str, int i17, int i18, int i19, int i27, int i28, int i29) {
        this(str, i17, i18, i19, i27, i28, i29, 1);
    }

    public i(java.lang.String str, int i17, int i18, int i19, int i27, int i28, int i29, int i37) {
        super(i37);
        java.lang.Object[] objArr = {str, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(i29)};
        int i38 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioVariableConvertProcess", "AudioVariableConvertProcess src:%s, srcSampleRate:%d, srcChannels:%d, srcBitDepth:%d, desSampleRate:%d, desChannels:%d, desBitDepth:%d", objArr);
        this.f308721l = rl.a.a(str);
        kl.d.a();
        if (i27 > 0) {
            this.f308715f = i27;
        }
        if (i28 > 0) {
            this.f308716g = i28;
        }
        if (i27 > 0) {
            this.f308717h = i29;
        }
        g(i17, i18, i19);
    }
}
