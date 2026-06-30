package wa4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: d, reason: collision with root package name */
    public static final wa4.k f444251d;

    /* renamed from: e, reason: collision with root package name */
    public static final wa4.k f444252e;

    /* renamed from: f, reason: collision with root package name */
    public static final wa4.k f444253f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ wa4.k[] f444254g;

    static {
        wa4.k kVar = new wa4.k("Hide", 0);
        f444251d = kVar;
        wa4.k kVar2 = new wa4.k("NormalToPublishPage", 1);
        f444252e = kVar2;
        wa4.k kVar3 = new wa4.k("CustomToFeedPage", 2);
        f444253f = kVar3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.snstimeline.SnsBizPostEntranceType");
        wa4.k[] kVarArr = {kVar, kVar2, kVar3};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.snstimeline.SnsBizPostEntranceType");
        f444254g = kVarArr;
        rz5.b.a(kVarArr);
    }

    public k(java.lang.String str, int i17) {
    }

    public static wa4.k valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.snstimeline.SnsBizPostEntranceType");
        wa4.k kVar = (wa4.k) java.lang.Enum.valueOf(wa4.k.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.snstimeline.SnsBizPostEntranceType");
        return kVar;
    }

    public static wa4.k[] values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.snstimeline.SnsBizPostEntranceType");
        wa4.k[] kVarArr = (wa4.k[]) f444254g.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.snstimeline.SnsBizPostEntranceType");
        return kVarArr;
    }
}
