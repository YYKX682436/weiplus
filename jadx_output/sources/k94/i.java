package k94;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final k94.i f305955d;

    /* renamed from: e, reason: collision with root package name */
    public static final k94.i f305956e;

    /* renamed from: f, reason: collision with root package name */
    public static final k94.i f305957f;

    /* renamed from: g, reason: collision with root package name */
    public static final k94.i f305958g;

    /* renamed from: h, reason: collision with root package name */
    public static final k94.i f305959h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ k94.i[] f305960i;

    static {
        k94.i iVar = new k94.i("MOVE_IN", 0);
        f305955d = iVar;
        k94.i iVar2 = new k94.i("MOVE_OUT", 1);
        f305956e = iVar2;
        k94.i iVar3 = new k94.i("RATIO_CHANGED", 2);
        f305957f = iVar3;
        k94.i iVar4 = new k94.i("MATERIAL_RATIO_CHANGED", 3);
        f305958g = iVar4;
        k94.i iVar5 = new k94.i("REMOVED", 4);
        f305959h = iVar5;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewVisibilityStatus");
        k94.i[] iVarArr = {iVar, iVar2, iVar3, iVar4, iVar5};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewVisibilityStatus");
        f305960i = iVarArr;
        rz5.b.a(iVarArr);
    }

    public i(java.lang.String str, int i17) {
    }

    public static k94.i valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewVisibilityStatus");
        k94.i iVar = (k94.i) java.lang.Enum.valueOf(k94.i.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewVisibilityStatus");
        return iVar;
    }

    public static k94.i[] values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewVisibilityStatus");
        k94.i[] iVarArr = (k94.i[]) f305960i.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ad.wsfold.report.WsFoldAdViewExposureManager$ViewVisibilityStatus");
        return iVarArr;
    }
}
