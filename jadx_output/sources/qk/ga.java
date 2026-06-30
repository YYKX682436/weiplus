package qk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class ga {

    /* renamed from: d, reason: collision with root package name */
    public static final qk.ga f364134d;

    /* renamed from: e, reason: collision with root package name */
    public static final qk.ga f364135e;

    /* renamed from: f, reason: collision with root package name */
    public static final qk.ga f364136f;

    /* renamed from: g, reason: collision with root package name */
    public static final qk.ga f364137g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ qk.ga[] f364138h;

    static {
        qk.ga gaVar = new qk.ga(com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE, 0, 0);
        f364134d = gaVar;
        qk.ga gaVar2 = new qk.ga(com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.SUCCEED, 1, 1);
        f364135e = gaVar2;
        qk.ga gaVar3 = new qk.ga("fail", 2, 2);
        f364136f = gaVar3;
        qk.ga gaVar4 = new qk.ga("cancel", 3, 3);
        f364137g = gaVar4;
        qk.ga[] gaVarArr = {gaVar, gaVar2, gaVar3, gaVar4};
        f364138h = gaVarArr;
        rz5.b.a(gaVarArr);
    }

    public ga(java.lang.String str, int i17, int i18) {
    }

    public static qk.ga valueOf(java.lang.String str) {
        return (qk.ga) java.lang.Enum.valueOf(qk.ga.class, str);
    }

    public static qk.ga[] values() {
        return (qk.ga[]) f364138h.clone();
    }
}
