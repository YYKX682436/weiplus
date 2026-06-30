package ka4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final ka4.b f306116e;

    /* renamed from: f, reason: collision with root package name */
    public static final ka4.b f306117f;

    /* renamed from: g, reason: collision with root package name */
    public static final ka4.b f306118g;

    /* renamed from: h, reason: collision with root package name */
    public static final ka4.b f306119h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ ka4.b[] f306120i;

    /* renamed from: d, reason: collision with root package name */
    public final int f306121d;

    static {
        ka4.b bVar = new ka4.b("SUBMIT", 0, 1);
        f306116e = bVar;
        ka4.b bVar2 = new ka4.b("START", 1, 2);
        f306117f = bVar2;
        ka4.b bVar3 = new ka4.b("FINISH_V2", 2, 3);
        f306118g = bVar3;
        ka4.b bVar4 = new ka4.b("FINISH_V4", 3, 4);
        f306119h = bVar4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.model.config.PredictType");
        ka4.b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.model.config.PredictType");
        f306120i = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17, int i18) {
        this.f306121d = i18;
    }

    public static ka4.b valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.model.config.PredictType");
        ka4.b bVar = (ka4.b) java.lang.Enum.valueOf(ka4.b.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.model.config.PredictType");
        return bVar;
    }

    public static ka4.b[] values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.model.config.PredictType");
        ka4.b[] bVarArr = (ka4.b[]) f306120i.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.model.config.PredictType");
        return bVarArr;
    }

    public final int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.config.PredictType");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.config.PredictType");
        return this.f306121d;
    }
}
