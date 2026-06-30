package mq1;

@j95.b(dependencies = {com.tencent.mm.plugin.zero.m1.class})
/* loaded from: classes12.dex */
public class a extends i95.w {
    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
        if (gm0.m.r()) {
            return;
        }
        gm0.j1.b().f273246i = true;
        gm0.m b17 = gm0.j1.b();
        if (!b17.m()) {
            synchronized (b17.f273240c) {
                if (!b17.m()) {
                    try {
                        if (wo.w0.s()) {
                            com.tencent.mm.autogen.mmdata.rpt.DeviceIdChangeStatStruct deviceIdChangeStatStruct = new com.tencent.mm.autogen.mmdata.rpt.DeviceIdChangeStatStruct();
                            deviceIdChangeStatStruct.f55791d = deviceIdChangeStatStruct.b("PreFirstInstallTime", wo.w0.f447856r, true);
                            deviceIdChangeStatStruct.f55792e = deviceIdChangeStatStruct.b("CurFirstInstallTime", wo.w0.d(), true);
                            deviceIdChangeStatStruct.f55793f = deviceIdChangeStatStruct.b("PreAndroidId", wo.w0.f447857s, true);
                            deviceIdChangeStatStruct.f55794g = deviceIdChangeStatStruct.b("CurAndroidId", wo.w0.c(), true);
                            deviceIdChangeStatStruct.f55795h = deviceIdChangeStatStruct.b("PreDeviceModel", wo.w0.f447858t, true);
                            deviceIdChangeStatStruct.f55796i = deviceIdChangeStatStruct.b("CurDeviceModel", wo.w0.m(), true);
                            deviceIdChangeStatStruct.k();
                        }
                    } catch (java.lang.Error e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MMKernel.CoreAccount", e17, null, new java.lang.Object[0]);
                    }
                    int a17 = gm0.l.a(gm0.m.f273233v);
                    if (a17 != 0) {
                        b17.f273251n = android.os.SystemClock.elapsedRealtime();
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        com.tencent.mars.xlog.Log.w("MMKernel.CoreAccount", "auto set up account storage uin: %d, stack: %s", java.lang.Integer.valueOf(a17), new com.tencent.mm.sdk.platformtools.z3());
                        b17.p(false);
                    }
                }
            }
        }
        gm0.j1.b().f273246i = false;
    }
}
