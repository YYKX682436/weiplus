package he0;

/* loaded from: classes4.dex */
public class g extends com.tencent.mm.sdk.event.n {
    public g() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.CleanError0831EventListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.feature.sns.listener.CleanError0831EventListener");
        com.tencent.mm.plugin.sns.storage.e2 Ej = com.tencent.mm.plugin.sns.model.l4.Ej();
        Ej.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cleanError", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsExtStorage", "clean Error sql %s ret  %s", "update snsExtInfo3 set md5 = '', faults = '';", java.lang.Boolean.valueOf(Ej.f165971e.A("snsExtInfo3", "update snsExtInfo3 set md5 = '', faults = '';")));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cleanError", "com.tencent.mm.plugin.sns.storage.SnsExtStorage");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.CleanError0831EventListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.feature.sns.listener.CleanError0831EventListener");
        return false;
    }
}
