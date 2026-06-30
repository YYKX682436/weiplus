package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes3.dex */
public class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f161218d;

    public k2(com.tencent.mm.plugin.setting.ui.setting.SelfQRCodeUI selfQRCodeUI, long j17) {
        this.f161218d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.mmdata.rpt.QRCodeHelloMsgViewReportStruct qRCodeHelloMsgViewReportStruct = new com.tencent.mm.autogen.mmdata.rpt.QRCodeHelloMsgViewReportStruct();
        long j17 = this.f161218d;
        qRCodeHelloMsgViewReportStruct.f59877d = j17;
        qRCodeHelloMsgViewReportStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.SelfQRCodeNewUI", "25609 setAction_ = " + j17);
    }
}
