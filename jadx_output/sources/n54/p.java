package n54;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class p {

    /* renamed from: d, reason: collision with root package name */
    public static final n54.p f335150d;

    /* renamed from: e, reason: collision with root package name */
    public static final n54.p f335151e;

    /* renamed from: f, reason: collision with root package name */
    public static final n54.p f335152f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ n54.p[] f335153g;

    static {
        n54.p pVar = new n54.p("DOWN", 0);
        f335150d = pVar;
        n54.p pVar2 = new n54.p("MOVE", 1);
        f335151e = pVar2;
        n54.p pVar3 = new n54.p("UP_OR_CANCEL", 2);
        f335152f = pVar3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.GestureEvent");
        n54.p[] pVarArr = {pVar, pVar2, pVar3};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.GestureEvent");
        f335153g = pVarArr;
        rz5.b.a(pVarArr);
    }

    public p(java.lang.String str, int i17) {
    }

    public static n54.p valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.GestureEvent");
        n54.p pVar = (n54.p) java.lang.Enum.valueOf(n54.p.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.GestureEvent");
        return pVar;
    }

    public static n54.p[] values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.GestureEvent");
        n54.p[] pVarArr = (n54.p[]) f335153g.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.GestureEvent");
        return pVarArr;
    }
}
