package com.tencent.mm.plugin.webview.model;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroid/os/Bundle;", "kotlin.jvm.PlatformType", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<anonymous parameter 1>", "Ljz5/f0;", "invoke", "(Landroid/os/Bundle;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class b5<InputType, ResultType> implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.model.b5 f182795d = new com.tencent.mm.plugin.webview.model.b5();

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("reportAdH5Load");
        if (stringArrayList == null || !(!stringArrayList.isEmpty())) {
            return;
        }
        com.tencent.mm.autogen.events.ReportAdH5LoadEvent reportAdH5LoadEvent = new com.tencent.mm.autogen.events.ReportAdH5LoadEvent();
        com.tencent.mm.modelsns.SnsAdClick snsAdClick = (com.tencent.mm.modelsns.SnsAdClick) bundle.getParcelable("snsAdClick");
        am.wq wqVar = reportAdH5LoadEvent.f54681g;
        wqVar.f8312a = snsAdClick;
        java.lang.String str = stringArrayList.get(0);
        com.tencent.mm.sdk.platformtools.i6 i6Var = com.tencent.mm.pluginsdk.ui.tools.e9.f191608a;
        wqVar.f8313b = com.tencent.mm.sdk.platformtools.y9.a(str);
        wqVar.f8315d = com.tencent.mm.sdk.platformtools.t8.D1(stringArrayList.get(1), 0);
        wqVar.f8316e = com.tencent.mm.sdk.platformtools.t8.E1(stringArrayList.get(2));
        wqVar.f8317f = stringArrayList.get(3);
        wqVar.f8314c = bundle.getInt("errCode", 0);
        reportAdH5LoadEvent.e();
    }
}
