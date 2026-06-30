package pn4;

@j95.b
/* loaded from: classes3.dex */
public class l1 extends i95.w implements mn4.f {
    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        i95.n0.c(gm.l.class);
    }

    public void wi(mn4.e eVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.util.Objects.toString(eVar);
        if (eVar == null) {
            eVar = mn4.e.DEFAULT;
        }
        com.tencent.mm.autogen.mmdata.rpt.TranslateFeedbackReportStruct translateFeedbackReportStruct = new com.tencent.mm.autogen.mmdata.rpt.TranslateFeedbackReportStruct();
        translateFeedbackReportStruct.f61339d = eVar.f330190d;
        translateFeedbackReportStruct.f61340e = translateFeedbackReportStruct.b("OrigImgFileId", str, true);
        translateFeedbackReportStruct.f61341f = translateFeedbackReportStruct.b("OrigImgAesKey", str2, true);
        translateFeedbackReportStruct.f61344i = translateFeedbackReportStruct.b("TransImgFileId", str3, true);
        translateFeedbackReportStruct.f61345j = translateFeedbackReportStruct.b("TransImgAesKey", str4, true);
        translateFeedbackReportStruct.k();
    }
}
