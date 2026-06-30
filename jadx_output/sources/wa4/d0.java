package wa4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d0 {

    /* renamed from: d, reason: collision with root package name */
    public static final wa4.d0 f444215d;

    /* renamed from: e, reason: collision with root package name */
    public static final wa4.d0 f444216e;

    /* renamed from: f, reason: collision with root package name */
    public static final wa4.d0 f444217f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ wa4.d0[] f444218g;

    static {
        wa4.d0 d0Var = new wa4.d0("PHOTO", 0);
        f444215d = d0Var;
        wa4.d0 d0Var2 = new wa4.d0("SIGHT_VIDEO", 1);
        f444216e = d0Var2;
        wa4.d0 d0Var3 = new wa4.d0("COMPOSITION_VIDEO", 2);
        f444217f = d0Var3;
        wa4.d0 d0Var4 = new wa4.d0("OTHER", 3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Type");
        wa4.d0[] d0VarArr = {d0Var, d0Var2, d0Var3, d0Var4};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Type");
        f444218g = d0VarArr;
        rz5.b.a(d0VarArr);
    }

    public d0(java.lang.String str, int i17) {
    }

    public static wa4.d0 valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Type");
        wa4.d0 d0Var = (wa4.d0) java.lang.Enum.valueOf(wa4.d0.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Type");
        return d0Var;
    }

    public static wa4.d0[] values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Type");
        wa4.d0[] d0VarArr = (wa4.d0[]) f444218g.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.snstimeline.TimelineSessionPostInfo$Type");
        return d0VarArr;
    }
}
