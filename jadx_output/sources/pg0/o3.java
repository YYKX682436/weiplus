package pg0;

/* loaded from: classes2.dex */
public final class o3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f354037d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f354038e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f354039f;

    public o3(java.lang.String str, java.util.LinkedList linkedList, int i17) {
        this.f354037d = str;
        this.f354038e = linkedList;
        this.f354039f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f354039f;
        java.lang.String str = this.f354037d;
        try {
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70666c = "/cgi-bin/mmpay-bin/sec/mmpayriskappsvr_report_screenshotpage";
            lVar.f70667d = 25487;
            lVar.f70664a = new r45.qv5();
            lVar.f70665b = new r45.rv5();
            lVar.f70678o = 2;
            com.tencent.mm.modelbase.o a17 = lVar.a();
            com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ScreenshotPageRequest");
            r45.qv5 qv5Var = (r45.qv5) fVar;
            qv5Var.f384301e = str;
            java.util.LinkedList linkedList = this.f354038e;
            if (linkedList != null && linkedList.size() > 0) {
                qv5Var.f384302f = linkedList;
            }
            qv5Var.f384303g = i17;
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletUtilNewService", "[doReportScreenShotPageCgi] pageType: " + str + ", trans_id_list: " + linkedList + " , error_code: " + i17);
            com.tencent.mm.modelbase.z2.d(a17, null, false);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WalletUtilNewService", "[doReportScreenShotPageCgi] failed : " + th6 + ".message");
        }
    }
}
