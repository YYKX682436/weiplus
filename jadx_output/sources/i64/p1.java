package i64;

/* loaded from: classes4.dex */
public enum p1 {
    Fav(1),
    Chat(2),
    Chatroom(3),
    Sns(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f289286d;

    static {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$ESpreadAction");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$ESpreadAction");
    }

    p1(int i17) {
        this.f289286d = 0;
        this.f289286d = i17;
    }

    public static i64.p1 valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$ESpreadAction");
        i64.p1 p1Var = (i64.p1) java.lang.Enum.valueOf(i64.p1.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$ESpreadAction");
        return p1Var;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static i64.p1[] valuesCustom() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$ESpreadAction");
        i64.p1[] p1VarArr = (i64.p1[]) values().clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ad.model.SnsVideoStatistic$ESpreadAction");
        return p1VarArr;
    }
}
