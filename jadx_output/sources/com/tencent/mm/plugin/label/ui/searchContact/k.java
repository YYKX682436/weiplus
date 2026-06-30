package com.tencent.mm.plugin.label.ui.searchContact;

/* loaded from: classes.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f143372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143373e;

    public k(long j17, java.lang.String str) {
        this.f143372d = j17;
        this.f143373e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.autogen.mmdata.rpt.MultiDeleteContactsReportStruct multiDeleteContactsReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MultiDeleteContactsReportStruct();
        multiDeleteContactsReportStruct.f59297d = this.f143372d;
        multiDeleteContactsReportStruct.f59298e = multiDeleteContactsReportStruct.b("actionInfo", this.f143373e, true);
        multiDeleteContactsReportStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelManagerUI", "24832 ,action = " + multiDeleteContactsReportStruct.f59297d + ",actionInfo = " + multiDeleteContactsReportStruct.f59298e);
    }
}
