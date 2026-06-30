package df2;

/* loaded from: classes10.dex */
public final class ra extends tn0.m1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.zb f231240a;

    public ra(df2.zb zbVar) {
        this.f231240a = zbVar;
    }

    @Override // com.tencent.trtc.TRTCCloudListener.TRTCAudioFrameListener
    public void onCapturedAudioFrame(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame tRTCAudioFrame) {
        byte[] bArr;
        byte[] bArr2;
        if (tRTCAudioFrame == null || (bArr = tRTCAudioFrame.data) == null) {
            return;
        }
        df2.zb zbVar = this.f231240a;
        int i17 = tRTCAudioFrame.sampleRate;
        int i18 = tRTCAudioFrame.channel;
        zbVar.getClass();
        if ((bArr.length == 0) || i17 <= 0 || i18 <= 0) {
            bArr2 = new byte[0];
        } else {
            int length = bArr.length / 2;
            short[] sArr = new short[length];
            for (int i19 = 0; i19 < length; i19++) {
                int i27 = i19 * 2;
                sArr[i19] = (short) (((bArr[i27 + 1] << 8) & 65280) | (bArr[i27] & 255));
            }
            if (i18 >= 2) {
                int i28 = length / 2;
                short[] sArr2 = new short[i28];
                for (int i29 = 0; i29 < i28; i29++) {
                    sArr2[i29] = sArr[i29 * 2];
                }
                sArr = sArr2;
            }
            if (i17 == 16000) {
                bArr2 = new byte[sArr.length * 2];
                int length2 = sArr.length;
                for (int i37 = 0; i37 < length2; i37++) {
                    int i38 = i37 * 2;
                    short s17 = sArr[i37];
                    bArr2[i38] = (byte) (s17 & 255);
                    bArr2[i38 + 1] = (byte) ((s17 >> 8) & 255);
                }
            } else {
                int i39 = i17 / 16000;
                if (i39 <= 0) {
                    bArr2 = new byte[0];
                } else {
                    int f17 = e06.p.f(i39, 1, 8);
                    int length3 = sArr.length / i39;
                    short[] sArr3 = new short[length3];
                    for (int i47 = 0; i47 < length3; i47++) {
                        int i48 = i47 * i39;
                        int i49 = i48 + f17;
                        int length4 = sArr.length;
                        if (i49 > length4) {
                            i49 = length4;
                        }
                        int i57 = 0;
                        int i58 = 0;
                        while (i48 < i49) {
                            i57 += sArr[i48];
                            i58++;
                            i48++;
                        }
                        sArr3[i47] = (short) (i57 / i58);
                    }
                    bArr2 = new byte[length3 * 2];
                    for (int i59 = 0; i59 < length3; i59++) {
                        int i66 = i59 * 2;
                        short s18 = sArr3[i59];
                        bArr2[i66] = (byte) (s18 & 255);
                        bArr2[i66 + 1] = (byte) ((s18 >> 8) & 255);
                    }
                }
            }
        }
        if (!(bArr2.length == 0)) {
            rh2.e eVar = rh2.e.f395641a;
            if (!rh2.e.f395644d || rh2.e.f395643c == -1) {
                return;
            }
            synchronized (eVar) {
                if (!rh2.e.f395644d || rh2.e.f395643c == -1) {
                    return;
                }
                try {
                    int AddData = rh2.e.f395642b.AddData(rh2.e.f395643c, bArr2);
                    if (AddData == -1) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.KWSEngine", "AddData returned error");
                    } else if (AddData != 0 && AddData == 1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.KWSEngine", "AddData returned FINISHED");
                        eVar.b();
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.KWSEngine", "processAudio error: " + e17.getMessage());
                }
            }
        }
    }
}
