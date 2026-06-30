package rh;

/* loaded from: classes12.dex */
public abstract class i1 {
    public static rh.f1 a(com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature$UidCpuStateSnapshot$IpcCpuStat$RemoteStat cpuStatFeature$UidCpuStateSnapshot$IpcCpuStat$RemoteStat) {
        rh.f1 f1Var = new rh.f1();
        f1Var.f395386e = new java.util.ArrayList(cpuStatFeature$UidCpuStateSnapshot$IpcCpuStat$RemoteStat.f52557d.size());
        java.util.Iterator it = cpuStatFeature$UidCpuStateSnapshot$IpcCpuStat$RemoteStat.f52557d.iterator();
        while (it.hasNext()) {
            f1Var.f395386e.add(rh.y2.a((long[]) it.next()));
        }
        return f1Var;
    }
}
