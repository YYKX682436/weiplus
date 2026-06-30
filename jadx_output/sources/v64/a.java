package v64;

/* loaded from: classes4.dex */
public abstract class a {
    public static v64.c a(int i17, android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("make", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker");
        try {
            com.tencent.mars.xlog.Log.i("AdTimelinePartActionMaker", "make, type=" + i17);
            java.lang.String valueOf = java.lang.String.valueOf(i17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("idKeyAndKv", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
            ca4.n0.a(1837, 22, 1, true, valueOf);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idKeyAndKv", "com.tencent.mm.plugin.sns.data.SnsAdUtilKt");
        } catch (java.lang.Throwable unused) {
        }
        if (i17 == 1) {
            y64.a aVar = new y64.a(context);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("make", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker");
            return aVar;
        }
        if (i17 == 3) {
            w64.b bVar = new w64.b(context);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("make", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker");
            return bVar;
        }
        if (i17 == 4) {
            a74.b bVar2 = new a74.b(context);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("make", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker");
            return bVar2;
        }
        if (i17 == 5) {
            c74.b bVar3 = new c74.b(context);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("make", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker");
            return bVar3;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("make", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker");
        return null;
    }

    public static v64.c b(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeActionButtonAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker");
        v64.c a17 = a(3, context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeActionButtonAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker");
        return a17;
    }

    public static v64.c c(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeAvatarAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker");
        v64.c a17 = a(1, context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeAvatarAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker");
        return a17;
    }
}
