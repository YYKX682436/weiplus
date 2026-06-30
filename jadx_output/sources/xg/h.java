package xg;

/* loaded from: classes7.dex */
public class h implements android.location.LocationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.magicar.MagicAR f454353a;

    public h(com.tencent.magicar.MagicAR magicAR) {
        this.f454353a = magicAR;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(android.location.Location location) {
        long j17;
        java.lang.String unused;
        java.lang.String unused2;
        com.tencent.magicar.MagicAR magicAR = this.f454353a;
        unused = magicAR.TAG;
        int i17 = location.getProvider().equals("network") ? 1 : location.getProvider().equals("gps") ? 0 : -1;
        com.tencent.magicar.MagicAR magicAR2 = this.f454353a;
        j17 = magicAR2.mInst;
        magicAR2.onGpsLocationChanged(j17, location.getLatitude(), location.getLongitude(), location.getAccuracy(), location.getTime(), location.getElapsedRealtimeNanos(), location.getBearing(), location.getSpeed(), i17);
        unused2 = magicAR.TAG;
        location.toString();
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(java.lang.String str) {
        java.lang.String unused;
        unused = this.f454353a.TAG;
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(java.lang.String str) {
        java.lang.String unused;
        unused = this.f454353a.TAG;
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(java.lang.String str, int i17, android.os.Bundle bundle) {
        java.lang.String unused;
        unused = this.f454353a.TAG;
    }
}
