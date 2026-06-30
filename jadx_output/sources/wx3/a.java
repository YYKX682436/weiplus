package wx3;

/* loaded from: classes15.dex */
public abstract class a {
    public static final void a(long j17, java.lang.String feedId, long j18) {
        kotlin.jvm.internal.o.g(feedId, "feedId");
        com.tencent.mm.autogen.mmdata.rpt.ring_history_logStruct ring_history_logstruct = new com.tencent.mm.autogen.mmdata.rpt.ring_history_logStruct();
        ring_history_logstruct.f63154d = j17;
        ring_history_logstruct.f63155e = ring_history_logstruct.b("feedid", feedId, true);
        ring_history_logstruct.f63156f = j18;
        ring_history_logstruct.k();
    }

    public static final void b(long j17, java.lang.String feedId, int i17, java.lang.String str, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(feedId, "feedId");
        com.tencent.mm.autogen.mmdata.rpt.RingToneHomePageActionReportStruct ringToneHomePageActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.RingToneHomePageActionReportStruct();
        ringToneHomePageActionReportStruct.f60022d = j17;
        ringToneHomePageActionReportStruct.f60023e = ringToneHomePageActionReportStruct.b("feedid", feedId, true);
        ringToneHomePageActionReportStruct.f60024f = i17;
        ringToneHomePageActionReportStruct.f60025g = ringToneHomePageActionReportStruct.b("tousername", str, true);
        ringToneHomePageActionReportStruct.f60027i = z17 ? 1L : 2L;
        ringToneHomePageActionReportStruct.f60028j = z18 ? 1L : 2L;
        ringToneHomePageActionReportStruct.k();
    }

    public static /* synthetic */ void c(long j17, java.lang.String str, int i17, java.lang.String str2, boolean z17, boolean z18, int i18, java.lang.Object obj) {
        if ((i18 & 8) != 0) {
            str2 = null;
        }
        b(j17, str, i17, str2, (i18 & 16) != 0 ? false : z17, (i18 & 32) != 0 ? false : z18);
    }

    public static final void d(java.lang.String feedId, long j17, long j18, long j19, int i17, java.lang.String username, boolean z17, boolean z18, java.lang.String toUserName, boolean z19, boolean z27, java.lang.String recRequestId, boolean z28) {
        kotlin.jvm.internal.o.g(feedId, "feedId");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(toUserName, "toUserName");
        kotlin.jvm.internal.o.g(recRequestId, "recRequestId");
        com.tencent.mm.autogen.mmdata.rpt.RingToneSetSceneReportStruct ringToneSetSceneReportStruct = new com.tencent.mm.autogen.mmdata.rpt.RingToneSetSceneReportStruct();
        ringToneSetSceneReportStruct.f60039d = ringToneSetSceneReportStruct.b("feedid", feedId, true);
        ringToneSetSceneReportStruct.f60040e = j17;
        ringToneSetSceneReportStruct.f60041f = j18;
        ringToneSetSceneReportStruct.f60042g = j19;
        ringToneSetSceneReportStruct.f60043h = ringToneSetSceneReportStruct.b(dm.i4.COL_USERNAME, username, true);
        ringToneSetSceneReportStruct.f60044i = i17;
        ringToneSetSceneReportStruct.f60045j = z17 ? 1L : 2L;
        ringToneSetSceneReportStruct.f60046k = z18 ? 1L : 2L;
        ringToneSetSceneReportStruct.f60047l = ringToneSetSceneReportStruct.b("toUserName", toUserName, true);
        ringToneSetSceneReportStruct.f60048m = !z19 ? 1L : 2L;
        ringToneSetSceneReportStruct.f60049n = z27 ? 1L : 2L;
        ringToneSetSceneReportStruct.f60050o = ringToneSetSceneReportStruct.b("rec_request_id", recRequestId, true);
        ringToneSetSceneReportStruct.f60051p = z28 ? 2L : 1L;
        ringToneSetSceneReportStruct.k();
    }

    public static final void f(int i17, int i18, java.lang.String wording, java.lang.String username, java.lang.String feedId) {
        kotlin.jvm.internal.o.g(wording, "wording");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(feedId, "feedId");
        com.tencent.mm.autogen.mmdata.rpt.RingtoneEntranceExposureReportStruct ringtoneEntranceExposureReportStruct = new com.tencent.mm.autogen.mmdata.rpt.RingtoneEntranceExposureReportStruct();
        ringtoneEntranceExposureReportStruct.f60062e = i18;
        ringtoneEntranceExposureReportStruct.f60063f = ringtoneEntranceExposureReportStruct.b("wording", wording, true);
        ringtoneEntranceExposureReportStruct.f60061d = i17;
        ringtoneEntranceExposureReportStruct.f60065h = ringtoneEntranceExposureReportStruct.b("UserName", username, true);
        ringtoneEntranceExposureReportStruct.f60064g = ringtoneEntranceExposureReportStruct.b("feedid", feedId, true);
        ringtoneEntranceExposureReportStruct.k();
    }
}
