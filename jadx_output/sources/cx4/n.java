package cx4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: e, reason: collision with root package name */
    public static final cx4.n f224638e;

    /* renamed from: f, reason: collision with root package name */
    public static final cx4.n f224639f;

    /* renamed from: g, reason: collision with root package name */
    public static final cx4.n f224640g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ cx4.n[] f224641h;

    /* renamed from: d, reason: collision with root package name */
    public final int f224642d;

    static {
        cx4.n nVar = new cx4.n("None", 0, 0);
        f224638e = nVar;
        cx4.n nVar2 = new cx4.n("ColdBoot", 1, 1);
        f224639f = nVar2;
        cx4.n nVar3 = new cx4.n("WarmBoot", 2, 2);
        f224640g = nVar3;
        cx4.n[] nVarArr = {nVar, nVar2, nVar3};
        f224641h = nVarArr;
        rz5.b.a(nVarArr);
    }

    public n(java.lang.String str, int i17, int i18) {
        this.f224642d = i18;
    }

    public static cx4.n valueOf(java.lang.String str) {
        return (cx4.n) java.lang.Enum.valueOf(cx4.n.class, str);
    }

    public static cx4.n[] values() {
        return (cx4.n[]) f224641h.clone();
    }
}
