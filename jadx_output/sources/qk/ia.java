package qk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class ia {

    /* renamed from: e, reason: collision with root package name */
    public static final qk.ha f364169e;

    /* renamed from: f, reason: collision with root package name */
    public static final qk.ia f364170f;

    /* renamed from: g, reason: collision with root package name */
    public static final qk.ia f364171g;

    /* renamed from: h, reason: collision with root package name */
    public static final qk.ia f364172h;

    /* renamed from: i, reason: collision with root package name */
    public static final qk.ia f364173i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ qk.ia[] f364174m;

    /* renamed from: d, reason: collision with root package name */
    public final int f364175d;

    static {
        qk.ia iaVar = new qk.ia("Idle", 0, 0);
        f364170f = iaVar;
        qk.ia iaVar2 = new qk.ia("Playing", 1, 1);
        f364171g = iaVar2;
        qk.ia iaVar3 = new qk.ia("Loading", 2, 2);
        f364172h = iaVar3;
        qk.ia iaVar4 = new qk.ia("Paused", 3, 3);
        f364173i = iaVar4;
        qk.ia[] iaVarArr = {iaVar, iaVar2, iaVar3, iaVar4};
        f364174m = iaVarArr;
        rz5.b.a(iaVarArr);
        f364169e = new qk.ha(null);
    }

    public ia(java.lang.String str, int i17, int i18) {
        this.f364175d = i18;
    }

    public static qk.ia valueOf(java.lang.String str) {
        return (qk.ia) java.lang.Enum.valueOf(qk.ia.class, str);
    }

    public static qk.ia[] values() {
        return (qk.ia[]) f364174m.clone();
    }

    public final boolean h() {
        return this == f364171g || this == f364172h;
    }
}
