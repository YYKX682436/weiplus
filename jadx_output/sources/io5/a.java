package io5;

/* loaded from: classes7.dex */
public final class a extends android.database.ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f293530a;

    public a(yz5.l lVar) {
        super(null);
        this.f293530a = lVar;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z17) {
        boolean z18 = android.provider.Settings.System.getInt(com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver(), "accelerometer_rotation", 0) == 0;
        yz5.l lVar = this.f293530a;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(z18));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AccelerometerRotationObserver", "onChange: " + z18);
    }
}
