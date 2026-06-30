package xa4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ xa4.h[] f452837d;

    static {
        xa4.h hVar = new xa4.h("NONE", 0);
        xa4.h hVar2 = new xa4.h("FROM_SNS", 1);
        xa4.h hVar3 = new xa4.h("FROM_AD", 2);
        xa4.h hVar4 = new xa4.h("FROM_LIVE", 3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.spring.SnsSpringUploadFeedType");
        xa4.h[] hVarArr = {hVar, hVar2, hVar3, hVar4};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.spring.SnsSpringUploadFeedType");
        f452837d = hVarArr;
        rz5.b.a(hVarArr);
    }

    public h(java.lang.String str, int i17) {
    }

    public static xa4.h valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.spring.SnsSpringUploadFeedType");
        xa4.h hVar = (xa4.h) java.lang.Enum.valueOf(xa4.h.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.spring.SnsSpringUploadFeedType");
        return hVar;
    }

    public static xa4.h[] values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.spring.SnsSpringUploadFeedType");
        xa4.h[] hVarArr = (xa4.h[]) f452837d.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.spring.SnsSpringUploadFeedType");
        return hVarArr;
    }
}
