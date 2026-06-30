package ka3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes15.dex */
public final class w {

    /* renamed from: e, reason: collision with root package name */
    public static final ka3.v f306106e;

    /* renamed from: f, reason: collision with root package name */
    public static final ka3.w f306107f;

    /* renamed from: g, reason: collision with root package name */
    public static final ka3.w f306108g;

    /* renamed from: h, reason: collision with root package name */
    public static final ka3.w f306109h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ ka3.w[] f306110i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f306111m;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f306112d;

    static {
        ka3.w wVar = new ka3.w("WALLET_CN", 0, "cn");
        f306107f = wVar;
        ka3.w wVar2 = new ka3.w("WALLET_HK", 1, "hk");
        f306108g = wVar2;
        ka3.w wVar3 = new ka3.w("WALLET_OTHER", 2, "other");
        f306109h = wVar3;
        ka3.w[] wVarArr = {wVar, wVar2, wVar3};
        f306110i = wVarArr;
        f306111m = rz5.b.a(wVarArr);
        f306106e = new ka3.v(null);
    }

    public w(java.lang.String str, int i17, java.lang.String str2) {
        this.f306112d = str2;
    }

    public static ka3.w valueOf(java.lang.String str) {
        return (ka3.w) java.lang.Enum.valueOf(ka3.w.class, str);
    }

    public static ka3.w[] values() {
        return (ka3.w[]) f306110i.clone();
    }
}
