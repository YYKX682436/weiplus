package yu4;

/* loaded from: classes8.dex */
public final class i implements o25.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yu4.k f465876a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f465877b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.sn3 f465878c;

    public i(yu4.k kVar, java.lang.String str, r45.sn3 sn3Var) {
        this.f465876a = kVar;
        this.f465877b = str;
        this.f465878c = sn3Var;
    }

    @Override // o25.p1
    public final void a(java.lang.String str, com.tencent.mm.api.IEmojiInfo iEmojiInfo, boolean z17, long j17) {
        yu4.k kVar = this.f465876a;
        com.tencent.mars.xlog.Log.i(kVar.f465883h, "share: " + iEmojiInfo.getMd5() + ", " + z17 + ", shareId:" + j17 + ", currentShareId:" + kVar.f465889q);
        if (j17 == kVar.f465889q) {
            java.lang.String str2 = this.f465877b;
            if (z17) {
                iEmojiInfo.K0(iEmojiInfo.getMd5(), str2 == null ? "" : str2);
                ((com.tencent.mm.view.manager.e) kVar.f465882g).a(str, iEmojiInfo);
            }
            r45.sn3 shareContent = this.f465878c;
            kotlin.jvm.internal.o.g(shareContent, "shareContent");
            com.tencent.mm.ui.widget.dialog.u3 u3Var = kVar.f465890r;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            kVar.dismiss();
            com.tencent.mm.autogen.mmdata.rpt.WCTopicSearchShareActionReportStruct wCTopicSearchShareActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCTopicSearchShareActionReportStruct();
            wCTopicSearchShareActionReportStruct.f62169e = c01.id.e();
            wCTopicSearchShareActionReportStruct.f62168d = 2L;
            wCTopicSearchShareActionReportStruct.f62170f = 2L;
            if (str2 == null) {
                str2 = "";
            }
            wCTopicSearchShareActionReportStruct.f62171g = wCTopicSearchShareActionReportStruct.b("ResultQuery", str2, true);
            r45.xi0 xi0Var = kVar.f465881f;
            wCTopicSearchShareActionReportStruct.f62172h = com.tencent.mm.storage.z3.R4(xi0Var.f390123o) ? 2L : 1L;
            wCTopicSearchShareActionReportStruct.f62173i = wCTopicSearchShareActionReportStruct.b("ShareSceneId", xi0Var.f390123o, true);
            java.lang.String str3 = shareContent.f385856d.f379950d;
            if (str3 == null) {
                str3 = "";
            }
            wCTopicSearchShareActionReportStruct.f62174j = wCTopicSearchShareActionReportStruct.b("ShareSessionId", str3, true);
            java.lang.String str4 = shareContent.f385856d.f379951e;
            if (str4 == null) {
                str4 = "";
            }
            wCTopicSearchShareActionReportStruct.f62175k = wCTopicSearchShareActionReportStruct.b("ShareSearchId", str4, true);
            java.lang.String str5 = shareContent.f385856d.f379952f;
            if (str5 == null) {
                str5 = "";
            }
            wCTopicSearchShareActionReportStruct.f62176l = wCTopicSearchShareActionReportStruct.b("ShareRequestId", str5, true);
            java.lang.String str6 = shareContent.f385856d.f379955i;
            wCTopicSearchShareActionReportStruct.f62177m = wCTopicSearchShareActionReportStruct.b("ShareDocId", str6 != null ? str6 : "", true);
            r45.lx5 lx5Var = shareContent.f385856d;
            wCTopicSearchShareActionReportStruct.f62179o = lx5Var.f379954h;
            wCTopicSearchShareActionReportStruct.f62178n = lx5Var.f379953g;
            wCTopicSearchShareActionReportStruct.k();
            su4.k3.m(wCTopicSearchShareActionReportStruct);
        }
    }
}
