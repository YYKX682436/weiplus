package p63;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp63/a;", "Lcom/tencent/mm/ipcinvoker/k0;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-generic-report_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class a implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        byte[] byteArray;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle != null && (byteArray = bundle.getByteArray("finderReportAffFinderTask")) != null) {
            r45.a6 a6Var = new r45.a6();
            a6Var.parseFrom(byteArray);
            boolean z17 = a6Var.f369754m;
            p63.b bVar = p63.b.f352437a;
            if (z17) {
                int i17 = a6Var.f369751g;
                int i18 = a6Var.f369750f;
                java.lang.String targetPageName = a6Var.f369755n;
                kotlin.jvm.internal.o.f(targetPageName, "targetPageName");
                java.lang.String pageSimpleName = a6Var.f369748d;
                kotlin.jvm.internal.o.f(pageSimpleName, "pageSimpleName");
                long j17 = a6Var.f369752h;
                java.lang.String params = a6Var.f369753i;
                kotlin.jvm.internal.o.f(params, "params");
                if (bVar.c() && com.tencent.mm.sdk.platformtools.x2.n()) {
                    com.tencent.wechat.aff.data_report.j a17 = bVar.a();
                    if (a17 != null) {
                        com.tencent.wechat.aff.data_report.k kVar = new com.tencent.wechat.aff.data_report.k();
                        kVar.f216616d = pageSimpleName;
                        kVar.f216618f = i18;
                        kVar.f216620h = j17;
                        java.util.Map map = o63.h.f343200a;
                        o63.f fVar = (o63.f) o63.h.f343200a.get(targetPageName);
                        kVar.f216621i = fVar != null ? fVar.f343198b : false ? com.tencent.wechat.aff.data_report.i.PAGE_OUT : com.tencent.wechat.aff.data_report.i.DEFAULT;
                        kVar.f216622m = params;
                        kVar.f216619g = i17;
                        a17.d(kVar);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AffFinderReport", "onPageAppear: taskId: " + i17 + ", targetPageHC: " + i18 + ", targetPageName: " + targetPageName + ", targetSimpleName: " + pageSimpleName + ", timestamp: " + j17 + ", params: " + params);
                }
            } else {
                int i19 = a6Var.f369751g;
                int i27 = a6Var.f369750f;
                java.lang.String targetPageName2 = a6Var.f369755n;
                kotlin.jvm.internal.o.f(targetPageName2, "targetPageName");
                bVar.d(i19, i27, targetPageName2, a6Var.f369752h);
            }
        }
        return new com.tencent.mm.ipcinvoker.type.IPCVoid();
    }
}
