package i64;

/* loaded from: classes4.dex */
public enum q1 {
    Sight(1),
    AdUrl(2),
    /* JADX INFO: Fake field, exist only in values array */
    Chat(3),
    /* JADX INFO: Fake field, exist only in values array */
    TalkChat(4),
    /* JADX INFO: Fake field, exist only in values array */
    Fav(5);


    /* renamed from: d, reason: collision with root package name */
    public final int f289296d;

    static {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$ESpreadScene");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$ESpreadScene");
    }

    q1(int i17) {
        this.f289296d = 0;
        this.f289296d = i17;
    }

    public static i64.q1 valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$ESpreadScene");
        i64.q1 q1Var = (i64.q1) java.lang.Enum.valueOf(i64.q1.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$ESpreadScene");
        return q1Var;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static i64.q1[] valuesCustom() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$ESpreadScene");
        i64.q1[] q1VarArr = (i64.q1[]) values().clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$ESpreadScene");
        return q1VarArr;
    }
}
