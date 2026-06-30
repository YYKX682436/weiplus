package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class io implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.ho f169242d;

    public io(com.tencent.mm.plugin.sns.ui.ho hoVar) {
        this.f169242d = hoVar;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager$1");
        com.tencent.mm.plugin.sns.ui.ho hoVar = this.f169242d;
        g4Var.p(0, com.tencent.mm.plugin.sns.ui.ho.a(hoVar).getString(com.tencent.mm.R.string.f490407u4), com.tencent.mm.plugin.sns.ui.ho.a(hoVar).getString(com.tencent.mm.R.string.f490412u9), 0);
        g4Var.f(1, com.tencent.mm.plugin.sns.ui.ho.a(hoVar).getString(com.tencent.mm.R.string.f490415uc));
        if (xa4.g.v()) {
            g4Var.v(xa4.g.k(com.tencent.mm.plugin.sns.ui.ho.a(hoVar)));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markExposeActivityPostEntrance", "com.tencent.mm.plugin.sns.spring.SnsActivityPostAction31314Reporter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("report", "com.tencent.mm.plugin.sns.spring.SnsActivityPostAction31314Reporter");
            com.tencent.mm.autogen.mmdata.rpt.SnsActivityPostActionReportStruct snsActivityPostActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsActivityPostActionReportStruct();
            snsActivityPostActionReportStruct.f60433d = 4;
            snsActivityPostActionReportStruct.k();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("report", "com.tencent.mm.plugin.sns.spring.SnsActivityPostAction31314Reporter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markExposeActivityPostEntrance", "com.tencent.mm.plugin.sns.spring.SnsActivityPostAction31314Reporter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateMMMenu", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager$1");
    }
}
