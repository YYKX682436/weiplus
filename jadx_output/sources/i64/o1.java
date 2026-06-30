package i64;

/* loaded from: classes4.dex */
public enum o1 {
    Sight(1),
    AdUrl(2),
    Chat(3),
    TalkChat(4),
    Fav(5);


    /* renamed from: d, reason: collision with root package name */
    public final int f289269d;

    static {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$EActionScene");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$EActionScene");
    }

    o1(int i17) {
        this.f289269d = 0;
        this.f289269d = i17;
    }

    public static i64.o1 valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$EActionScene");
        i64.o1 o1Var = (i64.o1) java.lang.Enum.valueOf(i64.o1.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$EActionScene");
        return o1Var;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static i64.o1[] valuesCustom() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$EActionScene");
        i64.o1[] o1VarArr = (i64.o1[]) values().clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$EActionScene");
        return o1VarArr;
    }
}
