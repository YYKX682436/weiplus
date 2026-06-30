package he0;

/* loaded from: classes4.dex */
public class i5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f280725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280726e;

    public i5(he0.j5 j5Var, java.util.ArrayList arrayList, java.lang.String str) {
        this.f280725d = arrayList;
        this.f280726e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.storage.SnsInfo i17;
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine;
        r45.a90 a90Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListener$1");
        int i18 = com.tencent.mm.plugin.sns.model.e6.f164174a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkNeedUpdateSnsContentObjXml", "com.tencent.mm.plugin.sns.model.SnsLogic");
        java.util.ArrayList arrayList = this.f280725d;
        if (arrayList == null || arrayList.size() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkNeedUpdateSnsContentObjXml", "com.tencent.mm.plugin.sns.model.SnsLogic");
        } else {
            java.util.Iterator it = new java.util.ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) it.next(), 0);
                if (P != 0 && (i17 = com.tencent.mm.plugin.sns.model.l4.Fj().i1(P)) != null && (timeLine = i17.getTimeLine()) != null && (a90Var = timeLine.ContentObj) != null && a90Var.f369837e == 26) {
                    a90Var.f369842m = this.f280726e;
                    com.tencent.mm.plugin.sns.model.l4.Fj().w3(P, i17);
                    com.tencent.mm.autogen.events.ResendSnsEvent resendSnsEvent = new com.tencent.mm.autogen.events.ResendSnsEvent();
                    resendSnsEvent.f54706g.f8211a = P;
                    resendSnsEvent.e();
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkNeedUpdateSnsContentObjXml", "com.tencent.mm.plugin.sns.model.SnsLogic");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.feature.sns.listener.ResendSnsByUpdateXmlListener$1");
    }
}
