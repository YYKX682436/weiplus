package iq;

/* loaded from: classes14.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iq.d f293624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f293625e;

    public c(iq.d dVar, android.content.Context context) {
        this.f293624d = dVar;
        this.f293625e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        iq.d dVar = this.f293624d;
        try {
            com.tencent.mm.autogen.mmdata.rpt.DeviceSupportStruct deviceSupportStruct = new com.tencent.mm.autogen.mmdata.rpt.DeviceSupportStruct();
            deviceSupportStruct.f55814u = deviceSupportStruct.b("BuildTag", com.tencent.mm.sdk.platformtools.y.a(com.tencent.mm.sdk.platformtools.z.f193105a, lp0.a.f320252f) + '|' + com.tencent.mm.sdk.platformtools.z.f193109e, true);
            iq.d.Ui(dVar, deviceSupportStruct);
            iq.d.wi(dVar, deviceSupportStruct);
            iq.d.Ai(dVar, deviceSupportStruct);
            iq.d.Di(dVar, deviceSupportStruct);
            iq.d.Ri(dVar, deviceSupportStruct);
            iq.d.Ni(dVar, deviceSupportStruct, this.f293625e);
            iq.d.Bi(dVar, deviceSupportStruct);
            deviceSupportStruct.f55818y = deviceSupportStruct.b("Idc", ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ri(32) ? "cdn" : "http", true);
            deviceSupportStruct.k();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.DeviceSupportTask", e17, "print device support error", new java.lang.Object[0]);
        }
    }
}
