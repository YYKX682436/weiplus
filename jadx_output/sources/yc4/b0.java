package yc4;

/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final yc4.b0 f460839a = new yc4.b0();

    /* renamed from: b, reason: collision with root package name */
    public static yc4.v f460840b;

    /* renamed from: c, reason: collision with root package name */
    public static yc4.v f460841c;

    /* renamed from: d, reason: collision with root package name */
    public static yc4.v f460842d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashSet f460843e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f460844f;

    /* renamed from: g, reason: collision with root package name */
    public static long f460845g;

    /* renamed from: h, reason: collision with root package name */
    public static long f460846h;

    /* renamed from: i, reason: collision with root package name */
    public static long f460847i;

    static {
        com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.addLifecycleCallback(new yc4.a0());
        f460843e = new java.util.HashSet();
        f460844f = "";
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markFeedBrowseEnd", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
        if (f460844f.length() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markFeedBrowseEnd", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
            return;
        }
        yc4.v vVar = f460842d;
        if (vVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFeedBrowseTimeMsMap", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFeedBrowseTimeMsMap", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
            java.util.HashMap hashMap = vVar.f460880g;
            if (hashMap != null) {
                java.lang.String str = f460844f;
                java.lang.Long l17 = (java.lang.Long) hashMap.get(str);
                if (l17 == null) {
                    l17 = 0L;
                }
                hashMap.put(str, java.lang.Long.valueOf(l17.longValue() + ((java.lang.System.currentTimeMillis() - f460845g) - f460847i)));
                f460844f = "";
                f460847i = 0L;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markFeedBrowseEnd", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
                return;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markFeedBrowseEnd", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
    }

    public final void b(java.lang.String feedId) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markFeedBrowseStart", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
        kotlin.jvm.internal.o.g(feedId, "feedId");
        f460844f = feedId;
        f460845g = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markFeedBrowseStart", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
    }

    public final void c(java.lang.String feedId, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markFeedClickTrace", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
        kotlin.jvm.internal.o.g(feedId, "feedId");
        yc4.v vVar = f460842d;
        if (vVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFeedClickList", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFeedClickList", "com.tencent.mm.plugin.sns.ui.improve.report.Report16242Data");
            java.util.HashMap hashMap = vVar.f460879f;
            if (hashMap != null) {
                if (!hashMap.containsKey(feedId)) {
                    hashMap.put(feedId, java.lang.String.valueOf(i17));
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markFeedClickTrace", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
                    return;
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String str = (java.lang.String) hashMap.get(feedId);
                if (str == null) {
                    str = "";
                }
                sb6.append(str);
                sb6.append('_');
                sb6.append(i17);
                hashMap.put(feedId, sb6.toString());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markFeedClickTrace", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
                return;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markFeedClickTrace", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
    }

    public final void d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("markWsSnsId", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markWsSnsId", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
        } else {
            f460843e.add(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("markWsSnsId", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
        }
    }

    public final void e(android.content.Intent intent, com.tencent.mm.autogen.events.SnsJumpProfileEvent event) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("packageSnsJump33050", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(event, "event");
        am.cw cwVar = event.f54820g;
        intent.putExtra("contact_sns_page", cwVar.f6407b);
        intent.putExtra("contact_sns_feed_type", cwVar.f6409d);
        intent.putExtra("contact_sns_feed_id", cwVar.f6410e);
        intent.putExtra("contact_sns_is_ws", cwVar.f6408c);
        intent.putExtra("contact_sns_publish_user", cwVar.f6411f);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsReportUtil", "page:" + cwVar.f6407b + " style:" + cwVar.f6409d + " id:" + cwVar.f6410e + " ws:" + cwVar.f6408c);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("packageSnsJump33050", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
    }

    public final void f(android.content.Intent intent, com.tencent.mm.plugin.sns.storage.SnsInfo info, android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("packageSnsJump33050", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(context, "context");
        if (context instanceof com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI) {
            intent.putExtra("contact_sns_page", 1);
        } else if ((context instanceof com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI) || (context instanceof com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3)) {
            intent.putExtra("contact_sns_page", 2);
        }
        intent.putExtra("contact_sns_feed_type", info.getTimeLine().ContentObj.f369837e);
        intent.putExtra("contact_sns_feed_id", ca4.z0.t0(info.field_snsId));
        intent.putExtra("contact_sns_is_ws", info.isWsFold());
        intent.putExtra("contact_sns_publish_user", info.getUserName());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("packageSnsJump33050", "com.tencent.mm.plugin.sns.ui.improve.report.SnsReportUtil");
    }
}
