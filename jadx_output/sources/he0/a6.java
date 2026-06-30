package he0;

/* loaded from: classes11.dex */
public class a6 extends com.tencent.mm.sdk.event.n {
    public a6() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListener");
        com.tencent.mm.autogen.events.SnsPermissionNotifyEvent snsPermissionNotifyEvent = (com.tencent.mm.autogen.events.SnsPermissionNotifyEvent) iEvent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListener");
        am.jw jwVar = snsPermissionNotifyEvent.f54827g;
        if (jwVar == null || !jwVar.f7102a || android.text.TextUtils.isEmpty(jwVar.f7103b)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListener");
        } else {
            am.jw jwVar2 = snsPermissionNotifyEvent.f54827g;
            if (jwVar2.f7104c) {
                ea4.a.f250682a.add(jwVar2.f7103b);
            } else {
                ea4.a.f250682a.remove(jwVar2.f7103b);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListener");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.SnsPermissionNotifyListener");
        return false;
    }
}
