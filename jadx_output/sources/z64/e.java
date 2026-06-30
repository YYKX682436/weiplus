package z64;

/* loaded from: classes4.dex */
public class e implements y64.b {
    @Override // v64.c
    public boolean a(android.view.View view, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, v64.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdWeAppAvatarAction");
        if (view == null || snsInfo == null || snsInfo.getAdXml() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdWeAppAvatarAction");
            return false;
        }
        com.tencent.mm.plugin.sns.storage.y yVar = snsInfo.getAdXml().weAppInfo;
        if (yVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdWeAppAvatarAction");
            return false;
        }
        boolean y17 = com.tencent.mm.plugin.sns.ui.listener.i.y(yVar.f166171a, yVar.f166172b, yVar.f166173c, snsInfo, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdWeAppAvatarAction");
        return y17;
    }

    @Override // y64.b
    public void b(android.view.View view, int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, v64.d dVar) {
        com.tencent.mm.modelsns.SnsAdClick snsAdClick;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdWeAppAvatarAction");
        if (dVar != null && (snsAdClick = (com.tencent.mm.modelsns.SnsAdClick) dVar.a("ext_sns_ad_click", null)) != null) {
            a84.u0.a(snsAdClick, 31);
            ca4.z0.x0(snsAdClick);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("afterAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.avatar.impl.AdWeAppAvatarAction");
    }
}
