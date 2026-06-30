package uh;

/* loaded from: classes12.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public long f427670a;

    /* renamed from: b, reason: collision with root package name */
    public uh.g f427671b;

    /* renamed from: c, reason: collision with root package name */
    public final uh.g f427672c;

    public f(uh.g gVar) {
        long j17 = gVar.f395363a;
        this.f427671b = gVar;
        uh.g gVar2 = new uh.g();
        this.f427672c = gVar2;
        gVar2.f427712u0 = new java.util.HashMap();
        gVar2.f427714v0 = new java.util.HashMap();
        gVar2.f427716w0 = new java.util.HashMap();
        gVar2.f427718x0 = new java.util.HashMap();
        gVar2.f427720y0 = new java.util.HashMap();
        gVar2.f427722z0 = new java.util.HashMap();
    }

    public static void a(java.lang.String str, long j17, long j18) {
        if (j17 <= j18) {
            return;
        }
        throw new java.lang.IllegalStateException("negative stats: " + str);
    }

    public static boolean b(uh.g gVar, uh.g gVar2) {
        try {
            a("cpuPowerMams", ((java.lang.Long) gVar.f427711u.f395552a).longValue(), ((java.lang.Long) gVar2.f427711u.f395552a).longValue());
            a("cpuUsrTimeMs", ((java.lang.Long) gVar.f427713v.f395552a).longValue(), ((java.lang.Long) gVar2.f427713v.f395552a).longValue());
            a("cpuSysTimeMs", ((java.lang.Long) gVar.f427715w.f395552a).longValue(), ((java.lang.Long) gVar2.f427715w.f395552a).longValue());
            a("realTimeMs", ((java.lang.Long) gVar.f427717x.f395552a).longValue(), ((java.lang.Long) gVar2.f427717x.f395552a).longValue());
            a("upTimeMs", ((java.lang.Long) gVar.f427719y.f395552a).longValue(), ((java.lang.Long) gVar2.f427719y.f395552a).longValue());
            a("offRealTimeMs", ((java.lang.Long) gVar.f427721z.f395552a).longValue(), ((java.lang.Long) gVar2.f427721z.f395552a).longValue());
            a("offUpTimeMs", ((java.lang.Long) gVar.A.f395552a).longValue(), ((java.lang.Long) gVar2.A.f395552a).longValue());
            a("mobilePowerMams", ((java.lang.Long) gVar.B.f395552a).longValue(), ((java.lang.Long) gVar2.B.f395552a).longValue());
            a("mobileRadioActiveMs", ((java.lang.Long) gVar.C.f395552a).longValue(), ((java.lang.Long) gVar2.C.f395552a).longValue());
            a("mobileIdleMs", ((java.lang.Long) gVar.D.f395552a).longValue(), ((java.lang.Long) gVar2.D.f395552a).longValue());
            a("mobileRxMs", ((java.lang.Long) gVar.E.f395552a).longValue(), ((java.lang.Long) gVar2.E.f395552a).longValue());
            a("mobileTxMs", ((java.lang.Long) gVar.F.f395552a).longValue(), ((java.lang.Long) gVar2.F.f395552a).longValue());
            a("mobileRxBytes", ((java.lang.Long) gVar.G.f395552a).longValue(), ((java.lang.Long) gVar2.G.f395552a).longValue());
            a("mobileTxBytes", ((java.lang.Long) gVar.H.f395552a).longValue(), ((java.lang.Long) gVar2.H.f395552a).longValue());
            a("mobileRxPackets", ((java.lang.Long) gVar.I.f395552a).longValue(), ((java.lang.Long) gVar2.I.f395552a).longValue());
            a("mobileTxPackets", ((java.lang.Long) gVar.f427673J.f395552a).longValue(), ((java.lang.Long) gVar2.f427673J.f395552a).longValue());
            a("wifiPowerMams", ((java.lang.Long) gVar.K.f395552a).longValue(), ((java.lang.Long) gVar2.K.f395552a).longValue());
            a("wifiIdleMs", ((java.lang.Long) gVar.L.f395552a).longValue(), ((java.lang.Long) gVar2.L.f395552a).longValue());
            a("wifiRxMs", ((java.lang.Long) gVar.M.f395552a).longValue(), ((java.lang.Long) gVar2.M.f395552a).longValue());
            a("wifiTxMs", ((java.lang.Long) gVar.N.f395552a).longValue(), ((java.lang.Long) gVar2.N.f395552a).longValue());
            a("wifiRunningMs", ((java.lang.Long) gVar.O.f395552a).longValue(), ((java.lang.Long) gVar2.O.f395552a).longValue());
            a("wifiLockMs", ((java.lang.Long) gVar.P.f395552a).longValue(), ((java.lang.Long) gVar2.P.f395552a).longValue());
            a("wifiScanMs", ((java.lang.Long) gVar.Q.f395552a).longValue(), ((java.lang.Long) gVar2.Q.f395552a).longValue());
            a("wifiMulticastMs", ((java.lang.Long) gVar.R.f395552a).longValue(), ((java.lang.Long) gVar2.R.f395552a).longValue());
            a("wifiRxBytes", ((java.lang.Long) gVar.S.f395552a).longValue(), ((java.lang.Long) gVar2.S.f395552a).longValue());
            a("wifiTxBytes", ((java.lang.Long) gVar.T.f395552a).longValue(), ((java.lang.Long) gVar2.T.f395552a).longValue());
            a("wifiRxPackets", ((java.lang.Long) gVar.U.f395552a).longValue(), ((java.lang.Long) gVar2.U.f395552a).longValue());
            a("wifiTxPackets", ((java.lang.Long) gVar.V.f395552a).longValue(), ((java.lang.Long) gVar2.V.f395552a).longValue());
            a("blueToothPowerMams", ((java.lang.Long) gVar.W.f395552a).longValue(), ((java.lang.Long) gVar2.W.f395552a).longValue());
            a("blueToothIdleMs", ((java.lang.Long) gVar.X.f395552a).longValue(), ((java.lang.Long) gVar2.X.f395552a).longValue());
            a("blueToothRxMs", ((java.lang.Long) gVar.Y.f395552a).longValue(), ((java.lang.Long) gVar2.Y.f395552a).longValue());
            a("blueToothTxMs", ((java.lang.Long) gVar.Z.f395552a).longValue(), ((java.lang.Long) gVar2.Z.f395552a).longValue());
            a("wakelocksPartialMs", ((java.lang.Long) gVar.f427674a0.f395552a).longValue(), ((java.lang.Long) gVar2.f427674a0.f395552a).longValue());
            a("wakelocksFullMs", ((java.lang.Long) gVar.f427675b0.f395552a).longValue(), ((java.lang.Long) gVar2.f427675b0.f395552a).longValue());
            a("wakelocksWindowMs", ((java.lang.Long) gVar.f427676c0.f395552a).longValue(), ((java.lang.Long) gVar2.f427676c0.f395552a).longValue());
            a("wakelocksDrawMs", ((java.lang.Long) gVar.f427678d0.f395552a).longValue(), ((java.lang.Long) gVar2.f427678d0.f395552a).longValue());
            a("wakelocksPidSum", ((java.lang.Long) gVar.f427680e0.f395552a).longValue(), ((java.lang.Long) gVar2.f427680e0.f395552a).longValue());
            a("gpsMs", ((java.lang.Long) gVar.f427682f0.f395552a).longValue(), ((java.lang.Long) gVar2.f427682f0.f395552a).longValue());
            a("sensorsPowerMams", ((java.lang.Long) gVar.f427684g0.f395552a).longValue(), ((java.lang.Long) gVar2.f427684g0.f395552a).longValue());
            a("cameraMs", ((java.lang.Long) gVar.f427686h0.f395552a).longValue(), ((java.lang.Long) gVar2.f427686h0.f395552a).longValue());
            a("flashLightMs", ((java.lang.Long) gVar.f427688i0.f395552a).longValue(), ((java.lang.Long) gVar2.f427688i0.f395552a).longValue());
            a("audioMs", ((java.lang.Long) gVar.f427690j0.f395552a).longValue(), ((java.lang.Long) gVar2.f427690j0.f395552a).longValue());
            a("videoMs", ((java.lang.Long) gVar.f427692k0.f395552a).longValue(), ((java.lang.Long) gVar2.f427692k0.f395552a).longValue());
            a("jobsMs", ((java.lang.Long) gVar.f427694l0.f395552a).longValue(), ((java.lang.Long) gVar2.f427694l0.f395552a).longValue());
            a("syncMs", ((java.lang.Long) gVar.f427696m0.f395552a).longValue(), ((java.lang.Long) gVar2.f427696m0.f395552a).longValue());
            return true;
        } catch (java.lang.Exception e17) {
            oj.j.f("Matrix.battery.HealthStats", "skip, " + e17.getMessage(), new java.lang.Object[0]);
            return false;
        }
    }
}
