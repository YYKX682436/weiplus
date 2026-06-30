package ta4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: e, reason: collision with root package name */
    public static final ta4.k f416790e;

    /* renamed from: f, reason: collision with root package name */
    public static final ta4.k f416791f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ ta4.k[] f416792g;

    /* renamed from: d, reason: collision with root package name */
    public final int f416793d;

    static {
        ta4.k kVar = new ta4.k("PIC", 0, 1);
        f416790e = kVar;
        ta4.k kVar2 = new ta4.k("VIDEO", 1, 2);
        f416791f = kVar2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.report.MaterialType");
        ta4.k[] kVarArr = {kVar, kVar2};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.report.MaterialType");
        f416792g = kVarArr;
        rz5.b.a(kVarArr);
    }

    public k(java.lang.String str, int i17, int i18) {
        this.f416793d = i18;
    }

    public static ta4.k valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.report.MaterialType");
        ta4.k kVar = (ta4.k) java.lang.Enum.valueOf(ta4.k.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.report.MaterialType");
        return kVar;
    }

    public static ta4.k[] values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.report.MaterialType");
        ta4.k[] kVarArr = (ta4.k[]) f416792g.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.report.MaterialType");
        return kVarArr;
    }
}
