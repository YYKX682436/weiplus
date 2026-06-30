package ta4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class z0 {

    /* renamed from: e, reason: collision with root package name */
    public static final ta4.z0 f416868e;

    /* renamed from: f, reason: collision with root package name */
    public static final ta4.z0 f416869f;

    /* renamed from: g, reason: collision with root package name */
    public static final ta4.z0 f416870g;

    /* renamed from: h, reason: collision with root package name */
    public static final ta4.z0 f416871h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ ta4.z0[] f416872i;

    /* renamed from: d, reason: collision with root package name */
    public final int f416873d;

    static {
        ta4.z0 z0Var = new ta4.z0("UNKNOWN", 0, 0);
        f416868e = z0Var;
        ta4.z0 z0Var2 = new ta4.z0("TIMELINE", 1, 1);
        f416869f = z0Var2;
        ta4.z0 z0Var3 = new ta4.z0("ALBUM", 2, 2);
        ta4.z0 z0Var4 = new ta4.z0("DETAIL", 3, 3);
        f416870g = z0Var4;
        ta4.z0 z0Var5 = new ta4.z0("REEDIT", 4, 4);
        ta4.z0 z0Var6 = new ta4.z0("MESSAGE_LIST", 5, 5);
        f416871h = z0Var6;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.report.SnsPageScene");
        ta4.z0[] z0VarArr = {z0Var, z0Var2, z0Var3, z0Var4, z0Var5, z0Var6};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.report.SnsPageScene");
        f416872i = z0VarArr;
        rz5.b.a(z0VarArr);
    }

    public z0(java.lang.String str, int i17, int i18) {
        this.f416873d = i18;
    }

    public static ta4.z0 valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.report.SnsPageScene");
        ta4.z0 z0Var = (ta4.z0) java.lang.Enum.valueOf(ta4.z0.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.report.SnsPageScene");
        return z0Var;
    }

    public static ta4.z0[] values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.report.SnsPageScene");
        ta4.z0[] z0VarArr = (ta4.z0[]) f416872i.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.report.SnsPageScene");
        return z0VarArr;
    }

    public final int h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getValue", "com.tencent.mm.plugin.sns.report.SnsPageScene");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getValue", "com.tencent.mm.plugin.sns.report.SnsPageScene");
        return this.f416873d;
    }
}
