package v64;

/* loaded from: classes4.dex */
public abstract class b implements v64.c {
    public b(android.content.Context context) {
    }

    @Override // v64.c
    public boolean a(android.view.View view, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, v64.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionWrapper");
        if (view == null || snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionWrapper");
            return false;
        }
        try {
            v64.c d17 = d(snsInfo, dVar);
            if (d17 != null) {
                boolean a17 = d17.a(view, i17, snsInfo, dVar);
                if (a17) {
                    c(d17, view, i17, snsInfo, dVar);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionWrapper");
                return a17;
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionWrapper");
        return false;
    }

    public void c(v64.c cVar, android.view.View view, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, v64.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionWrapper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionWrapper");
    }

    public abstract v64.c d(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, v64.d dVar);
}
