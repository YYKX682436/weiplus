package n44;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class h1 {

    /* renamed from: d, reason: collision with root package name */
    public static final n44.h1 f334944d;

    /* renamed from: e, reason: collision with root package name */
    public static final n44.h1 f334945e;

    /* renamed from: f, reason: collision with root package name */
    public static final n44.h1 f334946f;

    /* renamed from: g, reason: collision with root package name */
    public static final n44.h1 f334947g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ n44.h1[] f334948h;

    static {
        n44.h1 h1Var = new n44.h1("SINGLE_PHOTO", 0);
        f334944d = h1Var;
        n44.h1 h1Var2 = new n44.h1("MULTIPLE_PHOTO", 1);
        f334945e = h1Var2;
        n44.h1 h1Var3 = new n44.h1("SINGLE_VIDEO", 2);
        f334946f = h1Var3;
        n44.h1 h1Var4 = new n44.h1("NONE", 3);
        f334947g = h1Var4;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("$values", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaType");
        n44.h1[] h1VarArr = {h1Var, h1Var2, h1Var3, h1Var4};
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("$values", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaType");
        f334948h = h1VarArr;
        rz5.b.a(h1VarArr);
    }

    public h1(java.lang.String str, int i17) {
    }

    public static n44.h1 valueOf(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaType");
        n44.h1 h1Var = (n44.h1) java.lang.Enum.valueOf(n44.h1.class, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("valueOf", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaType");
        return h1Var;
    }

    public static n44.h1[] values() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("values", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaType");
        n44.h1[] h1VarArr = (n44.h1[]) f334948h.clone();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("values", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.MediaType");
        return h1VarArr;
    }
}
