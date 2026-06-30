package n54;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class o {

    /* renamed from: d, reason: collision with root package name */
    public static final n54.o f335145d;

    /* renamed from: e, reason: collision with root package name */
    public static final n54.o f335146e;

    /* renamed from: f, reason: collision with root package name */
    public static final n54.o f335147f;

    /* renamed from: g, reason: collision with root package name */
    public static final n54.o f335148g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ n54.o[] f335149h;

    static {
        n54.o oVar = new n54.o("HIDE", 0);
        f335145d = oVar;
        n54.o oVar2 = new n54.o("TO_TOP", 1);
        f335146e = oVar2;
        n54.o oVar3 = new n54.o("SHOW", 2);
        f335147f = oVar3;
        n54.o oVar4 = new n54.o("SHOW_KEY_BOARD_TO_TOP", 3);
        f335148g = oVar4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AnimationType");
        n54.o[] oVarArr = {oVar, oVar2, oVar3, oVar4};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AnimationType");
        f335149h = oVarArr;
        rz5.b.a(oVarArr);
    }

    public o(java.lang.String str, int i17) {
    }

    public static n54.o valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AnimationType");
        n54.o oVar = (n54.o) java.lang.Enum.valueOf(n54.o.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AnimationType");
        return oVar;
    }

    public static n54.o[] values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AnimationType");
        n54.o[] oVarArr = (n54.o[]) f335149h.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AnimationType");
        return oVarArr;
    }
}
