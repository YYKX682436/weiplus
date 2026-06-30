package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class h implements za4.e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.k f169340a;

    public h(com.tencent.mm.plugin.sns.ui.item.l lVar, com.tencent.mm.plugin.sns.ui.item.k kVar) {
        this.f169340a = kVar;
    }

    @Override // za4.e0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadError", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$2");
    }

    @Override // za4.e0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartDownload", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$2");
    }

    @Override // za4.e0
    public void c(java.lang.String str) {
        android.graphics.Bitmap J2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$2");
        com.tencent.mars.xlog.Log.i("MiroMsg.CardAdTimeLineItem", "download img %s", str);
        com.tencent.mm.plugin.sns.ui.item.k kVar = this.f169340a;
        if (!com.tencent.mm.sdk.platformtools.t8.N0((java.lang.String) kVar.K0.getTag(), str) && str.equals(za4.t0.l("adId", (java.lang.String) kVar.K0.getTag())) && (J2 = com.tencent.mm.sdk.platformtools.x.J(str, null)) != null) {
            android.view.View view = kVar.K0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem$2", "onDownloaded", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/item/CardAdTimeLineItem$2", "onDownloaded", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            kVar.L0.setImageBitmap(J2);
            kVar.L0.setVisibility(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloaded", "com.tencent.mm.plugin.sns.ui.item.CardAdTimeLineItem$2");
    }
}
