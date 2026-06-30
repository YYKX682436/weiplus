package i64;

/* loaded from: classes4.dex */
public enum n1 {
    PlayIcon(1),
    EnterFullScreen(2),
    EnterCompleteVideo(3),
    DetailInVideo(4),
    LeavelFullScreen(5),
    LeaveCompleteVideo(6),
    /* JADX INFO: Fake field, exist only in values array */
    SightLoaded(7),
    DetailTimeline(8);


    /* renamed from: d, reason: collision with root package name */
    public final int f289256d;

    static {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$EActionActionType");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$EActionActionType");
    }

    n1(int i17) {
        this.f289256d = 0;
        this.f289256d = i17;
    }

    public static i64.n1 valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$EActionActionType");
        i64.n1 n1Var = (i64.n1) java.lang.Enum.valueOf(i64.n1.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$EActionActionType");
        return n1Var;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static i64.n1[] valuesCustom() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$EActionActionType");
        i64.n1[] n1VarArr = (i64.n1[]) values().clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$EActionActionType");
        return n1VarArr;
    }
}
