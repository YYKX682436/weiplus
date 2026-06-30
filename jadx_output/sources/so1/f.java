package so1;

/* loaded from: classes5.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ po1.d f410236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ro1.h f410237e;

    public f(po1.d dVar, ro1.h hVar) {
        this.f410236d = dVar;
        this.f410237e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        po1.d device = this.f410236d;
        kotlin.jvm.internal.o.g(device, "device");
        java.lang.String e17 = so1.b.f410226a.e(device.f357300f);
        com.tencent.mars.xlog.Log.i("DirectDiskDeviceDelegate", "Try save new device. device=" + device + ", accessRoot=" + e17);
        boolean z17 = false;
        if (e17 == null || e17.length() == 0) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        } else {
            z17 = ro1.v.f398014a.h(device, new so1.d(e17));
        }
        nf.e.f(new so1.e(device, z17, this.f410237e));
    }
}
