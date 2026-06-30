package y64;

/* loaded from: classes4.dex */
public class a extends v64.b {
    @Override // v64.b
    public void c(v64.c cVar, android.view.View view, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, v64.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
        y64.b bVar = (y64.b) cVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
        if (bVar != null) {
            bVar.b(view, i17, snsInfo, dVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
    }

    @Override // v64.b
    public v64.c d(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, v64.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
        v64.c cVar = null;
        if (snsInfo == null || snsInfo.getAdXml() == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.AdAvatarClicker", "the sns info or adxml is null!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
        } else {
            int i17 = snsInfo.getAdXml().headClickType;
            if (i17 == 2) {
                cVar = new z64.a();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
            } else if (i17 == 3) {
                cVar = new z64.e();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
            } else if (i17 == 4) {
                cVar = new z64.b();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
            } else if (i17 == 5) {
                cVar = new z64.c();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
            } else if (i17 == 6) {
                cVar = new z64.d();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeActionImpl", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.AdAvatarActionWrapper");
        return cVar;
    }
}
