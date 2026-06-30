package zp3;

/* loaded from: classes12.dex */
public class a implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        rh.k1 k1Var = (rh.k1) ph.a.a(rh.k1.class);
        if (k1Var == null || !k1Var.y()) {
            return null;
        }
        rh.f1 w17 = k1Var.w();
        com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature$UidCpuStateSnapshot$IpcCpuStat$RemoteStat cpuStatFeature$UidCpuStateSnapshot$IpcCpuStat$RemoteStat = new com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature$UidCpuStateSnapshot$IpcCpuStat$RemoteStat();
        cpuStatFeature$UidCpuStateSnapshot$IpcCpuStat$RemoteStat.f52557d = new java.util.ArrayList(w17.f395386e.size());
        for (rh.y2 y2Var : w17.f395386e) {
            int size = y2Var.f395560a.size();
            long[] jArr = new long[size];
            for (int i17 = 0; i17 < size; i17++) {
                jArr[i17] = ((java.lang.Long) ((rh.x2) y2Var.f395560a.get(i17)).f395552a).longValue();
            }
            cpuStatFeature$UidCpuStateSnapshot$IpcCpuStat$RemoteStat.f52557d.add(jArr);
        }
        return cpuStatFeature$UidCpuStateSnapshot$IpcCpuStat$RemoteStat;
    }
}
