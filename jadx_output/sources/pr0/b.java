package pr0;

/* loaded from: classes14.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr0.d f357809d;

    public b(pr0.d dVar) {
        this.f357809d = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = pr0.d.f357818w;
        this.f357809d.getClass();
        com.tencent.mm.autogen.mmdata.rpt.CameraxDowngradeStruct cameraxDowngradeStruct = new com.tencent.mm.autogen.mmdata.rpt.CameraxDowngradeStruct();
        cameraxDowngradeStruct.f55578d = java.lang.System.currentTimeMillis();
        cameraxDowngradeStruct.f55579e = cameraxDowngradeStruct.b("SystemVersion", android.os.Build.VERSION.INCREMENTAL, true);
        cameraxDowngradeStruct.k();
        nr0.a aVar = nr0.a.f339064a;
        nr0.a.f339068e.G("force_use_camera1", true);
    }
}
