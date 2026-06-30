package z64;

/* loaded from: classes4.dex */
public class c implements y64.b {
    @Override // v64.c
    public boolean a(android.view.View view, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, v64.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderTopicAvatarAction");
        if (view == null || snsInfo == null || snsInfo.getAdXml() == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.FinderTopicAvatarAction", "the input param is invalid!!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderTopicAvatarAction");
            return false;
        }
        s34.b bVar = snsInfo.getAdXml().adAvatarFinderTopicInfo;
        if (bVar == null) {
            com.tencent.mars.xlog.Log.w("SnsAd.FinderTopicAvatarAction", "the avatarFinderTopicInfo is null return false!!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderTopicAvatarAction");
            return false;
        }
        boolean a17 = d44.i.a(view.getContext(), bVar.f402570a, bVar.f402571b, snsInfo, 6, dVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderTopicAvatarAction");
        return a17;
    }

    @Override // y64.b
    public void b(android.view.View view, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, v64.d dVar) {
        com.tencent.mm.modelsns.SnsAdClick snsAdClick;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderTopicAvatarAction");
        if (dVar != null && (snsAdClick = (com.tencent.mm.modelsns.SnsAdClick) dVar.a("ext_sns_ad_click", null)) != null) {
            a84.u0.a(snsAdClick, 46);
            ca4.z0.x0(snsAdClick);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdFinderTopicAvatarAction");
    }
}
