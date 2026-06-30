package sg0;

@j95.b
/* loaded from: classes16.dex */
public class c2 extends i95.w implements tg0.n1 {
    public void wi(android.view.View view, int i17, int i18, java.lang.String str, java.lang.String str2, int i19, java.lang.String str3, java.lang.String str4, int i27, java.lang.String str5, long j17) {
        com.tencent.mm.autogen.mmdata.rpt.WCFeedTopicActionReportStruct wCFeedTopicActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCFeedTopicActionReportStruct();
        wCFeedTopicActionReportStruct.f62066d = i17;
        wCFeedTopicActionReportStruct.f62067e = i18;
        wCFeedTopicActionReportStruct.f62068f = wCFeedTopicActionReportStruct.b("FeedAuthorUsername", str, true);
        wCFeedTopicActionReportStruct.f62069g = wCFeedTopicActionReportStruct.b("FeedID", str2, true);
        wCFeedTopicActionReportStruct.f62070h = i19;
        wCFeedTopicActionReportStruct.f62071i = wCFeedTopicActionReportStruct.b("CreatedCommentID", str3, true);
        wCFeedTopicActionReportStruct.f62072j = wCFeedTopicActionReportStruct.b("SessionID", str4, true);
        wCFeedTopicActionReportStruct.f62073k = i27;
        wCFeedTopicActionReportStruct.f62074l = wCFeedTopicActionReportStruct.b("QueryKey", str5, true);
        wCFeedTopicActionReportStruct.f62075m = j17;
        wCFeedTopicActionReportStruct.k();
        su4.k3.m(wCFeedTopicActionReportStruct);
    }
}
