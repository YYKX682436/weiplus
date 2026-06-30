package n34;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class x3 {

    /* renamed from: d, reason: collision with root package name */
    public static final n34.x3 f334774d;

    /* renamed from: e, reason: collision with root package name */
    public static final n34.x3 f334775e;

    /* renamed from: f, reason: collision with root package name */
    public static final n34.x3 f334776f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ n34.x3[] f334777g;

    static {
        n34.x3 x3Var = new n34.x3("VideoPath", 0);
        f334774d = x3Var;
        n34.x3 x3Var2 = new n34.x3("VideoComposition", 1);
        f334775e = x3Var2;
        n34.x3 x3Var3 = new n34.x3("Photo", 2);
        f334776f = x3Var3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.SnsPostFinderType");
        n34.x3[] x3VarArr = {x3Var, x3Var2, x3Var3};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.SnsPostFinderType");
        f334777g = x3VarArr;
        rz5.b.a(x3VarArr);
    }

    public x3(java.lang.String str, int i17) {
    }

    public static n34.x3 valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.SnsPostFinderType");
        n34.x3 x3Var = (n34.x3) java.lang.Enum.valueOf(n34.x3.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.SnsPostFinderType");
        return x3Var;
    }

    public static n34.x3[] values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.SnsPostFinderType");
        n34.x3[] x3VarArr = (n34.x3[]) f334777g.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.SnsPostFinderType");
        return x3VarArr;
    }
}
