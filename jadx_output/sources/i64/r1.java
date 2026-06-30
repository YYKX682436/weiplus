package i64;

/* loaded from: classes4.dex */
public enum r1 {
    Samll(1),
    Full(2),
    /* JADX INFO: Fake field, exist only in values array */
    Complete(3);


    /* renamed from: d, reason: collision with root package name */
    public final int f289305d;

    static {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$ESpreadStatu");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$ESpreadStatu");
    }

    r1(int i17) {
        this.f289305d = 0;
        this.f289305d = i17;
    }

    public static i64.r1 valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$ESpreadStatu");
        i64.r1 r1Var = (i64.r1) java.lang.Enum.valueOf(i64.r1.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$ESpreadStatu");
        return r1Var;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static i64.r1[] valuesCustom() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$ESpreadStatu");
        i64.r1[] r1VarArr = (i64.r1[]) values().clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$ESpreadStatu");
        return r1VarArr;
    }
}
