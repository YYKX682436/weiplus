package zp3;

/* loaded from: classes12.dex */
public class b implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger = (com.tencent.mm.ipcinvoker.type.IPCInteger) obj;
        com.tencent.matrix.batterycanary.monitor.feature.c cVar = (com.tencent.matrix.batterycanary.monitor.feature.c) ph.a.a(com.tencent.matrix.batterycanary.monitor.feature.c.class);
        if (cVar == null) {
            return null;
        }
        com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot b17 = com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.b(com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$ProcessInfo.a(iPCInteger.f68404d, true), cVar.f395294a.f363335d.f363297p);
        com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies = new com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies();
        jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.f52585d = b17.f52558d;
        jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.f52586e = b17.f52560f;
        jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.f52588g = ((java.lang.Integer) b17.f52563i.f395552a).intValue();
        jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.f52587f = ((java.lang.Long) b17.f52561g.f395552a).longValue();
        jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.f52589h = new java.util.ArrayList(b17.f52562h.f395560a.size());
        for (com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$JiffiesSnapshot.ThreadJiffiesSnapshot threadJiffiesSnapshot : b17.f52562h.f395560a) {
            java.util.List list = jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.f52589h;
            com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.IpcThreadJiffies ipcThreadJiffies = new com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies.IpcThreadJiffies();
            ipcThreadJiffies.f52590d = threadJiffiesSnapshot.f52565b;
            ipcThreadJiffies.f52591e = threadJiffiesSnapshot.f52566c;
            ipcThreadJiffies.f52592f = threadJiffiesSnapshot.f52568e;
            ipcThreadJiffies.f52593g = ((java.lang.Long) threadJiffiesSnapshot.f395552a).longValue();
            list.add(ipcThreadJiffies);
        }
        return jiffiesMonitorFeature$UidJiffiesSnapshot$IpcJiffies$IpcProcessJiffies;
    }
}
