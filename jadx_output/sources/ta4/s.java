package ta4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static final ta4.s f416818e;

    /* renamed from: f, reason: collision with root package name */
    public static final ta4.s f416819f;

    /* renamed from: g, reason: collision with root package name */
    public static final ta4.s f416820g;

    /* renamed from: h, reason: collision with root package name */
    public static final ta4.s f416821h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ ta4.s[] f416822i;

    /* renamed from: d, reason: collision with root package name */
    public final int f416823d;

    static {
        ta4.s sVar = new ta4.s("UNKNOWN", 0, 0);
        f416818e = sVar;
        ta4.s sVar2 = new ta4.s("CLICK_OPEN", 1, 1);
        f416819f = sVar2;
        ta4.s sVar3 = new ta4.s("SCROLL_UP", 2, 2);
        f416820g = sVar3;
        ta4.s sVar4 = new ta4.s("SCROLL_DOWN", 3, 3);
        f416821h = sVar4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.report.SnsCmtPicExposureType");
        ta4.s[] sVarArr = {sVar, sVar2, sVar3, sVar4};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.report.SnsCmtPicExposureType");
        f416822i = sVarArr;
        rz5.b.a(sVarArr);
    }

    public s(java.lang.String str, int i17, int i18) {
        this.f416823d = i18;
    }

    public static ta4.s valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.report.SnsCmtPicExposureType");
        ta4.s sVar = (ta4.s) java.lang.Enum.valueOf(ta4.s.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.report.SnsCmtPicExposureType");
        return sVar;
    }

    public static ta4.s[] values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.report.SnsCmtPicExposureType");
        ta4.s[] sVarArr = (ta4.s[]) f416822i.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.report.SnsCmtPicExposureType");
        return sVarArr;
    }
}
