package gc4;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final gc4.d f270448a = new gc4.d(null);

    /* renamed from: b, reason: collision with root package name */
    public static final gc4.e f270449b = new gc4.e();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f270450c;

    static {
        java.lang.String r17 = c01.z1.r();
        kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
        f270450c = r17;
    }

    public static final gc4.e a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInstance", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindHelper");
        f270448a.a();
        gc4.e eVar = f270449b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInstance", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindHelper");
        return eVar;
    }

    public final int b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUserShowTipsReminderCont", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindHelper");
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_TIPS_STOP_MSG_NOTIFY_REMAINDER_SHOW_COUNT_INT, 3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUserShowTipsReminderCont", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindHelper");
        return r17;
    }

    public final void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("recordUserDidUseStopRemindAfterTips", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindHelper");
        f270448a.a();
        if (f270449b.b() >= 3) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recordUserDidUseStopRemindAfterTips", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindHelper");
        } else {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SNS_TIPS_STOP_MSG_NOTIFY_USED_AFTER_BOOLEAN, java.lang.Boolean.TRUE);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recordUserDidUseStopRemindAfterTips", "com.tencent.mm.plugin.sns.ui.helper.SnsMsgStopRemindHelper");
        }
    }
}
