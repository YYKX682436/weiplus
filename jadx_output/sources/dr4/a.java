package dr4;

/* loaded from: classes14.dex */
public final class a extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f242588a;

    public a(yz5.l lVar) {
        super(null);
        this.f242588a = lVar;
        boolean a17 = a();
        qq4.b wi6 = gq4.v.wi();
        wi6.f365972f = a17;
        wi6.f365973g.postValue(java.lang.Boolean.valueOf(a17));
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(a17));
        }
    }

    public final boolean a() {
        try {
            int i17 = android.provider.Settings.System.getInt(com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver(), "accelerometer_rotation", 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.VoIPRenderMgr", "accRotation=" + i17);
            return i17 == 0;
        } catch (java.lang.Exception unused) {
            return true;
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        boolean a17 = a();
        qq4.b wi6 = gq4.v.wi();
        boolean a18 = a();
        wi6.f365972f = a18;
        wi6.f365973g.postValue(java.lang.Boolean.valueOf(a18));
        yz5.l lVar = this.f242588a;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(a17));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AccelerometerRotationObserver", "systemRotateLocked now " + a17);
    }
}
