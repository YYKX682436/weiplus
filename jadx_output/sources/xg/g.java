package xg;

/* loaded from: classes7.dex */
public class g extends android.location.GnssStatus.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicar.MagicAR f454352a;

    public g(com.tencent.magicar.MagicAR magicAR) {
        this.f454352a = magicAR;
    }

    @Override // android.location.GnssStatus.Callback
    public void onFirstFix(int i17) {
    }

    @Override // android.location.GnssStatus.Callback
    public void onSatelliteStatusChanged(android.location.GnssStatus gnssStatus) {
        long j17;
        java.lang.String unused;
        unused = this.f454352a.TAG;
        gnssStatus.getSatelliteCount();
        int satelliteCount = gnssStatus.getSatelliteCount();
        float[] fArr = new float[satelliteCount];
        float[] fArr2 = new float[satelliteCount];
        float[] fArr3 = new float[satelliteCount];
        float[] fArr4 = new float[satelliteCount];
        int[] iArr = new int[satelliteCount];
        for (int i17 = 0; i17 < satelliteCount; i17++) {
            fArr[i17] = gnssStatus.getAzimuthDegrees(i17);
            fArr2[i17] = gnssStatus.getCn0DbHz(i17);
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                fArr4[i17] = gnssStatus.getCarrierFrequencyHz(i17);
            }
            iArr[i17] = gnssStatus.getConstellationType(i17);
        }
        com.tencent.magicar.MagicAR magicAR = this.f454352a;
        j17 = magicAR.mInst;
        magicAR.onGnssStatusChanged(j17, satelliteCount, fArr, fArr2, fArr3, fArr4, iArr);
    }

    @Override // android.location.GnssStatus.Callback
    public void onStarted() {
        java.lang.String unused;
        com.tencent.magicar.MagicAR magicAR = this.f454352a;
        magicAR.nativePrintLog("on start.");
        unused = magicAR.TAG;
    }

    @Override // android.location.GnssStatus.Callback
    public void onStopped() {
    }
}
