package com.tencent.mm.plugin.sns.statistics;

/* loaded from: classes4.dex */
public abstract class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Vector f165004a = new java.util.Vector();

    public m21.w a(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getByBindKey", "com.tencent.mm.plugin.sns.statistics.Ss_log_base_helper");
        if (obj == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getByBindKey", "com.tencent.mm.plugin.sns.statistics.Ss_log_base_helper");
            return null;
        }
        java.util.Vector vector = this.f165004a;
        try {
            java.util.Iterator it = vector.iterator();
            while (it.hasNext()) {
                m21.w wVar = (m21.w) it.next();
                if (obj.equals(wVar.f323003a)) {
                    vector.remove(wVar);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getByBindKey", "com.tencent.mm.plugin.sns.statistics.Ss_log_base_helper");
                    return wVar;
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Ss_log_base_helper", "report by key " + e17.getMessage() + " " + obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getByBindKey", "com.tencent.mm.plugin.sns.statistics.Ss_log_base_helper");
        return null;
    }

    public boolean b(m21.w wVar) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateBySeq", "com.tencent.mm.plugin.sns.statistics.Ss_log_base_helper");
        java.util.Vector vector = this.f165004a;
        java.util.Iterator it = vector.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            m21.w wVar2 = (m21.w) it.next();
            if (wVar2.f323007e == wVar.f323007e) {
                vector.remove(wVar2);
                z17 = true;
                break;
            }
        }
        vector.add(wVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBySeq", "com.tencent.mm.plugin.sns.statistics.Ss_log_base_helper");
        return z17;
    }
}
