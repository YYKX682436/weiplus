package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes.dex */
public class w2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f138217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f138218e;

    public w2(int i17, java.lang.String str) {
        this.f138217d = i17;
        this.f138218e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.mmdata.rpt.MultiDeleteContactsReportStruct multiDeleteContactsReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MultiDeleteContactsReportStruct();
        multiDeleteContactsReportStruct.f59297d = this.f138217d;
        multiDeleteContactsReportStruct.f59298e = multiDeleteContactsReportStruct.b("actionInfo", this.f138218e, true);
        multiDeleteContactsReportStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSReportLogic", "24832 ,action = " + multiDeleteContactsReportStruct.f59297d + ",actionInfo = " + multiDeleteContactsReportStruct.f59298e);
    }
}
