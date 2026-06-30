package ka4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final ka4.c f306122e;

    /* renamed from: f, reason: collision with root package name */
    public static final ka4.c f306123f;

    /* renamed from: g, reason: collision with root package name */
    public static final ka4.c f306124g;

    /* renamed from: h, reason: collision with root package name */
    public static final ka4.c f306125h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ ka4.c[] f306126i;

    /* renamed from: d, reason: collision with root package name */
    public final int f306127d;

    static {
        ka4.c cVar = new ka4.c("FIRST", 0, 1);
        f306122e = cVar;
        ka4.c cVar2 = new ka4.c("AFTER_MAX", 1, 2);
        f306123f = cVar2;
        ka4.c cVar3 = new ka4.c("BEFORE_MIN", 2, 3);
        f306124g = cVar3;
        ka4.c cVar4 = new ka4.c("EMPTY", 3, 4);
        f306125h = cVar4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.model.config.SetSnsInfoType");
        ka4.c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.model.config.SetSnsInfoType");
        f306126i = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17, int i18) {
        this.f306127d = i18;
    }

    public static ka4.c valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.model.config.SetSnsInfoType");
        ka4.c cVar = (ka4.c) java.lang.Enum.valueOf(ka4.c.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.model.config.SetSnsInfoType");
        return cVar;
    }

    public static ka4.c[] values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.model.config.SetSnsInfoType");
        ka4.c[] cVarArr = (ka4.c[]) f306126i.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.model.config.SetSnsInfoType");
        return cVarArr;
    }

    public final int getType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.config.SetSnsInfoType");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.config.SetSnsInfoType");
        return this.f306127d;
    }
}
